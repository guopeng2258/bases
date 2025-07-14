package com.perry.basemybatis.mapper;

import com.perry.basemybatis.entity.UmsAdmin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface UmsAdminMapper {
    UmsAdmin selectById(@Param("id") Long id);
    List<UmsAdmin> selectAll();
    int insert(UmsAdmin admin);
    int updateById(UmsAdmin admin);
    int deleteById(@Param("id") Long id);
} 