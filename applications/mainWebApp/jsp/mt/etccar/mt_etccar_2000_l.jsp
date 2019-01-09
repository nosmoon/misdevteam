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
	MT_ETCCAR_2000_LDataSet ds = (MT_ETCCAR_2000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_ETCCAR_2000_LCURLIST1Record rec = (MT_ETCCAR_2000_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "driv_dt", rec.driv_dt);
			rx.add(record, "car_no", rec.car_no);
			rx.add(record, "cmpy_mang_nm", rec.cmpy_mang_nm);
			rx.add(record, "runt", rec.runt);
			rx.add(record, "gag", rec.gag);
			rx.add(record, "drvr_nm", rec.drvr_nm);
			rx.add(record, "rid_pers", rec.rid_pers);
			rx.add(record, "rid_deptcd", rec.rid_deptcd);
			rx.add(record, "driv_purp", rec.driv_purp);
			rx.add(record, "buyoil_tm", rec.buyoil_tm);
			rx.add(record, "buyoil_qunt", rec.buyoil_qunt);
			rx.add(record, "buyoil_gag", rec.buyoil_gag);
			rx.add(record, "outsd_oil_qunt", rec.outsd_oil_qunt);
			//rx.add(record, "driv_dt", StringUtil.replaceToXml(rec.driv_dt));
			//rx.add(record, "car_no", StringUtil.replaceToXml(rec.car_no));
			//rx.add(record, "cmpy_mang_nm", StringUtil.replaceToXml(rec.cmpy_mang_nm));
			//rx.add(record, "runt", StringUtil.replaceToXml(rec.runt));
			//rx.add(record, "gag", StringUtil.replaceToXml(rec.gag));
			//rx.add(record, "drvr_nm", StringUtil.replaceToXml(rec.drvr_nm));
			//rx.add(record, "rid_pers", StringUtil.replaceToXml(rec.rid_pers));
			//rx.add(record, "rid_deptcd", StringUtil.replaceToXml(rec.rid_deptcd));
			//rx.add(record, "driv_purp", StringUtil.replaceToXml(rec.driv_purp));
			//rx.add(record, "buyoil_tm", StringUtil.replaceToXml(rec.buyoil_tm));
			//rx.add(record, "buyoil_qunt", StringUtil.replaceToXml(rec.buyoil_qunt));
			//rx.add(record, "buyoil_gag", StringUtil.replaceToXml(rec.buyoil_gag));
			//rx.add(record, "outsd_oil_qunt", StringUtil.replaceToXml(rec.outsd_oil_qunt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
<mt_etccar_2000_l>
	<dataSet>
		<CURLIST1>
			<record>
				<driv_dt/>
				<car_no/>
				<cmpy_mang_nm/>
				<runt/>
				<gag/>
				<drvr_nm/>
				<rid_pers/>
				<rid_deptcd/>
				<driv_purp/>
				<buyoil_tm/>
				<buyoil_qunt/>
				<buyoil_gag/>
				<outsd_oil_qunt/>
			</record>
		</CURLIST1>
	</dataSet>
</mt_etccar_2000_l>
*/
%>

<% /* 작성시간 : Tue Apr 14 15:06:38 KST 2009 */ %>