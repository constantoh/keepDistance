package com.sangsoo.keepDistance.service.board.domain;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.InetAddress;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardRepositoryTest {

    @Autowired
    BoardRepository repository;

    @After
    public void cleanup(){
        repository.deleteAll();
    }

    @Test
    public void 게시물저장_불러오기() throws Exception{
        //given
        String ip = InetAddress.getLocalHost().getHostAddress();
        String title = "test Title";
        String contents = "test Contents";
        repository.save(Board.builder()
                .author(ip)
                .title(title)
                .contents(contents)
                .build());

        //when
        List<Board> boardList = repository.findAll();

        //then
        Board board = boardList.get(0);
        assertThat(board.getIp()).isEqualTo(ip);
        assertThat(board.getTitle()).isEqualTo(title);
        assertThat(board.getContents()).isEqualTo(contents);
    }


}