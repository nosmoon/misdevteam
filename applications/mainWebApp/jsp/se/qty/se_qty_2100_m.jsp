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
* ���ϸ� : SE_QTY_2100_m.jsp
* ��� : Ư�ǽ�û-�ʱ�ȭ��
* �ۼ����� : 2009-03-04
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
	SE_QTY_2100_MDataSet ds = (SE_QTY_2100_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int initData = 0;
	int comboSet = 0;
	int recordSet = 0;
	int item = 0;
	comboSet = rx.add(root, "initcombo", "");

	try {
		int arvl_clsf = rx.add(comboSet, "arvl_clsf", "");
		for(int i = 0; i < ds.commcdcur1.size(); i++) {
			SE_QTY_2100_MCOMMCDCUR1Record rec = (SE_QTY_2100_MCOMMCDCUR1Record)ds.commcdcur1.get(i);
			item  = rx.add( arvl_clsf , "item" , "");
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", rec.cdnm);
		}
		int sell_clsf = rx.add(comboSet, "sell_clsf", "");
		for(int i = 0; i < ds.commcdcur2.size(); i++) {
			SE_QTY_2100_MCOMMCDCUR2Record rec = (SE_QTY_2100_MCOMMCDCUR2Record)ds.commcdcur2.get(i);
			item  = rx.add( sell_clsf , "item" , "");
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", rec.cdnm);
		}
		int tel_no_1 = rx.add(comboSet, "tel_no_1", "");
		for(int i = 0; i < ds.commcdcur4.size(); i++) {
			SE_QTY_2100_MCOMMCDCUR4Record rec = (SE_QTY_2100_MCOMMCDCUR4Record)ds.commcdcur4.get(i);
			item  = rx.add( tel_no_1 , "item" , "");
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", rec.cd);
		}
		int ptph_no_1 = rx.add(comboSet, "ptph_no_1", "");
		for(int i = 0; i < ds.commcdcur5.size(); i++) {
			SE_QTY_2100_MCOMMCDCUR5Record rec = (SE_QTY_2100_MCOMMCDCUR5Record)ds.commcdcur5.get(i);
			item  = rx.add( ptph_no_1 , "item" , "");
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", rec.cd);
		}
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
