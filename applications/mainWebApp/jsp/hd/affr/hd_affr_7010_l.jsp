<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_7010_LDataSet ds = (HD_AFFR_7010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int depth1 = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST2 BEGIN */
		
		depth1 = rx.add(dataSet, "certi_clsf_cd", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_AFFR_7010_LCURLIST2Record rec = (HD_AFFR_7010_LCURLIST2Record)ds.curlist2.get(i);
			if ("CERTI_CLSF_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}

		depth1 = rx.add(dataSet, "dty_cd", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_AFFR_7010_LCURLIST2Record rec = (HD_AFFR_7010_LCURLIST2Record)ds.curlist2.get(i);
			if ("DTY_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}

		
		depth1 = rx.add(dataSet, "posi_cd", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_AFFR_7010_LCURLIST2Record rec = (HD_AFFR_7010_LCURLIST2Record)ds.curlist2.get(i);
			if ("POSI_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		/****** CURLIST2 END */

	
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_7010_LCURLISTRecord rec = (HD_AFFR_7010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.addCData(record, "certi_clsf", rec.certi_clsf);
			rx.add(record, "prn", rec.prn);
			rx.add(record, "prn_cnt", rec.prn_cnt);
			rx.add(record, "certi_clsf_name", rec.certi_clsf_name);
			rx.add(record, "issu_clsf_name", rec.issu_clsf_name);
			rx.add(record, "dty_name", rec.dty_name);
			rx.add(record, "posi_name", rec.posi_name);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "aplc_dt", rec.aplc_dt);
			rx.add(record, "aplc_seq", rec.aplc_seq);
			rx.add(record, "issu_num_shet", rec.issu_num_shet);
			rx.add(record, "usag", rec.usag);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "cntc_plac", rec.cntc_plac);
			rx.addCData(record, "email", rec.email);
			rx.addCData(record, "engl_flnm", rec.engl_flnm);
			rx.add(record, "issu_clsf", rec.issu_clsf);
			rx.add(record, "dirc_incmg_posi", rec.dirc_incmg_posi);
			rx.add(record, "chce_posi_clsf", rec.chce_posi_clsf);
			rx.add(record, "busi_trip_purp", rec.busi_trip_purp);
			rx.add(record, "busi_trip_area", rec.busi_trip_area);
			rx.add(record, "busi_trip_frdt", rec.busi_trip_frdt);
			rx.add(record, "busi_trip_todt", rec.busi_trip_todt);
			rx.addCData(record, "engl_bidt", rec.engl_bidt);
			rx.addCData(record, "engl_dept_posi", rec.engl_dept_posi);
			rx.add(record, "engl_in_cmpy_dt", rec.engl_in_cmpy_dt);
			rx.add(record, "engl_now_dt", rec.engl_now_dt);
			rx.add(record, "engl_busi_trip_purp", rec.engl_busi_trip_purp);
			rx.add(record, "engl_busi_trip_area", rec.engl_busi_trip_area);
			rx.add(record, "engl_busi_trip_frdt", rec.engl_busi_trip_frdt);
			rx.add(record, "engl_busi_trip_todt", rec.engl_busi_trip_todt);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.addCData(record, "issu_no", rec.issu_no);
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
	<CURLIST2>
		<record>
			<cd_type/>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<cmpy_cd/>
			<emp_no/>
			<nm_korn/>
			<dept_cd/>
			<dept_nm/>
			<certi_clsf/>
			<prn/>
			<prn_cnt/>
			<certi_clsf_name/>
			<issu_clsf_name/>
			<dty_name/>
			<posi_name/>
			<dty_cd/>
			<posi_cd/>
			<in_cmpy_dt/>
			<occr_dt/>
			<seq/>
			<aplc_dt/>
			<aplc_seq/>
			<issu_num_shet/>
			<usag/>
			<remk/>
			<cntc_plac/>
			<email/>
			<engl_flnm/>
			<issu_clsf/>
			<dirc_incmg_posi/>
			<chce_posi_clsf/>
			<busi_trip_purp/>
			<busi_trip_area/>
			<busi_trip_frdt/>
			<busi_trip_todt/>
			<engl_bidt/>
			<engl_dept_posi/>
			<engl_in_cmpy_dt/>
			<engl_now_dt/>
			<engl_busi_trip_purp/>
			<engl_busi_trip_area/>
			<engl_busi_trip_frdt/>
			<engl_busi_trip_todt/>
			<issu_dt/>
			<issu_no/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 17 18:39:36 KST 2009 */ %>