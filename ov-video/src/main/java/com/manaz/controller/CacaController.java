package com.manaz.controller;

import com.manaz.VO.BaseQueryParam;
import com.manaz.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxw
 * @date 2020/7/18 12:12
 */
@RestController
@RequestMapping("/caca")
public class CacaController {
    @Autowired
    private IndexService indexService;

    @GetMapping("/list")
    public Page Indexcaca(BaseQueryParam baseQueryParam) {
        return indexService.cacaIndex(baseQueryParam);
    }
}
