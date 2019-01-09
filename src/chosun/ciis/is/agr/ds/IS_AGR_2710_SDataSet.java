/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.is.agr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.agr.dm.*;
import chosun.ciis.is.agr.rec.*;

/**
 * 
 */


public class IS_AGR_2710_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist_a = new ArrayList();
	public String errcode;
	public String errmsg;
	public String make_ask_reg_dt;
	public String make_ask_reg_seq;
	public String acwr_reg_dt;
	public String acwr_reg_seq;
	public String dlco_chrg_pers_nm;
	public String dlco_chrg_pers_cntc_plac;
	public String dlco_chrg_pers_email;
	public String dlvs_dt;
	public String work_clsf;
	public String dlvs_plac_addr;
	public String clr_cd;
	public String prt_paper_cd;
	public String incmp_design_yn;
	public String advcs_make_yn;
	public String pcnt_clsf;
	public String yy;
	public String prt_plan_dt;
	public String prz_rate_clsf;
	public String prz_amt;
	public String prz_phb_saly_boks;
	public String remk;
	public String proc_stat;
	public String chg_pers;
	public String chg_dt_tm;
	public String dept_cd;
	public String sub_dept_cd;
	public String chrg_pers;
	public String chrg_pers_nm;
	public String dlco_clsf_cd_seq;
	public String dlco_nm;
	public String advcs_cd;
	public String advcs_cd_nm;
	public String qunt;
	public String uprc;
	public String suply_amt;
	public String vat_amt;
	public String tot_rvord_amt;
	public String in_amt;
	public String in_amt_rate;
	public String clamt_mthd_nm;
	public String std_cd_nm;
	public String flag;

	public IS_AGR_2710_SDataSet(){}
	public IS_AGR_2710_SDataSet(String errcode, String errmsg, String make_ask_reg_dt, String make_ask_reg_seq, String acwr_reg_dt, String acwr_reg_seq, String dlco_chrg_pers_nm, String dlco_chrg_pers_cntc_plac, String dlco_chrg_pers_email, String dlvs_dt, String work_clsf, String dlvs_plac_addr, String clr_cd, String prt_paper_cd, String incmp_design_yn, String advcs_make_yn, String pcnt_clsf, String yy, String prt_plan_dt, String prz_rate_clsf, String prz_amt, String prz_phb_saly_boks, String remk, String proc_stat, String chg_pers, String chg_dt_tm, String dept_cd, String sub_dept_cd, String chrg_pers, String chrg_pers_nm, String dlco_clsf_cd_seq, String dlco_nm, String advcs_cd, String advcs_cd_nm, String qunt, String uprc, String suply_amt, String vat_amt, String tot_rvord_amt, String in_amt, String in_amt_rate, String clamt_mthd_nm, String std_cd_nm, String flag){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.make_ask_reg_dt = make_ask_reg_dt;
		this.make_ask_reg_seq = make_ask_reg_seq;
		this.acwr_reg_dt = acwr_reg_dt;
		this.acwr_reg_seq = acwr_reg_seq;
		this.dlco_chrg_pers_nm = dlco_chrg_pers_nm;
		this.dlco_chrg_pers_cntc_plac = dlco_chrg_pers_cntc_plac;
		this.dlco_chrg_pers_email = dlco_chrg_pers_email;
		this.dlvs_dt = dlvs_dt;
		this.work_clsf = work_clsf;
		this.dlvs_plac_addr = dlvs_plac_addr;
		this.clr_cd = clr_cd;
		this.prt_paper_cd = prt_paper_cd;
		this.incmp_design_yn = incmp_design_yn;
		this.advcs_make_yn = advcs_make_yn;
		this.pcnt_clsf = pcnt_clsf;
		this.yy = yy;
		this.prt_plan_dt = prt_plan_dt;
		this.prz_rate_clsf = prz_rate_clsf;
		this.prz_amt = prz_amt;
		this.prz_phb_saly_boks = prz_phb_saly_boks;
		this.remk = remk;
		this.proc_stat = proc_stat;
		this.chg_pers = chg_pers;
		this.chg_dt_tm = chg_dt_tm;
		this.dept_cd = dept_cd;
		this.sub_dept_cd = sub_dept_cd;
		this.chrg_pers = chrg_pers;
		this.chrg_pers_nm = chrg_pers_nm;
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
		this.dlco_nm = dlco_nm;
		this.advcs_cd = advcs_cd;
		this.advcs_cd_nm = advcs_cd_nm;
		this.qunt = qunt;
		this.uprc = uprc;
		this.suply_amt = suply_amt;
		this.vat_amt = vat_amt;
		this.tot_rvord_amt = tot_rvord_amt;
		this.in_amt = in_amt;
		this.in_amt_rate = in_amt_rate;
		this.clamt_mthd_nm = clamt_mthd_nm;
		this.std_cd_nm = std_cd_nm;
		this.flag = flag;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setMake_ask_reg_dt(String make_ask_reg_dt){
		this.make_ask_reg_dt = make_ask_reg_dt;
	}

	public void setMake_ask_reg_seq(String make_ask_reg_seq){
		this.make_ask_reg_seq = make_ask_reg_seq;
	}

	public void setAcwr_reg_dt(String acwr_reg_dt){
		this.acwr_reg_dt = acwr_reg_dt;
	}

	public void setAcwr_reg_seq(String acwr_reg_seq){
		this.acwr_reg_seq = acwr_reg_seq;
	}

	public void setDlco_chrg_pers_nm(String dlco_chrg_pers_nm){
		this.dlco_chrg_pers_nm = dlco_chrg_pers_nm;
	}

	public void setDlco_chrg_pers_cntc_plac(String dlco_chrg_pers_cntc_plac){
		this.dlco_chrg_pers_cntc_plac = dlco_chrg_pers_cntc_plac;
	}

	public void setDlco_chrg_pers_email(String dlco_chrg_pers_email){
		this.dlco_chrg_pers_email = dlco_chrg_pers_email;
	}

	public void setDlvs_dt(String dlvs_dt){
		this.dlvs_dt = dlvs_dt;
	}

	public void setWork_clsf(String work_clsf){
		this.work_clsf = work_clsf;
	}

	public void setDlvs_plac_addr(String dlvs_plac_addr){
		this.dlvs_plac_addr = dlvs_plac_addr;
	}

	public void setClr_cd(String clr_cd){
		this.clr_cd = clr_cd;
	}

	public void setPrt_paper_cd(String prt_paper_cd){
		this.prt_paper_cd = prt_paper_cd;
	}

	public void setIncmp_design_yn(String incmp_design_yn){
		this.incmp_design_yn = incmp_design_yn;
	}

	public void setAdvcs_make_yn(String advcs_make_yn){
		this.advcs_make_yn = advcs_make_yn;
	}

	public void setPcnt_clsf(String pcnt_clsf){
		this.pcnt_clsf = pcnt_clsf;
	}

	public void setYy(String yy){
		this.yy = yy;
	}

	public void setPrt_plan_dt(String prt_plan_dt){
		this.prt_plan_dt = prt_plan_dt;
	}

	public void setPrz_rate_clsf(String prz_rate_clsf){
		this.prz_rate_clsf = prz_rate_clsf;
	}

	public void setPrz_amt(String prz_amt){
		this.prz_amt = prz_amt;
	}

	public void setPrz_phb_saly_boks(String prz_phb_saly_boks){
		this.prz_phb_saly_boks = prz_phb_saly_boks;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setDlco_clsf_cd_seq(String dlco_clsf_cd_seq){
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAdvcs_cd(String advcs_cd){
		this.advcs_cd = advcs_cd;
	}

	public void setAdvcs_cd_nm(String advcs_cd_nm){
		this.advcs_cd_nm = advcs_cd_nm;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setTot_rvord_amt(String tot_rvord_amt){
		this.tot_rvord_amt = tot_rvord_amt;
	}

	public void setIn_amt(String in_amt){
		this.in_amt = in_amt;
	}

	public void setIn_amt_rate(String in_amt_rate){
		this.in_amt_rate = in_amt_rate;
	}

	public void setClamt_mthd_nm(String clamt_mthd_nm){
		this.clamt_mthd_nm = clamt_mthd_nm;
	}

	public void setStd_cd_nm(String std_cd_nm){
		this.std_cd_nm = std_cd_nm;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getMake_ask_reg_dt(){
		return this.make_ask_reg_dt;
	}

	public String getMake_ask_reg_seq(){
		return this.make_ask_reg_seq;
	}

	public String getAcwr_reg_dt(){
		return this.acwr_reg_dt;
	}

	public String getAcwr_reg_seq(){
		return this.acwr_reg_seq;
	}

	public String getDlco_chrg_pers_nm(){
		return this.dlco_chrg_pers_nm;
	}

	public String getDlco_chrg_pers_cntc_plac(){
		return this.dlco_chrg_pers_cntc_plac;
	}

	public String getDlco_chrg_pers_email(){
		return this.dlco_chrg_pers_email;
	}

	public String getDlvs_dt(){
		return this.dlvs_dt;
	}

	public String getWork_clsf(){
		return this.work_clsf;
	}

	public String getDlvs_plac_addr(){
		return this.dlvs_plac_addr;
	}

	public String getClr_cd(){
		return this.clr_cd;
	}

	public String getPrt_paper_cd(){
		return this.prt_paper_cd;
	}

	public String getIncmp_design_yn(){
		return this.incmp_design_yn;
	}

	public String getAdvcs_make_yn(){
		return this.advcs_make_yn;
	}

	public String getPcnt_clsf(){
		return this.pcnt_clsf;
	}

	public String getYy(){
		return this.yy;
	}

	public String getPrt_plan_dt(){
		return this.prt_plan_dt;
	}

	public String getPrz_rate_clsf(){
		return this.prz_rate_clsf;
	}

	public String getPrz_amt(){
		return this.prz_amt;
	}

	public String getPrz_phb_saly_boks(){
		return this.prz_phb_saly_boks;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
	}

	public String getDlco_clsf_cd_seq(){
		return this.dlco_clsf_cd_seq;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAdvcs_cd(){
		return this.advcs_cd;
	}

	public String getAdvcs_cd_nm(){
		return this.advcs_cd_nm;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getTot_rvord_amt(){
		return this.tot_rvord_amt;
	}

	public String getIn_amt(){
		return this.in_amt;
	}

	public String getIn_amt_rate(){
		return this.in_amt_rate;
	}

	public String getClamt_mthd_nm(){
		return this.clamt_mthd_nm;
	}

	public String getStd_cd_nm(){
		return this.std_cd_nm;
	}

	public String getFlag(){
		return this.flag;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.make_ask_reg_dt = Util.checkString(cstmt.getString(9));
		this.make_ask_reg_seq = Util.checkString(cstmt.getString(10));
		this.acwr_reg_dt = Util.checkString(cstmt.getString(11));
		this.acwr_reg_seq = Util.checkString(cstmt.getString(12));
		this.dlco_chrg_pers_nm = Util.checkString(cstmt.getString(13));
		this.dlco_chrg_pers_cntc_plac = Util.checkString(cstmt.getString(14));
		this.dlco_chrg_pers_email = Util.checkString(cstmt.getString(15));
		this.dlvs_dt = Util.checkString(cstmt.getString(16));
		this.work_clsf = Util.checkString(cstmt.getString(17));
		this.dlvs_plac_addr = Util.checkString(cstmt.getString(18));
		this.clr_cd = Util.checkString(cstmt.getString(19));
		this.prt_paper_cd = Util.checkString(cstmt.getString(20));
		this.incmp_design_yn = Util.checkString(cstmt.getString(21));
		this.advcs_make_yn = Util.checkString(cstmt.getString(22));
		this.pcnt_clsf = Util.checkString(cstmt.getString(23));
		this.yy = Util.checkString(cstmt.getString(24));
		this.prt_plan_dt = Util.checkString(cstmt.getString(25));
		this.prz_rate_clsf = Util.checkString(cstmt.getString(26));
		this.prz_amt = Util.checkString(cstmt.getString(27));
		this.prz_phb_saly_boks = Util.checkString(cstmt.getString(28));
		this.remk = Util.checkString(cstmt.getString(29));
		this.proc_stat = Util.checkString(cstmt.getString(30));
		this.chg_pers = Util.checkString(cstmt.getString(31));
		this.chg_dt_tm = Util.checkString(cstmt.getString(32));
		this.dept_cd = Util.checkString(cstmt.getString(33));
		this.sub_dept_cd = Util.checkString(cstmt.getString(34));
		this.chrg_pers = Util.checkString(cstmt.getString(35));
		this.chrg_pers_nm = Util.checkString(cstmt.getString(36));
		this.dlco_clsf_cd_seq = Util.checkString(cstmt.getString(37));
		this.dlco_nm = Util.checkString(cstmt.getString(38));
		this.advcs_cd = Util.checkString(cstmt.getString(39));
		this.advcs_cd_nm = Util.checkString(cstmt.getString(40));
		this.qunt = Util.checkString(cstmt.getString(41));
		this.uprc = Util.checkString(cstmt.getString(42));
		this.suply_amt = Util.checkString(cstmt.getString(43));
		this.vat_amt = Util.checkString(cstmt.getString(44));
		this.tot_rvord_amt = Util.checkString(cstmt.getString(45));
		this.in_amt = Util.checkString(cstmt.getString(46));
		this.in_amt_rate = Util.checkString(cstmt.getString(47));
		this.clamt_mthd_nm = Util.checkString(cstmt.getString(48));
		this.std_cd_nm = Util.checkString(cstmt.getString(49));
		this.flag = Util.checkString(cstmt.getString(50));
		ResultSet rset0 = (ResultSet) cstmt.getObject(51);
		while(rset0.next()){
			IS_AGR_2710_SCURLIST_ARecord rec = new IS_AGR_2710_SCURLIST_ARecord();
			rec.a_purc_reg_dt = Util.checkString(rset0.getString("a_purc_reg_dt"));
			rec.a_purc_reg_seq = Util.checkString(rset0.getString("a_purc_reg_seq"));
			rec.a_asnt_dstc_cd = Util.checkString(rset0.getString("a_asnt_dstc_cd"));
			rec.a_asnt_dstc_cd_nm = Util.checkString(rset0.getString("a_asnt_dstc_cd_nm"));
			rec.a_dlco_clsf_cd_seq = Util.checkString(rset0.getString("a_dlco_clsf_cd_seq"));
			rec.a_dlco_nm = Util.checkString(rset0.getString("a_dlco_nm"));
			rec.a_purc_clsf = Util.checkString(rset0.getString("a_purc_clsf"));
			rec.a_uprc = Util.checkString(rset0.getString("a_uprc"));
			rec.a_qunt = Util.checkString(rset0.getString("a_qunt"));
			rec.a_purc_amt = Util.checkString(rset0.getString("a_purc_amt"));
			rec.a_trc_yn = Util.checkString(rset0.getString("a_trc_yn"));
			rec.a_send_yn = Util.checkString(rset0.getString("a_send_yn"));
			rec.a_remk = Util.checkString(rset0.getString("a_remk"));
			rec.a_adjm_yn = Util.checkString(rset0.getString("a_adjm_yn"));
			rec.a_chg_dt_tm = Util.checkString(rset0.getString("a_chg_dt_tm"));
			this.curlist_a.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_AGR_2710_SDataSet ds = (IS_AGR_2710_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist_a.size(); i++){
		IS_AGR_2710_SCURLIST_ARecord curlist_aRec = (IS_AGR_2710_SCURLIST_ARecord)ds.curlist_a.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMake_ask_reg_dt()%>
<%= ds.getMake_ask_reg_seq()%>
<%= ds.getAcwr_reg_dt()%>
<%= ds.getAcwr_reg_seq()%>
<%= ds.getDlco_chrg_pers_nm()%>
<%= ds.getDlco_chrg_pers_cntc_plac()%>
<%= ds.getDlco_chrg_pers_email()%>
<%= ds.getDlvs_dt()%>
<%= ds.getWork_clsf()%>
<%= ds.getDlvs_plac_addr()%>
<%= ds.getClr_cd()%>
<%= ds.getPrt_paper_cd()%>
<%= ds.getIncmp_design_yn()%>
<%= ds.getAdvcs_make_yn()%>
<%= ds.getPcnt_clsf()%>
<%= ds.getYy()%>
<%= ds.getPrt_plan_dt()%>
<%= ds.getPrz_rate_clsf()%>
<%= ds.getPrz_amt()%>
<%= ds.getPrz_phb_saly_boks()%>
<%= ds.getRemk()%>
<%= ds.getProc_stat()%>
<%= ds.getChg_pers()%>
<%= ds.getChg_dt_tm()%>
<%= ds.getDept_cd()%>
<%= ds.getSub_dept_cd()%>
<%= ds.getChrg_pers()%>
<%= ds.getChrg_pers_nm()%>
<%= ds.getDlco_clsf_cd_seq()%>
<%= ds.getDlco_nm()%>
<%= ds.getAdvcs_cd()%>
<%= ds.getAdvcs_cd_nm()%>
<%= ds.getQunt()%>
<%= ds.getUprc()%>
<%= ds.getSuply_amt()%>
<%= ds.getVat_amt()%>
<%= ds.getTot_rvord_amt()%>
<%= ds.getIn_amt()%>
<%= ds.getIn_amt_rate()%>
<%= ds.getClamt_mthd_nm()%>
<%= ds.getStd_cd_nm()%>
<%= ds.getFlag()%>
<%= ds.getCurlist_a()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist_aRec.a_purc_reg_dt%>
<%= curlist_aRec.a_purc_reg_seq%>
<%= curlist_aRec.a_asnt_dstc_cd%>
<%= curlist_aRec.a_asnt_dstc_cd_nm%>
<%= curlist_aRec.a_dlco_clsf_cd_seq%>
<%= curlist_aRec.a_dlco_nm%>
<%= curlist_aRec.a_purc_clsf%>
<%= curlist_aRec.a_uprc%>
<%= curlist_aRec.a_qunt%>
<%= curlist_aRec.a_purc_amt%>
<%= curlist_aRec.a_trc_yn%>
<%= curlist_aRec.a_send_yn%>
<%= curlist_aRec.a_remk%>
<%= curlist_aRec.a_adjm_yn%>
<%= curlist_aRec.a_chg_dt_tm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 06 12:22:45 KST 2012 */