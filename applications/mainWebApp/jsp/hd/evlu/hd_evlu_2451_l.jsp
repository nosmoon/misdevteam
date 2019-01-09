<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.evlu.rec.*
	,	chosun.ciis.hd.evlu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EVLU_2451_LDataSet ds = (HD_EVLU_2451_LDataSet)request.getAttribute("ds");
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
			HD_EVLU_2451_LCURLISTRecord rec = (HD_EVLU_2451_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "evlu_yy", rec.evlu_yy);
			rx.add(record, "tms_clsf", rec.tms_clsf);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "prz_pnsh_cd", rec.prz_pnsh_cd);
			rx.addCData(record, "prz_pnsh_nm", rec.prz_pnsh_nm);
			rx.addCData(record, "case_nm", rec.case_nm);
			rx.add(record, "point", rec.point);
			rx.add(record, "spc_psdo_redu_scorcnt", rec.spc_psdo_redu_scorcnt);
			//rx.add(record, "evlu_yy", StringUtil.replaceToXml(rec.evlu_yy));
			//rx.add(record, "tms_clsf", StringUtil.replaceToXml(rec.tms_clsf));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "prz_pnsh_cd", StringUtil.replaceToXml(rec.prz_pnsh_cd));
			//rx.add(record, "prz_pnsh_nm", StringUtil.replaceToXml(rec.prz_pnsh_nm));
			//rx.add(record, "case_nm", StringUtil.replaceToXml(rec.case_nm));
			//rx.add(record, "point", StringUtil.replaceToXml(rec.point));
			//rx.add(record, "spc_psdo_redu_scorcnt", StringUtil.replaceToXml(rec.spc_psdo_redu_scorcnt));
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
<hd_evlu_2451_l>
	<dataSet>
		<CURLIST>
			<record>
				<evlu_yy/>
				<tms_clsf/>
				<emp_no/>
				<flnm/>
				<seq/>
				<prz_pnsh_cd/>
				<prz_pnsh_nm/>
				<case_nm/>
				<point/>
				<spc_psdo_redu_scorcnt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_evlu_2451_l>
*/
%>

<% /* 작성시간 : Fri Jul 25 11:50:02 KST 2014 */ %>