package com.cisdi.enfi.pbs.utils;

/**
 * 
 * @author LCore PBS数据字典
 */
public class Dictionary {
	
	// 节点状态
	public static Integer EditStatus_Clear = 0;
	public static Integer EditStatus_Create = 1;
	public static Integer EditStatus_Update = 2;
	public static Integer EditStatus_Delete = 3;

	// PBS审批状态
	public static Integer PbsStructure_STATUS_DRAFT = 0; // 草稿
	public static Integer PbsStructure_STATUS_CHECKING = 1; // 审批中
	public static Integer PbsStructure_STATUS_CHECKED = 2; // 审批完成
	public static Integer PbsStructure_STATUS_CANCLE = -1; // 已取消

	// 分包策划类型
	public static Integer PbsStructure_PLAN_TYPE_C = 0; // 施工分包
	public static Integer PbsStructure_PLAN_TYPE_D = 1; // 设计分包
	public static Integer PbsStructure_PLAN_TYPE_O = 2; // 其他分包
	public static Integer PbsStructure_PLAN_TYPE_P = 3; // 采购分包
	public static Integer PbsStructure_PLAN_TYPE_DL = 4; // 设计(劳务)分包
	
	// 物料清单审批状态
	public static Integer MaterialList_STATUS_DRAFT= 0;  //草稿
	public static Integer MaterialList_STATUS_CHECKING= 1;  //审批中
	public static Integer MaterialList_STATUS_CHECKED= 2;  //已批准

	// 价格表状态
	public static Integer PriceList_STATUS_DRAFT = 0; // 草稿
	public static Integer PriceList_STATUS_CHECKING = 1; // 审批中
	public static Integer PriceList_STATUS_CHECKED = 2; // 审批完成
	public static Integer PriceList_STATUS_REJECTED = 3; // 审批完成

	// VersionType_code_name版本类型编码
	public static final String VERSIONTYPE_CODE_MAIN = "M"; // 版本类型编码

	// 管理类型ID
	public static String ManageType_Construct = "CON"; // 建筑工程
	public static String ManageType_Equipment = "EQ"; // 标准设备
	public static String ManageType_NonstandardEquipment = "NEQ"; // 非标设备
	public static String ManageType_Product = "PDT"; // 子项
	public static String ManageType_InstallMaterial = "IM"; // 安装材料
	public static String ManageType_Fee = "FEE"; // 工程
	public static String ManageType_Service = "SER"; // 服务
	public static String ManageType_Other = "OTH"; // 其他
	public static String ManageType_DesignSub = "DESIGNSUB"; // 设计分包
	public static String ManageType_ManageSub = "MANAGESUB"; // 管理分包
	
	// 默认费用分组 {费用类型ID, 默认值(%)}
	public static String[][] ExpenseType_DomesticEquipment = {
		{"130", "0"}, // 设备费
		{"140", "5"}, // 设备运杂费
		{"150", "1"}, // 备品备件费
		{"260", "0"}}; // 设备安装费
	public static String[][] ExpenseType_ImportedEquipment = {
		{"130", "0"}, // 设备费
		{"150", "0"}, // 备品备件费
		{"160", "6"}, // 国际运费
		{"170", "0.35"}, // 运输保险费
		{"180", "0.5"}, // 银行财务费
		{"190", "1"}, // 外贸手续费
		{"200", "0"}, // 关税
		{"210", "17"}, // 增值税
		{"220", "0.8"}, // 商检费
		{"230", "0.17"}, // 检疫费
		{"240", "1"}, // 进口设备国内运杂费
		{"260", "1"}}; // 设备安装费
	public static String[][] ExpenseType_InstallMaterial = {
		{"265", "0"}, // 工程材料费
		{"270", "0"} // 材料安装费
		};
	public static String[][] ExpenseType_Construct = {{"110", "0"}}; // 建筑工程费
	public static String[][] ExpenseType_CostControll = {
		{"130"}, {"260"}, {"270"}, {"110"}
	};
	
