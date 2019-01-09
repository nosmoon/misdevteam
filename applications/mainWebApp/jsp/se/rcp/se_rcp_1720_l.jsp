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
* ���ϸ� : se_rcp_1720_l.jsp
* ��� : ����������ȯ�� - �ϴ���ȸ
* �ۼ����� : 2009-05-14
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
	SE_RCP_1720_LDataSet ds = (SE_RCP_1720_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "grid2", "");

	try {
		String tmpVal = "";
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_RCP_1720_LCURLISTRecord rec = (SE_RCP_1720_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			rx.add(record, "bo_cdseq", rec.bo_cd+rec.bo_seq);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "sply_rem_amt", rec.sply_rem_amt);
			rx.add(record, "acct_rcpm_rem_amt", rec.acct_rcpm_rem_amt);
			rx.add(record, "acpt_rcpm_reg_tot_amt", rec.acpt_rcpm_reg_tot_amt);
			tmpVal = rec.amt1;
			rx.add(record, "amt1", tmpVal);
			if("".equals(tmpVal) || "0".equals(tmpVal)) tmpVal = rec.amt2;
			rx.add(record, "amt2", tmpVal);
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
			<sply_rem_amt/>
			<acct_rcpm_rem_amt/>
			<acpt_rcpm_reg_tot_amt/>
			<amt1/>
			<amt2/>
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

<% /* �ۼ��ð� : Thu May 14 19:56:54 KST 2009 */ %>