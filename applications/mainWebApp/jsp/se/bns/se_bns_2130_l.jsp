<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.bns.ds.*
	,	chosun.ciis.se.bns.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_bns_2130_l.jsp
* 기능 : 판촉물입금등록 - 대상조회
* 작성일자 : 2009-05-18
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
	SE_BNS_2130_LDataSet ds = (SE_BNS_2130_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "grid2", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BNS_2130_LCURLISTRecord rec = (SE_BNS_2130_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			rx.add(record, "bo_cdseq", rec.bo_cd+rec.bo_seq);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.addCData(record, "bo_head_nm", rec.bo_head_nm);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "bns_item_cd", rec.bns_item_cd);
			rx.add(record, "bns_item_nm", rec.bns_item_nm);
			rx.add(record, "divn_dt", rec.divn_dt);
			rx.add(record, "ewh_seq", rec.ewh_seq);
			rx.add(record, "bal", rec.bal);
			rx.add(record, "acct_rcpm_rem_amt", rec.acct_rcpm_rem_amt);
			rx.add(record, "acpt_rcpm_reg_tot_amt", rec.acpt_rcpm_reg_tot_amt);
			rx.add(record, "amt1", "0");
			rx.add(record, "amt_sum", rec.bal);
			rx.add(record, "select", "선택");
			rx.add(record, "rmtt_dt", rec.rmtt_dt);
			rx.add(record, "rmtt_plac", rec.rmtt_plac);
			rx.add(record, "rcpm_shet_no", "");
			rx.add(record, "tran_amt", "");
			rx.add(record, "biz_reg_no", "");
			rx.add(record, "bank_id", "");
			rx.add(record, "acct_num", "");
			rx.add(record, "tran_date_seq", "");
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
			<bns_item_cd/>
			<bns_item_nm/>
			<divn_dt/>
			<ewh_seq/>
			<bal/>
			<acct_rcpm_rem_amt/>
			<acpt_rcpm_reg_tot_amt/>
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

<% /* 작성시간 : Mon May 18 14:05:18 KST 2009 */ %>
