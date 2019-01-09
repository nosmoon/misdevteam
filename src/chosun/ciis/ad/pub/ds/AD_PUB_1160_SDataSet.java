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


package chosun.ciis.ad.pub.ds;

import java.sql.CallableStatement;
import java.sql.SQLException;

import somo.framework.util.Util;

/**
 * 
 */


public class AD_PUB_1160_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String medi_cd;
	public String proc_dt;
	public String proc_seq;
	public String pubc_occr_dt;
	public String pubc_occr_seq;
	public String hndl_clsf;
	public String dlco_no;
	public String dlco_nm;
	public String sect_cd;
	public String sect_seq;
	public String uprc;
	public String advt_fee;
	public String vat;
	public String pubc_tot_amt;
	public String hndl_plac_cd;
	public String hndl_plac_nm;
	public String coms_rate;
	public String coms;
	public String slcrg_pers;
	public String slcrg_pers_nm;
	public String dept_cd;
	public String dept_nm;
	public String mchrg_pers;
	public String mchrg_pers_nm;
	public String upd_resn;
	public String upd_cont;
	public String pubc_dt;
	public String pre_pubc_slip_no;
	public String upd_yn;
	public String clos_stat;
	public String clamt_stat;
	public String sale_stmt_issu_yn;
	public String purc_stmt_issu_yn;
	public String purc_stmt_issu_yn2;
	public String pubc_side;
	public String arow;
	public String guid_sec_kind_cd;

	public AD_PUB_1160_SDataSet(){}
	public AD_PUB_1160_SDataSet(String errcode, String errmsg, String medi_cd, String proc_dt, String proc_seq, String pubc_occr_dt, String pubc_occr_seq, String hndl_clsf, String dlco_no, String dlco_nm, String sect_cd, String sect_seq, String uprc, String advt_fee, String vat, String pubc_tot_amt, String hndl_plac_cd, String hndl_plac_nm, String coms_rate, String coms, String slcrg_pers, String slcrg_pers_nm, String dept_cd, String dept_nm, String mchrg_pers, String mchrg_pers_nm, String upd_resn, String upd_cont, String pubc_dt, String pre_pubc_slip_no, String upd_yn, String clos_stat, String clamt_stat, String sale_stmt_issu_yn, String purc_stmt_issu_yn, String purc_stmt_issu_yn2, String pubc_side, String arow, String guid_sec_kind_cd){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.medi_cd = medi_cd;
		this.proc_dt = proc_dt;
		this.proc_seq = proc_seq;
		this.pubc_occr_dt = pubc_occr_dt;
		this.pubc_occr_seq = pubc_occr_seq;
		this.hndl_clsf = hndl_clsf;
		this.dlco_no = dlco_no;
		this.dlco_nm = dlco_nm;
		this.sect_cd = sect_cd;
		this.sect_seq = sect_seq;
		this.uprc = uprc;
		this.advt_fee = advt_fee;
		this.vat = vat;
		this.pubc_tot_amt = pubc_tot_amt;
		this.hndl_plac_cd = hndl_plac_cd;
		this.hndl_plac_nm = hndl_plac_nm;
		this.coms_rate = coms_rate;
		this.coms = coms;
		this.slcrg_pers = slcrg_pers;
		this.slcrg_pers_nm = slcrg_pers_nm;
		this.dept_cd = dept_cd;
		this.dept_nm = dept_nm;
		this.mchrg_pers = mchrg_pers;
		this.mchrg_pers_nm = mchrg_pers_nm;
		this.upd_resn = upd_resn;
		this.upd_cont = upd_cont;
		this.pubc_dt = pubc_dt;
		this.pre_pubc_slip_no = pre_pubc_slip_no;
		this.upd_yn = upd_yn;
		this.clos_stat = clos_stat;
		this.clamt_stat = clamt_stat;
		this.sale_stmt_issu_yn = sale_stmt_issu_yn;
		this.purc_stmt_issu_yn = purc_stmt_issu_yn;
		this.purc_stmt_issu_yn2 = purc_stmt_issu_yn2;
		this.pubc_side = pubc_side;
		this.arow = arow;
		this.guid_sec_kind_cd = guid_sec_kind_cd;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setProc_dt(String proc_dt){
		this.proc_dt = proc_dt;
	}

	public void setProc_seq(String proc_seq){
		this.proc_seq = proc_seq;
	}

	public void setPubc_occr_dt(String pubc_occr_dt){
		this.pubc_occr_dt = pubc_occr_dt;
	}

	public void setPubc_occr_seq(String pubc_occr_seq){
		this.pubc_occr_seq = pubc_occr_seq;
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

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_seq(String sect_seq){
		this.sect_seq = sect_seq;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public void setVat(String vat){
		this.vat = vat;
	}

	public void setPubc_tot_amt(String pubc_tot_amt){
		this.pubc_tot_amt = pubc_tot_amt;
	}

	public void setHndl_plac_cd(String hndl_plac_cd){
		this.hndl_plac_cd = hndl_plac_cd;
	}

	public void setHndl_plac_nm(String hndl_plac_nm){
		this.hndl_plac_nm = hndl_plac_nm;
	}

	public void setComs_rate(String coms_rate){
		this.coms_rate = coms_rate;
	}

	public void setComs(String coms){
		this.coms = coms;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setSlcrg_pers_nm(String slcrg_pers_nm){
		this.slcrg_pers_nm = slcrg_pers_nm;
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

	public void setUpd_resn(String upd_resn){
		this.upd_resn = upd_resn;
	}

	public void setUpd_cont(String upd_cont){
		this.upd_cont = upd_cont;
	}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setPre_pubc_slip_no(String pre_pubc_slip_no){
		this.pre_pubc_slip_no = pre_pubc_slip_no;
	}

	public void setUpd_yn(String upd_yn){
		this.upd_yn = upd_yn;
	}

	public void setClos_stat(String clos_stat){
		this.clos_stat = clos_stat;
	}

	public void setClamt_stat(String clamt_stat){
		this.clamt_stat = clamt_stat;
	}

	public void setSale_stmt_issu_yn(String sale_stmt_issu_yn){
		this.sale_stmt_issu_yn = sale_stmt_issu_yn;
	}

	public void setPurc_stmt_issu_yn(String purc_stmt_issu_yn){
		this.purc_stmt_issu_yn = purc_stmt_issu_yn;
	}
	
	public void setPurc_stmt_issu_yn2(String purc_stmt_issu_yn2){
		this.purc_stmt_issu_yn2 = purc_stmt_issu_yn2;
	}

	public void setPubc_side(String pubc_side){
		this.pubc_side = pubc_side;
	}

	public void setArow(String arow){
		this.arow = arow;
	}

	public void setGuid_sec_kind_cd(String guid_sec_kind_cd){
		this.guid_sec_kind_cd = guid_sec_kind_cd;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getProc_dt(){
		return this.proc_dt;
	}

	public String getProc_seq(){
		return this.proc_seq;
	}

	public String getPubc_occr_dt(){
		return this.pubc_occr_dt;
	}

	public String getPubc_occr_seq(){
		return this.pubc_occr_seq;
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

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_seq(){
		return this.sect_seq;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}

	public String getVat(){
		return this.vat;
	}

	public String getPubc_tot_amt(){
		return this.pubc_tot_amt;
	}

	public String getHndl_plac_cd(){
		return this.hndl_plac_cd;
	}

	public String getHndl_plac_nm(){
		return this.hndl_plac_nm;
	}

	public String getComs_rate(){
		return this.coms_rate;
	}

	public String getComs(){
		return this.coms;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getSlcrg_pers_nm(){
		return this.slcrg_pers_nm;
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

	public String getUpd_resn(){
		return this.upd_resn;
	}

	public String getUpd_cont(){
		return this.upd_cont;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getPre_pubc_slip_no(){
		return this.pre_pubc_slip_no;
	}

	public String getUpd_yn(){
		return this.upd_yn;
	}

	public String getClos_stat(){
		return this.clos_stat;
	}

	public String getClamt_stat(){
		return this.clamt_stat;
	}

	public String getSale_stmt_issu_yn(){
		return this.sale_stmt_issu_yn;
	}

	public String getPurc_stmt_issu_yn(){
		return this.purc_stmt_issu_yn;
	}
	
	public String getPurc_stmt_issu_yn2(){
		return this.purc_stmt_issu_yn2;
	}

	public String getPubc_side(){
		return this.pubc_side;
	}

	public String getArow(){
		return this.arow;
	}

	public String getGuid_sec_kind_cd(){
		return this.guid_sec_kind_cd;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.medi_cd = Util.checkString(cstmt.getString(4));
		this.proc_dt = Util.checkString(cstmt.getString(5));
		this.proc_seq = Util.checkString(cstmt.getString(6));
		this.pubc_occr_dt = Util.checkString(cstmt.getString(7));
		this.pubc_occr_seq = Util.checkString(cstmt.getString(8));
		this.hndl_clsf = Util.checkString(cstmt.getString(9));
		this.dlco_no = Util.checkString(cstmt.getString(10));
		this.dlco_nm = Util.checkString(cstmt.getString(11));
		this.sect_cd = Util.checkString(cstmt.getString(12));
		this.sect_seq = Util.checkString(cstmt.getString(13));
		this.uprc = Util.checkString(cstmt.getString(14));
		this.advt_fee = Util.checkString(cstmt.getString(15));
		this.vat = Util.checkString(cstmt.getString(16));
		this.pubc_tot_amt = Util.checkString(cstmt.getString(17));
		this.hndl_plac_cd = Util.checkString(cstmt.getString(18));
		this.hndl_plac_nm = Util.checkString(cstmt.getString(19));
		this.coms_rate = Util.checkString(cstmt.getString(20));
		this.coms = Util.checkString(cstmt.getString(21));
		this.slcrg_pers = Util.checkString(cstmt.getString(22));
		this.slcrg_pers_nm = Util.checkString(cstmt.getString(23));
		this.dept_cd = Util.checkString(cstmt.getString(24));
		this.dept_nm = Util.checkString(cstmt.getString(25));
		this.mchrg_pers = Util.checkString(cstmt.getString(26));
		this.mchrg_pers_nm = Util.checkString(cstmt.getString(27));
		this.upd_resn = Util.checkString(cstmt.getString(28));
		this.upd_cont = Util.checkString(cstmt.getString(29));
		this.pubc_dt = Util.checkString(cstmt.getString(30));
		this.pre_pubc_slip_no = Util.checkString(cstmt.getString(31));
		this.upd_yn = Util.checkString(cstmt.getString(32));
		this.clos_stat = Util.checkString(cstmt.getString(33));
		this.clamt_stat = Util.checkString(cstmt.getString(34));
		this.sale_stmt_issu_yn = Util.checkString(cstmt.getString(35));
		this.purc_stmt_issu_yn = Util.checkString(cstmt.getString(36));
		this.purc_stmt_issu_yn2 = Util.checkString(cstmt.getString(37));
		this.pubc_side = Util.checkString(cstmt.getString(38));
		this.arow = Util.checkString(cstmt.getString(39));
		this.guid_sec_kind_cd = Util.checkString(cstmt.getString(40));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_PUB_1160_SDataSet ds = (AD_PUB_1160_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedi_cd()%>
<%= ds.getProc_dt()%>
<%= ds.getProc_seq()%>
<%= ds.getPubc_occr_dt()%>
<%= ds.getPubc_occr_seq()%>
<%= ds.getHndl_clsf()%>
<%= ds.getDlco_no()%>
<%= ds.getDlco_nm()%>
<%= ds.getSect_cd()%>
<%= ds.getSect_seq()%>
<%= ds.getUprc()%>
<%= ds.getAdvt_fee()%>
<%= ds.getVat()%>
<%= ds.getPubc_tot_amt()%>
<%= ds.getHndl_plac_cd()%>
<%= ds.getHndl_plac_nm()%>
<%= ds.getComs_rate()%>
<%= ds.getComs()%>
<%= ds.getSlcrg_pers()%>
<%= ds.getSlcrg_pers_nm()%>
<%= ds.getDept_cd()%>
<%= ds.getDept_nm()%>
<%= ds.getMchrg_pers()%>
<%= ds.getMchrg_pers_nm()%>
<%= ds.getUpd_resn()%>
<%= ds.getUpd_cont()%>
<%= ds.getPubc_dt()%>
<%= ds.getPre_pubc_slip_no()%>
<%= ds.getUpd_yn()%>
<%= ds.getClos_stat()%>
<%= ds.getClamt_stat()%>
<%= ds.getSale_stmt_issu_yn()%>
<%= ds.getPurc_stmt_issu_yn()%>
<%= ds.getPubc_side()%>
<%= ds.getArow()%>
<%= ds.getGuid_sec_kind_cd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 10 17:21:56 KST 2009 */