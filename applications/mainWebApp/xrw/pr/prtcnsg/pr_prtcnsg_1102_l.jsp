<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pr.prtcnsg.rec.*
	,	chosun.ciis.pr.prtcnsg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_PRTCNSG_1102_LDataSet ds = (PR_PRTCNSG_1102_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "papuprc", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			PR_PRTCNSG_1102_LCURLIST2Record rec = (PR_PRTCNSG_1102_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "paper_uprc", rec.paper_uprc);
			rx.add(record, "paper_portage", rec.paper_portage);
			//rx.add(record, "paper_uprc", StringUtil.replaceToXml(rec.paper_uprc));
			//rx.add(record, "paper_portage", StringUtil.replaceToXml(rec.paper_portage));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "mamtstdpcn", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			PR_PRTCNSG_1102_LCURLIST1Record rec = (PR_PRTCNSG_1102_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "pap_std", rec.pap_std);
			rx.add(record, "issu_pcnt", rec.issu_pcnt);
			rx.add(record, "bw_pcnt", rec.bw_pcnt);
			rx.add(record, "clr_pcnt", rec.clr_pcnt);
			rx.add(record, "slip_qty", rec.slip_qty);
			//rx.add(record, "pap_std", StringUtil.replaceToXml(rec.pap_std));
			//rx.add(record, "issu_pcnt", StringUtil.replaceToXml(rec.issu_pcnt));
			//rx.add(record, "bw_pcnt", StringUtil.replaceToXml(rec.bw_pcnt));
			//rx.add(record, "clr_pcnt", StringUtil.replaceToXml(rec.clr_pcnt));
			//rx.add(record, "slip_qty", StringUtil.replaceToXml(rec.slip_qty));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
<pr_prtcnsg_1102_l>
	<dataSet>
		<CURLIST2>
			<record>
				<paper_uprc/>
				<paper_portage/>
			</record>
		</CURLIST2>
	</dataSet>
</pr_prtcnsg_1102_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<pr_prtcnsg_1102_l>
	<dataSet>
		<CURLIST1>
			<record>
				<pap_std/>
				<issu_pcnt/>
				<bw_pcnt/>
				<clr_pcnt/>
				<slip_qty/>
			</record>
		</CURLIST1>
	</dataSet>
</pr_prtcnsg_1102_l>
*/
%>

<% /* 작성시간 : Mon Jul 06 12:37:22 KST 2009 */ %>