package com.example.admin_user_views.service.impl;

import com.example.admin_user_views.dto.UnitRequest;
import com.example.admin_user_views.entity.Unit;
import com.example.admin_user_views.repository.UnitRepo;
import com.example.admin_user_views.service.UnitService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UnitServiceImpl implements UnitService {

    private final UnitRepo repo;

    @Override
    public Unit createUnit(UnitRequest request) {
        Unit unit = new Unit();
        unit.setUnitName(request.getUnitName());
        unit.setUnitCode(request.getUnitCode());
        return repo.save(unit);
    }

    @Override
    public List<Unit> getAllUnit() {
        return repo.findAll();
    }
}
