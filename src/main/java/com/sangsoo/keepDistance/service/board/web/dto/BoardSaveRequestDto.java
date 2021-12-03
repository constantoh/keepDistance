package com.sangsoo.keepDistance.service.board.web.dto;

import com.sangsoo.keepDistance.service.board.domain.Board;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Getter
@NoArgsConstructor
public class BoardSaveRequestDto {
    private String ip;
    private String title;
    private String contents;

    @Builder
    public BoardSaveRequestDto(String ip, String title, String contents) {
        this.ip = ip;
        this.title = title;
        this.contents = contents;
    }

    public Board toEntity(){
        return Board.builder()
                .ip(ip)
                .title(title)
                .contents(contents)
                .build();
    }


}
