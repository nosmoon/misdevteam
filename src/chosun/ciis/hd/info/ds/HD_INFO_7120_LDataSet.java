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


package chosun.ciis.hd.info.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_7120_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String supr_dept_cd;
	public String dept_cd;
	public String chrg_posk_cd;
	public String medi_cd;
	public String thrw_pgm;
	public String medi_cd2;
	public String thrw_pgm2;
	public String servcost;
	public String etc_pay_cond;
	public String cntr_dt;
	public String cntr_expr_dt;
	public String lvcmpy_dt;
	public String draft_no;
	public String draft_dept_cd;
	public String mang_no;
	public String tel_no;
	public String addr;
	public String acct_no;
	public String bank_cd;
	public String bank_nm;
	public String flnm;
	public String prn;
	public String zip_code;
	public String work_yn;
	public String incm_clsf_cd;
	public String pay_cycl;
	public String frlc_no;
	public String remk;

	public HD_INFO_7120_LDataSet(){}
	public HD_INFO_7120_LDataSet(String errcode, String errmsg, String supr_dept_cd, String dept_cd, String chrg_posk_cd, String medi_cd, String thrw_pgm, String medi_cd2, String thrw_pgm2, String servcost, String etc_pay_cond, String cntr_dt, String cntr_expr_dt, String lvcmpy_dt, String draft_no, String draft_dept_cd, String mang_no, String tel_no, String addr, String acct_no, String bank_cd, String bank_nm, String flnm, String prn, String zip_code, String work_yn, String incm_clsf_cd, String pay_cycl, String frlc_no,String remk){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.supr_dept_cd = supr_dept_cd;
		this.dept_cd = dept_cd;
		this.chrg_posk_cd = chrg_posk_cd;
		this.medi_cd = medi_cd;
		this.thrw_pgm = thrw_pgm;
		this.medi_cd2 = medi_cd2;
		this.thrw_pgm2 = thrw_pgm2;
		this.servcost = servcost;
		this.etc_pay_cond = etc_pay_cond;
		this.cntr_dt = cntr_dt;
		this.cntr_expr_dt = cntr_expr_dt;
		this.lvcmpy_dt = lvcmpy_dt;
		this.draft_no = draft_no;
		this.draft_dept_cd = draft_dept_cd;
		this.mang_no = mang_no;
		this.tel_no = tel_no;
		this.addr = addr;
		this.acct_no = acct_no;
		this.bank_cd = bank_cd;
		this.bank_nm = bank_nm;
		this.flnm = flnm;
		this.prn = prn;
		this.zip_code = zip_code;
		this.work_yn = work_yn;
		this.incm_clsf_cd = incm_clsf_cd;
		this.pay_cycl = pay_cycl;
		this.frlc_no = frlc_no;
		this.remk = remk;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSupr_dept_cd(String supr_dept_cd){
		this.supr_dept_cd = supr_dept_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setChrg_posk_cd(String chrg_posk_cd){
		this.chrg_posk_cd = chrg_posk_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setThrw_pgm(String thrw_pgm){
		this.thrw_pgm = thrw_pgm;
	}

	public void setMedi_cd2(String medi_cd2){
		this.medi_cd2 = medi_cd2;
	}

	public void setThrw_pgm2(String thrw_pgm2){
		this.thrw_pgm2 = thrw_pgm2;
	}

	public void setServcost(String servcost){
		this.servcost = servcost;
	}

	public void setEtc_pay_cond(String etc_pay_cond){
		this.etc_pay_cond = etc_pay_cond;
	}

	public void setCntr_dt(String cntr_dt){
		this.cntr_dt = cntr_dt;
	}

	public void setCntr_expr_dt(String cntr_expr_dt){
		this.cntr_expr_dt = cntr_expr_dt;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public void setDraft_no(String draft_no){
		this.draft_no = draft_no;
	}

	public void setDraft_dept_cd(String draft_dept_cd){
		this.draft_dept_cd = draft_dept_cd;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setBank_nm(String bank_nm){
		this.bank_nm = bank_nm;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setZip_code(String zip_code){
		this.zip_code = zip_code;
	}

	public void setWork_yn(String work_yn){
		this.work_yn = work_yn;
	}

	public void setIncm_clsf_cd(String incm_clsf_cd){
		this.incm_clsf_cd = incm_clsf_cd;
	}

	public void setPay_cycl(String pay_cycl){
		this.pay_cycl = pay_cycl;
	}

	public void setFrlc_no(String frlc_no){
		this.frlc_no = frlc_no;
	}
	

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSupr_dept_cd(){
		return this.supr_dept_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getChrg_posk_cd(){
		return this.chrg_posk_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getThrw_pgm(){
		return this.thrw_pgm;
	}

	public String getMedi_cd2(){
		return this.medi_cd2;
	}

	public String getThrw_pgm2(){
		return this.thrw_pgm2;
	}

	public String getServcost(){
		return this.servcost;
	}

	public String getEtc_pay_cond(){
		return this.etc_pay_cond;
	}

	public String getCntr_dt(){
		return this.cntr_dt;
	}

	public String getCntr_expr_dt(){
		return this.cntr_expr_dt;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}

	public String getDraft_no(){
		return this.draft_no;
	}

	public String getDraft_dept_cd(){
		return this.draft_dept_cd;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getBank_nm(){
		return this.bank_nm;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getZip_code(){
		return this.zip_code;
	}

	public String getWork_yn(){
		return this.work_yn;
	}

	public String getIncm_clsf_cd(){
		return this.incm_clsf_cd;
	}

	public String getPay_cycl(){
		return this.pay_cycl;
	}

	public String getFrlc_no(){
		return this.frlc_no;
	}
	
	public String getRemk(){
		return this.remk;
	}


	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.supr_dept_cd = Util.checkString(cstmt.getString(7));
		this.dept_cd = Util.checkString(cstmt.getString(8));
		this.chrg_posk_cd = Util.checkString(cstmt.getString(9));
		this.medi_cd = Util.checkString(cstmt.getString(10));
		this.thrw_pgm = Util.checkString(cstmt.getString(11));
		this.medi_cd2 = Util.checkString(cstmt.getString(12));
		this.thrw_pgm2 = Util.checkString(cstmt.getString(13));
		this.servcost = Util.checkString(cstmt.getString(14));
		this.etc_pay_cond = Util.checkString(cstmt.getString(15));
		this.cntr_dt = Util.checkString(cstmt.getString(16));
		this.cntr_expr_dt = Util.checkString(cstmt.getString(17));
		this.lvcmpy_dt = Util.checkString(cstmt.getString(18));
		this.draft_no = Util.checkString(cstmt.getString(19));
		this.draft_dept_cd = Util.checkString(cstmt.getString(20));
		this.mang_no = Util.checkString(cstmt.getString(21));
		this.tel_no = Util.checkString(cstmt.getString(22));
		this.addr = Util.checkString(cstmt.getString(23));
		this.acct_no = Util.checkString(cstmt.getString(24));
		this.bank_cd = Util.checkString(cstmt.getString(25));
		this.bank_nm = Util.checkString(cstmt.getString(26));
		this.flnm = Util.checkString(cstmt.getString(27));
		this.prn = Util.checkString(cstmt.getString(28));
		this.zip_code = Util.checkString(cstmt.getString(29));
		this.work_yn = Util.checkString(cstmt.getString(30));
		this.incm_clsf_cd = Util.checkString(cstmt.getString(31));
		this.pay_cycl = Util.checkString(cstmt.getString(32));
		this.frlc_no = Util.checkString(cstmt.getString(33));
		this.remk = Util.checkString(cstmt.getString(34));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_INFO_7120_LDataSet ds = (HD_INFO_7120_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSupr_dept_cd()%>
<%= ds.getDept_cd()%>
<%= ds.getChrg_posk_cd()%>
<%= ds.getMedi_cd()%>
<%= ds.getThrw_pgm()%>
<%= ds.getMedi_cd2()%>
<%= ds.getThrw_pgm2()%>
<%= ds.getServcost()%>
<%= ds.getEtc_pay_cond()%>
<%= ds.getCntr_dt()%>
<%= ds.getCntr_expr_dt()%>
<%= ds.getLvcmpy_dt()%>
<%= ds.getDraft_no()%>
<%= ds.getDraft_dept_cd()%>
<%= ds.getMang_no()%>
<%= ds.getTel_no()%>
<%= ds.getAddr()%>
<%= ds.getAcct_no()%>
<%= ds.getBank_cd()%>
<%= ds.getBank_nm()%>
<%= ds.getFlnm()%>
<%= ds.getPrn()%>
<%= ds.getZip_code()%>
<%= ds.getWork_yn()%>
<%= ds.getIncm_clsf_cd()%>
<%= ds.getPay_cycl()%>
<%= ds.getFrlc_no()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 09 16:58:55 KST 2013 */