package com.perry.basemybatis.service;

import com.perry.basemybatis.entity.UmsAdmin;
import java.util.List;

public interface UmsAdminService {
    UmsAdmin getById(Long id);
    List<UmsAdmin> getAll();
    int create(UmsAdmin admin);
    int update(UmsAdmin admin);
    int delete(Long id);
} 