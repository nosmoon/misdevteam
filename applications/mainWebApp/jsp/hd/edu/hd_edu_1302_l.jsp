<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.edu.rec.*
	,	chosun.ciis.hd.edu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EDU_1302_LDataSet ds = (HD_EDU_1302_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int formData = 0;
	int depth1		= 0;
	int depth2		= 0;
	int depth3		= 0;
	int depth4		= 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	formData = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		//recordSet = rx.add(dataSet, "CURLIST", "");
		depth1 = rx.add(formData, "complt_yn", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_EDU_1302_LCURLISTRecord rec = (HD_EDU_1302_LCURLISTRecord)ds.curlist.get(i);
			if ("COMPLT_YN".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd_abrv_nm);
			}
		}
		depth2 = rx.add(formData, "emp_yn", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_EDU_1302_LCURLISTRecord rec = (HD_EDU_1302_LCURLISTRecord)ds.curlist.get(i);
			if ("EMP_YN".equals(rec.getCd_type())){
				int record = rx.add(depth2, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd_abrv_nm);
			}
		}
		depth3 = rx.add(formData, "edu_dtls_clsf", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_EDU_1302_LCURLISTRecord rec = (HD_EDU_1302_LCURLISTRecord)ds.curlist.get(i);
			if ("EDU_DTLS_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth3, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd_abrv_nm);
			}
		}
		depth4 = rx.add(formData, "lang_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_EDU_1302_LCURLISTRecord rec = (HD_EDU_1302_LCURLISTRecord)ds.curlist.get(i);
			if ("LANG_CD".equals(rec.getCd_type())){
				int record = rx.add(depth4, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd_abrv_nm);
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

<% /* �ۼ��ð� : Mon Mar 23 15:10:08 KST 2009 */ %>