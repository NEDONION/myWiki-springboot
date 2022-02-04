package com.jiacheng.wiki.controller;

import com.jiacheng.wiki.domain.Ebook;
import com.jiacheng.wiki.req.EbookQueryReq;
import com.jiacheng.wiki.resp.CommonResp;
import com.jiacheng.wiki.service.EbookService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp list() {
        CommonResp<Object> resp = new CommonResp<>();
        List<Ebook> list = ebookService.list();
        resp.setContent(list);
        return resp;
    }


}
