package com.perry.basemybatis.controller;

import com.perry.basemybatis.entity.UmsAdmin;
import com.perry.basemybatis.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class UmsAdminController {
    @Autowired
    private UmsAdminService umsAdminService;

    @GetMapping("/{id}")
    public UmsAdmin getById(@PathVariable Long id) {
        return umsAdminService.getById(id);
    }

    @GetMapping
    public List<UmsAdmin> getAll() {
        return umsAdminService.getAll();
    }

    @PostMapping
    public int create(@Valid @RequestBody UmsAdmin admin) {
        return umsAdminService.create(admin);
    }

    @PutMapping
    public int update(@Valid @RequestBody UmsAdmin admin) {
        return umsAdminService.update(admin);
    }

    @DeleteMapping("/{id}")
    public int delete(@PathVariable Long id) {
        return umsAdminService.delete(id);
    }
}