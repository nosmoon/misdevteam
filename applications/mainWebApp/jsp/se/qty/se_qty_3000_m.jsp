<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.qty.rec.*
	,	chosun.ciis.se.qty.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_qty_3000_m.jsp
* 기능 :   부수관리 - 발송부수 - 일일발송부수 증감조회
* 작성일자 : 2009-03-09
* 작성자 : 김대준
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_QTY_3000_MDataSet ds = (SE_QTY_3000_MDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	Calendar cal 	= Calendar.getInstance();
	String year 	= String.valueOf(cal.get(cal.YEAR));
	String month 	= String.valueOf(cal.get(cal.MONTH) + 1);
	month			= month.length() == 1 ? "0" + month : month;
	String day		= String.valueOf(cal.get(cal.DATE));
	day				= day.length() == 1 ? "0" + day : day;
	
	String today	= year + month + day;
	rx.add(root		, "issu_dt"	, today);
	
	formData				= rx.add(root		, "comboSet"			, "");
	try {
		recordSet			= rx.add(formData	, "teamlist"			, "");
		for(int i = 0; i < ds.teamlist.size(); i++) {
			SE_QTY_3000_MTEAMLISTRecord rec = (SE_QTY_3000_MTEAMLISTRecord)ds.teamlist.get(i);
			int record = rx.add(recordSet	, "record"		, "");
			rx.add(record, "dept_cd"		, rec.dept_cd		);
			rx.add(record, "dept_nm"		, rec.dept_nm		);
		}
		
		recordSet			= rx.add(formData	, "arealist_temp"		, "");
		for(int i = 0; i < ds.arealist.size(); i++) {
			SE_QTY_3000_MAREALISTRecord rec = (SE_QTY_3000_MAREALISTRecord)ds.arealist.get(i);
			int record = rx.add(recordSet, "record"			, "");
			rx.add(record, "area_cd"		, rec.area_cd		);
			rx.add(record, "area_nm"		, rec.area_nm		);
			rx.add(record, "dept_cd"		, rec.dept_cd		);
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd	);
		}
		
		recordSet			= rx.add(formData	, "partlist_temp"		, "");
		for(int i = 0; i < ds.partlist.size(); i++) {
			SE_QTY_3000_MPARTLISTRecord rec = (SE_QTY_3000_MPARTLISTRecord)ds.partlist.get(i);
			int record = rx.add(recordSet, "record"			, "");
			rx.add(record, "dept_cd"		, rec.dept_cd		);
			rx.add(record, "dept_nm"		, rec.dept_nm		);
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd	);
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<TEAMLIST>
		<record>
			<dept_cd/>
			<dept_nm/>
		</record>
	</TEAMLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<AREALIST>
		<record>
			<area_cd/>
			<area_nm/>
			<dept_cd/>
			<supr_dept_cd/>
		</record>
	</AREALIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<PARTLIST>
		<record>
			<dept_cd/>
			<dept_nm/>
			<supr_dept_cd/>
		</record>
	</PARTLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<teamlist/>
		<partlist/>
		<arealist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Mon Mar 09 16:15:38 KST 2009 */ %>