<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.boi.rec.*
	,	chosun.ciis.se.boi.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_boi_1320_l.jsp
* 기능 : 지국현황조회 - 지국사업자탭 조회
* 작성일자 : 2009-02-06
* 작성자 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_BOI_1320_LDataSet ds = (SE_BOI_1320_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "tab2list", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BOI_1320_LCURLISTRecord rec = (SE_BOI_1320_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.addCData(record, "bo_head_nm", rec.bo_head_nm);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "bizcond", rec.bizcond);
			rx.add(record, "item", rec.item);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "zip", rec.zip);
			rx.add(record, "addr", rec.addr);
			rx.add(record, "presi_nm", rec.presi_nm);
			rx.add(record, "presi_prn", rec.presi_prn);
			rx.add(record, "presi_zip", rec.presi_zip);
			rx.add(record, "presi_addr", rec.presi_addr);
		}
	}
	catch (Exception e) {
	}
	finally {
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
			<area_nm/>
			<bo_nm/>
			<bo_head_nm/>
			<ern/>
			<bizcond/>
			<item/>
			<dlco_nm/>
			<zip/>
			<addr/>
			<presi_nm/>
			<presi_prn/>
			<presi_zip/>
			<presi_addr/>
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

<% /* 작성시간 : Tue Feb 03 10:01:21 KST 2009 */ %>
