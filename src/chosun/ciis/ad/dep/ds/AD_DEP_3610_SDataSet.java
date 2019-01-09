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


package chosun.ciis.ad.dep.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.dep.dm.*;
import chosun.ciis.ad.dep.rec.*;

/**
 * 
 */


public class AD_DEP_3610_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String rept_no;
	public String medi_nm;
	public String dlco_no;
	public String dlco_nm;
	public String pubc_frdt;
	public String pubc_todt;
	public String advt_cont;
	public String pubc_amt;
	public String rcpm_amt;
	public String unrcp_amt;
	public String slcrg_pers;
	public String slcrg_pers_nm;
	public String mchrg_pers;
	public String mchrg_pers_nm;
	public String ern;
	public String presi_nm;
	public String tel_no;
	public String eps_clsf;
	public String zip_no;
	public String addr;
	public String dtls_addr;
	public String remk;
	public String occr_caus_busn;
	public String occr_caus_mang;
	public String act_matt_busn;
	public String act_matt_mang;
	public String proc_plan_busn;
	public String proc_plan_mang;
	public String enty_clsf;
	public String dhon_medi_nm;
	public String dhon_dlco_nm;
	public String note_no;
	public String min_dhon_occr_dt;
	public String max_dhon_occr_dt;
	public String dhon_amt;
	public String dhon_rcpm_amt;
	public String dhon_bal;
	public String issu_pers_nm;
	public String dhon_slcrg_pers;
	public String dhon_slcrg_pers_nm;
	public String dhon_mchrg_pers;
	public String dhon_mchrg_pers_nm;

	public AD_DEP_3610_SDataSet(){}
	public AD_DEP_3610_SDataSet(String errcode, String errmsg, String rept_no, String medi_nm, String dlco_no, String dlco_nm, String pubc_frdt, String pubc_todt, String advt_cont, String pubc_amt, String rcpm_amt, String unrcp_amt, String slcrg_pers, String slcrg_pers_nm, String mchrg_pers, String mchrg_pers_nm, String ern, String presi_nm, String tel_no, String eps_clsf, String zip_no, String addr, String dtls_addr, String remk, String occr_caus_busn, String occr_caus_mang, String act_matt_busn, String act_matt_mang, String proc_plan_busn, String proc_plan_mang, String enty_clsf, String dhon_medi_nm, String dhon_dlco_nm, String note_no, String min_dhon_occr_dt, String max_dhon_occr_dt, String dhon_amt, String dhon_rcpm_amt, String dhon_bal, String issu_pers_nm, String dhon_slcrg_pers, String dhon_slcrg_pers_nm, String dhon_mchrg_pers, String dhon_mchrg_pers_nm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.rept_no = rept_no;
		this.medi_nm = medi_nm;
		this.dlco_no = dlco_no;
		this.dlco_nm = dlco_nm;
		this.pubc_frdt = pubc_frdt;
		this.pubc_todt = pubc_todt;
		this.advt_cont = advt_cont;
		this.pubc_amt = pubc_amt;
		this.rcpm_amt = rcpm_amt;
		this.unrcp_amt = unrcp_amt;
		this.slcrg_pers = slcrg_pers;
		this.slcrg_pers_nm = slcrg_pers_nm;
		this.mchrg_pers = mchrg_pers;
		this.mchrg_pers_nm = mchrg_pers_nm;
		this.ern = ern;
		this.presi_nm = presi_nm;
		this.tel_no = tel_no;
		this.eps_clsf = eps_clsf;
		this.zip_no = zip_no;
		this.addr = addr;
		this.dtls_addr = dtls_addr;
		this.remk = remk;
		this.occr_caus_busn = occr_caus_busn;
		this.occr_caus_mang = occr_caus_mang;
		this.act_matt_busn = act_matt_busn;
		this.act_matt_mang = act_matt_mang;
		this.proc_plan_busn = proc_plan_busn;
		this.proc_plan_mang = proc_plan_mang;
		this.enty_clsf = enty_clsf;
		this.dhon_medi_nm = dhon_medi_nm;
		this.dhon_dlco_nm = dhon_dlco_nm;
		this.note_no = note_no;
		this.min_dhon_occr_dt = min_dhon_occr_dt;
		this.max_dhon_occr_dt = max_dhon_occr_dt;
		this.dhon_amt = dhon_amt;
		this.dhon_rcpm_amt = dhon_rcpm_amt;
		this.dhon_bal = dhon_bal;
		this.issu_pers_nm = issu_pers_nm;
		this.dhon_slcrg_pers = dhon_slcrg_pers;
		this.dhon_slcrg_pers_nm = dhon_slcrg_pers_nm;
		this.dhon_mchrg_pers = dhon_mchrg_pers;
		this.dhon_mchrg_pers_nm = dhon_mchrg_pers_nm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setRept_no(String rept_no){
		this.rept_no = rept_no;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setPubc_frdt(String pubc_frdt){
		this.pubc_frdt = pubc_frdt;
	}

	public void setPubc_todt(String pubc_todt){
		this.pubc_todt = pubc_todt;
	}

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
	}

	public void setPubc_amt(String pubc_amt){
		this.pubc_amt = pubc_amt;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setUnrcp_amt(String unrcp_amt){
		this.unrcp_amt = unrcp_amt;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setSlcrg_pers_nm(String slcrg_pers_nm){
		this.slcrg_pers_nm = slcrg_pers_nm;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setMchrg_pers_nm(String mchrg_pers_nm){
		this.mchrg_pers_nm = mchrg_pers_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setEps_clsf(String eps_clsf){
		this.eps_clsf = eps_clsf;
	}

	public void setZip_no(String zip_no){
		this.zip_no = zip_no;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtls_addr(String dtls_addr){
		this.dtls_addr = dtls_addr;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setOccr_caus_busn(String occr_caus_busn){
		this.occr_caus_busn = occr_caus_busn;
	}

	public void setOccr_caus_mang(String occr_caus_mang){
		this.occr_caus_mang = occr_caus_mang;
	}

	public void setAct_matt_busn(String act_matt_busn){
		this.act_matt_busn = act_matt_busn;
	}

	public void setAct_matt_mang(String act_matt_mang){
		this.act_matt_mang = act_matt_mang;
	}

	public void setProc_plan_busn(String proc_plan_busn){
		this.proc_plan_busn = proc_plan_busn;
	}

	public void setProc_plan_mang(String proc_plan_mang){
		this.proc_plan_mang = proc_plan_mang;
	}

	public void setEnty_clsf(String enty_clsf){
		this.enty_clsf = enty_clsf;
	}

	public void setDhon_medi_nm(String dhon_medi_nm){
		this.dhon_medi_nm = dhon_medi_nm;
	}

	public void setDhon_dlco_nm(String dhon_dlco_nm){
		this.dhon_dlco_nm = dhon_dlco_nm;
	}

	public void setNote_no(String note_no){
		this.note_no = note_no;
	}

	public void setMin_dhon_occr_dt(String min_dhon_occr_dt){
		this.min_dhon_occr_dt = min_dhon_occr_dt;
	}

	public void setMax_dhon_occr_dt(String max_dhon_occr_dt){
		this.max_dhon_occr_dt = max_dhon_occr_dt;
	}

	public void setDhon_amt(String dhon_amt){
		this.dhon_amt = dhon_amt;
	}

	public void setDhon_rcpm_amt(String dhon_rcpm_amt){
		this.dhon_rcpm_amt = dhon_rcpm_amt;
	}

	public void setDhon_bal(String dhon_bal){
		this.dhon_bal = dhon_bal;
	}

	public void setIssu_pers_nm(String issu_pers_nm){
		this.issu_pers_nm = issu_pers_nm;
	}

	public void setDhon_slcrg_pers(String dhon_slcrg_pers){
		this.dhon_slcrg_pers = dhon_slcrg_pers;
	}

	public void setDhon_slcrg_pers_nm(String dhon_slcrg_pers_nm){
		this.dhon_slcrg_pers_nm = dhon_slcrg_pers_nm;
	}

	public void setDhon_mchrg_pers(String dhon_mchrg_pers){
		this.dhon_mchrg_pers = dhon_mchrg_pers;
	}

	public void setDhon_mchrg_pers_nm(String dhon_mchrg_pers_nm){
		this.dhon_mchrg_pers_nm = dhon_mchrg_pers_nm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getRept_no(){
		return this.rept_no;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getPubc_frdt(){
		return this.pubc_frdt;
	}

	public String getPubc_todt(){
		return this.pubc_todt;
	}

	public String getAdvt_cont(){
		return this.advt_cont;
	}

	public String getPubc_amt(){
		return this.pubc_amt;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getUnrcp_amt(){
		return this.unrcp_amt;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getSlcrg_pers_nm(){
		return this.slcrg_pers_nm;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getMchrg_pers_nm(){
		return this.mchrg_pers_nm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getEps_clsf(){
		return this.eps_clsf;
	}

	public String getZip_no(){
		return this.zip_no;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtls_addr(){
		return this.dtls_addr;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getOccr_caus_busn(){
		return this.occr_caus_busn;
	}

	public String getOccr_caus_mang(){
		return this.occr_caus_mang;
	}

	public String getAct_matt_busn(){
		return this.act_matt_busn;
	}

	public String getAct_matt_mang(){
		return this.act_matt_mang;
	}

	public String getProc_plan_busn(){
		return this.proc_plan_busn;
	}

	public String getProc_plan_mang(){
		return this.proc_plan_mang;
	}

	public String getEnty_clsf(){
		return this.enty_clsf;
	}

	public String getDhon_medi_nm(){
		return this.dhon_medi_nm;
	}

	public String getDhon_dlco_nm(){
		return this.dhon_dlco_nm;
	}

	public String getNote_no(){
		return this.note_no;
	}

	public String getMin_dhon_occr_dt(){
		return this.min_dhon_occr_dt;
	}

	public String getMax_dhon_occr_dt(){
		return this.max_dhon_occr_dt;
	}

	public String getDhon_amt(){
		return this.dhon_amt;
	}

	public String getDhon_rcpm_amt(){
		return this.dhon_rcpm_amt;
	}

	public String getDhon_bal(){
		return this.dhon_bal;
	}

	public String getIssu_pers_nm(){
		return this.issu_pers_nm;
	}

	public String getDhon_slcrg_pers(){
		return this.dhon_slcrg_pers;
	}

	public String getDhon_slcrg_pers_nm(){
		return this.dhon_slcrg_pers_nm;
	}

	public String getDhon_mchrg_pers(){
		return this.dhon_mchrg_pers;
	}

	public String getDhon_mchrg_pers_nm(){
		return this.dhon_mchrg_pers_nm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.rept_no = Util.checkString(cstmt.getString(4));
		this.medi_nm = Util.checkString(cstmt.getString(5));
		this.dlco_no = Util.checkString(cstmt.getString(6));
		this.dlco_nm = Util.checkString(cstmt.getString(7));
		this.pubc_frdt = Util.checkString(cstmt.getString(8));
		this.pubc_todt = Util.checkString(cstmt.getString(9));
		this.advt_cont = Util.checkString(cstmt.getString(10));
		this.pubc_amt = Util.checkString(cstmt.getString(11));
		this.rcpm_amt = Util.checkString(cstmt.getString(12));
		this.unrcp_amt = Util.checkString(cstmt.getString(13));
		this.slcrg_pers = Util.checkString(cstmt.getString(14));
		this.slcrg_pers_nm = Util.checkString(cstmt.getString(15));
		this.mchrg_pers = Util.checkString(cstmt.getString(16));
		this.mchrg_pers_nm = Util.checkString(cstmt.getString(17));
		this.ern = Util.checkString(cstmt.getString(18));
		this.presi_nm = Util.checkString(cstmt.getString(19));
		this.tel_no = Util.checkString(cstmt.getString(20));
		this.eps_clsf = Util.checkString(cstmt.getString(21));
		this.zip_no = Util.checkString(cstmt.getString(22));
		this.addr = Util.checkString(cstmt.getString(23));
		this.dtls_addr = Util.checkString(cstmt.getString(24));
		this.remk = Util.checkString(cstmt.getString(25));
		this.occr_caus_busn = Util.checkString(cstmt.getString(26));
		this.occr_caus_mang = Util.checkString(cstmt.getString(27));
		this.act_matt_busn = Util.checkString(cstmt.getString(28));
		this.act_matt_mang = Util.checkString(cstmt.getString(29));
		this.proc_plan_busn = Util.checkString(cstmt.getString(30));
		this.proc_plan_mang = Util.checkString(cstmt.getString(31));
		this.enty_clsf = Util.checkString(cstmt.getString(32));
		this.dhon_medi_nm = Util.checkString(cstmt.getString(33));
		this.dhon_dlco_nm = Util.checkString(cstmt.getString(34));
		this.note_no = Util.checkString(cstmt.getString(35));
		this.min_dhon_occr_dt = Util.checkString(cstmt.getString(36));
		this.max_dhon_occr_dt = Util.checkString(cstmt.getString(37));
		this.dhon_amt = Util.checkString(cstmt.getString(38));
		this.dhon_rcpm_amt = Util.checkString(cstmt.getString(39));
		this.dhon_bal = Util.checkString(cstmt.getString(40));
		this.issu_pers_nm = Util.checkString(cstmt.getString(41));
		this.dhon_slcrg_pers = Util.checkString(cstmt.getString(42));
		this.dhon_slcrg_pers_nm = Util.checkString(cstmt.getString(43));
		this.dhon_mchrg_pers = Util.checkString(cstmt.getString(44));
		this.dhon_mchrg_pers_nm = Util.checkString(cstmt.getString(45));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_DEP_3610_SDataSet ds = (AD_DEP_3610_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRept_no()%>
<%= ds.getMedi_nm()%>
<%= ds.getDlco_no()%>
<%= ds.getDlco_nm()%>
<%= ds.getPubc_frdt()%>
<%= ds.getPubc_todt()%>
<%= ds.getAdvt_cont()%>
<%= ds.getPubc_amt()%>
<%= ds.getRcpm_amt()%>
<%= ds.getUnrcp_amt()%>
<%= ds.getSlcrg_pers()%>
<%= ds.getSlcrg_pers_nm()%>
<%= ds.getMchrg_pers()%>
<%= ds.getMchrg_pers_nm()%>
<%= ds.getErn()%>
<%= ds.getPresi_nm()%>
<%= ds.getTel_no()%>
<%= ds.getEps_clsf()%>
<%= ds.getZip_no()%>
<%= ds.getAddr()%>
<%= ds.getDtls_addr()%>
<%= ds.getRemk()%>
<%= ds.getOccr_caus_busn()%>
<%= ds.getOccr_caus_mang()%>
<%= ds.getAct_matt_busn()%>
<%= ds.getAct_matt_mang()%>
<%= ds.getProc_plan_busn()%>
<%= ds.getProc_plan_mang()%>
<%= ds.getEnty_clsf()%>
<%= ds.getDhon_medi_nm()%>
<%= ds.getDhon_dlco_nm()%>
<%= ds.getNote_no()%>
<%= ds.getMin_dhon_occr_dt()%>
<%= ds.getMax_dhon_occr_dt()%>
<%= ds.getDhon_amt()%>
<%= ds.getDhon_rcpm_amt()%>
<%= ds.getDhon_bal()%>
<%= ds.getIssu_pers_nm()%>
<%= ds.getDhon_slcrg_pers()%>
<%= ds.getDhon_slcrg_pers_nm()%>
<%= ds.getDhon_mchrg_pers()%>
<%= ds.getDhon_mchrg_pers_nm()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 27 21:40:12 KST 2009 */