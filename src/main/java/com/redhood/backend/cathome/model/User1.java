package com.redhood.backend.cathome.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PackgeName: com.redhood.backend.cathome.pojo
 * @ClassName: User1
 * @Author: redhood
 * Date: 2020/4/6 16:17
 * project name: cathome
 * @Version:
 * @Description:
 */
@ApiModel
@Data
@NoArgsConstructor
public class User1 {
    @ApiModelProperty(value = "用户id")
    private Integer id;
    @ApiModelProperty(value = "用户名")
    private String username;
    @ApiModelProperty(value = "用户地址")
    private String address;
    @ApiModelProperty(value = "学校")
    private String aaaaadasd;
}
