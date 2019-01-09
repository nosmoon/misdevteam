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
	PR_PAPMAKE_2100_LDataSet ds = (PR_PAPMAKE_2100_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_PAPMAKE_2100_LCURLISTRecord rec = (PR_PAPMAKE_2100_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "clos_yymm", rec.clos_yymm);
			rx.add(record, "ecnt", rec.ecnt);
			rx.add(record, "clr_clsf", rec.clr_clsf);
			rx.add(record, "re_off_plat", rec.re_off_plat);
			rx.add(record, "re_re_off_plat", rec.re_re_off_plat);
			rx.add(record, "film_num_shet", rec.film_num_shet);
			rx.add(record, "psplat_cnt", rec.psplat_cnt);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "clos_yymm", StringUtil.replaceToXml(rec.clos_yymm));
			//rx.add(record, "ecnt", StringUtil.replaceToXml(rec.ecnt));
			//rx.add(record, "clr_clsf", StringUtil.replaceToXml(rec.clr_clsf));
			//rx.add(record, "re_off_plat", StringUtil.replaceToXml(rec.re_off_plat));
			//rx.add(record, "re_re_off_plat", StringUtil.replaceToXml(rec.re_re_off_plat));
			//rx.add(record, "film_num_shet", StringUtil.replaceToXml(rec.film_num_shet));
			//rx.add(record, "psplat_cnt", StringUtil.replaceToXml(rec.psplat_cnt));
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
<pr_papmake_2100_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<occr_dt/>
				<seq/>
				<clos_yymm/>
				<ecnt/>
				<clr_clsf/>
				<re_off_plat/>
				<re_re_off_plat/>
				<film_num_shet/>
				<psplat_cnt/>
			</record>
		</CURLIST>
	</dataSet>
</pr_papmake_2100_l>
*/
%>

<% /* 작성시간 : Sat Oct 31 13:19:13 KST 2009 */ %>