<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.sal.ds.*
	,	chosun.ciis.se.sal.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_sal_2537_s.jsp
* ��� : ��꼭�ܰǵ��-����ŷ�ó����ȸ
* �ۼ����� : 2009-07-21
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
	SE_SAL_2537_SDataSet ds = (SE_SAL_2537_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resform = rx.add(root, "dlcoinfo", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SAL_2537_SCURLISTRecord rec = (SE_SAL_2537_SCURLISTRecord)ds.curlist.get(i);
			rx.add(resform, "dlco_no", rec.dlco_no);
			rx.add(resform, "ern", rec.ern);
			rx.addCData(resform, "dlco_nm", rec.dlco_nm);
			rx.addCData(resform, "presi_nm", rec.presi_nm);
			rx.add(resform, "zip_1", rec.zip_1);
			rx.add(resform, "zip_2", rec.zip_2);
			rx.add(resform, "addr", rec.addr);
			rx.add(resform, "dtls_addr", rec.dtls_addr);
			rx.add(resform, "bizcond", rec.bizcond);
			rx.add(resform, "item", rec.item);
			rx.add(resform, "corp_clsf", rec.corp_clsf);
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
			<dlco_no/>
			<ern/>
			<dlco_nm/>
			<presi_nm/>
			<zip_1/>
			<zip_2/>
			<addr/>
			<dtls_addr/>
			<bizcond/>
			<item/>
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

<% /* �ۼ��ð� : Tue Jul 21 14:59:48 KST 2009 */ %>