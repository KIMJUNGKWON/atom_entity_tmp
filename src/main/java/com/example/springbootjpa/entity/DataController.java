package com.example.springbootjpa.entity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DataController {

    @GetMapping("/hello")
    @ResponseBody
    public String insertSeedData(){

        // 진행하면서 next_question처럼 맞물린 것들은 알아서 관계 맺어주면서 수정 진행하기.
        // 그뒤 변화된 것을 다시 푸시.


        return "complete !!";
    }
}
