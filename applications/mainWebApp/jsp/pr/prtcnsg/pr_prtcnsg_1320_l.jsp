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
	PR_PRTCNSG_1320_LDataSet ds = (PR_PRTCNSG_1320_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			PR_PRTCNSG_1320_LCURLIST1Record rec = (PR_PRTCNSG_1320_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "aply_dt", rec.aply_dt);
			rx.add(record, "papcmpy_cd_nm", rec.papcmpy_cd+" "+rec.papcmpy_cd_nm);
			rx.add(record, "papcmpy_cd", rec.papcmpy_cd);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			rx.add(record, "paper_uprc", rec.paper_uprc);
			rx.add(record, "paper_portage", rec.paper_portage);
			//rx.add(record, "aply_dt", StringUtil.replaceToXml(rec.aply_dt));
			//rx.add(record, "papcmpy_cd_nm", StringUtil.replaceToXml(rec.papcmpy_cd_nm));
			//rx.add(record, "papcmpy_cd", StringUtil.replaceToXml(rec.papcmpy_cd));
			//rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
			//rx.add(record, "paper_uprc", StringUtil.replaceToXml(rec.paper_uprc));
			//rx.add(record, "paper_portage", StringUtil.replaceToXml(rec.paper_portage));
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
<pr_prtcnsg_1320_l>
	<dataSet>
		<CURLIST1>
			<record>
				<aply_dt/>
				<papcmpy_cd_nm/>
				<papcmpy_cd/>
				<fac_clsf/>
				<paper_uprc/>
				<paper_portage/>
			</record>
		</CURLIST1>
	</dataSet>
</pr_prtcnsg_1320_l>
*/
%>

<% /* 작성시간 : Sun May 24 16:35:44 KST 2009 */ %>