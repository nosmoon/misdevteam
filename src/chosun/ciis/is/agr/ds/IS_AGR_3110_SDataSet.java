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


public class IS_AGR_3110_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist_a = new ArrayList();
	public String errcode;
	public String errmsg;
	public String make_ask_reg_dt;
	public String make_ask_reg_seq;
	public String dept_cd;
	public String sub_dept_cd;
	public String chrg_pers;
	public String chrg_pers_nm;
	public String dlco_nm;
	public String dlco_chrg_pers_nm;
	public String dlco_chrg_pers_cntc_plac;
	public String advt_nm;
	public String draft_end_dt;
	public String dlvs_dt;
	public String acwr_incmg_dt_tm;
	public String work_kind;
	public String make_clsf;
	public String std_cd;
	public String std_cd_nm;
	public String clr_cd;
	public String prt_paper;
	public String rvord_qunt;
	public String rvord_uprc;
	public String rvord_amt;
	public String dlvs_plac;
	public String remk;
	public String chrg_pers_tel_no;
	public String plan_chrg_ptph_no;
	public String proc_stat;
	public String chg_pers;
	public String chg_dt_tm;

	public IS_AGR_3110_SDataSet(){}
	public IS_AGR_3110_SDataSet(String errcode, String errmsg, String make_ask_reg_dt, String make_ask_reg_seq, String dept_cd, String sub_dept_cd, String chrg_pers, String chrg_pers_nm, String dlco_nm, String dlco_chrg_pers_nm, String dlco_chrg_pers_cntc_plac, String advt_nm, String draft_end_dt, String dlvs_dt, String acwr_incmg_dt_tm, String work_kind, String make_clsf, String std_cd, String std_cd_nm, String clr_cd, String prt_paper, String rvord_qunt, String rvord_uprc, String rvord_amt, String dlvs_plac, String remk, String chrg_pers_tel_no, String plan_chrg_ptph_no, String proc_stat, String chg_pers, String chg_dt_tm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.make_ask_reg_dt = make_ask_reg_dt;
		this.make_ask_reg_seq = make_ask_reg_seq;
		this.dept_cd = dept_cd;
		this.sub_dept_cd = sub_dept_cd;
		this.chrg_pers = chrg_pers;
		this.chrg_pers_nm = chrg_pers_nm;
		this.dlco_nm = dlco_nm;
		this.dlco_chrg_pers_nm = dlco_chrg_pers_nm;
		this.dlco_chrg_pers_cntc_plac = dlco_chrg_pers_cntc_plac;
		this.advt_nm = advt_nm;
		this.draft_end_dt = draft_end_dt;
		this.dlvs_dt = dlvs_dt;
		this.acwr_incmg_dt_tm = acwr_incmg_dt_tm;
		this.work_kind = work_kind;
		this.make_clsf = make_clsf;
		this.std_cd = std_cd;
		this.std_cd_nm = std_cd_nm;
		this.clr_cd = clr_cd;
		this.prt_paper = prt_paper;
		this.rvord_qunt = rvord_qunt;
		this.rvord_uprc = rvord_uprc;
		this.rvord_amt = rvord_amt;
		this.dlvs_plac = dlvs_plac;
		this.remk = remk;
		this.chrg_pers_tel_no = chrg_pers_tel_no;
		this.plan_chrg_ptph_no = plan_chrg_ptph_no;
		this.proc_stat = proc_stat;
		this.chg_pers = chg_pers;
		this.chg_dt_tm = chg_dt_tm;
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

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDlco_chrg_pers_nm(String dlco_chrg_pers_nm){
		this.dlco_chrg_pers_nm = dlco_chrg_pers_nm;
	}

	public void setDlco_chrg_pers_cntc_plac(String dlco_chrg_pers_cntc_plac){
		this.dlco_chrg_pers_cntc_plac = dlco_chrg_pers_cntc_plac;
	}

	public void setAdvt_nm(String advt_nm){
		this.advt_nm = advt_nm;
	}

	public void setDraft_end_dt(String draft_end_dt){
		this.draft_end_dt = draft_end_dt;
	}

	public void setDlvs_dt(String dlvs_dt){
		this.dlvs_dt = dlvs_dt;
	}

	public void setAcwr_incmg_dt_tm(String acwr_incmg_dt_tm){
		this.acwr_incmg_dt_tm = acwr_incmg_dt_tm;
	}

	public void setWork_kind(String work_kind){
		this.work_kind = work_kind;
	}

	public void setMake_clsf(String make_clsf){
		this.make_clsf = make_clsf;
	}

	public void setStd_cd(String std_cd){
		this.std_cd = std_cd;
	}

	public void setStd_cd_nm(String std_cd_nm){
		this.std_cd_nm = std_cd_nm;
	}

	public void setClr_cd(String clr_cd){
		this.clr_cd = clr_cd;
	}

	public void setPrt_paper(String prt_paper){
		this.prt_paper = prt_paper;
	}

	public void setRvord_qunt(String rvord_qunt){
		this.rvord_qunt = rvord_qunt;
	}

	public void setRvord_uprc(String rvord_uprc){
		this.rvord_uprc = rvord_uprc;
	}

	public void setRvord_amt(String rvord_amt){
		this.rvord_amt = rvord_amt;
	}

	public void setDlvs_plac(String dlvs_plac){
		this.dlvs_plac = dlvs_plac;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setChrg_pers_tel_no(String chrg_pers_tel_no){
		this.chrg_pers_tel_no = chrg_pers_tel_no;
	}

	public void setPlan_chrg_ptph_no(String plan_chrg_ptph_no){
		this.plan_chrg_ptph_no = plan_chrg_ptph_no;
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

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDlco_chrg_pers_nm(){
		return this.dlco_chrg_pers_nm;
	}

	public String getDlco_chrg_pers_cntc_plac(){
		return this.dlco_chrg_pers_cntc_plac;
	}

	public String getAdvt_nm(){
		return this.advt_nm;
	}

	public String getDraft_end_dt(){
		return this.draft_end_dt;
	}

	public String getDlvs_dt(){
		return this.dlvs_dt;
	}

	public String getAcwr_incmg_dt_tm(){
		return this.acwr_incmg_dt_tm;
	}

	public String getWork_kind(){
		return this.work_kind;
	}

	public String getMake_clsf(){
		return this.make_clsf;
	}

	public String getStd_cd(){
		return this.std_cd;
	}

	public String getStd_cd_nm(){
		return this.std_cd_nm;
	}

	public String getClr_cd(){
		return this.clr_cd;
	}

	public String getPrt_paper(){
		return this.prt_paper;
	}

	public String getRvord_qunt(){
		return this.rvord_qunt;
	}

	public String getRvord_uprc(){
		return this.rvord_uprc;
	}

	public String getRvord_amt(){
		return this.rvord_amt;
	}

	public String getDlvs_plac(){
		return this.dlvs_plac;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getChrg_pers_tel_no(){
		return this.chrg_pers_tel_no;
	}

	public String getPlan_chrg_ptph_no(){
		return this.plan_chrg_ptph_no;
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

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.make_ask_reg_dt = Util.checkString(cstmt.getString(7));
		this.make_ask_reg_seq = Util.checkString(cstmt.getString(8));
		this.dept_cd = Util.checkString(cstmt.getString(9));
		this.sub_dept_cd = Util.checkString(cstmt.getString(10));
		this.chrg_pers = Util.checkString(cstmt.getString(11));
		this.chrg_pers_nm = Util.checkString(cstmt.getString(12));
		this.dlco_nm = Util.checkString(cstmt.getString(13));
		this.dlco_chrg_pers_nm = Util.checkString(cstmt.getString(14));
		this.dlco_chrg_pers_cntc_plac = Util.checkString(cstmt.getString(15));
		this.advt_nm = Util.checkString(cstmt.getString(16));
		this.draft_end_dt = Util.checkString(cstmt.getString(17));
		this.dlvs_dt = Util.checkString(cstmt.getString(18));
		this.acwr_incmg_dt_tm = Util.checkString(cstmt.getString(19));
		this.work_kind = Util.checkString(cstmt.getString(20));
		this.make_clsf = Util.checkString(cstmt.getString(21));
		this.std_cd = Util.checkString(cstmt.getString(22));
		this.std_cd_nm = Util.checkString(cstmt.getString(23));
		this.clr_cd = Util.checkString(cstmt.getString(24));
		this.prt_paper = Util.checkString(cstmt.getString(25));
		this.rvord_qunt = Util.checkString(cstmt.getString(26));
		this.rvord_uprc = Util.checkString(cstmt.getString(27));
		this.rvord_amt = Util.checkString(cstmt.getString(28));
		this.dlvs_plac = Util.checkString(cstmt.getString(29));
		this.remk = Util.checkString(cstmt.getString(30));
		this.chrg_pers_tel_no = Util.checkString(cstmt.getString(31));
		this.plan_chrg_ptph_no = Util.checkString(cstmt.getString(32));
		this.proc_stat = Util.checkString(cstmt.getString(33));
		this.chg_pers = Util.checkString(cstmt.getString(34));
		this.chg_dt_tm = Util.checkString(cstmt.getString(35));
		ResultSet rset0 = (ResultSet) cstmt.getObject(36);
		while(rset0.next()){
			IS_AGR_3110_SCURLIST_ARecord rec = new IS_AGR_3110_SCURLIST_ARecord();
			rec.make_ask_dtls_seq = Util.checkString(rset0.getString("make_ask_dtls_seq"));
			rec.dlco_clsf_cd_seq = Util.checkString(rset0.getString("dlco_clsf_cd_seq"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.purc_clsf = Util.checkString(rset0.getString("purc_clsf"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			rec.purc_amt = Util.checkString(rset0.getString("purc_amt"));
			rec.stmt_recp_yn = Util.checkString(rset0.getString("stmt_recp_yn"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist_a.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_AGR_3110_SDataSet ds = (IS_AGR_3110_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist_a.size(); i++){
		IS_AGR_3110_SCURLIST_ARecord curlist_aRec = (IS_AGR_3110_SCURLIST_ARecord)ds.curlist_a.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMake_ask_reg_dt()%>
<%= ds.getMake_ask_reg_seq()%>
<%= ds.getDept_cd()%>
<%= ds.getSub_dept_cd()%>
<%= ds.getChrg_pers()%>
<%= ds.getChrg_pers_nm()%>
<%= ds.getDlco_nm()%>
<%= ds.getDlco_chrg_pers_nm()%>
<%= ds.getDlco_chrg_pers_cntc_plac()%>
<%= ds.getAdvt_nm()%>
<%= ds.getDraft_end_dt()%>
<%= ds.getDlvs_dt()%>
<%= ds.getAcwr_incmg_dt_tm()%>
<%= ds.getWork_kind()%>
<%= ds.getMake_clsf()%>
<%= ds.getStd_cd()%>
<%= ds.getStd_cd_nm()%>
<%= ds.getClr_cd()%>
<%= ds.getPrt_paper()%>
<%= ds.getRvord_qunt()%>
<%= ds.getRvord_uprc()%>
<%= ds.getRvord_amt()%>
<%= ds.getDlvs_plac()%>
<%= ds.getRemk()%>
<%= ds.getChrg_pers_tel_no()%>
<%= ds.getPlan_chrg_ptph_no()%>
<%= ds.getProc_stat()%>
<%= ds.getChg_pers()%>
<%= ds.getChg_dt_tm()%>
<%= ds.getCurlist_a()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist_aRec.make_ask_dtls_seq%>
<%= curlist_aRec.dlco_clsf_cd_seq%>
<%= curlist_aRec.dlco_nm%>
<%= curlist_aRec.purc_clsf%>
<%= curlist_aRec.uprc%>
<%= curlist_aRec.qunt%>
<%= curlist_aRec.purc_amt%>
<%= curlist_aRec.stmt_recp_yn%>
<%= curlist_aRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 07 11:44:47 KST 2012 */