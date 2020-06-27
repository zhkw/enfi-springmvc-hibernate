package com.cisdi.enfi.pbs.service.impl;

import com.cisdi.enfi.pbs.domain.*;
import com.cisdi.enfi.pbs.model.Root;
import com.cisdi.enfi.pbs.service.EquipmentPriceLibraryService;
import com.cisdi.enfi.pbs.utils.DateUtil;
import com.cisdi.enfi.pbs.vo.EquipPrice_to_SupplierVo;
import com.cisdi.enfi.pbs.vo.EquipmentPriceLibVo;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 
* <p>Title:设备指标库业务逻辑实现 </p>
* <p>Description: </p>
* <p>Company: </p> 
* @author Proem_ds
* @date 2017年3月1日 下午5:02:14
 */
@Service
@Transactional
public class EquipmentPriceLibraryServiceImpl extends BaseServiceImpl implements
        EquipmentPriceLibraryService {

	//查询设备价格库明细
	@Override
	@Transactional(propagation= Propagation.NOT_SUPPORTED)
	public List<Map<String, Object>> queryEquipmentPriceLibraryDetail(
			EquipmentPriceLibVo epVo) throws Exception {
		//查询sql
		String sql = "    SELECT																		"
				+"	EP. ID,                                                                     "
				+"	EP.CREATETIME,                                                              "
				+"  EP.CONTRACTID,                                                              "
				+"  EP.CONTRACTNO,                                                              "
				+"	EP.CONTRACTNAME,                                                            "
				+"	EP.CHANNEL,                                                                 "
				+"	EP.STAGEID,                                                                 "
				+"	EP.CURRENCYID,                                                              "
				+"	EP.DEMO,                                                                    "
				+"	EP.DESCRIPTION,                                                             "
				+"	EP.ELECMACH,                                                                "
				+"	NVL (EP.ELECMACHNUM, 0) AS ELECMACHNUM,                                     "
				+"	EP.EXCHANGERATE,                                                            "
				+"	(                                                                           "
				+"		CASE NVL (EP.ISFABCOST, '0')                                            "
				+"		WHEN '0' THEN                                                           "
				+"			'否'                                                                 "
				+"		ELSE                                                                    "
				+"			'是'                                                                 "
				+"		END                                                                     "
				+"	) AS ISFABCOST,                                                             "
				+"	(                                                                           "
				+"		CASE NVL (EP.ISIMPORT, '0')                                             "
				+"		WHEN '0' THEN                                                           "
				+"			'国产设备'                                                              "
				+"		ELSE                                                                    "
				+"			'进口设备'                                                              "
				+"		END                                                                     "
				+"	) AS ISIMPORT,                                                              "
				+"	EP.MAJORID,                                                                 "
				+"	EP.MMID,                                                                    "
				+"	EP.PRJMMID,                                                                 "
				+"	EP.PRJMMNAME,                                                               "
				+"	EP.PBSNODEID,                                                               "
				+"	EP.PRICESRC,                                                                "
				+"	TO_CHAR (                                                                   "
				+"		EP.PRICETIME,                                                           "
				+"		'yyyy-mm-dd hh24:mi:ss'                                                 "
				+"	) AS PRICETIME,                                                             "
				+"	EP.PROJID,                                                                  "
				+"	NVL (EP.QUANTITY, 0) AS QUANTITY,                                           "
				+"	NVL (EP.SUMNOTPRICE, 0) AS SUMNOTPRICE,                                     "
				+"	NVL (EP.SUMPRICE, 0) AS SUMPRICE,                                           "
				+"	NVL (EP.SUMWEIGHT, 0) AS SUMWEIGHT,                                         "
				+"	EP.SUPPLIERID,                                                              "
				+"	NVL (EP.TAXRATE, 0) AS TAXRATE,                                             "
				+"	EP.UNITID,                                                                  "
				+"	NVL (EP.UNITPRICE, 0) AS UNITPRICE,                                         "
				+"	NVL (EP.UNITWEIGHT, 0) AS UNITWEIGHT,                                       "
				+"	MM.MATERIALCODE AS BMMCODE,                                                 "
				+"	MM.MATERIALNAME AS BMMNAME,                                                 "
				+"	(CASE NVL (MM.MATERIALCODE || '_' || MM.MATERIALNAME,'_')                   "
				+"		WHEN '_' THEN	''                                                      "
				+"		ELSE                                                                    "
				+"			MM.MATERIALCODE || '_' || MM.MATERIALNAME                           "
				+"		END                                                                     "
				+"	) AS BMMC_M,                                                                "
				+"	MM.MMCATEGORYCODE AS BMCCODE,                                               "
				+"	MM.MMCATEGORY AS BMCNAME,                                                   "
				+"	PROJ. NAME AS PROJNAME,                                                     "
				+"	PROJ.NUM AS PROJCODE,                                                       "
				+"	PROJE.PRODUCTID AS PRODUCTID,                                               "
				+"	SUPP.SUPPLIERNAME AS SUPPNAME,                                              "
				+"  SUPP.SUPPLIERCODE AS SUPPCODE,                                              "
				+"	NVL (SUPP.ISHANDINPUT,0) ISHANDINPUT,                                       "
				+"	CURR. NAME AS CURRNAME,                                                     "
				//+"	PTE.CODE AS PBSCODE,                                                    "
				+"	PTE. PRJMATERIALNAME AS PBSNAME,                                            "
				+"	UNIT.UNITNAME,                                                              "
				+"	PMM.PRJMATERIALNAME,                                                        "
				+"	PMM.MMDESCRIPTION,                                                        "
				+"	PMM. ID AS PMMID,                                                           "
				+"	PS. NAME STAGENAME                                                          "
				+"	FROM	PBS_EQUIPMENTPRICE EP                                               "
				+"	LEFT JOIN PBS_VIEW_MATERIALMNG MM ON EP.MMID = MM. ID                       "
				+"	LEFT JOIN PBS_VIEW_PROJECT PROJ ON EP.PROJID = PROJ. ID                     "
				+"	LEFT JOIN PBS_EQUIPPRIC_TO_SUPPLIERS SUPP ON EP. ID = SUPP.EQUIPMENTID      "
				+"	LEFT JOIN PBS_CURRENCY CURR ON EP.CURRENCYID = CURR. ID                     "
				//+"  LEFT JOIN PBS_PBSNODE PP ON PP.ID = EP.PBSNODEID                            "
				+"	LEFT JOIN PBS_PRJMATERIALMNG PTE ON EP.PBSNODEID = PTE. ID                  "
				+"	LEFT JOIN MM_UNIT UNIT ON EP.UNITID = UNIT. ID                              "
				+"	LEFT JOIN PBS_PROJECTEXTENDINFO PROJE ON PROJ. ID = PROJE.PROJECTID         "
				+"	LEFT JOIN PBS_PRJMATERIALMNG PMM ON PMM. ID = EP.PRJMMID                    "
				+"	LEFT JOIN PBS_PROJECTSTAGE PS ON PS. ID = EP.STAGEID                        "
				//+"	LEFT JOIN PBS_VIEW_MAJORINFORMATION MAJ ON EP.MAJORID = MAJ. ID             "
				+"	WHERE	1 = 1                                                               ";
		//物料类型
		if(null!=epVo.getMaterialTypeId() && !"".equals(epVo.getMaterialTypeId())){
			String mmCategoryIdS=this.buildMaterialCategoryIds(epVo.getMaterialTypeId().trim(), true);
			sql +=" AND MM.MMCATEGORYID "+mmCategoryIdS;
		}
		//材料名称、编码、规格型号;注：此处的物料搜索条件应为项目物料名称、标准物料名称、标准物料编码
		if(null!=epVo.getMaterialKey() && !"".equals(epVo.getMaterialKey())){
			sql+=" AND ( MM.MATERIALCODE LIKE '%"+epVo.getMaterialKey().trim()+"%'"
					+ " OR MM.MATERIALNAME LIKE '%"+epVo.getMaterialKey().trim()+"%'"
					+ " OR PMM.PRJMATERIALNAME LIKE '%"+epVo.getMaterialKey().trim()+"%')";
		}
		//项目名称、编号
		if(null!=epVo.getProjKey() && !"".equals(epVo.getProjKey())){
			sql +=" AND (PROJ.NUM LIKE '%"+epVo.getProjKey().trim()+"%' "
					+ " OR PROJ. NAME LIKE '%"+epVo.getProjKey().trim()+"%')";
		}
		//价格来源:多个id用逗号分隔
		if(null!=epVo.getPriceSrc() && !"".equals(epVo.getPriceSrc())){
			String[] str = epVo.getPriceSrc().split(",");
			sql+=" AND ( ";
			for (int i = 0; i < str.length; i++) {
				if(i==0){
					sql +=" EP.PRICESRC = '"+str[i]+"'";
				}else{
					sql +=" OR EP.PRICESRC = '"+str[i]+"'";
				}
			}
			sql+=" ) ";
		}
		//产品类型:多个id用逗号分隔
		if(null!=epVo.getProductType() && !"".equals(epVo.getProductType())){
			sql +=" AND PROJE.PRODUCTID  LIKE '%"+epVo.getProductType().trim()+"%'";
		}
		//合同编号、名称
		if(null!=epVo.getContractKey() && !"".equals(epVo.getContractKey())){
			sql+=" AND (EP.CONTRACTNO LIKE '%"+epVo.getContractKey()+"%'"
					+ " OR EP.CONTRACTNAME LIKE '%"+epVo.getContractKey()+"%') ";
		}
		//供应商名称、编码
		if(null!=epVo.getSupplierKey() && !"".equals(epVo.getSupplierKey())){
			sql +=" AND SUPP. SUPPLIERNAME LIKE '%"+epVo.getSupplierKey().trim()+"%'";
		}
		//子项名称:物料名称
		if(null!=epVo.getSubItemName() && !"".equals(epVo.getSubItemName())){
			//sql +=" AND PROJMM.PRJMATERIALNAME LIKE '%"+epVo.getSubItemName().trim()+"%'";
			sql +=" AND PTE.NAME LIKE '%"+epVo.getSubItemName().trim()+"%'";
		}
		//专业:多个id用逗号分隔
		if(null!=epVo.getMajorNameKey() && !"".equals(epVo.getMajorNameKey())){
			//sql +=" AND MAJ.MAJORNAME LIKE '%"+epVo.getMajorNameKey().trim()+"%'";
			String[] str = epVo.getMajorNameKey().split(",");
			sql+=" AND ( ";
			for (int i = 0; i < str.length; i++) {
				if(i==0){
					sql +=" EP.MAJORID = '"+str[i]+"'";
				}else{
					sql +=" OR EP.MAJORID = '"+str[i]+"'";
				}
			}
			sql+=" ) ";
		}
		//价格日期
		if(null!=epVo.getStartTime() && !"".equals(epVo.getStartTime())){
			sql +=" AND EP.PRICETIME >= to_date('"+epVo.getStartTime().trim()+"','yyyy-mm-dd hh24:mi:ss')";
		}
		if(null!=epVo.getEndTime() && !"".equals(epVo.getEndTime())){
			sql +=" AND EP.PRICETIME <= to_date('"+epVo.getEndTime().trim()+"','yyyy-mm-dd hh24:mi:ss')";
		}
		sql +=" ORDER BY EP.CREATETIME DESC";
		String countSql = "SELECT count(*) from ("+sql+")";
		long total = this.getTotalCountBySql(countSql,null);
		Map<String,Object> map = new HashMap<>();
		map.put("total",total);
		List<Map<String,Object>> returnList = this.getObjListBySqlPaged(sql,epVo.getPage(),epVo.getPageSize(),null);
		returnList.add(0,map);
		return returnList;
	}

	/**
	 * 构件物料分类树集合ids
	 */
	@Override
	public String buildMaterialCategoryIds(String rootId,boolean isRecursion) throws Exception {
		if(isRecursion){
			String rString="";
			String sql= "SELECT MC.ID                           "+
						"  FROM MM_MATERIALCATEGORY MC          "+
						" START WITH MC.ID =?                   "+
						"CONNECT BY MC.PARENTID = PRIOR MC.ID   ";
			List<Object> params=new ArrayList<Object>();
			params.add(rootId);
			List<Map<String,Object>> dataList=this.getObjListBySql(sql, params);
			for(int i=0;i<dataList.size();i++){
				if(i==0){
					rString=" IN ('"+dataList.get(i).get("ID")+"',";
				}else{
					rString+="'"+dataList.get(i).get("ID")+"',";
				}
			}
			return rString.substring(0, rString.lastIndexOf(","))+")";
		}else{
			return "='"+rootId+"'";
		}
	}


	//查询工程项目信息
	@Override
	@Transactional(propagation= Propagation.NOT_SUPPORTED)
	public List<Map<String, Object>> queryProjectInfo(String key)
			throws Exception {
		String querySql = "SELECT VP.ID,VP.NUM PROJCODE,VP.NAME AS PROJNAME,PE.PRODUCTID"
				+ " FROM PBS_VIEW_PROJECT vp,PBS_PROJECTEXTENDINFO pe"
				+ " WHERE VP.ID=PE.PROJECTID(+)";
		if(!StringUtils.isBlank(key)){
			querySql+=" AND (VP.NUM LIKE '%"+key+"%' OR VP.NAME LIKE '%"+key+"%')";
		}
		return this.getObjListBySql(querySql, null);
	}

	//查询设备库基础数据
	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public Map<String, Object> getEquipPriceBaseData() throws Exception {
		Map<String, Object> rsMap = new HashMap<String, Object>();
		//产品类型
		String sql = "SELECT * FROM pbs_productType";
        List<Map<String, Object>> productTypeList = this.getObjListBySql(sql, null);
        rsMap.put("productType", productTypeList);
        //专业
        sql = "select * from pbs_view_MajorInformation t where 1=1 ";
        List<Map<String, Object>> majorList = this.getObjListBySql(sql, null);
        rsMap.put("major", majorList);
        //单位 ：查询同于编辑物料清单中的单位取值
        sql = "SELECT	ID,	unitName FROM 	mm_Unit  WHERE 	1 = 1 AND status = 1 ";
        List<Map<String, Object>> unitList = this.getObjListBySql(sql, null);
        rsMap.put("unit", unitList);
        //币种
        sql = "select * from pbs_currency t";
        List<Map<String, Object>> currencyList = this.getObjListBySql(sql, null);
        rsMap.put("currency", currencyList);
        //项目阶段
        sql = "SELECT PS.ID ,PS.CODE,PS.NAME FROM PBS_PROJECTSTAGE ps ";
        List<Map<String, Object>> stageList = this.getObjListBySql(sql, null);
        rsMap.put("stage", stageList);
		return rsMap;
	}
	
	/**
	 * 字符串转换为浮点数
	 * @param converStr
	 * @return
	 */
	private Double converToDouble(String converStr){
		if(null==converStr || "".equals(converStr.trim())){
			return 0.0;
		}
		return Double.valueOf(converStr);
	}

	/**
	 * 字符串转换为整数
	 * @param converStr
	 * @return
	 */
	private Integer converToInteger(String converStr){
		if(null==converStr || "".equals(converStr.trim())){
			return 0;
		}
		return Integer.valueOf(converStr);
	}

	//根据ID值查询手动添加的设备指标库
	@Override
	public Map<String, Object> queryEquipmentPriceLibraryById(String id)
			throws Exception {
		Map<String, Object> rsMap = new HashMap<String, Object>();
		List<Object> params = new ArrayList<Object>();
		String findSql = "    SELECT																		"
				+"	EP. ID,                                                                     "
				+"	EP.CREATETIME,                                                              "
				+"	EP.CHANNEL,                                                                 "
				+"	EP.STAGEID,                                                                 "
				+"	EP.CURRENCYID,                                                              "
				+"	EP.DEMO,                                                                    "
				+"	EP.DESCRIPTION,                                                             "
				+"	EP.ELECMACH,                                                                "
				+"	NVL (EP.ELECMACHNUM, 0) AS ELECMACHNUM,                                     "
				+"	EP.EXCHANGERATE,                                                            "
				+"	NVL (EP.ISFABCOST, '0') AS ISFABCOST,                                       "
				+"	NVL (EP.ISIMPORT, '0') AS ISIMPORT,                                         "
				+"	EP.MAJORID,                                                                 "
				+"	EP.MMID,                                                                    "
				+"	EP.PRJMMID,                                                                 "
				+"	EP.PRJMMNAME,                                                               "
				+"	EP.PBSNODEID,                                                               "
				+"	EP.PRICESRC,                                                                "
				+"	TO_CHAR (                                                                   "
				+"		EP.PRICETIME,                                                           "
				+"		'yyyy-mm-dd hh24:mi:ss'                                                 "
				+"	) AS PRICETIME,                                                             "
				+"	EP.PROJID,                                                                  "
				+"	NVL (EP.QUANTITY, 0) AS QUANTITY,                                           "
				+"	NVL (EP.SUMNOTPRICE, 0) AS SUMNOTPRICE,                                     "
				+"	NVL (EP.SUMPRICE, 0) AS SUMPRICE,                                           "
				+"	NVL (EP.SUMWEIGHT, 0) AS SUMWEIGHT,                                         "
				+"	EP.SUPPLIERID,                                                              "
				+"	NVL (EP.TAXRATE, 0) AS TAXRATE,                                             "
				+"	EP.UNITID,                                                                  "
				+"	NVL (EP.UNITPRICE, 0) AS UNITPRICE,                                         "
				+"	NVL (EP.UNITWEIGHT, 0) AS UNITWEIGHT,                                       "
				+"	MM.MATERIALCODE AS BMMCODE,                                                 "
				+"	MM.MATERIALNAME AS BMMNAME,                                                 "
				+"	(CASE NVL (MM.MATERIALCODE || '_' || MM.MATERIALNAME,'_')                   "
				+"		WHEN '_' THEN	''                                                      "
				+"		ELSE                                                                    "
				+"			MM.MATERIALCODE || '_' || MM.MATERIALNAME                           "
				+"		END                                                                     "
				+"	) AS BMMC_M,                                                                "
				+"	MM.MMCATEGORYCODE AS BMCCODE,                                               "
				+"	MM.MMCATEGORY AS BMCNAME,                                                   "
				+"	PROJ. NAME AS PROJNAME,                                                     "
				+"	PROJ.NUM AS PROJCODE,                                                       "
				+"	PROJE.PRODUCTID AS PRODUCTID,                                               "
				+"	SUPP.ID AS SUPPID,                                           			    "
				+"	SUPP.SUPPLIERNAME AS SUPPNAME,                                              "
				+"	NVL (SUPP.ISHANDINPUT,0) ISHANDINPUT,                                                   "
				+"	CURR. NAME AS CURRNAME,                                                     "
				//+"	PTE.CODE AS PBSCODE,                                                        "
				+"	PTE. PRJMATERIALNAME AS PBSNAME,                                                       "
				+"	UNIT.UNITNAME,                                                              "
				+"	PMM.PRJMATERIALNAME,                                                        "
				+"	PMM. ID AS PMMID,                                                           "
				+"	PS. NAME STAGENAME                                                          "
				+"	FROM	PBS_EQUIPMENTPRICE EP                                               "
				+"	LEFT JOIN PBS_VIEW_MATERIALMNG MM ON EP.MMID = MM. ID                       "
				+"	LEFT JOIN PBS_VIEW_PROJECT PROJ ON EP.PROJID = PROJ. ID                     "
				+"	LEFT JOIN PBS_EQUIPPRIC_TO_SUPPLIERS SUPP ON EP. ID = SUPP.EQUIPMENTID      "
				+"	LEFT JOIN PBS_CURRENCY CURR ON EP.CURRENCYID = CURR. ID                     "
				+"	LEFT JOIN PBS_PRJMATERIALMNG PTE ON EP.PBSNODEID = PTE. ID                  "
				+"	LEFT JOIN MM_UNIT UNIT ON EP.UNITID = UNIT. ID                              "
				+"	LEFT JOIN PBS_PROJECTEXTENDINFO PROJE ON PROJ. ID = PROJE.PROJECTID         "
				+"	LEFT JOIN PBS_PRJMATERIALMNG PMM ON PMM. ID = EP.PRJMMID                    "
				+"	LEFT JOIN PBS_PROJECTSTAGE PS ON PS. ID = EP.STAGEID                        "
				+"	WHERE	1 = 1  AND EP.PRICESRC ='5' AND EP.ID='"+id+"'                      ";
		List<Map<String, Object>> listMap = this.getObjListBySql(findSql, params);
		if(null!=listMap && listMap.size()>0){
			rsMap.put("rs", listMap.get(0));
		}else{
			rsMap.put("rs", null);
		}
		return rsMap;
	}



	/**
	 * 标准设备、非标设备的含税单价=属于工程造价费用体系分类中“设备费”的费用价格汇总值；
	 * @param projMMId
	 * @return
	 * @throws Exception 
	 */
	@Override
	public double getSinglePrice(String projMMId) throws Exception{
		double singlePrice = 0.0;
		String priceSql="              SELECT																  "+
				"              	PR.PRJMMID AS projMaterialId,NVL(SUM (PR.DISCOUNTRATE * PR.PRICE), 0) EQPRICE "+
				"              FROM                                                                           "+
				"              	PBS_PRICELISTDETAIL pr                                                        "+
				"              WHERE                                                                          "+
				"              	PR.EXPENSETYPEID IN (                                                         "+
				"              		SELECT                                                                    "+
				"              			ET. ID                                                                "+
				"              		FROM                                                                      "+
				"              			PBS_EXPENSETYPE et                                                    "+
				"              		WHERE                                                                     "+
				"              			ET.CONSTRUCTCOSTID IN (                                               "+
				"              				SELECT                                                            "+
				"              					A . ID                                                        "+
				"              				FROM                                                              "+
				"              					pbs_constructcostcharge A                                     "+
				"              				WHERE                                                             "+
				"              					A .PARENTID = '120'                                           "+
				"              			)                                                                     "+
				"              	)                                                                             "+
				"              AND                                                                            "+
				"              	PR.PRJMMID = '"+projMMId+"' GROUP BY PR.PRJMMID    							   ";
		List<Map<String,Object>> priceList = this.getObjListBySql(priceSql, null);				
		if(null!=priceList && priceList.size()>0){
			singlePrice = Double.valueOf((String)(priceList.get(0).get("EQPRICES")));
		}
		return singlePrice;
	}
	



	@Override
	public List<Map<String, Object>> queryProjMmInfoAttr(String prjMmId,String mmId)
			throws Exception {
		String querySql = "SELECT PV.* FROM PBS_PRJATTRVALUE PV WHERE PV.PRJMMID='"+prjMmId+"' ";
		//项目物料属性
		List<Map<String, Object>> list1 = this.getObjListBySql(querySql, null);
		
		querySql="SELECT PVA.* FROM PBS_VIEW_ATTRIBUTEVALUE PVA WHERE PVA.MMID = '"+mmId+"'";
		//基础物料属性
		List<Map<String, Object>> list2 = this.getObjListBySql(querySql, null);
		List<Map<String,Object>> rList=new ArrayList<Map<String,Object>>();
		for(Map<String,Object> bmap : list2){
			boolean isExist=false;
			for(int i=0;i<list1.size();i++){
				Map<String,Object> pmap=list1.get(i);
				//如果项目物料属性存在该属性，就用项目物料属性
				if(bmap.get("ATTRID")!=null&&pmap.get("ATTRID")!=null
						&&bmap.get("ATTRID").equals(pmap.get("ATTRID"))){
					rList.add(pmap);
					list1.remove(i);
					isExist=true;
					break;
				}
			}
			if(!isExist){
				rList.add(bmap);
			}
		}
		return rList;
	}



	@Override
	public String findEplByPbsVersionId(String pbsVersionId) throws Exception {
		String result = "";
		String findSql = "SELECT PBV.ID,PBVT.CODE FROM PBS_PBSVERSION PBV "
				+ "  INNER JOIN PBS_PBSVERSIONTYPE PBVT ON PBV.TYPEID = PBVT.ID"
				+ "  WHERE PBV.ID='"+pbsVersionId+"'";
		List<Map<String, Object>> list = this.getObjListBySql(findSql, null);
		if(null!=list && list.size()>0){
			result = list.get(0).get("CODE").toString();
		}
		return result;
	}

	@Override
	public Map<String, Object> getPurDataSynchronism() throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		String findSql =  "		select purv.*,									"
				+"			   pql.*,                                   "
				+"			   pmt.code  mgnTypeCode,                   "
				+"			   pmt.name  mgnTypeName,                   "
				+"			   prq.code reqCode,                        "
				+"			   prq.departmentid,                        "
				+"			   prq.prjid,                               "
				+"			   prq.remark,                              "
				+"			   prq.status,                              "
				+"			   prq.typeid                               "
				+"		  from CUX_PO_PRICE_V purv                      "
				+"		 inner join pbs_purreqline pql                  "
				+"			on purv.ATTRIBUTE15 = pql.id                "
				+"		  left join pbs_managetype pmt                  "
				+"			on pql.mngtypeid = pmt.id                   "
				+"		 inner join pbs_purreq prq                      "
				+"			on pql.purreqid = prq.id                    "
				+"		 where pmt.code in ('EQ', 'NEQ', 'IM');         ";
		
		return map;
	}
	
	
	
	
}
