package com.redhood.backend.cathome;

import com.redhood.backend.cathome.controller.AdoptController;
import com.redhood.backend.cathome.service.AdoptCatService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CathomeApplicationTests {
    @Autowired
    AdoptCatService adoptCatService;
    @Autowired
    AdoptController adoptController;

    @Test
    void contextLoads() {
        System.out.println( adoptController.getAllAdoptCat());
//        adoptCatService.searchAll();
    }

}
