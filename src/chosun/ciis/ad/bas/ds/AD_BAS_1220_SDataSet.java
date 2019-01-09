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
import java.sql.SQLException;

import somo.framework.util.Util;

/**
 * 
 */


public class AD_BAS_1220_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String hndl_clsf;
	public String dlco_nm;
	public String cntr_dt;
	public String colt_amt;
	public String mm_avg_pubc_amt;
	public String colt_ratio;
	public String avg_due_dd;
	public String dhon_note_bal;
	public String recebilll;
	public String unrcp_amt;
	public String un_pay_fee;
	public String precpt_amt;
	public String remk;
	public String slcrg_pers;
	public String slcrg_pers_nm;
	public String slcrg_opn;
	public String mchrg_pers;
	public String mchrg_pers_nm;
	public String mchrg_opn;
	public String taem_chf_opn;

	public AD_BAS_1220_SDataSet(){}
	public AD_BAS_1220_SDataSet(String errcode, String errmsg, String hndl_clsf, String dlco_nm, String cntr_dt, String colt_amt, String mm_avg_pubc_amt, String colt_ratio, String avg_due_dd, String dhon_note_bal, String recebilll, String unrcp_amt, String un_pay_fee, String precpt_amt, String remk, String slcrg_pers, String slcrg_pers_nm, String slcrg_opn, String mchrg_pers, String mchrg_pers_nm, String mchrg_opn, String taem_chf_opn){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.hndl_clsf = hndl_clsf;
		this.dlco_nm = dlco_nm;
		this.cntr_dt = cntr_dt;
		this.colt_amt = colt_amt;
		this.mm_avg_pubc_amt = mm_avg_pubc_amt;
		this.colt_ratio = colt_ratio;
		this.avg_due_dd = avg_due_dd;
		this.dhon_note_bal = dhon_note_bal;
		this.recebilll = recebilll;
		this.unrcp_amt = unrcp_amt;
		this.un_pay_fee = un_pay_fee;
		this.precpt_amt = precpt_amt;
		this.remk = remk;
		this.slcrg_pers = slcrg_pers;
		this.slcrg_pers_nm = slcrg_pers_nm;
		this.slcrg_opn = slcrg_opn;
		this.mchrg_pers = mchrg_pers;
		this.mchrg_pers_nm = mchrg_pers_nm;
		this.mchrg_opn = mchrg_opn;
		this.taem_chf_opn = taem_chf_opn;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setHndl_clsf(String hndl_clsf){
		this.hndl_clsf = hndl_clsf;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setCntr_dt(String cntr_dt){
		this.cntr_dt = cntr_dt;
	}

	public void setColt_amt(String colt_amt){
		this.colt_amt = colt_amt;
	}

	public void setMm_avg_pubc_amt(String mm_avg_pubc_amt){
		this.mm_avg_pubc_amt = mm_avg_pubc_amt;
	}

	public void setColt_ratio(String colt_ratio){
		this.colt_ratio = colt_ratio;
	}

	public void setAvg_due_dd(String avg_due_dd){
		this.avg_due_dd = avg_due_dd;
	}

	public void setDhon_note_bal(String dhon_note_bal){
		this.dhon_note_bal = dhon_note_bal;
	}

	public void setRecebilll(String recebilll){
		this.recebilll = recebilll;
	}

	public void setUnrcp_amt(String unrcp_amt){
		this.unrcp_amt = unrcp_amt;
	}

	public void setUn_pay_fee(String un_pay_fee){
		this.un_pay_fee = un_pay_fee;
	}

	public void setPrecpt_amt(String precpt_amt){
		this.precpt_amt = precpt_amt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setSlcrg_pers_nm(String slcrg_pers_nm){
		this.slcrg_pers_nm = slcrg_pers_nm;
	}

	public void setSlcrg_opn(String slcrg_opn){
		this.slcrg_opn = slcrg_opn;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setMchrg_pers_nm(String mchrg_pers_nm){
		this.mchrg_pers_nm = mchrg_pers_nm;
	}

	public void setMchrg_opn(String mchrg_opn){
		this.mchrg_opn = mchrg_opn;
	}

	public void setTaem_chf_opn(String taem_chf_opn){
		this.taem_chf_opn = taem_chf_opn;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getHndl_clsf(){
		return this.hndl_clsf;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getCntr_dt(){
		return this.cntr_dt;
	}

	public String getColt_amt(){
		return this.colt_amt;
	}

	public String getMm_avg_pubc_amt(){
		return this.mm_avg_pubc_amt;
	}

	public String getColt_ratio(){
		return this.colt_ratio;
	}

	public String getAvg_due_dd(){
		return this.avg_due_dd;
	}

	public String getDhon_note_bal(){
		return this.dhon_note_bal;
	}

	public String getRecebilll(){
		return this.recebilll;
	}

	public String getUnrcp_amt(){
		return this.unrcp_amt;
	}

	public String getUn_pay_fee(){
		return this.un_pay_fee;
	}

	public String getPrecpt_amt(){
		return this.precpt_amt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getSlcrg_pers_nm(){
		return this.slcrg_pers_nm;
	}

	public String getSlcrg_opn(){
		return this.slcrg_opn;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getMchrg_pers_nm(){
		return this.mchrg_pers_nm;
	}

	public String getMchrg_opn(){
		return this.mchrg_opn;
	}

	public String getTaem_chf_opn(){
		return this.taem_chf_opn;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.hndl_clsf = Util.checkString(cstmt.getString(6));
		this.dlco_nm = Util.checkString(cstmt.getString(7));
		this.cntr_dt = Util.checkString(cstmt.getString(8));
		this.colt_amt = Util.checkString(cstmt.getString(9));
		this.mm_avg_pubc_amt = Util.checkString(cstmt.getString(10));
		this.colt_ratio = Util.checkString(cstmt.getString(11));
		this.avg_due_dd = Util.checkString(cstmt.getString(12));
		this.dhon_note_bal = Util.checkString(cstmt.getString(13));
		this.recebilll = Util.checkString(cstmt.getString(14));
		this.unrcp_amt = Util.checkString(cstmt.getString(15));
		this.un_pay_fee = Util.checkString(cstmt.getString(16));
		this.precpt_amt = Util.checkString(cstmt.getString(17));
		this.remk = Util.checkString(cstmt.getString(18));
		this.slcrg_pers = Util.checkString(cstmt.getString(19));
		this.slcrg_pers_nm = Util.checkString(cstmt.getString(20));
		this.slcrg_opn = Util.checkString(cstmt.getString(21));
		this.mchrg_pers = Util.checkString(cstmt.getString(22));
		this.mchrg_pers_nm = Util.checkString(cstmt.getString(23));
		this.mchrg_opn = Util.checkString(cstmt.getString(24));
		this.taem_chf_opn = Util.checkString(cstmt.getString(25));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_1220_SDataSet ds = (AD_BAS_1220_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getHndl_clsf()%>
<%= ds.getDlco_nm()%>
<%= ds.getCntr_dt()%>
<%= ds.getColt_amt()%>
<%= ds.getMm_avg_pubc_amt()%>
<%= ds.getColt_ratio()%>
<%= ds.getAvg_due_dd()%>
<%= ds.getDhon_note_bal()%>
<%= ds.getRecebilll()%>
<%= ds.getUnrcp_amt()%>
<%= ds.getUn_pay_fee()%>
<%= ds.getPrecpt_amt()%>
<%= ds.getRemk()%>
<%= ds.getSlcrg_pers()%>
<%= ds.getSlcrg_pers_nm()%>
<%= ds.getSlcrg_opn()%>
<%= ds.getMchrg_pers()%>
<%= ds.getMchrg_pers_nm()%>
<%= ds.getMchrg_opn()%>
<%= ds.getTaem_chf_opn()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 04 15:33:04 KST 2009 */