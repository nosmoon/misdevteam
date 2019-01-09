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
* ���ϸ� : se_qty_1000_m.jsp
* ��� : �ϰ�ǥ�̿�ó��-�ʱ�ȭ��
* �ۼ����� : 2009-02-16
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
	SE_QTY_1000_MDataSet ds = (SE_QTY_1000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int initData = 0;
	int comboSet = 0;
	int recordSet = 0;
	comboSet = rx.add(root, "comboSet", "");

	try {
		//�����÷� ���� ��������(�׸��� ��ȸ�� �̸� �����;���)
		rx.add(comboSet, "rownum", ds.rownum);
		
		int medi_cd = rx.add(comboSet, "medi_cd", "");	
		for(int i = 0; i < ds.medilist.size(); i++) {
			SE_QTY_1000_MMEDILISTRecord rec = (SE_QTY_1000_MMEDILISTRecord)ds.medilist.get(i);
			int item = rx.add(medi_cd, "item", "");
			rx.add(item, "value", rec.cd);  			
			rx.add(item, "label", rec.cdnm);		
		}
		int valaplybasiclsf = rx.add(comboSet, "valaplybasiclsf", "");
		for(int i=0; i<ds.valaplybasiclsflist.size(); i++){
			SE_QTY_1000_MVALAPLYBASICLSFLISTRecord rec = (SE_QTY_1000_MVALAPLYBASICLSFLISTRecord)ds.valaplybasiclsflist.get(i);
			int item = rx.add(valaplybasiclsf, "item", "");
			rx.add(item, "value", rec.cd);  			
			rx.add(item, "label", rec.cdnm);		
		}
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
