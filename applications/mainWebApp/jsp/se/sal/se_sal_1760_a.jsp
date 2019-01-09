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
* 파일명 : se_sal_1760_a.jsp
* 기능 :   판매 - 지대관리 - 매출관리 - 계산서 발행
* 작성일자 : 2009-04-21
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
	SE_SAL_1760_ADataSet ds = (SE_SAL_1760_ADataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;

	formData				= rx.add(root	, "seprsendlist"		, "");
	
	try {
		for(int i = 0; i < ds.sendlist.size(); i++) {
			SE_SAL_1760_ASENDLISTRecord rec = (SE_SAL_1760_ASENDLISTRecord)ds.sendlist.get(i);
			int record = rx.add(formData	, "record"		, "");
			rx.add(record, "col"			, rec.col			);
			rx.add(record, "slip_occr_dt"	, rec.slip_occr_dt	);
			rx.add(record, "slip_occr_cd"	, rec.slip_occr_cd	);
			rx.add(record, "slip_seq"		, rec.slip_seq		);
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
			<col/>
		</record>
	</SENDLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<sendlist/>
		<semuro_id/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Tue Apr 21 18:02:01 KST 2009 */ %>