<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.comm.ds.*
	,	chosun.ciis.se.comm.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_comm_1610_l.jsp
* ��� : ������ǥ��ȸ�˾� - ����Ʈ
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
	SE_COMM_1610_LDataSet ds = (SE_COMM_1610_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	gridData = rx.add(root, "gridData", "");

	try {

		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_COMM_1610_LCURLISTRecord rec = (SE_COMM_1610_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "occr_slip_clsf", rec.occr_slip_clsf);
			rx.add(record, "occr_slip", rec.occr_slip);
			rx.add(record, "occr_dlco_nm", rec.occr_dlco_nm);
			rx.add(record, "occr_amt", rec.occr_amt);
			rx.add(record, "budg_nm", rec.budg_nm);
			//rx.add(record, "proc_clsf", rec.proc_clsf);
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
			<occr_slip_clsf/>
			<occr_slip/>
			<occr_dlco_nm/>
			<occr_amt/>
			<budg_nm/>
			<proc_clsf/>
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

<% /* �ۼ��ð� : Wed Apr 29 15:11:47 KST 2009 */ %>