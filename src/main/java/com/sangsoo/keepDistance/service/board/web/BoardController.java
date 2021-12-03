package com.sangsoo.keepDistance.service.board.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sangsoo.keepDistance.service.board.domain.Board;
import com.sangsoo.keepDistance.service.board.service.BoardService;
import com.sangsoo.keepDistance.service.board.service.BoardServiceImpl;
import com.sangsoo.keepDistance.service.board.web.dto.BoardSaveRequestDto;
import com.sangsoo.keepDistance.service.board.web.dto.BoardSaveRequestDto2;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

@RestController
public class BoardController {

    @Autowired
    private BoardService boardService;

    ObjectMapper objectMapper = new ObjectMapper();

    public BoardController(BoardService boardService) {
//        this.boardService = new BoardServiceImpl(new Board());
    }

    @GetMapping("/api/v1/posts/1")
    public ResponseEntity<BoardSaveRequestDto2> showBoard() {
        BoardSaveRequestDto2 dto = new BoardSaveRequestDto2("홍길동", "오늘 중앙식당 메뉴 맛있었어요");

        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

//    @GetMapping("/board/list")
//    public List<Board> allList(){
//        boardService.
//
//    }

    @GetMapping("/board/dto")
    public BoardSaveRequestDto boardDto(@RequestParam("ip")String ip, @RequestParam("title")String title, @RequestParam("contents")String contents) {
        return new BoardSaveRequestDto(ip, title, contents);
    }

    @PostMapping("/board/save")
    public Long save(@RequestBody String messageBody) throws IOException {
        System.out.println(messageBody);
        BoardSaveRequestDto data = objectMapper.readValue(messageBody, BoardSaveRequestDto.class);

        System.out.println(data.toString());


        return 1L;
    }

    @PostMapping("/board/save3")
    public Long save(@RequestParam("ip")String ip, @RequestParam("title")String title, @RequestParam("contents")String contents) {

        return boardService.save(new BoardSaveRequestDto(ip, title, contents));
    }

    @PostMapping("/board/save2")
    public Long save(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ServletInputStream inputStream = request.getInputStream();
        String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);
        System.out.println(messageBody);
        return 1L;
    }
}
