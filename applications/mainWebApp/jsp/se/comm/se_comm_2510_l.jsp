<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.comm.rec.*
	,	chosun.ciis.se.comm.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_comm_2510_l.jsp
* 기능 :   발송관리 - 섹션조회
* 작성일자 : 2009-06-10
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
	SE_COMM_2510_LDataSet ds = (SE_COMM_2510_LDataSet)request.getAttribute("ds");
	int root 					= RwXml.rootNodeID;
	int formData 				= 0;
	
	formData					= rx.add(root	,	"gridData"	, "");
	try {
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_COMM_2510_LCURLISTRecord rec = (SE_COMM_2510_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "record"	, "");
			rx.add(record, "sect_cd"	, rec.sect_cd	);
			rx.addCData(record, "sect_nm"		, rec.sect_nm	);
			rx.addCData(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
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
			<bns_item_cd/>
			<bns_item_nm/>
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

<% /* 작성시간 : Tue Apr 28 14:55:09 KST 2009 */ %>