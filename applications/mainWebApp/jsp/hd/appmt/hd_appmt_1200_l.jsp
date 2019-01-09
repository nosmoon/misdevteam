<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.appmt.rec.*
	,	chosun.ciis.hd.appmt.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_APPMT_1200_LDataSet ds = (HD_APPMT_1200_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int formData = 0;
	int depth1 = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	formData = rx.add(root, "tempData", "");

	try {
		depth1 = rx.add(formData, "dept_cd_1", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_APPMT_1200_LCURLISTRecord rec = (HD_APPMT_1200_LCURLISTRecord)ds.curlist.get(i);
			if ("EMP_CLSF_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.addCData(record, "label", rec.cd_abrv_nm);
			}
		}
		depth1 = rx.add(formData, "dept_cd_2", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_APPMT_1200_LCURLISTRecord rec = (HD_APPMT_1200_LCURLISTRecord)ds.curlist.get(i);
			if ("APPMT_RESN_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.addCData(record, "label", rec.cd_abrv_nm);
			}
		}
		depth1 = rx.add(formData, "dept_cd_3", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_APPMT_1200_LCURLISTRecord rec = (HD_APPMT_1200_LCURLISTRecord)ds.curlist.get(i);
			if ("DSPCH_ENPR_MAIN_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.addCData(record, "label", rec.cd_abrv_nm);
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
TrustForm의 Instance 선언부에 복사해서 사용
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

<% /* 작성시간 : Wed Feb 18 15:02:47 KST 2009 */ %>