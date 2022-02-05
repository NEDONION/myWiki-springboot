package com.jiacheng.wiki.controller;

import com.jiacheng.wiki.req.EbookQueryReq;
import com.jiacheng.wiki.req.EbookSaveReq;
import com.jiacheng.wiki.resp.CommonResp;
import com.jiacheng.wiki.resp.EbookQueryResp;
import com.jiacheng.wiki.resp.PageResp;
import com.jiacheng.wiki.service.EbookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp list(@Valid EbookQueryReq req) {
        CommonResp<PageResp<EbookQueryResp>> resp = new CommonResp<>();
        PageResp<EbookQueryResp> list = ebookService.list(req);
        resp.setContent(list);
        return resp;
    }
    // post请求需要加注解
    @PostMapping("/save")
    public CommonResp save(@Valid @RequestBody EbookSaveReq req) {
        CommonResp resp = new CommonResp<>();
        ebookService.save(req);
        return resp;
    }

    // 按Id删除，id是主键
    @DeleteMapping("/delete/{id}")
    public CommonResp delete(@PathVariable Long id) {
        CommonResp resp = new CommonResp<>();
        ebookService.delete(id);
        return resp;
    }
}
