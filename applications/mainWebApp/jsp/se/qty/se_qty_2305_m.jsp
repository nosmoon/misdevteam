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
* ���ϸ� : se_qty_2300_m.jsp
* ��� : ���������μ�����-�߼ۼ��� �˾� �ʱ�
* �ۼ����� : 2009-03-10
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
	SE_QTY_2305_MDataSet ds = (SE_QTY_2305_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int initData = 0;
	int comboSet = 0;
	int recordSet = 0;
	int item = 0;
	comboSet = rx.add(root, "comboSet", "");

	try {
		int route_clsf = rx.add(comboSet, "route_clsf", "");
		for(int i = 0; i < ds.commcdcur1.size(); i++) {
			SE_QTY_2305_MCOMMCDCUR1Record rec = (SE_QTY_2305_MCOMMCDCUR1Record)ds.commcdcur1.get(i);
			item  = rx.add( route_clsf , "item" , "");
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
