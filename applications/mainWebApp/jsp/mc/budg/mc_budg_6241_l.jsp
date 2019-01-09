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
	MC_BUDG_6241_LDataSet ds = (MC_BUDG_6241_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_6241_LCURLISTRecord rec = (MC_BUDG_6241_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "pubc_dt", rec.pubc_dt);
			rx.add(record, "week", rec.week);
			rx.add(record, "tot_pubc1", rec.tot_pubc1);
			rx.add(record, "adv_pubc1", rec.adv_pubc1);
			rx.add(record, "adv_squar1", rec.adv_squar1);
			rx.add(record, "uprc1", rec.uprc1);
			rx.add(record, "adv_fee1", rec.adv_fee1);
			rx.add(record, "loss_pubc1", rec.loss_pubc1);
			rx.add(record, "loss_squar1", rec.loss_squar1);
			rx.add(record, "loss_uprc1", rec.loss_uprc1);
			rx.add(record, "loss_adv_fee1", rec.loss_adv_fee1);
			rx.add(record, "tot_pubc2", rec.tot_pubc2);
			rx.add(record, "adv_pubc2", rec.adv_pubc2);
			rx.add(record, "adv_squar2", rec.adv_squar2);
			rx.add(record, "uprc2", rec.uprc2);
			rx.add(record, "adv_fee2", rec.adv_fee2);
			rx.add(record, "loss_pubc2", rec.loss_pubc2);
			rx.add(record, "loss_squar2", rec.loss_squar2);
			rx.add(record, "loss_uprc2", rec.loss_uprc2);
			rx.add(record, "loss_adv_fee2", rec.loss_adv_fee2);
			rx.add(record, "tot_pubc3", rec.tot_pubc3);
			rx.add(record, "adv_pubc3", rec.adv_pubc3);
			rx.add(record, "adv_squar3", rec.adv_squar3);
			rx.add(record, "uprc3", rec.uprc3);
			rx.add(record, "adv_fee3", rec.adv_fee3);
			rx.add(record, "loss_pubc3", rec.loss_pubc3);
			rx.add(record, "loss_squar3", rec.loss_squar3);
			rx.add(record, "loss_uprc3", rec.loss_uprc3);
			rx.add(record, "loss_adv_fee", rec.loss_adv_fee);
			rx.add(record, "tot_pubc4", rec.tot_pubc4);
			rx.add(record, "adv_pubc4", rec.adv_pubc4);
			rx.add(record, "adv_squar4", rec.adv_squar4);
			rx.add(record, "uprc4", rec.uprc4);
			rx.add(record, "adv_fee4", rec.adv_fee4);
			rx.add(record, "loss_pubc4", rec.loss_pubc4);
			rx.add(record, "loss_squar4", rec.loss_squar4);
			rx.add(record, "loss_uprc4", rec.loss_uprc4);
			rx.add(record, "loss_adv_fee4", rec.loss_adv_fee4);
			//rx.add(record, "pubc_dt", StringUtil.replaceToXml(rec.pubc_dt));
			//rx.add(record, "week", StringUtil.replaceToXml(rec.week));
			//rx.add(record, "tot_pubc1", StringUtil.replaceToXml(rec.tot_pubc1));
			//rx.add(record, "adv_pubc1", StringUtil.replaceToXml(rec.adv_pubc1));
			//rx.add(record, "adv_squar1", StringUtil.replaceToXml(rec.adv_squar1));
			//rx.add(record, "uprc1", StringUtil.replaceToXml(rec.uprc1));
			//rx.add(record, "adv_fee1", StringUtil.replaceToXml(rec.adv_fee1));
			//rx.add(record, "loss_pubc1", StringUtil.replaceToXml(rec.loss_pubc1));
			//rx.add(record, "loss_squar1", StringUtil.replaceToXml(rec.loss_squar1));
			//rx.add(record, "loss_uprc1", StringUtil.replaceToXml(rec.loss_uprc1));
			//rx.add(record, "loss_adv_fee1", StringUtil.replaceToXml(rec.loss_adv_fee1));
			//rx.add(record, "tot_pubc2", StringUtil.replaceToXml(rec.tot_pubc2));
			//rx.add(record, "adv_pubc2", StringUtil.replaceToXml(rec.adv_pubc2));
			//rx.add(record, "adv_squar2", StringUtil.replaceToXml(rec.adv_squar2));
			//rx.add(record, "uprc2", StringUtil.replaceToXml(rec.uprc2));
			//rx.add(record, "adv_fee2", StringUtil.replaceToXml(rec.adv_fee2));
			//rx.add(record, "loss_pubc2", StringUtil.replaceToXml(rec.loss_pubc2));
			//rx.add(record, "loss_squar2", StringUtil.replaceToXml(rec.loss_squar2));
			//rx.add(record, "loss_uprc2", StringUtil.replaceToXml(rec.loss_uprc2));
			//rx.add(record, "loss_adv_fee2", StringUtil.replaceToXml(rec.loss_adv_fee2));
			//rx.add(record, "tot_pubc3", StringUtil.replaceToXml(rec.tot_pubc3));
			//rx.add(record, "adv_pubc3", StringUtil.replaceToXml(rec.adv_pubc3));
			//rx.add(record, "adv_squar3", StringUtil.replaceToXml(rec.adv_squar3));
			//rx.add(record, "uprc3", StringUtil.replaceToXml(rec.uprc3));
			//rx.add(record, "adv_fee3", StringUtil.replaceToXml(rec.adv_fee3));
			//rx.add(record, "loss_pubc3", StringUtil.replaceToXml(rec.loss_pubc3));
			//rx.add(record, "loss_squar3", StringUtil.replaceToXml(rec.loss_squar3));
			//rx.add(record, "loss_uprc3", StringUtil.replaceToXml(rec.loss_uprc3));
			//rx.add(record, "loss_adv_fee", StringUtil.replaceToXml(rec.loss_adv_fee));
			//rx.add(record, "tot_pubc4", StringUtil.replaceToXml(rec.tot_pubc4));
			//rx.add(record, "adv_pubc4", StringUtil.replaceToXml(rec.adv_pubc4));
			//rx.add(record, "adv_squar4", StringUtil.replaceToXml(rec.adv_squar4));
			//rx.add(record, "uprc4", StringUtil.replaceToXml(rec.uprc4));
			//rx.add(record, "adv_fee4", StringUtil.replaceToXml(rec.adv_fee4));
			//rx.add(record, "loss_pubc4", StringUtil.replaceToXml(rec.loss_pubc4));
			//rx.add(record, "loss_squar4", StringUtil.replaceToXml(rec.loss_squar4));
			//rx.add(record, "loss_uprc4", StringUtil.replaceToXml(rec.loss_uprc4));
			//rx.add(record, "loss_adv_fee4", StringUtil.replaceToXml(rec.loss_adv_fee4));
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
<mc_budg_6241_l>
	<dataSet>
		<CURLIST>
			<record>
				<pubc_dt/>
				<week/>
				<tot_pubc1/>
				<adv_pubc1/>
				<adv_squar1/>
				<uprc1/>
				<adv_fee1/>
				<loss_pubc1/>
				<loss_squar1/>
				<loss_uprc1/>
				<loss_adv_fee1/>
				<tot_pubc2/>
				<adv_pubc2/>
				<adv_squar2/>
				<uprc2/>
				<adv_fee2/>
				<loss_pubc2/>
				<loss_squar2/>
				<loss_uprc2/>
				<loss_adv_fee2/>
				<tot_pubc3/>
				<adv_pubc3/>
				<adv_squar3/>
				<uprc3/>
				<adv_fee3/>
				<loss_pubc3/>
				<loss_squar3/>
				<loss_uprc3/>
				<loss_adv_fee/>
				<tot_pubc4/>
				<adv_pubc4/>
				<adv_squar4/>
				<uprc4/>
				<adv_fee4/>
				<loss_pubc4/>
				<loss_squar4/>
				<loss_uprc4/>
				<loss_adv_fee4/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_6241_l>
*/
%>

<% /* 작성시간 : Wed May 20 10:08:03 KST 2009 */ %>