	// 默认费率分组 {费用类型ID, 默认值(%), 计算基数}
	public static String[][] ExpenseRatio_Domestic = {
		{"140", "5", "130"}, // 设备运杂费
		{"150", "1", "130"}, // 备品备件费
		{"260", "0", "130"}}; // 设备安装费
	public static String[][] ExpenseRatio_Imported = {
		{"160", "6", "130"}, // 国际运费
		{"170", "0.35", "130,160"}, // 运输保险费
		{"180", "0.5", "130"}, // 银行财务费
		{"190", "1", "130,160,170"}, // 外贸手续费
		{"200", "0", "130,160,170"}, // 关税
		{"210", "17", "130,160,170,200"}, // 增值税
		{"220", "0.8", "130,160,170"}, // 商检费
		{"230", "0.17", "130,160,170"}, // 检疫费
		{"240", "1", "130,160,170"}, // 进口设备国内运杂费
		{"150", "1", "130"}, // 备品备件费
		{"260", "0", "130,160,170"}}; // 设备安装费
	public static String[][] ExpenseRatio_Material = {
		{"270", "0", "265"} // 材料安装费
	};
	
	// 默认项目计费费用类型ID
	public static String[][] ProjectChargeExpense_Default = {
		{"820", ""}, // 设计(专业)分包费
		{"830", ""}, // 管理及其他类分包费
		{"800", ""}, // 设备采购预备费
		{"810", ""}, // 建安工程预备费
		{"850", ""}, // 差旅费
		{"860", ""}, // 业务费
		{"870", ""}, // 办公材料固定资产购置费
		{"430", ""}, // 其他
		{"390", ""}, // 财务费用 
		{"910", ""}, // 项目其他收入
		{"410", ""}, // 税金
		{"815", ""}, // 其他预备费
		};
	
	// 默认项目计费费用类型ID - 外部版
	public static String[][] ProjectChargeExpense_Out = {
		{"770", "100"}, // 不可预见费
		{"540", "100"}, // 设计费
		{"360", "100"}, // 总承包管理费
		{"390", ""}, // 财务费用
		{"650", "100"}, // 工程保险费
		{"670", "100"}, // 联合试运转费
		{"700", ""}, // 特殊设备安全监督检验费
		{"720", ""}, // 专利及专有技术使用费
		{"410", ""}, // 税金
		{"420", "100"}, // 利润
		{"430", ""},  // 其他
		};
	
	// 默认项目计费{费用类型ID, 默认值(%), 计算基数} - 设计咨询项目
	public static String[][] ProjectChargeExpense_Consult = {
		{"290", "0", ""}, // 土地使用费
		{"320", "0", "100"}, // 建设单位开办费
		{"330", "0", "100"}, // 建设单位经费
		{"340", "0", ""}, // 工程监理费
		{"350", "0", ""}, // 项目后评价费用
		{"440", "0", ""}, // 可行性研究费
		{"450", "0", ""}, // 环境影响评价费
		{"460", "0", "100"}, // 劳动安全卫生评价费
		{"470", "0", ""}, // 节能评估费
		{"480", "0", ""}, // 地址灾害危险性评估费
		{"490", "0", ""}, // 压覆矿产资源评估费用
		{"500", "0", ""}, // 水土保持咨询服务费用
		{"510", "0", ""}, // 研究试验费
		{"520", "0", "100"}, // 工程勘察费
		{"550", "0", "100,680,690"}, // 基本设计收费
		{"560", "0", ""}, // 非标准设备设计费
		{"570", "10", "550"}, // 施工图预算编制费
		{"580", "0", ""}, // 工程竣工图编制费
		{"590", "2", ""}, // 施工图设计文件审查费
		{"600", "0", ""}, // 招标代理服务费 
		{"610", "0", ""}, // 场地准备费
		{"620", "0", "100"}, // 建设单位临时设施费
		{"630", "0", ""}, // 矿山巷道维修费
		{"640", "0", ""}, // 引进技术和引进设备其他费
		{"650", "0", "100"}, // 工程保险费
		{"680", "0.5", "100"}, // 无负荷联合试运转费
		{"690", "0", "100"}, // 有负荷联合试运转费
		{"700", "0", ""}, // 特殊设备安全监督检验费
		{"710", "0", ""}, // 市政公用设施费
		{"720", "0", ""}, // 专利及专有技术使用费
		{"740", "0", ""}, // 人员培训费及提前进场费
		{"750", "0", ""}, // 办公与生活家具购置费
		{"760", "0", "130"} // 工器具及生产家具购置费
	}; 
	
