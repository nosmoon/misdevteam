<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pl.cls.rec.*
	,	chosun.ciis.pl.cls.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PL_CLS_1740_LDataSet ds = (PL_CLS_1740_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** PTCRLIST BEGIN */
		recordSet = rx.add(dataSet, "PTCRLIST", "");

		for(int i = 0; i < ds.ptcrlist.size(); i++) {
			PL_CLS_1740_LPTCRLISTRecord rec = (PL_CLS_1740_LPTCRLISTRecord)ds.ptcrlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "yymm", rec.yymm);
			rx.add(record, "gnr_qty", rec.gnr_qty);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "net_sale_amt", rec.net_sale_amt);
			rx.add(record, "slip_yn", rec.slip_yn);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			//rx.add(record, "yymm", StringUtil.replaceToXml(rec.yymm));
			//rx.add(record, "gnr_qty", StringUtil.replaceToXml(rec.gnr_qty));
			//rx.add(record, "amt", StringUtil.replaceToXml(rec.amt));
			//rx.add(record, "net_sale_amt", StringUtil.replaceToXml(rec.net_sale_amt));
			//rx.add(record, "slip_yn", StringUtil.replaceToXml(rec.slip_yn));
			//rx.add(record, "incmg_dt_tm", StringUtil.replaceToXml(rec.incmg_dt_tm));
			//rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
			//rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
			//rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
		}
		rx.add(recordSet, "totalcnt", ds.ptcrlist.size());
		/****** PTCRLIST END */

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
<pl_cls_1740_l>
	<dataSet>
		<PTCRLIST>
			<record>
				<yymm/>
				<gnr_qty/>
				<amt/>
				<net_sale_amt/>
				<slip_yn/>
				<incmg_dt_tm/>
				<slip_occr_dt/>
				<slip_seq/>
				<slip_clsf_cd/>
			</record>
		</PTCRLIST>
	</dataSet>
</pl_cls_1740_l>
*/
%>

<% /* 작성시간 : Fri Mar 31 10:54:08 KST 2017 */ %>