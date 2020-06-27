package com.cisdi.enfi.pbs.facade;

import com.cisdi.enfi.pbs.vo.EquipPrice_to_SupplierVo;
import com.cisdi.enfi.pbs.vo.EquipmentPriceLibVo;

import java.util.List;
import java.util.Map;

/**
 * 
* <p>Title:设备价格库接口 </p>
* <p>Description: </p>
* <p>Company: </p> 
* @author Proem_ds
* @date 2017年3月1日 下午4:59:00
 */
public interface EquipmentPriceLibraryFacade {

	/**
	 * 查询设备价格库明细
	 * @param eplVo
	 * @param materialTypeID
	 * @return
	 * @throws Exception
	 */
	public List<Map<String,Object>> queryEquipmentPriceLibraryDetail(EquipmentPriceLibVo epVo) throws Exception;
	
	/**
	 * 查询工程项目信息
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public List<Map<String,Object>> queryProjectInfo(String key) throws Exception;
	
	/**
	 * 新增或者修改手动创建的设备价格库
	 * @param eplVo
	 * @param userId
	 * @return
	 * @throws Exception
	 */
//	public Map<String,Object> saveEquipmentPriceLibrary(List<EquipmentPriceLibVo> eplVo, String userId)throws Exception;

	/**
	 * 新增、修改设备库手动输入供应商信息
	 * @param request
	 * @param id
	 * @param supplierName
	 * @return
	 * @throws Exception
	 */
//	public Map<String,Object> savesupplier(List<EquipPrice_to_SupplierVo> epsVo, String userId) throws Exception;

	/**
	 * 删除手动创建的设备价格库
	 * @param id
	 * @return
	 * @throws Exception
	 */
//	public Map<String,Object> deleteEquipmentPriceLibrary(String id, String epSrc, String pbsVersionId, String pbsCode)throws Exception;

	/**
	 * 新增、修改项目物料数据
	 * @param mmInfo
	 * @param userId
	 * @return
	 * @throws Exception
	 */
//	public Map<String,Object> saveEplPrjMaterial(Map<String, String> mmInfo, String userId) throws Exception;

	/**
	 * 查询设备库基础数据
	 * @return
	 * @throws Exception
	 */
	public Map<String,Object> getEquipPriceBaseData() throws Exception;

	/**
	 * 查询设备手动添加设备指标库
	 * @param id 记录ID
	 * @return
	 * @throws Exception
	 */
	public Map<String,Object> queryEquipmentPriceLibraryById(String id) throws Exception;

	/**
	 * 自动创建设备指标库数据
	 * @param pbsVersionId pbs版本Id
	 * @param pbsNodeId  pbs节点Id
	 * @param projectId  项目Id
	 * @return
	 * @throws Exception
	 */
//	public Map<String,Object> autoCreateEquipmentPriceLibrary(String pbsVersionId, String pbsNodeId, String projectId, String dataSrc, String userId) throws Exception;

	/**
	 * 采购模块自动生成设备库
	 * @param pbsVersionId
	 * @param projectId
	 * @param userId
	 * @return
	 * @throws Exception
	 */
//	public Map<String,Object> purReqAutoCreateEquipmentPriceLibrary(String pbsVersionId, String projectId, String userId) throws Exception;

	/**
	 * 查询项目物料属性
	 * @param prjMmId
	 * @return
	 * @throws Exception
	 */
	public List<Map<String,Object>> queryProjMmInfoAttr(String prjMmId, String mmId)throws Exception;

	/**
	 * 保存项目物料属性
	 * @param mmInfoAttr
	 * @param userId
	 * @return
	 * @throws Exception
	 */
//	public Map<String,Object> saveEplPrjMmAttr(Map<String, String> mmInfoAttr, String userId)throws Exception;
	
	/**
	 * 同步采购模块数据到设备指标库
	 * @return
	 * @throws Exception
	 */
	public Map<String,Object> getPurDataSynchronism()throws Exception;
}
