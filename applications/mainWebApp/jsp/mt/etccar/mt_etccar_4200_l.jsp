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
	MT_ETCCAR_4200_LDataSet ds = (MT_ETCCAR_4200_LDataSet)request.getAttribute("ds");
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
			MT_ETCCAR_4200_LCURLISTRecord rec = (MT_ETCCAR_4200_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "use_dt", rec.use_dt);
			rx.add(record, "car_no", rec.car_no);
			rx.add(record, "cmpy_mang_nm", rec.cmpy_mang_nm);
			rx.add(record, "clam_item_kind", rec.clam_item_kind);
			rx.add(record, "item_nm", rec.item_nm);
			rx.add(record, "dlco", rec.dlco);
			rx.add(record, "qunt", rec.qunt);
			int unit = 0;
			if(rec.clam_amt < 1 && rec.qunt < 1){
				unit = 0;
			}else{
				unit = rec.clam_amt/rec.qunt;
			}
			rx.add(record, "unit", unit);
			rx.add(record, "clam_amt", rec.clam_amt);
			//rx.add(record, "use_dt", StringUtil.replaceToXml(rec.use_dt));
			//rx.add(record, "car_no", StringUtil.replaceToXml(rec.car_no));
			//rx.add(record, "cmpy_mang_nm", StringUtil.replaceToXml(rec.cmpy_mang_nm));
			//rx.add(record, "clam_item_kind", StringUtil.replaceToXml(rec.clam_item_kind));
			//rx.add(record, "item_nm", StringUtil.replaceToXml(rec.item_nm));
			//rx.add(record, "dlco", StringUtil.replaceToXml(rec.dlco));
			//rx.add(record, "qunt", StringUtil.replaceToXml(rec.qunt));
			//rx.add(record, "clam_amt", StringUtil.replaceToXml(rec.clam_amt));
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
<mt_etccar_4200_l>
	<dataSet>
		<CURLIST>
			<record>
				<use_dt/>
				<car_no/>
				<cmpy_mang_nm/>
				<clam_item_kind/>
				<item_nm/>
				<dlco/>
				<qunt/>
				<clam_amt/>
			</record>
		</CURLIST>
	</dataSet>
</mt_etccar_4200_l>
*/
%>

<% /* 작성시간 : Thu Apr 16 20:36:12 KST 2009 */ %>