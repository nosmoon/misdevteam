<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.sal.rec.*
	,	chosun.ciis.se.sal.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_sal_1700_m.jsp
* 기능 :   판매 - 지대관리 - 매출관리 - 계산서 발행
* 작성일자 : 2009-04-16
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
	SE_SAL_1700_MDataSet ds = (SE_SAL_1700_MDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;

/*	
	Calendar cal 	= Calendar.getInstance();
	String year 	= String.valueOf(cal.get(cal.YEAR));
	String month 	= String.valueOf(cal.get(cal.MONTH) + 1);
	month			= month.length() == 1 ? "0" + month : month;
	String today	= year + month;
*/
	
	rx.add(root		, "yymm"		, ds.max_yymm		);

	rx.add(root		, "semuro_id"	, ds.semuro_id);
	formData		= rx.add(root		, "comboSet"		, "");
	
	try {
		recordSet	= rx.add(formData	, "sendlist"		, "");
		for(int i = 0; i < ds.sendlist.size(); i++) {
			SE_SAL_1700_MSENDLISTRecord rec = (SE_SAL_1700_MSENDLISTRecord)ds.sendlist.get(i);
			int record = rx.add(recordSet	, "record"		, "");
			rx.add(record, "cd"				, rec.cd			);
			rx.add(record, "cdnm"			, rec.cdnm			);
			rx.add(record, "cd_abrv_nm"		, rec.cd_abrv_nm	);
		}
		
		recordSet	= rx.add(formData	, "gubunlist"		, "");
		for(int i = 0; i < ds.gubunlist.size(); i++) {
			SE_SAL_1700_MGUBUNLISTRecord rec = (SE_SAL_1700_MGUBUNLISTRecord)ds.gubunlist.get(i);
			int record = rx.add(recordSet	, "record"		, "");
			rx.add(record, "cd"				, rec.cd			);
			rx.add(record, "cdnm"			, rec.cdnm			);
			rx.add(record, "cd_abrv_nm"		, rec.cd_abrv_nm	);
		}
		
		recordSet	= rx.add(formData	, "teamlist"		, "");
		for(int i = 0; i < ds.teamlist.size(); i++) {
			SE_SAL_1700_MTEAMLISTRecord rec = (SE_SAL_1700_MTEAMLISTRecord)ds.teamlist.get(i);
			int record = rx.add(recordSet	, "record"		, "");
			rx.add(record, "dept_cd"		, rec.dept_cd		);
			rx.add(record, "dept_nm"		, rec.dept_nm		);
		}
		
		recordSet	= rx.add(formData	, "arealist_temp"	, "");
		for(int i = 0; i < ds.arealist.size(); i++) {
			SE_SAL_1700_MAREALISTRecord rec = (SE_SAL_1700_MAREALISTRecord)ds.arealist.get(i);
			int record = rx.add(recordSet	, "record"		, "");
			rx.add(record, "area_cd"		, rec.area_cd		);
			rx.add(record, "area_nm"		, rec.area_nm		);
			rx.add(record, "dept_cd"		, rec.dept_cd		);
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd	);
		}
		
		recordSet	= rx.add(formData	, "partlist_temp"	, "");
		for(int i = 0; i < ds.partlist.size(); i++) {
			SE_SAL_1700_MPARTLISTRecord rec = (SE_SAL_1700_MPARTLISTRecord)ds.partlist.get(i);
			int record = rx.add(recordSet	, "record"		, "");
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
	<SENDLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</SENDLIST>
</resData>
*/
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
		<sendlist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Thu Apr 16 16:06:52 KST 2009 */ %>