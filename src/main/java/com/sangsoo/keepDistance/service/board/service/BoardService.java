package com.sangsoo.keepDistance.service.board.service;

import com.sangsoo.keepDistance.service.board.web.dto.BoardSaveRequestDto;

public interface BoardService {
    Long save(BoardSaveRequestDto input);
}
