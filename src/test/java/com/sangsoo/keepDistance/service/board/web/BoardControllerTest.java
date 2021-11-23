package com.sangsoo.keepDistance.service.board.web;

import com.sangsoo.keepDistance.service.board.web.dto.BoardResponseDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@WebMvcTest(controllers = BoardController.class) //
public class BoardControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void 이름이오상수가리턴된다() throws Exception{
        String name = "name:오상수";

        mvc.perform(get("/board")).andExpect(status().isOk()).andExpect(content().string(name));
    }

    @Test
    public void 롬복(){
        //given
        String ip = "127.0.0.1";
        String contents = "안녕하세요";

        //when
        BoardResponseDto dto = new BoardResponseDto(ip, contents);

        //then
        assertThat(dto.getIp()).isEqualTo(ip);
        assertThat(dto.getContents()).isEqualTo(contents);
    }

    @Test
    public void BoardDto_리턴() throws Exception{
        //given
        String ip = "127.0.0.1";
        String contents = "안녕하세요";

        //when
        mvc.perform(get("/board/dto")
                        .param("ip", ip)
                        .param("contents", contents))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.ip", is(ip)))
                .andExpect(jsonPath("$.contents", is(contents)));
    }
}