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


public class AD_PUB_1010_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
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
	public String advt_cont;
	public String sect_cd;
	public String sect_seq;
	public String cm;
	public String dn;
	public String uprc;
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
	public String advt_clas;
	public String indt_clsf;
	public String indt_clsf_nm;
	public String mony_kind;
	public String chro_clsf;
	public String type_clsf;
	public String type_clsf_nm;
	public String exrate;
	public String pubc_clsf;
	public String appndx_clsf;
	public String frex_cntr_amt;
	public String edt_clsf;
	public String grp_cmpy_cd;
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
	public String tabl_yn;
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
	public String purc_stmt_issu_yn2;
	public String elec_tax_stmt_yn;
	public String pubc_side;
	public String std_clsf;
	public String pubc_prd;
	public String pubc_frdt;
	public String pubc_todt;
	public String hp_edt_clsf;
	public String brdg_advt_yn;
	public String nwsp_type_yn;
	public String nwsp_side_type;
	public String dtls_medi_cd;
	public String seq_clsf;
	public String pre_issu_yn;
	public String pre_day_issu;
	public String ast_pers;
	public String ast_pers_nm;
	public String fee_vat;
	public String coms_vat;
	public String cslcrg_pers;
	public String cslcrg_pers_nm;
	public String pragn_yn;

	public AD_PUB_1010_SDataSet(){}
	public AD_PUB_1010_SDataSet(String errcode, String errmsg, String medi_cd, String proc_dt, String proc_seq, String pubc_occr_dt, String pubc_occr_seq, String hndl_clsf, String dlco_no, String dlco_nm, String advt_cont, String sect_cd, String sect_seq, String cm, String dn, String uprc, String advt_fee, String vat, String pubc_tot_amt, String agn, String agn_nm, String fee_rate, String fee, String hndl_plac_cd, String hndl_plac_nm, String coms_rate, String coms, String advt_clas, String indt_clsf, String indt_clsf_nm, String mony_kind, String chro_clsf, String type_clsf, String type_clsf_nm, String exrate, String pubc_clsf, String appndx_clsf, String frex_cntr_amt, String edt_clsf, String grp_cmpy_cd, String slcrg_pers, String slcrg_pers_nm, String dept_cd, String dept_nm, String mchrg_pers, String mchrg_pers_nm, String rtax_yn, String upd_resn, String govern_advt_yn, String upd_cont, String tabl_yn, String remk, String pubc_dt, String pre_pubc_slip_no, String pre_pubc_slip_no_crte_dt, String upd_yn, String div_yn, String clos_stat, String clamt_stat, String sale_stmt_issu_yn, String purc_stmt_issu_yn, String purc_stmt_issu_yn2, String elec_tax_stmt_yn, String pubc_side, String std_clsf, String pubc_prd, String pubc_frdt, String pubc_todt, String hp_edt_clsf, String brdg_advt_yn, String nwsp_type_yn, String nwsp_side_type, String dtls_medi_cd, String seq_clsf, String pre_issu_yn, String pre_day_issu, String ast_pers, String ast_pers_nm, String fee_vat, String coms_vat, String cslcrg_pers, String cslcrg_pers_nm, String pragn_yn){
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
		this.advt_cont = advt_cont;
		this.sect_cd = sect_cd;
		this.sect_seq = sect_seq;
		this.cm = cm;
		this.dn = dn;
		this.uprc = uprc;
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
		this.advt_clas = advt_clas;
		this.indt_clsf = indt_clsf;
		this.indt_clsf_nm = indt_clsf_nm;
		this.mony_kind = mony_kind;
		this.chro_clsf = chro_clsf;
		this.type_clsf = type_clsf;
		this.type_clsf_nm = type_clsf_nm;
		this.exrate = exrate;
		this.pubc_clsf = pubc_clsf;
		this.appndx_clsf = appndx_clsf;
		this.frex_cntr_amt = frex_cntr_amt;
		this.edt_clsf = edt_clsf;
		this.grp_cmpy_cd = grp_cmpy_cd;
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
		this.tabl_yn = tabl_yn;
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
		this.purc_stmt_issu_yn2 = purc_stmt_issu_yn2;
		this.elec_tax_stmt_yn = elec_tax_stmt_yn;
		this.pubc_side = pubc_side;
		this.std_clsf = std_clsf;
		this.pubc_prd = pubc_prd;
		this.pubc_frdt = pubc_frdt;
		this.pubc_todt = pubc_todt;
		this.hp_edt_clsf = hp_edt_clsf;
		this.brdg_advt_yn = brdg_advt_yn;
		this.nwsp_type_yn = nwsp_type_yn;
		this.nwsp_side_type = nwsp_side_type;
		this.dtls_medi_cd = dtls_medi_cd;
		this.seq_clsf = seq_clsf;
		this.pre_issu_yn = pre_issu_yn;
		this.pre_day_issu = pre_day_issu;
		this.ast_pers = ast_pers;
		this.ast_pers_nm = ast_pers_nm;
		this.fee_vat = fee_vat;
		this.coms_vat = coms_vat;
		this.cslcrg_pers = cslcrg_pers;
		this.cslcrg_pers_nm = cslcrg_pers_nm;
		this.pragn_yn = pragn_yn;
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

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_seq(String sect_seq){
		this.sect_seq = sect_seq;
	}

	public void setCm(String cm){
		this.cm = cm;
	}

	public void setDn(String dn){
		this.dn = dn;
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

	public void setAdvt_clas(String advt_clas){
		this.advt_clas = advt_clas;
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

	public void setPubc_clsf(String pubc_clsf){
		this.pubc_clsf = pubc_clsf;
	}

	public void setAppndx_clsf(String appndx_clsf){
		this.appndx_clsf = appndx_clsf;
	}

	public void setFrex_cntr_amt(String frex_cntr_amt){
		this.frex_cntr_amt = frex_cntr_amt;
	}

	public void setEdt_clsf(String edt_clsf){
		this.edt_clsf = edt_clsf;
	}

	public void setGrp_cmpy_cd(String grp_cmpy_cd){
		this.grp_cmpy_cd = grp_cmpy_cd;
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

	public void setTabl_yn(String tabl_yn){
		this.tabl_yn = tabl_yn;
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

	public void setPurc_stmt_issu_yn2(String purc_stmt_issu_yn2){
		this.purc_stmt_issu_yn2 = purc_stmt_issu_yn2;
	}

	public void setElec_tax_stmt_yn(String elec_tax_stmt_yn){
		this.elec_tax_stmt_yn = elec_tax_stmt_yn;
	}

	public void setPubc_side(String pubc_side){
		this.pubc_side = pubc_side;
	}

	public void setStd_clsf(String std_clsf){
		this.std_clsf = std_clsf;
	}

	public void setPubc_prd(String pubc_prd){
		this.pubc_prd = pubc_prd;
	}

	public void setPubc_frdt(String pubc_frdt){
		this.pubc_frdt = pubc_frdt;
	}

	public void setPubc_todt(String pubc_todt){
		this.pubc_todt = pubc_todt;
	}

	public void setHp_edt_clsf(String hp_edt_clsf){
		this.hp_edt_clsf = hp_edt_clsf;
	}

	public void setBrdg_advt_yn(String brdg_advt_yn){
		this.brdg_advt_yn = brdg_advt_yn;
	}

	public void setNwsp_type_yn(String nwsp_type_yn){
		this.nwsp_type_yn = nwsp_type_yn;
	}

	public void setNwsp_side_type(String nwsp_side_type){
		this.nwsp_side_type = nwsp_side_type;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setSeq_clsf(String seq_clsf){
		this.seq_clsf = seq_clsf;
	}

	public void setPre_issu_yn(String pre_issu_yn){
		this.pre_issu_yn = pre_issu_yn;
	}

	public void setPre_day_issu(String pre_day_issu){
		this.pre_day_issu = pre_day_issu;
	}

	public void setAst_pers(String ast_pers){
		this.ast_pers = ast_pers;
	}

	public void setAst_pers_nm(String ast_pers_nm){
		this.ast_pers_nm = ast_pers_nm;
	}

	public void setFee_vat(String fee_vat){
		this.fee_vat = fee_vat;
	}

	public void setComs_vat(String coms_vat){
		this.coms_vat = coms_vat;
	}

	public void setCslcrg_pers(String cslcrg_pers){
		this.cslcrg_pers = cslcrg_pers;
	}

	public void setCslcrg_pers_nm(String cslcrg_pers_nm){
		this.cslcrg_pers_nm = cslcrg_pers_nm;
	}

	public void setPragn_yn(String pragn_yn){
		this.pragn_yn = pragn_yn;
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

	public String getAdvt_cont(){
		return this.advt_cont;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_seq(){
		return this.sect_seq;
	}

	public String getCm(){
		return this.cm;
	}

	public String getDn(){
		return this.dn;
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

	public String getAdvt_clas(){
		return this.advt_clas;
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

	public String getPubc_clsf(){
		return this.pubc_clsf;
	}

	public String getAppndx_clsf(){
		return this.appndx_clsf;
	}

	public String getFrex_cntr_amt(){
		return this.frex_cntr_amt;
	}

	public String getEdt_clsf(){
		return this.edt_clsf;
	}

	public String getGrp_cmpy_cd(){
		return this.grp_cmpy_cd;
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

	public String getTabl_yn(){
		return this.tabl_yn;
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

	public String getPurc_stmt_issu_yn2(){
		return this.purc_stmt_issu_yn2;
	}

	public String getElec_tax_stmt_yn(){
		return this.elec_tax_stmt_yn;
	}

	public String getPubc_side(){
		return this.pubc_side;
	}

	public String getStd_clsf(){
		return this.std_clsf;
	}

	public String getPubc_prd(){
		return this.pubc_prd;
	}

	public String getPubc_frdt(){
		return this.pubc_frdt;
	}

	public String getPubc_todt(){
		return this.pubc_todt;
	}

	public String getHp_edt_clsf(){
		return this.hp_edt_clsf;
	}

	public String getBrdg_advt_yn(){
		return this.brdg_advt_yn;
	}

	public String getNwsp_type_yn(){
		return this.nwsp_type_yn;
	}

	public String getNwsp_side_type(){
		return this.nwsp_side_type;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getSeq_clsf(){
		return this.seq_clsf;
	}

	public String getPre_issu_yn(){
		return this.pre_issu_yn;
	}

	public String getPre_day_issu(){
		return this.pre_day_issu;
	}

	public String getAst_pers(){
		return this.ast_pers;
	}

	public String getAst_pers_nm(){
		return this.ast_pers_nm;
	}

	public String getFee_vat(){
		return this.fee_vat;
	}

	public String getComs_vat(){
		return this.coms_vat;
	}

	public String getCslcrg_pers(){
		return this.cslcrg_pers;
	}

	public String getCslcrg_pers_nm(){
		return this.cslcrg_pers_nm;
	}

	public String getPragn_yn(){
		return this.pragn_yn;
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
		this.advt_cont = Util.checkString(cstmt.getString(12));
		this.sect_cd = Util.checkString(cstmt.getString(13));
		this.sect_seq = Util.checkString(cstmt.getString(14));
		this.cm = Util.checkString(cstmt.getString(15));
		this.dn = Util.checkString(cstmt.getString(16));
		this.uprc = Util.checkString(cstmt.getString(17));
		this.advt_fee = Util.checkString(cstmt.getString(18));
		this.vat = Util.checkString(cstmt.getString(19));
		this.pubc_tot_amt = Util.checkString(cstmt.getString(20));
		this.agn = Util.checkString(cstmt.getString(21));
		this.agn_nm = Util.checkString(cstmt.getString(22));
		this.fee_rate = Util.checkString(cstmt.getString(23));
		this.fee = Util.checkString(cstmt.getString(24));
		this.hndl_plac_cd = Util.checkString(cstmt.getString(25));
		this.hndl_plac_nm = Util.checkString(cstmt.getString(26));
		this.coms_rate = Util.checkString(cstmt.getString(27));
		this.coms = Util.checkString(cstmt.getString(28));
		this.advt_clas = Util.checkString(cstmt.getString(29));
		this.indt_clsf = Util.checkString(cstmt.getString(30));
		this.indt_clsf_nm = Util.checkString(cstmt.getString(31));
		this.mony_kind = Util.checkString(cstmt.getString(32));
		this.chro_clsf = Util.checkString(cstmt.getString(33));
		this.type_clsf = Util.checkString(cstmt.getString(34));
		this.type_clsf_nm = Util.checkString(cstmt.getString(35));
		this.exrate = Util.checkString(cstmt.getString(36));
		this.pubc_clsf = Util.checkString(cstmt.getString(37));
		this.appndx_clsf = Util.checkString(cstmt.getString(38));
		this.frex_cntr_amt = Util.checkString(cstmt.getString(39));
		this.edt_clsf = Util.checkString(cstmt.getString(40));
		this.grp_cmpy_cd = Util.checkString(cstmt.getString(41));
		this.slcrg_pers = Util.checkString(cstmt.getString(42));
		this.slcrg_pers_nm = Util.checkString(cstmt.getString(43));
		this.dept_cd = Util.checkString(cstmt.getString(44));
		this.dept_nm = Util.checkString(cstmt.getString(45));
		this.mchrg_pers = Util.checkString(cstmt.getString(46));
		this.mchrg_pers_nm = Util.checkString(cstmt.getString(47));
		this.rtax_yn = Util.checkString(cstmt.getString(48));
		this.upd_resn = Util.checkString(cstmt.getString(49));
		this.govern_advt_yn = Util.checkString(cstmt.getString(50));
		this.upd_cont = Util.checkString(cstmt.getString(51));
		this.tabl_yn = Util.checkString(cstmt.getString(52));
		this.remk = Util.checkString(cstmt.getString(53));
		this.pubc_dt = Util.checkString(cstmt.getString(54));
		this.pre_pubc_slip_no = Util.checkString(cstmt.getString(55));
		this.pre_pubc_slip_no_crte_dt = Util.checkString(cstmt.getString(56));
		this.upd_yn = Util.checkString(cstmt.getString(57));
		this.div_yn = Util.checkString(cstmt.getString(58));
		this.clos_stat = Util.checkString(cstmt.getString(59));
		this.clamt_stat = Util.checkString(cstmt.getString(60));
		this.sale_stmt_issu_yn = Util.checkString(cstmt.getString(61));
		this.purc_stmt_issu_yn = Util.checkString(cstmt.getString(62));
		this.purc_stmt_issu_yn2 = Util.checkString(cstmt.getString(63));
		this.elec_tax_stmt_yn = Util.checkString(cstmt.getString(64));
		this.pubc_side = Util.checkString(cstmt.getString(65));
		this.std_clsf = Util.checkString(cstmt.getString(66));
		this.pubc_prd = Util.checkString(cstmt.getString(67));
		this.pubc_frdt = Util.checkString(cstmt.getString(68));
		this.pubc_todt = Util.checkString(cstmt.getString(69));
		this.hp_edt_clsf = Util.checkString(cstmt.getString(70));
		this.brdg_advt_yn = Util.checkString(cstmt.getString(71));
		this.nwsp_type_yn = Util.checkString(cstmt.getString(72));
		this.nwsp_side_type = Util.checkString(cstmt.getString(73));
		this.dtls_medi_cd = Util.checkString(cstmt.getString(74));
		this.seq_clsf = Util.checkString(cstmt.getString(75));
		this.pre_issu_yn = Util.checkString(cstmt.getString(76));
		this.pre_day_issu = Util.checkString(cstmt.getString(77));
		this.ast_pers = Util.checkString(cstmt.getString(78));
		this.ast_pers_nm = Util.checkString(cstmt.getString(79));
		this.fee_vat = Util.checkString(cstmt.getString(80));
		this.coms_vat = Util.checkString(cstmt.getString(81));
		this.cslcrg_pers = Util.checkString(cstmt.getString(82));
		this.cslcrg_pers_nm = Util.checkString(cstmt.getString(83));
		this.pragn_yn = Util.checkString(cstmt.getString(84));
		ResultSet rset0 = (ResultSet) cstmt.getObject(85);
		while(rset0.next()){
			AD_PUB_1010_SCURLISTRecord rec = new AD_PUB_1010_SCURLISTRecord();
			rec.bus_seq = Util.checkString(rset0.getString("bus_seq"));
			rec.bus_plc = Util.checkString(rset0.getString("bus_plc"));
			rec.bus_clsf = Util.checkString(rset0.getString("bus_clsf"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(86);
		while(rset1.next()){
			AD_PUB_1010_SCURLIST2Record rec = new AD_PUB_1010_SCURLIST2Record();
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.evnt_nm = Util.checkString(rset1.getString("evnt_nm"));
			rec.amt = Util.checkString(rset1.getString("amt"));
			rec.vat = Util.checkString(rset1.getString("vat"));
			rec.tot_amt = Util.checkString(rset1.getString("tot_amt"));
			rec.fee = Util.checkString(rset1.getString("fee"));
			rec.fee_vat = Util.checkString(rset1.getString("fee_vat"));
			rec.tot_fee = Util.checkString(rset1.getString("tot_fee"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_PUB_1010_SDataSet ds = (AD_PUB_1010_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_1010_SCURLISTRecord curlistRec = (AD_PUB_1010_SCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_PUB_1010_SCURLIST2Record curlist2Rec = (AD_PUB_1010_SCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

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
<%= ds.getAdvt_cont()%>
<%= ds.getSect_cd()%>
<%= ds.getSect_seq()%>
<%= ds.getCm()%>
<%= ds.getDn()%>
<%= ds.getUprc()%>
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
<%= ds.getAdvt_clas()%>
<%= ds.getIndt_clsf()%>
<%= ds.getIndt_clsf_nm()%>
<%= ds.getMony_kind()%>
<%= ds.getChro_clsf()%>
<%= ds.getType_clsf()%>
<%= ds.getType_clsf_nm()%>
<%= ds.getExrate()%>
<%= ds.getPubc_clsf()%>
<%= ds.getAppndx_clsf()%>
<%= ds.getFrex_cntr_amt()%>
<%= ds.getEdt_clsf()%>
<%= ds.getGrp_cmpy_cd()%>
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
<%= ds.getTabl_yn()%>
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
<%= ds.getPurc_stmt_issu_yn2()%>
<%= ds.getElec_tax_stmt_yn()%>
<%= ds.getPubc_side()%>
<%= ds.getStd_clsf()%>
<%= ds.getPubc_prd()%>
<%= ds.getPubc_frdt()%>
<%= ds.getPubc_todt()%>
<%= ds.getHp_edt_clsf()%>
<%= ds.getBrdg_advt_yn()%>
<%= ds.getNwsp_type_yn()%>
<%= ds.getNwsp_side_type()%>
<%= ds.getDtls_medi_cd()%>
<%= ds.getSeq_clsf()%>
<%= ds.getPre_issu_yn()%>
<%= ds.getPre_day_issu()%>
<%= ds.getAst_pers()%>
<%= ds.getAst_pers_nm()%>
<%= ds.getFee_vat()%>
<%= ds.getComs_vat()%>
<%= ds.getCslcrg_pers()%>
<%= ds.getCslcrg_pers_nm()%>
<%= ds.getPragn_yn()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.bus_seq%>
<%= curlistRec.bus_plc%>
<%= curlistRec.bus_clsf%>
<%= curlist2Rec.seq%>
<%= curlist2Rec.evnt_nm%>
<%= curlist2Rec.amt%>
<%= curlist2Rec.vat%>
<%= curlist2Rec.tot_amt%>
<%= curlist2Rec.fee%>
<%= curlist2Rec.fee_vat%>
<%= curlist2Rec.tot_fee%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 23 18:59:14 KST 2016 */