<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.duty.rec.*
	,	chosun.ciis.hd.duty.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DUTY_1401_LDataSet ds = (HD_DUTY_1401_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	int depth1		= 0;
	int record = 0;
	dataSet = rx.add(root, "dataSet", "");

	try {
		depth1 = rx.add(dataSet, "proc_stat", "");
		record = rx.add(depth1, "item", "");
		rx.add(record, "value", "");
		rx.add(record, "label", "��ü");
		record = rx.add(depth1, "item", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_DUTY_1401_LCURLISTRecord rec = (HD_DUTY_1401_LCURLISTRecord)ds.curlist.get(i);
			if ("PROC_STAT".equals(rec.getCd_type())){
				record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		depth1 = rx.add(dataSet, "hody_clsf", "");
		record = rx.add(depth1, "item", "");
		rx.add(record, "value", "");
		rx.add(record, "label", "��ü");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_DUTY_1401_LCURLISTRecord rec = (HD_DUTY_1401_LCURLISTRecord)ds.curlist.get(i);
			if ("HODY_CLSF".equals(rec.getCd_type())){
				record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		depth1 = rx.add(dataSet, "emp_clsf", "");
		record = rx.add(depth1, "item", "");
		rx.add(record, "value", "");
		rx.add(record, "label", "��ü");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_DUTY_1401_LCURLISTRecord rec = (HD_DUTY_1401_LCURLISTRecord)ds.curlist.get(i);
			if ("EMP_CLSF".equals(rec.getCd_type())){
				record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
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

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST>
		<record>
			<cd_type/>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Mon Mar 23 17:05:38 KST 2009 */ %>