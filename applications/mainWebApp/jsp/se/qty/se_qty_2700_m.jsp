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
* ���ϸ� : se_qty_2700_m.jsp
* ��� : �μ�������û�����-�ʱ�ȭ��
* �ۼ����� : 2009-06-01
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
	SE_QTY_2700_MDataSet ds = (SE_QTY_2700_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int initData = 0;
	int comboSet = 0;
	int recordSet = 0;
	int item = 0;
	comboSet = rx.add(root, "comboSet", "");

	try {
		int medi_cd = rx.add(comboSet, "medi_cd", "");
		for(int i = 0; i < ds.commcdcur1.size(); i++) {
			SE_QTY_2700_MCOMMCDCUR1Record rec = (SE_QTY_2700_MCOMMCDCUR1Record)ds.commcdcur1.get(i);
			item  = rx.add( medi_cd , "item" , "");
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", rec.cdnm);
		}
		
		int medi_cd1 = rx.add(comboSet, "medi_cd1", "");
		for(int i = 0; i < ds.commcdcur1.size(); i++) {
			SE_QTY_2700_MCOMMCDCUR1Record rec = (SE_QTY_2700_MCOMMCDCUR1Record)ds.commcdcur1.get(i);
			item  = rx.add( medi_cd1 , "item" , "");
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
