<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.sal.rec.*
	,	chosun.ciis.se.sal.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_sal_1760_a.jsp
* ��� :   �Ǹ� - ������� - ������� - ��꼭 ����
* �ۼ����� : 2009-04-21
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
	SE_SAL_1760_ADataSet ds = (SE_SAL_1760_ADataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;

	formData				= rx.add(root	, "seprsendlist"		, "");
	
	try {
		for(int i = 0; i < ds.sendlist.size(); i++) {
			SE_SAL_1760_ASENDLISTRecord rec = (SE_SAL_1760_ASENDLISTRecord)ds.sendlist.get(i);
			int record = rx.add(formData	, "record"		, "");
			rx.add(record, "col"			, rec.col			);
			rx.add(record, "slip_occr_dt"	, rec.slip_occr_dt	);
			rx.add(record, "slip_occr_cd"	, rec.slip_occr_cd	);
			rx.add(record, "slip_seq"		, rec.slip_seq		);
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
	<SENDLIST>
		<record>
			<col/>
		</record>
	</SENDLIST>
</resData>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<resform>
		<sendlist/>
		<semuro_id/>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Tue Apr 21 18:02:01 KST 2009 */ %>