package com.sangsoo.keepDistance.service.board.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sangsoo.keepDistance.service.board.domain.Board;
import com.sangsoo.keepDistance.service.board.web.dto.BoardResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoardController {

    private ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping("/board")
    public String showBoard() {
        return "name:오상수";
    }

    @GetMapping("/board/dto")
    public BoardResponseDto boardDto(@RequestParam("ip")String ip, @RequestParam("contents")String contents) {
        return new BoardResponseDto(ip, contents);
    }
}
