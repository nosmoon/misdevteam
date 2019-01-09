<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.bas.rec.*
	,	chosun.ciis.se.bas.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_bas_1040_m.jsp
* 기능 : 판매 - 기준정보 - 부서관리 - 팀, 마트 콤보초기화면 
* 작성일자 : 2009.07.11
* 작성자 : 이근탁
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	RwXml rx = new RwXml();
	SE_BAS_1040_MDataSet ds = (SE_BAS_1040_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";

	errcode = (String)ds.errcode;
	errmsg  = (String)ds.errmsg;

	try {
		/****** TEAMLIST BEGIN */
		recordSet = rx.add(root, "codeData", "");
		recordSet = rx.add(recordSet, "teamlist", "");
		
		for(int i = 0; i < ds.teamlist.size(); i++) {
			SE_BAS_1040_MTEAMLISTRecord rec = (SE_BAS_1040_MTEAMLISTRecord)ds.teamlist.get(i);
			
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);  		//부서코드
			rx.add(record, "dept_nm", rec.dept_nm);			//부서명
		}
		rx.add(recordSet, "totalcnt", ds.teamlist.size());
		/****** TEAMLIST END */
		
		/****** PARTLIST BEGIN */
		recordSet--;
		recordSet = rx.add(recordSet, "partlist", "");
		
		for(int i = 0; i < ds.partlist.size(); i++) {
			SE_BAS_1040_MPARTLISTRecord rec = (SE_BAS_1040_MPARTLISTRecord)ds.partlist.get(i);
			
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd"		, rec.dept_cd);  		//부서코드
			rx.add(record, "dept_nm"		, rec.dept_nm);			//부서명
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd);	//상위부서코드
		}
		rx.add(recordSet, "totalcnt", ds.partlist.size());
		/****** PARTLIST END */
	
		
	
		
		
		
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

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<gridData>
	<main>
		<record>
		    <cmpy_cd/>
			<area_cd/>
			<area_nm/>
			<sido_cd/>
			<sido_nm/>
			<chrg_pers/>
			<flnm/>
			<dept_nm/>
		</record>
	</main>
</gridData>

*/
%>

<% /* 작성시간 : Tue Jan 13 18:16:18 KST 2009 */ %>