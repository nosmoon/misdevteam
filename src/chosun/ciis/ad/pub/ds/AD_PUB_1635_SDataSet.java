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

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_1635_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String medi_cd;
	public String pubc_occr_seq;
	public String pubc_occr_dt;
	public String proc_dt;
	public String proc_seq;
	public String hndl_clsf;
	public String dlco_no;
	public String dlco_nm;
	public String advt_cont;
	public String pubc_side;
	public String issu_ser_no;
	public String publ_std;
	public String advt_fee;
	public String vat;
	public String pubc_tot_amt;
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
	public String mony_kind;
	public String chro_clsf;
	public String type_clsf;
	public String type_clsf_nm;
	public String exrate;
	public String book_appndx_clsf;
	public String frex_cntr_amt;
	public String nwsp_type_clsf;
	public String slcrg_pers;
	public String slcrg_pers_nm;
	public String dept_cd;
	public String dept_nm;
	public String mchrg_pers;
	public String mchrg_pers_nm;
	public String rtax_yn;
	public String upd_resn;
	public String govern_advt_yn;
	public String upd_cont;
	public String advcs_offr_yn;
	public String remk;
	public String pubc_dt;
	public String pre_pubc_slip_no;
	public String pre_pubc_slip_no_crte_dt;
	public String upd_yn;
	public String div_yn;
	public String clos_stat;
	public String clamt_stat;
	public String sale_stmt_issu_yn;
	public String purc_stmt_issu_yn;
	public String elec_tax_stmt_yn;
	public String tax_email;
	public String tax_clsf;
	public String advt_clsf;
	public String patr_chrg_info;

	public AD_PUB_1635_SDataSet(){}
	public AD_PUB_1635_SDataSet(String errcode, String errmsg, String medi_cd, String pubc_occr_seq, String pubc_occr_dt, String proc_dt, String proc_seq, String hndl_clsf, String dlco_no, String dlco_nm, String advt_cont, String pubc_side, String issu_ser_no, String publ_std, String advt_fee, String vat, String pubc_tot_amt, String agn, String agn_nm, String fee_rate, String fee, String hndl_plac_cd, String hndl_plac_nm, String coms_rate, String coms, String indt_clsf, String indt_clsf_nm, String mony_kind, String chro_clsf, String type_clsf, String type_clsf_nm, String exrate, String book_appndx_clsf, String frex_cntr_amt, String nwsp_type_clsf, String slcrg_pers, String slcrg_pers_nm, String dept_cd, String dept_nm, String mchrg_pers, String mchrg_pers_nm, String rtax_yn, String upd_resn, String govern_advt_yn, String upd_cont, String advcs_offr_yn, String remk, String pubc_dt, String pre_pubc_slip_no, String pre_pubc_slip_no_crte_dt, String upd_yn, String div_yn, String clos_stat, String clamt_stat, String sale_stmt_issu_yn, String purc_stmt_issu_yn, String elec_tax_stmt_yn, String tax_email, String tax_clsf, String advt_clsf, String patr_chrg_info){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.medi_cd = medi_cd;
		this.pubc_occr_seq = pubc_occr_seq;
		this.pubc_occr_dt = pubc_occr_dt;
		this.proc_dt = proc_dt;
		this.proc_seq = proc_seq;
		this.hndl_clsf = hndl_clsf;
		this.dlco_no = dlco_no;
		this.dlco_nm = dlco_nm;
		this.advt_cont = advt_cont;
		this.pubc_side = pubc_side;
		this.issu_ser_no = issu_ser_no;
		this.publ_std = publ_std;
		this.advt_fee = advt_fee;
		this.vat = vat;
		this.pubc_tot_amt = pubc_tot_amt;
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
		this.mony_kind = mony_kind;
		this.chro_clsf = chro_clsf;
		this.type_clsf = type_clsf;
		this.type_clsf_nm = type_clsf_nm;
		this.exrate = exrate;
		this.book_appndx_clsf = book_appndx_clsf;
		this.frex_cntr_amt = frex_cntr_amt;
		this.nwsp_type_clsf = nwsp_type_clsf;
		this.slcrg_pers = slcrg_pers;
		this.slcrg_pers_nm = slcrg_pers_nm;
		this.dept_cd = dept_cd;
		this.dept_nm = dept_nm;
		this.mchrg_pers = mchrg_pers;
		this.mchrg_pers_nm = mchrg_pers_nm;
		this.rtax_yn = rtax_yn;
		this.upd_resn = upd_resn;
		this.govern_advt_yn = govern_advt_yn;
		this.upd_cont = upd_cont;
		this.advcs_offr_yn = advcs_offr_yn;
		this.remk = remk;
		this.pubc_dt = pubc_dt;
		this.pre_pubc_slip_no = pre_pubc_slip_no;
		this.pre_pubc_slip_no_crte_dt = pre_pubc_slip_no_crte_dt;
		this.upd_yn = upd_yn;
		this.div_yn = div_yn;
		this.clos_stat = clos_stat;
		this.clamt_stat = clamt_stat;
		this.sale_stmt_issu_yn = sale_stmt_issu_yn;
		this.purc_stmt_issu_yn = purc_stmt_issu_yn;
		this.elec_tax_stmt_yn = elec_tax_stmt_yn;
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

	public void setPubc_occr_seq(String pubc_occr_seq){
		this.pubc_occr_seq = pubc_occr_seq;
	}

	public void setPubc_occr_dt(String pubc_occr_dt){
		this.pubc_occr_dt = pubc_occr_dt;
	}

	public void setProc_dt(String proc_dt){
		this.proc_dt = proc_dt;
	}

	public void setProc_seq(String proc_seq){
		this.proc_seq = proc_seq;
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

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
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

	public void setMony_kind(String mony_kind){
		this.mony_kind = mony_kind;
	}

	public void setChro_clsf(String chro_clsf){
		this.chro_clsf = chro_clsf;
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

	public void setFrex_cntr_amt(String frex_cntr_amt){
		this.frex_cntr_amt = frex_cntr_amt;
	}

	public void setNwsp_type_clsf(String nwsp_type_clsf){
		this.nwsp_type_clsf = nwsp_type_clsf;
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

	public void setRtax_yn(String rtax_yn){
		this.rtax_yn = rtax_yn;
	}

	public void setUpd_resn(String upd_resn){
		this.upd_resn = upd_resn;
	}

	public void setGovern_advt_yn(String govern_advt_yn){
		this.govern_advt_yn = govern_advt_yn;
	}

	public void setUpd_cont(String upd_cont){
		this.upd_cont = upd_cont;
	}

	public void setAdvcs_offr_yn(String advcs_offr_yn){
		this.advcs_offr_yn = advcs_offr_yn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setPre_pubc_slip_no(String pre_pubc_slip_no){
		this.pre_pubc_slip_no = pre_pubc_slip_no;
	}

	public void setPre_pubc_slip_no_crte_dt(String pre_pubc_slip_no_crte_dt){
		this.pre_pubc_slip_no_crte_dt = pre_pubc_slip_no_crte_dt;
	}

	public void setUpd_yn(String upd_yn){
		this.upd_yn = upd_yn;
	}

	public void setDiv_yn(String div_yn){
		this.div_yn = div_yn;
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

	public void setElec_tax_stmt_yn(String elec_tax_stmt_yn){
		this.elec_tax_stmt_yn = elec_tax_stmt_yn;
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

	public String getPubc_occr_seq(){
		return this.pubc_occr_seq;
	}

	public String getPubc_occr_dt(){
		return this.pubc_occr_dt;
	}

	public String getProc_dt(){
		return this.proc_dt;
	}

	public String getProc_seq(){
		return this.proc_seq;
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

	public String getAdvt_cont(){
		return this.advt_cont;
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

	public String getMony_kind(){
		return this.mony_kind;
	}

	public String getChro_clsf(){
		return this.chro_clsf;
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

	public String getFrex_cntr_amt(){
		return this.frex_cntr_amt;
	}

	public String getNwsp_type_clsf(){
		return this.nwsp_type_clsf;
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

	public String getRtax_yn(){
		return this.rtax_yn;
	}

	public String getUpd_resn(){
		return this.upd_resn;
	}

	public String getGovern_advt_yn(){
		return this.govern_advt_yn;
	}

	public String getUpd_cont(){
		return this.upd_cont;
	}

	public String getAdvcs_offr_yn(){
		return this.advcs_offr_yn;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getPre_pubc_slip_no(){
		return this.pre_pubc_slip_no;
	}

	public String getPre_pubc_slip_no_crte_dt(){
		return this.pre_pubc_slip_no_crte_dt;
	}

	public String getUpd_yn(){
		return this.upd_yn;
	}

	public String getDiv_yn(){
		return this.div_yn;
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

	public String getElec_tax_stmt_yn(){
		return this.elec_tax_stmt_yn;
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

		this.medi_cd = Util.checkString(cstmt.getString(4));
		this.pubc_occr_seq = Util.checkString(cstmt.getString(5));
		this.pubc_occr_dt = Util.checkString(cstmt.getString(6));
		this.proc_dt = Util.checkString(cstmt.getString(7));
		this.proc_seq = Util.checkString(cstmt.getString(8));
		this.hndl_clsf = Util.checkString(cstmt.getString(9));
		this.dlco_no = Util.checkString(cstmt.getString(10));
		this.dlco_nm = Util.checkString(cstmt.getString(11));
		this.advt_cont = Util.checkString(cstmt.getString(12));
		this.pubc_side = Util.checkString(cstmt.getString(13));
		this.issu_ser_no = Util.checkString(cstmt.getString(14));
		this.publ_std = Util.checkString(cstmt.getString(15));
		this.advt_fee = Util.checkString(cstmt.getString(16));
		this.vat = Util.checkString(cstmt.getString(17));
		this.pubc_tot_amt = Util.checkString(cstmt.getString(18));
		this.agn = Util.checkString(cstmt.getString(19));
		this.agn_nm = Util.checkString(cstmt.getString(20));
		this.fee_rate = Util.checkString(cstmt.getString(21));
		this.fee = Util.checkString(cstmt.getString(22));
		this.hndl_plac_cd = Util.checkString(cstmt.getString(23));
		this.hndl_plac_nm = Util.checkString(cstmt.getString(24));
		this.coms_rate = Util.checkString(cstmt.getString(25));
		this.coms = Util.checkString(cstmt.getString(26));
		this.indt_clsf = Util.checkString(cstmt.getString(27));
		this.indt_clsf_nm = Util.checkString(cstmt.getString(28));
		this.mony_kind = Util.checkString(cstmt.getString(29));
		this.chro_clsf = Util.checkString(cstmt.getString(30));
		this.type_clsf = Util.checkString(cstmt.getString(31));
		this.type_clsf_nm = Util.checkString(cstmt.getString(32));
		this.exrate = Util.checkString(cstmt.getString(33));
		this.book_appndx_clsf = Util.checkString(cstmt.getString(34));
		this.frex_cntr_amt = Util.checkString(cstmt.getString(35));
		this.nwsp_type_clsf = Util.checkString(cstmt.getString(36));
		this.slcrg_pers = Util.checkString(cstmt.getString(37));
		this.slcrg_pers_nm = Util.checkString(cstmt.getString(38));
		this.dept_cd = Util.checkString(cstmt.getString(39));
		this.dept_nm = Util.checkString(cstmt.getString(40));
		this.mchrg_pers = Util.checkString(cstmt.getString(41));
		this.mchrg_pers_nm = Util.checkString(cstmt.getString(42));
		this.rtax_yn = Util.checkString(cstmt.getString(43));
		this.upd_resn = Util.checkString(cstmt.getString(44));
		this.govern_advt_yn = Util.checkString(cstmt.getString(45));
		this.upd_cont = Util.checkString(cstmt.getString(46));
		this.advcs_offr_yn = Util.checkString(cstmt.getString(47));
		this.remk = Util.checkString(cstmt.getString(48));
		this.pubc_dt = Util.checkString(cstmt.getString(49));
		this.pre_pubc_slip_no = Util.checkString(cstmt.getString(50));
		this.pre_pubc_slip_no_crte_dt = Util.checkString(cstmt.getString(51));
		this.upd_yn = Util.checkString(cstmt.getString(52));
		this.div_yn = Util.checkString(cstmt.getString(53));
		this.clos_stat = Util.checkString(cstmt.getString(54));
		this.clamt_stat = Util.checkString(cstmt.getString(55));
		this.sale_stmt_issu_yn = Util.checkString(cstmt.getString(56));
		this.purc_stmt_issu_yn = Util.checkString(cstmt.getString(57));
		this.elec_tax_stmt_yn = Util.checkString(cstmt.getString(58));
		this.tax_email = Util.checkString(cstmt.getString(59));
		this.tax_clsf = Util.checkString(cstmt.getString(60));
		this.advt_clsf = Util.checkString(cstmt.getString(61));
		this.patr_chrg_info = Util.checkString(cstmt.getString(62));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_PUB_1635_SDataSet ds = (AD_PUB_1635_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedi_cd()%>
<%= ds.getPubc_occr_seq()%>
<%= ds.getPubc_occr_dt()%>
<%= ds.getProc_dt()%>
<%= ds.getProc_seq()%>
<%= ds.getHndl_clsf()%>
<%= ds.getDlco_no()%>
<%= ds.getDlco_nm()%>
<%= ds.getAdvt_cont()%>
<%= ds.getPubc_side()%>
<%= ds.getIssu_ser_no()%>
<%= ds.getPubl_std()%>
<%= ds.getAdvt_fee()%>
<%= ds.getVat()%>
<%= ds.getPubc_tot_amt()%>
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
<%= ds.getMony_kind()%>
<%= ds.getChro_clsf()%>
<%= ds.getType_clsf()%>
<%= ds.getType_clsf_nm()%>
<%= ds.getExrate()%>
<%= ds.getBook_appndx_clsf()%>
<%= ds.getFrex_cntr_amt()%>
<%= ds.getNwsp_type_clsf()%>
<%= ds.getSlcrg_pers()%>
<%= ds.getSlcrg_pers_nm()%>
<%= ds.getDept_cd()%>
<%= ds.getDept_nm()%>
<%= ds.getMchrg_pers()%>
<%= ds.getMchrg_pers_nm()%>
<%= ds.getRtax_yn()%>
<%= ds.getUpd_resn()%>
<%= ds.getGovern_advt_yn()%>
<%= ds.getUpd_cont()%>
<%= ds.getAdvcs_offr_yn()%>
<%= ds.getRemk()%>
<%= ds.getPubc_dt()%>
<%= ds.getPre_pubc_slip_no()%>
<%= ds.getPre_pubc_slip_no_crte_dt()%>
<%= ds.getUpd_yn()%>
<%= ds.getDiv_yn()%>
<%= ds.getClos_stat()%>
<%= ds.getClamt_stat()%>
<%= ds.getSale_stmt_issu_yn()%>
<%= ds.getPurc_stmt_issu_yn()%>
<%= ds.getElec_tax_stmt_yn()%>
<%= ds.getTax_email()%>
<%= ds.getTax_clsf()%>
<%= ds.getAdvt_clsf()%>
<%= ds.getPatr_chrg_info()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 01 14:14:14 KST 2014 */