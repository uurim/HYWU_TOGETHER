package com.jobcho.hywuto.service;

import com.jobcho.hywuto.model.BoardTest;
import com.jobcho.hywuto.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    // 글쓰기
    public void save(BoardTest boardTest) {
        boardRepository.save(boardTest);
    }

    //목록조회 : Page<T>을 타입으로 지정하면, 반드시 파라미터로 Pageable을 받아야?
    public Page<BoardTest> postList(int page) {
        return boardRepository.findAll(PageRequest.of(page, 3, Sort.by(Sort.Direction.DESC, "id")));
    }

    //상세조회
    public BoardTest detail(int id) {
        return boardRepository.findById(id).orElseThrow(() -> {
            return new IllegalArgumentException("글 상세보기 실패 : 아이디를 찾을 수 없습니다.");
        });
    }

    // 수정
    public void update(BoardTest boardTest){
        boardRepository.save(boardTest);
    }

    // 삭제
    public void delete(int id) {
        boardRepository.deleteById(id);
    }

}
