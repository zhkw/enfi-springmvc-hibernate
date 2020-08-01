//项目路径
var basePath=$("#basePath").val();

$(function() {
    //初始化表格数据
    initData();

});

function initData(){
    $("#studentTable").datagrid({
        url: basePath+"/zkw/studentDetail",
        width: '99%',
        height:'550',
        idField : "ID",
        loadMsg : '数据加载中,请稍候...',
        border:true,
        pagination : true,
        checkOnSelect:true,
        selectOnCheck:true,
        nowarp : true,
        rownumbers:true,
        columns: [[
            {field: "ID",title: "ID号",width: "6%",halign: "center",align: "left"},
            {field: "NAME",title: "名称",width: "6%",halign: "center"}
        ]],

        });
}