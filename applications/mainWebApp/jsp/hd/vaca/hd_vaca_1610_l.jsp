<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.vaca.rec.*
	,	chosun.ciis.hd.vaca.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_VACA_1610_LDataSet ds = (HD_VACA_1610_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_VACA_1610_LCURLISTRecord rec = (HD_VACA_1610_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "duty_dt", rec.duty_dt);
			rx.add(record, "clndr_wkdy", rec.clndr_wkdy);
			rx.add(record, "clndr_wkdy_nm", rec.clndr_wkdy_nm);
			rx.add(record, "hody_clsf", rec.hody_clsf);
			rx.add(record, "hody_clsf_nm", rec.hody_clsf_nm);
			rx.add(record, "alvc_plan_dt", rec.alvc_plan_dt);
			rx.add(record, "alvc_use_dt", rec.alvc_use_dt);
			//rx.add(record, "duty_dt", StringUtil.replaceToXml(rec.duty_dt));
			//rx.add(record, "clndr_wkdy", StringUtil.replaceToXml(rec.clndr_wkdy));
			//rx.add(record, "clndr_wkdy_nm", StringUtil.replaceToXml(rec.clndr_wkdy_nm));
			//rx.add(record, "hody_clsf", StringUtil.replaceToXml(rec.hody_clsf));
			//rx.add(record, "hody_clsf_nm", StringUtil.replaceToXml(rec.hody_clsf_nm));
			//rx.add(record, "alvc_plan_dt", StringUtil.replaceToXml(rec.alvc_plan_dt));
			//rx.add(record, "alvc_use_dt", StringUtil.replaceToXml(rec.alvc_use_dt));
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
<hd_vaca_1610_l>
	<dataSet>
		<CURLIST>
			<record>
				<duty_dt/>
				<clndr_wkdy/>
				<clndr_wkdy_nm/>
				<hody_clsf/>
				<hody_clsf_nm/>
				<alvc_plan_dt/>
				<alvc_use_dt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_vaca_1610_l>
*/
%>

<% /* 작성시간 : Wed Jul 29 16:05:57 KST 2009 */ %>