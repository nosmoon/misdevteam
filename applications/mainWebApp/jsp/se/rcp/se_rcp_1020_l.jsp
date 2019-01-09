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
* 파일명 : se_rcp_1020_l.jsp
* 기능 : (가상계좌)입금확인 - 총입금액 조회
* 작성일자 : 2009-04-15
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
	SE_RCP_1020_LDataSet ds = (SE_RCP_1020_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "tab2list", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_RCP_1020_LCURLISTRecord rec = (SE_RCP_1020_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "chrg_flnm", rec.chrg_flnm);
			rx.addCData(record, "bo_head_nm", rec.bo_head_nm);
			rx.add(record, "vitl_acct_no", rec.vitl_acct_no);
			rx.add(record, "acct_rcpm_cnfm_tot_amt", rec.acct_rcpm_cnfm_tot_amt);
			rx.add(record, "acct_rcpm_reg_tot_amt", rec.acct_rcpm_reg_tot_amt);
			rx.add(record, "rem_amt", rec.rem_amt);
			rx.add(record, "cntr_stat_nm", rec.cntr_stat_nm);
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
			<area_nm/>
			<bo_nm/>
			<chrg_flnm/>
			<bo_head_nm/>
			<vitl_acct_no/>
			<acct_rcpm_cnfm_tot_amt/>
			<acct_rcpm_reg_tot_amt/>
			<rem_amt/>
			<cntr_stat_nm/>
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

<% /* 작성시간 : Wed Apr 15 20:17:04 KST 2009 */ %>
