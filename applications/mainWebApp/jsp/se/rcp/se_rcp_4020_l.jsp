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
* ���ϸ� : se_rcp_4020_l.jsp
* ��� : �������Աݵ�� - �Աݳ�����ȸ
* �ۼ����� : 2009-05-08
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
	SE_RCP_4020_LDataSet ds = (SE_RCP_4020_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "grid2", "");
	int rcpmlist = rx.add(resData, "rcpmlist", "");
	String sBank_cd = "";
	String sRmtt_dt = "";
	String sRmtt_plac = "";
	long lAmt_tot = 0L;
	String sAmt_tmp = "";

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_RCP_4020_LCURLISTRecord rec = (SE_RCP_4020_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(rcpmlist, "record", "");
			rx.add(record, "bo_cdseq", rec.bo_cd+rec.bo_seq);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "net_sale_amt", rec.net_sale_amt);
			rx.add(record, "sp_amt", rec.sp_amt);
			rx.add(record, "amt1", rec.amt1);
			rx.add(record, "amt2", rec.amt2);
			rx.add(record, "amt3", rec.amt3);
			sAmt_tmp = rec.amt_tot;
			if("".equals(sAmt_tmp)) sAmt_tmp = "0";
			rx.add(record, "amt_tot", sAmt_tmp);
			lAmt_tot = lAmt_tot + Long.parseLong(sAmt_tmp);
			if(Long.parseLong(sAmt_tmp) > 0){
				sBank_cd = rec.bank_cd;
				sRmtt_dt = rec.rmtt_dt;
				sRmtt_plac = rec.rmtt_plac;
			}
		}
		rx.add(resData, "bank_cd", sBank_cd);
		rx.add(resData, "rmtt_dt", sRmtt_dt);
		rx.add(resData, "rmtt_plac", sRmtt_plac);
		rx.add(resData, "tot_amt", lAmt_tot);
		
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
			<net_sale_amt/>
			<sp_amt/>
			<amt1/>
			<amt2/>
			<amt3/>
			<amt_tot/>
			<bank_cd/>
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

<% /* �ۼ��ð� : Fri May 08 15:32:02 KST 2009 */ %>