<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.snd.rec.*
	,	chosun.ciis.se.snd.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_snd_1230_l.jsp
* ��� : �Ǹ� - �߼۰��� - �뼱���е�� - �뼱���� ��ȸ
* �ۼ����� : 2009.05.14
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
	SE_SND_1230_LDataSet ds = (SE_SND_1230_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int recordSet 			= 0;

	recordSet				= rx.add(root	, "routelist"		, "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_1230_LCURLISTRecord rec = (SE_SND_1230_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd"		, rec.cd	);
			rx.add(record, "cdnm"	, rec.cdnm	);
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
			<cd/>
			<cdnm/>
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

<% /* �ۼ��ð� : Thu May 14 09:57:00 KST 2009 */ %>