<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.budg.rec.*
	,	chosun.ciis.mc.budg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_BUDG_6046_LDataSet ds = (MC_BUDG_6046_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MC_BUDG_6046_LCURLIST2Record rec = (MC_BUDG_6046_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "chk", rec.chk);
			//rx.add(record, "yymm", rec.yymm);
			//rx.add(record, "sub_cd", rec.sub_cd);
			//rx.add(record, "clos_yn", rec.clos_yn);
			//rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "chk", StringUtil.replaceToXml(rec.chk));
			rx.add(record, "yymm", StringUtil.replaceToXml(rec.yymm));
			rx.add(record, "sub_cd", StringUtil.replaceToXml(rec.sub_cd));
			rx.add(record, "clos_yn", StringUtil.replaceToXml(rec.clos_yn));
			rx.add(record, "incmg_dt_tm", StringUtil.replaceToXml(rec.incmg_dt_tm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MC_BUDG_6046_LCURLIST1Record rec = (MC_BUDG_6046_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "chk", rec.chk);
			//rx.add(record, "yymm", rec.yymm);
			//rx.add(record, "sub_cd", rec.sub_cd);
			//rx.add(record, "clos_yn", rec.clos_yn);
			//rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "chk", StringUtil.replaceToXml(rec.chk));
			rx.add(record, "yymm", StringUtil.replaceToXml(rec.yymm));
			rx.add(record, "sub_cd", StringUtil.replaceToXml(rec.sub_cd));
			rx.add(record, "clos_yn", StringUtil.replaceToXml(rec.clos_yn));
			rx.add(record, "incmg_dt_tm", StringUtil.replaceToXml(rec.incmg_dt_tm));
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
<mc_budg_6046_l>
	<dataSet>
		<CURLIST2>
			<record>
				<chk/>
				<yymm/>
				<sub_cd/>
				<clos_yn/>
				<incmg_dt_tm/>
			</record>
		</CURLIST2>
	</dataSet>
</mc_budg_6046_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mc_budg_6046_l>
	<dataSet>
		<CURLIST1>
			<record>
				<chk/>
				<yymm/>
				<sub_cd/>
				<clos_yn/>
				<incmg_dt_tm/>
			</record>
		</CURLIST1>
	</dataSet>
</mc_budg_6046_l>
*/
%>

<% /* 작성시간 : Mon May 18 09:32:15 KST 2009 */ %>