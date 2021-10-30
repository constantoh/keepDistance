package com.sangsoo.keepDistance.service.congestion.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sangsoo.keepDistance.service.congestion.domain.Location;
import com.sangsoo.keepDistance.service.congestion.service.CongestionService;
import com.sangsoo.keepDistance.service.congestion.web.dto.LocationDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * 밀집정도 Controller
 * 1. 앱이 켜지는 순간 바로 현재의 위치 정보를 입력으로 받아서 현재 위치한 건물의 밀집정보를 update한다.
 * 2. 밀집정도 요청 들어오면 관들마다의 밀접정도를 select해서 전송한다.
 * 3.
 *
 * */
@Controller
public class CongestionController {
//    private ObjectMapper objectMapper = new ObjectMapper(); //select된 거 json 으로 뿌려야 하니깐 필요함.
//
//    private final CongestionService CongestionService;
//
//    //1.
//    @GetMapping("/congestion/currentPosition/{Location}")
//    public LocationDto saveCongestion(@PathVariable Location location){
////        return postsService.findById(id);
//    }

    //2.

}
