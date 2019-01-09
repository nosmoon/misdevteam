<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.etc.rec.*
	,	chosun.ciis.se.etc.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_etc_1000_m.jsp
* 기능 :  판매-기타관리-확장수당등록
* 작성일자 : 2009-03-02
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
	SE_ETC_1000_MDataSet ds = (SE_ETC_1000_MDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	Calendar cal 	= Calendar.getInstance();
	String year 	= String.valueOf(cal.get(cal.YEAR));
	String month 	= String.valueOf(cal.get(cal.MONTH) + 1);
	month			= month.length() == 1 ? "0" + month : month;

	//-1 월
	cal.add(cal.MONTH,-1);

	String year2	=	String.valueOf(cal.get(cal.YEAR));
	String month2	=	String.valueOf(cal.get(cal.MONTH) + 1);
	month2			=	month2.length() == 1 ? "0" + month2 : month2;

	String fr_yymm	= year2 + month2;
	String to_yymm	= year + month;

	rx.add(root		, "bgn_yymm"	, fr_yymm);
	rx.add(root		, "end_yymm"	, to_yymm);

	formData				= rx.add(root		, "comboSet"		, "");
	try {
		recordSet			= rx.add(formData	, "curlist"			, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_ETC_1000_MCURLISTRecord rec = (SE_ETC_1000_MCURLISTRecord)ds.curlist.get(i);
			int record 		= rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd"	, rec.dept_cd);
			rx.add(record, "dept_nm"	, rec.dept_nm);
		}
		
		recordSet			= rx.add(formData	, "banklist"		, "");
		for(int i = 0; i < ds.banklist.size(); i++) {
			SE_ETC_1000_MBANKLISTRecord rec = (SE_ETC_1000_MBANKLISTRecord)ds.banklist.get(i);
			int record = rx.add(recordSet, "record"	, "");
			rx.add(record, "cd"			, rec.cd		);
			rx.add(record, "cdnm"		, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
		}
		
		recordSet			= rx.add(formData	, "mthdlist"		, "");
		for(int i = 0; i < ds.mthdlist.size(); i++) {
			SE_ETC_1000_MMTHDLISTRecord rec = (SE_ETC_1000_MMTHDLISTRecord)ds.mthdlist.get(i);
			int record = rx.add(recordSet, "record"	, "");
			rx.add(record, "cd"			, rec.cd		);
			rx.add(record, "cdnm"		, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
		}
		
		recordSet			= rx.add(formData	, "objlist"			, "");
		for(int i = 0; i < ds.objlist.size(); i++) {
			SE_ETC_1000_MOBJLISTRecord rec = (SE_ETC_1000_MOBJLISTRecord)ds.objlist.get(i);
			int record = rx.add(recordSet, "record"	, "");
			rx.add(record, "cd"			, rec.cd		);
			rx.add(record, "cdnm"		, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
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
	<DECIDLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</DECIDLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<CURLIST>
		<record>
			<dept_cd/>
			<dept_nm/>
		</record>
	</CURLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<BANKLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</BANKLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<MTHDLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</MTHDLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<OBJLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</OBJLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<curlist/>
		<mthdlist/>
		<objlist/>
		<decidlist/>
		<banklist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Mon Mar 02 15:29:40 KST 2009 */ %>