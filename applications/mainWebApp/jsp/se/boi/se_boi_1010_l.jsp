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
* 파일명 : se_boi_1010_l.jsp
* 기능 : 지국정보관리 - 지국리스트 조회
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
	SE_BOI_1010_LDataSet ds = (SE_BOI_1010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	dataSet = rx.add(root, "bolistData", "");

	try {

		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BOI_1010_LCURLISTRecord rec = (SE_BOI_1010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "part_nm", rec.part_nm);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "bo_cd", rec.bo_cd+rec.bo_seq);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.addCData(record, "bo_head_nm", rec.bo_head_nm);
			rx.add(record, "bo_head_prn", rec.bo_head_prn);
			rx.add(record, "chrg_flnm", rec.chrg_flnm);
			rx.add(record, "bo_telno", rec.bo_telno);
			rx.add(record, "bo_cntr_dt", rec.bo_cntr_dt);
			rx.add(record, "cntr_statnm", rec.cntr_statnm);
			rx.add(record, "bo_reg_clsf", rec.bo_reg_clsf);
			rx.add(record, "bo_reg_clsf_nm", rec.bo_reg_clsf_nm);
			rx.add(record, "ern", rec.ern);
			
		}

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
