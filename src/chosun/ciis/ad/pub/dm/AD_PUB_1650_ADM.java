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


public class AD_PUB_1650_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String medi_cd;
	public String proc_dt;
	public String pubc_occr_seq;
	public String pubc_occr_dt;
	public String hndl_clsf;
	public String dlco_no;
	public String advt_cont;
	public String pubc_side;
	public String issu_ser_no;
	public String publ_std;
	public String advt_fee;
	public String vat;
	public String pubc_tot_amt;
	public String agn;
	public String fee_rate;
	public String fee;
	public String hndl_plac_cd;
	public String coms_rate;
	public String coms;
	public String indt_clsf;
	public String indt_clsf_nm;
	public String mony_kind;
	public String chro_clsf;
	public String type_clsf;
	public String type_clsf_nm;
	public String exrate;
	public String nwsp_type_clsf;
	public String frex_cntr_amt;
	public String book_appndx_clsf;
	public String grp_cmpy_cd;
	public String slcrg_pers;
	public String dept_cd;
	public String mchrg_pers;
	public String rtax_yn;
	public String upd_resn;
	public String govern_advt_yn;
	public String upd_cont;
	public String advcs_offr_yn;
	public String remk;
	public String pubc_dt;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String preng_occr_dt;
	public String preng_occr_seq;
	public String tax_email;
	public String tax_clsf;
	public String advt_clsf;
	public String patr_chrg_info;

	public AD_PUB_1650_ADM(){}
	public AD_PUB_1650_ADM(String flag, String cmpy_cd, String medi_cd, String proc_dt, String pubc_occr_seq, String pubc_occr_dt, String hndl_clsf, String dlco_no, String advt_cont, String pubc_side, String issu_ser_no, String publ_std, String advt_fee, String vat, String pubc_tot_amt, String agn, String fee_rate, String fee, String hndl_plac_cd, String coms_rate, String coms, String indt_clsf, String indt_clsf_nm, String mony_kind, String chro_clsf, String type_clsf, String type_clsf_nm, String exrate, String nwsp_type_clsf, String frex_cntr_amt, String book_appndx_clsf, String grp_cmpy_cd, String slcrg_pers, String dept_cd, String mchrg_pers, String rtax_yn, String upd_resn, String govern_advt_yn, String upd_cont, String advcs_offr_yn, String remk, String pubc_dt, String incmg_pers_ip, String incmg_pers, String preng_occr_dt, String preng_occr_seq, String tax_email, String tax_clsf, String advt_clsf, String patr_chrg_info){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.proc_dt = proc_dt;
		this.pubc_occr_seq = pubc_occr_seq;
		this.pubc_occr_dt = pubc_occr_dt;
		this.hndl_clsf = hndl_clsf;
		this.dlco_no = dlco_no;
		this.advt_cont = advt_cont;
		this.pubc_side = pubc_side;
		this.issu_ser_no = issu_ser_no;
		this.publ_std = publ_std;
		this.advt_fee = advt_fee;
		this.vat = vat;
		this.pubc_tot_amt = pubc_tot_amt;
		this.agn = agn;
		this.fee_rate = fee_rate;
		this.fee = fee;
		this.hndl_plac_cd = hndl_plac_cd;
		this.coms_rate = coms_rate;
		this.coms = coms;
		this.indt_clsf = indt_clsf;
		this.indt_clsf_nm = indt_clsf_nm;
		this.mony_kind = mony_kind;
		this.chro_clsf = chro_clsf;
		this.type_clsf = type_clsf;
		this.type_clsf_nm = type_clsf_nm;
		this.exrate = exrate;
		this.nwsp_type_clsf = nwsp_type_clsf;
		this.frex_cntr_amt = frex_cntr_amt;
		this.book_appndx_clsf = book_appndx_clsf;
		this.grp_cmpy_cd = grp_cmpy_cd;
		this.slcrg_pers = slcrg_pers;
		this.dept_cd = dept_cd;
		this.mchrg_pers = mchrg_pers;
		this.rtax_yn = rtax_yn;
		this.upd_resn = upd_resn;
		this.govern_advt_yn = govern_advt_yn;
		this.upd_cont = upd_cont;
		this.advcs_offr_yn = advcs_offr_yn;
		this.remk = remk;
		this.pubc_dt = pubc_dt;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.preng_occr_dt = preng_occr_dt;
		this.preng_occr_seq = preng_occr_seq;
		this.tax_email = tax_email;
		this.tax_clsf = tax_clsf;
		this.advt_clsf = advt_clsf;
		this.patr_chrg_info = patr_chrg_info;
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

	public void setNwsp_type_clsf(String nwsp_type_clsf){
		this.nwsp_type_clsf = nwsp_type_clsf;
	}

	public void setFrex_cntr_amt(String frex_cntr_amt){
		this.frex_cntr_amt = frex_cntr_amt;
	}

	public void setBook_appndx_clsf(String book_appndx_clsf){
		this.book_appndx_clsf = book_appndx_clsf;
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

	public void setAdvcs_offr_yn(String advcs_offr_yn){
		this.advcs_offr_yn = advcs_offr_yn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
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

	public String getNwsp_type_clsf(){
		return this.nwsp_type_clsf;
	}

	public String getFrex_cntr_amt(){
		return this.frex_cntr_amt;
	}

	public String getBook_appndx_clsf(){
		return this.book_appndx_clsf;
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

	public String getAdvcs_offr_yn(){
		return this.advcs_offr_yn;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
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

	public String getSQL(){
		 return "{ call MISADV.SP_AD_PUB_1650_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_1650_ADM dm = (AD_PUB_1650_ADM)bdm;
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
		cstmt.setString(12, dm.pubc_side);
		cstmt.setString(13, dm.issu_ser_no);
		cstmt.setString(14, dm.publ_std);
		cstmt.setString(15, dm.advt_fee);
		cstmt.setString(16, dm.vat);
		cstmt.setString(17, dm.pubc_tot_amt);
		cstmt.setString(18, dm.agn);
		cstmt.setString(19, dm.fee_rate);
		cstmt.setString(20, dm.fee);
		cstmt.setString(21, dm.hndl_plac_cd);
		cstmt.setString(22, dm.coms_rate);
		cstmt.setString(23, dm.coms);
		cstmt.setString(24, dm.indt_clsf);
		cstmt.setString(25, dm.indt_clsf_nm);
		cstmt.setString(26, dm.mony_kind);
		cstmt.setString(27, dm.chro_clsf);
		cstmt.setString(28, dm.type_clsf);
		cstmt.setString(29, dm.type_clsf_nm);
		cstmt.setString(30, dm.exrate);
		cstmt.setString(31, dm.nwsp_type_clsf);
		cstmt.setString(32, dm.frex_cntr_amt);
		cstmt.setString(33, dm.book_appndx_clsf);
		cstmt.setString(34, dm.grp_cmpy_cd);
		cstmt.setString(35, dm.slcrg_pers);
		cstmt.setString(36, dm.dept_cd);
		cstmt.setString(37, dm.mchrg_pers);
		cstmt.setString(38, dm.rtax_yn);
		cstmt.setString(39, dm.upd_resn);
		cstmt.setString(40, dm.govern_advt_yn);
		cstmt.setString(41, dm.upd_cont);
		cstmt.setString(42, dm.advcs_offr_yn);
		cstmt.setString(43, dm.remk);
		cstmt.setString(44, dm.pubc_dt);
		cstmt.setString(45, dm.incmg_pers_ip);
		cstmt.setString(46, dm.incmg_pers);
		cstmt.setString(47, dm.preng_occr_dt);
		cstmt.setString(48, dm.preng_occr_seq);
		cstmt.setString(49, dm.tax_email);
		cstmt.setString(50, dm.tax_clsf);
		cstmt.setString(51, dm.advt_clsf);
		cstmt.setString(52, dm.patr_chrg_info);
		cstmt.registerOutParameter(53, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_1650_ADataSet();
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
		System.out.println("pubc_side = [" + getPubc_side() + "]");
		System.out.println("issu_ser_no = [" + getIssu_ser_no() + "]");
		System.out.println("publ_std = [" + getPubl_std() + "]");
		System.out.println("advt_fee = [" + getAdvt_fee() + "]");
		System.out.println("vat = [" + getVat() + "]");
		System.out.println("pubc_tot_amt = [" + getPubc_tot_amt() + "]");
		System.out.println("agn = [" + getAgn() + "]");
		System.out.println("fee_rate = [" + getFee_rate() + "]");
		System.out.println("fee = [" + getFee() + "]");
		System.out.println("hndl_plac_cd = [" + getHndl_plac_cd() + "]");
		System.out.println("coms_rate = [" + getComs_rate() + "]");
		System.out.println("coms = [" + getComs() + "]");
		System.out.println("indt_clsf = [" + getIndt_clsf() + "]");
		System.out.println("indt_clsf_nm = [" + getIndt_clsf_nm() + "]");
		System.out.println("mony_kind = [" + getMony_kind() + "]");
		System.out.println("chro_clsf = [" + getChro_clsf() + "]");
		System.out.println("type_clsf = [" + getType_clsf() + "]");
		System.out.println("type_clsf_nm = [" + getType_clsf_nm() + "]");
		System.out.println("exrate = [" + getExrate() + "]");
		System.out.println("nwsp_type_clsf = [" + getNwsp_type_clsf() + "]");
		System.out.println("frex_cntr_amt = [" + getFrex_cntr_amt() + "]");
		System.out.println("book_appndx_clsf = [" + getBook_appndx_clsf() + "]");
		System.out.println("grp_cmpy_cd = [" + getGrp_cmpy_cd() + "]");
		System.out.println("slcrg_pers = [" + getSlcrg_pers() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("mchrg_pers = [" + getMchrg_pers() + "]");
		System.out.println("rtax_yn = [" + getRtax_yn() + "]");
		System.out.println("upd_resn = [" + getUpd_resn() + "]");
		System.out.println("govern_advt_yn = [" + getGovern_advt_yn() + "]");
		System.out.println("upd_cont = [" + getUpd_cont() + "]");
		System.out.println("advcs_offr_yn = [" + getAdvcs_offr_yn() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("pubc_dt = [" + getPubc_dt() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("preng_occr_dt = [" + getPreng_occr_dt() + "]");
		System.out.println("preng_occr_seq = [" + getPreng_occr_seq() + "]");
		System.out.println("tax_email = [" + getTax_email() + "]");
		System.out.println("tax_clsf = [" + getTax_clsf() + "]");
		System.out.println("advt_clsf = [" + getAdvt_clsf() + "]");
		System.out.println("patr_chrg_info = [" + getPatr_chrg_info() + "]");
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
String pubc_side = req.getParameter("pubc_side");
if( pubc_side == null){
	System.out.println(this.toString+" : pubc_side is null" );
}else{
	System.out.println(this.toString+" : pubc_side is "+pubc_side );
}
String issu_ser_no = req.getParameter("issu_ser_no");
if( issu_ser_no == null){
	System.out.println(this.toString+" : issu_ser_no is null" );
}else{
	System.out.println(this.toString+" : issu_ser_no is "+issu_ser_no );
}
String publ_std = req.getParameter("publ_std");
if( publ_std == null){
	System.out.println(this.toString+" : publ_std is null" );
}else{
	System.out.println(this.toString+" : publ_std is "+publ_std );
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
String nwsp_type_clsf = req.getParameter("nwsp_type_clsf");
if( nwsp_type_clsf == null){
	System.out.println(this.toString+" : nwsp_type_clsf is null" );
}else{
	System.out.println(this.toString+" : nwsp_type_clsf is "+nwsp_type_clsf );
}
String frex_cntr_amt = req.getParameter("frex_cntr_amt");
if( frex_cntr_amt == null){
	System.out.println(this.toString+" : frex_cntr_amt is null" );
}else{
	System.out.println(this.toString+" : frex_cntr_amt is "+frex_cntr_amt );
}
String book_appndx_clsf = req.getParameter("book_appndx_clsf");
if( book_appndx_clsf == null){
	System.out.println(this.toString+" : book_appndx_clsf is null" );
}else{
	System.out.println(this.toString+" : book_appndx_clsf is "+book_appndx_clsf );
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
String advcs_offr_yn = req.getParameter("advcs_offr_yn");
if( advcs_offr_yn == null){
	System.out.println(this.toString+" : advcs_offr_yn is null" );
}else{
	System.out.println(this.toString+" : advcs_offr_yn is "+advcs_offr_yn );
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
String tax_email = req.getParameter("tax_email");
if( tax_email == null){
	System.out.println(this.toString+" : tax_email is null" );
}else{
	System.out.println(this.toString+" : tax_email is "+tax_email );
}
String tax_clsf = req.getParameter("tax_clsf");
if( tax_clsf == null){
	System.out.println(this.toString+" : tax_clsf is null" );
}else{
	System.out.println(this.toString+" : tax_clsf is "+tax_clsf );
}
String advt_clsf = req.getParameter("advt_clsf");
if( advt_clsf == null){
	System.out.println(this.toString+" : advt_clsf is null" );
}else{
	System.out.println(this.toString+" : advt_clsf is "+advt_clsf );
}
String patr_chrg_info = req.getParameter("patr_chrg_info");
if( patr_chrg_info == null){
	System.out.println(this.toString+" : patr_chrg_info is null" );
}else{
	System.out.println(this.toString+" : patr_chrg_info is "+patr_chrg_info );
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
String pubc_side = Util.checkString(req.getParameter("pubc_side"));
String issu_ser_no = Util.checkString(req.getParameter("issu_ser_no"));
String publ_std = Util.checkString(req.getParameter("publ_std"));
String advt_fee = Util.checkString(req.getParameter("advt_fee"));
String vat = Util.checkString(req.getParameter("vat"));
String pubc_tot_amt = Util.checkString(req.getParameter("pubc_tot_amt"));
String agn = Util.checkString(req.getParameter("agn"));
String fee_rate = Util.checkString(req.getParameter("fee_rate"));
String fee = Util.checkString(req.getParameter("fee"));
String hndl_plac_cd = Util.checkString(req.getParameter("hndl_plac_cd"));
String coms_rate = Util.checkString(req.getParameter("coms_rate"));
String coms = Util.checkString(req.getParameter("coms"));
String indt_clsf = Util.checkString(req.getParameter("indt_clsf"));
String indt_clsf_nm = Util.checkString(req.getParameter("indt_clsf_nm"));
String mony_kind = Util.checkString(req.getParameter("mony_kind"));
String chro_clsf = Util.checkString(req.getParameter("chro_clsf"));
String type_clsf = Util.checkString(req.getParameter("type_clsf"));
String type_clsf_nm = Util.checkString(req.getParameter("type_clsf_nm"));
String exrate = Util.checkString(req.getParameter("exrate"));
String nwsp_type_clsf = Util.checkString(req.getParameter("nwsp_type_clsf"));
String frex_cntr_amt = Util.checkString(req.getParameter("frex_cntr_amt"));
String book_appndx_clsf = Util.checkString(req.getParameter("book_appndx_clsf"));
String grp_cmpy_cd = Util.checkString(req.getParameter("grp_cmpy_cd"));
String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
String rtax_yn = Util.checkString(req.getParameter("rtax_yn"));
String upd_resn = Util.checkString(req.getParameter("upd_resn"));
String govern_advt_yn = Util.checkString(req.getParameter("govern_advt_yn"));
String upd_cont = Util.checkString(req.getParameter("upd_cont"));
String advcs_offr_yn = Util.checkString(req.getParameter("advcs_offr_yn"));
String remk = Util.checkString(req.getParameter("remk"));
String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String preng_occr_dt = Util.checkString(req.getParameter("preng_occr_dt"));
String preng_occr_seq = Util.checkString(req.getParameter("preng_occr_seq"));
String tax_email = Util.checkString(req.getParameter("tax_email"));
String tax_clsf = Util.checkString(req.getParameter("tax_clsf"));
String advt_clsf = Util.checkString(req.getParameter("advt_clsf"));
String patr_chrg_info = Util.checkString(req.getParameter("patr_chrg_info"));
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
String pubc_side = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_side")));
String issu_ser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_ser_no")));
String publ_std = Util.Uni2Ksc(Util.checkString(req.getParameter("publ_std")));
String advt_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_fee")));
String vat = Util.Uni2Ksc(Util.checkString(req.getParameter("vat")));
String pubc_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_tot_amt")));
String agn = Util.Uni2Ksc(Util.checkString(req.getParameter("agn")));
String fee_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("fee_rate")));
String fee = Util.Uni2Ksc(Util.checkString(req.getParameter("fee")));
String hndl_plac_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("hndl_plac_cd")));
String coms_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("coms_rate")));
String coms = Util.Uni2Ksc(Util.checkString(req.getParameter("coms")));
String indt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("indt_clsf")));
String indt_clsf_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("indt_clsf_nm")));
String mony_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("mony_kind")));
String chro_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("chro_clsf")));
String type_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("type_clsf")));
String type_clsf_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("type_clsf_nm")));
String exrate = Util.Uni2Ksc(Util.checkString(req.getParameter("exrate")));
String nwsp_type_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("nwsp_type_clsf")));
String frex_cntr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("frex_cntr_amt")));
String book_appndx_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("book_appndx_clsf")));
String grp_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("grp_cmpy_cd")));
String slcrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String mchrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("mchrg_pers")));
String rtax_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("rtax_yn")));
String upd_resn = Util.Uni2Ksc(Util.checkString(req.getParameter("upd_resn")));
String govern_advt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("govern_advt_yn")));
String upd_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("upd_cont")));
String advcs_offr_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("advcs_offr_yn")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String pubc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_dt")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String preng_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_occr_dt")));
String preng_occr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_occr_seq")));
String tax_email = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_email")));
String tax_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_clsf")));
String advt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_clsf")));
String patr_chrg_info = Util.Uni2Ksc(Util.checkString(req.getParameter("patr_chrg_info")));
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
dm.setPubc_side(pubc_side);
dm.setIssu_ser_no(issu_ser_no);
dm.setPubl_std(publ_std);
dm.setAdvt_fee(advt_fee);
dm.setVat(vat);
dm.setPubc_tot_amt(pubc_tot_amt);
dm.setAgn(agn);
dm.setFee_rate(fee_rate);
dm.setFee(fee);
dm.setHndl_plac_cd(hndl_plac_cd);
dm.setComs_rate(coms_rate);
dm.setComs(coms);
dm.setIndt_clsf(indt_clsf);
dm.setIndt_clsf_nm(indt_clsf_nm);
dm.setMony_kind(mony_kind);
dm.setChro_clsf(chro_clsf);
dm.setType_clsf(type_clsf);
dm.setType_clsf_nm(type_clsf_nm);
dm.setExrate(exrate);
dm.setNwsp_type_clsf(nwsp_type_clsf);
dm.setFrex_cntr_amt(frex_cntr_amt);
dm.setBook_appndx_clsf(book_appndx_clsf);
dm.setGrp_cmpy_cd(grp_cmpy_cd);
dm.setSlcrg_pers(slcrg_pers);
dm.setDept_cd(dept_cd);
dm.setMchrg_pers(mchrg_pers);
dm.setRtax_yn(rtax_yn);
dm.setUpd_resn(upd_resn);
dm.setGovern_advt_yn(govern_advt_yn);
dm.setUpd_cont(upd_cont);
dm.setAdvcs_offr_yn(advcs_offr_yn);
dm.setRemk(remk);
dm.setPubc_dt(pubc_dt);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setPreng_occr_dt(preng_occr_dt);
dm.setPreng_occr_seq(preng_occr_seq);
dm.setTax_email(tax_email);
dm.setTax_clsf(tax_clsf);
dm.setAdvt_clsf(advt_clsf);
dm.setPatr_chrg_info(patr_chrg_info);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 01 14:34:43 KST 2014 */