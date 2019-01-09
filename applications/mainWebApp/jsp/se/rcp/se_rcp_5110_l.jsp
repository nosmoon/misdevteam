<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.rcp.rec.*
	,	chosun.ciis.se.rcp.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_rcp_5110_l.jsp
* 기능 :  판매 - 입금관리 - 마감관리 - 전표생성
* 작성일자 : 2009-05-19
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
	SE_RCP_5110_LDataSet ds = (SE_RCP_5110_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_RCP_5110_LCURLISTRecord rec = (SE_RCP_5110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd	);
			rx.add(record, "occr_dt", rec.occr_dt	);
			rx.add(record, "dept_cd", rec.dept_cd	);
			rx.add(record, "dept_nm", rec.dept_nm	);
			rx.add(record, "clos_yn", rec.clos_yn	);
			rx.add(record, "cnt_11"	, rec.cnt_11	);
			rx.add(record, "amt_11"	, rec.amt_11	);
			rx.add(record, "cnt_13"	, rec.cnt_13	);
			rx.add(record, "amt_13"	, rec.amt_13	);
			rx.add(record, "cnt_33"	, rec.cnt_33	);
			rx.add(record, "amt_33"	, rec.amt_33	);
			rx.add(record, "cnt_97"	, rec.cnt_97	);
			rx.add(record, "amt_97"	, rec.amt_97	);
			rx.add(record, "cnt_etc", rec.cnt_etc	);
			rx.add(record, "amt_etc", rec.amt_etc	);
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
	<CURLIST>
		<record>
			<cmpy_cd/>
			<occr_dt/>
			<dept_cd/>
			<dept_nm/>
			<clos_yn/>
			<cnt_11/>
			<amt_11/>
			<cnt_13/>
			<amt_13/>
			<cnt_33/>
			<amt_33/>
			<cnt_97/>
			<amt_97/>
			<cnt_etc/>
			<amt_etc/>
		</record>
	</CURLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<curlist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Tue May 19 13:52:02 KST 2009 */ %>