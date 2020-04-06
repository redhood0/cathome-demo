package com.redhood.backend.cathome.service;

import com.redhood.backend.cathome.model.AdoptCatsPO;

import java.util.List;

/**
 * @PackgeName: com.redhood.backend.cathome.service
 * @ClassName: AdoptCatService
 * @Author: redhood
 * Date: 2020/4/6 18:19
 * project name: cathome
 * @Version:
 * @Description:
 */
public interface AdoptCatService {
    List<AdoptCatsPO> searchAll();
}
