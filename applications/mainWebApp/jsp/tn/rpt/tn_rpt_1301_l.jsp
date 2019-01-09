<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.rpt.rec.*
	,	chosun.ciis.tn.rpt.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	TN_RPT_1301_LDataSet ds = (TN_RPT_1301_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			TN_RPT_1301_LCURLIST3Record rec = (TN_RPT_1301_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "clos_clsf2", rec.clos_clsf2);
			rx.add(record, "clos_clsf2_nm", rec.clos_clsf2_nm);
			rx.add(record, "clos_clsf3", rec.clos_clsf3);
			rx.add(record, "clos_clsf3_nm", rec.clos_clsf3_nm);
			rx.add(record, "yes_cnt", rec.yes_cnt);
			rx.add(record, "yes_amt", rec.yes_amt);
			rx.add(record, "to_cnt", rec.to_cnt);
			rx.add(record, "to_amt", rec.to_amt);
			rx.add(record, "diff_cnt", rec.diff_cnt);
			rx.add(record, "diff_amt", rec.diff_amt);
			rx.add(record, "remk", rec.remk);
			//rx.add(record, "clos_clsf2", StringUtil.replaceToXml(rec.clos_clsf2));
			//rx.add(record, "clos_clsf2_nm", StringUtil.replaceToXml(rec.clos_clsf2_nm));
			//rx.add(record, "clos_clsf3", StringUtil.replaceToXml(rec.clos_clsf3));
			//rx.add(record, "clos_clsf3_nm", StringUtil.replaceToXml(rec.clos_clsf3_nm));
			//rx.add(record, "yes_cnt", StringUtil.replaceToXml(rec.yes_cnt));
			//rx.add(record, "yes_amt", StringUtil.replaceToXml(rec.yes_amt));
			//rx.add(record, "to_cnt", StringUtil.replaceToXml(rec.to_cnt));
			//rx.add(record, "to_amt", StringUtil.replaceToXml(rec.to_amt));
			//rx.add(record, "diff_cnt", StringUtil.replaceToXml(rec.diff_cnt));
			//rx.add(record, "diff_amt", StringUtil.replaceToXml(rec.diff_amt));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			TN_RPT_1301_LCURLIST2Record rec = (TN_RPT_1301_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "clos_clsf2", rec.clos_clsf2);
			rx.add(record, "clos_clsf2_nm", rec.clos_clsf2_nm);
			rx.add(record, "clos_clsf3", rec.clos_clsf3);
			rx.add(record, "clos_clsf3_nm", rec.clos_clsf3_nm);
			rx.add(record, "yes_cnt", rec.yes_cnt);
			rx.add(record, "yes_amt", rec.yes_amt);
			rx.add(record, "to_cnt", rec.to_cnt);
			rx.add(record, "to_amt", rec.to_amt);
			rx.add(record, "diff_cnt", rec.diff_cnt);
			rx.add(record, "diff_amt", rec.diff_amt);
			rx.add(record, "remk", rec.remk);
			//rx.add(record, "clos_clsf2", StringUtil.replaceToXml(rec.clos_clsf2));
			//rx.add(record, "clos_clsf2_nm", StringUtil.replaceToXml(rec.clos_clsf2_nm));
			//rx.add(record, "clos_clsf3", StringUtil.replaceToXml(rec.clos_clsf3));
			//rx.add(record, "clos_clsf3_nm", StringUtil.replaceToXml(rec.clos_clsf3_nm));
			//rx.add(record, "yes_cnt", StringUtil.replaceToXml(rec.yes_cnt));
			//rx.add(record, "yes_amt", StringUtil.replaceToXml(rec.yes_amt));
			//rx.add(record, "to_cnt", StringUtil.replaceToXml(rec.to_cnt));
			//rx.add(record, "to_amt", StringUtil.replaceToXml(rec.to_amt));
			//rx.add(record, "diff_cnt", StringUtil.replaceToXml(rec.diff_cnt));
			//rx.add(record, "diff_amt", StringUtil.replaceToXml(rec.diff_amt));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			TN_RPT_1301_LCURLIST1Record rec = (TN_RPT_1301_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "clos_clsf2", rec.clos_clsf2);
			rx.add(record, "clos_clsf2_nm", rec.clos_clsf2_nm);
			rx.add(record, "clos_clsf3", rec.clos_clsf3);
			rx.add(record, "clos_clsf3_nm", rec.clos_clsf3_nm);
			rx.add(record, "yes_cnt", rec.yes_cnt);
			rx.add(record, "yes_amt", rec.yes_amt);
			rx.add(record, "to_cnt", rec.to_cnt);
			rx.add(record, "to_amt", rec.to_amt);
			rx.add(record, "diff_cnt", rec.diff_cnt);
			rx.add(record, "diff_amt", rec.diff_amt);
			rx.add(record, "remk", rec.remk);
			//rx.add(record, "clos_clsf2", StringUtil.replaceToXml(rec.clos_clsf2));
			//rx.add(record, "clos_clsf2_nm", StringUtil.replaceToXml(rec.clos_clsf2_nm));
			//rx.add(record, "clos_clsf3", StringUtil.replaceToXml(rec.clos_clsf3));
			//rx.add(record, "clos_clsf3_nm", StringUtil.replaceToXml(rec.clos_clsf3_nm));
			//rx.add(record, "yes_cnt", StringUtil.replaceToXml(rec.yes_cnt));
			//rx.add(record, "yes_amt", StringUtil.replaceToXml(rec.yes_amt));
			//rx.add(record, "to_cnt", StringUtil.replaceToXml(rec.to_cnt));
			//rx.add(record, "to_amt", StringUtil.replaceToXml(rec.to_amt));
			//rx.add(record, "diff_cnt", StringUtil.replaceToXml(rec.diff_cnt));
			//rx.add(record, "diff_amt", StringUtil.replaceToXml(rec.diff_amt));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
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
<tn_rpt_1301_l>
	<dataSet>
		<CURLIST3>
			<record>
				<clos_clsf2/>
				<clos_clsf2_nm/>
				<clos_clsf3/>
				<clos_clsf3_nm/>
				<yes_cnt/>
				<yes_amt/>
				<to_cnt/>
				<to_amt/>
				<diff_cnt/>
				<diff_amt/>
				<remk/>
			</record>
		</CURLIST3>
	</dataSet>
</tn_rpt_1301_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_rpt_1301_l>
	<dataSet>
		<CURLIST2>
			<record>
				<clos_clsf2/>
				<clos_clsf2_nm/>
				<clos_clsf3/>
				<clos_clsf3_nm/>
				<yes_cnt/>
				<yes_amt/>
				<to_cnt/>
				<to_amt/>
				<diff_cnt/>
				<diff_amt/>
				<remk/>
			</record>
		</CURLIST2>
	</dataSet>
</tn_rpt_1301_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_rpt_1301_l>
	<dataSet>
		<CURLIST1>
			<record>
				<clos_clsf2/>
				<clos_clsf2_nm/>
				<clos_clsf3/>
				<clos_clsf3_nm/>
				<yes_cnt/>
				<yes_amt/>
				<to_cnt/>
				<to_amt/>
				<diff_cnt/>
				<diff_amt/>
				<remk/>
			</record>
		</CURLIST1>
	</dataSet>
</tn_rpt_1301_l>
*/
%>

<% /* 작성시간 : Fri Oct 21 11:20:46 KST 2016 */ %>