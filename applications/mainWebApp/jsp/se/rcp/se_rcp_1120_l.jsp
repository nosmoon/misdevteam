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
* ���ϸ� : se_rcp_1120_l.jsp
* ��� : (�������)�Ա���ȯ-������������ ��ȸ
* �ۼ����� : 2009-04-15
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
TrustForm�� Instance ����ο� �����ؼ� ���
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
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<resform>
		<curlist/>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Wed Apr 15 19:09:50 KST 2009 */ %>
