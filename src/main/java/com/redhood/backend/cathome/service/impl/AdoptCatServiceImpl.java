package com.redhood.backend.cathome.service.impl;

import com.redhood.backend.cathome.mapper.AdoptCatsMapper;
import com.redhood.backend.cathome.model.AdoptCatsPO;
import com.redhood.backend.cathome.service.AdoptCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PackgeName: com.redhood.backend.cathome.service.impl
 * @ClassName: AdoptCatServiceImpl
 * @Author: redhood
 * Date: 2020/4/6 18:25
 * project name: cathome
 * @Version:
 * @Description:
 */

@Service
public class AdoptCatServiceImpl implements AdoptCatService {
    @Autowired
    AdoptCatsMapper adoptCatsMapper;

    @Override
    public List<AdoptCatsPO> searchAll() {
        return adoptCatsMapper.selectAllCats();
    }
}
