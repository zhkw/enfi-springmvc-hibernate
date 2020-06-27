package com.cisdi.enfi.pbs.facade.impl;

import com.cisdi.enfi.pbs.facade.EquipmentPriceLibraryFacade;
import com.cisdi.enfi.pbs.service.EquipmentPriceLibraryService;
import com.cisdi.enfi.pbs.vo.EquipPrice_to_SupplierVo;
import com.cisdi.enfi.pbs.vo.EquipmentPriceLibVo;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 
* <p>Title:设备价格库接口实现 </p>
* <p>Description: </p>
* <p>Company: </p> 
* @author Proem_ds
* @date 2017年3月1日 下午4:59:31
 */
@Component
@Transactional
public class EquipmentPriceLibraryFacadeImpl implements
        EquipmentPriceLibraryFacade {

	@Resource
	private EquipmentPriceLibraryService eplService;
	
	//查询设备指标库明细
	@Override
	@Transactional(propagation= Propagation.NOT_SUPPORTED)
	public List<Map<String, Object>> queryEquipmentPriceLibraryDetail(
			EquipmentPriceLibVo epVo) throws Exception {
		return eplService.queryEquipmentPriceLibraryDetail(epVo);
	}

	//新增、修改设备指标库数据
//	@Override
//	public Map<String, Object> saveEquipmentPriceLibrary(
//            List<EquipmentPriceLibVo> eplVo, String userId) throws Exception {
//		return eplService.saveEquipmentPriceLibrary(eplVo, userId);
//	}

	//删除设备指标库
//	@Override
//	public Map<String, Object> deleteEquipmentPriceLibrary(String id,String epSrc,String pbsVersionId,String pbsCode)
//			throws Exception {
//		return eplService.deleteEquipmentPriceLibrary(id,epSrc,pbsVersionId,pbsCode);
//	}

	//查询工程项目信息
	@Override
	@Transactional(propagation= Propagation.NOT_SUPPORTED)
	public List<Map<String, Object>> queryProjectInfo(String key)
			throws Exception {
		return eplService.queryProjectInfo(key);
	}

	//查询设备库基本数据
	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public Map<String, Object> getEquipPriceBaseData() throws Exception {
		return eplService.getEquipPriceBaseData();
	}

	//根据ID查询手动添加的设备指标库
	@Override
	public Map<String, Object> queryEquipmentPriceLibraryById(String id)
			throws Exception {
		return eplService.queryEquipmentPriceLibraryById(id);
	}

	//自动创建设备指标库
//	@Override
//	public Map<String, Object> autoCreateEquipmentPriceLibrary(
//			String pbsVersionId, String pbsNodeId, String projectId,String dataSrc,String userId)
//			throws Exception {
//		return eplService.autoCreateEquipmentPriceLibrary(pbsVersionId, pbsNodeId, projectId, dataSrc, userId);
//	}

	//新增、修改设备库手动创建供应商信息
//	@Override
//	public Map<String, Object> savesupplier(List<EquipPrice_to_SupplierVo> epsVo, String userId) throws Exception {
//		return eplService.savesupplier( epsVo,userId);
//	}

	//采购模块自动生成设备指标库
//	@Override
//	public Map<String, Object> purReqAutoCreateEquipmentPriceLibrary(
//			String pbsVersionId, String projectId, String userId)
//			throws Exception {
//		return eplService.purReqAutoCreateEquipmentPriceLibrary(pbsVersionId, projectId, userId);
//	}

	//保存项目物料数据
//	@Override
//	public Map<String, Object> saveEplPrjMaterial(Map<String, String> mmInfo,
//			String userId) throws Exception {
//		return eplService.saveEplPrjMaterial(mmInfo, userId);
//	}
	
	//查询项目物料属性
	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<Map<String, Object>> queryProjMmInfoAttr(String prjMmId,String mmId)
			throws Exception {
		return eplService.queryProjMmInfoAttr(prjMmId,mmId);
	}

	//保存项目物料属性
//	@Override
//	public Map<String, Object> saveEplPrjMmAttr(Map<String, String> mmInfoAttr,
//			String userId) throws Exception {
//		return eplService.saveEplPrjMmAttr(mmInfoAttr, userId);
//	}

	//同步采购模块数据
	@Override
	public Map<String, Object> getPurDataSynchronism() throws Exception {
		return eplService.getPurDataSynchronism();
	}

}
