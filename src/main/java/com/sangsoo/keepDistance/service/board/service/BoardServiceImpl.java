package com.sangsoo.keepDistance.service.board.service;

import com.sangsoo.keepDistance.service.board.domain.Board;
import com.sangsoo.keepDistance.service.board.domain.BoardRepository;
import com.sangsoo.keepDistance.service.board.web.dto.BoardSaveRequestDto;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BoardServiceImpl implements BoardService{

    private final BoardRepository repository;

    public BoardServiceImpl(BoardRepository repository) {
        this.repository = repository;
    }

    @Transactional
    @Override
    public Long save(BoardSaveRequestDto input) {
        Board board = repository.save(input.toEntity());

        return board.getId();
    }
}
