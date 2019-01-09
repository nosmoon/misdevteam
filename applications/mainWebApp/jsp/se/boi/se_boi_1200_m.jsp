<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.boi.rec.*
	,	chosun.ciis.se.boi.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_boi_1200_m.jsp
* ��� : �����ּ��ϰ����� - �ʱ�ȭ��
* �ۼ����� : 2009-02-06
* �ۼ��� : ��â��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_BOI_1200_MDataSet ds = (SE_BOI_1200_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int initData = 0;
	int comboSet = 0;
	int item = 0;
	comboSet = rx.add(root, "comboSet", "");

	try {
		int area_cd = rx.add(comboSet, "area_cd", "");
	
		for(int i = 0; i < ds.area_cdcur.size(); i++) {
			SE_BOI_1200_MAREA_CDCURRecord rec = (SE_BOI_1200_MAREA_CDCURRecord)ds.area_cdcur.get(i);
			
			item  = rx.add( area_cd , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+"  "+rec.cdnm);
		}

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
	<AREA_CDCUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</AREA_CDCUR>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Fri Jan 30 13:31:47 KST 2009 */ %>