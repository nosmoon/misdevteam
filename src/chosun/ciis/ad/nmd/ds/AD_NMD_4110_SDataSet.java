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


package chosun.ciis.ad.nmd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.nmd.dm.*;
import chosun.ciis.ad.nmd.rec.*;

/**
 * 
 */


public class AD_NMD_4110_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String occr_dt;
	public String slip_clsf;
	public String seq;
	public String rcpm_shet_no;
	public String self_cmpy_yn;
	public String rcpm_plac_clsf;
	public String dlco_no;
	public String dlco_nm;
	public String medi_cd;
	public String dept_cd;
	public String dept_nm;
	public String mchrg_pers;
	public String mchrg_pers_nm;
	public String clos_yn;
	public String seq_clsf;
	public String pre_seq;
	public String next_seq;

	public AD_NMD_4110_SDataSet(){}
	public AD_NMD_4110_SDataSet(String errcode, String errmsg, String occr_dt, String slip_clsf, String seq, String rcpm_shet_no, String self_cmpy_yn, String rcpm_plac_clsf, String dlco_no, String dlco_nm, String medi_cd, String dept_cd, String dept_nm, String mchrg_pers, String mchrg_pers_nm, String clos_yn, String seq_clsf, String pre_seq, String next_seq){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.occr_dt = occr_dt;
		this.slip_clsf = slip_clsf;
		this.seq = seq;
		this.rcpm_shet_no = rcpm_shet_no;
		this.self_cmpy_yn = self_cmpy_yn;
		this.rcpm_plac_clsf = rcpm_plac_clsf;
		this.dlco_no = dlco_no;
		this.dlco_nm = dlco_nm;
		this.medi_cd = medi_cd;
		this.dept_cd = dept_cd;
		this.dept_nm = dept_nm;
		this.mchrg_pers = mchrg_pers;
		this.mchrg_pers_nm = mchrg_pers_nm;
		this.clos_yn = clos_yn;
		this.seq_clsf = seq_clsf;
		this.pre_seq = pre_seq;
		this.next_seq = next_seq;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSlip_clsf(String slip_clsf){
		this.slip_clsf = slip_clsf;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setRcpm_shet_no(String rcpm_shet_no){
		this.rcpm_shet_no = rcpm_shet_no;
	}

	public void setSelf_cmpy_yn(String self_cmpy_yn){
		this.self_cmpy_yn = self_cmpy_yn;
	}

	public void setRcpm_plac_clsf(String rcpm_plac_clsf){
		this.rcpm_plac_clsf = rcpm_plac_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setMchrg_pers_nm(String mchrg_pers_nm){
		this.mchrg_pers_nm = mchrg_pers_nm;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setSeq_clsf(String seq_clsf){
		this.seq_clsf = seq_clsf;
	}

	public void setPre_seq(String pre_seq){
		this.pre_seq = pre_seq;
	}

	public void setNext_seq(String next_seq){
		this.next_seq = next_seq;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSlip_clsf(){
		return this.slip_clsf;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getRcpm_shet_no(){
		return this.rcpm_shet_no;
	}

	public String getSelf_cmpy_yn(){
		return this.self_cmpy_yn;
	}

	public String getRcpm_plac_clsf(){
		return this.rcpm_plac_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getMchrg_pers_nm(){
		return this.mchrg_pers_nm;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getSeq_clsf(){
		return this.seq_clsf;
	}

	public String getPre_seq(){
		return this.pre_seq;
	}

	public String getNext_seq(){
		return this.next_seq;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.occr_dt = Util.checkString(cstmt.getString(5));
		this.slip_clsf = Util.checkString(cstmt.getString(6));
		this.seq = Util.checkString(cstmt.getString(7));
		this.rcpm_shet_no = Util.checkString(cstmt.getString(8));
		this.self_cmpy_yn = Util.checkString(cstmt.getString(9));
		this.rcpm_plac_clsf = Util.checkString(cstmt.getString(10));
		this.dlco_no = Util.checkString(cstmt.getString(11));
		this.dlco_nm = Util.checkString(cstmt.getString(12));
		this.medi_cd = Util.checkString(cstmt.getString(13));
		this.dept_cd = Util.checkString(cstmt.getString(14));
		this.dept_nm = Util.checkString(cstmt.getString(15));
		this.mchrg_pers = Util.checkString(cstmt.getString(16));
		this.mchrg_pers_nm = Util.checkString(cstmt.getString(17));
		this.clos_yn = Util.checkString(cstmt.getString(18));
		this.seq_clsf = Util.checkString(cstmt.getString(19));
		this.pre_seq = Util.checkString(cstmt.getString(20));
		this.next_seq = Util.checkString(cstmt.getString(21));
		ResultSet rset0 = (ResultSet) cstmt.getObject(22);
		while(rset0.next()){
			AD_NMD_4110_SCURLIST1Record rec = new AD_NMD_4110_SCURLIST1Record();
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.slip_clsf = Util.checkString(rset0.getString("slip_clsf"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.subseq = Util.checkString(rset0.getString("subseq"));
			rec.rcpm_acct = Util.checkString(rset0.getString("rcpm_acct"));
			rec.rcpm_acct_nm = Util.checkString(rset0.getString("rcpm_acct_nm"));
			rec.sale_aprv_no = Util.checkString(rset0.getString("sale_aprv_no"));
			rec.rcpm_sub_seq = Util.checkString(rset0.getString("rcpm_sub_seq"));
			rec.note_no = Util.checkString(rset0.getString("note_no"));
			rec.bank_cd = Util.checkString(rset0.getString("bank_cd"));
			rec.bank_nm = Util.checkString(rset0.getString("bank_nm"));
			rec.note_clsf_cd = Util.checkString(rset0.getString("note_clsf_cd"));
			rec.comp_dt = Util.checkString(rset0.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.note_amt = Util.checkString(rset0.getString("note_amt"));
			rec.sale_dscn_amt = Util.checkString(rset0.getString("sale_dscn_amt"));
			rec.issu_cmpy_clsf_cd = Util.checkString(rset0.getString("issu_cmpy_clsf_cd"));
			rec.issu_pers_nm = Util.checkString(rset0.getString("issu_pers_nm"));
			rec.elec_note_key = Util.checkString(rset0.getString("elec_note_key"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(23);
		while(rset1.next()){
			AD_NMD_4110_SCURLIST2Record rec = new AD_NMD_4110_SCURLIST2Record();
			rec.occr_dt = Util.checkString(rset1.getString("occr_dt"));
			rec.slip_clsf = Util.checkString(rset1.getString("slip_clsf"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.subseq = Util.checkString(rset1.getString("subseq"));
			rec.rcpm_dt = Util.checkString(rset1.getString("rcpm_dt"));
			rec.drcr_clsf = Util.checkString(rset1.getString("drcr_clsf"));
			rec.budg_cd = Util.checkString(rset1.getString("budg_cd"));
			rec.amt = Util.checkString(rset1.getString("amt"));
			rec.occr_amt = Util.checkString(rset1.getString("occr_amt"));
			rec.rcpm_shet_no = Util.checkString(rset1.getString("rcpm_shet_no"));
			rec.actu_slip_no = Util.checkString(rset1.getString("actu_slip_no"));
			rec.acct_mang_no = Util.checkString(rset1.getString("acct_mang_no"));
			rec.acct_mang_nm = Util.checkString(rset1.getString("acct_mang_nm"));
			rec.rmtt_dt = Util.checkString(rset1.getString("rmtt_dt"));
			rec.rmtt_plac = Util.checkString(rset1.getString("rmtt_plac"));
			rec.rmtt_coms = Util.checkString(rset1.getString("rmtt_coms"));
			rec.vat = Util.checkString(rset1.getString("vat"));
			rec.rcpm_plac_clsf = Util.checkString(rset1.getString("rcpm_plac_clsf"));
			rec.dlco_no = Util.checkString(rset1.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset1.getString("dlco_nm"));
			rec.rcpm_slip_no = Util.checkString(rset1.getString("rcpm_slip_no"));
			rec.self_cmpy_yn = Util.checkString(rset1.getString("self_cmpy_yn"));
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.mang_chrg_pers = Util.checkString(rset1.getString("mang_chrg_pers"));
			rec.altn_yn = Util.checkString(rset1.getString("altn_yn"));
			rec.depo_job_clsf = Util.checkString(rset1.getString("depo_job_clsf"));
			rec.clos_stat = Util.checkString(rset1.getString("clos_stat"));
			rec.curc_clsf = Util.checkString(rset1.getString("curc_clsf"));
			rec.frex_amt = Util.checkString(rset1.getString("frex_amt"));
			rec.rcpm_clsf = Util.checkString(rset1.getString("rcpm_clsf"));
			rec.current_clsf = Util.checkString(rset1.getString("current_clsf"));
			rec.medi_cd = Util.checkString(rset1.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset1.getString("medi_nm"));
			rec.occr_dlco_cd = Util.checkString(rset1.getString("occr_dlco_cd"));
			rec.occr_dlco_nm = Util.checkString(rset1.getString("occr_dlco_nm"));
			rec.biz_reg_no = Util.checkString(rset1.getString("biz_reg_no"));
			rec.bank_id = Util.checkString(rset1.getString("bank_id"));
			rec.acct_num = Util.checkString(rset1.getString("acct_num"));
			rec.tran_date = Util.checkString(rset1.getString("tran_date"));
			rec.tran_date_seq = Util.checkString(rset1.getString("tran_date_seq"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_NMD_4110_SDataSet ds = (AD_NMD_4110_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AD_NMD_4110_SCURLIST1Record curlist1Rec = (AD_NMD_4110_SCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_NMD_4110_SCURLIST2Record curlist2Rec = (AD_NMD_4110_SCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getOccr_dt()%>
<%= ds.getSlip_clsf()%>
<%= ds.getSeq()%>
<%= ds.getRcpm_shet_no()%>
<%= ds.getSelf_cmpy_yn()%>
<%= ds.getRcpm_plac_clsf()%>
<%= ds.getDlco_no()%>
<%= ds.getDlco_nm()%>
<%= ds.getMedi_cd()%>
<%= ds.getDept_cd()%>
<%= ds.getDept_nm()%>
<%= ds.getMchrg_pers()%>
<%= ds.getMchrg_pers_nm()%>
<%= ds.getClos_yn()%>
<%= ds.getSeq_clsf()%>
<%= ds.getPre_seq()%>
<%= ds.getNext_seq()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.occr_dt%>
<%= curlist1Rec.slip_clsf%>
<%= curlist1Rec.seq%>
<%= curlist1Rec.subseq%>
<%= curlist1Rec.rcpm_acct%>
<%= curlist1Rec.rcpm_acct_nm%>
<%= curlist1Rec.sale_aprv_no%>
<%= curlist1Rec.rcpm_sub_seq%>
<%= curlist1Rec.note_no%>
<%= curlist1Rec.bank_cd%>
<%= curlist1Rec.bank_nm%>
<%= curlist1Rec.note_clsf_cd%>
<%= curlist1Rec.comp_dt%>
<%= curlist1Rec.mtry_dt%>
<%= curlist1Rec.note_amt%>
<%= curlist1Rec.sale_dscn_amt%>
<%= curlist1Rec.issu_cmpy_clsf_cd%>
<%= curlist1Rec.issu_pers_nm%>
<%= curlist1Rec.elec_note_key%>
<%= curlist2Rec.occr_dt%>
<%= curlist2Rec.slip_clsf%>
<%= curlist2Rec.seq%>
<%= curlist2Rec.subseq%>
<%= curlist2Rec.rcpm_dt%>
<%= curlist2Rec.drcr_clsf%>
<%= curlist2Rec.budg_cd%>
<%= curlist2Rec.amt%>
<%= curlist2Rec.occr_amt%>
<%= curlist2Rec.rcpm_shet_no%>
<%= curlist2Rec.actu_slip_no%>
<%= curlist2Rec.acct_mang_no%>
<%= curlist2Rec.acct_mang_nm%>
<%= curlist2Rec.rmtt_dt%>
<%= curlist2Rec.rmtt_plac%>
<%= curlist2Rec.rmtt_coms%>
<%= curlist2Rec.vat%>
<%= curlist2Rec.rcpm_plac_clsf%>
<%= curlist2Rec.dlco_no%>
<%= curlist2Rec.dlco_nm%>
<%= curlist2Rec.rcpm_slip_no%>
<%= curlist2Rec.self_cmpy_yn%>
<%= curlist2Rec.dept_cd%>
<%= curlist2Rec.mang_chrg_pers%>
<%= curlist2Rec.altn_yn%>
<%= curlist2Rec.depo_job_clsf%>
<%= curlist2Rec.clos_stat%>
<%= curlist2Rec.curc_clsf%>
<%= curlist2Rec.frex_amt%>
<%= curlist2Rec.rcpm_clsf%>
<%= curlist2Rec.current_clsf%>
<%= curlist2Rec.medi_cd%>
<%= curlist2Rec.medi_nm%>
<%= curlist2Rec.occr_dlco_cd%>
<%= curlist2Rec.occr_dlco_nm%>
<%= curlist2Rec.biz_reg_no%>
<%= curlist2Rec.bank_id%>
<%= curlist2Rec.acct_num%>
<%= curlist2Rec.tran_date%>
<%= curlist2Rec.tran_date_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 07 18:06:02 KST 2014 */