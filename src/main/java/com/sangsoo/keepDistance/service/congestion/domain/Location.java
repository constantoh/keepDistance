package com.sangsoo.keepDistance.service.congestion.domain;

import lombok.Getter;

/**
 * 현재 위도경도를 보내서 현재 어떤 건물에 있는지 확인한다.
 * */
@Getter
public class Location {

    //위도
    private String latitude;
    //경도
    private String longitude;
    //건물
    private String building;
}
