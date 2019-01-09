<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.se.rcp.ds.*
	,	chosun.ciis.se.rcp.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_rcp_1010_l.jsp
* 기능 : (가상계좌)입금확인 - 입금내역 조회
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
	SE_RCP_1010_LDataSet ds = (SE_RCP_1010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "tab1list", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_RCP_1010_LCURLISTRecord rec = (SE_RCP_1010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			rx.add(record, "cnfm_yn", rec.cnfm_yn);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "bo_cdseq", rec.bo_cd+rec.bo_seq);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "chrg_flnm", rec.chrg_flnm);
			rx.addCData(record, "bo_head_nm", rec.bo_head_nm);
			rx.add(record, "biz_reg_no", rec.biz_reg_no);
			rx.add(record, "bank_id", rec.bank_id);
			rx.add(record, "acct_num", rec.acct_num);
			rx.add(record, "tran_date", rec.tran_date);
			rx.add(record, "tran_date_seq", rec.tran_date_seq);
			rx.add(record, "tran_time", rec.tran_time);
			rx.add(record, "rcpm_pers", rec.rcpm_pers);
			rx.add(record, "acct_no", rec.acct_no);
			rx.add(record, "tran_amt", rec.tran_amt);
			rx.add(record, "cntr_stat_nm", rec.cntr_stat_nm);
			rx.add(record, "rcpm_cnfm_dt", rec.rcpm_cnfm_dt);
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
			<cnfm_yn/>
			<area_nm/>
			<bo_nm/>
			<chrg_flnm/>
			<bo_head_nm/>
			<rcpm_dt/>
			<rcpm_tm/>
			<rcpm_pers/>
			<acct_no/>
			<rcpm_amt/>
			<cntr_stat_nm/>
			<rcpm_cnfm_dt/>
			<cnfm_pers_nm/>
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

<% /* 작성시간 : Wed Apr 15 19:07:39 KST 2009 */ %>
