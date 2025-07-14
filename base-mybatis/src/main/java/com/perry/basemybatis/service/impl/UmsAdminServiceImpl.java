package com.perry.basemybatis.service.impl;

import com.perry.basemybatis.entity.UmsAdmin;
import com.perry.basemybatis.mapper.UmsAdminMapper;
import com.perry.basemybatis.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UmsAdminServiceImpl implements UmsAdminService {
    @Autowired
    private UmsAdminMapper umsAdminMapper;

    @Override
    public UmsAdmin getById(Long id) {
        return umsAdminMapper.selectById(id);
    }

    @Override
    public List<UmsAdmin> getAll() {
        return umsAdminMapper.selectAll();
    }

    @Override
    public int create(UmsAdmin admin) {
        return umsAdminMapper.insert(admin);
    }

    @Override
    public int update(UmsAdmin admin) {
        return umsAdminMapper.updateById(admin);
    }

    @Override
    public int delete(Long id) {
        return umsAdminMapper.deleteById(id);
    }
} 