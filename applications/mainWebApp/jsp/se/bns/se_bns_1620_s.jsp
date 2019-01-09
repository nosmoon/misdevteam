<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.bns.rec.*
	,	chosun.ciis.se.bns.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_bns_1620_s.jsp
* ��� :   �Ǹ�-���˹����� - ���˹�����ó��
* �ۼ����� : 2009-04-30
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
	SE_BNS_1620_SDataSet ds = (SE_BNS_1620_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;

	formData				= rx.add(root	, "boinfo"		, "");
	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BNS_1620_SCURLISTRecord rec = (SE_BNS_1620_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "record"	, "");
			rx.add(record, "dept_nm"	, rec.dept_nm	);
			rx.add(record, "part_nm"	, rec.part_nm	);
			rx.add(record, "area_nm"	, rec.area_nm	);
			rx.add(record, "area_cd"	, rec.area_cd	);
			rx.addCData(record, "bo_head_nm"	, rec.bo_head_nm);
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
			<dept_nm/>
			<part_nm/>
			<area_nm/>
			<bo_head_nm/>
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

<% /* �ۼ��ð� : Thu Apr 30 11:29:52 KST 2009 */ %>
