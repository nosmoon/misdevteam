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
* 파일명 : se_rcp_1120_l.jsp
* 기능 : (가상계좌)입금전환-선택지국정보 조회
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
	SE_RCP_1120_LDataSet ds = (SE_RCP_1120_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resform = rx.add(root, "resform", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_RCP_1120_LCURLISTRecord rec = (SE_RCP_1120_LCURLISTRecord)ds.curlist.get(i);
			rx.add(resform, "bo_nm", rec.bo_nm);
			rx.add(resform, "area_nm", rec.area_nm);
			rx.addCData(resform, "bo_head_nm", rec.bo_head_nm);
			rx.add(resform, "acct_rcpm_cnfm_tot_amt", rec.acct_rcpm_cnfm_tot_amt);
			rx.add(resform, "acct_rcpm_reg_tot_amt", rec.acct_rcpm_reg_tot_amt);
			rx.add(resform, "acct_rcpm_rem_amt", rec.acct_rcpm_rem_amt);
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
			<area_nm/>
			<bo_head_nm/>
			<acct_rcpm_cnfm_tot_amt/>
			<acct_rcpm_reg_tot_amt/>
			<acct_rcpm_rem_amt/>
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

<% /* 작성시간 : Wed Apr 15 19:09:50 KST 2009 */ %>
