<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ss.sls.brmgr.rec.*
	,	chosun.ciis.ss.sls.brmgr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SS_SLS_BRMGR_2852_SDataSet ds = (SS_SLS_BRMGR_2852_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int detaildata = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	detaildata = rx.add(root, "detaildata", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(detaildata, "ABCCUR", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			SS_SLS_BRMGR_2852_SCURLISTRecord rec = (SS_SLS_BRMGR_2852_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "yyyymm", rec.yyyymm);
			rx.add(record, "rdr_no", rec.rdr_no);
			rx.add(record, "medinm", rec.medinm);
			rx.add(record, "subsqty", rec.subsqty);
			rx.add(record, "rdr_extndt", rec.rdr_extndt);
			rx.add(record, "valmm", rec.valmm);
			rx.add(record, "suspdt", rec.suspdt);
			rx.add(record, "clamqty", rec.clamqty);
			rx.add(record, "clamamt", rec.clamamt);
			rx.add(record, "dscnamt", rec.dscnamt);
			rx.add(record, "post_dlvfee", rec.post_dlvfee);
			rx.add(record, "clamt", rec.clamt);
			rx.add(record, "clamtmthdnm", rec.clamtmthdnm);
			rx.add(record, "rcpmclsfnm", rec.rcpmclsfnm);
			rx.add(record, "shftdt", rec.shftdt);
			rx.add(record, "pymtmm", rec.pymtmm);
			rx.add(record, "clamtlist", rec.clamtlist);
			rx.add(record, "clamtmm", rec.clamtmm);
			rx.add(record, "abcmms", rec.abcmms);
			rx.add(record, "abcyn", rec.abcyn);
			rx.add(record, "bocd", rec.bocd);
			rx.add(record, "medicd", rec.medicd);
			rx.add(record, "clamtmthdcd", rec.clamtmthdcd);			
			rx.add(record, "rcpmclsfcd", rec.rcpmclsfcd);

		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(detaildata, "errcode", errcode);
		rx.add(detaildata, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<ss_sls_brmgr_2852_s>
	<dataSet>
		<CURLIST>
			<record>
				<yyyymm/>
				<bocd/>
				<rdr_no/>
				<medicd/>
				<subsqty/>
				<rdr_extndt/>
				<valmm/>
				<suspdt/>
				<clamqty/>
				<clamamt/>
				<dscnamt/>
				<post_dlvfee/>
				<clamt/>
				<clamtmthdcd/>
				<rcpmclsfcd/>
				<shftdt/>
				<pymtmm/>
				<subsmappli/>
				<clamtlist/>
				<clamtmm/>
				<abcmms/>
				<abcyn/>
				<incmgdt/>
			</record>
		</CURLIST>
	</dataSet>
</ss_sls_brmgr_2852_s>
*/
%>

<% /* 작성시간 : Wed Feb 15 14:29:41 KST 2017 */ %>