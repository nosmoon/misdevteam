<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.as.test.rec.*
	,	chosun.ciis.as.test.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : mt_commatr_5010_l.jsp
* ��� : 
* �ۼ����� : 2010-04-12
* �ۼ��� : �̹�ȿ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	AS_TEST_1002_LDataSet ds = (AS_TEST_1002_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "src", "");
	//resform = rx.add(resData, "resform", "");

	try {
	
		for(int i = 0; i < ds.curlist.size(); i++) {
			AS_TEST_1002_LCURLISTRecord rec = (AS_TEST_1002_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			
			rx.addCData(record, "dev_src", rec.dev_src);			
			rx.addCData(record, "real_src", rec.real_src);
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
			<medi_cd/>
			<issu_dt/>
			<fac_clsf/>
			<fac_nm/>
			<issu_pcnt_0100/>
			<issu_pcnt_0200/>
			<issu_pcnt_9999/>
			<issu_pcnt/>
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

<% /* �ۼ��ð� : Mon Apr 12 11:27:07 KST 2010 */ %>