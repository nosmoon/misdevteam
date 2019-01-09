<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.qty.ds.*
	,	chosun.ciis.se.qty.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_qty_2110_l.jsp
* 기능 : 특판신청 - 신청내역 조회
* 작성일자 : 2009-03-04
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
	SE_QTY_2110_LDataSet ds = (SE_QTY_2110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	gridData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_QTY_2110_LCURLISTRecord rec = (SE_QTY_2110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "reg_dt", rec.reg_dt);
			rx.add(record, "reg_seq", rec.reg_seq);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "qty", rec.qty);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "setl_acct_no", rec.setl_acct_no);
			rx.add(record, "aplc_pers_nm", rec.aplc_pers_nm);
			rx.add(record, "arvl_clsf_nm", rec.arvl_clsf_nm);
			rx.add(record, "stmt_issu_req_yn", rec.stmt_issu_req_yn);
			rx.add(record, "cnfm_stat_clsf_nm", rec.cnfm_stat_clsf_nm);
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
			<reg_dt/>
			<reg_seq/>
			<issu_dt/>
			<medi_nm/>
			<qty/>
			<amt/>
			<setl_acct_no/>
			<aplc_pers_nm/>
			<arvl_clsf_nm/>
			<stmt_issu_req_yn/>
			<cnfm_stat_clsf_nm/>
			<cnfm_msg/>
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

<% /* 작성시간 : Wed Mar 04 16:14:14 KST 2009 */ %>