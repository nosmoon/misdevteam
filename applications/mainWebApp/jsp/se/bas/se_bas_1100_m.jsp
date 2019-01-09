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

<%
	RwXml rx = new RwXml();
	SE_BAS_1100_MDataSet ds = (SE_BAS_1100_MDataSet)request.getAttribute("ds");
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
			SE_BAS_1100_MTEAMLISTRecord rec = (SE_BAS_1100_MTEAMLISTRecord)ds.teamlist.get(i);
			
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);  		//부서코드
			rx.add(record, "dept_nm", rec.dept_nm);			//부서명
		}
		rx.add(recordSet, "totalcnt", ds.teamlist.size());
		/****** TEAMLIST END */
		
		/****** PARTLIST BEGIN */
		recordSet--;
		recordSet = rx.add(recordSet, "partlist_temp", "");
		
		for(int i = 0; i < ds.partlist.size(); i++) {
			SE_BAS_1100_MPARTLISTRecord rec = (SE_BAS_1100_MPARTLISTRecord)ds.partlist.get(i);
			
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd"		, rec.dept_cd);  		//부서코드
			rx.add(record, "dept_nm"		, rec.dept_nm);			//부서명
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd);	//상위부서코드
		}
		rx.add(recordSet, "totalcnt", ds.partlist.size());
		/****** PARTLIST END */
		
		/****** AREALIST BEGIN */
		recordSet--;
		recordSet = rx.add(recordSet, "arealist_temp", "");
		
		for(int i = 0; i < ds.arealist.size(); i++) {
			SE_BAS_1100_MAREALISTRecord rec = (SE_BAS_1100_MAREALISTRecord)ds.arealist.get(i);
			
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "area_cd"		, rec.area_cd);  		//지역코드
			rx.add(record, "area_nm"		, rec.area_nm);			//지역코드명
			rx.add(record, "dept_cd"		, rec.dept_cd);			//부서코드
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd);    //상위부서코드
		}
		rx.add(recordSet, "totalcnt", ds.arealist.size());
		/****** AREALIST END */
		
		/****** CODELIST BEGIN */
		recordSet = rx.add(root, "codeData2", "");
		recordSet = rx.add(recordSet, "codelist", "");
		recordSet = rx.add(recordSet, "sub", "");
		
		for(int i = 0; i < ds.codelist.size(); i++) {
			SE_BAS_1100_MCORDLISTRecord rec = (SE_BAS_1100_MCORDLISTRecord)ds.codelist.get(i);
			
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);  		//코드
			rx.add(record, "cdnm", rec.cdnm);			//코드
		}
		rx.add(recordSet, "totalcnt", ds.codelist.size());
		/****** CODELIST END */
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