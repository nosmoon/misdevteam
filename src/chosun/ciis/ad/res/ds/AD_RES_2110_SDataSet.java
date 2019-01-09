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


package chosun.ciis.ad.res.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.res.dm.*;
import chosun.ciis.ad.res.rec.*;

/**
 * 
 */


public class AD_RES_2110_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String medi_cd;
	public String preng_occr_dt;
	public String preng_occr_seq;
	public String dlco_no;
	public String dlco_nm;
	public String pubc_side;
	public String issu_ser_no;
	public String publ_std;
	public String advt_fee;
	public String vat;
	public String pubc_tot_amt;
	public String rtax_yn;
	public String govern_advt_yn;
	public String advcs_offr_yn;
	public String hndl_clsf;
	public String agn;
	public String agn_nm;
	public String fee_rate;
	public String fee;
	public String hndl_plac_cd;
	public String hndl_plac_nm;
	public String coms_rate;
	public String coms;
	public String indt_clsf;
	public String indt_clsf_nm;
	public String chro_clsf;
	public String mony_kind;
	public String type_clsf;
	public String type_clsf_nm;
	public String exrate;
	public String book_appndx_clsf;
	public String nwsp_type_clsf;
	public String frex_cntr_amt;
	public String slcrg_pers;
	public String slcrg_pers_nm;
	public String dept_cd;
	public String dept_nm;
	public String mchrg_pers;
	public String mchrg_pers_nm;
	public String advt_cont;
	public String remk;
	public String chrg_aprv_pers;
	public String chrg_aprv_dt;
	public String team_chf_aprv_pers;
	public String team_chf_aprv_dt;
	public String pubc_slip_no;
	public String preng_clos_yn;
	public String preng_dt;
	public String incmg_pers;
	public String incmg_pers_nm;
	public String tax_email;
	public String tax_clsf;
	public String advt_clsf;
	public String patr_chrg_info;

	public AD_RES_2110_SDataSet(){}
	public AD_RES_2110_SDataSet(String errcode, String errmsg, String medi_cd, String preng_occr_dt, String preng_occr_seq, String dlco_no, String dlco_nm, String pubc_side, String issu_ser_no, String publ_std, String advt_fee, String vat, String pubc_tot_amt, String rtax_yn, String govern_advt_yn, String advcs_offr_yn, String hndl_clsf, String agn, String agn_nm, String fee_rate, String fee, String hndl_plac_cd, String hndl_plac_nm, String coms_rate, String coms, String indt_clsf, String indt_clsf_nm, String chro_clsf, String mony_kind, String type_clsf, String type_clsf_nm, String exrate, String book_appndx_clsf, String nwsp_type_clsf, String frex_cntr_amt, String slcrg_pers, String slcrg_pers_nm, String dept_cd, String dept_nm, String mchrg_pers, String mchrg_pers_nm, String advt_cont, String remk, String chrg_aprv_pers, String chrg_aprv_dt, String team_chf_aprv_pers, String team_chf_aprv_dt, String pubc_slip_no, String preng_clos_yn, String preng_dt, String incmg_pers, String incmg_pers_nm, String tax_email, String tax_clsf, String advt_clsf, String patr_chrg_info){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.medi_cd = medi_cd;
		this.preng_occr_dt = preng_occr_dt;
		this.preng_occr_seq = preng_occr_seq;
		this.dlco_no = dlco_no;
		this.dlco_nm = dlco_nm;
		this.pubc_side = pubc_side;
		this.issu_ser_no = issu_ser_no;
		this.publ_std = publ_std;
		this.advt_fee = advt_fee;
		this.vat = vat;
		this.pubc_tot_amt = pubc_tot_amt;
		this.rtax_yn = rtax_yn;
		this.govern_advt_yn = govern_advt_yn;
		this.advcs_offr_yn = advcs_offr_yn;
		this.hndl_clsf = hndl_clsf;
		this.agn = agn;
		this.agn_nm = agn_nm;
		this.fee_rate = fee_rate;
		this.fee = fee;
		this.hndl_plac_cd = hndl_plac_cd;
		this.hndl_plac_nm = hndl_plac_nm;
		this.coms_rate = coms_rate;
		this.coms = coms;
		this.indt_clsf = indt_clsf;
		this.indt_clsf_nm = indt_clsf_nm;
		this.chro_clsf = chro_clsf;
		this.mony_kind = mony_kind;
		this.type_clsf = type_clsf;
		this.type_clsf_nm = type_clsf_nm;
		this.exrate = exrate;
		this.book_appndx_clsf = book_appndx_clsf;
		this.nwsp_type_clsf = nwsp_type_clsf;
		this.frex_cntr_amt = frex_cntr_amt;
		this.slcrg_pers = slcrg_pers;
		this.slcrg_pers_nm = slcrg_pers_nm;
		this.dept_cd = dept_cd;
		this.dept_nm = dept_nm;
		this.mchrg_pers = mchrg_pers;
		this.mchrg_pers_nm = mchrg_pers_nm;
		this.advt_cont = advt_cont;
		this.remk = remk;
		this.chrg_aprv_pers = chrg_aprv_pers;
		this.chrg_aprv_dt = chrg_aprv_dt;
		this.team_chf_aprv_pers = team_chf_aprv_pers;
		this.team_chf_aprv_dt = team_chf_aprv_dt;
		this.pubc_slip_no = pubc_slip_no;
		this.preng_clos_yn = preng_clos_yn;
		this.preng_dt = preng_dt;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_nm = incmg_pers_nm;
		this.tax_email = tax_email;
		this.tax_clsf = tax_clsf;
		this.advt_clsf = advt_clsf;
		this.patr_chrg_info = patr_chrg_info;
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

	public void setPreng_occr_dt(String preng_occr_dt){
		this.preng_occr_dt = preng_occr_dt;
	}

	public void setPreng_occr_seq(String preng_occr_seq){
		this.preng_occr_seq = preng_occr_seq;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setPubc_side(String pubc_side){
		this.pubc_side = pubc_side;
	}

	public void setIssu_ser_no(String issu_ser_no){
		this.issu_ser_no = issu_ser_no;
	}

	public void setPubl_std(String publ_std){
		this.publ_std = publ_std;
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

	public void setRtax_yn(String rtax_yn){
		this.rtax_yn = rtax_yn;
	}

	public void setGovern_advt_yn(String govern_advt_yn){
		this.govern_advt_yn = govern_advt_yn;
	}

	public void setAdvcs_offr_yn(String advcs_offr_yn){
		this.advcs_offr_yn = advcs_offr_yn;
	}

	public void setHndl_clsf(String hndl_clsf){
		this.hndl_clsf = hndl_clsf;
	}

	public void setAgn(String agn){
		this.agn = agn;
	}

	public void setAgn_nm(String agn_nm){
		this.agn_nm = agn_nm;
	}

	public void setFee_rate(String fee_rate){
		this.fee_rate = fee_rate;
	}

	public void setFee(String fee){
		this.fee = fee;
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

	public void setIndt_clsf(String indt_clsf){
		this.indt_clsf = indt_clsf;
	}

	public void setIndt_clsf_nm(String indt_clsf_nm){
		this.indt_clsf_nm = indt_clsf_nm;
	}

	public void setChro_clsf(String chro_clsf){
		this.chro_clsf = chro_clsf;
	}

	public void setMony_kind(String mony_kind){
		this.mony_kind = mony_kind;
	}

	public void setType_clsf(String type_clsf){
		this.type_clsf = type_clsf;
	}

	public void setType_clsf_nm(String type_clsf_nm){
		this.type_clsf_nm = type_clsf_nm;
	}

	public void setExrate(String exrate){
		this.exrate = exrate;
	}

	public void setBook_appndx_clsf(String book_appndx_clsf){
		this.book_appndx_clsf = book_appndx_clsf;
	}

	public void setNwsp_type_clsf(String nwsp_type_clsf){
		this.nwsp_type_clsf = nwsp_type_clsf;
	}

	public void setFrex_cntr_amt(String frex_cntr_amt){
		this.frex_cntr_amt = frex_cntr_amt;
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

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setChrg_aprv_pers(String chrg_aprv_pers){
		this.chrg_aprv_pers = chrg_aprv_pers;
	}

	public void setChrg_aprv_dt(String chrg_aprv_dt){
		this.chrg_aprv_dt = chrg_aprv_dt;
	}

	public void setTeam_chf_aprv_pers(String team_chf_aprv_pers){
		this.team_chf_aprv_pers = team_chf_aprv_pers;
	}

	public void setTeam_chf_aprv_dt(String team_chf_aprv_dt){
		this.team_chf_aprv_dt = team_chf_aprv_dt;
	}

	public void setPubc_slip_no(String pubc_slip_no){
		this.pubc_slip_no = pubc_slip_no;
	}

	public void setPreng_clos_yn(String preng_clos_yn){
		this.preng_clos_yn = preng_clos_yn;
	}

	public void setPreng_dt(String preng_dt){
		this.preng_dt = preng_dt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_nm(String incmg_pers_nm){
		this.incmg_pers_nm = incmg_pers_nm;
	}

	public void setTax_email(String tax_email){
		this.tax_email = tax_email;
	}

	public void setTax_clsf(String tax_clsf){
		this.tax_clsf = tax_clsf;
	}

	public void setAdvt_clsf(String advt_clsf){
		this.advt_clsf = advt_clsf;
	}

	public void setPatr_chrg_info(String patr_chrg_info){
		this.patr_chrg_info = patr_chrg_info;
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

	public String getPreng_occr_dt(){
		return this.preng_occr_dt;
	}

	public String getPreng_occr_seq(){
		return this.preng_occr_seq;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getPubc_side(){
		return this.pubc_side;
	}

	public String getIssu_ser_no(){
		return this.issu_ser_no;
	}

	public String getPubl_std(){
		return this.publ_std;
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

	public String getRtax_yn(){
		return this.rtax_yn;
	}

	public String getGovern_advt_yn(){
		return this.govern_advt_yn;
	}

	public String getAdvcs_offr_yn(){
		return this.advcs_offr_yn;
	}

	public String getHndl_clsf(){
		return this.hndl_clsf;
	}

	public String getAgn(){
		return this.agn;
	}

	public String getAgn_nm(){
		return this.agn_nm;
	}

	public String getFee_rate(){
		return this.fee_rate;
	}

	public String getFee(){
		return this.fee;
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

	public String getIndt_clsf(){
		return this.indt_clsf;
	}

	public String getIndt_clsf_nm(){
		return this.indt_clsf_nm;
	}

	public String getChro_clsf(){
		return this.chro_clsf;
	}

	public String getMony_kind(){
		return this.mony_kind;
	}

	public String getType_clsf(){
		return this.type_clsf;
	}

	public String getType_clsf_nm(){
		return this.type_clsf_nm;
	}

	public String getExrate(){
		return this.exrate;
	}

	public String getBook_appndx_clsf(){
		return this.book_appndx_clsf;
	}

	public String getNwsp_type_clsf(){
		return this.nwsp_type_clsf;
	}

	public String getFrex_cntr_amt(){
		return this.frex_cntr_amt;
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

	public String getAdvt_cont(){
		return this.advt_cont;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getChrg_aprv_pers(){
		return this.chrg_aprv_pers;
	}

	public String getChrg_aprv_dt(){
		return this.chrg_aprv_dt;
	}

	public String getTeam_chf_aprv_pers(){
		return this.team_chf_aprv_pers;
	}

	public String getTeam_chf_aprv_dt(){
		return this.team_chf_aprv_dt;
	}

	public String getPubc_slip_no(){
		return this.pubc_slip_no;
	}

	public String getPreng_clos_yn(){
		return this.preng_clos_yn;
	}

	public String getPreng_dt(){
		return this.preng_dt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_nm(){
		return this.incmg_pers_nm;
	}

	public String getTax_email(){
		return this.tax_email;
	}

	public String getTax_clsf(){
		return this.tax_clsf;
	}

	public String getAdvt_clsf(){
		return this.advt_clsf;
	}

	public String getPatr_chrg_info(){
		return this.patr_chrg_info;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.medi_cd = Util.checkString(cstmt.getString(7));
		this.preng_occr_dt = Util.checkString(cstmt.getString(8));
		this.preng_occr_seq = Util.checkString(cstmt.getString(9));
		this.dlco_no = Util.checkString(cstmt.getString(10));
		this.dlco_nm = Util.checkString(cstmt.getString(11));
		this.pubc_side = Util.checkString(cstmt.getString(12));
		this.issu_ser_no = Util.checkString(cstmt.getString(13));
		this.publ_std = Util.checkString(cstmt.getString(14));
		this.advt_fee = Util.checkString(cstmt.getString(15));
		this.vat = Util.checkString(cstmt.getString(16));
		this.pubc_tot_amt = Util.checkString(cstmt.getString(17));
		this.rtax_yn = Util.checkString(cstmt.getString(18));
		this.govern_advt_yn = Util.checkString(cstmt.getString(19));
		this.advcs_offr_yn = Util.checkString(cstmt.getString(20));
		this.hndl_clsf = Util.checkString(cstmt.getString(21));
		this.agn = Util.checkString(cstmt.getString(22));
		this.agn_nm = Util.checkString(cstmt.getString(23));
		this.fee_rate = Util.checkString(cstmt.getString(24));
		this.fee = Util.checkString(cstmt.getString(25));
		this.hndl_plac_cd = Util.checkString(cstmt.getString(26));
		this.hndl_plac_nm = Util.checkString(cstmt.getString(27));
		this.coms_rate = Util.checkString(cstmt.getString(28));
		this.coms = Util.checkString(cstmt.getString(29));
		this.indt_clsf = Util.checkString(cstmt.getString(30));
		this.indt_clsf_nm = Util.checkString(cstmt.getString(31));
		this.chro_clsf = Util.checkString(cstmt.getString(32));
		this.mony_kind = Util.checkString(cstmt.getString(33));
		this.type_clsf = Util.checkString(cstmt.getString(34));
		this.type_clsf_nm = Util.checkString(cstmt.getString(35));
		this.exrate = Util.checkString(cstmt.getString(36));
		this.book_appndx_clsf = Util.checkString(cstmt.getString(37));
		this.nwsp_type_clsf = Util.checkString(cstmt.getString(38));
		this.frex_cntr_amt = Util.checkString(cstmt.getString(39));
		this.slcrg_pers = Util.checkString(cstmt.getString(40));
		this.slcrg_pers_nm = Util.checkString(cstmt.getString(41));
		this.dept_cd = Util.checkString(cstmt.getString(42));
		this.dept_nm = Util.checkString(cstmt.getString(43));
		this.mchrg_pers = Util.checkString(cstmt.getString(44));
		this.mchrg_pers_nm = Util.checkString(cstmt.getString(45));
		this.advt_cont = Util.checkString(cstmt.getString(46));
		this.remk = Util.checkString(cstmt.getString(47));
		this.chrg_aprv_pers = Util.checkString(cstmt.getString(48));
		this.chrg_aprv_dt = Util.checkString(cstmt.getString(49));
		this.team_chf_aprv_pers = Util.checkString(cstmt.getString(50));
		this.team_chf_aprv_dt = Util.checkString(cstmt.getString(51));
		this.pubc_slip_no = Util.checkString(cstmt.getString(52));
		this.preng_clos_yn = Util.checkString(cstmt.getString(53));
		this.preng_dt = Util.checkString(cstmt.getString(54));
		this.incmg_pers = Util.checkString(cstmt.getString(55));
		this.incmg_pers_nm = Util.checkString(cstmt.getString(56));
		this.tax_email = Util.checkString(cstmt.getString(57));
		this.tax_clsf = Util.checkString(cstmt.getString(58));
		this.advt_clsf = Util.checkString(cstmt.getString(59));
		this.patr_chrg_info = Util.checkString(cstmt.getString(60));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_RES_2110_SDataSet ds = (AD_RES_2110_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedi_cd()%>
<%= ds.getPreng_occr_dt()%>
<%= ds.getPreng_occr_seq()%>
<%= ds.getDlco_no()%>
<%= ds.getDlco_nm()%>
<%= ds.getPubc_side()%>
<%= ds.getIssu_ser_no()%>
<%= ds.getPubl_std()%>
<%= ds.getAdvt_fee()%>
<%= ds.getVat()%>
<%= ds.getPubc_tot_amt()%>
<%= ds.getRtax_yn()%>
<%= ds.getGovern_advt_yn()%>
<%= ds.getAdvcs_offr_yn()%>
<%= ds.getHndl_clsf()%>
<%= ds.getAgn()%>
<%= ds.getAgn_nm()%>
<%= ds.getFee_rate()%>
<%= ds.getFee()%>
<%= ds.getHndl_plac_cd()%>
<%= ds.getHndl_plac_nm()%>
<%= ds.getComs_rate()%>
<%= ds.getComs()%>
<%= ds.getIndt_clsf()%>
<%= ds.getIndt_clsf_nm()%>
<%= ds.getChro_clsf()%>
<%= ds.getMony_kind()%>
<%= ds.getType_clsf()%>
<%= ds.getType_clsf_nm()%>
<%= ds.getExrate()%>
<%= ds.getBook_appndx_clsf()%>
<%= ds.getNwsp_type_clsf()%>
<%= ds.getFrex_cntr_amt()%>
<%= ds.getSlcrg_pers()%>
<%= ds.getSlcrg_pers_nm()%>
<%= ds.getDept_cd()%>
<%= ds.getDept_nm()%>
<%= ds.getMchrg_pers()%>
<%= ds.getMchrg_pers_nm()%>
<%= ds.getAdvt_cont()%>
<%= ds.getRemk()%>
<%= ds.getChrg_aprv_pers()%>
<%= ds.getChrg_aprv_dt()%>
<%= ds.getTeam_chf_aprv_pers()%>
<%= ds.getTeam_chf_aprv_dt()%>
<%= ds.getPubc_slip_no()%>
<%= ds.getPreng_clos_yn()%>
<%= ds.getPreng_dt()%>
<%= ds.getIncmg_pers()%>
<%= ds.getIncmg_pers_nm()%>
<%= ds.getTax_email()%>
<%= ds.getTax_clsf()%>
<%= ds.getAdvt_clsf()%>
<%= ds.getPatr_chrg_info()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 01 14:12:46 KST 2014 */