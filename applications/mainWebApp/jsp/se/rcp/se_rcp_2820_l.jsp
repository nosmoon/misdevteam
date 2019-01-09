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
* 파일명 : se_rcp_2820_l.jsp
* 기능 :  판매 - 입금관리 - 지대입금관리 - 보증인채무통보
* 작성일자 : 2009-04-27
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
	SE_RCP_2820_LDataSet ds = (SE_RCP_2820_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;

	formData				= rx.add(root	, "gurtlist"		, "");
	try {
		for(int i = 0; i < ds.gurtlist.size(); i++) {
			SE_RCP_2820_LCURLISTRecord rec = (SE_RCP_2820_LCURLISTRecord)ds.gurtlist.get(i);
			int record = rx.add(formData	, "record"		, "");
			rx.add(record, "bo_nm"			, rec.bo_nm			);
			rx.addCData(record, "bo_head_nm"		, rec.bo_head_nm	);
			rx.add(record, "gurt_pers_flnm"	, rec.gurt_pers_flnm);
			rx.add(record, "zip"			, rec.zip			);
			rx.add(record, "tel"			, rec.tel			);
			rx.add(record, "addr"			, rec.addr			);
			rx.add(record, "dtls_addr"		, rec.dtls_addr		);
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
			<bo_nm/>
			<bo_head_nm/>
			<gurt_pers_flnm/>
			<zip/>
			<tel/>
			<addr/>
			<dtls_addr/>
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

<% /* 작성시간 : Mon Apr 27 14:30:07 KST 2009 */ %>
