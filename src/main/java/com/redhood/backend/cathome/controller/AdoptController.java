package com.redhood.backend.cathome.controller;

import com.redhood.backend.cathome.model.AdoptCatsPO;
import com.redhood.backend.cathome.model.ResultBean;
import com.redhood.backend.cathome.model.User;
import com.redhood.backend.cathome.service.AdoptCatService;
import com.redhood.backend.cathome.service.impl.AdoptCatServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @PackgeName: com.redhood.backend.cathome.controller
 * @ClassName: AdoptController
 * @Author: redhood
 * Date: 2020/4/6 18:38
 * project name: cathome
 * @Version:
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping("/adopt")
public class AdoptController {
    @Autowired
    AdoptCatService adoptCatService;

    @GetMapping("/allAdoptCat")
    public Object getAllAdoptCat() {
        List<AdoptCatsPO> cats = adoptCatService.searchAll();
        return ResultBean.success(cats);
    }
}
