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
* ���ϸ� : se_rcp_2110_l.jsp
* ��� : �Ա���ǥ��ȸ - ����Ʈ
* �ۼ����� : 2009-05-07
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
	SE_RCP_2110_LDataSet ds = (SE_RCP_2110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	gridData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_RCP_2110_LCURLISTRecord rec = (SE_RCP_2110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "tot_grp", "1");
			rx.add(record, "rcpm_dt", rec.rcpm_dt);
			rx.add(record, "slip_number", rec.slip_number);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "budg_nm1", rec.budg_nm1);
			rx.add(record, "d_amt", rec.d_amt);
			rx.add(record, "budg_nm2", rec.budg_nm2);
			rx.add(record, "c_amt", rec.c_amt);
			rx.add(record, "bank_nm", rec.bank_nm);
			rx.add(record, "rcpm_shet_no", rec.rcpm_shet_no);
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
			<rcpm_dt/>
			<slip_number/>
			<bo_nm/>
			<budg_nm1/>
			<d_amt/>
			<budg_nm2/>
			<c_amt/>
			<bank_nm/>
			<rcpm_shet_no/>
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

<% /* �ۼ��ð� : Thu May 07 17:38:48 KST 2009 */ %>