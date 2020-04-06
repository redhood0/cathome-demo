package com.redhood.backend.cathome.controller;

import com.redhood.backend.cathome.model.User;
import com.redhood.backend.cathome.model.User1;
import org.springframework.web.bind.annotation.*;

/**
 * @PackgeName: com.redhood.backend.cathome.controller
 * @ClassName: LoginController
 * @Author: redhood
 * Date: 2020/4/6 14:35
 * project name: cathome
 * @Version:
 * @Description:
 */

@RestController
public class LoginController {

    @PostMapping("/add")
    public boolean addUser(@RequestBody User user) {
        return false;
    }
    @GetMapping("/find/{id}")
    public User findById(@PathVariable("id") int id) {
        return new User();
    }
    @PutMapping("/update")
    public boolean update(@RequestBody User1 user) {
        return true;
    }
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return true;
    }

}
