package com.yanbin.service.Service.Impl;

import com.yanbin.dao.FlightMapper;
import com.yanbin.service.FlightService;
import com.yanbin.vo.R;
import com.yanbin.vo.RUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName 你好！！！
 * @Auther 彬
 * Date 2018/12/12 16:52
 */
@Service
public class FlightServiceImpl implements FlightService{

    @Autowired
    private FlightMapper flightMapper;

    //查询所有进行列表展示
    @Override
    public R selectById() {
        System.out.println(flightMapper.selectById().toString());
        if (flightMapper.selectById()!=null){
            return RUtil.setOK("查询成功", flightMapper.selectById());
        }else{
            return RUtil.setERROR("查无数据",null);
        }
    }


    //根据id进行搜索票价
    @Override
    public R selectByFlight() {

        if (flightMapper.selectByFlight()!=null){
            return RUtil.setOK("查询成功", flightMapper.selectByFlight());
        }else{
            return RUtil.setERROR("暂无数据",null);
        }
    }

    //根据条件进行查询
    @Override
    public R selectByDayAndCrity() {

        if(flightMapper.selectByDayAndCrity()!=null){
            return RUtil.setOK("查询成功", flightMapper.selectByDayAndCrity());
        }else {
            return RUtil.setERROR("查询失败", null);
        }
    }

}
