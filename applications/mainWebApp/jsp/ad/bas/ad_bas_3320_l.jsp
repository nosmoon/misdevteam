<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.bas.rec.*
	,	chosun.ciis.ad.bas.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ad_bas_3320_l.jsp
* ��� : 
* �ۼ����� : 2009-02-18
* �ۼ��� : �����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	AD_BAS_3320_LDataSet ds = (AD_BAS_3320_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	//int resData = rx.add(root, "resData", "");
	//int gridData2 = rx.add(resData, "gridData2", "");
	int gridData2 = rx.add(root, "gridData2", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_3320_LCURLISTRecord rec = (AD_BAS_3320_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData2, "record", "");
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "presi_nm", rec.presi_nm);
			rx.add(record, "zip", rec.zip);
			rx.add(record, "addr", rec.addr);
			rx.add(record, "tel_no", rec.tel_no);
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
			<dlco_abrv_nm/>
			<dlco_no/>
			<ern/>
			<presi_nm/>
			<zip/>
			<addr/>
			<tel_no/>
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

<% /* �ۼ��ð� : Wed Feb 18 10:07:16 KST 2009 */ %>