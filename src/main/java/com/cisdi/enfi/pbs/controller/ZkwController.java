package com.cisdi.enfi.pbs.controller;

import com.cisdi.enfi.pbs.facade.StudentFacade;
import com.cisdi.enfi.pbs.service.StudentService;
import com.cisdi.enfi.pbs.vo.EquipmentPriceLibVo;
import com.cisdi.enfi.pbs.vo.StudentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/zkw")
public class ZkwController extends BaseController{

    @Autowired
    private StudentFacade studentFacade;

    @RequestMapping("/studentView")
    public ModelAndView priceEditView(HttpServletRequest req, HttpServletResponse res, Model model) {
        //String param = req.getParameter("param");
        ModelAndView view = createLayoutView("zkw/studentView");
        //view.addObject("param", param);
        return view;
    }

    @RequestMapping("/studentDetail")
    @ResponseBody
    public Map<String,Object> ListStudents(StudentVo epVo, HttpServletRequest request) throws Exception{
        Map<String,Object> returnMap = new HashMap<>();
        int pageNum = Integer.parseInt(request.getParameter("page"));
        int pageSize = Integer.parseInt(request.getParameter("rows"));
        epVo.setPage(pageNum);
        epVo.setPageSize(pageSize);
        List<Map<String,Object>> returnList = studentFacade.getAllStudents(epVo);
        int total = Integer.parseInt(returnList.get(0).get("total").toString());
        returnList.remove(0);//第一条存的count数据
        returnMap.put("total",total);
        returnMap.put("rows",returnList);
        return returnMap;
    }

}
