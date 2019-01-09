<%@ page contentType="text/xml; charset=EUC-KR" %>

<%@ page import = "java.io.*,
                   java.sql.*,
                   java.util.*,
                   kr.co.comsquare.rwXmlLib.*,
                   kr.co.comsquare.db.*,
                   kr.co.comsquare.util.Tokenizer,
                   chosun.ciis.en.evnt.ds.*,
                   chosun.ciis.en.evnt.rec.*,
                   chosun.ciis.co.base.util.StringUtil;"
%>

<%
	RwXml rx = new RwXml();
EN_EVNT_1003_SDataSet ds = (EN_EVNT_1003_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

  try {
    /****** CURLIST BEGIN */
    recordSet = rx.add(dataSet, "CURLIST", "");
    for(int i = 0; i < ds.curlist.size(); i++) {
		EN_EVNT_1003_SCURLISTRecord rec = (EN_EVNT_1003_SCURLISTRecord)ds.curlist.get(i);
		int record = rx.add(recordSet, "record", "");
		rx.add(record, "cmpy_cd", rec.cmpy_cd);
		rx.add(record, "evnt_yy", rec.evnt_yy);
		rx.add(record, "evnt_cd", rec.evnt_cd);
		rx.add(record, "evnt_seq", rec.evnt_seq);
		rx.add(record, "evnt_nm", rec.evnt_nm);
		rx.add(record, "evnt_type", rec.evnt_type);
		rx.add(record, "regu_non_regu_clsf", rec.regu_non_regu_clsf);
		rx.add(record, "spons_clsf", rec.spons_clsf);
		rx.add(record, "entr_cost", rec.entr_cost);
		rx.add(record, "charg_entr_nops", rec.charg_entr_nops);
		rx.add(record, "free_entr_nops", rec.free_entr_nops);
		rx.add(record, "grp_entr_nops", rec.grp_entr_nops);
		rx.add(record, "grp_entr_team_cnt", rec.grp_entr_team_cnt);
		rx.add(record, "evnt_dds", rec.evnt_dds);
		rx.add(record, "evnt_frdt", rec.evnt_frdt);
		rx.add(record, "evnt_todt", rec.evnt_todt);
		rx.add(record, "plac_1", rec.plac_1);
		rx.add(record, "plac_2", rec.plac_2);
		rx.add(record, "plac_3", rec.plac_3);
		rx.add(record, "dept_cd", rec.dept_cd);
		rx.add(record, "dept_nm", rec.dept_nm);
		rx.add(record, "chrg_pers_emp_no", rec.chrg_pers_emp_no);
		rx.add(record, "chrg_pers_emp_nm", rec.chrg_pers_emp_nm);
		rx.add(record, "reven_budg_amt", rec.reven_budg_amt);
		rx.add(record, "expn_budg_amt", rec.expn_budg_amt);
		rx.add(record, "enpr_reven_stlm_amt", rec.enpr_reven_stlm_amt);
		rx.add(record, "enpr_expn_stlm_amt", rec.enpr_expn_stlm_amt);
		rx.add(record, "acct_reven_stlm_amt", rec.acct_reven_stlm_amt);
		rx.add(record, "acct_expn_stlm_amt", rec.acct_expn_stlm_amt);
		rx.add(record, "stlm_dt", rec.stlm_dt);
		rx.add(record, "stlm_proc_dt", rec.stlm_proc_dt);
		rx.add(record, "stlm_proc_pers_emp_no", rec.stlm_proc_pers_emp_no);
		rx.add(record, "vat_incd_yn", rec.vat_incd_yn);
		rx.add(record, "incmg_pers", rec.incmg_pers);
		rx.add(record, "incmg_pers_emp_nm", rec.incmg_pers_emp_nm);
		rx.add(record, "incmg_dt", rec.incmg_dt);
		rx.add(record, "chg_pers", rec.chg_pers);
		rx.add(record, "chg_pers_emp_nm", rec.chg_pers_emp_nm);
		rx.add(record, "chg_dt", rec.chg_dt);
		rx.add(record, "evnt_cd_nm", rec.evnt_cd_nm);
    }
    /****** CURLIST END */

  }
  catch (Exception e) {
  }
  finally {
    out.println(rx.xmlFlush());
    out.println(rx.xmlEndFlush());
  }
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
  <CURLIST>
    <record>
      <cd_type/>
      <cd/>
      <cdnm/>
      <cd_abrv_nm/>
    </record>
  </CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Jan 28 12:09:47 KST 2009 */ %>