<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.boi.rec.*
	,	chosun.ciis.se.boi.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_boi_1440_l.jsp
* ��� : ��������ȸ - ������̷��� ��ȸ
* �ۼ����� : 2009-02-06
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
	SE_BOI_1440_LDataSet ds = (SE_BOI_1440_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "tab3form", "");
	resform = rx.add(resData, "dtlgrid1", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BOI_1440_LCURLISTRecord rec = (SE_BOI_1440_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resform, "record", "");
			rx.add(record, "yymm", rec.yymm);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "chrg_nm1", rec.chrg_nm1);
			rx.add(record, "chrg_nm2", rec.chrg_nm2);
			rx.add(record, "chrg_nm3", rec.chrg_nm3);
		}
	}
	catch (Exception e) {
	}
	finally {
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
			<yymm/>
			<chrg_pers/>
			<chrg_nm1/>
			<chrg_nm2/>
			<chrg_nm3/>
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

<% /* �ۼ��ð� : Wed Feb 04 21:26:30 KST 2009 */ %>