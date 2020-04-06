package com.redhood.backend.cathome.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PackgeName: com.redhood.backend.cathome.pojo
 * @ClassName: User
 * @Author: redhood
 * Date: 2020/4/6 15:48
 * project name: cathome
 * @Version:
 * @Description:
 */
@ApiModel
@Data
@NoArgsConstructor
public class User {
    @ApiModelProperty(value = "用户id")
    private Integer id;
    @ApiModelProperty(value = "用户名")
    private String username;
    @ApiModelProperty(value = "用户地址")
    private String address;
    @ApiModelProperty(value = "学校")
    private String aaaaadasd;
    //getter/setter

}
