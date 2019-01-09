<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pr.papmake.rec.*
	,	chosun.ciis.pr.papmake.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_PAPMAKE_7021_LDataSet ds = (PR_PAPMAKE_7021_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_PAPMAKE_7021_LCURLISTRecord rec = (PR_PAPMAKE_7021_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "ispt_dt", rec.ispt_dt);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "ispt_clsf", rec.ispt_clsf);
			rx.add(record, "ispt_cd", rec.ispt_cd);
			rx.add(record, "ispt_nm", rec.ispt_nm);
			rx.add(record, "ispt_clas1", rec.ispt_clas1);
			rx.add(record, "ispt_clas2", rec.ispt_clas2);
			rx.add(record, "ispt_clas3_nm", rec.ispt_clas3_nm);
			rx.add(record, "ispt_clas4_nm", rec.ispt_clas4_nm);
			rx.add(record, "ispt_rslt", rec.ispt_rslt);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "chg_pers", rec.chg_pers);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
			rx.add(record, "ispt_clas3", rec.ispt_clas3);
			rx.add(record, "ispt_clas4", rec.ispt_clas4);
			rx.add(record, "ispt_clas1_nm", rec.ispt_clas1_nm);
			rx.add(record, "ispt_clas2_nm", rec.ispt_clas2_nm);
			rx.add(record, "ispt_clsf_nm", rec.ispt_clsf_nm);
			//rx.add(record, "icpt_dt", StringUtil.replaceToXml(rec.icpt_dt));
			//rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
			//rx.add(record, "ispt_clsf", StringUtil.replaceToXml(rec.ispt_clsf));
			//rx.add(record, "ispt_cd", StringUtil.replaceToXml(rec.ispt_cd));
			//rx.add(record, "ispt_nm", StringUtil.replaceToXml(rec.ispt_nm));
			//rx.add(record, "ispt_clas1", StringUtil.replaceToXml(rec.ispt_clas1));
			//rx.add(record, "ispt_clas2", StringUtil.replaceToXml(rec.ispt_clas2));
			//rx.add(record, "ispt_clas1_nm", StringUtil.replaceToXml(rec.ispt_clas1_nm));
			//rx.add(record, "ispt_clas2_nm", StringUtil.replaceToXml(rec.ispt_clas2_nm));
			//rx.add(record, "ispt_rslt", StringUtil.replaceToXml(rec.ispt_rslt));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "chg_pers", StringUtil.replaceToXml(rec.chg_pers));
			//rx.add(record, "chg_dt_tm", StringUtil.replaceToXml(rec.chg_dt_tm));
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
<pr_papmake_7021_l>
	<dataSet>
		<CURLIST>
			<record>
				<icpt_dt/>
				<fac_clsf/>
				<ispt_clsf/>
				<ispt_cd/>
				<ispt_nm/>
				<ispt_clas1/>
				<ispt_clas2/>
				<ispt_clas1_nm/>
				<ispt_clas2_nm/>
				<ispt_rslt/>
				<remk/>
				<chg_pers/>
				<chg_dt_tm/>
			</record>
		</CURLIST>
	</dataSet>
</pr_papmake_7021_l>
*/
%>

<% /* 작성시간 : Wed Jan 06 17:58:39 KST 2016 */ %>