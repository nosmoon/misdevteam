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


package chosun.ciis.ad.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.rec.*;

/**
 * 
 */


public class AD_BAS_1710_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String dlco_clsf;
	public String dlco_no;
	public String basi_dt;
	public String prvmm_unrcp_amt;
	public String thmm_unrcp_amt;
	public String mang_dr_stot;
	public String busn_dr_stot;
	public String etc_mortg_amt;
	public String dng_stot;
	public String mang_mortg_surp_amt;
	public String busn_mortg_surp_amt;
	public String unrcp_tot_amt;
	public String un_repay_dhon_bal;
	public String mortg_amt;
	public String un_pay_fee;
	public String precpt_amt;
	public String acml_amt;
	public String mang_expt_ufth_bond_amt;
	public String busn_expt_ufth_bond_amt;
	public String evlu_frdt;
	public String evlu_todt;
	public String avg_point;
	public String sum_kiil;
	public String mchrg_pers;
	public String slcrg_pers;
	public String mchrg_pers_nm;
	public String slcrg_pers_nm;
	public String mchrg_opn;
	public String slcrg_opn;
	public String chg_dt_tm;
	public String chg_pers;
	public String start_dt;
	public String pre_month;

	public AD_BAS_1710_SDataSet(){}
	public AD_BAS_1710_SDataSet(String errcode, String errmsg, String dlco_clsf, String dlco_no, String basi_dt, String prvmm_unrcp_amt, String thmm_unrcp_amt, String mang_dr_stot, String busn_dr_stot, String etc_mortg_amt, String dng_stot, String mang_mortg_surp_amt, String busn_mortg_surp_amt, String unrcp_tot_amt, String un_repay_dhon_bal, String mortg_amt, String un_pay_fee, String precpt_amt, String acml_amt, String mang_expt_ufth_bond_amt, String busn_expt_ufth_bond_amt, String evlu_frdt, String evlu_todt, String avg_point, String sum_kiil, String mchrg_pers, String slcrg_pers, String mchrg_pers_nm, String slcrg_pers_nm, String mchrg_opn, String slcrg_opn, String chg_dt_tm, String chg_pers, String start_dt, String pre_month){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.dlco_clsf = dlco_clsf;
		this.dlco_no = dlco_no;
		this.basi_dt = basi_dt;
		this.prvmm_unrcp_amt = prvmm_unrcp_amt;
		this.thmm_unrcp_amt = thmm_unrcp_amt;
		this.mang_dr_stot = mang_dr_stot;
		this.busn_dr_stot = busn_dr_stot;
		this.etc_mortg_amt = etc_mortg_amt;
		this.dng_stot = dng_stot;
		this.mang_mortg_surp_amt = mang_mortg_surp_amt;
		this.busn_mortg_surp_amt = busn_mortg_surp_amt;
		this.unrcp_tot_amt = unrcp_tot_amt;
		this.un_repay_dhon_bal = un_repay_dhon_bal;
		this.mortg_amt = mortg_amt;
		this.un_pay_fee = un_pay_fee;
		this.precpt_amt = precpt_amt;
		this.acml_amt = acml_amt;
		this.mang_expt_ufth_bond_amt = mang_expt_ufth_bond_amt;
		this.busn_expt_ufth_bond_amt = busn_expt_ufth_bond_amt;
		this.evlu_frdt = evlu_frdt;
		this.evlu_todt = evlu_todt;
		this.avg_point = avg_point;
		this.sum_kiil = sum_kiil;
		this.mchrg_pers = mchrg_pers;
		this.slcrg_pers = slcrg_pers;
		this.mchrg_pers_nm = mchrg_pers_nm;
		this.slcrg_pers_nm = slcrg_pers_nm;
		this.mchrg_opn = mchrg_opn;
		this.slcrg_opn = slcrg_opn;
		this.chg_dt_tm = chg_dt_tm;
		this.chg_pers = chg_pers;
		this.start_dt = start_dt;
		this.pre_month = pre_month;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setPrvmm_unrcp_amt(String prvmm_unrcp_amt){
		this.prvmm_unrcp_amt = prvmm_unrcp_amt;
	}

	public void setThmm_unrcp_amt(String thmm_unrcp_amt){
		this.thmm_unrcp_amt = thmm_unrcp_amt;
	}

	public void setMang_dr_stot(String mang_dr_stot){
		this.mang_dr_stot = mang_dr_stot;
	}

	public void setBusn_dr_stot(String busn_dr_stot){
		this.busn_dr_stot = busn_dr_stot;
	}

	public void setEtc_mortg_amt(String etc_mortg_amt){
		this.etc_mortg_amt = etc_mortg_amt;
	}

	public void setDng_stot(String dng_stot){
		this.dng_stot = dng_stot;
	}

	public void setMang_mortg_surp_amt(String mang_mortg_surp_amt){
		this.mang_mortg_surp_amt = mang_mortg_surp_amt;
	}

	public void setBusn_mortg_surp_amt(String busn_mortg_surp_amt){
		this.busn_mortg_surp_amt = busn_mortg_surp_amt;
	}

	public void setUnrcp_tot_amt(String unrcp_tot_amt){
		this.unrcp_tot_amt = unrcp_tot_amt;
	}

	public void setUn_repay_dhon_bal(String un_repay_dhon_bal){
		this.un_repay_dhon_bal = un_repay_dhon_bal;
	}

	public void setMortg_amt(String mortg_amt){
		this.mortg_amt = mortg_amt;
	}

	public void setUn_pay_fee(String un_pay_fee){
		this.un_pay_fee = un_pay_fee;
	}

	public void setPrecpt_amt(String precpt_amt){
		this.precpt_amt = precpt_amt;
	}

	public void setAcml_amt(String acml_amt){
		this.acml_amt = acml_amt;
	}

	public void setMang_expt_ufth_bond_amt(String mang_expt_ufth_bond_amt){
		this.mang_expt_ufth_bond_amt = mang_expt_ufth_bond_amt;
	}

	public void setBusn_expt_ufth_bond_amt(String busn_expt_ufth_bond_amt){
		this.busn_expt_ufth_bond_amt = busn_expt_ufth_bond_amt;
	}

	public void setEvlu_frdt(String evlu_frdt){
		this.evlu_frdt = evlu_frdt;
	}

	public void setEvlu_todt(String evlu_todt){
		this.evlu_todt = evlu_todt;
	}

	public void setAvg_point(String avg_point){
		this.avg_point = avg_point;
	}

	public void setSum_kiil(String sum_kiil){
		this.sum_kiil = sum_kiil;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setMchrg_pers_nm(String mchrg_pers_nm){
		this.mchrg_pers_nm = mchrg_pers_nm;
	}

	public void setSlcrg_pers_nm(String slcrg_pers_nm){
		this.slcrg_pers_nm = slcrg_pers_nm;
	}

	public void setMchrg_opn(String mchrg_opn){
		this.mchrg_opn = mchrg_opn;
	}

	public void setSlcrg_opn(String slcrg_opn){
		this.slcrg_opn = slcrg_opn;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setStart_dt(String start_dt){
		this.start_dt = start_dt;
	}

	public void setPre_month(String pre_month){
		this.pre_month = pre_month;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getPrvmm_unrcp_amt(){
		return this.prvmm_unrcp_amt;
	}

	public String getThmm_unrcp_amt(){
		return this.thmm_unrcp_amt;
	}

	public String getMang_dr_stot(){
		return this.mang_dr_stot;
	}

	public String getBusn_dr_stot(){
		return this.busn_dr_stot;
	}

	public String getEtc_mortg_amt(){
		return this.etc_mortg_amt;
	}

	public String getDng_stot(){
		return this.dng_stot;
	}

	public String getMang_mortg_surp_amt(){
		return this.mang_mortg_surp_amt;
	}

	public String getBusn_mortg_surp_amt(){
		return this.busn_mortg_surp_amt;
	}

	public String getUnrcp_tot_amt(){
		return this.unrcp_tot_amt;
	}

	public String getUn_repay_dhon_bal(){
		return this.un_repay_dhon_bal;
	}

	public String getMortg_amt(){
		return this.mortg_amt;
	}

	public String getUn_pay_fee(){
		return this.un_pay_fee;
	}

	public String getPrecpt_amt(){
		return this.precpt_amt;
	}

	public String getAcml_amt(){
		return this.acml_amt;
	}

	public String getMang_expt_ufth_bond_amt(){
		return this.mang_expt_ufth_bond_amt;
	}

	public String getBusn_expt_ufth_bond_amt(){
		return this.busn_expt_ufth_bond_amt;
	}

	public String getEvlu_frdt(){
		return this.evlu_frdt;
	}

	public String getEvlu_todt(){
		return this.evlu_todt;
	}

	public String getAvg_point(){
		return this.avg_point;
	}

	public String getSum_kiil(){
		return this.sum_kiil;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getMchrg_pers_nm(){
		return this.mchrg_pers_nm;
	}

	public String getSlcrg_pers_nm(){
		return this.slcrg_pers_nm;
	}

	public String getMchrg_opn(){
		return this.mchrg_opn;
	}

	public String getSlcrg_opn(){
		return this.slcrg_opn;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getStart_dt(){
		return this.start_dt;
	}

	public String getPre_month(){
		return this.pre_month;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.dlco_clsf = Util.checkString(cstmt.getString(5));
		this.dlco_no = Util.checkString(cstmt.getString(6));
		this.basi_dt = Util.checkString(cstmt.getString(7));
		this.prvmm_unrcp_amt = Util.checkString(cstmt.getString(9));
		this.thmm_unrcp_amt = Util.checkString(cstmt.getString(10));
		this.mang_dr_stot = Util.checkString(cstmt.getString(11));
		this.busn_dr_stot = Util.checkString(cstmt.getString(12));
		this.etc_mortg_amt = Util.checkString(cstmt.getString(13));
		this.dng_stot = Util.checkString(cstmt.getString(14));
		this.mang_mortg_surp_amt = Util.checkString(cstmt.getString(15));
		this.busn_mortg_surp_amt = Util.checkString(cstmt.getString(16));
		this.unrcp_tot_amt = Util.checkString(cstmt.getString(17));
		this.un_repay_dhon_bal = Util.checkString(cstmt.getString(18));
		this.mortg_amt = Util.checkString(cstmt.getString(19));
		this.un_pay_fee = Util.checkString(cstmt.getString(20));
		this.precpt_amt = Util.checkString(cstmt.getString(21));
		this.acml_amt = Util.checkString(cstmt.getString(22));
		this.mang_expt_ufth_bond_amt = Util.checkString(cstmt.getString(23));
		this.busn_expt_ufth_bond_amt = Util.checkString(cstmt.getString(24));
		this.evlu_frdt = Util.checkString(cstmt.getString(25));
		this.evlu_todt = Util.checkString(cstmt.getString(26));
		this.avg_point = Util.checkString(cstmt.getString(27));
		this.sum_kiil = Util.checkString(cstmt.getString(28));
		this.mchrg_pers = Util.checkString(cstmt.getString(29));
		this.slcrg_pers = Util.checkString(cstmt.getString(30));
		this.mchrg_pers_nm = Util.checkString(cstmt.getString(31));
		this.slcrg_pers_nm = Util.checkString(cstmt.getString(32));
		this.mchrg_opn = Util.checkString(cstmt.getString(33));
		this.slcrg_opn = Util.checkString(cstmt.getString(34));
		this.chg_dt_tm = Util.checkString(cstmt.getString(35));
		this.chg_pers = Util.checkString(cstmt.getString(36));
		this.start_dt = Util.checkString(cstmt.getString(37));
		this.pre_month = Util.checkString(cstmt.getString(38));
		ResultSet rset0 = (ResultSet) cstmt.getObject(39);
		while(rset0.next()){
			AD_BAS_1710_SCURLIST1Record rec = new AD_BAS_1710_SCURLIST1Record();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.unrcp_amt = Util.checkString(rset0.getString("unrcp_amt"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(40);
		while(rset1.next()){
			AD_BAS_1710_SCURLIST2Record rec = new AD_BAS_1710_SCURLIST2Record();
			rec.issu_pers_nm = Util.checkString(rset1.getString("issu_pers_nm"));
			rec.mtry_dt = Util.checkString(rset1.getString("mtry_dt"));
			rec.note_amt = Util.checkString(rset1.getString("note_amt"));
			rec.note_no = Util.checkString(rset1.getString("note_no"));
			rec.bank_cd = Util.checkString(rset1.getString("bank_cd"));
			rec.note_seq = Util.checkString(rset1.getString("note_seq"));
			rec.now_note_stat_nm = Util.checkString(rset1.getString("now_note_stat_nm"));
			rec.mang_chce_yn = Util.checkString(rset1.getString("mang_chce_yn"));
			rec.busn_chce_yn = Util.checkString(rset1.getString("busn_chce_yn"));
			rec.dhon_chce_yn = Util.checkString(rset1.getString("dhon_chce_yn"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.note_clsf_nm = Util.checkString(rset1.getString("note_clsf_nm"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_1710_SDataSet ds = (AD_BAS_1710_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AD_BAS_1710_SCURLIST1Record curlist1Rec = (AD_BAS_1710_SCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_BAS_1710_SCURLIST2Record curlist2Rec = (AD_BAS_1710_SCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDlco_clsf()%>
<%= ds.getDlco_no()%>
<%= ds.getBasi_dt()%>
<%= ds.getPrvmm_unrcp_amt()%>
<%= ds.getThmm_unrcp_amt()%>
<%= ds.getMang_dr_stot()%>
<%= ds.getBusn_dr_stot()%>
<%= ds.getEtc_mortg_amt()%>
<%= ds.getDng_stot()%>
<%= ds.getMang_mortg_surp_amt()%>
<%= ds.getBusn_mortg_surp_amt()%>
<%= ds.getUnrcp_tot_amt()%>
<%= ds.getUn_repay_dhon_bal()%>
<%= ds.getMortg_amt()%>
<%= ds.getUn_pay_fee()%>
<%= ds.getPrecpt_amt()%>
<%= ds.getAcml_amt()%>
<%= ds.getMang_expt_ufth_bond_amt()%>
<%= ds.getBusn_expt_ufth_bond_amt()%>
<%= ds.getEvlu_frdt()%>
<%= ds.getEvlu_todt()%>
<%= ds.getAvg_point()%>
<%= ds.getSum_kiil()%>
<%= ds.getMchrg_pers()%>
<%= ds.getSlcrg_pers()%>
<%= ds.getMchrg_pers_nm()%>
<%= ds.getSlcrg_pers_nm()%>
<%= ds.getMchrg_opn()%>
<%= ds.getSlcrg_opn()%>
<%= ds.getChg_dt_tm()%>
<%= ds.getChg_pers()%>
<%= ds.getStart_dt()%>
<%= ds.getPre_month()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.yymm%>
<%= curlist1Rec.unrcp_amt%>
<%= curlist2Rec.issu_pers_nm%>
<%= curlist2Rec.mtry_dt%>
<%= curlist2Rec.note_amt%>
<%= curlist2Rec.note_no%>
<%= curlist2Rec.bank_cd%>
<%= curlist2Rec.note_seq%>
<%= curlist2Rec.now_note_stat_nm%>
<%= curlist2Rec.mang_chce_yn%>
<%= curlist2Rec.busn_chce_yn%>
<%= curlist2Rec.dhon_chce_yn%>
<%= curlist2Rec.seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 27 20:10:30 KST 2009 */