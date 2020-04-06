package com.redhood.backend.cathome.mapper;

import com.redhood.backend.cathome.model.AdoptCatsPO;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @PackgeName: com.redhood.backend.cathome.mapper
 * @ClassName: AdoptCatsMapper
 * @Author: redhood
 * Date: 2020/4/6 18:13
 * project name: cathome
 * @Version:
 * @Description:
 */
@Repository
public interface AdoptCatsMapper {
    @Select("SELECT * FROM adopt_cats")
    @Results(@Result(column="adapt_status", property="adaptStatus", jdbcType= JdbcType.VARCHAR))
    List<AdoptCatsPO> selectAllCats();
}
