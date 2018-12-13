package com.yanbin.service;

import com.yanbin.vo.R;

/**
 * @Interface 你好！！！
 * @Auther 彬
 * Date 2018/12/12 16:48
 */
public interface FlightService {

    //查询所有列表展示
    R selectById();

    //根据id进行票价搜索查询
    R selectByFlight();

    //根据条件查询
    R selectByDayAndCrity();

}
