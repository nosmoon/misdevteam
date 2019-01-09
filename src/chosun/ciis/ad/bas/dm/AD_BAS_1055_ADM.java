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

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_BAS_1055_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String dlco_no;
	
	public String grp_cmpy_yn;
	public String grp_cmpy;
	public String indt_clsf_yn;
	public String indt_clsf;
	public String type_clsf_yn;
	public String type_clsf;
	public String slcrg_pers_yn;
	public String slcrg_pers;
	public String mchrg_pers_yn;
	public String mchrg_pers;
	
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_BAS_1055_ADM(){}
	
	public AD_BAS_1055_ADM(String flag, String cmpy_cd, String dlco_no, String grp_cmpy_yn, String grp_cmpy, String indt_clsf_yn, String indt_clsf, String type_clsf_yn, String type_clsf, String slcrg_pers_yn, String slcrg_pers, String mchrg_pers_yn, String mchrg_pers, String incmg_pers_ip, String incmg_pers) {
		super();
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.dlco_no = dlco_no;
		this.grp_cmpy_yn = grp_cmpy_yn;
		this.grp_cmpy = grp_cmpy;
		this.indt_clsf_yn = indt_clsf_yn;
		this.indt_clsf = indt_clsf;
		this.type_clsf_yn = type_clsf_yn;
		this.type_clsf = type_clsf;
		this.slcrg_pers_yn = slcrg_pers_yn;
		this.slcrg_pers = slcrg_pers;
		this.mchrg_pers_yn = mchrg_pers_yn;
		this.mchrg_pers = mchrg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}


	public String getIncmg_pers() {
		return incmg_pers;
	}

	public void setIncmg_pers(String incmg_pers) {
		this.incmg_pers = incmg_pers;
	}

	public String getIncmg_pers_ip() {
		return incmg_pers_ip;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip) {
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd() {
		return cmpy_cd;
	}

	public void setCmpy_cd(String cmpy_cd) {
		this.cmpy_cd = cmpy_cd;
	}

	public String getDlco_no() {
		return dlco_no;
	}

	public void setDlco_no(String dlco_no) {
		this.dlco_no = dlco_no;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getGrp_cmpy() {
		return grp_cmpy;
	}

	public void setGrp_cmpy(String grp_cmpy) {
		this.grp_cmpy = grp_cmpy;
	}

	public String getGrp_cmpy_yn() {
		return grp_cmpy_yn;
	}

	public void setGrp_cmpy_yn(String grp_cmpy_yn) {
		this.grp_cmpy_yn = grp_cmpy_yn;
	}

	public String getIndt_clsf() {
		return indt_clsf;
	}

	public void setIndt_clsf(String indt_clsf) {
		this.indt_clsf = indt_clsf;
	}

	public String getIndt_clsf_yn() {
		return indt_clsf_yn;
	}

	public void setIndt_clsf_yn(String indt_clsf_yn) {
		this.indt_clsf_yn = indt_clsf_yn;
	}

	public String getMchrg_pers() {
		return mchrg_pers;
	}

	public void setMchrg_pers(String mchrg_pers) {
		this.mchrg_pers = mchrg_pers;
	}

	public String getMchrg_pers_yn() {
		return mchrg_pers_yn;
	}

	public void setMchrg_pers_yn(String mchrg_pers_yn) {
		this.mchrg_pers_yn = mchrg_pers_yn;
	}

	public String getSlcrg_pers() {
		return slcrg_pers;
	}

	public void setSlcrg_pers(String slcrg_pers) {
		this.slcrg_pers = slcrg_pers;
	}

	public String getSlcrg_pers_yn() {
		return slcrg_pers_yn;
	}

	public void setSlcrg_pers_yn(String slcrg_pers_yn) {
		this.slcrg_pers_yn = slcrg_pers_yn;
	}

	public String getType_clsf() {
		return type_clsf;
	}

	public void setType_clsf(String type_clsf) {
		this.type_clsf = type_clsf;
	}

	public String getType_clsf_yn() {
		return type_clsf_yn;
	}

	public void setType_clsf_yn(String type_clsf_yn) {
		this.type_clsf_yn = type_clsf_yn;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BAS_1055_A(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_1055_ADM dm = (AD_BAS_1055_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.dlco_no);
		cstmt.setString(6, dm.grp_cmpy_yn);
		cstmt.setString(7, dm.grp_cmpy);
		cstmt.setString(8, dm.indt_clsf_yn);
		cstmt.setString(9, dm.indt_clsf);
		cstmt.setString(10, dm.type_clsf_yn);
		cstmt.setString(11, dm.type_clsf);
		cstmt.setString(12, dm.slcrg_pers_yn);
		cstmt.setString(13, dm.slcrg_pers);
		cstmt.setString(14, dm.mchrg_pers_yn);
		cstmt.setString(15, dm.mchrg_pers);
		cstmt.setString(16, dm.incmg_pers_ip);
		cstmt.setString(17, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_1055_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
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
String fndt_dt = Util.checkString(req.getParameter("fndt_dt"));
String dhon_dt = Util.checkString(req.getParameter("dhon_dt"));
String capt_amt = Util.checkString(req.getParameter("capt_amt"));
String gnr_advcs_yn = Util.checkString(req.getParameter("gnr_advcs_yn"));
String arow_advcs_yn = Util.checkString(req.getParameter("arow_advcs_yn"));
String agn_yn = Util.checkString(req.getParameter("agn_yn"));
String advt_bo_yn = Util.checkString(req.getParameter("advt_bo_yn"));
String bo_bof_yn = Util.checkString(req.getParameter("bo_bof_yn"));
String del_yn = Util.checkString(req.getParameter("del_yn"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String mode = Util.checkString(req.getParameter("mode"));
String seq = Util.checkString(req.getParameter("seq"));
String job_clsf = Util.checkString(req.getParameter("job_clsf"));
String advcs_feat = Util.checkString(req.getParameter("advcs_feat"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String tel_no = Util.checkString(req.getParameter("tel_no"));
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
String fndt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fndt_dt")));
String dhon_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("dhon_dt")));
String capt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("capt_amt")));
String gnr_advcs_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("gnr_advcs_yn")));
String arow_advcs_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("arow_advcs_yn")));
String agn_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("agn_yn")));
String advt_bo_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_bo_yn")));
String bo_bof_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_bof_yn")));
String del_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("del_yn")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String job_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("job_clsf")));
String advcs_feat = Util.Uni2Ksc(Util.checkString(req.getParameter("advcs_feat")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no")));
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
dm.setFndt_dt(fndt_dt);
dm.setDhon_dt(dhon_dt);
dm.setCapt_amt(capt_amt);
dm.setGnr_advcs_yn(gnr_advcs_yn);
dm.setArow_advcs_yn(arow_advcs_yn);
dm.setAgn_yn(agn_yn);
dm.setAdvt_bo_yn(advt_bo_yn);
dm.setBo_bof_yn(bo_bof_yn);
dm.setDel_yn(del_yn);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setMode(mode);
dm.setSeq(seq);
dm.setJob_clsf(job_clsf);
dm.setAdvcs_feat(advcs_feat);
dm.setChrg_pers(chrg_pers);
dm.setTel_no(tel_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 11 09:55:38 KST 2009 */