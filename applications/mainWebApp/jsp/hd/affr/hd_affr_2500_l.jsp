<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_2500_LDataSet ds = (HD_AFFR_2500_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
  int dataSet = 0;
  int recordSet = 0;
  String errcode = ds.errcode;
  String errmsg = ds.errmsg;
  dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
    for(int i = 0; i < ds.curlist.size(); i++) {
      HD_AFFR_2500_LCURLISTRecord rec = (HD_AFFR_2500_LCURLISTRecord)ds.curlist.get(i);
      int record = rx.add(dataSet, "record", "");
			rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			rx.add(record, "prn", StringUtil.replaceToXml(rec.prn));
			rx.add(record, "chk_dt", StringUtil.replaceToXml(rec.chk_dt));
			rx.add(record, "chk_yy", StringUtil.replaceToXml(rec.chk_yy));
			rx.add(record, "chk_hosp_nm", StringUtil.replaceToXml(rec.chk_hosp_nm));
			rx.add(record, "kidny", StringUtil.replaceToXml(rec.kidny));
			rx.add(record, "wgt", StringUtil.replaceToXml(rec.wgt));
			rx.add(record, "std_wgt", StringUtil.replaceToXml(rec.std_wgt));
			rx.add(record, "fatt_prov", StringUtil.replaceToXml(rec.fatt_prov));
			rx.add(record, "blod_pres_high", StringUtil.replaceToXml(rec.blod_pres_high));
			rx.add(record, "blod_pres_low", StringUtil.replaceToXml(rec.blod_pres_low));
			rx.add(record, "puls", StringUtil.replaceToXml(rec.puls));
			rx.add(record, "nkd_sght_lft", StringUtil.replaceToXml(rec.nkd_sght_lft));
			rx.add(record, "nkd_sght_rht", StringUtil.replaceToXml(rec.nkd_sght_rht));
			rx.add(record, "rvis_sght_lft", StringUtil.replaceToXml(rec.rvis_sght_lft));
			rx.add(record, "rvis_sght_rht", StringUtil.replaceToXml(rec.rvis_sght_rht));
			rx.add(record, "spc_idea", StringUtil.replaceToXml(rec.spc_idea));
			rx.add(record, "cmpt_idea_ill_nm_cd_1", StringUtil.replaceToXml(rec.cmpt_idea_ill_nm_cd_1));
			rx.add(record, "cmpt_idea_remk_1", StringUtil.replaceToXml(rec.cmpt_idea_remk_1));
			rx.add(record, "cmpt_idea_ill_nm_cd_2", StringUtil.replaceToXml(rec.cmpt_idea_ill_nm_cd_2));
			rx.add(record, "cmpt_idea_remk_2", StringUtil.replaceToXml(rec.cmpt_idea_remk_2));
			rx.add(record, "cmpt_idea_ill_nm_cd_3", StringUtil.replaceToXml(rec.cmpt_idea_ill_nm_cd_3));
			rx.add(record, "cmpt_idea_remk_3", StringUtil.replaceToXml(rec.cmpt_idea_remk_3));
			rx.add(record, "cmpt_idea_ill_nm_cd_4", StringUtil.replaceToXml(rec.cmpt_idea_ill_nm_cd_4));
			rx.add(record, "cmpt_idea_remk_4", StringUtil.replaceToXml(rec.cmpt_idea_remk_4));
			rx.add(record, "cmpt_idea_ill_nm_cd_5", StringUtil.replaceToXml(rec.cmpt_idea_ill_nm_cd_5));
			rx.add(record, "cmpt_idea_remk_5", StringUtil.replaceToXml(rec.cmpt_idea_remk_5));
			
			rx.add(record, "blod_sug", StringUtil.replaceToXml(rec.blod_sug ));
			rx.add(record, "a_blod_hep", StringUtil.replaceToXml(rec.a_blod_hep ));
			rx.add(record, "b_blod_hep", StringUtil.replaceToXml(rec.b_blod_hep));
			rx.add(record, "adv_cont", StringUtil.replaceToXml(rec.adv_cont ));
			
			rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			
			//rx.add(record, "cmpy_cd", rec.cmpy_cd);
			//rx.add(record, "occr_dt", rec.occr_dt);
			//rx.add(record, "seq", rec.seq);
			//rx.add(record, "emp_no", rec.emp_no);
			//rx.add(record, "flnm", rec.flnm);
			//rx.add(record, "prn", rec.prn);
			//rx.add(record, "chk_dt", rec.chk_dt);
			//rx.add(record, "chk_yy", rec.chk_yy);
			//rx.add(record, "chk_hosp_nm", rec.chk_hosp_nm);
			//rx.add(record, "kidny", rec.kidny);
			//rx.add(record, "wgt", rec.wgt);
			//rx.add(record, "std_wgt", rec.std_wgt);
			//rx.add(record, "fatt_prov", rec.fatt_prov);
			//rx.add(record, "blod_pres_high", rec.blod_pres_high);
			//rx.add(record, "blod_pres_low", rec.blod_pres_low);
			//rx.add(record, "puls", rec.puls);
			//rx.add(record, "nkd_sght_lft", rec.nkd_sght_lft);
			//rx.add(record, "nkd_sght_rht", rec.nkd_sght_rht);
			//rx.add(record, "rvis_sght_lft", rec.rvis_sght_lft);
			//rx.add(record, "rvis_sght_rht", rec.rvis_sght_rht);
			//rx.add(record, "spc_idea", rec.spc_idea);
			//rx.add(record, "cmpt_idea_ill_nm_cd_1", rec.cmpt_idea_ill_nm_cd_1);
			//rx.add(record, "cmpt_idea_remk_1", rec.cmpt_idea_remk_1);
			//rx.add(record, "cmpt_idea_ill_nm_cd_2", rec.cmpt_idea_ill_nm_cd_2);
			//rx.add(record, "cmpt_idea_remk_2", rec.cmpt_idea_remk_2);
			//rx.add(record, "cmpt_idea_ill_nm_cd_3", rec.cmpt_idea_ill_nm_cd_3);
			//rx.add(record, "cmpt_idea_remk_3", rec.cmpt_idea_remk_3);
			//rx.add(record, "cmpt_idea_ill_nm_cd_4", rec.cmpt_idea_ill_nm_cd_4);
			//rx.add(record, "cmpt_idea_remk_4", rec.cmpt_idea_remk_4);
			//rx.add(record, "cmpt_idea_ill_nm_cd_5", rec.cmpt_idea_ill_nm_cd_5);
			//rx.add(record, "cmpt_idea_remk_5", rec.cmpt_idea_remk_5);
			//rx.add(record, "dept_nm", rec.dept_nm);
			//rx.add(record, "dty_nm", rec.dty_nm);
			//rx.add(record, "posi_nm", rec.posi_nm);
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
<hd_affr_2500_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<occr_dt/>
				<seq/>
				<emp_no/>
				<flnm/>
				<prn/>
				<chk_dt/>
				<chk_yy/>
				<chk_hosp_nm/>
				<kidny/>
				<wgt/>
				<std_wgt/>
				<fatt_prov/>
				<blod_pres_high/>
				<blod_pres_low/>
				<puls/>
				<nkd_sght_lft/>
				<nkd_sght_rht/>
				<rvis_sght_lft/>
				<rvis_sght_rht/>
				<spc_idea/>
				<cmpt_idea_ill_nm_cd_1/>
				<cmpt_idea_remk_1/>
				<cmpt_idea_ill_nm_cd_2/>
				<cmpt_idea_remk_2/>
				<cmpt_idea_ill_nm_cd_3/>
				<cmpt_idea_remk_3/>
				<cmpt_idea_ill_nm_cd_4/>
				<cmpt_idea_remk_4/>
				<cmpt_idea_ill_nm_cd_5/>
				<cmpt_idea_remk_5/>
				<dept_nm/>
				<dty_nm/>
				<posi_nm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_affr_2500_l>
*/
%>

<% /* 작성시간 : Sun Aug 30 21:02:12 KST 2009 */ %>