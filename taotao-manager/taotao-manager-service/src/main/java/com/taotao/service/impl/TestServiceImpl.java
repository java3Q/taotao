package com.taotao.service.impl;

import com.taotao.service.TestService;
import com.taotao.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description:
 *
 * @author chenwenwei
 * @date 2019-07-07 22:33
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestMapper mapper;

    @Override
    public String queryNow() {
        //注入mapper,调用queryNow()
        return mapper.queryNow();
    }
}
