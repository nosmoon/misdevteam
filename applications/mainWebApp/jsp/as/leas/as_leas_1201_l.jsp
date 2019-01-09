<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.as.leas.rec.*
	,	chosun.ciis.as.leas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_LEAS_1201_LDataSet ds = (AS_LEAS_1201_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			AS_LEAS_1201_LCURLIST1Record rec = (AS_LEAS_1201_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "clam_yymm", rec.clam_yymm);
			rx.add(record, "clam_dt", rec.clam_dt);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "slip_apprv_yn", rec.slip_apprv_yn);
			rx.add(record, "clam_cnt", rec.clam_cnt);
			rx.add(record, "clam_tot_amt", rec.clam_tot_amt);
			rx.add(record, "clam_tot_cnt", rec.clam_tot_cnt);
			rx.add(record, "upd_slip_yn", rec.upd_slip_yn);
			rx.add(record, "canc_dy", rec.canc_dy);
			rx.add(record, "clam_fix_yn", rec.clam_fix_yn);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "clam_seq", rec.clam_seq);
			//rx.add(record, "clam_yymm", StringUtil.replaceToXml(rec.clam_yymm));
			//rx.add(record, "clam_dt", StringUtil.replaceToXml(rec.clam_dt));
			//rx.add(record, "slip_no", StringUtil.replaceToXml(rec.slip_no));
			//rx.add(record, "slip_apprv_yn", StringUtil.replaceToXml(rec.slip_apprv_yn));
			//rx.add(record, "clam_cnt", StringUtil.replaceToXml(rec.clam_cnt));
			//rx.add(record, "clam_tot_amt", StringUtil.replaceToXml(rec.clam_tot_amt));
			//rx.add(record, "clam_tot_cnt", StringUtil.replaceToXml(rec.clam_tot_cnt));
			//rx.add(record, "upd_slip_yn", StringUtil.replaceToXml(rec.upd_slip_yn));
			//rx.add(record, "canc_dy", StringUtil.replaceToXml(rec.canc_dy));
			//rx.add(record, "clam_fix_yn", StringUtil.replaceToXml(rec.clam_fix_yn));
			//rx.add(record, "incmg_dt_tm", StringUtil.replaceToXml(rec.incmg_dt_tm));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "clam_seq", StringUtil.replaceToXml(rec.clam_seq));
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
<as_leas_1201_l>
	<dataSet>
		<CURLIST1>
			<record>
				<clam_yymm/>
				<clam_dt/>
				<slip_no/>
				<slip_apprv_yn/>
				<clam_cnt/>
				<clam_tot_amt/>
				<clam_tot_cnt/>
				<upd_slip_yn/>
				<canc_dy/>
				<clam_fix_yn/>
				<incmg_dt_tm/>
				<nm_korn/>
				<cmpy_cd/>
				<clam_seq/>
			</record>
		</CURLIST1>
	</dataSet>
</as_leas_1201_l>
*/
%>

<% /* 작성시간 : Fri Jul 10 17:52:02 KST 2009 */ %>