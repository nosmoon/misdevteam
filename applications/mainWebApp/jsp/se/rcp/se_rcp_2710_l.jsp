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
* 파일명 : se_rcp_2710_l.jsp
* 기능 : 보증금현황 - 내역조회
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
	SE_RCP_2710_LDataSet ds = (SE_RCP_2710_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	gridData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_RCP_2710_LCURLISTRecord rec = (SE_RCP_2710_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "tot_grp", "1");
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "part_nm", rec.part_nm);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "bo_cd", rec.bo_cd);
			rx.addCData(record, "bo_head_nm", rec.bo_head_nm);
			rx.add(record, "pr_cntr_gurt_amt_stot", rec.pr_cntr_gurt_amt_stot);
			rx.add(record, "acml_trgt_amt", rec.acml_trgt_amt);
			rx.add(record, "cr_rcpm_amt", rec.cr_rcpm_amt);
			rx.add(record, "cr_cntr_gurt_amt_stot", rec.cr_cntr_gurt_amt_stot);
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
			<bo_head_nm/>
			<pr_cntr_gurt_amt_stot/>
			<acml_trgt_amt/>
			<cr_rcpm_amt/>
			<cr_cntr_gurt_amt_stot/>
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

<% /* 작성시간 : Fri Apr 24 10:56:44 KST 2009 */ %>
