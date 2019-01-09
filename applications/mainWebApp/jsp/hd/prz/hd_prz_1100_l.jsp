<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.prz.rec.*
	,	chosun.ciis.hd.prz.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_PRZ_1100_LDataSet ds = (HD_PRZ_1100_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int formData = 0;
	int depth1		= 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	formData = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		//recordSet = rx.add(dataSet, "CURLIST", "");
		depth1 = rx.add(formData, "dept_cd_1", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_PRZ_1100_LCURLISTRecord rec = (HD_PRZ_1100_LCURLISTRecord)ds.curlist.get(i);
			if ("APLC_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd_abrv_nm);
			}
		}
		depth1 = rx.add(formData, "dept_cd_2", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_PRZ_1100_LCURLISTRecord rec = (HD_PRZ_1100_LCURLISTRecord)ds.curlist.get(i);
			if ("PRZ_PNSH_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd_abrv_nm);
			}
		}
		depth1 = rx.add(formData, "dept_cd_3", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_PRZ_1100_LCURLISTRecord rec = (HD_PRZ_1100_LCURLISTRecord)ds.curlist.get(i);
			if ("JUDG_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd_abrv_nm);
			}
		}
		depth1 = rx.add(formData, "dept_cd_4", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_PRZ_1100_LCURLISTRecord rec = (HD_PRZ_1100_LCURLISTRecord)ds.curlist.get(i);
			if ("PRV_INSP_OCOM".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd_abrv_nm);
			}
		}
		depth1 = rx.add(formData, "dept_cd_5", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_PRZ_1100_LCURLISTRecord rec = (HD_PRZ_1100_LCURLISTRecord)ds.curlist.get(i);
			if ("MAIN_INSP_OCOM".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd_abrv_nm);
			}
		}
		depth1 = rx.add(formData, "dept_cd_6", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_PRZ_1100_LCURLISTRecord rec = (HD_PRZ_1100_LCURLISTRecord)ds.curlist.get(i);
			if ("PRZ_RESN_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd_abrv_nm);
			}
		}
		depth1 = rx.add(formData, "dept_cd_7", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_PRZ_1100_LCURLISTRecord rec = (HD_PRZ_1100_LCURLISTRecord)ds.curlist.get(i);
			if ("CLAS_CLSF_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
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

<% /* �ۼ��ð� : Fri Mar 20 09:53:03 KST 2009 */ %>