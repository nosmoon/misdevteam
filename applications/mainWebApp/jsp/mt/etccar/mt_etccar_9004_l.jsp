<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.etccar.rec.*
	,	chosun.ciis.mt.etccar.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_ETCCAR_9004_LDataSet ds = (MT_ETCCAR_9004_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_ETCCAR_9004_LCURLISTRecord rec = (MT_ETCCAR_9004_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "cmpy_cd_nm", rec.cmpy_cd_nm);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "ptph_no", rec.ptph_no);
   		    rx.add(record, "tel_no", rec.tel_no);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			//rx.add(record, "drvr_no", StringUtil.replaceToXml(rec.drvr_no));
			//rx.add(record, "drvr_nm", StringUtil.replaceToXml(rec.drvr_nm));
			//rx.add(record, "tel_no", StringUtil.replaceToXml(rec.tel_no));
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
<mt_etccar_9003_l>
	<dataSet>
		<CURLIST>
			<record>
				<drvr_no/>
				<drvr_nm/>
				<tel_no/>
			</record>
		</CURLIST>
	</dataSet>
</mt_etccar_9003_l>
*/
%>

<% /* �ۼ��ð� : Thu Sep 06 18:03:04 KST 2012 */ %>