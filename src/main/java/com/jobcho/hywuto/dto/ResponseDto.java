package com.jobcho.hywuto.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
// 통신 성공 실패여부
public class ResponseDto<T> {
    int status;
    T data;
}
