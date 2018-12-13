package com.yanbin.dao;

import com.yanbin.pojo.Flight;

import java.util.List;

public interface FlightMapper {


    //列表展示所有
    List<Flight> selectById();

    //根据id进行票价搜索查询
    List<Flight> selectByFlight();

    //根据条件查询
    List<Flight> selectByDayAndCrity();


}