<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.appmt.rec.*
	,	chosun.ciis.hd.appmt.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_APPMT_1009_MDataSet ds = (HD_APPMT_1009_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_caption40", ds.getXx_caption40());
		rx.add(dataSet, "xx_job_clsf_01", ds.getXx_job_clsf_01());
		rx.add(dataSet, "xx_cd_clsf_010", ds.getXx_cd_clsf_010());
		rx.add(dataSet, "xx_cd_010", ds.getXx_cd_010());
		rx.add(dataSet, "xx_cd_020", ds.getXx_cd_020());
		rx.add(dataSet, "xx_cd_030", ds.getXx_cd_030());
		rx.add(dataSet, "xx_cd_040", ds.getXx_cd_040());
		rx.add(dataSet, "xx_cd_050", ds.getXx_cd_050());
		rx.add(dataSet, "xx_mang_cd_5", ds.getXx_mang_cd_5());
		
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "non_tax_clsf", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_APPMT_1009_MCURLISTRecord rec = (HD_APPMT_1009_MCURLISTRecord)ds.curlist.get(i);
			
		//	if(rec.getCd().equals("10")){ //관리자카드
		//		recordSet = rx.add(dataSet, "XX_NON_TAX_LIST_1", "");
		//	} else if (rec.getCd().equals("20")) { //취재카드
		//		recordSet = rx.add(dataSet, "XX_NON_TAX_LIST_2", "");
		//	} else if (rec.getCd().equals("30")) { //주유카드
		//		recordSet = rx.add(dataSet, "XX_NON_TAX_LIST_3", "");
		//	}
			
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd_type", rec.cd_type);
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cd_type", StringUtil.replaceToXml(rec.cd_type));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */
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

<% /* 작성시간 : Thu Jan 26 11:01:10 KST 2012 */ %>