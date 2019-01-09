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
* ���ϸ� : se_bns_2120_l.jsp
* ��� : ���˹��Աݵ�� - �ϴ���ȸ
* �ۼ����� : 2009-05-18
* �ۼ��� : ��â��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_BNS_2120_LDataSet ds = (SE_BNS_2120_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "grid2", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BNS_2120_LCURLISTRecord rec = (SE_BNS_2120_LCURLISTRecord)ds.curlist.get(i);
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
			rx.add(record, "amt1", rec.amt1);
			rx.add(record, "amt_sum", rec.amt_sum);
			rx.add(record, "rcpm_shet_no", rec.rcpm_shet_no);
			rx.add(record, "select", "����");
			rx.add(record, "rmtt_dt", rec.rmtt_dt);
			rx.add(record, "rmtt_plac", rec.rmtt_plac);
			rx.add(record, "tran_amt", rec.tran_amt);
			rx.add(record, "biz_reg_no", rec.biz_reg_no);
			rx.add(record, "bank_id", rec.bank_id);
			rx.add(record, "acct_num", rec.acct_num);
			rx.add(record, "tran_date_seq", rec.tran_date_seq);
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
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
			<amt1/>
			<amt_sum/>
			<rcpm_shet_no/>
			<rmtt_dt/>
			<rmtt_plac/>
		</record>
	</CURLIST>
</resData>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<resform>
		<curlist/>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Mon May 18 14:04:36 KST 2009 */ %>
