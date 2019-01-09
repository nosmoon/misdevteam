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
	PR_PRTCNSG_1400_LDataSet ds = (PR_PRTCNSG_1400_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "cols", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			PR_PRTCNSG_1400_LCURLIST1Record rec = (PR_PRTCNSG_1400_LCURLIST1Record)ds.curlist1.get(i);
			//int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cd", rec.cd);
			rx.add(recordSet, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			//rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */
		
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "rows", "");

		for(int i = 0; i < 1; i++) {
			PR_PRTCNSG_1400_LCURLIST1Record rec = (PR_PRTCNSG_1400_LCURLIST1Record)ds.curlist1.get(i);
			rx.add(recordSet, "dept", "인쇄비", true);
			rx.add(recordSet, "dept", "용지대");
			rx.add(recordSet, "dept", "PS판비");
			rx.add(recordSet, "dept", "소부비");
			rx.add(recordSet, "dept", "필름제작비");
			rx.add(recordSet, "dept", "포장비");
			rx.add(recordSet, "dept", "운송비");
			//rx.add(recordSet, "dept", "합계");
		}
		//rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST2 END */

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
<pr_prtcnsg_1400_l>
	<dataSet>
		<CURLIST1>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURLIST1>
	</dataSet>
</pr_prtcnsg_1400_l>
*/
%>

<% /* 작성시간 : Tue May 26 10:31:18 KST 2009 */ %>