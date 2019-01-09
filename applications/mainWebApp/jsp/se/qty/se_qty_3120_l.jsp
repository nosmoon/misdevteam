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
* ���ϸ� : se_qty_3120_l.jsp
* ��� :   �μ����� - �߼ۺμ� - �߼ۺμ�������Ȳ
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
	SE_QTY_3120_LDataSet ds = (SE_QTY_3120_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;

	formData				= rx.add(root	, "chglist"		, "");
	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_QTY_3120_LCURLISTRecord rec = (SE_QTY_3120_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "record"		, "");
			rx.add(record, "dept_nm"	, rec.dept_nm		);
			rx.add(record, "sub_dept_nm", rec.sub_dept_nm	);
			rx.add(record, "area_nm"	, rec.area_nm		);
			rx.add(record, "bo_nm"		, rec.bo_nm			);
			rx.add(record, "before_qty"	, rec.before_qty	);
			rx.add(record, "qty"		, rec.qty			);
			rx.add(record, "after_qty"	, rec.after_qty		);
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
			<dept_nm/>
			<sub_dept_nm/>
			<area_nm/>
			<bo_nm/>
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

<% /* �ۼ��ð� : Wed Mar 11 13:56:42 KST 2009 */ %>