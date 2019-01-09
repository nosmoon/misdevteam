<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.lnk.rec.*
	,	chosun.ciis.tn.lnk.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	TN_LNK_4120_LDataSet ds = (TN_LNK_4120_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "gridData2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			TN_LNK_4120_LCURLIST2Record rec = (TN_LNK_4120_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "umsidx", rec.umsidx);
			rx.add(record, "memberidx", rec.memberidx);
			rx.add(record, "name", rec.name);
			rx.add(record, "receiverinfo", rec.receiverinfo);
			rx.add(record, "status", rec.status);
			rx.add(record, "senddate", rec.senddate);
			//rx.add(record, "umsidx", StringUtil.replaceToXml(rec.umsidx));
			//rx.add(record, "memberidx", StringUtil.replaceToXml(rec.memberidx));
			//rx.add(record, "name", StringUtil.replaceToXml(rec.name));
			//rx.add(record, "receiverinfo", StringUtil.replaceToXml(rec.receiverinfo));
			//rx.add(record, "status", StringUtil.replaceToXml(rec.status));
			//rx.add(record, "senddate", StringUtil.replaceToXml(rec.senddate));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "gridData1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			TN_LNK_4120_LCURLIST1Record rec = (TN_LNK_4120_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "umsidx", rec.umsidx);
			rx.add(record, "deptidx", rec.deptidx);
			rx.add(record, "status", rec.status);
			rx.add(record, "purpose", rec.purpose);
			rx.add(record, "title", rec.title);
			rx.add(record, "sendtype", rec.sendtype);
			rx.add(record, "startdate", rec.startdate);
			rx.add(record, "enddate", rec.enddate);
			rx.add(record, "remk1", rec.remk1);
			rx.add(record, "remk2", rec.remk2);
			rx.add(record, "sendcontents", rec.sendcontents);
			rx.add(record, "isreserved", rec.isreserved);
			rx.add(record, "adminname", rec.adminname);
			rx.add(record, "writedate", rec.writedate);
			rx.add(record, "memo", rec.memo);
			//rx.add(record, "umsidx", StringUtil.replaceToXml(rec.umsidx));
			//rx.add(record, "deptidx", StringUtil.replaceToXml(rec.deptidx));
			//rx.add(record, "status", StringUtil.replaceToXml(rec.status));
			//rx.add(record, "purpose", StringUtil.replaceToXml(rec.purpose));
			//rx.add(record, "title", StringUtil.replaceToXml(rec.title));
			//rx.add(record, "sendtype", StringUtil.replaceToXml(rec.sendtype));
			//rx.add(record, "startdate", StringUtil.replaceToXml(rec.startdate));
			//rx.add(record, "remk1", StringUtil.replaceToXml(rec.remk1));
			//rx.add(record, "remk2", StringUtil.replaceToXml(rec.remk2));
			//rx.add(record, "sendcontents", StringUtil.replaceToXml(rec.sendcontents));
			//rx.add(record, "isreserved", StringUtil.replaceToXml(rec.isreserved));
			//rx.add(record, "adminname", StringUtil.replaceToXml(rec.adminname));
			//rx.add(record, "writedate", StringUtil.replaceToXml(rec.writedate));
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
<tn_lnk_4120_l>
	<dataSet>
		<CURLIST2>
			<record>
				<umsidx/>
				<memberidx/>
				<name/>
				<receiverinfo/>
				<status/>
				<senddate/>
			</record>
		</CURLIST2>
	</dataSet>
</tn_lnk_4120_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_lnk_4120_l>
	<dataSet>
		<CURLIST1>
			<record>
				<umsidx/>
				<deptidx/>
				<status/>
				<purpose/>
				<title/>
				<sendtype/>
				<startdate/>
				<remk1/>
				<remk2/>
				<sendcontents/>
				<isreserved/>
				<adminname/>
				<writedate/>
			</record>
		</CURLIST1>
	</dataSet>
</tn_lnk_4120_l>
*/
%>

<% /* 작성시간 : Tue Sep 06 19:21:28 KST 2016 */ %>