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


package chosun.ciis.ad.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.bas.ds.*;
import chosun.ciis.ad.bas.rec.*;

/**
 * 
 */


public class AD_BAS_1030_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String dlco_no;
	public String dlco_abrv_nm;
	public String grp_cmpy_cd;
	public String eps_clsf_cd;
	public String cntr_yn;
	public String mang_clsf;
	public String oth_cmpy_dlco_yn;
	public String govern_advt_yn;
	public String cntr_type;
	public String slcrg_pers;
	public String mchrg_pers;
	public String slcrg_pers_nm;
	public String mchrg_pers_nm;
	public String indt_cd;
	public String type_cd;
	public String fndt_dt;
	public String dhon_dt;
	public String capt_amt;
	public String gnr_advcs_yn;
	public String arow_advcs_yn;
	public String agn_yn;
	public String nmd_agn_yn;
	public String advt_bo_yn;
	public String bo_bof_yn;
	public String del_yn;
	public String elec_tax_comp_cd;
	public String email_id;
	public String incmg_pers;
	public String incmg_pers_ip;
	public String mode;
	public String seq;
	public String job_clsf;
	public String advcs_feat;
	public String chrg_pers;
	public String tel_no;
	public String mode2;
	public String seq2;
	public String insrt_dt;
	public String dlco_info;
	public String chrg_pers2;
	public String preng_yn;

	public AD_BAS_1030_ADM(){}
	public AD_BAS_1030_ADM(String flag, String cmpy_cd, String dlco_no, String dlco_abrv_nm, String grp_cmpy_cd, String eps_clsf_cd, String cntr_yn, String mang_clsf, String oth_cmpy_dlco_yn, String govern_advt_yn, String cntr_type, String slcrg_pers, String mchrg_pers, String slcrg_pers_nm, String mchrg_pers_nm, String indt_cd, String type_cd, String fndt_dt, String dhon_dt, String capt_amt, String gnr_advcs_yn, String arow_advcs_yn, String agn_yn, String nmd_agn_yn, String advt_bo_yn, String bo_bof_yn, String del_yn, String elec_tax_comp_cd, String email_id, String incmg_pers, String incmg_pers_ip, String mode, String seq, String job_clsf, String advcs_feat, String chrg_pers, String tel_no, String mode2, String seq2, String insrt_dt, String dlco_info, String chrg_pers2, String preng_yn){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.dlco_no = dlco_no;
		this.dlco_abrv_nm = dlco_abrv_nm;
		this.grp_cmpy_cd = grp_cmpy_cd;
		this.eps_clsf_cd = eps_clsf_cd;
		this.cntr_yn = cntr_yn;
		this.mang_clsf = mang_clsf;
		this.oth_cmpy_dlco_yn = oth_cmpy_dlco_yn;
		this.govern_advt_yn = govern_advt_yn;
		this.cntr_type = cntr_type;
		this.slcrg_pers = slcrg_pers;
		this.mchrg_pers = mchrg_pers;
		this.slcrg_pers_nm = slcrg_pers_nm;
		this.mchrg_pers_nm = mchrg_pers_nm;
		this.indt_cd = indt_cd;
		this.type_cd = type_cd;
		this.fndt_dt = fndt_dt;
		this.dhon_dt = dhon_dt;
		this.capt_amt = capt_amt;
		this.gnr_advcs_yn = gnr_advcs_yn;
		this.arow_advcs_yn = arow_advcs_yn;
		this.agn_yn = agn_yn;
		this.nmd_agn_yn = nmd_agn_yn;
		this.advt_bo_yn = advt_bo_yn;
		this.bo_bof_yn = bo_bof_yn;
		this.del_yn = del_yn;
		this.elec_tax_comp_cd = elec_tax_comp_cd;
		this.email_id = email_id;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
		this.mode = mode;
		this.seq = seq;
		this.job_clsf = job_clsf;
		this.advcs_feat = advcs_feat;
		this.chrg_pers = chrg_pers;
		this.tel_no = tel_no;
		this.mode2 = mode2;
		this.seq2 = seq2;
		this.insrt_dt = insrt_dt;
		this.dlco_info = dlco_info;
		this.chrg_pers2 = chrg_pers2;
		this.preng_yn = preng_yn;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_abrv_nm(String dlco_abrv_nm){
		this.dlco_abrv_nm = dlco_abrv_nm;
	}

	public void setGrp_cmpy_cd(String grp_cmpy_cd){
		this.grp_cmpy_cd = grp_cmpy_cd;
	}

	public void setEps_clsf_cd(String eps_clsf_cd){
		this.eps_clsf_cd = eps_clsf_cd;
	}

	public void setCntr_yn(String cntr_yn){
		this.cntr_yn = cntr_yn;
	}

	public void setMang_clsf(String mang_clsf){
		this.mang_clsf = mang_clsf;
	}

	public void setOth_cmpy_dlco_yn(String oth_cmpy_dlco_yn){
		this.oth_cmpy_dlco_yn = oth_cmpy_dlco_yn;
	}

	public void setGovern_advt_yn(String govern_advt_yn){
		this.govern_advt_yn = govern_advt_yn;
	}

	public void setCntr_type(String cntr_type){
		this.cntr_type = cntr_type;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setSlcrg_pers_nm(String slcrg_pers_nm){
		this.slcrg_pers_nm = slcrg_pers_nm;
	}

	public void setMchrg_pers_nm(String mchrg_pers_nm){
		this.mchrg_pers_nm = mchrg_pers_nm;
	}

	public void setIndt_cd(String indt_cd){
		this.indt_cd = indt_cd;
	}

	public void setType_cd(String type_cd){
		this.type_cd = type_cd;
	}

	public void setFndt_dt(String fndt_dt){
		this.fndt_dt = fndt_dt;
	}

	public void setDhon_dt(String dhon_dt){
		this.dhon_dt = dhon_dt;
	}

	public void setCapt_amt(String capt_amt){
		this.capt_amt = capt_amt;
	}

	public void setGnr_advcs_yn(String gnr_advcs_yn){
		this.gnr_advcs_yn = gnr_advcs_yn;
	}

	public void setArow_advcs_yn(String arow_advcs_yn){
		this.arow_advcs_yn = arow_advcs_yn;
	}

	public void setAgn_yn(String agn_yn){
		this.agn_yn = agn_yn;
	}

	public void setNmd_agn_yn(String nmd_agn_yn){
		this.nmd_agn_yn = nmd_agn_yn;
	}

	public void setAdvt_bo_yn(String advt_bo_yn){
		this.advt_bo_yn = advt_bo_yn;
	}

	public void setBo_bof_yn(String bo_bof_yn){
		this.bo_bof_yn = bo_bof_yn;
	}

	public void setDel_yn(String del_yn){
		this.del_yn = del_yn;
	}

	public void setElec_tax_comp_cd(String elec_tax_comp_cd){
		this.elec_tax_comp_cd = elec_tax_comp_cd;
	}

	public void setEmail_id(String email_id){
		this.email_id = email_id;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public void setAdvcs_feat(String advcs_feat){
		this.advcs_feat = advcs_feat;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setMode2(String mode2){
		this.mode2 = mode2;
	}

	public void setSeq2(String seq2){
		this.seq2 = seq2;
	}

	public void setInsrt_dt(String insrt_dt){
		this.insrt_dt = insrt_dt;
	}

	public void setDlco_info(String dlco_info){
		this.dlco_info = dlco_info;
	}

	public void setChrg_pers2(String chrg_pers2){
		this.chrg_pers2 = chrg_pers2;
	}

	public void setPreng_yn(String preng_yn){
		this.preng_yn = preng_yn;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_abrv_nm(){
		return this.dlco_abrv_nm;
	}

	public String getGrp_cmpy_cd(){
		return this.grp_cmpy_cd;
	}

	public String getEps_clsf_cd(){
		return this.eps_clsf_cd;
	}

	public String getCntr_yn(){
		return this.cntr_yn;
	}

	public String getMang_clsf(){
		return this.mang_clsf;
	}

	public String getOth_cmpy_dlco_yn(){
		return this.oth_cmpy_dlco_yn;
	}

	public String getGovern_advt_yn(){
		return this.govern_advt_yn;
	}

	public String getCntr_type(){
		return this.cntr_type;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getSlcrg_pers_nm(){
		return this.slcrg_pers_nm;
	}

	public String getMchrg_pers_nm(){
		return this.mchrg_pers_nm;
	}

	public String getIndt_cd(){
		return this.indt_cd;
	}

	public String getType_cd(){
		return this.type_cd;
	}

	public String getFndt_dt(){
		return this.fndt_dt;
	}

	public String getDhon_dt(){
		return this.dhon_dt;
	}

	public String getCapt_amt(){
		return this.capt_amt;
	}

	public String getGnr_advcs_yn(){
		return this.gnr_advcs_yn;
	}

	public String getArow_advcs_yn(){
		return this.arow_advcs_yn;
	}

	public String getAgn_yn(){
		return this.agn_yn;
	}

	public String getNmd_agn_yn(){
		return this.nmd_agn_yn;
	}

	public String getAdvt_bo_yn(){
		return this.advt_bo_yn;
	}

	public String getBo_bof_yn(){
		return this.bo_bof_yn;
	}

	public String getDel_yn(){
		return this.del_yn;
	}

	public String getElec_tax_comp_cd(){
		return this.elec_tax_comp_cd;
	}

	public String getEmail_id(){
		return this.email_id;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getAdvcs_feat(){
		return this.advcs_feat;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getMode2(){
		return this.mode2;
	}

	public String getSeq2(){
		return this.seq2;
	}

	public String getInsrt_dt(){
		return this.insrt_dt;
	}

	public String getDlco_info(){
		return this.dlco_info;
	}

	public String getChrg_pers2(){
		return this.chrg_pers2;
	}

	public String getPreng_yn(){
		return this.preng_yn;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BAS_1030_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_1030_ADM dm = (AD_BAS_1030_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.dlco_no);
		cstmt.setString(6, dm.dlco_abrv_nm);
		cstmt.setString(7, dm.grp_cmpy_cd);
		cstmt.setString(8, dm.eps_clsf_cd);
		cstmt.setString(9, dm.cntr_yn);
		cstmt.setString(10, dm.mang_clsf);
		cstmt.setString(11, dm.oth_cmpy_dlco_yn);
		cstmt.setString(12, dm.govern_advt_yn);
		cstmt.setString(13, dm.cntr_type);
		cstmt.setString(14, dm.slcrg_pers);
		cstmt.setString(15, dm.mchrg_pers);
		cstmt.setString(16, dm.slcrg_pers_nm);
		cstmt.setString(17, dm.mchrg_pers_nm);
		cstmt.setString(18, dm.indt_cd);
		cstmt.setString(19, dm.type_cd);
		cstmt.setString(20, dm.fndt_dt);
		cstmt.setString(21, dm.dhon_dt);
		cstmt.setString(22, dm.capt_amt);
		cstmt.setString(23, dm.gnr_advcs_yn);
		cstmt.setString(24, dm.arow_advcs_yn);
		cstmt.setString(25, dm.agn_yn);
		cstmt.setString(26, dm.nmd_agn_yn);
		cstmt.setString(27, dm.advt_bo_yn);
		cstmt.setString(28, dm.bo_bof_yn);
		cstmt.setString(29, dm.del_yn);
		cstmt.setString(30, dm.elec_tax_comp_cd);
		cstmt.setString(31, dm.email_id);
		cstmt.setString(32, dm.incmg_pers);
		cstmt.setString(33, dm.incmg_pers_ip);
		cstmt.setString(34, dm.mode);
		cstmt.setString(35, dm.seq);
		cstmt.setString(36, dm.job_clsf);
		cstmt.setString(37, dm.advcs_feat);
		cstmt.setString(38, dm.chrg_pers);
		cstmt.setString(39, dm.tel_no);
		cstmt.setString(40, dm.mode2);
		cstmt.setString(41, dm.seq2);
		cstmt.setString(42, dm.insrt_dt);
		cstmt.setString(43, dm.dlco_info);
		cstmt.setString(44, dm.chrg_pers2);
		cstmt.setString(45, dm.preng_yn);
		cstmt.registerOutParameter(46, Types.VARCHAR);
		cstmt.registerOutParameter(47, Types.VARCHAR);
		cstmt.registerOutParameter(48, Types.VARCHAR);
		cstmt.registerOutParameter(49, Types.VARCHAR);
		cstmt.registerOutParameter(50, Types.VARCHAR);
		cstmt.registerOutParameter(51, Types.VARCHAR);
		cstmt.registerOutParameter(52, Types.VARCHAR);
		cstmt.registerOutParameter(53, Types.VARCHAR);
		cstmt.registerOutParameter(54, Types.VARCHAR);
		cstmt.registerOutParameter(55, Types.VARCHAR);
		cstmt.registerOutParameter(56, Types.VARCHAR);
		cstmt.registerOutParameter(57, Types.VARCHAR);
		cstmt.registerOutParameter(58, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_1030_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("dlco_abrv_nm = [" + getDlco_abrv_nm() + "]");
		System.out.println("grp_cmpy_cd = [" + getGrp_cmpy_cd() + "]");
		System.out.println("eps_clsf_cd = [" + getEps_clsf_cd() + "]");
		System.out.println("cntr_yn = [" + getCntr_yn() + "]");
		System.out.println("mang_clsf = [" + getMang_clsf() + "]");
		System.out.println("oth_cmpy_dlco_yn = [" + getOth_cmpy_dlco_yn() + "]");
		System.out.println("govern_advt_yn = [" + getGovern_advt_yn() + "]");
		System.out.println("cntr_type = [" + getCntr_type() + "]");
		System.out.println("slcrg_pers = [" + getSlcrg_pers() + "]");
		System.out.println("mchrg_pers = [" + getMchrg_pers() + "]");
		System.out.println("slcrg_pers_nm = [" + getSlcrg_pers_nm() + "]");
		System.out.println("mchrg_pers_nm = [" + getMchrg_pers_nm() + "]");
		System.out.println("indt_cd = [" + getIndt_cd() + "]");
		System.out.println("type_cd = [" + getType_cd() + "]");
		System.out.println("fndt_dt = [" + getFndt_dt() + "]");
		System.out.println("dhon_dt = [" + getDhon_dt() + "]");
		System.out.println("capt_amt = [" + getCapt_amt() + "]");
		System.out.println("gnr_advcs_yn = [" + getGnr_advcs_yn() + "]");
		System.out.println("arow_advcs_yn = [" + getArow_advcs_yn() + "]");
		System.out.println("agn_yn = [" + getAgn_yn() + "]");
		System.out.println("nmd_agn_yn = [" + getNmd_agn_yn() + "]");
		System.out.println("advt_bo_yn = [" + getAdvt_bo_yn() + "]");
		System.out.println("bo_bof_yn = [" + getBo_bof_yn() + "]");
		System.out.println("del_yn = [" + getDel_yn() + "]");
		System.out.println("elec_tax_comp_cd = [" + getElec_tax_comp_cd() + "]");
		System.out.println("email_id = [" + getEmail_id() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("job_clsf = [" + getJob_clsf() + "]");
		System.out.println("advcs_feat = [" + getAdvcs_feat() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("tel_no = [" + getTel_no() + "]");
		System.out.println("mode2 = [" + getMode2() + "]");
		System.out.println("seq2 = [" + getSeq2() + "]");
		System.out.println("insrt_dt = [" + getInsrt_dt() + "]");
		System.out.println("dlco_info = [" + getDlco_info() + "]");
		System.out.println("chrg_pers2 = [" + getChrg_pers2() + "]");
		System.out.println("preng_yn = [" + getPreng_yn() + "]");
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
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String dlco_abrv_nm = req.getParameter("dlco_abrv_nm");
if( dlco_abrv_nm == null){
	System.out.println(this.toString+" : dlco_abrv_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_abrv_nm is "+dlco_abrv_nm );
}
String grp_cmpy_cd = req.getParameter("grp_cmpy_cd");
if( grp_cmpy_cd == null){
	System.out.println(this.toString+" : grp_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : grp_cmpy_cd is "+grp_cmpy_cd );
}
String eps_clsf_cd = req.getParameter("eps_clsf_cd");
if( eps_clsf_cd == null){
	System.out.println(this.toString+" : eps_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : eps_clsf_cd is "+eps_clsf_cd );
}
String cntr_yn = req.getParameter("cntr_yn");
if( cntr_yn == null){
	System.out.println(this.toString+" : cntr_yn is null" );
}else{
	System.out.println(this.toString+" : cntr_yn is "+cntr_yn );
}
String mang_clsf = req.getParameter("mang_clsf");
if( mang_clsf == null){
	System.out.println(this.toString+" : mang_clsf is null" );
}else{
	System.out.println(this.toString+" : mang_clsf is "+mang_clsf );
}
String oth_cmpy_dlco_yn = req.getParameter("oth_cmpy_dlco_yn");
if( oth_cmpy_dlco_yn == null){
	System.out.println(this.toString+" : oth_cmpy_dlco_yn is null" );
}else{
	System.out.println(this.toString+" : oth_cmpy_dlco_yn is "+oth_cmpy_dlco_yn );
}
String govern_advt_yn = req.getParameter("govern_advt_yn");
if( govern_advt_yn == null){
	System.out.println(this.toString+" : govern_advt_yn is null" );
}else{
	System.out.println(this.toString+" : govern_advt_yn is "+govern_advt_yn );
}
String cntr_type = req.getParameter("cntr_type");
if( cntr_type == null){
	System.out.println(this.toString+" : cntr_type is null" );
}else{
	System.out.println(this.toString+" : cntr_type is "+cntr_type );
}
String slcrg_pers = req.getParameter("slcrg_pers");
if( slcrg_pers == null){
	System.out.println(this.toString+" : slcrg_pers is null" );
}else{
	System.out.println(this.toString+" : slcrg_pers is "+slcrg_pers );
}
String mchrg_pers = req.getParameter("mchrg_pers");
if( mchrg_pers == null){
	System.out.println(this.toString+" : mchrg_pers is null" );
}else{
	System.out.println(this.toString+" : mchrg_pers is "+mchrg_pers );
}
String slcrg_pers_nm = req.getParameter("slcrg_pers_nm");
if( slcrg_pers_nm == null){
	System.out.println(this.toString+" : slcrg_pers_nm is null" );
}else{
	System.out.println(this.toString+" : slcrg_pers_nm is "+slcrg_pers_nm );
}
String mchrg_pers_nm = req.getParameter("mchrg_pers_nm");
if( mchrg_pers_nm == null){
	System.out.println(this.toString+" : mchrg_pers_nm is null" );
}else{
	System.out.println(this.toString+" : mchrg_pers_nm is "+mchrg_pers_nm );
}
String indt_cd = req.getParameter("indt_cd");
if( indt_cd == null){
	System.out.println(this.toString+" : indt_cd is null" );
}else{
	System.out.println(this.toString+" : indt_cd is "+indt_cd );
}
String type_cd = req.getParameter("type_cd");
if( type_cd == null){
	System.out.println(this.toString+" : type_cd is null" );
}else{
	System.out.println(this.toString+" : type_cd is "+type_cd );
}
String fndt_dt = req.getParameter("fndt_dt");
if( fndt_dt == null){
	System.out.println(this.toString+" : fndt_dt is null" );
}else{
	System.out.println(this.toString+" : fndt_dt is "+fndt_dt );
}
String dhon_dt = req.getParameter("dhon_dt");
if( dhon_dt == null){
	System.out.println(this.toString+" : dhon_dt is null" );
}else{
	System.out.println(this.toString+" : dhon_dt is "+dhon_dt );
}
String capt_amt = req.getParameter("capt_amt");
if( capt_amt == null){
	System.out.println(this.toString+" : capt_amt is null" );
}else{
	System.out.println(this.toString+" : capt_amt is "+capt_amt );
}
String gnr_advcs_yn = req.getParameter("gnr_advcs_yn");
if( gnr_advcs_yn == null){
	System.out.println(this.toString+" : gnr_advcs_yn is null" );
}else{
	System.out.println(this.toString+" : gnr_advcs_yn is "+gnr_advcs_yn );
}
String arow_advcs_yn = req.getParameter("arow_advcs_yn");
if( arow_advcs_yn == null){
	System.out.println(this.toString+" : arow_advcs_yn is null" );
}else{
	System.out.println(this.toString+" : arow_advcs_yn is "+arow_advcs_yn );
}
String agn_yn = req.getParameter("agn_yn");
if( agn_yn == null){
	System.out.println(this.toString+" : agn_yn is null" );
}else{
	System.out.println(this.toString+" : agn_yn is "+agn_yn );
}
String nmd_agn_yn = req.getParameter("nmd_agn_yn");
if( nmd_agn_yn == null){
	System.out.println(this.toString+" : nmd_agn_yn is null" );
}else{
	System.out.println(this.toString+" : nmd_agn_yn is "+nmd_agn_yn );
}
String advt_bo_yn = req.getParameter("advt_bo_yn");
if( advt_bo_yn == null){
	System.out.println(this.toString+" : advt_bo_yn is null" );
}else{
	System.out.println(this.toString+" : advt_bo_yn is "+advt_bo_yn );
}
String bo_bof_yn = req.getParameter("bo_bof_yn");
if( bo_bof_yn == null){
	System.out.println(this.toString+" : bo_bof_yn is null" );
}else{
	System.out.println(this.toString+" : bo_bof_yn is "+bo_bof_yn );
}
String del_yn = req.getParameter("del_yn");
if( del_yn == null){
	System.out.println(this.toString+" : del_yn is null" );
}else{
	System.out.println(this.toString+" : del_yn is "+del_yn );
}
String elec_tax_comp_cd = req.getParameter("elec_tax_comp_cd");
if( elec_tax_comp_cd == null){
	System.out.println(this.toString+" : elec_tax_comp_cd is null" );
}else{
	System.out.println(this.toString+" : elec_tax_comp_cd is "+elec_tax_comp_cd );
}
String email_id = req.getParameter("email_id");
if( email_id == null){
	System.out.println(this.toString+" : email_id is null" );
}else{
	System.out.println(this.toString+" : email_id is "+email_id );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String job_clsf = req.getParameter("job_clsf");
if( job_clsf == null){
	System.out.println(this.toString+" : job_clsf is null" );
}else{
	System.out.println(this.toString+" : job_clsf is "+job_clsf );
}
String advcs_feat = req.getParameter("advcs_feat");
if( advcs_feat == null){
	System.out.println(this.toString+" : advcs_feat is null" );
}else{
	System.out.println(this.toString+" : advcs_feat is "+advcs_feat );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String tel_no = req.getParameter("tel_no");
if( tel_no == null){
	System.out.println(this.toString+" : tel_no is null" );
}else{
	System.out.println(this.toString+" : tel_no is "+tel_no );
}
String mode2 = req.getParameter("mode2");
if( mode2 == null){
	System.out.println(this.toString+" : mode2 is null" );
}else{
	System.out.println(this.toString+" : mode2 is "+mode2 );
}
String seq2 = req.getParameter("seq2");
if( seq2 == null){
	System.out.println(this.toString+" : seq2 is null" );
}else{
	System.out.println(this.toString+" : seq2 is "+seq2 );
}
String insrt_dt = req.getParameter("insrt_dt");
if( insrt_dt == null){
	System.out.println(this.toString+" : insrt_dt is null" );
}else{
	System.out.println(this.toString+" : insrt_dt is "+insrt_dt );
}
String dlco_info = req.getParameter("dlco_info");
if( dlco_info == null){
	System.out.println(this.toString+" : dlco_info is null" );
}else{
	System.out.println(this.toString+" : dlco_info is "+dlco_info );
}
String chrg_pers2 = req.getParameter("chrg_pers2");
if( chrg_pers2 == null){
	System.out.println(this.toString+" : chrg_pers2 is null" );
}else{
	System.out.println(this.toString+" : chrg_pers2 is "+chrg_pers2 );
}
String preng_yn = req.getParameter("preng_yn");
if( preng_yn == null){
	System.out.println(this.toString+" : preng_yn is null" );
}else{
	System.out.println(this.toString+" : preng_yn is "+preng_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String flag = Util.checkString(req.getParameter("flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String dlco_abrv_nm = Util.checkString(req.getParameter("dlco_abrv_nm"));
String grp_cmpy_cd = Util.checkString(req.getParameter("grp_cmpy_cd"));
String eps_clsf_cd = Util.checkString(req.getParameter("eps_clsf_cd"));
String cntr_yn = Util.checkString(req.getParameter("cntr_yn"));
String mang_clsf = Util.checkString(req.getParameter("mang_clsf"));
String oth_cmpy_dlco_yn = Util.checkString(req.getParameter("oth_cmpy_dlco_yn"));
String govern_advt_yn = Util.checkString(req.getParameter("govern_advt_yn"));
String cntr_type = Util.checkString(req.getParameter("cntr_type"));
String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
String slcrg_pers_nm = Util.checkString(req.getParameter("slcrg_pers_nm"));
String mchrg_pers_nm = Util.checkString(req.getParameter("mchrg_pers_nm"));
String indt_cd = Util.checkString(req.getParameter("indt_cd"));
String type_cd = Util.checkString(req.getParameter("type_cd"));
String fndt_dt = Util.checkString(req.getParameter("fndt_dt"));
String dhon_dt = Util.checkString(req.getParameter("dhon_dt"));
String capt_amt = Util.checkString(req.getParameter("capt_amt"));
String gnr_advcs_yn = Util.checkString(req.getParameter("gnr_advcs_yn"));
String arow_advcs_yn = Util.checkString(req.getParameter("arow_advcs_yn"));
String agn_yn = Util.checkString(req.getParameter("agn_yn"));
String nmd_agn_yn = Util.checkString(req.getParameter("nmd_agn_yn"));
String advt_bo_yn = Util.checkString(req.getParameter("advt_bo_yn"));
String bo_bof_yn = Util.checkString(req.getParameter("bo_bof_yn"));
String del_yn = Util.checkString(req.getParameter("del_yn"));
String elec_tax_comp_cd = Util.checkString(req.getParameter("elec_tax_comp_cd"));
String email_id = Util.checkString(req.getParameter("email_id"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String mode = Util.checkString(req.getParameter("mode"));
String seq = Util.checkString(req.getParameter("seq"));
String job_clsf = Util.checkString(req.getParameter("job_clsf"));
String advcs_feat = Util.checkString(req.getParameter("advcs_feat"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String tel_no = Util.checkString(req.getParameter("tel_no"));
String mode2 = Util.checkString(req.getParameter("mode2"));
String seq2 = Util.checkString(req.getParameter("seq2"));
String insrt_dt = Util.checkString(req.getParameter("insrt_dt"));
String dlco_info = Util.checkString(req.getParameter("dlco_info"));
String chrg_pers2 = Util.checkString(req.getParameter("chrg_pers2"));
String preng_yn = Util.checkString(req.getParameter("preng_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String dlco_abrv_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_abrv_nm")));
String grp_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("grp_cmpy_cd")));
String eps_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("eps_clsf_cd")));
String cntr_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_yn")));
String mang_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_clsf")));
String oth_cmpy_dlco_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("oth_cmpy_dlco_yn")));
String govern_advt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("govern_advt_yn")));
String cntr_type = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_type")));
String slcrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers")));
String mchrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("mchrg_pers")));
String slcrg_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers_nm")));
String mchrg_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("mchrg_pers_nm")));
String indt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("indt_cd")));
String type_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("type_cd")));
String fndt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fndt_dt")));
String dhon_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("dhon_dt")));
String capt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("capt_amt")));
String gnr_advcs_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("gnr_advcs_yn")));
String arow_advcs_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("arow_advcs_yn")));
String agn_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("agn_yn")));
String nmd_agn_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("nmd_agn_yn")));
String advt_bo_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_bo_yn")));
String bo_bof_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_bof_yn")));
String del_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("del_yn")));
String elec_tax_comp_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("elec_tax_comp_cd")));
String email_id = Util.Uni2Ksc(Util.checkString(req.getParameter("email_id")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String job_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("job_clsf")));
String advcs_feat = Util.Uni2Ksc(Util.checkString(req.getParameter("advcs_feat")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no")));
String mode2 = Util.Uni2Ksc(Util.checkString(req.getParameter("mode2")));
String seq2 = Util.Uni2Ksc(Util.checkString(req.getParameter("seq2")));
String insrt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("insrt_dt")));
String dlco_info = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_info")));
String chrg_pers2 = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers2")));
String preng_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setDlco_no(dlco_no);
dm.setDlco_abrv_nm(dlco_abrv_nm);
dm.setGrp_cmpy_cd(grp_cmpy_cd);
dm.setEps_clsf_cd(eps_clsf_cd);
dm.setCntr_yn(cntr_yn);
dm.setMang_clsf(mang_clsf);
dm.setOth_cmpy_dlco_yn(oth_cmpy_dlco_yn);
dm.setGovern_advt_yn(govern_advt_yn);
dm.setCntr_type(cntr_type);
dm.setSlcrg_pers(slcrg_pers);
dm.setMchrg_pers(mchrg_pers);
dm.setSlcrg_pers_nm(slcrg_pers_nm);
dm.setMchrg_pers_nm(mchrg_pers_nm);
dm.setIndt_cd(indt_cd);
dm.setType_cd(type_cd);
dm.setFndt_dt(fndt_dt);
dm.setDhon_dt(dhon_dt);
dm.setCapt_amt(capt_amt);
dm.setGnr_advcs_yn(gnr_advcs_yn);
dm.setArow_advcs_yn(arow_advcs_yn);
dm.setAgn_yn(agn_yn);
dm.setNmd_agn_yn(nmd_agn_yn);
dm.setAdvt_bo_yn(advt_bo_yn);
dm.setBo_bof_yn(bo_bof_yn);
dm.setDel_yn(del_yn);
dm.setElec_tax_comp_cd(elec_tax_comp_cd);
dm.setEmail_id(email_id);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setMode(mode);
dm.setSeq(seq);
dm.setJob_clsf(job_clsf);
dm.setAdvcs_feat(advcs_feat);
dm.setChrg_pers(chrg_pers);
dm.setTel_no(tel_no);
dm.setMode2(mode2);
dm.setSeq2(seq2);
dm.setInsrt_dt(insrt_dt);
dm.setDlco_info(dlco_info);
dm.setChrg_pers2(chrg_pers2);
dm.setPreng_yn(preng_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 22 14:55:39 KST 2014 */