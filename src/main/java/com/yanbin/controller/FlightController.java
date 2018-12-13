package com.yanbin.controller;

import com.yanbin.service.FlightService;
import com.yanbin.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName 你好！！！
 * @Auther 彬
 * Date 2018/12/12 17:00
 */
@Controller
public class FlightController {

    @Autowired
    private FlightService flightService;

    //查询所有列表展示
    @RequestMapping("/listAll")
    @ResponseBody
    public R selectById(){

        return flightService.selectById();
    }


    //根据id进行票价搜索查询
    @RequestMapping("/listId")
    @ResponseBody
    public R selectByFlight(){

        return flightService.selectByFlight();
    }

    //根据条件进行查询
    @RequestMapping("/listDayAndCity")
    @ResponseBody
    public R selectByDayAndCrity(){
        return flightService.selectByDayAndCrity();
    }

}
