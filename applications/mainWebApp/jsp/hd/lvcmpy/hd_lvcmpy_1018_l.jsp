<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.lvcmpy.rec.*
	,	chosun.ciis.hd.lvcmpy.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_LVCMPY_1018_LDataSet ds = (HD_LVCMPY_1018_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_LVCMPY_1018_LCURLISTRecord rec = (HD_LVCMPY_1018_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cont_yy", rec.cont_yy);
			rx.add(record, "cont_dd", rec.cont_dd);
			rx.add(record, "cont_yy_cal", rec.cont_yy_cal);
			rx.add(record, "cont_yy_cal_2012", rec.cont_yy_cal_2012);
			rx.add(record, "cont_yy_cal_2013", rec.cont_yy_cal_2013);
			//rx.add(record, "cont_yy", StringUtil.replaceToXml(rec.cont_yy));
			//rx.add(record, "cont_dd", StringUtil.replaceToXml(rec.cont_dd));
			//rx.add(record, "cont_yy_cal", StringUtil.replaceToXml(rec.cont_yy_cal));
			//rx.add(record, "cont_yy_cal_2012", StringUtil.replaceToXml(rec.cont_yy_cal_2012));
			//rx.add(record, "cont_yy_cal_2013", StringUtil.replaceToXml(rec.cont_yy_cal_2013));
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
<hd_lvcmpy_1018_l>
	<dataSet>
		<CURLIST>
			<record>
				<cont_yy/>
				<cont_dd/>
				<cont_yy_cal/>
				<cont_yy_cal_2012/>
				<cont_yy_cal_2013/>
			</record>
		</CURLIST>
	</dataSet>
</hd_lvcmpy_1018_l>
*/
%>

<% /* �ۼ��ð� : Tue Mar 19 14:42:29 KST 2013 */ %>