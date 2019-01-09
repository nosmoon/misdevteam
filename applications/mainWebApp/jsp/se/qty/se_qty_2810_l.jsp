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
* ���ϸ� : se_qty_2810_l.jsp
* ��� :   �μ����� - �߼ۺμ� - �������ں�����μ�
* �ۼ����� : 2009-03-11
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
	SE_QTY_2810_LDataSet ds = (SE_QTY_2810_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_QTY_2810_LCURLISTRecord rec = (SE_QTY_2810_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record"	, "");
			rx.add(record, "issu_dt", rec.issu_dt		);
			rx.add(record, "pcnt"	, rec.pcnt			);
			rx.add(record, "qty"	, rec.qty			);
			rx.add(record, "qty_11"	, rec.qty_11		);
			rx.add(record, "qty_21"	, rec.qty_21		);
			rx.add(record, "qty_31"	, rec.qty_31		);
			rx.add(record, "qty_41"	, rec.qty_41		);
			rx.add(record, "qty_51"	, rec.qty_51		);
			rx.add(record, "qty_61"	, rec.qty_61		);
			rx.add(record, "qty_71"	, rec.qty_71		);
			rx.add(record, "qty_81"	, rec.qty_81		);
			rx.add(record, "qty_91"	, rec.qty_91		);
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
			<qty/>
			<qty_11/>
			<qty_21/>
			<qty_31/>
			<qty_41/>
			<qty_51/>
			<qty_61/>
			<qty_71/>
			<qty_81/>
			<qty_91/>
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

<% /* �ۼ��ð� : Wed Mar 11 21:05:21 KST 2009 */ %>