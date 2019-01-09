<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papinout.rec.*
	,	chosun.ciis.mt.papinout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPINOUT_2501_LDataSet ds = (MT_PAPINOUT_2501_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	long ewh_state = 0;
	long owh_state = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPINOUT_2501_LCURLISTRecord rec = (MT_PAPINOUT_2501_LCURLISTRecord)ds.curlist.get(i);
			ewh_state = 0 ;
			owh_state = 0 ;
			int record = rx.add(recordSet, "record", "");
System.out.println("111");
			rx.add(record, "yymm", rec.yymm);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "plan_jji_rol", rec.plan_jji_rol);
			rx.add(record, "plan_jji_wt", rec.plan_jji_wt);
			rx.add(record, "base_jji_rol", rec.base_jji_rol);
			rx.add(record, "base_jji_wt", rec.base_jji_wt);
			rx.add(record, "base_ji_igrol", rec.base_ji_igrol);
			rx.add(record, "base_ji_igwt", rec.base_ji_igwt);
			rx.add(record, "base_ji_cgrol", rec.base_ji_cgrol);
			rx.add(record, "base_ji_cgwt", rec.base_ji_cgwt);
			rx.add(record, "ewh_plan_roll", rec.ewh_plan_roll);
			rx.add(record, "owh_plan_roll", rec.owh_plan_roll);
			rx.add(record, "ewh_plan_wgt", rec.ewh_plan_wgt);
			rx.add(record, "owh_plan_wgt", rec.owh_plan_wgt);
			rx.add(record, "save_work_frdt", rec.save_work_frdt);
			rx.add(record, "save_work_todt", rec.save_work_todt);
			System.out.println("222" + rec.ewh_plan_roll + ">>>1");
			if (Long.parseLong(rec.ewh_plan_roll) > 0 ) {

				 ewh_state = (Long.parseLong(rec.base_ji_igrol) * 100 / Long.parseLong(rec.ewh_plan_roll));

			}
			else {
				 ewh_state = 0;
			}
			if (Long.parseLong(rec.owh_plan_roll) > 0 ) {

				 owh_state  = (Long.parseLong(rec.base_ji_cgrol) * 100 / Long.parseLong(rec.owh_plan_roll));

			}
			else {
				 owh_state = 0;
			}
			System.out.println("333");
			rx.add(record, "ewh_state",    ewh_state + "%");
			rx.add(record, "owh_state",    owh_state + "%");
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
<dataSet>
	<CURLIST>
		<record>
			<yymm/>
			<fac_clsf/>
			<matr_cd/>
			<plan_jji_rol/>
			<plan_jji_wt/>
			<base_jji_rol/>
			<base_jji_wt/>
			<base_ji_igrol/>
			<base_ji_igwt/>
			<base_ji_cgrol/>
			<base_ji_cgwt/>
			<ewh_plan_roll/>
			<owh_plan_roll/>
			<ewh_plan_wgt/>
			<owh_plan_wgt/>
			<save_work_frdt/>
			<save_work_todt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Sat Apr 25 09:20:30 KST 2009 */ %>