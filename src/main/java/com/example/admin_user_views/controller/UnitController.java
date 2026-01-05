package com.example.admin_user_views.controller;

import com.example.admin_user_views.dto.UnitRequest;
import com.example.admin_user_views.entity.Unit;
import com.example.admin_user_views.response.ApiResponse;
import com.example.admin_user_views.service.UnitService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/units")
public class UnitController {

    private final UnitService service;

    @PostMapping("/create")
    public ResponseEntity<?> handleCreateUnit(@Valid @RequestBody UnitRequest request) {
        Unit unit = service.createUnit(request);
        return ResponseEntity.ok().body(ApiResponse.success(HttpStatus.OK, unit));
    }

    @GetMapping
    public String handleGetAllUnit(Model model) {
        model.addAttribute("units", service.getAllUnit());
        return "admin/unit-list";
    }
}
