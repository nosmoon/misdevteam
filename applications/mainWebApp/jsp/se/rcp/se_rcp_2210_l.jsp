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
* 파일명 : se_rcp_2210_l.jsp
* 기능 : 지국별월입금현황 - 리스트 조회
* 작성일자 : 2009-04-22
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
	SE_RCP_2210_LDataSet ds = (SE_RCP_2210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	gridData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_RCP_2210_LCURLISTRecord rec = (SE_RCP_2210_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.addCData(record, "bo_head_nm", rec.bo_head_nm);
			rx.add(record, "cyov_bal", rec.cyov_bal);
			rx.add(record, "net_sale_amt", rec.net_sale_amt);
			rx.add(record, "pdlv_altn_amt", rec.pdlv_altn_amt);
			rx.add(record, "tot_amt", rec.tot_amt);
			rx.add(record, "aigamt", rec.aigamt);
			rx.add(record, "jamt", rec.jamt);
			rx.add(record, "rcpm_rate", rec.rcpm_rate);
			rx.add(record, "fpymt_dt", rec.fpymt_dt);
			rx.add(record, "clos_amt", rec.clos_amt);
			rx.add(record, "fpymt_encur_amt", rec.fpymt_encur_amt);
			rx.add(record, "ajggiw", rec.ajggiw);
			rx.add(record, "ajrgiw", rec.ajrgiw);
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
			<cyov_bal/>
			<net_sale_amt/>
			<tot_amt/>
			<aigamt/>
			<jamt/>
			<rcpm_rate/>
			<fpymt_dt/>
			<clos_amt/>
			<fpymt_encur_amt/>
			<ajggiw/>
			<ajrgiw/>
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

<% /* 작성시간 : Wed Apr 22 20:46:19 KST 2009 */ %>
