package com.sangsoo.keepDistance.service.board.web;

import com.sangsoo.keepDistance.service.board.domain.Board;
import com.sangsoo.keepDistance.service.board.service.BoardService;
import com.sangsoo.keepDistance.service.board.service.BoardServiceImpl;
import com.sangsoo.keepDistance.service.board.web.dto.BoardSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BoardController {

    @Autowired
    private BoardService boardService;

    public BoardController(BoardService boardService) {
//        this.boardService = new BoardServiceImpl(new Board());
    }

    @GetMapping("/board")
    public String showBoard() {
        return "name:오상수";
    }

    @GetMapping("/board/dto")
    public BoardSaveRequestDto boardDto(@RequestParam("ip")String ip, @RequestParam("title")String title, @RequestParam("contents")String contents) {
        return new BoardSaveRequestDto(ip, title, contents);
    }

    @PostMapping("/board/save")
    public Long save(@RequestBody BoardSaveRequestDto requestDto) {
        return boardService.save(requestDto);
    }
}
