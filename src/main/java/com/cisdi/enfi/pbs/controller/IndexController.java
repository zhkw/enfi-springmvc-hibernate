package com.cisdi.enfi.pbs.controller;

import com.cisdi.enfi.pbs.domain.StaffInformationView;
import com.cisdi.enfi.pbs.model.Root;
import com.cisdi.enfi.pbs.service.CommonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class IndexController extends BaseController{

    @Resource
    CommonService commonService;

    @RequestMapping("/test")
    public String TestWelcome(ModelMap map) throws Exception {
        String staffName = "", staffId = "2867";

        Root staffR = commonService.getObjById(StaffInformationView.class.getSimpleName(), staffId);
        if (staffR != null) {
            staffName = (String) staffR.getAttribute("name");
        }

        map.put("name",staffName);
        return "test";
    }

    @RequestMapping("/index")
    public ModelAndView index(
            HttpServletRequest request,
            HttpServletResponse response,
            Model model) {
        ModelAndView view = createLayoutView("home/index");
        return view;
    }


}
