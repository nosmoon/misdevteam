<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.bns.rec.*
	,	chosun.ciis.se.bns.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_bns_1110_l.jsp
* 기능 : 
* 작성일자 : 2009-03-11
* 작성자 : 이민효
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_BNS_1110_LDataSet ds = (SE_BNS_1110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "bnsData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BNS_1110_LCURLISTRecord rec = (SE_BNS_1110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			rx.add(record, "bitem_cd", rec.bns_item_cd);
			rx.add(record, "bitem_nm", rec.bns_item_nm);
			rx.add(record, "bitem_clas", rec.bns_item_clas);
			rx.add(record, "uprc", rec.uprc);
			rx.add(record, "divn_uprc", rec.divn_uprc);
			rx.add(record, "use_yn", rec.use_yn);
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
			<bns_item_clas/>
			<uprc/>
			<divn_uprc/>
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

<% /* 작성시간 : Wed Mar 11 21:28:16 KST 2009 */ %>