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
	PR_PRTCNSG_1401_LDataSet ds = (PR_PRTCNSG_1401_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");
	String seq = "";
	int total = 0;
	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "rows", "");
 		
		for(int i = 0; i < ds.curlist1.size(); i++) {
			PR_PRTCNSG_1401_LCURLIST1Record rec = (PR_PRTCNSG_1401_LCURLIST1Record)ds.curlist1.get(i);
			//int record = rx.add(recordSet, "record", "");
			//rx.add(recordSet, "seq", rec.seq);
			//rx.add(recordSet, "cd", rec.cd);
			/*
			if (rec.seq == ""){
				seq = rec.seq;
			}else if(seq == rec.seq){
				total += Integer.parseInt(rec.prt_fee);
			}else if(seq != rec.seq){
				rec.prt_fee = String.valueOf(total);
			}
			*/
			rx.add(recordSet, "prt_fee", rec.prt_fee);
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "prt_fee", StringUtil.replaceToXml(rec.prt_fee));
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
<pr_prtcnsg_1401_l>
	<dataSet>
		<CURLIST1>
			<record>
				<seq/>
				<cd/>
				<prt_fee/>
			</record>
		</CURLIST1>
	</dataSet>
</pr_prtcnsg_1401_l>
*/
%>

<% /* 작성시간 : Wed May 27 15:06:10 KST 2009 */ %>