<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.comm.rec.*
	,	chosun.ciis.se.comm.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_comm_2000_m.jsp
* ��� : �Ǹ� - �߼�ó ��ȸ - �ʱ�ȭ��
* �ۼ����� : 2009.01.29
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
	SE_COMM_2000_MDataSet ds = (SE_COMM_2000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	
	formData = rx.add(root, "initData", "");
	formData = rx.add(formData, "comboSet", "");
	
	try {
		recordSet = rx.add(formData, "arealist", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_COMM_2000_MCURLISTRecord rec = (SE_COMM_2000_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "area_cd", rec.area_cd);
			rx.add(record, "area_nm", rec.area_nm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST>
		<record>
			<area_cd/>
			<area_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Fri Jan 23 09:27:17 KST 2009 */ %>