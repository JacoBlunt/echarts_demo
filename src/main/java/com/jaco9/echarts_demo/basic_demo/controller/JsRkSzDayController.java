package com.jaco9.echarts_demo.basic_demo.controller;


import com.baomidou.mybatisplus.plugins.Page;
import com.jaco9.echarts_demo.basic_demo.entity.JsRkSzDay;
import com.jaco9.echarts_demo.basic_demo.service.impl.JsRkSzDayServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 111 前端控制器
 * </p>
 *
 * @author yi.zhang
 * @since 2018-03-26
 */
@RestController
@RequestMapping("/basic_demo/jsRkSzDay")
public class JsRkSzDayController {

//    @Autowired
//    private IJsRkSzDayService jsRkSzDayService;

    @Autowired
    private  JsRkSzDayServiceImpl jsRkSzDayServiceImpl;


    @GetMapping("/listAll")
    public List<JsRkSzDay> listAll()
    {
        List<JsRkSzDay> jsRkSzDayList=jsRkSzDayServiceImpl.selectList(null);
        return jsRkSzDayList;
    }



    @GetMapping("/pageList")
    public Page<JsRkSzDay> pageList(@RequestParam int pageNumber, @RequestParam int pageSize)
    {
        Page<JsRkSzDay> page = new Page<>();
        page.setCurrent(pageNumber);
        page.setSize(pageSize);
        Page<JsRkSzDay> jsRkSzDayPageList=jsRkSzDayServiceImpl.selectPage(page);
        return jsRkSzDayPageList;
    }


    @GetMapping("/listAllSupportECharts")
    public Map<String,Object> listAllSupportECharts()
    {
        List<JsRkSzDay> jsRkSzDayList=jsRkSzDayServiceImpl.selectList(null);
        List<String> categoryList=new ArrayList<>();
        List<Double> valueList=new ArrayList<>();
        for (int i = 0; i < jsRkSzDayList.size(); i++) {
            JsRkSzDay tmpJRSD=jsRkSzDayList.get(i);
            categoryList.add(tmpJRSD.getNf().trim());
            valueList.add(tmpJRSD.getRkje());
        }
        Map<String,Object> ret=new HashMap<>();
        ret.put("category",categoryList);
        ret.put("value",valueList);
        return ret;
    }

}

