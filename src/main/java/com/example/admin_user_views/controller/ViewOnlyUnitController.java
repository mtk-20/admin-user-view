package com.example.admin_user_views.controller;

import com.example.admin_user_views.service.UnitService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user/units")
public class ViewOnlyUnitController {

    private final UnitService service;

    @GetMapping
    public String handleGetAllUnit(Model model) {
        model.addAttribute("units", service.getAllUnit());
        return "user/unit-list";
    }
}
