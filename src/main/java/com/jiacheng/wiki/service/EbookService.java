package com.jiacheng.wiki.service;

import com.jiacheng.wiki.domain.Ebook;
import com.jiacheng.wiki.mapper.EbookMapper;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<Ebook> list() {
        return ebookMapper.selectByExample(null);
    }
}
