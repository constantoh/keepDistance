package com.sangsoo.keepDistance.service.board.service;

import com.sangsoo.keepDistance.service.board.domain.Board;

public interface BoardService {
    void write(Board board);

    Board read(Long sequence);
}
