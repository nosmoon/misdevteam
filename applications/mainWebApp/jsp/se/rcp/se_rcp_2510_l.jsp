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
* 파일명 : se_rcp_2510_l.jsp
* 기능 : 
* 작성일자 : 2009-04-24
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
	SE_RCP_2510_LDataSet ds = (SE_RCP_2510_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	gridData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_RCP_2510_LCURLISTRecord rec = (SE_RCP_2510_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "part_nm", rec.part_nm);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "bo_cd", rec.bo_cd);
			rx.add(record, "bo_seq", rec.bo_seq);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.addCData(record, "bo_head_nm", rec.bo_head_nm);
			rx.add(record, "cyov_bal", rec.cyov_bal);
			rx.add(record, "net_sale_amt", rec.net_sale_amt);
			rx.add(record, "today_amt", rec.today_amt);
			rx.add(record, "pdlv_altn_amt", rec.pdlv_altn_amt);
			rx.add(record, "acml_amt", rec.acml_amt);
			rx.add(record, "bal_amt", rec.bal_amt);
			rx.add(record, "rcpm_rate", rec.rcpm_rate);
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
			<dept_nm/>
			<part_nm/>
			<area_nm/>
			<bo_nm/>
			<cyov_bal/>
			<net_sale_amt/>
			<today_amt/>
			<acml_amt/>
			<bal_amt/>
			<rcpm_rate/>
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

<% /* 작성시간 : Fri Apr 24 10:55:16 KST 2009 */ %>
