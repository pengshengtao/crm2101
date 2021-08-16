package com.ssm.crud.controller;


import com.ssm.crud.bean.Department;
import com.ssm.crud.bean.Msg;
import com.ssm.crud.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 处理和部门有关的请求
 *
 */
@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
    /**
     * 返回所有的部门信息
     */
    @RequestMapping("/depts")
    @ResponseBody
    public Msg getDepts(){
        //查处的所有部门信息
       List<Department> list = departmentService.getDepts();
        return Msg.success().add("depts",list);
    }
}
