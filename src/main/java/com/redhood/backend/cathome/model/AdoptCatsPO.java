package com.redhood.backend.cathome.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @PackgeName: com.redhood.backend.cathome.model
 * @ClassName: AdoptCatsPO
 * @Author: redhood
 * Date: 2020/4/6 18:00
 * project name: cathome
 * @Version:
 * @Description:
 */
@Data
@NoArgsConstructor
@ToString
public class AdoptCatsPO {
    private Long id;
    private String name;
    private String type;
    private String sex;
    private Integer  age;
    private String adaptStatus;
}
