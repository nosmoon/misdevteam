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


package chosun.ciis.sp.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_1620_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String seq;
	public String proc_clsf;
	public String car_no;
	public String car_ownr_nm;
	public String prn;
	public String ptph_no;
	public String addr;
	public String dtls_addr;
	public String yy_styl;
	public String engn_dsplt;
	public String car_clsf;
	public String insr_entr_hope_yn;
	public String insr_rmtt_plan_dt;
	public String bank_nm;
	public String rcpm_pers_nm;
	public String dlco_clsf;
	public String dlco_cd;
	public String dlco_seq;

	public SP_SAL_1620_SDataSet(){}
	public SP_SAL_1620_SDataSet(String errcode, String errmsg, String seq, String proc_clsf, String car_no, String car_ownr_nm, String prn, String ptph_no, String addr, String dtls_addr, String yy_styl, String engn_dsplt, String car_clsf, String insr_entr_hope_yn, String insr_rmtt_plan_dt, String bank_nm, String rcpm_pers_nm, String dlco_clsf, String dlco_cd, String dlco_seq){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.seq = seq;
		this.proc_clsf = proc_clsf;
		this.car_no = car_no;
		this.car_ownr_nm = car_ownr_nm;
		this.prn = prn;
		this.ptph_no = ptph_no;
		this.addr = addr;
		this.dtls_addr = dtls_addr;
		this.yy_styl = yy_styl;
		this.engn_dsplt = engn_dsplt;
		this.car_clsf = car_clsf;
		this.insr_entr_hope_yn = insr_entr_hope_yn;
		this.insr_rmtt_plan_dt = insr_rmtt_plan_dt;
		this.bank_nm = bank_nm;
		this.rcpm_pers_nm = rcpm_pers_nm;
		this.dlco_clsf = dlco_clsf;
		this.dlco_cd = dlco_cd;
		this.dlco_seq = dlco_seq;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setProc_clsf(String proc_clsf){
		this.proc_clsf = proc_clsf;
	}

	public void setCar_no(String car_no){
		this.car_no = car_no;
	}

	public void setCar_ownr_nm(String car_ownr_nm){
		this.car_ownr_nm = car_ownr_nm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtls_addr(String dtls_addr){
		this.dtls_addr = dtls_addr;
	}

	public void setYy_styl(String yy_styl){
		this.yy_styl = yy_styl;
	}

	public void setEngn_dsplt(String engn_dsplt){
		this.engn_dsplt = engn_dsplt;
	}

	public void setCar_clsf(String car_clsf){
		this.car_clsf = car_clsf;
	}

	public void setInsr_entr_hope_yn(String insr_entr_hope_yn){
		this.insr_entr_hope_yn = insr_entr_hope_yn;
	}

	public void setInsr_rmtt_plan_dt(String insr_rmtt_plan_dt){
		this.insr_rmtt_plan_dt = insr_rmtt_plan_dt;
	}

	public void setBank_nm(String bank_nm){
		this.bank_nm = bank_nm;
	}

	public void setRcpm_pers_nm(String rcpm_pers_nm){
		this.rcpm_pers_nm = rcpm_pers_nm;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_seq(String dlco_seq){
		this.dlco_seq = dlco_seq;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getProc_clsf(){
		return this.proc_clsf;
	}

	public String getCar_no(){
		return this.car_no;
	}

	public String getCar_ownr_nm(){
		return this.car_ownr_nm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtls_addr(){
		return this.dtls_addr;
	}

	public String getYy_styl(){
		return this.yy_styl;
	}

	public String getEngn_dsplt(){
		return this.engn_dsplt;
	}

	public String getCar_clsf(){
		return this.car_clsf;
	}

	public String getInsr_entr_hope_yn(){
		return this.insr_entr_hope_yn;
	}

	public String getInsr_rmtt_plan_dt(){
		return this.insr_rmtt_plan_dt;
	}

	public String getBank_nm(){
		return this.bank_nm;
	}

	public String getRcpm_pers_nm(){
		return this.rcpm_pers_nm;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_seq(){
		return this.dlco_seq;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.seq = Util.checkString(cstmt.getString(8));
		this.proc_clsf = Util.checkString(cstmt.getString(9));
		this.car_no = Util.checkString(cstmt.getString(10));
		this.car_ownr_nm = Util.checkString(cstmt.getString(11));
		this.prn = Util.checkString(cstmt.getString(12));
		this.ptph_no = Util.checkString(cstmt.getString(13));
		this.addr = Util.checkString(cstmt.getString(14));
		this.dtls_addr = Util.checkString(cstmt.getString(15));
		this.yy_styl = Util.checkString(cstmt.getString(16));
		this.engn_dsplt = Util.checkString(cstmt.getString(17));
		this.car_clsf = Util.checkString(cstmt.getString(18));
		this.insr_entr_hope_yn = Util.checkString(cstmt.getString(19));
		this.insr_rmtt_plan_dt = Util.checkString(cstmt.getString(20));
		this.bank_nm = Util.checkString(cstmt.getString(21));
		this.rcpm_pers_nm = Util.checkString(cstmt.getString(22));
		this.dlco_clsf = Util.checkString(cstmt.getString(23));
		this.dlco_cd = Util.checkString(cstmt.getString(24));
		this.dlco_seq = Util.checkString(cstmt.getString(25));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SP_SAL_1620_SDataSet ds = (SP_SAL_1620_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSeq()%>
<%= ds.getProc_clsf()%>
<%= ds.getCar_no()%>
<%= ds.getCar_ownr_nm()%>
<%= ds.getPrn()%>
<%= ds.getPtph_no()%>
<%= ds.getAddr()%>
<%= ds.getDtls_addr()%>
<%= ds.getYy_styl()%>
<%= ds.getEngn_dsplt()%>
<%= ds.getCar_clsf()%>
<%= ds.getInsr_entr_hope_yn()%>
<%= ds.getInsr_rmtt_plan_dt()%>
<%= ds.getBank_nm()%>
<%= ds.getRcpm_pers_nm()%>
<%= ds.getDlco_clsf()%>
<%= ds.getDlco_cd()%>
<%= ds.getDlco_seq()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 06 10:24:20 KST 2012 */