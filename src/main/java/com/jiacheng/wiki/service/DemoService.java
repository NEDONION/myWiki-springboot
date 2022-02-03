package com.jiacheng.wiki.service;

import com.jiacheng.wiki.domain.Demo;
import com.jiacheng.wiki.mapper.DemoMapper;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Resource
    private DemoMapper demoMapper;

    public List<Demo> list() {
        return demoMapper.selectByExample(null);
    }
}
