<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.rcp.ds.*
	,	chosun.ciis.se.rcp.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_rcp_1320_l.jsp
* 기능 : 대체입금등록 - 하단조회
* 작성일자 : 2009-04-29
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
	SE_RCP_1320_LDataSet ds = (SE_RCP_1320_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "grid2", "");

	try {

		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_RCP_1320_LCURLISTRecord rec = (SE_RCP_1320_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			rx.add(record, "bo_cdseq", rec.bo_cd+rec.bo_seq);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "net_sale_amt", rec.net_sale_amt);
			rx.add(record, "acml_gurt_amt_stot", rec.acml_gurt_amt_stot);
			rx.add(record, "sply_rem_amt", rec.sply_rem_amt);
			rx.add(record, "misuamt", rec.misuamt);
			rx.add(record, "amt1", rec.amt1);
			rx.add(record, "amt2", rec.amt2);
			rx.add(record, "amt3", rec.amt3);
			rx.add(record, "amt4", rec.amt4);
			rx.add(record, "amt5", rec.amt5);
			rx.add(record, "amt6", rec.amt6);
			rx.add(record, "select", "선택");
			rx.add(record, "occr_slip_clsf", rec.occr_slip_clsf);
			rx.add(record, "occr_slip_no", rec.occr_slip_no);
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
			<bo_cd/>
			<bo_seq/>
			<bo_nm/>
			<chrg_pers/>
			<net_sale_amt/>
			<acml_gurt_amt_stot/>
			<sply_rem_amt/>
			<misuamt/>
			<amt1/>
			<amt2/>
			<amt3/>
			<amt4/>
			<amt5/>
			<amt6/>
			<occr_slip_clsf/>
			<occr_slip_no/>
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

<% /* 작성시간 : Wed Apr 29 13:25:20 KST 2009 */ %>