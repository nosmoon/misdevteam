/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 2009-01-29
* 작성자 : 김태길
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.dep.ds;

import java.sql.CallableStatement;
import java.sql.SQLException;

import somo.framework.util.Util;

/**
 * 
 */


public class AD_DEP_1520_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String payo_slip_no;
	public String rcpm_slip_no;
	public String actu_slip_no;
	public String hndl_clsf;
	public String dlco_no;
	public String dlco_nm;
	public String payo_clsf;
	public String rcpm_tot_amt;
	public String medi_cd;
	public String drbk_amt;
	public String clos_stat;

	public AD_DEP_1520_SDataSet(){}
	public AD_DEP_1520_SDataSet(String errcode, String errmsg, String slip_occr_dt, String slip_clsf_cd, String slip_seq, String payo_slip_no, String rcpm_slip_no, String actu_slip_no, String hndl_clsf, String dlco_no, String dlco_nm, String payo_clsf, String rcpm_tot_amt, String medi_cd, String drbk_amt, String clos_stat){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_seq = slip_seq;
		this.payo_slip_no = payo_slip_no;
		this.rcpm_slip_no = rcpm_slip_no;
		this.actu_slip_no = actu_slip_no;
		this.hndl_clsf = hndl_clsf;
		this.dlco_no = dlco_no;
		this.dlco_nm = dlco_nm;
		this.payo_clsf = payo_clsf;
		this.rcpm_tot_amt = rcpm_tot_amt;
		this.medi_cd = medi_cd;
		this.drbk_amt = drbk_amt;
		this.clos_stat = clos_stat;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setPayo_slip_no(String payo_slip_no){
		this.payo_slip_no = payo_slip_no;
	}

	public void setRcpm_slip_no(String rcpm_slip_no){
		this.rcpm_slip_no = rcpm_slip_no;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public void setHndl_clsf(String hndl_clsf){
		this.hndl_clsf = hndl_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setPayo_clsf(String payo_clsf){
		this.payo_clsf = payo_clsf;
	}

	public void setRcpm_tot_amt(String rcpm_tot_amt){
		this.rcpm_tot_amt = rcpm_tot_amt;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDrbk_amt(String drbk_amt){
		this.drbk_amt = drbk_amt;
	}

	public void setClos_stat(String clos_stat){
		this.clos_stat = clos_stat;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getPayo_slip_no(){
		return this.payo_slip_no;
	}

	public String getRcpm_slip_no(){
		return this.rcpm_slip_no;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getHndl_clsf(){
		return this.hndl_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getPayo_clsf(){
		return this.payo_clsf;
	}

	public String getRcpm_tot_amt(){
		return this.rcpm_tot_amt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDrbk_amt(){
		return this.drbk_amt;
	}

	public String getClos_stat(){
		return this.clos_stat;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.slip_occr_dt = Util.checkString(cstmt.getString(5));
		this.slip_clsf_cd = Util.checkString(cstmt.getString(6));
		this.slip_seq = Util.checkString(cstmt.getString(7));
		this.payo_slip_no = Util.checkString(cstmt.getString(8));
		this.rcpm_slip_no = Util.checkString(cstmt.getString(9));
		this.actu_slip_no = Util.checkString(cstmt.getString(10));
		this.hndl_clsf = Util.checkString(cstmt.getString(11));
		this.dlco_no = Util.checkString(cstmt.getString(12));
		this.dlco_nm = Util.checkString(cstmt.getString(13));
		this.payo_clsf = Util.checkString(cstmt.getString(14));
		this.rcpm_tot_amt = Util.checkString(cstmt.getString(15));
		this.medi_cd = Util.checkString(cstmt.getString(16));
		this.drbk_amt = Util.checkString(cstmt.getString(17));
		this.clos_stat = Util.checkString(cstmt.getString(18));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_DEP_1520_SDataSet ds = (AD_DEP_1520_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSlip_occr_dt()%>
<%= ds.getSlip_clsf_cd()%>
<%= ds.getSlip_seq()%>
<%= ds.getPayo_slip_no()%>
<%= ds.getRcpm_slip_no()%>
<%= ds.getActu_slip_no()%>
<%= ds.getHndl_clsf()%>
<%= ds.getDlco_no()%>
<%= ds.getDlco_nm()%>
<%= ds.getPayo_clsf()%>
<%= ds.getRcpm_tot_amt()%>
<%= ds.getMedi_cd()%>
<%= ds.getDrbk_amt()%>
<%= ds.getClos_stat()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 25 12:16:44 KST 2009 */