	//版本类型
    public static  String  BID_IN="bid_in";//报价-内部版
    public static  String  CONTRACT_IN="contract_in";//修订版报价内部版
    public static  String  SCOPE_CHANGE="scope_change";//项目实施范围变更版
    public static  String  COST_CONTROL="cost_control";//项目费用控制目标版
    public static  String  BID_OUT="bid_out";//报价-外部版
    public static  String  CONTRACT_OUT="contract_out";//修订版报价外部版
    public static  String  INDEX_FEASIBILITY_STUDY="index_feasibility_study";//指标-可行性研究版
    public static  String  INDEX_CONCEPT_DESIGN="index_concept_design";//指标-初步设计(含基本设计、详细设计)版
    public static  String  INDEX_CONS_STUDY="index_cons_study";//指标-施工图设计版
    public static  String  INDEX_BID="index_bid";//指标-投标报价版
    public static  String  CONSTRUCTION_BUDGET="construction_budget";//施工图预算版
    public static  String  PROJ_COMPLEMENT="proj_complement";//项目实施版
    public static  String  CONSTRUCTION_COMPLETION="construction_completion";//竣工结算版
    public static  String  CONSULT_FEASIBILITY_STUDY="consult_feasibility_study";//咨询设计-可行性研究版
    public static  String  CONSULT_CONCEPT_DESIGN="consult_concept_design";//咨询设计-初步设计版
    public static  String  CONSULT_CONS_DESIGN="consult_cons_design";//咨询设计-施工图设计版
	
    //造价指标阶段版本
    public static String[] INDEX_TYPE_CODE = {INDEX_FEASIBILITY_STUDY,INDEX_CONCEPT_DESIGN,INDEX_CONS_STUDY,INDEX_BID};
    
	// 内部版
	public static String[] VersionType_In = {BID_IN, CONTRACT_IN, SCOPE_CHANGE, COST_CONTROL};
	// 外部版
	public static String[] VersionType_Out = {BID_OUT, CONTRACT_OUT};
	// 设计咨询类
	public static String[] versionType_Design = {CONSULT_FEASIBILITY_STUDY,CONSULT_CONCEPT_DESIGN,CONSULT_CONS_DESIGN};
	// 承包类
	public static String[] versionType_Contract = {CONSTRUCTION_BUDGET,CONSTRUCTION_COMPLETION,PROJ_COMPLEMENT};
	
	// 项目物料来源code
	public static Integer prjMaterialCode_pbsNode = 0;
	public static Integer prjMaterialCode_materialList = 1;
	public static Integer prjMaterialCode_provided = 2;
	
	// 项目物料最大编号
	public static Integer MAX_PRJMATERIALCODE = 899999;
	
	//角色类型
	public static String SYSROLE = "M";               //系统角色
	public static String PROJECTROLE ="S";            //项目角色
	public static String DUTYROLE ="P" ;              //职能部门角色
	
	//物料搜索——搜索库
	public static int BASEMATERIALREPO = 1;			  //基础物料库
	public static int MODELMATERIALREPO = 2;		  //模板物料库
	public static int PRJMATERIALREPO = 3;			  //项目物料库
	
	//文件操作缓存大小
	public static final int DEFAULT_BUFFER_SIZE = 4096;
	//public static final String COST_CONTROL = null;
	
