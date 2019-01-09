<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : ss_brinfo_1610_l.jsp
* ��� 	 	 : ����info-�߼۳뼱������ȸ �����뼱����Ʈ
* �ۼ����� 	 : 2004-04-02
* �ۼ��� 	 : ��â��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-03-17
* ������ϸ� : ss_brinfo_1610_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
RwXml rx = new RwXml();
SS_L_BSNSDataSet ds = (SS_L_BSNSDataSet)request.getAttribute("ds");
int root = RwXml.rootNodeID;
int dataSet = 0;
int recordSet = 0;
String errcode = ds.errcode;
String errmsg = ds.errmsg;
dataSet = rx.add(root, "dataSet", "");

try {
	/****** BSNSLIST BEGIN */
	recordSet = rx.add(dataSet, "BSNSLIST", "");

	for(int i = 0; i < ds.bsnslist.size(); i++) {
		SS_L_BSNSBSNSLISTRecord rec = (SS_L_BSNSBSNSLISTRecord)ds.bsnslist.get(i);
		int record = rx.add(recordSet, "record", "");
		rx.add(record, "bocd", rec.bocd);
		rx.add(record, "medicd", rec.medicd);
		rx.add(record, "mcname", rec.mcname);
		rx.add(record, "jbpansu", rec.jbpansu);
		rx.add(record, "jpname", rec.jpname);
		rx.add(record, "inname", rec.inname);
		rx.add(record, "passage", rec.passage);
		rx.add(record, "jbjiorder", rec.jbjiorder);
		rx.add(record, "jiname", rec.jiname);
		rx.add(record, "jbbusu", rec.jbbusu);
		rx.add(record, "jbbalcha", rec.jbbalcha);
		rx.add(record, "jbyetime", rec.jbyetime);
		rx.add(record, "jbdotime", rec.jbdotime);
		//rx.add(record, "bocd", StringUtil.replaceToXml(rec.bocd));
		//rx.add(record, "medicd", StringUtil.replaceToXml(rec.medicd));
		//rx.add(record, "mcname", StringUtil.replaceToXml(rec.mcname));
		//rx.add(record, "jbpansu", StringUtil.replaceToXml(rec.jbpansu));
		//rx.add(record, "jpname", StringUtil.replaceToXml(rec.jpname));
		//rx.add(record, "inname", StringUtil.replaceToXml(rec.inname));
		//rx.add(record, "passage", StringUtil.replaceToXml(rec.passage));
		//rx.add(record, "jbjiorder", StringUtil.replaceToXml(rec.jbjiorder));
		//rx.add(record, "jiname", StringUtil.replaceToXml(rec.jiname));
		//rx.add(record, "jbbusu", StringUtil.replaceToXml(rec.jbbusu));
		//rx.add(record, "jbbalcha", StringUtil.replaceToXml(rec.jbbalcha));
		//rx.add(record, "jbyetime", StringUtil.replaceToXml(rec.jbyetime));
		//rx.add(record, "jbdotime", StringUtil.replaceToXml(rec.jbdotime));
	}
	rx.add(recordSet, "totalcnt", ds.bsnslist.size());
	/****** BSNSLIST END */

}
catch (Exception e) {
	errcode += " JSP Error";
	errmsg += " JSP Error Message = " + e.getMessage();
}
finally {
	rx.add(dataSet, "errcode", errcode);
	rx.add(dataSet, "errmsg", errmsg);
	out.println(rx.xmlFlush());
	out.println(rx.xmlEndFlush());
}

%>
