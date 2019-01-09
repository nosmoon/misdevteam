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
* 파일명 : se_rcp_1110_l.jsp
* 기능 : (가상계좌)입금전환-전환내역 조회
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
	SE_RCP_1110_LDataSet ds = (SE_RCP_1110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "mainlist", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_RCP_1110_LCURLISTRecord rec = (SE_RCP_1110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			rx.add(record, "area_cd", rec.area_cd);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "acpt_bo_nm", rec.acpt_bo_nm);
			rx.add(record, "chrg_flnm", rec.chrg_flnm);
			rx.add(record, "swit_dt", rec.swit_dt);
			rx.add(record, "swit_seq", rec.swit_seq);
			rx.add(record, "acct_bal", rec.acct_bal);
			rx.add(record, "acpt_trsf_amt", rec.acpt_trsf_amt);
			rx.add(record, "cnfm_yn", rec.cnfm_yn);
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
			<acpt_clsf_nm/>
			<swit_dt/>
			<acct_bal/>
			<acpt_trsf_amt/>
			<cnfm_yn/>
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

<% /* 작성시간 : Wed Apr 15 19:09:30 KST 2009 */ %>