package com.cisdi.enfi.pbs.controller;

import com.cisdi.enfi.pbs.facade.EquipmentPriceLibraryFacade;
import com.cisdi.enfi.pbs.vo.EquipPrice_to_SupplierVo;
import com.cisdi.enfi.pbs.vo.EquipmentPriceLibVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
* <p>Title:设备指标库控制类 </p>
* <p>Description: </p>
* <p>Company: </p> 
* @author Proem_ds
* @date 2017年3月1日 下午4:41:44
 */
@Controller
@RequestMapping("/equipPriceLib")
public class EquipmentPriceLibraryController {

	@Resource
	private EquipmentPriceLibraryFacade eplFacade;
	
	/**
	 * 查询设备价格库明细
	 * @param form
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("queryEquipPriceLibDetail")
	@ResponseBody
	public Map<String,Object> queryEquipPriceLibDetail(EquipmentPriceLibVo epVo, HttpServletRequest request) throws Exception{
		Map<String,Object> returnMap = new HashMap<>();
		int pageNum = Integer.parseInt(request.getParameter("page"));
		int pageSize = Integer.parseInt(request.getParameter("rows"));
		epVo.setPage(pageNum);
		epVo.setPageSize(pageSize);
		List<Map<String,Object>> returnList = eplFacade.queryEquipmentPriceLibraryDetail(epVo);
		int total = Integer.parseInt(returnList.get(0).get("total").toString());
		returnList.remove(0);//第一条存的count数据
		returnMap.put("total",total);
		returnMap.put("rows",returnList);
		return returnMap;
	}
	
	/**
	 * 查询工程项目信息
	 * @param key
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("queryProjectInfo")
	@ResponseBody
	public List<Map<String,Object>> queryProjectInfo(@RequestParam("key") String key, HttpServletRequest request) throws Exception{
		return eplFacade.queryProjectInfo(key);
	}
	
	/**
	 * 新增、修改价格库明细
	 * @param form
	 * @param request
	 * @return
	 * @throws Exception
	 */
//	@RequestMapping("saveEquipPriceLib")
//	@ResponseBody
//	public Map<String,Object> saveEquipPriceLibDetail(Form form, HttpServletRequest request) throws Exception{
//		List<EquipmentPriceLibVo>  voList=form.getEplList();
//		String userId =(String) request.getSession().getAttribute("userId");
//		return eplFacade.saveEquipmentPriceLibrary(voList, userId==null?"testAdmin":userId);
//	}
	
	/**
	 * 新增、修改设备手动输入供应商信息
	 * @param form
	 * @param request
	 * @return
	 * @throws Exception
	 */
//	@RequestMapping("savesupplier")
//	@ResponseBody
//	public Map<String,Object> savesupplier(Form form, HttpServletRequest request) throws Exception{
//		String userId =(String) request.getSession().getAttribute("userId");
//		List<EquipPrice_to_SupplierVo> epsVo = form.getEpl_to_sup();
//		return eplFacade.savesupplier(epsVo, userId==null?"testAdmin":userId);
//	}
	
	/**
	 * 删除设备价格库明细
	 * @param eplId 手动创建指标库ID
	 * @param epSrc  自动创建指标库数据来源
	 * @param request
	 * @return
	 * @throws Exception
	 */
//	@RequestMapping("deleteEquipPriceLib")
//	@ResponseBody
//	public Map<String,Object> deleteEquipPriceLibDetail(String eplId, String epSrc
//			, String pbsVersionId, String pbsCode, HttpServletRequest request) throws Exception{
//		return eplFacade.deleteEquipmentPriceLibrary(eplId,epSrc,pbsVersionId,pbsCode);
//	}
	
	/**
	 * 指标库关联项目物料
	 * @param obj
	 * @param request
	 * @return
	 * @throws Exception
	 */
//	@RequestMapping("saveEplPrjMaterial")
//	@ResponseBody
//	public Map<String,Object> saveEplPrjMaterial(@RequestBody Map<String, Object> obj,
//			HttpServletRequest request) throws Exception{
//		Map<String, String> mmInfo = (Map<String, String>) obj.get("mmInfo");
//		String userId =(String) request.getSession().getAttribute("userId");
//		return eplFacade.saveEplPrjMaterial(mmInfo,userId==null?"testAdmin":userId);
//	}
	
	/**
	 * 查询项目物料属性
	 * @param prjMmId
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("queryProjMmInfoAttr")
	@ResponseBody
	public List<Map<String,Object>> queryProjMmInfoAttr(@RequestParam("prjMmId") String prjMmId, String mmId
			, HttpServletRequest request) throws Exception{
		return eplFacade.queryProjMmInfoAttr(prjMmId,mmId);
	}
	
	/**
	 * 项目物料属性
	 * @param obj
	 * @param request
	 * @return
	 * @throws Exception
	 */
//	@RequestMapping("saveEplPrjMmAttr")
//	@ResponseBody
//	public Map<String,Object> saveEplPrjMmAttr(@RequestBody Map<String, Object> obj,
//			HttpServletRequest request) throws Exception{
//		Map<String, String> mmInfoAttr = (Map<String, String>) obj.get("mmInfoAttr");
//		String userId =(String) request.getSession().getAttribute("userId");
//		return eplFacade.saveEplPrjMmAttr(mmInfoAttr,userId==null?"testAdmin":userId);
//	}
	
	/**
	 * 查询设备库基础数据
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("getEquipPriceBaseData")
	@ResponseBody
	public Map<String,Object> getEquipPriceBaseData(HttpServletRequest request) throws Exception{
		return eplFacade.getEquipPriceBaseData();
	}
	
	/**
	 * 采购模块
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("getPurDataSynchronism")
	@ResponseBody
	public Map<String,Object> getPurDataSynchronism(HttpServletRequest request) throws Exception{
		return eplFacade.getPurDataSynchronism();
	}
	
}
