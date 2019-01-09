<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.boi.ds.*
	,	chosun.ciis.se.boi.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_boi_3010_l.jsp
* ��� : ����� �������� - ����Ʈ ��ȸ
* �ۼ����� : 2016-06-30
* �ۼ��� : �α�ȫ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_BOI_3010_LDataSet ds = (SE_BOI_3010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "listGrid", "");

	try {
		System.out.println("dssize : "+ds.curlist.size());
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BOI_3010_LCURLISTRecord rec = (SE_BOI_3010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			rx.add(record, "regdt", rec.regdt);
			rx.add(record, "deptnm", rec.deptnm);
			rx.add(record, "partnm", rec.partnm);
			rx.add(record, "areanm", rec.areanm);
			rx.add(record, "bonm", rec.bonm);	
			rx.add(record, "bocd", rec.bocd);
			rx.add(record, "boemp_id", rec.boemp_id);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "chkyn", rec.chkyn);
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>