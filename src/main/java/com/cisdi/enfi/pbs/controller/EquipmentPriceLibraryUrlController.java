package com.cisdi.enfi.pbs.controller;

import com.cisdi.enfi.pbs.facade.EquipmentPriceLibraryFacade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * 
* <p>Title:设备价格库页面控制器 </p>
* <p>Description: </p>
* <p>Company: </p> 
* @author Proem_ds
* @date 2017年3月1日 下午4:43:50
 */
@Controller
@RequestMapping("/equipPriceLib")
public class EquipmentPriceLibraryUrlController extends BaseController{

	@Resource
	EquipmentPriceLibraryFacade eplFacade;
	
	/**
	 * 设备价格库查询界面
	 * @param req
	 * @param res
	 * @param model
	 * @return
	 */
	@RequestMapping("/equipPriceLibView")
	public ModelAndView priceEditView(HttpServletRequest req, HttpServletResponse res, Model model) {
		String param = req.getParameter("param");
		ModelAndView view = createLayoutView("equipPriceLib/equipPriceLibView");
		view.addObject("param", param);
		return view;
	}
		
	/**
	 * 新增、修改设备价格库数据
	 * @param req
	 * @param res
	 * @param model
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("/editEquipPriceLib")
	public ModelAndView editEquipPriceLib(HttpServletRequest req, HttpServletResponse res, Model model) throws Exception {
		String editId = req.getParameter("editId");
		ModelAndView view = createLayoutView("equipPriceLib/editEquipPriceLibView");
		Map<String,Object> mapRt = null;
		String falg = req.getParameter("params")==null?"":req.getParameter("params");
		if(falg.equals("edit")){
			//根据记录地址查询设备指标库			
			mapRt = eplFacade.queryEquipmentPriceLibraryById(editId);
		}
		view.addObject("eplList", null==mapRt?"":mapRt.get("rs"));
		view.addObject("editId", editId==null?"":editId);
		view.addObject("flags", falg);
		return view;
	}
	
	/**
	 * 自动创建设备指标库
	 * @param pbsVersionId 当前版本Id
	 * @param rootNodeId pbs节点Id
	 * @param projectId 项目Id
	 * @param dataSrc 数据来源  1：投标报价阶段，2：初步设计阶段
	 * @return
	 * @throws Exception
	 */
//	@RequestMapping("/autoCreateEplView")
//	public ModelAndView autoCreateEplView(HttpServletRequest req, String pbsVersionId,
//                                          String rootNodeId, String projectId,
//                                          String dataSrc) throws Exception{
//		ModelAndView view = createLayoutView("equipPriceLib/equipPriceLibView");
//		String userId =(String) req.getSession().getAttribute("userId");
//		//先将之前版本的数据全部删除
//		//eplFacade.deleteEquipmentPriceLibrary("",dataSrc);
//		//查询阶段数据并将数据更新到设备指标库中
//		eplFacade.autoCreateEquipmentPriceLibrary(pbsVersionId, rootNodeId, projectId,dataSrc,userId==null?"testAdmin":userId);
//		view.addObject("param", "find");
//		return view;
//	}
	
	/**
	 * 采购模块自动生成设备价格库
	 * @param req
	 * @param pbsVersionId
	 * @param projectId
	 * @return
	 * @throws Exception
	 */
//	@RequestMapping("/purReqAutoCreateEplView")
//	public ModelAndView purReqAutoCreateEplView(HttpServletRequest req, String pbsVersionId, String projectId) throws Exception{
//		ModelAndView view = createLayoutView("equipPriceLib/equipPriceLibView");
//		String userId =(String) req.getSession().getAttribute("userId");
//		//查询阶段数据并将数据更新到设备指标库中
//		eplFacade.purReqAutoCreateEquipmentPriceLibrary(pbsVersionId,projectId,userId==null?"testAdmin":userId);
//		view.addObject("param", "find");
//		return view;
//	}
}
