<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.prnpap.rec.*
	,	chosun.ciis.mt.prnpap.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PRNPAP_1001_LDataSet ds = (MT_PRNPAP_1001_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "fac_clsf", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PRNPAP_1001_LCURLISTRecord rec = (MT_PRNPAP_1001_LCURLISTRecord)ds.curlist.get(i);
			if(rec.combo.equals("FAC_CLSF")) {
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "value", rec.cd);
				//rx.add(record, "label", rec.cdnm);
				//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
				rx.add(record, "label", rec.cdnm_cd);
				//rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			}
		}
		
		recordSet = rx.add(dataSet, "papcmpy_cd", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PRNPAP_1001_LCURLISTRecord rec = (MT_PRNPAP_1001_LCURLISTRecord)ds.curlist.get(i);
			if(rec.combo.equals("PAPCMPY_CD")) {
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "value", rec.mang_cd_1);
				//rx.add(record, "label", rec.cdnm);
				//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
				rx.add(record, "label", rec.mang_cd_1 + " " + rec.cdnm);
				//rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			}
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

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
			<combo/>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Mon Mar 30 16:21:01 KST 2009 */ %>