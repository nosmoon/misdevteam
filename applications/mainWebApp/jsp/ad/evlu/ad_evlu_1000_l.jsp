<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.evlu.rec.*
	,	chosun.ciis.ad.evlu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_EVLU_1000_LDataSet ds = (AD_EVLU_1000_LDataSet)request.getAttribute("ds");
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
			AD_EVLU_1000_LCURLIST2Record rec = (AD_EVLU_1000_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rvis_end_yn", rec.rvis_end_yn);
			//rx.add(record, "rvis_end_yn", StringUtil.replaceToXml(rec.rvis_end_yn));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_EVLU_1000_LCURLISTRecord rec = (AD_EVLU_1000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "team_cd", rec.team_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "acct_id", rec.acct_id);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "paper_scor", rec.paper_scor);
			rx.add(record, "chk1", rec.chk1);
			rx.add(record, "paper_remk", rec.paper_remk);
			rx.add(record, "pubsh_scor", rec.pubsh_scor);
			rx.add(record, "chk2", rec.chk2);
			rx.add(record, "pubsh_remk", rec.pubsh_remk);
			rx.add(record, "pric_scor", rec.pric_scor);
			rx.add(record, "chk3", rec.chk3);
			rx.add(record, "pric_remk", rec.pric_remk);
			rx.add(record, "spcl_scor", rec.spcl_scor);
			rx.add(record, "chk4", rec.chk4);
			rx.add(record, "spcl_remk", rec.spcl_remk);
			rx.add(record, "adj_evlu_scor", rec.adj_evlu_scor);
			rx.add(record, "chk5", rec.chk5);
			rx.add(record, "adj_evlu_remk", rec.adj_evlu_remk);
			//rx.add(record, "team_cd", StringUtil.replaceToXml(rec.team_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "acct_id", StringUtil.replaceToXml(rec.acct_id));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "paper_scor", StringUtil.replaceToXml(rec.paper_scor));
			//rx.add(record, "chk1", StringUtil.replaceToXml(rec.chk1));
			//rx.add(record, "paper_remk", StringUtil.replaceToXml(rec.paper_remk));
			//rx.add(record, "pubsh_scor", StringUtil.replaceToXml(rec.pubsh_scor));
			//rx.add(record, "chk2", StringUtil.replaceToXml(rec.chk2));
			//rx.add(record, "pubsh_remk", StringUtil.replaceToXml(rec.pubsh_remk));
			//rx.add(record, "pric_scor", StringUtil.replaceToXml(rec.pric_scor));
			//rx.add(record, "chk3", StringUtil.replaceToXml(rec.chk3));
			//rx.add(record, "pric_remk", StringUtil.replaceToXml(rec.pric_remk));
			//rx.add(record, "spcl_scor", StringUtil.replaceToXml(rec.spcl_scor));
			//rx.add(record, "chk4", StringUtil.replaceToXml(rec.chk4));
			//rx.add(record, "spcl_remk", StringUtil.replaceToXml(rec.spcl_remk));
			//rx.add(record, "adj_evlu_scor", StringUtil.replaceToXml(rec.adj_evlu_scor));
			//rx.add(record, "chk5", StringUtil.replaceToXml(rec.chk5));
			//rx.add(record, "adj_evlu_remk", StringUtil.replaceToXml(rec.adj_evlu_remk));
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
<ad_evlu_1000_l>
	<dataSet>
		<CURLIST2>
			<record>
				<rvis_end_yn/>
			</record>
		</CURLIST2>
	</dataSet>
</ad_evlu_1000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<ad_evlu_1000_l>
	<dataSet>
		<CURLIST>
			<record>
				<team_cd/>
				<dept_nm/>
				<acct_id/>
				<nm_korn/>
				<posi_cd/>
				<posi_nm/>
				<paper_scor/>
				<chk1/>
				<paper_remk/>
				<pubsh_scor/>
				<chk2/>
				<pubsh_remk/>
				<pric_scor/>
				<chk3/>
				<pric_remk/>
				<spcl_scor/>
				<chk4/>
				<spcl_remk/>
				<adj_evlu_scor/>
				<chk5/>
				<adj_evlu_remk/>
			</record>
		</CURLIST>
	</dataSet>
</ad_evlu_1000_l>
*/
%>

<% /* 작성시간 : Tue Mar 16 10:49:19 KST 2010 */ %>