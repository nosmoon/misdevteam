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
	MT_ETCCAR_8001_LDataSet ds = (MT_ETCCAR_8001_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_ETCCAR_8001_LCURLISTRecord rec = (MT_ETCCAR_8001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "drvr_cd", rec.drvr_cd);
			rx.add(record, "drvr_nm", rec.drvr_nm);
			rx.add(record, "tel_no", rec.tel_no);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "lvcmpy_dt", rec.lvcmpy_dt);
  			rx.add(record, "use_yn", rec.use_yn);
  			rx.add(record, "use_yn_nm", rec.use_yn_nm);
			//rx.add(record, "driver_cd", StringUtil.replaceToXml(rec.driver_cd));
			//rx.add(record, "driver_nm", StringUtil.replaceToXml(rec.driver_nm));
			//rx.add(record, "tel_no", StringUtil.replaceToXml(rec.tel_no));
			//rx.add(record, "in_cmpy_dt", StringUtil.replaceToXml(rec.in_cmpy_dt));
			//rx.add(record, "lvcmpy_dt", StringUtil.replaceToXml(rec.lvcmpy_dt));
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
TrustForm의 Instance 선언부에 복사해서 사용
<mt_etccar_8001_l>
	<dataSet>
		<CURLIST>
			<record>
				<driver_cd/>
				<driver_nm/>
				<tel_no/>
				<in_cmpy_dt/>
				<lvcmpy_dt/>
			</record>
		</CURLIST>
	</dataSet>
</mt_etccar_8001_l>
*/
%>

<% /* 작성시간 : Tue Aug 21 16:57:55 KST 2012 */ %>