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
* ���ϸ� : se_qty_2500_m.jsp
* ��� :  �μ����� - �߼ۺμ� - �뼱���߼ۺμ���Ȳ
* �ۼ����� : 2009-03-06
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
	SE_QTY_2500_MDataSet ds = (SE_QTY_2500_MDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "comboSet"		, "");
	
	try {
		recordSet			= rx.add(formData	, "arealist"		, "");
		for(int i = 0; i < ds.arealist.size(); i++) {
			SE_QTY_2500_MAREALISTRecord rec = (SE_QTY_2500_MAREALISTRecord)ds.arealist.get(i);
			int record = rx.add(recordSet, "record"		, "");
			rx.add(record, "area_cd"		, rec.area_cd	);
			rx.add(record, "area_nm"		, rec.area_nm	);
		}
		
		recordSet			= rx.add(formData	, "curlist"			, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_QTY_2500_MCURLISTRecord rec = (SE_QTY_2500_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record"		, "");
			rx.add(record, "cd"				, rec.cd		);
			rx.add(record, "cdnm"			, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"		, rec.cd_abrv_nm);
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
	<AREALIST>
		<record>
			<area_cd/>
			<area_nm/>
		</record>
	</AREALIST>
</resData>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<CURLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
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
		<arealist/>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Fri Mar 06 10:36:50 KST 2009 */ %>