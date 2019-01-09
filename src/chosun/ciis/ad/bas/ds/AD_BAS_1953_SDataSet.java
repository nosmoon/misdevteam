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

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.bas.rec.AD_BAS_1953_SCURLISTRecord;

/**
 * 
 */


public class AD_BAS_1953_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String dlco_clsf;
	public String dlco_no;
	public String basi_dt;
	public String prvmm_unrcp_amt;
	public String thmm_unrcp_amt;
	public String unrcp_tot_amt;
	public String un_repay_dhon_bal;
	public String mang_expt_ufth_bond_amt;
	public String busn_expt_ufth_bond_amt;
	public String mang_dr_stot;
	public String busn_dr_stot;
	public String mang_mortg_surp_amt;
	public String busn_mortg_surp_amt;
	public String mortg_amt;
	public String un_pay_fee;
	public String precpt_amt;
	public String acml_amt;
	public String etc_mortg_amt;
	public String dng_stot;
	public String mchrg_pers;
	public String mchrg_pers_nm;
	public String slcrg_pers;
	public String slcrg_pers_nm;
	public String chg_dt_tm;
	public String chg_pers;
	public String evlu_frdt;
	public String evlu_todt;
	public String avg_point;
	public String sum_kiil;

	public AD_BAS_1953_SDataSet(){}
	public AD_BAS_1953_SDataSet(String errcode, String errmsg, String dlco_clsf, String dlco_no, String basi_dt, String prvmm_unrcp_amt, String thmm_unrcp_amt, String unrcp_tot_amt, String un_repay_dhon_bal, String mang_expt_ufth_bond_amt, String busn_expt_ufth_bond_amt, String mang_dr_stot, String busn_dr_stot, String mang_mortg_surp_amt, String busn_mortg_surp_amt, String mortg_amt, String un_pay_fee, String precpt_amt, String acml_amt, String etc_mortg_amt, String dng_stot, String mchrg_pers, String mchrg_pers_nm, String slcrg_pers, String slcrg_pers_nm, String chg_dt_tm, String chg_pers, String evlu_frdt, String evlu_todt, String avg_point, String sum_kiil){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.dlco_clsf = dlco_clsf;
		this.dlco_no = dlco_no;
		this.basi_dt = basi_dt;
		this.prvmm_unrcp_amt = prvmm_unrcp_amt;
		this.thmm_unrcp_amt = thmm_unrcp_amt;
		this.unrcp_tot_amt = unrcp_tot_amt;
		this.un_repay_dhon_bal = un_repay_dhon_bal;
		this.mang_expt_ufth_bond_amt = mang_expt_ufth_bond_amt;
		this.busn_expt_ufth_bond_amt = busn_expt_ufth_bond_amt;
		this.mang_dr_stot = mang_dr_stot;
		this.busn_dr_stot = busn_dr_stot;
		this.mang_mortg_surp_amt = mang_mortg_surp_amt;
		this.busn_mortg_surp_amt = busn_mortg_surp_amt;
		this.mortg_amt = mortg_amt;
		this.un_pay_fee = un_pay_fee;
		this.precpt_amt = precpt_amt;
		this.acml_amt = acml_amt;
		this.etc_mortg_amt = etc_mortg_amt;
		this.dng_stot = dng_stot;
		this.mchrg_pers = mchrg_pers;
		this.mchrg_pers_nm = mchrg_pers_nm;
		this.slcrg_pers = slcrg_pers;
		this.slcrg_pers_nm = slcrg_pers_nm;
		this.chg_dt_tm = chg_dt_tm;
		this.chg_pers = chg_pers;
		this.evlu_frdt = evlu_frdt;
		this.evlu_todt = evlu_todt;
		this.avg_point = avg_point;
		this.sum_kiil = sum_kiil;
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

	public void setUnrcp_tot_amt(String unrcp_tot_amt){
		this.unrcp_tot_amt = unrcp_tot_amt;
	}

	public void setUn_repay_dhon_bal(String un_repay_dhon_bal){
		this.un_repay_dhon_bal = un_repay_dhon_bal;
	}

	public void setMang_expt_ufth_bond_amt(String mang_expt_ufth_bond_amt){
		this.mang_expt_ufth_bond_amt = mang_expt_ufth_bond_amt;
	}

	public void setBusn_expt_ufth_bond_amt(String busn_expt_ufth_bond_amt){
		this.busn_expt_ufth_bond_amt = busn_expt_ufth_bond_amt;
	}

	public void setMang_dr_stot(String mang_dr_stot){
		this.mang_dr_stot = mang_dr_stot;
	}

	public void setBusn_dr_stot(String busn_dr_stot){
		this.busn_dr_stot = busn_dr_stot;
	}

	public void setMang_mortg_surp_amt(String mang_mortg_surp_amt){
		this.mang_mortg_surp_amt = mang_mortg_surp_amt;
	}

	public void setBusn_mortg_surp_amt(String busn_mortg_surp_amt){
		this.busn_mortg_surp_amt = busn_mortg_surp_amt;
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

	public void setEtc_mortg_amt(String etc_mortg_amt){
		this.etc_mortg_amt = etc_mortg_amt;
	}

	public void setDng_stot(String dng_stot){
		this.dng_stot = dng_stot;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setMchrg_pers_nm(String mchrg_pers_nm){
		this.mchrg_pers_nm = mchrg_pers_nm;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setSlcrg_pers_nm(String slcrg_pers_nm){
		this.slcrg_pers_nm = slcrg_pers_nm;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
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

	public String getUnrcp_tot_amt(){
		return this.unrcp_tot_amt;
	}

	public String getUn_repay_dhon_bal(){
		return this.un_repay_dhon_bal;
	}

	public String getMang_expt_ufth_bond_amt(){
		return this.mang_expt_ufth_bond_amt;
	}

	public String getBusn_expt_ufth_bond_amt(){
		return this.busn_expt_ufth_bond_amt;
	}

	public String getMang_dr_stot(){
		return this.mang_dr_stot;
	}

	public String getBusn_dr_stot(){
		return this.busn_dr_stot;
	}

	public String getMang_mortg_surp_amt(){
		return this.mang_mortg_surp_amt;
	}

	public String getBusn_mortg_surp_amt(){
		return this.busn_mortg_surp_amt;
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

	public String getEtc_mortg_amt(){
		return this.etc_mortg_amt;
	}

	public String getDng_stot(){
		return this.dng_stot;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getMchrg_pers_nm(){
		return this.mchrg_pers_nm;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getSlcrg_pers_nm(){
		return this.slcrg_pers_nm;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public String getChg_pers(){
		return this.chg_pers;
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

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.dlco_clsf = Util.checkString(cstmt.getString(5));
		this.dlco_no = Util.checkString(cstmt.getString(6));
		this.basi_dt = Util.checkString(cstmt.getString(7));
		this.prvmm_unrcp_amt = Util.checkString(cstmt.getString(8));
		this.thmm_unrcp_amt = Util.checkString(cstmt.getString(9));
		this.unrcp_tot_amt = Util.checkString(cstmt.getString(10));
		this.un_repay_dhon_bal = Util.checkString(cstmt.getString(11));
		this.mang_expt_ufth_bond_amt = Util.checkString(cstmt.getString(12));
		this.busn_expt_ufth_bond_amt = Util.checkString(cstmt.getString(13));
		this.mang_dr_stot = Util.checkString(cstmt.getString(14));
		this.busn_dr_stot = Util.checkString(cstmt.getString(15));
		this.mang_mortg_surp_amt = Util.checkString(cstmt.getString(16));
		this.busn_mortg_surp_amt = Util.checkString(cstmt.getString(17));
		this.mortg_amt = Util.checkString(cstmt.getString(18));
		this.un_pay_fee = Util.checkString(cstmt.getString(19));
		this.precpt_amt = Util.checkString(cstmt.getString(20));
		this.acml_amt = Util.checkString(cstmt.getString(21));
		this.etc_mortg_amt = Util.checkString(cstmt.getString(22));
		this.dng_stot = Util.checkString(cstmt.getString(23));
		this.mchrg_pers = Util.checkString(cstmt.getString(24));
		this.mchrg_pers_nm = Util.checkString(cstmt.getString(25));
		this.slcrg_pers = Util.checkString(cstmt.getString(26));
		this.slcrg_pers_nm = Util.checkString(cstmt.getString(27));
		this.chg_dt_tm = Util.checkString(cstmt.getString(28));
		this.chg_pers = Util.checkString(cstmt.getString(29));
		this.evlu_frdt = Util.checkString(cstmt.getString(30));
		this.evlu_todt = Util.checkString(cstmt.getString(31));
		this.avg_point = Util.checkString(cstmt.getString(32));
		this.sum_kiil = Util.checkString(cstmt.getString(33));
		ResultSet rset0 = (ResultSet) cstmt.getObject(34);
		while(rset0.next()){
			AD_BAS_1953_SCURLISTRecord rec = new AD_BAS_1953_SCURLISTRecord();
			rec.issu_pers_nm = Util.checkString(rset0.getString("issu_pers_nm"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.note_amt = Util.checkString(rset0.getString("note_amt"));
			rec.note_no = Util.checkString(rset0.getString("note_no"));
			rec.bank_cd = Util.checkString(rset0.getString("bank_cd"));
			rec.note_seq = Util.checkString(rset0.getString("note_seq"));
			rec.now_note_stat_nm = Util.checkString(rset0.getString("now_note_stat_nm"));
			rec.mang_chce_yn = Util.checkString(rset0.getString("mang_chce_yn"));
			rec.busn_chce_yn = Util.checkString(rset0.getString("busn_chce_yn"));
			rec.dhon_chce_yn = Util.checkString(rset0.getString("dhon_chce_yn"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_1953_SDataSet ds = (AD_BAS_1953_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BAS_1953_SCURLISTRecord curlistRec = (AD_BAS_1953_SCURLISTRecord)ds.curlist.get(i);%>
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
<%= ds.getUnrcp_tot_amt()%>
<%= ds.getUn_repay_dhon_bal()%>
<%= ds.getMang_expt_ufth_bond_amt()%>
<%= ds.getBusn_expt_ufth_bond_amt()%>
<%= ds.getMang_dr_stot()%>
<%= ds.getBusn_dr_stot()%>
<%= ds.getMang_mortg_surp_amt()%>
<%= ds.getBusn_mortg_surp_amt()%>
<%= ds.getMortg_amt()%>
<%= ds.getUn_pay_fee()%>
<%= ds.getPrecpt_amt()%>
<%= ds.getAcml_amt()%>
<%= ds.getEtc_mortg_amt()%>
<%= ds.getDng_stot()%>
<%= ds.getMchrg_pers()%>
<%= ds.getMchrg_pers_nm()%>
<%= ds.getSlcrg_pers()%>
<%= ds.getSlcrg_pers_nm()%>
<%= ds.getChg_dt_tm()%>
<%= ds.getChg_pers()%>
<%= ds.getEvlu_frdt()%>
<%= ds.getEvlu_todt()%>
<%= ds.getAvg_point()%>
<%= ds.getSum_kiil()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.issu_pers_nm%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.note_amt%>
<%= curlistRec.note_no%>
<%= curlistRec.bank_cd%>
<%= curlistRec.note_seq%>
<%= curlistRec.now_note_stat_nm%>
<%= curlistRec.mang_chce_yn%>
<%= curlistRec.busn_chce_yn%>
<%= curlistRec.dhon_chce_yn%>
<%= curlistRec.seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 13 17:09:58 KST 2009 */