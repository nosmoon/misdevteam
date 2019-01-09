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


package chosun.ciis.ad.res.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.res.ds.*;
import chosun.ciis.ad.res.rec.*;

/**
 * 
 */


public class AD_RES_1220_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String medi_cd;
	public String preng_occr_dt;
	public String preng_occr_seq;
	public String dlco_no;
	public String sect_cd;
	public String sect_seq;
	public String cm;
	public String dn;
	public String chro_clsf;
	public String uprc;
	public String advt_fee;
	public String vat;
	public String pubc_tot_amt;
	public String pubc_side;
	public String rtax_yn;
	public String tabl_yn;
	public String hndl_clsf;
	public String agn;
	public String fee_rate;
	public String fee;
	public String hndl_plac_cd;
	public String coms_rate;
	public String coms;
	public String advt_clas;
	public String indt_clsf;
	public String indt_clsf_nm;
	public String mony_kind;
	public String type_clsf;
	public String type_clsf_nm;
	public String exrate;
	public String pubc_clsf;
	public String grp_cmpy_cd;
	public String frex_cntr_amt;
	public String edt_clsf;
	public String slcrg_pers;
	public String dept_cd;
	public String mchrg_pers;
	public String advt_cont;
	public String remk;
	public String ext01;
	public String srch_dt;
	public String srch_plac;
	public String cntc_plac;
	public String tm;
	public String sect_clsf;
	public String ext02;
	public String cnfm_matt;
	public String org_preng_occr_dt;
	public String org_preng_occr_seq;
	public String nwsp_type_yn;
	public String nwsp_side_type;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String pre_issu_yn;
	public String ast_pers;
	public String pubc_frdt;
	public String pubc_todt;
	public String mode;
	public String bus_seq;
	public String bus_plc;
	public String bus_clsf;
	public String fee_vat;
	public String coms_vat;
	public String rcpm_yn;
	public String unrcpm_yn;
	public String acct_num;
	public String tran_nm;
	public String tran_amt;
	public String tran_dt;
	public String tran_schd_dt;
	public String advt_emp_nm;
	public String advt_email;
	public String advt_telno;
	public String pragn_yn;
	public String dtls_medi_cd;
	public String emode;
	public String eseq;
	public String evnt_nm;
	public String eamt;
	public String evat;
	public String etot_amt;
	public String efee;
	public String efee_vat;
	public String etot_fee;

	public AD_RES_1220_ADM(){}
	public AD_RES_1220_ADM(String flag, String cmpy_cd, String medi_cd, String preng_occr_dt, String preng_occr_seq, String dlco_no, String sect_cd, String sect_seq, String cm, String dn, String chro_clsf, String uprc, String advt_fee, String vat, String pubc_tot_amt, String pubc_side, String rtax_yn, String tabl_yn, String hndl_clsf, String agn, String fee_rate, String fee, String hndl_plac_cd, String coms_rate, String coms, String advt_clas, String indt_clsf, String indt_clsf_nm, String mony_kind, String type_clsf, String type_clsf_nm, String exrate, String pubc_clsf, String grp_cmpy_cd, String frex_cntr_amt, String edt_clsf, String slcrg_pers, String dept_cd, String mchrg_pers, String advt_cont, String remk, String ext01, String srch_dt, String srch_plac, String cntc_plac, String tm, String sect_clsf, String ext02, String cnfm_matt, String org_preng_occr_dt, String org_preng_occr_seq, String nwsp_type_yn, String nwsp_side_type, String incmg_pers_ip, String incmg_pers, String pre_issu_yn, String ast_pers, String pubc_frdt, String pubc_todt, String mode, String bus_seq, String bus_plc, String bus_clsf, String fee_vat, String coms_vat, String rcpm_yn, String unrcpm_yn, String acct_num, String tran_nm, String tran_amt, String tran_dt, String tran_schd_dt, String advt_emp_nm, String advt_email, String advt_telno, String pragn_yn, String dtls_medi_cd, String emode, String eseq, String evnt_nm, String eamt, String evat, String etot_amt, String efee, String efee_vat, String etot_fee){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.preng_occr_dt = preng_occr_dt;
		this.preng_occr_seq = preng_occr_seq;
		this.dlco_no = dlco_no;
		this.sect_cd = sect_cd;
		this.sect_seq = sect_seq;
		this.cm = cm;
		this.dn = dn;
		this.chro_clsf = chro_clsf;
		this.uprc = uprc;
		this.advt_fee = advt_fee;
		this.vat = vat;
		this.pubc_tot_amt = pubc_tot_amt;
		this.pubc_side = pubc_side;
		this.rtax_yn = rtax_yn;
		this.tabl_yn = tabl_yn;
		this.hndl_clsf = hndl_clsf;
		this.agn = agn;
		this.fee_rate = fee_rate;
		this.fee = fee;
		this.hndl_plac_cd = hndl_plac_cd;
		this.coms_rate = coms_rate;
		this.coms = coms;
		this.advt_clas = advt_clas;
		this.indt_clsf = indt_clsf;
		this.indt_clsf_nm = indt_clsf_nm;
		this.mony_kind = mony_kind;
		this.type_clsf = type_clsf;
		this.type_clsf_nm = type_clsf_nm;
		this.exrate = exrate;
		this.pubc_clsf = pubc_clsf;
		this.grp_cmpy_cd = grp_cmpy_cd;
		this.frex_cntr_amt = frex_cntr_amt;
		this.edt_clsf = edt_clsf;
		this.slcrg_pers = slcrg_pers;
		this.dept_cd = dept_cd;
		this.mchrg_pers = mchrg_pers;
		this.advt_cont = advt_cont;
		this.remk = remk;
		this.ext01 = ext01;
		this.srch_dt = srch_dt;
		this.srch_plac = srch_plac;
		this.cntc_plac = cntc_plac;
		this.tm = tm;
		this.sect_clsf = sect_clsf;
		this.ext02 = ext02;
		this.cnfm_matt = cnfm_matt;
		this.org_preng_occr_dt = org_preng_occr_dt;
		this.org_preng_occr_seq = org_preng_occr_seq;
		this.nwsp_type_yn = nwsp_type_yn;
		this.nwsp_side_type = nwsp_side_type;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.pre_issu_yn = pre_issu_yn;
		this.ast_pers = ast_pers;
		this.pubc_frdt = pubc_frdt;
		this.pubc_todt = pubc_todt;
		this.mode = mode;
		this.bus_seq = bus_seq;
		this.bus_plc = bus_plc;
		this.bus_clsf = bus_clsf;
		this.fee_vat = fee_vat;
		this.coms_vat = coms_vat;
		this.rcpm_yn = rcpm_yn;
		this.unrcpm_yn = unrcpm_yn;
		this.acct_num = acct_num;
		this.tran_nm = tran_nm;
		this.tran_amt = tran_amt;
		this.tran_dt = tran_dt;
		this.tran_schd_dt = tran_schd_dt;
		this.advt_emp_nm = advt_emp_nm;
		this.advt_email = advt_email;
		this.advt_telno = advt_telno;
		this.pragn_yn = pragn_yn;
		this.dtls_medi_cd = dtls_medi_cd;
		this.emode = emode;
		this.eseq = eseq;
		this.evnt_nm = evnt_nm;
		this.eamt = eamt;
		this.evat = evat;
		this.etot_amt = etot_amt;
		this.efee = efee;
		this.efee_vat = efee_vat;
		this.etot_fee = etot_fee;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
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

	public void setChro_clsf(String chro_clsf){
		this.chro_clsf = chro_clsf;
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

	public void setPubc_side(String pubc_side){
		this.pubc_side = pubc_side;
	}

	public void setRtax_yn(String rtax_yn){
		this.rtax_yn = rtax_yn;
	}

	public void setTabl_yn(String tabl_yn){
		this.tabl_yn = tabl_yn;
	}

	public void setHndl_clsf(String hndl_clsf){
		this.hndl_clsf = hndl_clsf;
	}

	public void setAgn(String agn){
		this.agn = agn;
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

	public void setGrp_cmpy_cd(String grp_cmpy_cd){
		this.grp_cmpy_cd = grp_cmpy_cd;
	}

	public void setFrex_cntr_amt(String frex_cntr_amt){
		this.frex_cntr_amt = frex_cntr_amt;
	}

	public void setEdt_clsf(String edt_clsf){
		this.edt_clsf = edt_clsf;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setExt01(String ext01){
		this.ext01 = ext01;
	}

	public void setSrch_dt(String srch_dt){
		this.srch_dt = srch_dt;
	}

	public void setSrch_plac(String srch_plac){
		this.srch_plac = srch_plac;
	}

	public void setCntc_plac(String cntc_plac){
		this.cntc_plac = cntc_plac;
	}

	public void setTm(String tm){
		this.tm = tm;
	}

	public void setSect_clsf(String sect_clsf){
		this.sect_clsf = sect_clsf;
	}

	public void setExt02(String ext02){
		this.ext02 = ext02;
	}

	public void setCnfm_matt(String cnfm_matt){
		this.cnfm_matt = cnfm_matt;
	}

	public void setOrg_preng_occr_dt(String org_preng_occr_dt){
		this.org_preng_occr_dt = org_preng_occr_dt;
	}

	public void setOrg_preng_occr_seq(String org_preng_occr_seq){
		this.org_preng_occr_seq = org_preng_occr_seq;
	}

	public void setNwsp_type_yn(String nwsp_type_yn){
		this.nwsp_type_yn = nwsp_type_yn;
	}

	public void setNwsp_side_type(String nwsp_side_type){
		this.nwsp_side_type = nwsp_side_type;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setPre_issu_yn(String pre_issu_yn){
		this.pre_issu_yn = pre_issu_yn;
	}

	public void setAst_pers(String ast_pers){
		this.ast_pers = ast_pers;
	}

	public void setPubc_frdt(String pubc_frdt){
		this.pubc_frdt = pubc_frdt;
	}

	public void setPubc_todt(String pubc_todt){
		this.pubc_todt = pubc_todt;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setBus_seq(String bus_seq){
		this.bus_seq = bus_seq;
	}

	public void setBus_plc(String bus_plc){
		this.bus_plc = bus_plc;
	}

	public void setBus_clsf(String bus_clsf){
		this.bus_clsf = bus_clsf;
	}

	public void setFee_vat(String fee_vat){
		this.fee_vat = fee_vat;
	}

	public void setComs_vat(String coms_vat){
		this.coms_vat = coms_vat;
	}

	public void setRcpm_yn(String rcpm_yn){
		this.rcpm_yn = rcpm_yn;
	}

	public void setUnrcpm_yn(String unrcpm_yn){
		this.unrcpm_yn = unrcpm_yn;
	}

	public void setAcct_num(String acct_num){
		this.acct_num = acct_num;
	}

	public void setTran_nm(String tran_nm){
		this.tran_nm = tran_nm;
	}

	public void setTran_amt(String tran_amt){
		this.tran_amt = tran_amt;
	}

	public void setTran_dt(String tran_dt){
		this.tran_dt = tran_dt;
	}

	public void setTran_schd_dt(String tran_schd_dt){
		this.tran_schd_dt = tran_schd_dt;
	}

	public void setAdvt_emp_nm(String advt_emp_nm){
		this.advt_emp_nm = advt_emp_nm;
	}

	public void setAdvt_email(String advt_email){
		this.advt_email = advt_email;
	}

	public void setAdvt_telno(String advt_telno){
		this.advt_telno = advt_telno;
	}

	public void setPragn_yn(String pragn_yn){
		this.pragn_yn = pragn_yn;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setEmode(String emode){
		this.emode = emode;
	}

	public void setEseq(String eseq){
		this.eseq = eseq;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setEamt(String eamt){
		this.eamt = eamt;
	}

	public void setEvat(String evat){
		this.evat = evat;
	}

	public void setEtot_amt(String etot_amt){
		this.etot_amt = etot_amt;
	}

	public void setEfee(String efee){
		this.efee = efee;
	}

	public void setEfee_vat(String efee_vat){
		this.efee_vat = efee_vat;
	}

	public void setEtot_fee(String etot_fee){
		this.etot_fee = etot_fee;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
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

	public String getChro_clsf(){
		return this.chro_clsf;
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

	public String getPubc_side(){
		return this.pubc_side;
	}

	public String getRtax_yn(){
		return this.rtax_yn;
	}

	public String getTabl_yn(){
		return this.tabl_yn;
	}

	public String getHndl_clsf(){
		return this.hndl_clsf;
	}

	public String getAgn(){
		return this.agn;
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

	public String getGrp_cmpy_cd(){
		return this.grp_cmpy_cd;
	}

	public String getFrex_cntr_amt(){
		return this.frex_cntr_amt;
	}

	public String getEdt_clsf(){
		return this.edt_clsf;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getAdvt_cont(){
		return this.advt_cont;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getExt01(){
		return this.ext01;
	}

	public String getSrch_dt(){
		return this.srch_dt;
	}

	public String getSrch_plac(){
		return this.srch_plac;
	}

	public String getCntc_plac(){
		return this.cntc_plac;
	}

	public String getTm(){
		return this.tm;
	}

	public String getSect_clsf(){
		return this.sect_clsf;
	}

	public String getExt02(){
		return this.ext02;
	}

	public String getCnfm_matt(){
		return this.cnfm_matt;
	}

	public String getOrg_preng_occr_dt(){
		return this.org_preng_occr_dt;
	}

	public String getOrg_preng_occr_seq(){
		return this.org_preng_occr_seq;
	}

	public String getNwsp_type_yn(){
		return this.nwsp_type_yn;
	}

	public String getNwsp_side_type(){
		return this.nwsp_side_type;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getPre_issu_yn(){
		return this.pre_issu_yn;
	}

	public String getAst_pers(){
		return this.ast_pers;
	}

	public String getPubc_frdt(){
		return this.pubc_frdt;
	}

	public String getPubc_todt(){
		return this.pubc_todt;
	}

	public String getMode(){
		return this.mode;
	}

	public String getBus_seq(){
		return this.bus_seq;
	}

	public String getBus_plc(){
		return this.bus_plc;
	}

	public String getBus_clsf(){
		return this.bus_clsf;
	}

	public String getFee_vat(){
		return this.fee_vat;
	}

	public String getComs_vat(){
		return this.coms_vat;
	}

	public String getRcpm_yn(){
		return this.rcpm_yn;
	}

	public String getUnrcpm_yn(){
		return this.unrcpm_yn;
	}

	public String getAcct_num(){
		return this.acct_num;
	}

	public String getTran_nm(){
		return this.tran_nm;
	}

	public String getTran_amt(){
		return this.tran_amt;
	}

	public String getTran_dt(){
		return this.tran_dt;
	}

	public String getTran_schd_dt(){
		return this.tran_schd_dt;
	}

	public String getAdvt_emp_nm(){
		return this.advt_emp_nm;
	}

	public String getAdvt_email(){
		return this.advt_email;
	}

	public String getAdvt_telno(){
		return this.advt_telno;
	}

	public String getPragn_yn(){
		return this.pragn_yn;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getEmode(){
		return this.emode;
	}

	public String getEseq(){
		return this.eseq;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getEamt(){
		return this.eamt;
	}

	public String getEvat(){
		return this.evat;
	}

	public String getEtot_amt(){
		return this.etot_amt;
	}

	public String getEfee(){
		return this.efee;
	}

	public String getEfee_vat(){
		return this.efee_vat;
	}

	public String getEtot_fee(){
		return this.etot_fee;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_RES_1220_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_RES_1220_ADM dm = (AD_RES_1220_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.medi_cd);
		cstmt.setString(6, dm.preng_occr_dt);
		cstmt.setString(7, dm.preng_occr_seq);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.setString(8, dm.dlco_no);
		cstmt.setString(9, dm.sect_cd);
		cstmt.setString(10, dm.sect_seq);
		cstmt.setString(11, dm.cm);
		cstmt.setString(12, dm.dn);
		cstmt.setString(13, dm.chro_clsf);
		cstmt.setString(14, dm.uprc);
		cstmt.setString(15, dm.advt_fee);
		cstmt.setString(16, dm.vat);
		cstmt.setString(17, dm.pubc_tot_amt);
		cstmt.setString(18, dm.pubc_side);
		cstmt.setString(19, dm.rtax_yn);
		cstmt.setString(20, dm.tabl_yn);
		cstmt.setString(21, dm.hndl_clsf);
		cstmt.setString(22, dm.agn);
		cstmt.setString(23, dm.fee_rate);
		cstmt.setString(24, dm.fee);
		cstmt.setString(25, dm.hndl_plac_cd);
		cstmt.setString(26, dm.coms_rate);
		cstmt.setString(27, dm.coms);
		cstmt.setString(28, dm.advt_clas);
		cstmt.setString(29, dm.indt_clsf);
		cstmt.setString(30, dm.indt_clsf_nm);
		cstmt.setString(31, dm.mony_kind);
		cstmt.setString(32, dm.type_clsf);
		cstmt.setString(33, dm.type_clsf_nm);
		cstmt.setString(34, dm.exrate);
		cstmt.setString(35, dm.pubc_clsf);
		cstmt.setString(36, dm.grp_cmpy_cd);
		cstmt.setString(37, dm.frex_cntr_amt);
		cstmt.setString(38, dm.edt_clsf);
		cstmt.setString(39, dm.slcrg_pers);
		cstmt.setString(40, dm.dept_cd);
		cstmt.setString(41, dm.mchrg_pers);
		cstmt.setString(42, dm.advt_cont);
		cstmt.setString(43, dm.remk);
		cstmt.setString(44, dm.ext01);
		cstmt.setString(45, dm.srch_dt);
		cstmt.setString(46, dm.srch_plac);
		cstmt.setString(47, dm.cntc_plac);
		cstmt.setString(48, dm.tm);
		cstmt.setString(49, dm.sect_clsf);
		cstmt.setString(50, dm.ext02);
		cstmt.setString(51, dm.cnfm_matt);
		cstmt.setString(52, dm.org_preng_occr_dt);
		cstmt.setString(53, dm.org_preng_occr_seq);
		cstmt.setString(54, dm.nwsp_type_yn);
		cstmt.setString(55, dm.nwsp_side_type);
		cstmt.setString(56, dm.incmg_pers_ip);
		cstmt.setString(57, dm.incmg_pers);
		cstmt.setString(58, dm.pre_issu_yn);
		cstmt.setString(59, dm.ast_pers);
		cstmt.setString(60, dm.pubc_frdt);
		cstmt.setString(61, dm.pubc_todt);
		cstmt.setString(62, dm.mode);
		cstmt.setString(63, dm.bus_seq);
		cstmt.setString(64, dm.bus_plc);
		cstmt.setString(65, dm.bus_clsf);
		cstmt.setString(66, dm.fee_vat);
		cstmt.setString(67, dm.coms_vat);
		cstmt.setString(68, dm.rcpm_yn);
		cstmt.setString(69, dm.unrcpm_yn);
		cstmt.setString(70, dm.acct_num);
		cstmt.setString(71, dm.tran_nm);
		cstmt.setString(72, dm.tran_amt);
		cstmt.setString(73, dm.tran_dt);
		cstmt.setString(74, dm.tran_schd_dt);
		cstmt.setString(75, dm.advt_emp_nm);
		cstmt.setString(76, dm.advt_email);
		cstmt.setString(77, dm.advt_telno);
		cstmt.setString(78, dm.pragn_yn);
		cstmt.setString(79, dm.dtls_medi_cd);
		cstmt.setString(80, dm.emode);
		cstmt.setString(81, dm.eseq);
		cstmt.setString(82, dm.evnt_nm);
		cstmt.setString(83, dm.eamt);
		cstmt.setString(84, dm.evat);
		cstmt.setString(85, dm.etot_amt);
		cstmt.setString(86, dm.efee);
		cstmt.setString(87, dm.efee_vat);
		cstmt.setString(88, dm.etot_fee);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.res.ds.AD_RES_1220_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("preng_occr_dt = [" + getPreng_occr_dt() + "]");
		System.out.println("preng_occr_seq = [" + getPreng_occr_seq() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("sect_cd = [" + getSect_cd() + "]");
		System.out.println("sect_seq = [" + getSect_seq() + "]");
		System.out.println("cm = [" + getCm() + "]");
		System.out.println("dn = [" + getDn() + "]");
		System.out.println("chro_clsf = [" + getChro_clsf() + "]");
		System.out.println("uprc = [" + getUprc() + "]");
		System.out.println("advt_fee = [" + getAdvt_fee() + "]");
		System.out.println("vat = [" + getVat() + "]");
		System.out.println("pubc_tot_amt = [" + getPubc_tot_amt() + "]");
		System.out.println("pubc_side = [" + getPubc_side() + "]");
		System.out.println("rtax_yn = [" + getRtax_yn() + "]");
		System.out.println("tabl_yn = [" + getTabl_yn() + "]");
		System.out.println("hndl_clsf = [" + getHndl_clsf() + "]");
		System.out.println("agn = [" + getAgn() + "]");
		System.out.println("fee_rate = [" + getFee_rate() + "]");
		System.out.println("fee = [" + getFee() + "]");
		System.out.println("hndl_plac_cd = [" + getHndl_plac_cd() + "]");
		System.out.println("coms_rate = [" + getComs_rate() + "]");
		System.out.println("coms = [" + getComs() + "]");
		System.out.println("advt_clas = [" + getAdvt_clas() + "]");
		System.out.println("indt_clsf = [" + getIndt_clsf() + "]");
		System.out.println("indt_clsf_nm = [" + getIndt_clsf_nm() + "]");
		System.out.println("mony_kind = [" + getMony_kind() + "]");
		System.out.println("type_clsf = [" + getType_clsf() + "]");
		System.out.println("type_clsf_nm = [" + getType_clsf_nm() + "]");
		System.out.println("exrate = [" + getExrate() + "]");
		System.out.println("pubc_clsf = [" + getPubc_clsf() + "]");
		System.out.println("grp_cmpy_cd = [" + getGrp_cmpy_cd() + "]");
		System.out.println("frex_cntr_amt = [" + getFrex_cntr_amt() + "]");
		System.out.println("edt_clsf = [" + getEdt_clsf() + "]");
		System.out.println("slcrg_pers = [" + getSlcrg_pers() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("mchrg_pers = [" + getMchrg_pers() + "]");
		System.out.println("advt_cont = [" + getAdvt_cont() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("ext01 = [" + getExt01() + "]");
		System.out.println("srch_dt = [" + getSrch_dt() + "]");
		System.out.println("srch_plac = [" + getSrch_plac() + "]");
		System.out.println("cntc_plac = [" + getCntc_plac() + "]");
		System.out.println("tm = [" + getTm() + "]");
		System.out.println("sect_clsf = [" + getSect_clsf() + "]");
		System.out.println("ext02 = [" + getExt02() + "]");
		System.out.println("cnfm_matt = [" + getCnfm_matt() + "]");
		System.out.println("org_preng_occr_dt = [" + getOrg_preng_occr_dt() + "]");
		System.out.println("org_preng_occr_seq = [" + getOrg_preng_occr_seq() + "]");
		System.out.println("nwsp_type_yn = [" + getNwsp_type_yn() + "]");
		System.out.println("nwsp_side_type = [" + getNwsp_side_type() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("pre_issu_yn = [" + getPre_issu_yn() + "]");
		System.out.println("ast_pers = [" + getAst_pers() + "]");
		System.out.println("pubc_frdt = [" + getPubc_frdt() + "]");
		System.out.println("pubc_todt = [" + getPubc_todt() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("bus_seq = [" + getBus_seq() + "]");
		System.out.println("bus_plc = [" + getBus_plc() + "]");
		System.out.println("bus_clsf = [" + getBus_clsf() + "]");
		System.out.println("fee_vat = [" + getFee_vat() + "]");
		System.out.println("coms_vat = [" + getComs_vat() + "]");
		System.out.println("rcpm_yn = [" + getRcpm_yn() + "]");
		System.out.println("unrcpm_yn = [" + getUnrcpm_yn() + "]");
		System.out.println("acct_num = [" + getAcct_num() + "]");
		System.out.println("tran_nm = [" + getTran_nm() + "]");
		System.out.println("tran_amt = [" + getTran_amt() + "]");
		System.out.println("tran_dt = [" + getTran_dt() + "]");
		System.out.println("tran_schd_dt = [" + getTran_schd_dt() + "]");
		System.out.println("advt_emp_nm = [" + getAdvt_emp_nm() + "]");
		System.out.println("advt_email = [" + getAdvt_email() + "]");
		System.out.println("advt_telno = [" + getAdvt_telno() + "]");
		System.out.println("pragn_yn = [" + getPragn_yn() + "]");
		System.out.println("dtls_medi_cd = [" + getDtls_medi_cd() + "]");
		System.out.println("emode = [" + getEmode() + "]");
		System.out.println("eseq = [" + getEseq() + "]");
		System.out.println("evnt_nm = [" + getEvnt_nm() + "]");
		System.out.println("eamt = [" + getEamt() + "]");
		System.out.println("evat = [" + getEvat() + "]");
		System.out.println("etot_amt = [" + getEtot_amt() + "]");
		System.out.println("efee = [" + getEfee() + "]");
		System.out.println("efee_vat = [" + getEfee_vat() + "]");
		System.out.println("etot_fee = [" + getEtot_fee() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String preng_occr_dt = req.getParameter("preng_occr_dt");
if( preng_occr_dt == null){
	System.out.println(this.toString+" : preng_occr_dt is null" );
}else{
	System.out.println(this.toString+" : preng_occr_dt is "+preng_occr_dt );
}
String preng_occr_seq = req.getParameter("preng_occr_seq");
if( preng_occr_seq == null){
	System.out.println(this.toString+" : preng_occr_seq is null" );
}else{
	System.out.println(this.toString+" : preng_occr_seq is "+preng_occr_seq );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String sect_cd = req.getParameter("sect_cd");
if( sect_cd == null){
	System.out.println(this.toString+" : sect_cd is null" );
}else{
	System.out.println(this.toString+" : sect_cd is "+sect_cd );
}
String sect_seq = req.getParameter("sect_seq");
if( sect_seq == null){
	System.out.println(this.toString+" : sect_seq is null" );
}else{
	System.out.println(this.toString+" : sect_seq is "+sect_seq );
}
String cm = req.getParameter("cm");
if( cm == null){
	System.out.println(this.toString+" : cm is null" );
}else{
	System.out.println(this.toString+" : cm is "+cm );
}
String dn = req.getParameter("dn");
if( dn == null){
	System.out.println(this.toString+" : dn is null" );
}else{
	System.out.println(this.toString+" : dn is "+dn );
}
String chro_clsf = req.getParameter("chro_clsf");
if( chro_clsf == null){
	System.out.println(this.toString+" : chro_clsf is null" );
}else{
	System.out.println(this.toString+" : chro_clsf is "+chro_clsf );
}
String uprc = req.getParameter("uprc");
if( uprc == null){
	System.out.println(this.toString+" : uprc is null" );
}else{
	System.out.println(this.toString+" : uprc is "+uprc );
}
String advt_fee = req.getParameter("advt_fee");
if( advt_fee == null){
	System.out.println(this.toString+" : advt_fee is null" );
}else{
	System.out.println(this.toString+" : advt_fee is "+advt_fee );
}
String vat = req.getParameter("vat");
if( vat == null){
	System.out.println(this.toString+" : vat is null" );
}else{
	System.out.println(this.toString+" : vat is "+vat );
}
String pubc_tot_amt = req.getParameter("pubc_tot_amt");
if( pubc_tot_amt == null){
	System.out.println(this.toString+" : pubc_tot_amt is null" );
}else{
	System.out.println(this.toString+" : pubc_tot_amt is "+pubc_tot_amt );
}
String pubc_side = req.getParameter("pubc_side");
if( pubc_side == null){
	System.out.println(this.toString+" : pubc_side is null" );
}else{
	System.out.println(this.toString+" : pubc_side is "+pubc_side );
}
String rtax_yn = req.getParameter("rtax_yn");
if( rtax_yn == null){
	System.out.println(this.toString+" : rtax_yn is null" );
}else{
	System.out.println(this.toString+" : rtax_yn is "+rtax_yn );
}
String tabl_yn = req.getParameter("tabl_yn");
if( tabl_yn == null){
	System.out.println(this.toString+" : tabl_yn is null" );
}else{
	System.out.println(this.toString+" : tabl_yn is "+tabl_yn );
}
String hndl_clsf = req.getParameter("hndl_clsf");
if( hndl_clsf == null){
	System.out.println(this.toString+" : hndl_clsf is null" );
}else{
	System.out.println(this.toString+" : hndl_clsf is "+hndl_clsf );
}
String agn = req.getParameter("agn");
if( agn == null){
	System.out.println(this.toString+" : agn is null" );
}else{
	System.out.println(this.toString+" : agn is "+agn );
}
String fee_rate = req.getParameter("fee_rate");
if( fee_rate == null){
	System.out.println(this.toString+" : fee_rate is null" );
}else{
	System.out.println(this.toString+" : fee_rate is "+fee_rate );
}
String fee = req.getParameter("fee");
if( fee == null){
	System.out.println(this.toString+" : fee is null" );
}else{
	System.out.println(this.toString+" : fee is "+fee );
}
String hndl_plac_cd = req.getParameter("hndl_plac_cd");
if( hndl_plac_cd == null){
	System.out.println(this.toString+" : hndl_plac_cd is null" );
}else{
	System.out.println(this.toString+" : hndl_plac_cd is "+hndl_plac_cd );
}
String coms_rate = req.getParameter("coms_rate");
if( coms_rate == null){
	System.out.println(this.toString+" : coms_rate is null" );
}else{
	System.out.println(this.toString+" : coms_rate is "+coms_rate );
}
String coms = req.getParameter("coms");
if( coms == null){
	System.out.println(this.toString+" : coms is null" );
}else{
	System.out.println(this.toString+" : coms is "+coms );
}
String advt_clas = req.getParameter("advt_clas");
if( advt_clas == null){
	System.out.println(this.toString+" : advt_clas is null" );
}else{
	System.out.println(this.toString+" : advt_clas is "+advt_clas );
}
String indt_clsf = req.getParameter("indt_clsf");
if( indt_clsf == null){
	System.out.println(this.toString+" : indt_clsf is null" );
}else{
	System.out.println(this.toString+" : indt_clsf is "+indt_clsf );
}
String indt_clsf_nm = req.getParameter("indt_clsf_nm");
if( indt_clsf_nm == null){
	System.out.println(this.toString+" : indt_clsf_nm is null" );
}else{
	System.out.println(this.toString+" : indt_clsf_nm is "+indt_clsf_nm );
}
String mony_kind = req.getParameter("mony_kind");
if( mony_kind == null){
	System.out.println(this.toString+" : mony_kind is null" );
}else{
	System.out.println(this.toString+" : mony_kind is "+mony_kind );
}
String type_clsf = req.getParameter("type_clsf");
if( type_clsf == null){
	System.out.println(this.toString+" : type_clsf is null" );
}else{
	System.out.println(this.toString+" : type_clsf is "+type_clsf );
}
String type_clsf_nm = req.getParameter("type_clsf_nm");
if( type_clsf_nm == null){
	System.out.println(this.toString+" : type_clsf_nm is null" );
}else{
	System.out.println(this.toString+" : type_clsf_nm is "+type_clsf_nm );
}
String exrate = req.getParameter("exrate");
if( exrate == null){
	System.out.println(this.toString+" : exrate is null" );
}else{
	System.out.println(this.toString+" : exrate is "+exrate );
}
String pubc_clsf = req.getParameter("pubc_clsf");
if( pubc_clsf == null){
	System.out.println(this.toString+" : pubc_clsf is null" );
}else{
	System.out.println(this.toString+" : pubc_clsf is "+pubc_clsf );
}
String grp_cmpy_cd = req.getParameter("grp_cmpy_cd");
if( grp_cmpy_cd == null){
	System.out.println(this.toString+" : grp_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : grp_cmpy_cd is "+grp_cmpy_cd );
}
String frex_cntr_amt = req.getParameter("frex_cntr_amt");
if( frex_cntr_amt == null){
	System.out.println(this.toString+" : frex_cntr_amt is null" );
}else{
	System.out.println(this.toString+" : frex_cntr_amt is "+frex_cntr_amt );
}
String edt_clsf = req.getParameter("edt_clsf");
if( edt_clsf == null){
	System.out.println(this.toString+" : edt_clsf is null" );
}else{
	System.out.println(this.toString+" : edt_clsf is "+edt_clsf );
}
String slcrg_pers = req.getParameter("slcrg_pers");
if( slcrg_pers == null){
	System.out.println(this.toString+" : slcrg_pers is null" );
}else{
	System.out.println(this.toString+" : slcrg_pers is "+slcrg_pers );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String mchrg_pers = req.getParameter("mchrg_pers");
if( mchrg_pers == null){
	System.out.println(this.toString+" : mchrg_pers is null" );
}else{
	System.out.println(this.toString+" : mchrg_pers is "+mchrg_pers );
}
String advt_cont = req.getParameter("advt_cont");
if( advt_cont == null){
	System.out.println(this.toString+" : advt_cont is null" );
}else{
	System.out.println(this.toString+" : advt_cont is "+advt_cont );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String ext01 = req.getParameter("ext01");
if( ext01 == null){
	System.out.println(this.toString+" : ext01 is null" );
}else{
	System.out.println(this.toString+" : ext01 is "+ext01 );
}
String srch_dt = req.getParameter("srch_dt");
if( srch_dt == null){
	System.out.println(this.toString+" : srch_dt is null" );
}else{
	System.out.println(this.toString+" : srch_dt is "+srch_dt );
}
String srch_plac = req.getParameter("srch_plac");
if( srch_plac == null){
	System.out.println(this.toString+" : srch_plac is null" );
}else{
	System.out.println(this.toString+" : srch_plac is "+srch_plac );
}
String cntc_plac = req.getParameter("cntc_plac");
if( cntc_plac == null){
	System.out.println(this.toString+" : cntc_plac is null" );
}else{
	System.out.println(this.toString+" : cntc_plac is "+cntc_plac );
}
String tm = req.getParameter("tm");
if( tm == null){
	System.out.println(this.toString+" : tm is null" );
}else{
	System.out.println(this.toString+" : tm is "+tm );
}
String sect_clsf = req.getParameter("sect_clsf");
if( sect_clsf == null){
	System.out.println(this.toString+" : sect_clsf is null" );
}else{
	System.out.println(this.toString+" : sect_clsf is "+sect_clsf );
}
String ext02 = req.getParameter("ext02");
if( ext02 == null){
	System.out.println(this.toString+" : ext02 is null" );
}else{
	System.out.println(this.toString+" : ext02 is "+ext02 );
}
String cnfm_matt = req.getParameter("cnfm_matt");
if( cnfm_matt == null){
	System.out.println(this.toString+" : cnfm_matt is null" );
}else{
	System.out.println(this.toString+" : cnfm_matt is "+cnfm_matt );
}
String org_preng_occr_dt = req.getParameter("org_preng_occr_dt");
if( org_preng_occr_dt == null){
	System.out.println(this.toString+" : org_preng_occr_dt is null" );
}else{
	System.out.println(this.toString+" : org_preng_occr_dt is "+org_preng_occr_dt );
}
String org_preng_occr_seq = req.getParameter("org_preng_occr_seq");
if( org_preng_occr_seq == null){
	System.out.println(this.toString+" : org_preng_occr_seq is null" );
}else{
	System.out.println(this.toString+" : org_preng_occr_seq is "+org_preng_occr_seq );
}
String nwsp_type_yn = req.getParameter("nwsp_type_yn");
if( nwsp_type_yn == null){
	System.out.println(this.toString+" : nwsp_type_yn is null" );
}else{
	System.out.println(this.toString+" : nwsp_type_yn is "+nwsp_type_yn );
}
String nwsp_side_type = req.getParameter("nwsp_side_type");
if( nwsp_side_type == null){
	System.out.println(this.toString+" : nwsp_side_type is null" );
}else{
	System.out.println(this.toString+" : nwsp_side_type is "+nwsp_side_type );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String pre_issu_yn = req.getParameter("pre_issu_yn");
if( pre_issu_yn == null){
	System.out.println(this.toString+" : pre_issu_yn is null" );
}else{
	System.out.println(this.toString+" : pre_issu_yn is "+pre_issu_yn );
}
String ast_pers = req.getParameter("ast_pers");
if( ast_pers == null){
	System.out.println(this.toString+" : ast_pers is null" );
}else{
	System.out.println(this.toString+" : ast_pers is "+ast_pers );
}
String pubc_frdt = req.getParameter("pubc_frdt");
if( pubc_frdt == null){
	System.out.println(this.toString+" : pubc_frdt is null" );
}else{
	System.out.println(this.toString+" : pubc_frdt is "+pubc_frdt );
}
String pubc_todt = req.getParameter("pubc_todt");
if( pubc_todt == null){
	System.out.println(this.toString+" : pubc_todt is null" );
}else{
	System.out.println(this.toString+" : pubc_todt is "+pubc_todt );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String bus_seq = req.getParameter("bus_seq");
if( bus_seq == null){
	System.out.println(this.toString+" : bus_seq is null" );
}else{
	System.out.println(this.toString+" : bus_seq is "+bus_seq );
}
String bus_plc = req.getParameter("bus_plc");
if( bus_plc == null){
	System.out.println(this.toString+" : bus_plc is null" );
}else{
	System.out.println(this.toString+" : bus_plc is "+bus_plc );
}
String bus_clsf = req.getParameter("bus_clsf");
if( bus_clsf == null){
	System.out.println(this.toString+" : bus_clsf is null" );
}else{
	System.out.println(this.toString+" : bus_clsf is "+bus_clsf );
}
String fee_vat = req.getParameter("fee_vat");
if( fee_vat == null){
	System.out.println(this.toString+" : fee_vat is null" );
}else{
	System.out.println(this.toString+" : fee_vat is "+fee_vat );
}
String coms_vat = req.getParameter("coms_vat");
if( coms_vat == null){
	System.out.println(this.toString+" : coms_vat is null" );
}else{
	System.out.println(this.toString+" : coms_vat is "+coms_vat );
}
String rcpm_yn = req.getParameter("rcpm_yn");
if( rcpm_yn == null){
	System.out.println(this.toString+" : rcpm_yn is null" );
}else{
	System.out.println(this.toString+" : rcpm_yn is "+rcpm_yn );
}
String unrcpm_yn = req.getParameter("unrcpm_yn");
if( unrcpm_yn == null){
	System.out.println(this.toString+" : unrcpm_yn is null" );
}else{
	System.out.println(this.toString+" : unrcpm_yn is "+unrcpm_yn );
}
String acct_num = req.getParameter("acct_num");
if( acct_num == null){
	System.out.println(this.toString+" : acct_num is null" );
}else{
	System.out.println(this.toString+" : acct_num is "+acct_num );
}
String tran_nm = req.getParameter("tran_nm");
if( tran_nm == null){
	System.out.println(this.toString+" : tran_nm is null" );
}else{
	System.out.println(this.toString+" : tran_nm is "+tran_nm );
}
String tran_amt = req.getParameter("tran_amt");
if( tran_amt == null){
	System.out.println(this.toString+" : tran_amt is null" );
}else{
	System.out.println(this.toString+" : tran_amt is "+tran_amt );
}
String tran_dt = req.getParameter("tran_dt");
if( tran_dt == null){
	System.out.println(this.toString+" : tran_dt is null" );
}else{
	System.out.println(this.toString+" : tran_dt is "+tran_dt );
}
String tran_schd_dt = req.getParameter("tran_schd_dt");
if( tran_schd_dt == null){
	System.out.println(this.toString+" : tran_schd_dt is null" );
}else{
	System.out.println(this.toString+" : tran_schd_dt is "+tran_schd_dt );
}
String advt_emp_nm = req.getParameter("advt_emp_nm");
if( advt_emp_nm == null){
	System.out.println(this.toString+" : advt_emp_nm is null" );
}else{
	System.out.println(this.toString+" : advt_emp_nm is "+advt_emp_nm );
}
String advt_email = req.getParameter("advt_email");
if( advt_email == null){
	System.out.println(this.toString+" : advt_email is null" );
}else{
	System.out.println(this.toString+" : advt_email is "+advt_email );
}
String advt_telno = req.getParameter("advt_telno");
if( advt_telno == null){
	System.out.println(this.toString+" : advt_telno is null" );
}else{
	System.out.println(this.toString+" : advt_telno is "+advt_telno );
}
String pragn_yn = req.getParameter("pragn_yn");
if( pragn_yn == null){
	System.out.println(this.toString+" : pragn_yn is null" );
}else{
	System.out.println(this.toString+" : pragn_yn is "+pragn_yn );
}
String dtls_medi_cd = req.getParameter("dtls_medi_cd");
if( dtls_medi_cd == null){
	System.out.println(this.toString+" : dtls_medi_cd is null" );
}else{
	System.out.println(this.toString+" : dtls_medi_cd is "+dtls_medi_cd );
}
String emode = req.getParameter("emode");
if( emode == null){
	System.out.println(this.toString+" : emode is null" );
}else{
	System.out.println(this.toString+" : emode is "+emode );
}
String eseq = req.getParameter("eseq");
if( eseq == null){
	System.out.println(this.toString+" : eseq is null" );
}else{
	System.out.println(this.toString+" : eseq is "+eseq );
}
String evnt_nm = req.getParameter("evnt_nm");
if( evnt_nm == null){
	System.out.println(this.toString+" : evnt_nm is null" );
}else{
	System.out.println(this.toString+" : evnt_nm is "+evnt_nm );
}
String eamt = req.getParameter("eamt");
if( eamt == null){
	System.out.println(this.toString+" : eamt is null" );
}else{
	System.out.println(this.toString+" : eamt is "+eamt );
}
String evat = req.getParameter("evat");
if( evat == null){
	System.out.println(this.toString+" : evat is null" );
}else{
	System.out.println(this.toString+" : evat is "+evat );
}
String etot_amt = req.getParameter("etot_amt");
if( etot_amt == null){
	System.out.println(this.toString+" : etot_amt is null" );
}else{
	System.out.println(this.toString+" : etot_amt is "+etot_amt );
}
String efee = req.getParameter("efee");
if( efee == null){
	System.out.println(this.toString+" : efee is null" );
}else{
	System.out.println(this.toString+" : efee is "+efee );
}
String efee_vat = req.getParameter("efee_vat");
if( efee_vat == null){
	System.out.println(this.toString+" : efee_vat is null" );
}else{
	System.out.println(this.toString+" : efee_vat is "+efee_vat );
}
String etot_fee = req.getParameter("etot_fee");
if( etot_fee == null){
	System.out.println(this.toString+" : etot_fee is null" );
}else{
	System.out.println(this.toString+" : etot_fee is "+etot_fee );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String flag = Util.checkString(req.getParameter("flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String preng_occr_dt = Util.checkString(req.getParameter("preng_occr_dt"));
String preng_occr_seq = Util.checkString(req.getParameter("preng_occr_seq"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String sect_cd = Util.checkString(req.getParameter("sect_cd"));
String sect_seq = Util.checkString(req.getParameter("sect_seq"));
String cm = Util.checkString(req.getParameter("cm"));
String dn = Util.checkString(req.getParameter("dn"));
String chro_clsf = Util.checkString(req.getParameter("chro_clsf"));
String uprc = Util.checkString(req.getParameter("uprc"));
String advt_fee = Util.checkString(req.getParameter("advt_fee"));
String vat = Util.checkString(req.getParameter("vat"));
String pubc_tot_amt = Util.checkString(req.getParameter("pubc_tot_amt"));
String pubc_side = Util.checkString(req.getParameter("pubc_side"));
String rtax_yn = Util.checkString(req.getParameter("rtax_yn"));
String tabl_yn = Util.checkString(req.getParameter("tabl_yn"));
String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
String agn = Util.checkString(req.getParameter("agn"));
String fee_rate = Util.checkString(req.getParameter("fee_rate"));
String fee = Util.checkString(req.getParameter("fee"));
String hndl_plac_cd = Util.checkString(req.getParameter("hndl_plac_cd"));
String coms_rate = Util.checkString(req.getParameter("coms_rate"));
String coms = Util.checkString(req.getParameter("coms"));
String advt_clas = Util.checkString(req.getParameter("advt_clas"));
String indt_clsf = Util.checkString(req.getParameter("indt_clsf"));
String indt_clsf_nm = Util.checkString(req.getParameter("indt_clsf_nm"));
String mony_kind = Util.checkString(req.getParameter("mony_kind"));
String type_clsf = Util.checkString(req.getParameter("type_clsf"));
String type_clsf_nm = Util.checkString(req.getParameter("type_clsf_nm"));
String exrate = Util.checkString(req.getParameter("exrate"));
String pubc_clsf = Util.checkString(req.getParameter("pubc_clsf"));
String grp_cmpy_cd = Util.checkString(req.getParameter("grp_cmpy_cd"));
String frex_cntr_amt = Util.checkString(req.getParameter("frex_cntr_amt"));
String edt_clsf = Util.checkString(req.getParameter("edt_clsf"));
String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
String advt_cont = Util.checkString(req.getParameter("advt_cont"));
String remk = Util.checkString(req.getParameter("remk"));
String ext01 = Util.checkString(req.getParameter("ext01"));
String srch_dt = Util.checkString(req.getParameter("srch_dt"));
String srch_plac = Util.checkString(req.getParameter("srch_plac"));
String cntc_plac = Util.checkString(req.getParameter("cntc_plac"));
String tm = Util.checkString(req.getParameter("tm"));
String sect_clsf = Util.checkString(req.getParameter("sect_clsf"));
String ext02 = Util.checkString(req.getParameter("ext02"));
String cnfm_matt = Util.checkString(req.getParameter("cnfm_matt"));
String org_preng_occr_dt = Util.checkString(req.getParameter("org_preng_occr_dt"));
String org_preng_occr_seq = Util.checkString(req.getParameter("org_preng_occr_seq"));
String nwsp_type_yn = Util.checkString(req.getParameter("nwsp_type_yn"));
String nwsp_side_type = Util.checkString(req.getParameter("nwsp_side_type"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String pre_issu_yn = Util.checkString(req.getParameter("pre_issu_yn"));
String ast_pers = Util.checkString(req.getParameter("ast_pers"));
String pubc_frdt = Util.checkString(req.getParameter("pubc_frdt"));
String pubc_todt = Util.checkString(req.getParameter("pubc_todt"));
String mode = Util.checkString(req.getParameter("mode"));
String bus_seq = Util.checkString(req.getParameter("bus_seq"));
String bus_plc = Util.checkString(req.getParameter("bus_plc"));
String bus_clsf = Util.checkString(req.getParameter("bus_clsf"));
String fee_vat = Util.checkString(req.getParameter("fee_vat"));
String coms_vat = Util.checkString(req.getParameter("coms_vat"));
String rcpm_yn = Util.checkString(req.getParameter("rcpm_yn"));
String unrcpm_yn = Util.checkString(req.getParameter("unrcpm_yn"));
String acct_num = Util.checkString(req.getParameter("acct_num"));
String tran_nm = Util.checkString(req.getParameter("tran_nm"));
String tran_amt = Util.checkString(req.getParameter("tran_amt"));
String tran_dt = Util.checkString(req.getParameter("tran_dt"));
String tran_schd_dt = Util.checkString(req.getParameter("tran_schd_dt"));
String advt_emp_nm = Util.checkString(req.getParameter("advt_emp_nm"));
String advt_email = Util.checkString(req.getParameter("advt_email"));
String advt_telno = Util.checkString(req.getParameter("advt_telno"));
String pragn_yn = Util.checkString(req.getParameter("pragn_yn"));
String dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
String emode = Util.checkString(req.getParameter("emode"));
String eseq = Util.checkString(req.getParameter("eseq"));
String evnt_nm = Util.checkString(req.getParameter("evnt_nm"));
String eamt = Util.checkString(req.getParameter("eamt"));
String evat = Util.checkString(req.getParameter("evat"));
String etot_amt = Util.checkString(req.getParameter("etot_amt"));
String efee = Util.checkString(req.getParameter("efee"));
String efee_vat = Util.checkString(req.getParameter("efee_vat"));
String etot_fee = Util.checkString(req.getParameter("etot_fee"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String preng_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_occr_dt")));
String preng_occr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_occr_seq")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String sect_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd")));
String sect_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_seq")));
String cm = Util.Uni2Ksc(Util.checkString(req.getParameter("cm")));
String dn = Util.Uni2Ksc(Util.checkString(req.getParameter("dn")));
String chro_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("chro_clsf")));
String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));
String advt_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_fee")));
String vat = Util.Uni2Ksc(Util.checkString(req.getParameter("vat")));
String pubc_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_tot_amt")));
String pubc_side = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_side")));
String rtax_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("rtax_yn")));
String tabl_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("tabl_yn")));
String hndl_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("hndl_clsf")));
String agn = Util.Uni2Ksc(Util.checkString(req.getParameter("agn")));
String fee_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("fee_rate")));
String fee = Util.Uni2Ksc(Util.checkString(req.getParameter("fee")));
String hndl_plac_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("hndl_plac_cd")));
String coms_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("coms_rate")));
String coms = Util.Uni2Ksc(Util.checkString(req.getParameter("coms")));
String advt_clas = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_clas")));
String indt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("indt_clsf")));
String indt_clsf_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("indt_clsf_nm")));
String mony_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("mony_kind")));
String type_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("type_clsf")));
String type_clsf_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("type_clsf_nm")));
String exrate = Util.Uni2Ksc(Util.checkString(req.getParameter("exrate")));
String pubc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_clsf")));
String grp_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("grp_cmpy_cd")));
String frex_cntr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("frex_cntr_amt")));
String edt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("edt_clsf")));
String slcrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String mchrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("mchrg_pers")));
String advt_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_cont")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String ext01 = Util.Uni2Ksc(Util.checkString(req.getParameter("ext01")));
String srch_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_dt")));
String srch_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_plac")));
String cntc_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("cntc_plac")));
String tm = Util.Uni2Ksc(Util.checkString(req.getParameter("tm")));
String sect_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_clsf")));
String ext02 = Util.Uni2Ksc(Util.checkString(req.getParameter("ext02")));
String cnfm_matt = Util.Uni2Ksc(Util.checkString(req.getParameter("cnfm_matt")));
String org_preng_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("org_preng_occr_dt")));
String org_preng_occr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("org_preng_occr_seq")));
String nwsp_type_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("nwsp_type_yn")));
String nwsp_side_type = Util.Uni2Ksc(Util.checkString(req.getParameter("nwsp_side_type")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String pre_issu_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("pre_issu_yn")));
String ast_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("ast_pers")));
String pubc_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_frdt")));
String pubc_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_todt")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String bus_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("bus_seq")));
String bus_plc = Util.Uni2Ksc(Util.checkString(req.getParameter("bus_plc")));
String bus_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("bus_clsf")));
String fee_vat = Util.Uni2Ksc(Util.checkString(req.getParameter("fee_vat")));
String coms_vat = Util.Uni2Ksc(Util.checkString(req.getParameter("coms_vat")));
String rcpm_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_yn")));
String unrcpm_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("unrcpm_yn")));
String acct_num = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_num")));
String tran_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_nm")));
String tran_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_amt")));
String tran_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_dt")));
String tran_schd_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_schd_dt")));
String advt_emp_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_emp_nm")));
String advt_email = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_email")));
String advt_telno = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_telno")));
String pragn_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("pragn_yn")));
String dtls_medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_medi_cd")));
String emode = Util.Uni2Ksc(Util.checkString(req.getParameter("emode")));
String eseq = Util.Uni2Ksc(Util.checkString(req.getParameter("eseq")));
String evnt_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_nm")));
String eamt = Util.Uni2Ksc(Util.checkString(req.getParameter("eamt")));
String evat = Util.Uni2Ksc(Util.checkString(req.getParameter("evat")));
String etot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("etot_amt")));
String efee = Util.Uni2Ksc(Util.checkString(req.getParameter("efee")));
String efee_vat = Util.Uni2Ksc(Util.checkString(req.getParameter("efee_vat")));
String etot_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("etot_fee")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setPreng_occr_dt(preng_occr_dt);
dm.setPreng_occr_seq(preng_occr_seq);
dm.setDlco_no(dlco_no);
dm.setSect_cd(sect_cd);
dm.setSect_seq(sect_seq);
dm.setCm(cm);
dm.setDn(dn);
dm.setChro_clsf(chro_clsf);
dm.setUprc(uprc);
dm.setAdvt_fee(advt_fee);
dm.setVat(vat);
dm.setPubc_tot_amt(pubc_tot_amt);
dm.setPubc_side(pubc_side);
dm.setRtax_yn(rtax_yn);
dm.setTabl_yn(tabl_yn);
dm.setHndl_clsf(hndl_clsf);
dm.setAgn(agn);
dm.setFee_rate(fee_rate);
dm.setFee(fee);
dm.setHndl_plac_cd(hndl_plac_cd);
dm.setComs_rate(coms_rate);
dm.setComs(coms);
dm.setAdvt_clas(advt_clas);
dm.setIndt_clsf(indt_clsf);
dm.setIndt_clsf_nm(indt_clsf_nm);
dm.setMony_kind(mony_kind);
dm.setType_clsf(type_clsf);
dm.setType_clsf_nm(type_clsf_nm);
dm.setExrate(exrate);
dm.setPubc_clsf(pubc_clsf);
dm.setGrp_cmpy_cd(grp_cmpy_cd);
dm.setFrex_cntr_amt(frex_cntr_amt);
dm.setEdt_clsf(edt_clsf);
dm.setSlcrg_pers(slcrg_pers);
dm.setDept_cd(dept_cd);
dm.setMchrg_pers(mchrg_pers);
dm.setAdvt_cont(advt_cont);
dm.setRemk(remk);
dm.setExt01(ext01);
dm.setSrch_dt(srch_dt);
dm.setSrch_plac(srch_plac);
dm.setCntc_plac(cntc_plac);
dm.setTm(tm);
dm.setSect_clsf(sect_clsf);
dm.setExt02(ext02);
dm.setCnfm_matt(cnfm_matt);
dm.setOrg_preng_occr_dt(org_preng_occr_dt);
dm.setOrg_preng_occr_seq(org_preng_occr_seq);
dm.setNwsp_type_yn(nwsp_type_yn);
dm.setNwsp_side_type(nwsp_side_type);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setPre_issu_yn(pre_issu_yn);
dm.setAst_pers(ast_pers);
dm.setPubc_frdt(pubc_frdt);
dm.setPubc_todt(pubc_todt);
dm.setMode(mode);
dm.setBus_seq(bus_seq);
dm.setBus_plc(bus_plc);
dm.setBus_clsf(bus_clsf);
dm.setFee_vat(fee_vat);
dm.setComs_vat(coms_vat);
dm.setRcpm_yn(rcpm_yn);
dm.setUnrcpm_yn(unrcpm_yn);
dm.setAcct_num(acct_num);
dm.setTran_nm(tran_nm);
dm.setTran_amt(tran_amt);
dm.setTran_dt(tran_dt);
dm.setTran_schd_dt(tran_schd_dt);
dm.setAdvt_emp_nm(advt_emp_nm);
dm.setAdvt_email(advt_email);
dm.setAdvt_telno(advt_telno);
dm.setPragn_yn(pragn_yn);
dm.setDtls_medi_cd(dtls_medi_cd);
dm.setEmode(emode);
dm.setEseq(eseq);
dm.setEvnt_nm(evnt_nm);
dm.setEamt(eamt);
dm.setEvat(evat);
dm.setEtot_amt(etot_amt);
dm.setEfee(efee);
dm.setEfee_vat(efee_vat);
dm.setEtot_fee(etot_fee);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 21 16:02:35 KST 2017 */