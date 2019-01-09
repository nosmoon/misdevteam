<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pl.rtn.rec.*
	,	chosun.ciis.pl.rtn.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PL_RTN_1410_LDataSet ds = (PL_RTN_1410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "gridData", "");

	try {
		/****** DEAL_PTCRLIST BEGIN */
		recordSet = rx.add(dataSet, "DEAL_PTCRLIST", "");

		for(int i = 0; i < ds.deal_ptcrlist.size(); i++) {
			PL_RTN_1410_LDEAL_PTCRLISTRecord rec = (PL_RTN_1410_LDEAL_PTCRLISTRecord)ds.deal_ptcrlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "issu_cmpy", rec.issu_cmpy);
			rx.add(record, "issu_cmpy_nm", rec.issu_cmpy_nm);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "ecnt_seq", rec.ecnt_seq);
			rx.add(record, "ecnt", rec.ecnt);
			rx.add(record, "medi_ser_no", rec.medi_ser_no);
			rx.addCData(record, "medi_nm", rec.medi_nm);
			rx.add(record, "reg_dt", rec.reg_dt);
			rx.add(record, "ewh_qty", rec.ewh_qty);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "ewh_dt", rec.ewh_dt); 
			rx.add(record, "ewh_clsf", rec.ewh_clsf);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "wh_cd", rec.wh_cd);
			//rx.add(record, "issu_cmpy", StringUtil.replaceToXml(rec.issu_cmpy));
			//rx.add(record, "issu_cmpy_nm", StringUtil.replaceToXml(rec.issu_cmpy_nm));
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "ecnt_seq", StringUtil.replaceToXml(rec.ecnt_seq));
			//rx.add(record, "ecnt", StringUtil.replaceToXml(rec.ecnt));
			//rx.add(record, "medi_ser_no", StringUtil.replaceToXml(rec.medi_ser_no));
			//rx.add(record, "medi_nm", StringUtil.replaceToXml(rec.medi_nm));
			//rx.add(record, "reg_dt", StringUtil.replaceToXml(rec.reg_dt));
			//rx.add(record, "wh_stok_qty_1", StringUtil.replaceToXml(rec.wh_stok_qty_1));
			//rx.add(record, "wh_stok_qty_2", StringUtil.replaceToXml(rec.wh_stok_qty_2));
			//rx.add(record, "wh_stok_qty_3", StringUtil.replaceToXml(rec.wh_stok_qty_3));
			//rx.add(record, "wh_stok_qty_5", StringUtil.replaceToXml(rec.wh_stok_qty_5));
			//rx.add(record, "wh_stok_qty_7", StringUtil.replaceToXml(rec.wh_stok_qty_7));
			//rx.add(record, "absence_qty", StringUtil.replaceToXml(rec.absence_qty));
		}
		rx.add(recordSet, "totalcnt", ds.deal_ptcrlist.size());
		/****** DEAL_PTCRLIST END */

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
<pl_rtn_1410_l>
	<dataSet>
		<DEAL_PTCRLIST>
			<record>
				<issu_cmpy/>
				<issu_cmpy_nm/>
				<medi_cd/>
				<ecnt_seq/>
				<ecnt/>
				<medi_ser_no/>
				<medi_nm/>
				<reg_dt/>
				<wh_stok_qty_1/>
				<wh_stok_qty_2/>
				<wh_stok_qty_3/>
				<wh_stok_qty_5/>
				<wh_stok_qty_7/>
				<absence_qty/>
			</record>
		</DEAL_PTCRLIST>
	</dataSet>
</pl_rtn_1410_l>
*/
%>

<% /* 작성시간 : Tue Apr 03 18:41:03 KST 2018 */ %>