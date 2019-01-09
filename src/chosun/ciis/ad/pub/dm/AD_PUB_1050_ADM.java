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


package chosun.ciis.ad.pub.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.ds.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_1050_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String medi_cd;
	public String proc_dt;
	public String pubc_occr_seq;
	public String pubc_occr_dt;
	public String hndl_clsf;
	public String dlco_no;
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
	public String fee_rate;
	public String fee;
	public String hndl_plac_cd;
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
	public String dept_cd;
	public String mchrg_pers;
	public String rtax_yn;
	public String upd_resn;
	public String govern_advt_yn;
	public String upd_cont;
	public String tabl_yn;
	public String remk;
	public String pubc_dt;
	public String pre_pubc_slip_no;
	public String pubc_side;
	public String std_clsf;
	public String pubc_prd;
	public String pubc_frdt;
	public String pubc_todt;
	public String hp_edt_clsf;
	public String brdg_advt_yn;
	public String nwsp_advt_yn;
	public String nwsp_side_type;
	public String dtls_medi_cd;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String preng_occr_dt;
	public String preng_occr_seq;
	public String pre_issu_yn;
	public String pre_day_issu;
	public String mode;
	public String bus_seq;
	public String bus_plc;
	public String bus_clsf;
	public String ast_pers;
	public String fee_vat;
	public String coms_vat;
	public String emode;
	public String eseq;
	public String evnt_nm;
	public String eamt;
	public String evat;
	public String etot_amt;
	public String efee;
	public String efee_vat;
	public String etot_fee;
	public String pragn_yn;

	public AD_PUB_1050_ADM(){}
	public AD_PUB_1050_ADM(String flag, String cmpy_cd, String medi_cd, String proc_dt, String pubc_occr_seq, String pubc_occr_dt, String hndl_clsf, String dlco_no, String advt_cont, String sect_cd, String sect_seq, String cm, String dn, String uprc, String advt_fee, String vat, String pubc_tot_amt, String agn, String fee_rate, String fee, String hndl_plac_cd, String coms_rate, String coms, String advt_clas, String indt_clsf, String indt_clsf_nm, String mony_kind, String chro_clsf, String type_clsf, String type_clsf_nm, String exrate, String pubc_clsf, String appndx_clsf, String frex_cntr_amt, String edt_clsf, String grp_cmpy_cd, String slcrg_pers, String dept_cd, String mchrg_pers, String rtax_yn, String upd_resn, String govern_advt_yn, String upd_cont, String tabl_yn, String remk, String pubc_dt, String pre_pubc_slip_no, String pubc_side, String std_clsf, String pubc_prd, String pubc_frdt, String pubc_todt, String hp_edt_clsf, String brdg_advt_yn, String nwsp_advt_yn, String nwsp_side_type, String dtls_medi_cd, String incmg_pers_ip, String incmg_pers, String preng_occr_dt, String preng_occr_seq, String pre_issu_yn, String pre_day_issu, String mode, String bus_seq, String bus_plc, String bus_clsf, String ast_pers, String fee_vat, String coms_vat, String emode, String eseq, String evnt_nm, String eamt, String evat, String etot_amt, String efee, String efee_vat, String etot_fee, String pragn_yn){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.proc_dt = proc_dt;
		this.pubc_occr_seq = pubc_occr_seq;
		this.pubc_occr_dt = pubc_occr_dt;
		this.hndl_clsf = hndl_clsf;
		this.dlco_no = dlco_no;
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
		this.fee_rate = fee_rate;
		this.fee = fee;
		this.hndl_plac_cd = hndl_plac_cd;
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
		this.dept_cd = dept_cd;
		this.mchrg_pers = mchrg_pers;
		this.rtax_yn = rtax_yn;
		this.upd_resn = upd_resn;
		this.govern_advt_yn = govern_advt_yn;
		this.upd_cont = upd_cont;
		this.tabl_yn = tabl_yn;
		this.remk = remk;
		this.pubc_dt = pubc_dt;
		this.pre_pubc_slip_no = pre_pubc_slip_no;
		this.pubc_side = pubc_side;
		this.std_clsf = std_clsf;
		this.pubc_prd = pubc_prd;
		this.pubc_frdt = pubc_frdt;
		this.pubc_todt = pubc_todt;
		this.hp_edt_clsf = hp_edt_clsf;
		this.brdg_advt_yn = brdg_advt_yn;
		this.nwsp_advt_yn = nwsp_advt_yn;
		this.nwsp_side_type = nwsp_side_type;
		this.dtls_medi_cd = dtls_medi_cd;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.preng_occr_dt = preng_occr_dt;
		this.preng_occr_seq = preng_occr_seq;
		this.pre_issu_yn = pre_issu_yn;
		this.pre_day_issu = pre_day_issu;
		this.mode = mode;
		this.bus_seq = bus_seq;
		this.bus_plc = bus_plc;
		this.bus_clsf = bus_clsf;
		this.ast_pers = ast_pers;
		this.fee_vat = fee_vat;
		this.coms_vat = coms_vat;
		this.emode = emode;
		this.eseq = eseq;
		this.evnt_nm = evnt_nm;
		this.eamt = eamt;
		this.evat = evat;
		this.etot_amt = etot_amt;
		this.efee = efee;
		this.efee_vat = efee_vat;
		this.etot_fee = etot_fee;
		this.pragn_yn = pragn_yn;
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

	public void setProc_dt(String proc_dt){
		this.proc_dt = proc_dt;
	}

	public void setPubc_occr_seq(String pubc_occr_seq){
		this.pubc_occr_seq = pubc_occr_seq;
	}

	public void setPubc_occr_dt(String pubc_occr_dt){
		this.pubc_occr_dt = pubc_occr_dt;
	}

	public void setHndl_clsf(String hndl_clsf){
		this.hndl_clsf = hndl_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
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

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
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

	public void setNwsp_advt_yn(String nwsp_advt_yn){
		this.nwsp_advt_yn = nwsp_advt_yn;
	}

	public void setNwsp_side_type(String nwsp_side_type){
		this.nwsp_side_type = nwsp_side_type;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setPreng_occr_dt(String preng_occr_dt){
		this.preng_occr_dt = preng_occr_dt;
	}

	public void setPreng_occr_seq(String preng_occr_seq){
		this.preng_occr_seq = preng_occr_seq;
	}

	public void setPre_issu_yn(String pre_issu_yn){
		this.pre_issu_yn = pre_issu_yn;
	}

	public void setPre_day_issu(String pre_day_issu){
		this.pre_day_issu = pre_day_issu;
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

	public void setAst_pers(String ast_pers){
		this.ast_pers = ast_pers;
	}

	public void setFee_vat(String fee_vat){
		this.fee_vat = fee_vat;
	}

	public void setComs_vat(String coms_vat){
		this.coms_vat = coms_vat;
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

	public void setPragn_yn(String pragn_yn){
		this.pragn_yn = pragn_yn;
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

	public String getProc_dt(){
		return this.proc_dt;
	}

	public String getPubc_occr_seq(){
		return this.pubc_occr_seq;
	}

	public String getPubc_occr_dt(){
		return this.pubc_occr_dt;
	}

	public String getHndl_clsf(){
		return this.hndl_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
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

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
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

	public String getNwsp_advt_yn(){
		return this.nwsp_advt_yn;
	}

	public String getNwsp_side_type(){
		return this.nwsp_side_type;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getPreng_occr_dt(){
		return this.preng_occr_dt;
	}

	public String getPreng_occr_seq(){
		return this.preng_occr_seq;
	}

	public String getPre_issu_yn(){
		return this.pre_issu_yn;
	}

	public String getPre_day_issu(){
		return this.pre_day_issu;
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

	public String getAst_pers(){
		return this.ast_pers;
	}

	public String getFee_vat(){
		return this.fee_vat;
	}

	public String getComs_vat(){
		return this.coms_vat;
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

	public String getPragn_yn(){
		return this.pragn_yn;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_PUB_1050_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_1050_ADM dm = (AD_PUB_1050_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.medi_cd);
		cstmt.setString(6, dm.proc_dt);
		cstmt.setString(7, dm.pubc_occr_seq);
		cstmt.setString(8, dm.pubc_occr_dt);
		cstmt.setString(9, dm.hndl_clsf);
		cstmt.setString(10, dm.dlco_no);
		cstmt.setString(11, dm.advt_cont);
		cstmt.setString(12, dm.sect_cd);
		cstmt.setString(13, dm.sect_seq);
		cstmt.setString(14, dm.cm);
		cstmt.setString(15, dm.dn);
		cstmt.setString(16, dm.uprc);
		cstmt.setString(17, dm.advt_fee);
		cstmt.setString(18, dm.vat);
		cstmt.setString(19, dm.pubc_tot_amt);
		cstmt.setString(20, dm.agn);
		cstmt.setString(21, dm.fee_rate);
		cstmt.setString(22, dm.fee);
		cstmt.setString(23, dm.hndl_plac_cd);
		cstmt.setString(24, dm.coms_rate);
		cstmt.setString(25, dm.coms);
		cstmt.setString(26, dm.advt_clas);
		cstmt.setString(27, dm.indt_clsf);
		cstmt.setString(28, dm.indt_clsf_nm);
		cstmt.setString(29, dm.mony_kind);
		cstmt.setString(30, dm.chro_clsf);
		cstmt.setString(31, dm.type_clsf);
		cstmt.setString(32, dm.type_clsf_nm);
		cstmt.setString(33, dm.exrate);
		cstmt.setString(34, dm.pubc_clsf);
		cstmt.setString(35, dm.appndx_clsf);
		cstmt.setString(36, dm.frex_cntr_amt);
		cstmt.setString(37, dm.edt_clsf);
		cstmt.setString(38, dm.grp_cmpy_cd);
		cstmt.setString(39, dm.slcrg_pers);
		cstmt.setString(40, dm.dept_cd);
		cstmt.setString(41, dm.mchrg_pers);
		cstmt.setString(42, dm.rtax_yn);
		cstmt.setString(43, dm.upd_resn);
		cstmt.setString(44, dm.govern_advt_yn);
		cstmt.setString(45, dm.upd_cont);
		cstmt.setString(46, dm.tabl_yn);
		cstmt.setString(47, dm.remk);
		cstmt.setString(48, dm.pubc_dt);
		cstmt.setString(49, dm.pre_pubc_slip_no);
		cstmt.setString(50, dm.pubc_side);
		cstmt.setString(51, dm.std_clsf);
		cstmt.setString(52, dm.pubc_prd);
		cstmt.setString(53, dm.pubc_frdt);
		cstmt.setString(54, dm.pubc_todt);
		cstmt.setString(55, dm.hp_edt_clsf);
		cstmt.setString(56, dm.brdg_advt_yn);
		cstmt.setString(57, dm.nwsp_advt_yn);
		cstmt.setString(58, dm.nwsp_side_type);
		cstmt.setString(59, dm.dtls_medi_cd);
		cstmt.setString(60, dm.incmg_pers_ip);
		cstmt.setString(61, dm.incmg_pers);
		cstmt.setString(62, dm.preng_occr_dt);
		cstmt.setString(63, dm.preng_occr_seq);
		cstmt.setString(64, dm.pre_issu_yn);
		cstmt.setString(65, dm.pre_day_issu);
		cstmt.setString(66, dm.mode);
		cstmt.setString(67, dm.bus_seq);
		cstmt.setString(68, dm.bus_plc);
		cstmt.setString(69, dm.bus_clsf);
		cstmt.setString(70, dm.ast_pers);
		cstmt.setString(71, dm.fee_vat);
		cstmt.setString(72, dm.coms_vat);
		cstmt.setString(73, dm.emode);
		cstmt.setString(74, dm.eseq);
		cstmt.setString(75, dm.evnt_nm);
		cstmt.setString(76, dm.eamt);
		cstmt.setString(77, dm.evat);
		cstmt.setString(78, dm.etot_amt);
		cstmt.setString(79, dm.efee);
		cstmt.setString(80, dm.efee_vat);
		cstmt.setString(81, dm.etot_fee);
		cstmt.setString(82, dm.pragn_yn);
		cstmt.registerOutParameter(83, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_1050_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("proc_dt = [" + getProc_dt() + "]");
		System.out.println("pubc_occr_seq = [" + getPubc_occr_seq() + "]");
		System.out.println("pubc_occr_dt = [" + getPubc_occr_dt() + "]");
		System.out.println("hndl_clsf = [" + getHndl_clsf() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("advt_cont = [" + getAdvt_cont() + "]");
		System.out.println("sect_cd = [" + getSect_cd() + "]");
		System.out.println("sect_seq = [" + getSect_seq() + "]");
		System.out.println("cm = [" + getCm() + "]");
		System.out.println("dn = [" + getDn() + "]");
		System.out.println("uprc = [" + getUprc() + "]");
		System.out.println("advt_fee = [" + getAdvt_fee() + "]");
		System.out.println("vat = [" + getVat() + "]");
		System.out.println("pubc_tot_amt = [" + getPubc_tot_amt() + "]");
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
		System.out.println("chro_clsf = [" + getChro_clsf() + "]");
		System.out.println("type_clsf = [" + getType_clsf() + "]");
		System.out.println("type_clsf_nm = [" + getType_clsf_nm() + "]");
		System.out.println("exrate = [" + getExrate() + "]");
		System.out.println("pubc_clsf = [" + getPubc_clsf() + "]");
		System.out.println("appndx_clsf = [" + getAppndx_clsf() + "]");
		System.out.println("frex_cntr_amt = [" + getFrex_cntr_amt() + "]");
		System.out.println("edt_clsf = [" + getEdt_clsf() + "]");
		System.out.println("grp_cmpy_cd = [" + getGrp_cmpy_cd() + "]");
		System.out.println("slcrg_pers = [" + getSlcrg_pers() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("mchrg_pers = [" + getMchrg_pers() + "]");
		System.out.println("rtax_yn = [" + getRtax_yn() + "]");
		System.out.println("upd_resn = [" + getUpd_resn() + "]");
		System.out.println("govern_advt_yn = [" + getGovern_advt_yn() + "]");
		System.out.println("upd_cont = [" + getUpd_cont() + "]");
		System.out.println("tabl_yn = [" + getTabl_yn() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("pubc_dt = [" + getPubc_dt() + "]");
		System.out.println("pre_pubc_slip_no = [" + getPre_pubc_slip_no() + "]");
		System.out.println("pubc_side = [" + getPubc_side() + "]");
		System.out.println("std_clsf = [" + getStd_clsf() + "]");
		System.out.println("pubc_prd = [" + getPubc_prd() + "]");
		System.out.println("pubc_frdt = [" + getPubc_frdt() + "]");
		System.out.println("pubc_todt = [" + getPubc_todt() + "]");
		System.out.println("hp_edt_clsf = [" + getHp_edt_clsf() + "]");
		System.out.println("brdg_advt_yn = [" + getBrdg_advt_yn() + "]");
		System.out.println("nwsp_advt_yn = [" + getNwsp_advt_yn() + "]");
		System.out.println("nwsp_side_type = [" + getNwsp_side_type() + "]");
		System.out.println("dtls_medi_cd = [" + getDtls_medi_cd() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("preng_occr_dt = [" + getPreng_occr_dt() + "]");
		System.out.println("preng_occr_seq = [" + getPreng_occr_seq() + "]");
		System.out.println("pre_issu_yn = [" + getPre_issu_yn() + "]");
		System.out.println("pre_day_issu = [" + getPre_day_issu() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("bus_seq = [" + getBus_seq() + "]");
		System.out.println("bus_plc = [" + getBus_plc() + "]");
		System.out.println("bus_clsf = [" + getBus_clsf() + "]");
		System.out.println("ast_pers = [" + getAst_pers() + "]");
		System.out.println("fee_vat = [" + getFee_vat() + "]");
		System.out.println("coms_vat = [" + getComs_vat() + "]");
		System.out.println("emode = [" + getEmode() + "]");
		System.out.println("eseq = [" + getEseq() + "]");
		System.out.println("evnt_nm = [" + getEvnt_nm() + "]");
		System.out.println("eamt = [" + getEamt() + "]");
		System.out.println("evat = [" + getEvat() + "]");
		System.out.println("etot_amt = [" + getEtot_amt() + "]");
		System.out.println("efee = [" + getEfee() + "]");
		System.out.println("efee_vat = [" + getEfee_vat() + "]");
		System.out.println("etot_fee = [" + getEtot_fee() + "]");
		System.out.println("pragn_yn = [" + getPragn_yn() + "]");
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
String proc_dt = req.getParameter("proc_dt");
if( proc_dt == null){
	System.out.println(this.toString+" : proc_dt is null" );
}else{
	System.out.println(this.toString+" : proc_dt is "+proc_dt );
}
String pubc_occr_seq = req.getParameter("pubc_occr_seq");
if( pubc_occr_seq == null){
	System.out.println(this.toString+" : pubc_occr_seq is null" );
}else{
	System.out.println(this.toString+" : pubc_occr_seq is "+pubc_occr_seq );
}
String pubc_occr_dt = req.getParameter("pubc_occr_dt");
if( pubc_occr_dt == null){
	System.out.println(this.toString+" : pubc_occr_dt is null" );
}else{
	System.out.println(this.toString+" : pubc_occr_dt is "+pubc_occr_dt );
}
String hndl_clsf = req.getParameter("hndl_clsf");
if( hndl_clsf == null){
	System.out.println(this.toString+" : hndl_clsf is null" );
}else{
	System.out.println(this.toString+" : hndl_clsf is "+hndl_clsf );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String advt_cont = req.getParameter("advt_cont");
if( advt_cont == null){
	System.out.println(this.toString+" : advt_cont is null" );
}else{
	System.out.println(this.toString+" : advt_cont is "+advt_cont );
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
String chro_clsf = req.getParameter("chro_clsf");
if( chro_clsf == null){
	System.out.println(this.toString+" : chro_clsf is null" );
}else{
	System.out.println(this.toString+" : chro_clsf is "+chro_clsf );
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
String appndx_clsf = req.getParameter("appndx_clsf");
if( appndx_clsf == null){
	System.out.println(this.toString+" : appndx_clsf is null" );
}else{
	System.out.println(this.toString+" : appndx_clsf is "+appndx_clsf );
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
String grp_cmpy_cd = req.getParameter("grp_cmpy_cd");
if( grp_cmpy_cd == null){
	System.out.println(this.toString+" : grp_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : grp_cmpy_cd is "+grp_cmpy_cd );
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
String rtax_yn = req.getParameter("rtax_yn");
if( rtax_yn == null){
	System.out.println(this.toString+" : rtax_yn is null" );
}else{
	System.out.println(this.toString+" : rtax_yn is "+rtax_yn );
}
String upd_resn = req.getParameter("upd_resn");
if( upd_resn == null){
	System.out.println(this.toString+" : upd_resn is null" );
}else{
	System.out.println(this.toString+" : upd_resn is "+upd_resn );
}
String govern_advt_yn = req.getParameter("govern_advt_yn");
if( govern_advt_yn == null){
	System.out.println(this.toString+" : govern_advt_yn is null" );
}else{
	System.out.println(this.toString+" : govern_advt_yn is "+govern_advt_yn );
}
String upd_cont = req.getParameter("upd_cont");
if( upd_cont == null){
	System.out.println(this.toString+" : upd_cont is null" );
}else{
	System.out.println(this.toString+" : upd_cont is "+upd_cont );
}
String tabl_yn = req.getParameter("tabl_yn");
if( tabl_yn == null){
	System.out.println(this.toString+" : tabl_yn is null" );
}else{
	System.out.println(this.toString+" : tabl_yn is "+tabl_yn );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String pubc_dt = req.getParameter("pubc_dt");
if( pubc_dt == null){
	System.out.println(this.toString+" : pubc_dt is null" );
}else{
	System.out.println(this.toString+" : pubc_dt is "+pubc_dt );
}
String pre_pubc_slip_no = req.getParameter("pre_pubc_slip_no");
if( pre_pubc_slip_no == null){
	System.out.println(this.toString+" : pre_pubc_slip_no is null" );
}else{
	System.out.println(this.toString+" : pre_pubc_slip_no is "+pre_pubc_slip_no );
}
String pubc_side = req.getParameter("pubc_side");
if( pubc_side == null){
	System.out.println(this.toString+" : pubc_side is null" );
}else{
	System.out.println(this.toString+" : pubc_side is "+pubc_side );
}
String std_clsf = req.getParameter("std_clsf");
if( std_clsf == null){
	System.out.println(this.toString+" : std_clsf is null" );
}else{
	System.out.println(this.toString+" : std_clsf is "+std_clsf );
}
String pubc_prd = req.getParameter("pubc_prd");
if( pubc_prd == null){
	System.out.println(this.toString+" : pubc_prd is null" );
}else{
	System.out.println(this.toString+" : pubc_prd is "+pubc_prd );
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
String hp_edt_clsf = req.getParameter("hp_edt_clsf");
if( hp_edt_clsf == null){
	System.out.println(this.toString+" : hp_edt_clsf is null" );
}else{
	System.out.println(this.toString+" : hp_edt_clsf is "+hp_edt_clsf );
}
String brdg_advt_yn = req.getParameter("brdg_advt_yn");
if( brdg_advt_yn == null){
	System.out.println(this.toString+" : brdg_advt_yn is null" );
}else{
	System.out.println(this.toString+" : brdg_advt_yn is "+brdg_advt_yn );
}
String nwsp_advt_yn = req.getParameter("nwsp_advt_yn");
if( nwsp_advt_yn == null){
	System.out.println(this.toString+" : nwsp_advt_yn is null" );
}else{
	System.out.println(this.toString+" : nwsp_advt_yn is "+nwsp_advt_yn );
}
String nwsp_side_type = req.getParameter("nwsp_side_type");
if( nwsp_side_type == null){
	System.out.println(this.toString+" : nwsp_side_type is null" );
}else{
	System.out.println(this.toString+" : nwsp_side_type is "+nwsp_side_type );
}
String dtls_medi_cd = req.getParameter("dtls_medi_cd");
if( dtls_medi_cd == null){
	System.out.println(this.toString+" : dtls_medi_cd is null" );
}else{
	System.out.println(this.toString+" : dtls_medi_cd is "+dtls_medi_cd );
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
String pre_issu_yn = req.getParameter("pre_issu_yn");
if( pre_issu_yn == null){
	System.out.println(this.toString+" : pre_issu_yn is null" );
}else{
	System.out.println(this.toString+" : pre_issu_yn is "+pre_issu_yn );
}
String pre_day_issu = req.getParameter("pre_day_issu");
if( pre_day_issu == null){
	System.out.println(this.toString+" : pre_day_issu is null" );
}else{
	System.out.println(this.toString+" : pre_day_issu is "+pre_day_issu );
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
String ast_pers = req.getParameter("ast_pers");
if( ast_pers == null){
	System.out.println(this.toString+" : ast_pers is null" );
}else{
	System.out.println(this.toString+" : ast_pers is "+ast_pers );
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
String pragn_yn = req.getParameter("pragn_yn");
if( pragn_yn == null){
	System.out.println(this.toString+" : pragn_yn is null" );
}else{
	System.out.println(this.toString+" : pragn_yn is "+pragn_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String flag = Util.checkString(req.getParameter("flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String proc_dt = Util.checkString(req.getParameter("proc_dt"));
String pubc_occr_seq = Util.checkString(req.getParameter("pubc_occr_seq"));
String pubc_occr_dt = Util.checkString(req.getParameter("pubc_occr_dt"));
String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String advt_cont = Util.checkString(req.getParameter("advt_cont"));
String sect_cd = Util.checkString(req.getParameter("sect_cd"));
String sect_seq = Util.checkString(req.getParameter("sect_seq"));
String cm = Util.checkString(req.getParameter("cm"));
String dn = Util.checkString(req.getParameter("dn"));
String uprc = Util.checkString(req.getParameter("uprc"));
String advt_fee = Util.checkString(req.getParameter("advt_fee"));
String vat = Util.checkString(req.getParameter("vat"));
String pubc_tot_amt = Util.checkString(req.getParameter("pubc_tot_amt"));
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
String chro_clsf = Util.checkString(req.getParameter("chro_clsf"));
String type_clsf = Util.checkString(req.getParameter("type_clsf"));
String type_clsf_nm = Util.checkString(req.getParameter("type_clsf_nm"));
String exrate = Util.checkString(req.getParameter("exrate"));
String pubc_clsf = Util.checkString(req.getParameter("pubc_clsf"));
String appndx_clsf = Util.checkString(req.getParameter("appndx_clsf"));
String frex_cntr_amt = Util.checkString(req.getParameter("frex_cntr_amt"));
String edt_clsf = Util.checkString(req.getParameter("edt_clsf"));
String grp_cmpy_cd = Util.checkString(req.getParameter("grp_cmpy_cd"));
String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
String rtax_yn = Util.checkString(req.getParameter("rtax_yn"));
String upd_resn = Util.checkString(req.getParameter("upd_resn"));
String govern_advt_yn = Util.checkString(req.getParameter("govern_advt_yn"));
String upd_cont = Util.checkString(req.getParameter("upd_cont"));
String tabl_yn = Util.checkString(req.getParameter("tabl_yn"));
String remk = Util.checkString(req.getParameter("remk"));
String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));
String pre_pubc_slip_no = Util.checkString(req.getParameter("pre_pubc_slip_no"));
String pubc_side = Util.checkString(req.getParameter("pubc_side"));
String std_clsf = Util.checkString(req.getParameter("std_clsf"));
String pubc_prd = Util.checkString(req.getParameter("pubc_prd"));
String pubc_frdt = Util.checkString(req.getParameter("pubc_frdt"));
String pubc_todt = Util.checkString(req.getParameter("pubc_todt"));
String hp_edt_clsf = Util.checkString(req.getParameter("hp_edt_clsf"));
String brdg_advt_yn = Util.checkString(req.getParameter("brdg_advt_yn"));
String nwsp_advt_yn = Util.checkString(req.getParameter("nwsp_advt_yn"));
String nwsp_side_type = Util.checkString(req.getParameter("nwsp_side_type"));
String dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String preng_occr_dt = Util.checkString(req.getParameter("preng_occr_dt"));
String preng_occr_seq = Util.checkString(req.getParameter("preng_occr_seq"));
String pre_issu_yn = Util.checkString(req.getParameter("pre_issu_yn"));
String pre_day_issu = Util.checkString(req.getParameter("pre_day_issu"));
String mode = Util.checkString(req.getParameter("mode"));
String bus_seq = Util.checkString(req.getParameter("bus_seq"));
String bus_plc = Util.checkString(req.getParameter("bus_plc"));
String bus_clsf = Util.checkString(req.getParameter("bus_clsf"));
String ast_pers = Util.checkString(req.getParameter("ast_pers"));
String fee_vat = Util.checkString(req.getParameter("fee_vat"));
String coms_vat = Util.checkString(req.getParameter("coms_vat"));
String emode = Util.checkString(req.getParameter("emode"));
String eseq = Util.checkString(req.getParameter("eseq"));
String evnt_nm = Util.checkString(req.getParameter("evnt_nm"));
String eamt = Util.checkString(req.getParameter("eamt"));
String evat = Util.checkString(req.getParameter("evat"));
String etot_amt = Util.checkString(req.getParameter("etot_amt"));
String efee = Util.checkString(req.getParameter("efee"));
String efee_vat = Util.checkString(req.getParameter("efee_vat"));
String etot_fee = Util.checkString(req.getParameter("etot_fee"));
String pragn_yn = Util.checkString(req.getParameter("pragn_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String proc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_dt")));
String pubc_occr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_occr_seq")));
String pubc_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_occr_dt")));
String hndl_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("hndl_clsf")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String advt_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_cont")));
String sect_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd")));
String sect_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_seq")));
String cm = Util.Uni2Ksc(Util.checkString(req.getParameter("cm")));
String dn = Util.Uni2Ksc(Util.checkString(req.getParameter("dn")));
String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));
String advt_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_fee")));
String vat = Util.Uni2Ksc(Util.checkString(req.getParameter("vat")));
String pubc_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_tot_amt")));
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
String chro_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("chro_clsf")));
String type_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("type_clsf")));
String type_clsf_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("type_clsf_nm")));
String exrate = Util.Uni2Ksc(Util.checkString(req.getParameter("exrate")));
String pubc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_clsf")));
String appndx_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("appndx_clsf")));
String frex_cntr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("frex_cntr_amt")));
String edt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("edt_clsf")));
String grp_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("grp_cmpy_cd")));
String slcrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String mchrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("mchrg_pers")));
String rtax_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("rtax_yn")));
String upd_resn = Util.Uni2Ksc(Util.checkString(req.getParameter("upd_resn")));
String govern_advt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("govern_advt_yn")));
String upd_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("upd_cont")));
String tabl_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("tabl_yn")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String pubc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_dt")));
String pre_pubc_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("pre_pubc_slip_no")));
String pubc_side = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_side")));
String std_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("std_clsf")));
String pubc_prd = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_prd")));
String pubc_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_frdt")));
String pubc_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_todt")));
String hp_edt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("hp_edt_clsf")));
String brdg_advt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("brdg_advt_yn")));
String nwsp_advt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("nwsp_advt_yn")));
String nwsp_side_type = Util.Uni2Ksc(Util.checkString(req.getParameter("nwsp_side_type")));
String dtls_medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_medi_cd")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String preng_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_occr_dt")));
String preng_occr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_occr_seq")));
String pre_issu_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("pre_issu_yn")));
String pre_day_issu = Util.Uni2Ksc(Util.checkString(req.getParameter("pre_day_issu")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String bus_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("bus_seq")));
String bus_plc = Util.Uni2Ksc(Util.checkString(req.getParameter("bus_plc")));
String bus_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("bus_clsf")));
String ast_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("ast_pers")));
String fee_vat = Util.Uni2Ksc(Util.checkString(req.getParameter("fee_vat")));
String coms_vat = Util.Uni2Ksc(Util.checkString(req.getParameter("coms_vat")));
String emode = Util.Uni2Ksc(Util.checkString(req.getParameter("emode")));
String eseq = Util.Uni2Ksc(Util.checkString(req.getParameter("eseq")));
String evnt_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_nm")));
String eamt = Util.Uni2Ksc(Util.checkString(req.getParameter("eamt")));
String evat = Util.Uni2Ksc(Util.checkString(req.getParameter("evat")));
String etot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("etot_amt")));
String efee = Util.Uni2Ksc(Util.checkString(req.getParameter("efee")));
String efee_vat = Util.Uni2Ksc(Util.checkString(req.getParameter("efee_vat")));
String etot_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("etot_fee")));
String pragn_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("pragn_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setProc_dt(proc_dt);
dm.setPubc_occr_seq(pubc_occr_seq);
dm.setPubc_occr_dt(pubc_occr_dt);
dm.setHndl_clsf(hndl_clsf);
dm.setDlco_no(dlco_no);
dm.setAdvt_cont(advt_cont);
dm.setSect_cd(sect_cd);
dm.setSect_seq(sect_seq);
dm.setCm(cm);
dm.setDn(dn);
dm.setUprc(uprc);
dm.setAdvt_fee(advt_fee);
dm.setVat(vat);
dm.setPubc_tot_amt(pubc_tot_amt);
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
dm.setChro_clsf(chro_clsf);
dm.setType_clsf(type_clsf);
dm.setType_clsf_nm(type_clsf_nm);
dm.setExrate(exrate);
dm.setPubc_clsf(pubc_clsf);
dm.setAppndx_clsf(appndx_clsf);
dm.setFrex_cntr_amt(frex_cntr_amt);
dm.setEdt_clsf(edt_clsf);
dm.setGrp_cmpy_cd(grp_cmpy_cd);
dm.setSlcrg_pers(slcrg_pers);
dm.setDept_cd(dept_cd);
dm.setMchrg_pers(mchrg_pers);
dm.setRtax_yn(rtax_yn);
dm.setUpd_resn(upd_resn);
dm.setGovern_advt_yn(govern_advt_yn);
dm.setUpd_cont(upd_cont);
dm.setTabl_yn(tabl_yn);
dm.setRemk(remk);
dm.setPubc_dt(pubc_dt);
dm.setPre_pubc_slip_no(pre_pubc_slip_no);
dm.setPubc_side(pubc_side);
dm.setStd_clsf(std_clsf);
dm.setPubc_prd(pubc_prd);
dm.setPubc_frdt(pubc_frdt);
dm.setPubc_todt(pubc_todt);
dm.setHp_edt_clsf(hp_edt_clsf);
dm.setBrdg_advt_yn(brdg_advt_yn);
dm.setNwsp_advt_yn(nwsp_advt_yn);
dm.setNwsp_side_type(nwsp_side_type);
dm.setDtls_medi_cd(dtls_medi_cd);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setPreng_occr_dt(preng_occr_dt);
dm.setPreng_occr_seq(preng_occr_seq);
dm.setPre_issu_yn(pre_issu_yn);
dm.setPre_day_issu(pre_day_issu);
dm.setMode(mode);
dm.setBus_seq(bus_seq);
dm.setBus_plc(bus_plc);
dm.setBus_clsf(bus_clsf);
dm.setAst_pers(ast_pers);
dm.setFee_vat(fee_vat);
dm.setComs_vat(coms_vat);
dm.setEmode(emode);
dm.setEseq(eseq);
dm.setEvnt_nm(evnt_nm);
dm.setEamt(eamt);
dm.setEvat(evat);
dm.setEtot_amt(etot_amt);
dm.setEfee(efee);
dm.setEfee_vat(efee_vat);
dm.setEtot_fee(etot_fee);
dm.setPragn_yn(pragn_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 23 19:01:18 KST 2016 */