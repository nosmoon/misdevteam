<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.lvcmpy.rec.*
	,	chosun.ciis.hd.lvcmpy.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_LVCMPY_1104_LDataSet ds = (HD_LVCMPY_1104_LDataSet)request.getAttribute("ds");
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
			HD_LVCMPY_1104_LCURLIST2Record rec = (HD_LVCMPY_1104_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "saly_total_cnt", rec.saly_total_cnt);
			rx.add(record, "sum_total_saly1", rec.sum_total_saly1);
			rx.add(record, "sum_total_saly2", rec.sum_total_saly2);
			rx.add(record, "sum_total_yymm1", rec.sum_total_yymm1);
			rx.add(record, "sum_total_yymm2", rec.sum_total_yymm2);
			rx.add(record, "sum_total_hody1", rec.sum_total_hody1);
			rx.add(record, "sum_total_hody2", rec.sum_total_hody2);
			//rx.add(record, "saly_total_cnt", StringUtil.replaceToXml(rec.saly_total_cnt));
			//rx.add(record, "sum_total_saly1", StringUtil.replaceToXml(rec.sum_total_saly1));
			//rx.add(record, "sum_total_saly2", StringUtil.replaceToXml(rec.sum_total_saly2));
			//rx.add(record, "sum_total_yymm1", StringUtil.replaceToXml(rec.sum_total_yymm1));
			//rx.add(record, "sum_total_yymm2", StringUtil.replaceToXml(rec.sum_total_yymm2));
			//rx.add(record, "sum_total_hody1", StringUtil.replaceToXml(rec.sum_total_hody1));
			//rx.add(record, "sum_total_hody2", StringUtil.replaceToXml(rec.sum_total_hody2));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_LVCMPY_1104_LCURLISTRecord rec = (HD_LVCMPY_1104_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "saly_pay_mm", rec.saly_pay_mm);
			rx.add(record, "saly_fr_dt", rec.saly_fr_dt);
			rx.add(record, "saly_to_dt", rec.saly_to_dt);
			rx.add(record, "saly_cnt", rec.saly_cnt);
			rx.add(record, "pay_saly1", rec.pay_saly1);
			rx.add(record, "pay_saly2", rec.pay_saly2);
			rx.add(record, "yymm_alon1", rec.yymm_alon1);
			rx.add(record, "yymm_alon2", rec.yymm_alon2);
			rx.add(record, "hody_alon1", rec.hody_alon1);
			rx.add(record, "hody_alon2", rec.hody_alon2);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "saly_pay_mm", StringUtil.replaceToXml(rec.saly_pay_mm));
			//rx.add(record, "saly_fr_dt", StringUtil.replaceToXml(rec.saly_fr_dt));
			//rx.add(record, "saly_to_dt", StringUtil.replaceToXml(rec.saly_to_dt));
			//rx.add(record, "saly_cnt", StringUtil.replaceToXml(rec.saly_cnt));
			//rx.add(record, "pay_saly1", StringUtil.replaceToXml(rec.pay_saly1));
			//rx.add(record, "pay_saly2", StringUtil.replaceToXml(rec.pay_saly2));
			//rx.add(record, "yymm_alon1", StringUtil.replaceToXml(rec.yymm_alon1));
			//rx.add(record, "yymm_alon2", StringUtil.replaceToXml(rec.yymm_alon2));
			//rx.add(record, "hody_alon1", StringUtil.replaceToXml(rec.hody_alon1));
			//rx.add(record, "hody_alon2", StringUtil.replaceToXml(rec.hody_alon2));
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
<hd_lvcmpy_1104_l>
	<dataSet>
		<CURLIST2>
			<record>
				<saly_total_cnt/>
				<sum_total_saly1/>
				<sum_total_saly2/>
				<sum_total_yymm1/>
				<sum_total_yymm2/>
				<sum_total_hody1/>
				<sum_total_hody2/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_lvcmpy_1104_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_lvcmpy_1104_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<saly_pay_mm/>
				<saly_fr_dt/>
				<saly_to_dt/>
				<saly_cnt/>
				<pay_saly1/>
				<pay_saly2/>
				<yymm_alon1/>
				<yymm_alon2/>
				<hody_alon1/>
				<hody_alon2/>
			</record>
		</CURLIST>
	</dataSet>
</hd_lvcmpy_1104_l>
*/
%>

<% /* 작성시간 : Fri Nov 18 18:29:09 KST 2016 */ %>