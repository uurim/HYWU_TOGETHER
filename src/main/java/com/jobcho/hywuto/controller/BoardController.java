package com.jobcho.hywuto.controller;

import com.jobcho.hywuto.model.BoardTest;
import com.jobcho.hywuto.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/list")
    public String index(Model model, @RequestParam(required = false, defaultValue = "0", value="page") int page) {

        Page<BoardTest> listPage = boardService.postList(page);

        int totalPage = listPage.getTotalPages(); // 총 페이지 수

        model.addAttribute("boardTest", listPage.getContent());
        model.addAttribute("totalPage", totalPage);

        return "list";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable int id, Model model){
        model.addAttribute("boardTest", boardService.detail(id));
        return "detail";
    }

    @GetMapping("/save")
    public String saveGet(){
        return "save";
    }

    @PostMapping("/save")
    public String savePost(BoardTest boardTest){
        boardService.save(boardTest);
        return "redirect:/board/list";
    }

    @GetMapping("/update/{id}")
    public String updateGet(@PathVariable int id, Model model){
        model.addAttribute("post", boardService.detail(id));
        return "update";
    }

    @PostMapping("/update")
    public String updatePost(BoardTest boardTest){
        boardService.update(boardTest);
        return "redirect:/board/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        boardService.delete(id);
        return "redirect:/board/list";
    }
}
