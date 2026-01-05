package com.example.admin_user_views.service;

import com.example.admin_user_views.dto.UnitRequest;
import com.example.admin_user_views.entity.Unit;

import java.util.List;

public interface UnitService {

    Unit createUnit(UnitRequest request);

    List<Unit> getAllUnit();
}
