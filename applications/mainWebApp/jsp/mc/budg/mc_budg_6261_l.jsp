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
	MC_BUDG_6261_LDataSet ds = (MC_BUDG_6261_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_6261_LCURLISTRecord rec = (MC_BUDG_6261_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "pubc_dt", rec.pubc_dt);
			rx.add(record, "week", rec.week);
			rx.add(record, "pubc_dt_day", rec.pubc_dt_day);
			rx.add(record, "tot_pubc1", rec.tot_pubc1);
			rx.add(record, "loss_pubc1", rec.loss_pubc1);
			rx.add(record, "tot_pubc2", rec.tot_pubc2);
			rx.add(record, "loss_pubc2", rec.loss_pubc2);
			rx.add(record, "tot_pubc3", rec.tot_pubc3);
			rx.add(record, "loss_pubc3", rec.loss_pubc3);
			rx.add(record, "adv_sum", rec.adv_sum);
			rx.add(record, "loss_sum", rec.loss_sum);
			//rx.add(record, "pubc_dt", StringUtil.replaceToXml(rec.pubc_dt));
			//rx.add(record, "week", StringUtil.replaceToXml(rec.week));
			//rx.add(record, "pubc_dt_day", StringUtil.replaceToXml(rec.pubc_dt_day));
			//rx.add(record, "tot_pubc1", StringUtil.replaceToXml(rec.tot_pubc1));
			//rx.add(record, "loss_pubc1", StringUtil.replaceToXml(rec.loss_pubc1));
			//rx.add(record, "tot_pubc2", StringUtil.replaceToXml(rec.tot_pubc2));
			//rx.add(record, "loss_pubc2", StringUtil.replaceToXml(rec.loss_pubc2));
			//rx.add(record, "tot_pubc3", StringUtil.replaceToXml(rec.tot_pubc3));
			//rx.add(record, "loss_pubc3", StringUtil.replaceToXml(rec.loss_pubc3));
			//rx.add(record, "adv_sum", StringUtil.replaceToXml(rec.adv_sum));
			//rx.add(record, "loss_sum", StringUtil.replaceToXml(rec.loss_sum));
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
<mc_budg_6261_l>
	<dataSet>
		<CURLIST>
			<record>
				<pubc_dt/>
				<week/>
				<pubc_dt_day/>
				<tot_pubc1/>
				<loss_pubc1/>
				<tot_pubc2/>
				<loss_pubc2/>
				<tot_pubc3/>
				<loss_pubc3/>
				<adv_sum/>
				<loss_sum/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_6261_l>
*/
%>

<% /* 작성시간 : Wed May 20 10:08:03 KST 2009 */ %>