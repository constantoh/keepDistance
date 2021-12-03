package com.sangsoo.keepDistance.service.board.web.dto;

import com.sangsoo.keepDistance.service.board.domain.Board;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BoardSaveRequestDto2 {
    private String author;
    private String contents;

    @Builder
    public BoardSaveRequestDto2(String author, String contents) {
        this.author = author;
        this.contents = contents;
    }

    public Board toEntity(){
        return Board.builder()
                .author(author)
                .contents(contents)
                .build();
    }


}
