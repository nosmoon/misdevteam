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
	PR_PAPMAKE_2200_LDataSet ds = (PR_PAPMAKE_2200_LDataSet)request.getAttribute("ds");
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
			PR_PAPMAKE_2200_LCURLISTRecord rec = (PR_PAPMAKE_2200_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "clos_yymm", rec.clos_yymm);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "ps_loss_rate", rec.ps_loss_rate);
			rx.add(record, "film_loss_rate", rec.film_loss_rate);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "clos_yymm", StringUtil.replaceToXml(rec.clos_yymm));
			//rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
			//rx.add(record, "loss_rate", StringUtil.replaceToXml(rec.loss_rate));
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
<pr_papmake_2200_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<clos_yymm/>
				<fac_clsf/>
				<loss_rate/>
			</record>
		</CURLIST>
	</dataSet>
</pr_papmake_2200_l>
*/
%>

<% /* 작성시간 : Sat Oct 31 14:58:05 KST 2009 */ %>