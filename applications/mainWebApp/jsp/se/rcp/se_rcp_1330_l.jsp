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
* ���ϸ� : se_rcp_1330_l.jsp
* ��� : ��ü�Աݵ�� - �����ȸ
* �ۼ����� : 2009-04-29
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
	SE_RCP_1330_LDataSet ds = (SE_RCP_1330_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "grid2", "");

	try {

		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_RCP_1330_LCURLISTRecord rec = (SE_RCP_1330_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			rx.add(record, "bo_cdseq", rec.bo_cd+rec.bo_seq);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "net_sale_amt", rec.net_sale_amt);
			rx.add(record, "acml_gurt_amt_stot", rec.acml_gurt_amt_stot);
			rx.add(record, "sply_rem_amt", rec.sply_rem_amt);
			rx.add(record, "misuamt", rec.misuamt);
			rx.add(record, "amt1", rec.rcpm_amt);
			rx.add(record, "amt2", rec.cntr_gurt_amt_stot);
			rx.add(record, "amt3", "0");
			rx.add(record, "amt4", "0");
			rx.add(record, "amt5", "0");
			rx.add(record, "amt6", "0");
			rx.add(record, "select", "����");
			rx.add(record, "occr_slip_clsf", "");
			rx.add(record, "occr_slip_no", "");
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
			<net_sale_amt/>
			<acml_gurt_amt_stot/>
			<sply_rem_amt/>
			<misuamt/>
			<rcpm_amt/>
			<cntr_gurt_amt_stot/>
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

<% /* �ۼ��ð� : Wed Apr 29 13:44:00 KST 2009 */ %>