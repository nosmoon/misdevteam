<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
  , chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_6100_LDataSet ds = (HD_AFFR_6100_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int depth1 = 0;
	
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST2 BEGIN */
		
		
		depth1 = rx.add(dataSet, "issu_clsf_cd", "");
		
		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_AFFR_6100_LCURLIST2Record rec = (HD_AFFR_6100_LCURLIST2Record)ds.curlist2.get(i);
			if ("ISSU_CLSF_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", StringUtil.replaceToXml(rec.cd));
				rx.add(record, "label", StringUtil.replaceToXml(rec.cdnm));
			}
		}
		
		depth1 = rx.add(dataSet, "certi_clsf_cd", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_AFFR_6100_LCURLIST2Record rec = (HD_AFFR_6100_LCURLIST2Record)ds.curlist2.get(i);
			if ("CERTI_CLSF_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", StringUtil.replaceToXml(rec.cd));
				rx.add(record, "label", StringUtil.replaceToXml(rec.cdnm));
			}
		}
		
		/****** CURLIST2 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_6100_LCURLISTRecord rec = (HD_AFFR_6100_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "chk", "");
			rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			rx.add(record, "certi_clsf", StringUtil.replaceToXml(rec.certi_clsf));
			rx.add(record, "prn", StringUtil.replaceToXml(rec.prn));
			rx.add(record, "prn_cnt", StringUtil.replaceToXml(rec.prn_cnt));
			rx.add(record, "certi_clsf_name", StringUtil.replaceToXml(rec.certi_clsf_name));
			rx.add(record, "issu_clsf_name", StringUtil.replaceToXml(rec.issu_clsf_name));
			rx.add(record, "dty_name", StringUtil.replaceToXml(rec.dty_name));
			rx.add(record, "posi_name", StringUtil.replaceToXml(rec.posi_name));
			rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			rx.add(record, "in_cmpy_dt", StringUtil.replaceToXml(rec.in_cmpy_dt));
			rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			rx.add(record, "aplc_dt", StringUtil.replaceToXml(rec.aplc_dt));
			rx.add(record, "aplc_seq", StringUtil.replaceToXml(rec.aplc_seq));
			rx.add(record, "issu_num_shet", StringUtil.replaceToXml(rec.issu_num_shet));
			rx.add(record, "usag", StringUtil.replaceToXml(rec.usag));
			rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			rx.add(record, "cntc_plac", StringUtil.replaceToXml(rec.cntc_plac));
			rx.add(record, "email", StringUtil.replaceToXml(rec.email));
			rx.add(record, "engl_flnm", StringUtil.replaceToXml(rec.engl_flnm));
			rx.add(record, "issu_clsf", StringUtil.replaceToXml(rec.issu_clsf));
			rx.add(record, "dirc_incmg_posi", StringUtil.replaceToXml(rec.dirc_incmg_posi));
			rx.add(record, "chce_posi_clsf", StringUtil.replaceToXml(rec.chce_posi_clsf));
			rx.add(record, "busi_trip_purp", StringUtil.replaceToXml(rec.busi_trip_purp));
			rx.add(record, "busi_trip_area", StringUtil.replaceToXml(rec.busi_trip_area));
			rx.add(record, "busi_trip_frdt", StringUtil.replaceToXml(rec.busi_trip_frdt));
			rx.add(record, "busi_trip_todt", StringUtil.replaceToXml(rec.busi_trip_todt));
			rx.add(record, "engl_bidt", StringUtil.replaceToXml(rec.engl_bidt));
			rx.add(record, "engl_dept_posi", StringUtil.replaceToXml(rec.engl_dept_posi));
			rx.add(record, "engl_in_cmpy_dt", StringUtil.replaceToXml(rec.engl_in_cmpy_dt));
			rx.add(record, "engl_now_dt", StringUtil.replaceToXml(rec.engl_now_dt));
			rx.add(record, "engl_busi_trip_purp", StringUtil.replaceToXml(rec.engl_busi_trip_purp));
			rx.add(record, "engl_busi_trip_area", StringUtil.replaceToXml(rec.engl_busi_trip_area));
			rx.add(record, "engl_busi_trip_frdt", StringUtil.replaceToXml(rec.engl_busi_trip_frdt));
			rx.add(record, "engl_busi_trip_todt", StringUtil.replaceToXml(rec.engl_busi_trip_todt));
			rx.add(record, "issu_dt", StringUtil.replaceToXml(rec.issu_dt));
			rx.add(record, "issu_no", StringUtil.replaceToXml(rec.issu_no));
			rx.add(record, "now_dt", StringUtil.replaceToXml(rec.now_dt));
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
			<dept_cd/>
			<dept_nm/>
			<certi_clsf/>
			<prn/>
			<certi_clsf_name/>
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
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Mar 11 13:47:07 KST 2009 */ %>