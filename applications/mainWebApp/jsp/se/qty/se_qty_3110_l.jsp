<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.qty.rec.*
	,	chosun.ciis.se.qty.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_qty_3110_l.jsp
* ��� :   �μ����� - �߼ۺμ� - �߼ۺμ�������Ȳ
* �ۼ����� : 2009-03-10
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
	SE_QTY_3110_LDataSet ds = (SE_QTY_3110_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_QTY_3110_LCURLISTRecord rec = (SE_QTY_3110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record"				, "");
			rx.add(record, "issu_dt"		, rec.issu_dt			);
			rx.add(record, "before_qty"		, rec.before_qty		);
			rx.add(record, "qty"			, rec.qty				);
			rx.add(record, "after_qty"		, rec.after_qty			);
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
			<issu_dt/>
			<before_qty/>
			<qty/>
			<after_qty/>
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

<% /* �ۼ��ð� : Tue Mar 10 21:14:10 KST 2009 */ %>