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
* 파일명 : se_boi_1700_m.jsp
* 기능 : 해약관리 - 인수인계처리
* 작성일자 : 2009-05-20
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
	SE_BOI_1700_MDataSet ds = (SE_BOI_1700_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int initData = 0;
	int comboSet = 0;
	int recordSet = 0;
	int item = 0;
	comboSet = rx.add(root, "comboSet", "");

	try {
		recordSet = rx.add(comboSet, "teamlist", "");		
		for(int i = 0; i < ds.team_cdcur.size(); i++) {
			SE_BOI_1700_MTEAM_CDCURRecord rec = (SE_BOI_1700_MTEAM_CDCURRecord)ds.team_cdcur.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);  		//부서코드
			rx.add(record, "dept_nm", rec.dept_nm);			//부서명
		}
		recordSet--;
		recordSet = rx.add(comboSet, "partlist_temp", "");
		for(int i = 0; i < ds.part_cdcur.size(); i++) {
			SE_BOI_1700_MPART_CDCURRecord rec = (SE_BOI_1700_MPART_CDCURRecord)ds.part_cdcur.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd"		, rec.dept_cd);  		//부서코드
			rx.add(record, "dept_nm"		, rec.dept_nm);			//부서명
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd);	//상위부서코드
		}
		recordSet--;
		recordSet = rx.add(comboSet, "arealist_temp", "");
		for(int i = 0; i < ds.area_cdcur.size(); i++) {
			SE_BOI_1700_MAREA_CDCURRecord rec = (SE_BOI_1700_MAREA_CDCURRecord)ds.area_cdcur.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "area_cd"		, rec.area_cd);  		//지역코드
			rx.add(record, "area_nm"		, rec.area_nm);			//지역코드명
			rx.add(record, "dept_cd"		, rec.dept_cd);			//부서코드
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd);    //상위부서코드
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

