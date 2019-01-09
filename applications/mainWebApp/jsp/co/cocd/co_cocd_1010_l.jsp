<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.co.cocd.rec.*
	,	chosun.ciis.co.cocd.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : co_cocd_1010_l.jsp
* ��� : �����ڵ����-�ڵ屸�� ����Ʈ
* �ۼ����� : 2009-02-09
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
	CO_COCD_1010_LDataSet ds = (CO_COCD_1010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int comboSet = 0;
	//comboSet = rx.add(root, "comboSet", "");

	try {
		//int cd_clsf = rx.add(comboSet, "cd_clsf", "");	
		int cd_clsf = rx.add(root, "cd_clsf", "");
		for(int i = 0; i < ds.commcdcur1.size(); i++) {
			CO_COCD_1010_LCOMMCDCUR1Record rec = (CO_COCD_1010_LCOMMCDCUR1Record)ds.commcdcur1.get(i);
			int record = rx.add(cd_clsf, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cd+" "+StringUtil.replaceToXml(rec.cdnm));
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
