<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.etccar.rec.*
	,	chosun.ciis.mt.etccar.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_ETCCAR_1002_MDataSet ds = (MT_ETCCAR_1002_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");
		
		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_ETCCAR_1002_MCURLIST1Record rec = (MT_ETCCAR_1002_MCURLIST1Record)ds.curlist1.get(0);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			rx.add(record, "buy_lent_clsf", StringUtil.replaceToXml(rec.buy_lent_clsf));
			rx.add(record, "car_no", StringUtil.replaceToXml(rec.car_no));
			rx.add(record, "car_modl", StringUtil.replaceToXml(rec.car_modl));
			rx.add(record, "oil_kind", StringUtil.replaceToXml(rec.oil_kind));
			rx.add(record, "cmpy_mang_nm", StringUtil.replaceToXml(rec.cmpy_mang_nm));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "buy_lent_clsf", StringUtil.replaceToXml(rec.buy_lent_clsf));
			//rx.add(record, "car_no", StringUtil.replaceToXml(rec.car_no));
			//rx.add(record, "car_modl", StringUtil.replaceToXml(rec.car_modl));
			//rx.add(record, "oil_kind", StringUtil.replaceToXml(rec.oil_kind));
			//rx.add(record, "cmpy_mang_nm", StringUtil.replaceToXml(rec.cmpy_mang_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */
		
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_ETCCAR_1002_MCURLIST2Record rec = (MT_ETCCAR_1002_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "car_no", StringUtil.replaceToXml(rec.car_no));
			rx.add(record, "car_modl", StringUtil.replaceToXml(rec.car_modl));
			rx.add(record, "use_usag", StringUtil.replaceToXml(rec.use_usag));
			rx.add(record, "cmpy_mang_nm", StringUtil.replaceToXml(rec.cmpy_mang_nm));
			rx.add(record, "buy_lent_clsf", StringUtil.replaceToXml(rec.buy_lent_clsf));
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			
			//String[] occr_dt = null;
			//occr_dt = rec.occr_dt.split(",");
			//if(occr_dt.length > 1){
			//	rx.add(record, "occr_dt", occr_dt[0]);
			//	//rx.add(record, "cmpy_mang_nm", occr_dt[1]);
			//}else{
			//	rx.add(record, "occr_dt", occr_dt[0]);
			//	//rx.add(record, "cmpy_mang_nm", occr_dt[1]);
			//}
			//rx.add(record, "occr_dt", rec.occr_dt);
			//rx.add(record, "car_no", StringUtil.replaceToXml(rec.car_no));
			//rx.add(record, "car_modl", StringUtil.replaceToXml(rec.car_modl));
			//rx.add(record, "use_usag", StringUtil.replaceToXml(rec.use_usag));
			//rx.add(record, "buy_lent_clsf", StringUtil.replaceToXml(rec.buy_lent_clsf));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */
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
<mt_etccar_1002_m>
	<tempData>
		<CURLIST1>
			<record>
				<occr_dt/>
				<seq/>
				<buy_lent_clsf/>
				<car_no/>
				<car_modl/>
				<oil_kind/>
				<cmpy_mang_nm/>
			</record>
		</CURLIST1>
	</tempData>
</mt_etccar_1002_m>
<mt_etccar_1002_m>
<dataSet>
	<CURLIST2>
		<record>
			<car_no/>
			<car_modl/>
			<use_usag/>
			<buy_lent_clsf/>
			<seq/>
			<occr_dt/>
		</record>
	</CURLIST2>
</dataSet>
</mt_etccar_1002_m>
*/
%>

<% /* 작성시간 : Sun Apr 12 14:34:58 KST 2009 */ %>