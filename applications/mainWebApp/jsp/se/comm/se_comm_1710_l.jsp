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
* ���ϸ� : se_comm_1710_l.jsp
* ��� : 
* �ۼ����� : 2009-07-22
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
	SE_COMM_1710_LDataSet ds = (SE_COMM_1710_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_COMM_1710_LCURLISTRecord rec = (SE_COMM_1710_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			rx.add(record, "tax_no", rec.tax_no);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "presi_nm", rec.presi_nm);
			rx.add(record, "suply_amt", rec.suply_amt);
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
			<tax_no/>
			<dlco_nm/>
			<presi_nm/>
			<suply_amt/>
			<vat_amt/>
			<remk/>
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

<% /* �ۼ��ð� : Wed Jul 22 14:03:02 KST 2009 */ %>