	//请购申请类型CODE
	public static  String  PUR_SUBPACKAGE="采购分包";
	public static  String  CONST_SUBPACKAGE="施工分包";
	public static  String  DESIGNMAJOR_SUBPACKAGE="设计（专业）分包";
	public static  String  DESIGNLAOWU_SUBPACKAGE="设计（劳务）分包";
	public static  String  OTHER_SUBPACKAGE="管理及其他分包";
	public static  String[] NOT_PROJECT_INTERGRATION = {"固定资产","办公用品","劳保用品",
	    "修理维护","公司经营其他","计算机及相关硬件","专业应用软件","信息化技术服务","研发货物","研发工程","研发服务"}; 
	public static  String  NON_MATERIAL="采购分包（非物资类）";
	public static String PUR_SUBPACKAGE_CHANGE = "采购分包（物料变更）";

	//逻辑运算符
	public static String OPERATOR_AND="and";
	public static String OPERATOR_OR="or";
	//草稿版或者正式版
	public static String FLAG_STATUS_OF_FORMAL="1";//正式版
	public static String FLAG_STATUS_OF_DRAFT="0";//草稿版
	// 附件所属目标类型
	public static Integer AttachmentTarget_PbsNode = 0;
	public static Integer AttachmentTarget_MaterialListDetail = 1;
	public static Integer AttachmentTarget_Notification = 2;
	public static Integer AttachmentTarget_PriceFile = 3;
	public static Integer AttachmentTarget_PurPlan = 4;
	public static Integer AttachmentTarget_ConstructPlan = 5;
	public static Integer AttachmentTarget_DesignPlan = 6;
	public static Integer AttachmentTarget_OtherPlan = 7;
	public static Integer AttachmentTarget_Purreq = 11; //采购申请
	public static Integer AttachmentTarget_ProjectCharge = 12; //项目取费备注
	public static Integer AttachmentTarget_FreeAccrued = 13; //免计提文件

	//WBS 任务phase_code
	//1.预可研
	public static String WBS_PRE_RESEARCH = "预可研";
	//2.可研
	public static String WBS_RESEARCH = "可研";
	//3.项目建议书
	public static String WBS_PROJECTBOOKLET = "项目建议书";
	//4.方案
	public static String WBS_PLAN = "方案";
	//5.初步设计
	public static String WBS_FIRST_DESIGH = "初步设计";
	//6.基本设计
	public static String WBS_BASIC_DESIGH = "基本设计";
	//7.专篇
	public static String WBS_SPECIALCHAPTER = "专篇";
	//8.详细设计
	public static String WBS_DETIAL_DESIGH = "详细设计";
	//9.施工图设计
	public static String WBS_WORK_DESIGH = "施工图设计";
	//10.采购工作
	public static String WBS_PUR_STAGE = "采购阶段";
	//11.施工阶段
	public static String WBS_CONSTRUCT_STAGE = "施工阶段";
	//12.开车阶段
	public static String WBS_DRIVE_STAGE = "开车阶段";
	//98.项目管理
	public static String WBS_PROJECT_MNG = "项目管理";
	//98.项目管理
	public static String WBS_BID_OFFER = "投标报价";
	//98.项目管理
	public static String WBS_RESEARCH_STAGE = "研发阶段";
	
	// 定额人工数据
	public static String[][] QuotaManhourType = {
		{"建筑安装","CONSTRUCT"},
		{"设备安装","EQUIPMENT"},
		{"材料安装","MATERIAL"}
	};
	
	public static Integer OPT_TYPE_COPY = 1;
	public static Integer OPT_TYPE_LEADWBS = 2;
	public static Integer OPT_TYPE_SYN_BUDGET = 3;
	public static Integer OPT_TYPE_SYN_DLV = 4;
	public static Integer OPT_TYPE_PUB_WBS = 5;
	public static Integer OPT_TYPE_SYN_REQ = 6;
	public static Integer OPT_TYPE_SYN_P6 = 7;
	
	//施工、采购、设计和管理及其他分包策划审批状态
	public static Integer SubItemPlan_STATUS_DRAFT=0;//草稿
	public static Integer SubItemPlan_STATUS_CHECKING = 1;//审批中
	public static Integer SubItemPlan_STATUS_CHECKED = 2;//审批完成
	public static Integer SubItemPlan_STATUS_REJECTED = 3;//驳回
	public static Integer SubItemPlan_STATUS_CANCEL = -1;//已取消

