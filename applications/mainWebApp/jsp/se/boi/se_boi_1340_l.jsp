<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.boi.rec.*
	,	chosun.ciis.se.boi.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_boi_1340_l.jsp																		 
* 기능 : 지국관리 - 지국현황조회																							 
* 작성일자 : 2009-02-06																				 
* 작성자 : 배창희																					 
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :																						 
* 수정자 :																							 
* 수정일자 :																						 
* 백업파일명 :																						 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_BOI_1340_LDataSet ds = (SE_BOI_1340_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "tab4list", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BOI_1340_LCURLISTRecord rec = (SE_BOI_1340_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.addCData(record, "bo_head_nm", rec.bo_head_nm);
			rx.add(record, "cntr_stat_nm", rec.cntr_stat_nm);
			rx.add(record, "leas_cntr_dt", rec.leas_cntr_dt);
			rx.add(record, "midw_expy_dt", rec.midw_expy_dt);
			rx.add(record, "cntr_leas_amt", rec.cntr_leas_amt);
			rx.add(record, "cntr_mang_amt", rec.cntr_mang_amt);
			rx.add(record, "cntr_gurt_amt", rec.cntr_gurt_amt);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

