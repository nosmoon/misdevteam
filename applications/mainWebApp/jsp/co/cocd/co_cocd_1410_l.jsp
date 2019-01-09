<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,   chosun.ciis.co.base.util.*
	,	chosun.ciis.co.cocd.rec.*
	,	chosun.ciis.co.cocd.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : co_cocd_1410_l.jsp
* ��� : ���α׷��ڵ��˾�-�����ȸ
* �ۼ����� : 2012-01-10
* �ۼ��� : �ӽº�
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	CO_COCD_1410_LDataSet ds = (CO_COCD_1410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData", "");
 
	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			CO_COCD_1410_LCURLISTRecord rec = (CO_COCD_1410_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));

		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
