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
	MT_ETCCAR_9101_LDataSet ds = (MT_ETCCAR_9101_LDataSet)request.getAttribute("ds");
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
			MT_ETCCAR_9101_LCURLISTRecord rec = (MT_ETCCAR_9101_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "start_dt", rec.start_dt);
			rx.add(record, "start_tm", rec.start_tm);
			rx.add(record, "ariv_dt", rec.ariv_dt);
			rx.add(record, "ariv_tm", rec.ariv_tm);
			rx.addCData(record, "dest", rec.dest);
			rx.add(record, "rid_pers", rec.rid_pers);
			rx.add(record, "rid_pers_cnt", rec.rid_pers_cnt);
			rx.add(record, "rid_deptcd", rec.rid_deptcd);
			rx.add(record, "rid_deptcd_nm", rec.rid_deptcd_nm);
			rx.add(record, "driv_purp", rec.driv_purp);
			rx.add(record, "driv_purp_nm", rec.driv_purp_nm);
			rx.add(record, "req_stat", rec.req_stat);
			rx.add(record, "req_stat_nm", rec.req_stat_nm);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "chg_pers", rec.chg_pers);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
			rx.addCData(record, "remk", rec.remk);
			rx.add(record, "drvr_yn", rec.drvr_yn);
			rx.add(record, "drvr_yn_nm", rec.drvr_yn_nm);
			rx.add(record, "car_no"				, rec.car_no);
			rx.add(record, "drvr_nm"      , rec.drvr_nm);
			rx.add(record, "tel_no"       , rec.tel_no);
			rx.add(record, "driv_pers"    , rec.driv_pers);
			rx.add(record, "driv_dt_tm"   , rec.driv_dt_tm);
			rx.add(record, "cancle_pers"  , rec.cancle_pers);
			rx.add(record, "cancle_dt_tm" , rec.cancle_dt_tm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "cmpy_cd_nm", rec.cmpy_cd_nm);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "ptph_no", rec.ptph_no);
			rx.add(record, "rid_tel_no", rec.rid_tel_no);
			rx.add(record, "canc_caus", rec.canc_caus);	
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "start_dt", StringUtil.replaceToXml(rec.start_dt));
			//rx.add(record, "start_tm", StringUtil.replaceToXml(rec.start_tm));
			//rx.add(record, "ariv_dt", StringUtil.replaceToXml(rec.ariv_dt));
			//rx.add(record, "ariv_tm", StringUtil.replaceToXml(rec.ariv_tm));
			//rx.add(record, "dest", StringUtil.replaceToXml(rec.dest));
			//rx.add(record, "drvr_nm", StringUtil.replaceToXml(rec.drvr_nm));
			//rx.add(record, "rid_pers", StringUtil.replaceToXml(rec.rid_pers));
			//rx.add(record, "rid_pers_cnt", StringUtil.replaceToXml(rec.rid_pers_cnt));
			//rx.add(record, "rid_deptcd", StringUtil.replaceToXml(rec.rid_deptcd));
			//rx.add(record, "rid_deptcd_nm", StringUtil.replaceToXml(rec.rid_deptcd_nm));
			//rx.add(record, "driv_purp", StringUtil.replaceToXml(rec.driv_purp));
			//rx.add(record, "driv_purp_nm", StringUtil.replaceToXml(rec.driv_purp_nm));
			//rx.add(record, "req_stat", StringUtil.replaceToXml(rec.req_stat));
			//rx.add(record, "req_stat_nm", StringUtil.replaceToXml(rec.req_stat_nm));
			//rx.add(record, "incmg_pers", StringUtil.replaceToXml(rec.incmg_pers));
			//rx.add(record, "incmg_dt_tm", StringUtil.replaceToXml(rec.incmg_dt_tm));
			//rx.add(record, "chg_pers", StringUtil.replaceToXml(rec.chg_pers));
			//rx.add(record, "chg_dt_tm", StringUtil.replaceToXml(rec.chg_dt_tm));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
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
<mt_etccar_9101_l>
	<dataSet>
		<CURLIST>
			<record>
				<occr_dt/>
				<seq/>
				<start_dt/>
				<start_tm/>
				<ariv_dt/>
				<ariv_tm/>
				<dest/>
				<rid_pers/>
				<rid_pers_cnt/>
				<rid_deptcd/>
				<rid_deptcd_nm/>
				<driv_purp/>
				<driv_purp_nm/>
				<req_stat/>
				<req_stat_nm/>
				<incmg_pers/>
				<incmg_dt_tm/>
				<chg_pers/>
				<chg_dt_tm/>
				<remk/>
			</record>
		</CURLIST>
	</dataSet>
</mt_etccar_9101_l>
*/
%>

<% /* 작성시간 : Tue Aug 28 14:51:35 KST 2012 */ %>