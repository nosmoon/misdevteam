<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.crcl.rec.*
	,	chosun.ciis.hd.crcl.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_CRCL_1000_LDataSet ds = (HD_CRCL_1000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	//dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		dataSet = rx.add(root, "tempData", "");
		//recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_CRCL_1000_LCURLISTRecord rec = (HD_CRCL_1000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "prn", rec.prn);
			rx.add(record, "paty_crc_cd", rec.paty_crc_cd);
			rx.add(record, "paty_crc_nm", rec.paty_crc_nm);
			rx.add(record, "entr_dt", rec.entr_dt);
			rx.add(record, "lve_dt", rec.lve_dt);
			rx.add(record, "check_cd", rec.check_cd);
		}
		rx.add(dataSet, "totalcnt", ds.curlist.size());
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
<dataSet>
	<CURLIST>
		<record>
			<cmpy_cd/>
			<emp_no/>
			<nm_korn/>
			<prn/>
			<dept_nm/>
			<dty_cd/>
			<emp_clsf_cd/>
			<emp_clsf_nm/>
			<paty_crc_cd/>
			<entr_dt/>
			<lve_dt/>
			<check_cd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Feb 09 20:24:57 KST 2009 */ %>