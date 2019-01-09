<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.srch.rec.*
	,	chosun.ciis.hd.srch.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SRCH_5213_LDataSet ds = (HD_SRCH_5213_LDataSet)request.getAttribute("ds");
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
			HD_SRCH_5213_LCURLIST2Record rec = (HD_SRCH_5213_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dspch_prd", rec.dspch_prd);
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "dspch_prd", StringUtil.replaceToXml(rec.dspch_prd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_SRCH_5213_LCURLIST1Record rec = (HD_SRCH_5213_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "addm_dept_nm", rec.addm_dept_nm);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dspch_prd", rec.dspch_prd);
			rx.add(record, "remk", rec.remk);
			//rx.add(record, "addm_dept_nm", StringUtil.replaceToXml(rec.addm_dept_nm));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "dspch_prd", StringUtil.replaceToXml(rec.dspch_prd));
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
TrustForm�� Instance ����ο� �����ؼ� ���
<hd_srch_5213_l>
	<dataSet>
		<CURLIST2>
			<record>
				<dept_nm/>
				<posi_nm/>
				<flnm/>
				<dspch_prd/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_srch_5213_l>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<hd_srch_5213_l>
	<dataSet>
		<CURLIST1>
			<record>
				<addm_dept_nm/>
				<dept_nm/>
				<flnm/>
				<dspch_prd/>
				<remk/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_srch_5213_l>
*/
%>

<% /* �ۼ��ð� : Tue Sep 18 13:37:19 KST 2018 */ %>