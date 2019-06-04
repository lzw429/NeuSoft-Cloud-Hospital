package com.neusoft.medical.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

/**
 * 科室管理控制器
 */
@Controller
@RequestMapping("/department")
public class DepartmentController {
    private Logger log = Logger.getLogger(DepartmentController.class);

    @RequestMapping("/add")
    public String add() {
        return "department/add";
    }
}
