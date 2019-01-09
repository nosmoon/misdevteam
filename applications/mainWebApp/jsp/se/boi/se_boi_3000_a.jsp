<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.boi.ds.*
	,	chosun.ciis.se.boi.rec.*
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_boi_3000_a.jsp
* 기능 : 
* 작성일자 : 
* 작성자 : 
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%

	RwXml rx = new RwXml();
	SE_BOI_3000_ADataSet ds = (SE_BOI_3000_ADataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int initData = 0;
	int comboSet = 0;
	int recordSet = 0;
	int item = 0;
	comboSet = rx.add(root, "comboSet", "");

	try {
		recordSet = rx.add(comboSet, "teamlist", "");		
		for(int i = 0; i < ds.teamlist.size(); i++) {
			SE_BOI_3000_ATEAMLISTRecord rec = (SE_BOI_3000_ATEAMLISTRecord)ds.teamlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);  		//부서코드
			rx.add(record, "dept_nm", rec.dept_nm);			//부서명
		}
		recordSet--;
		recordSet = rx.add(comboSet, "partlist_temp", "");
		for(int i = 0; i < ds.partlist.size(); i++) {
			SE_BOI_3000_APARTLISTRecord rec = (SE_BOI_3000_APARTLISTRecord)ds.partlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd"		, rec.dept_cd);  		//부서코드
			rx.add(record, "dept_nm"		, rec.dept_nm);			//부서명
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd);	//상위부서코드
		}
		recordSet--;
		recordSet = rx.add(comboSet, "arealist_temp", "");
		for(int i = 0; i < ds.arealist.size(); i++) {
			SE_BOI_3000_AAREALISTRecord rec = (SE_BOI_3000_AAREALISTRecord)ds.arealist.get(i);
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