package com.sangsoo.keepDistance.service.board.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BoardResponseDto {
    private final String ip;
    private final String contents;

}
