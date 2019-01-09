<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.info.rec.*
	,	chosun.ciis.hd.info.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INFO_5223_MDataSet ds = (HD_INFO_5223_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_cd_010", ds.getXx_cd_010());
		rx.add(dataSet, "xx_cd_020", ds.getXx_cd_020());
		rx.add(dataSet, "xx_cd_030", ds.getXx_cd_030());
		rx.add(dataSet, "xx_cd_040", ds.getXx_cd_040());
		rx.add(dataSet, "xx_cd_050", ds.getXx_cd_050());
		rx.add(dataSet, "xx_cd_060", ds.getXx_cd_060());
		rx.add(dataSet, "xx_cd_070", ds.getXx_cd_070());
		rx.add(dataSet, "xx_cd_080", ds.getXx_cd_080());
		rx.add(dataSet, "xx_cd_090", ds.getXx_cd_090());
		rx.add(dataSet, "xx_proc_stat_010", ds.getXx_proc_stat_010());
		rx.add(dataSet, "xx_proc_stat_020", ds.getXx_proc_stat_020());
		rx.add(dataSet, "xx_proc_stat_030", ds.getXx_proc_stat_030());
		rx.add(dataSet, "xx_job_clsf_01", ds.getXx_job_clsf_01());
		rx.add(dataSet, "xx_cd_clsf_010", ds.getXx_cd_clsf_010());
		rx.add(dataSet, "xx_cd_clsf_020", ds.getXx_cd_clsf_020());
		
		/****** XX_COMBO_010 BEGIN */
		recordSet = rx.add(dataSet, "XX_COMBO_010", "");

		for(int i = 0; i < ds.xx_combo_010.size(); i++) {
			HD_INFO_5223_MXX_COMBO_010Record rec = (HD_INFO_5223_MXX_COMBO_010Record)ds.xx_combo_010.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.xx_combo_010.size());
		/****** XX_COMBO_010 END */
	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Fri Jan 20 16:27:05 KST 2012 */ %>