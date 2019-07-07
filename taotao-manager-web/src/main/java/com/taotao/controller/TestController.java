package com.taotao.controller;

import com.taotao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * description:
 *
 * @author chenwenwei
 * @date 2019-07-07 23:42
 */
@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/test/queryNow")
    @ResponseBody
    public String queryNow(){

        return testService.queryNow();
    }
}
