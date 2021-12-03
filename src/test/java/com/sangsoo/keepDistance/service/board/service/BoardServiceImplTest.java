package com.sangsoo.keepDistance.service.board.service;

import com.sangsoo.keepDistance.service.board.domain.Board;
import com.sangsoo.keepDistance.service.board.domain.BoardRepository;
import com.sangsoo.keepDistance.service.board.web.BoardController;
import com.sangsoo.keepDistance.service.board.web.dto.BoardSaveRequestDto;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BoardServiceImplTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private BoardRepository repository;

    @After
    public void tearDown() throws Exception{
        repository.deleteAll();
    }
    @Test
    public void Board등록() throws Exception{
//
//        //given
//        String ip = "127.0.0.1";
//        String title = "title";
//        String content = "content";
//
//        BoardSaveRequestDto dto = BoardSaveRequestDto.builder()
//                .title(title)
//                .ip(ip)
//                .contents(content)
//                .build();
//
//        String url = "http://localhost:" + port + "/board/save";
//
//        //when
//        ResponseEntity<Long> responseEntity = restTemplate.postForEntity(url, dto, Long.class);
//
//        //then
//        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
//        assertThat(responseEntity.getBody()).isGreaterThan(0L);
//
//        List<Board> all = repository.findAll();
//        assertThat(all.get(0).getTitle()).isEqualTo(title);
//        assertThat(all.get(0).getContents()).isEqualTo(content);

    }
}