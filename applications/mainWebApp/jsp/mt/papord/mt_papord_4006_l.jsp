<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.papord.rec.*
	,	chosun.ciis.mt.papord.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPORD_4006_LDataSet ds = (MT_PAPORD_4006_LDataSet)request.getAttribute("ds");
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
			MT_PAPORD_4006_LCURLISTRecord rec = (MT_PAPORD_4006_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "pcnt", rec.pcnt);
			rx.add(record, "dual_out_clsf", rec.dual_out_clsf);
			rx.add(record, "std", rec.std);
			rx.add(record, "prt_clsf", rec.prt_clsf);
			rx.add(record, "slip_qty", rec.slip_qty);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "sect_nm", rec.sect_nm);
			rx.add(record, "dual_out_nm", rec.dual_out_nm);
			rx.add(record, "roll_wgt_a", rec.roll_wgt_a);
			rx.add(record, "roll_wgt_b", rec.roll_wgt_b);
			rx.add(record, "roll_wgt_c", rec.roll_wgt_c);
			rx.add(record, "wgt_a", rec.a_wgt);
			rx.add(record, "wgt_b", rec.b_wgt);
			rx.add(record, "wgt_c", rec.c_wgt);
			rx.add(record, "roll_cnt_a", "");
			rx.add(record, "roll_cnt_b", "");
			rx.add(record, "roll_cnt_c", "");
			rx.add(record, "matr_cd_a", "");
			rx.add(record, "matr_cd_b", "");
			rx.add(record, "matr_cd_c", "");
			rx.add(record, "tot_wgt", rec.tot_wgt);
			
			
			//rx.add(record, "issu_dt", StringUtil.replaceToXml(rec.issu_dt));
			//rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "sect_cd", StringUtil.replaceToXml(rec.sect_cd));
			//rx.add(record, "pcnt", StringUtil.replaceToXml(rec.pcnt));
			//rx.add(record, "dual_out_clsf", StringUtil.replaceToXml(rec.dual_out_clsf));
			//rx.add(record, "slip_qty", StringUtil.replaceToXml(rec.slip_qty));
			//rx.add(record, "fac_clsf_nm", StringUtil.replaceToXml(rec.fac_clsf_nm));
			//rx.add(record, "medi_nm", StringUtil.replaceToXml(rec.medi_nm));
			//rx.add(record, "sect_nm", StringUtil.replaceToXml(rec.sect_nm));
			//rx.add(record, "dual_out_nm", StringUtil.replaceToXml(rec.dual_out_nm));
		}
		//rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

		recordSet = rx.add(dataSet, "pap_clsf_a", "");
		if (ds.curlist_1.size() > 0){
			for(int i = 0; i < ds.curlist_1.size(); i++) {
				MT_PAPORD_4006_LCURLIST_1Record rec = (MT_PAPORD_4006_LCURLIST_1Record)ds.curlist_1.get(i);
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "label", rec.matr_nm);
				rx.add(record, "value", rec.roll_wgt);
				rx.add(record, "matr", rec.matr_cd);
			}
		}
		
		recordSet = rx.add(dataSet, "pap_clsf_b", "");
		if (ds.curlist_2.size() > 0){
			for(int i = 0; i < ds.curlist_2.size(); i++) {
				MT_PAPORD_4006_LCURLIST_2Record rec = (MT_PAPORD_4006_LCURLIST_2Record)ds.curlist_2.get(i);
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "label", rec.matr_nm);
				rx.add(record, "value", rec.roll_wgt);
				rx.add(record, "matr", rec.matr_cd);
			}
		}
		
		recordSet = rx.add(dataSet, "pap_clsf_c", "");
		if (ds.curlist_3.size() > 0){
			for(int i = 0; i < ds.curlist_3.size(); i++) {
				MT_PAPORD_4006_LCURLIST_3Record rec = (MT_PAPORD_4006_LCURLIST_3Record)ds.curlist_3.get(i);
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "label", rec.matr_nm);
				rx.add(record, "value", rec.roll_wgt);
				rx.add(record, "matr", rec.matr_cd);
			}
		}
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
<mt_papord_4006_l>
	<dataSet>
		<CURLIST>
			<record>
				<issu_dt/>
				<fac_clsf/>
				<medi_cd/>
				<sect_cd/>
				<pcnt/>
				<dual_out_clsf/>
				<slip_qty/>
				<fac_clsf_nm/>
				<medi_nm/>
				<sect_nm/>
				<dual_out_nm/>
			</record>
		</CURLIST>
	</dataSet>
</mt_papord_4006_l>
*/
%>

<% /* 작성시간 : Wed Jul 01 15:33:52 KST 2009 */ %>