<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.boi.ds.*
	,	chosun.ciis.se.boi.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_boi_1056_l.jsp
* ��� : ������������ - ���������� ���� ������ȸ
* �ۼ����� : 2009-03-24
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
	SE_BOI_1056_LDataSet ds = (SE_BOI_1056_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "tabgrid1", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BOI_1056_LCURLISTRecord rec = (SE_BOI_1056_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			rx.add(record, "vexc_mang_pers", rec.vexc_mang_pers);
			rx.add(record, "empno", rec.empno);
			rx.add(record, "nm", rec.nm);
			rx.add(record, "boks_team_nm", rec.boks_team_nm);
			rx.add(record, "remk", rec.remk);
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
			<vexc_mang_pers/>
			<emp_no/>
			<nm/>
			<offi_real_hdqtboks_nm/>
			<boks_team_nm/>
			<part_nm/>
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

<% /* �ۼ��ð� : Tue Mar 24 15:40:53 KST 2009 */ %>