	//DEV
	//设计分包
	//public static String PURREQ_CODE_DESIGN = "990203000001";
	//施工分包
//	public static String PURREQ_CODE_CONST = "990204000001";
	//管理及其他
//	public static String PURREQ_CODE_OTHER = "990207000001";
	
	//SIT
	public static String PURREQ_CODE_DESIGN = "990112000480001001";   
	public static String PURREQ_CODE_CONST  = "990207000340001001"; 
	public static String PURREQ_CODE_OTHER  = "999999000320001001";
	
	public static Integer PBSVERSION_STATUS_EDIT = 1; //可编辑版
	public static Integer PBSVERSION_STATUS_NOEDIT = 0; //固化版
	
	public static Integer SYS_MODUL_TYPE_PURREQ = 1; //采购申请模块
	public static Integer SYS_LIMIT_TYPE_PURREQ = 1; //采购管理员权限
	
	//汇总报表导出Excel，模板表头信息
	
	public static String[] QUOTATION_SHEET_TOP2 = {"序号","工程和费用名称","价值(万元)","占投资(%)"};	
	//总报价表
	public static Integer GENERAL_QUOTATION_LEN = 10;//表格数据列数
	public static String[] GENERAL_QUOTATION_SHEET_TOP3 = {"建筑工程费","设备购置费","设备安装费","材料及材料安装费","总价值","美元","折合人民币"};
	//综合报价表-项目报价-外部版
	public static Integer COMPREHENSIVE_QUOTATION_OUTLEN = 8;//表格数据列数
	public static String[] COMPREHENSIVE_QUOTATION_OUT_TOP3 = {"建筑工程费","设备购置费","设备安装费","材料及材料安装费","总价值"};
	//综合报价表-咨询报价阶段各版本
	public static Integer COMPREHENSIVE_QUOTATION_DCLEN= 11;//表格数据列数
	public static String[] COMPREHENSIVE_QUOTATION_DC_TOP2 = {"序号","工程和费用名称","价值(万元)","经济指标","占投资(%)"};
	public static String[] COMPREHENSIVE_QUOTATION_DC_TOP3 = {"建筑工程费","设备购置费","设备安装费","材料及材料安装费","总价值","单位","数量","单位价值(元)"};
	
	//编制价格-物料清单明细汇总导出
	public static String[] colModel_其他={"序号","设备名称","型号及规格","数量","单位","设备费合价(万)","安装费合价(万)","建筑工程费合价(万)","单重(吨)","总重(吨)","电机(kW/台)","电机总数","是否含附属设备","是否公司专利技术","是否进口","装备水平","管理类型","备注"};
	public static String[] colModel_井建 ={"序号","设备名称","型号及规格","数量","单位","设备费合价(万)","安装费合价(万)","建筑工程费合价(万)","长度/高度(m)","支护形式","支护厚度(mm)","净断面积(m2)","掘进断面积(m2)","掘进量(m3)","支护量(m3)","钢材量(t)","装备水平","管理类型","备注"};
	
	public static String MANAGER_1 = "项目经理";
	public static String MANAGER_2 = "项目副经理";
	public static String MANAGER_3 = "设计经理";
	public static String MANAGER_4 = "设计副经理";
	public static String MANAGER_5 = "项目工程师";
	
	public static String GetSeqByIndex(int index){
		String result = "";
		switch (index) {
		case 1:
			result="一";
			break;
		case 2:
			result="二";
			break;
		case 3:
			result="三";
			break;
		case 4:
			result="四";
			break;
		case 5:
			result="五";
			break;
		case 6:
			result="六";
			break;
		case 7:
			result="七";
			break;
		case 8:
			result="八";
			break;
		case 9:
			result="九";
			break;
		case 10:
			result="十";
			break;
		default:
			break;
		}
		return result;
	}
}
