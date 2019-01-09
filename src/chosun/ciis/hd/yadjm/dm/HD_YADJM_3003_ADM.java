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


package chosun.ciis.hd.yadjm.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.yadjm.ds.*;
import chosun.ciis.hd.yadjm.rec.*;

/**
 * 
 */


public class HD_YADJM_3003_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String adjm_rvrs_yy;
	public String emp_no;
	public String flnm;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String mode;
	public String faml_seq;
	public String faml_rshp_cd;
	public String faml_rshp_nm;
	public String faml_flnm;
	public String faml_prn;
	public String nmat_yn;
	public String ocpn_cd;
	public String offi_nm;
	public String posi;
	public String schir_cd;
	public String dth_dt;
	public String spos_dduc_obj_yn;
	public String child_dduc_obj_yn;
	public String oldg_dduc_obj_yn;
	public String rspc_dduc_obj_yn;
	public String obcl_pers_dduc_obj_yn;
	public String fml_hshd_dduc_yn;
	public String care_fee_dduc_yn;
	public String adopt_dt;

	public HD_YADJM_3003_ADM(){}
	public HD_YADJM_3003_ADM(String cmpy_cd, String adjm_rvrs_yy, String emp_no, String flnm, String incmg_pers_ip, String incmg_pers, String mode, String faml_seq, String faml_rshp_cd, String faml_rshp_nm, String faml_flnm, String faml_prn, String nmat_yn, String ocpn_cd, String offi_nm, String posi, String schir_cd, String dth_dt, String spos_dduc_obj_yn, String child_dduc_obj_yn, String oldg_dduc_obj_yn, String rspc_dduc_obj_yn, String obcl_pers_dduc_obj_yn, String fml_hshd_dduc_yn, String care_fee_dduc_yn, String adopt_dt){
		this.cmpy_cd = cmpy_cd;
		this.adjm_rvrs_yy = adjm_rvrs_yy;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.mode = mode;
		this.faml_seq = faml_seq;
		this.faml_rshp_cd = faml_rshp_cd;
		this.faml_rshp_nm = faml_rshp_nm;
		this.faml_flnm = faml_flnm;
		this.faml_prn = faml_prn;
		this.nmat_yn = nmat_yn;
		this.ocpn_cd = ocpn_cd;
		this.offi_nm = offi_nm;
		this.posi = posi;
		this.schir_cd = schir_cd;
		this.dth_dt = dth_dt;
		this.spos_dduc_obj_yn = spos_dduc_obj_yn;
		this.child_dduc_obj_yn = child_dduc_obj_yn;
		this.oldg_dduc_obj_yn = oldg_dduc_obj_yn;
		this.rspc_dduc_obj_yn = rspc_dduc_obj_yn;
		this.obcl_pers_dduc_obj_yn = obcl_pers_dduc_obj_yn;
		this.fml_hshd_dduc_yn = fml_hshd_dduc_yn;
		this.care_fee_dduc_yn = care_fee_dduc_yn;
		this.adopt_dt = adopt_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAdjm_rvrs_yy(String adjm_rvrs_yy){
		this.adjm_rvrs_yy = adjm_rvrs_yy;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setFaml_seq(String faml_seq){
		this.faml_seq = faml_seq;
	}

	public void setFaml_rshp_cd(String faml_rshp_cd){
		this.faml_rshp_cd = faml_rshp_cd;
	}

	public void setFaml_rshp_nm(String faml_rshp_nm){
		this.faml_rshp_nm = faml_rshp_nm;
	}

	public void setFaml_flnm(String faml_flnm){
		this.faml_flnm = faml_flnm;
	}

	public void setFaml_prn(String faml_prn){
		this.faml_prn = faml_prn;
	}

	public void setNmat_yn(String nmat_yn){
		this.nmat_yn = nmat_yn;
	}

	public void setOcpn_cd(String ocpn_cd){
		this.ocpn_cd = ocpn_cd;
	}

	public void setOffi_nm(String offi_nm){
		this.offi_nm = offi_nm;
	}

	public void setPosi(String posi){
		this.posi = posi;
	}

	public void setSchir_cd(String schir_cd){
		this.schir_cd = schir_cd;
	}

	public void setDth_dt(String dth_dt){
		this.dth_dt = dth_dt;
	}

	public void setSpos_dduc_obj_yn(String spos_dduc_obj_yn){
		this.spos_dduc_obj_yn = spos_dduc_obj_yn;
	}

	public void setChild_dduc_obj_yn(String child_dduc_obj_yn){
		this.child_dduc_obj_yn = child_dduc_obj_yn;
	}

	public void setOldg_dduc_obj_yn(String oldg_dduc_obj_yn){
		this.oldg_dduc_obj_yn = oldg_dduc_obj_yn;
	}

	public void setRspc_dduc_obj_yn(String rspc_dduc_obj_yn){
		this.rspc_dduc_obj_yn = rspc_dduc_obj_yn;
	}

	public void setObcl_pers_dduc_obj_yn(String obcl_pers_dduc_obj_yn){
		this.obcl_pers_dduc_obj_yn = obcl_pers_dduc_obj_yn;
	}

	public void setFml_hshd_dduc_yn(String fml_hshd_dduc_yn){
		this.fml_hshd_dduc_yn = fml_hshd_dduc_yn;
	}

	public void setCare_fee_dduc_yn(String care_fee_dduc_yn){
		this.care_fee_dduc_yn = care_fee_dduc_yn;
	}

	public void setAdopt_dt(String adopt_dt){
		this.adopt_dt = adopt_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAdjm_rvrs_yy(){
		return this.adjm_rvrs_yy;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getFaml_seq(){
		return this.faml_seq;
	}

	public String getFaml_rshp_cd(){
		return this.faml_rshp_cd;
	}

	public String getFaml_rshp_nm(){
		return this.faml_rshp_nm;
	}

	public String getFaml_flnm(){
		return this.faml_flnm;
	}

	public String getFaml_prn(){
		return this.faml_prn;
	}

	public String getNmat_yn(){
		return this.nmat_yn;
	}

	public String getOcpn_cd(){
		return this.ocpn_cd;
	}

	public String getOffi_nm(){
		return this.offi_nm;
	}

	public String getPosi(){
		return this.posi;
	}

	public String getSchir_cd(){
		return this.schir_cd;
	}

	public String getDth_dt(){
		return this.dth_dt;
	}

	public String getSpos_dduc_obj_yn(){
		return this.spos_dduc_obj_yn;
	}

	public String getChild_dduc_obj_yn(){
		return this.child_dduc_obj_yn;
	}

	public String getOldg_dduc_obj_yn(){
		return this.oldg_dduc_obj_yn;
	}

	public String getRspc_dduc_obj_yn(){
		return this.rspc_dduc_obj_yn;
	}

	public String getObcl_pers_dduc_obj_yn(){
		return this.obcl_pers_dduc_obj_yn;
	}

	public String getFml_hshd_dduc_yn(){
		return this.fml_hshd_dduc_yn;
	}

	public String getCare_fee_dduc_yn(){
		return this.care_fee_dduc_yn;
	}

	public String getAdopt_dt(){
		return this.adopt_dt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_YADJM_3003_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_YADJM_3003_ADM dm = (HD_YADJM_3003_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.adjm_rvrs_yy);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.flnm);
		cstmt.setString(7, dm.incmg_pers_ip);
		cstmt.setString(8, dm.incmg_pers);
		cstmt.setString(9, dm.mode);
		cstmt.setString(10, dm.faml_seq);
		cstmt.setString(11, dm.faml_rshp_cd);
		cstmt.setString(12, dm.faml_rshp_nm);
		cstmt.setString(13, dm.faml_flnm);
		cstmt.setString(14, dm.faml_prn);
		cstmt.setString(15, dm.nmat_yn);
		cstmt.setString(16, dm.ocpn_cd);
		cstmt.setString(17, dm.offi_nm);
		cstmt.setString(18, dm.posi);
		cstmt.setString(19, dm.schir_cd);
		cstmt.setString(20, dm.dth_dt);
		cstmt.setString(21, dm.spos_dduc_obj_yn);
		cstmt.setString(22, dm.child_dduc_obj_yn);
		cstmt.setString(23, dm.oldg_dduc_obj_yn);
		cstmt.setString(24, dm.rspc_dduc_obj_yn);
		cstmt.setString(25, dm.obcl_pers_dduc_obj_yn);
		cstmt.setString(26, dm.fml_hshd_dduc_yn);
		cstmt.setString(27, dm.care_fee_dduc_yn);
		cstmt.setString(28, dm.adopt_dt);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_YADJM_3003_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("adjm_rvrs_yy = [" + getAdjm_rvrs_yy() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("faml_seq = [" + getFaml_seq() + "]");
		System.out.println("faml_rshp_cd = [" + getFaml_rshp_cd() + "]");
		System.out.println("faml_rshp_nm = [" + getFaml_rshp_nm() + "]");
		System.out.println("faml_flnm = [" + getFaml_flnm() + "]");
		System.out.println("faml_prn = [" + getFaml_prn() + "]");
		System.out.println("nmat_yn = [" + getNmat_yn() + "]");
		System.out.println("ocpn_cd = [" + getOcpn_cd() + "]");
		System.out.println("offi_nm = [" + getOffi_nm() + "]");
		System.out.println("posi = [" + getPosi() + "]");
		System.out.println("schir_cd = [" + getSchir_cd() + "]");
		System.out.println("dth_dt = [" + getDth_dt() + "]");
		System.out.println("spos_dduc_obj_yn = [" + getSpos_dduc_obj_yn() + "]");
		System.out.println("child_dduc_obj_yn = [" + getChild_dduc_obj_yn() + "]");
		System.out.println("oldg_dduc_obj_yn = [" + getOldg_dduc_obj_yn() + "]");
		System.out.println("rspc_dduc_obj_yn = [" + getRspc_dduc_obj_yn() + "]");
		System.out.println("obcl_pers_dduc_obj_yn = [" + getObcl_pers_dduc_obj_yn() + "]");
		System.out.println("fml_hshd_dduc_yn = [" + getFml_hshd_dduc_yn() + "]");
		System.out.println("care_fee_dduc_yn = [" + getCare_fee_dduc_yn() + "]");
		System.out.println("adopt_dt = [" + getAdopt_dt() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String adjm_rvrs_yy = req.getParameter("adjm_rvrs_yy");
if( adjm_rvrs_yy == null){
	System.out.println(this.toString+" : adjm_rvrs_yy is null" );
}else{
	System.out.println(this.toString+" : adjm_rvrs_yy is "+adjm_rvrs_yy );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String faml_seq = req.getParameter("faml_seq");
if( faml_seq == null){
	System.out.println(this.toString+" : faml_seq is null" );
}else{
	System.out.println(this.toString+" : faml_seq is "+faml_seq );
}
String faml_rshp_cd = req.getParameter("faml_rshp_cd");
if( faml_rshp_cd == null){
	System.out.println(this.toString+" : faml_rshp_cd is null" );
}else{
	System.out.println(this.toString+" : faml_rshp_cd is "+faml_rshp_cd );
}
String faml_rshp_nm = req.getParameter("faml_rshp_nm");
if( faml_rshp_nm == null){
	System.out.println(this.toString+" : faml_rshp_nm is null" );
}else{
	System.out.println(this.toString+" : faml_rshp_nm is "+faml_rshp_nm );
}
String faml_flnm = req.getParameter("faml_flnm");
if( faml_flnm == null){
	System.out.println(this.toString+" : faml_flnm is null" );
}else{
	System.out.println(this.toString+" : faml_flnm is "+faml_flnm );
}
String faml_prn = req.getParameter("faml_prn");
if( faml_prn == null){
	System.out.println(this.toString+" : faml_prn is null" );
}else{
	System.out.println(this.toString+" : faml_prn is "+faml_prn );
}
String nmat_yn = req.getParameter("nmat_yn");
if( nmat_yn == null){
	System.out.println(this.toString+" : nmat_yn is null" );
}else{
	System.out.println(this.toString+" : nmat_yn is "+nmat_yn );
}
String ocpn_cd = req.getParameter("ocpn_cd");
if( ocpn_cd == null){
	System.out.println(this.toString+" : ocpn_cd is null" );
}else{
	System.out.println(this.toString+" : ocpn_cd is "+ocpn_cd );
}
String offi_nm = req.getParameter("offi_nm");
if( offi_nm == null){
	System.out.println(this.toString+" : offi_nm is null" );
}else{
	System.out.println(this.toString+" : offi_nm is "+offi_nm );
}
String posi = req.getParameter("posi");
if( posi == null){
	System.out.println(this.toString+" : posi is null" );
}else{
	System.out.println(this.toString+" : posi is "+posi );
}
String schir_cd = req.getParameter("schir_cd");
if( schir_cd == null){
	System.out.println(this.toString+" : schir_cd is null" );
}else{
	System.out.println(this.toString+" : schir_cd is "+schir_cd );
}
String dth_dt = req.getParameter("dth_dt");
if( dth_dt == null){
	System.out.println(this.toString+" : dth_dt is null" );
}else{
	System.out.println(this.toString+" : dth_dt is "+dth_dt );
}
String spos_dduc_obj_yn = req.getParameter("spos_dduc_obj_yn");
if( spos_dduc_obj_yn == null){
	System.out.println(this.toString+" : spos_dduc_obj_yn is null" );
}else{
	System.out.println(this.toString+" : spos_dduc_obj_yn is "+spos_dduc_obj_yn );
}
String child_dduc_obj_yn = req.getParameter("child_dduc_obj_yn");
if( child_dduc_obj_yn == null){
	System.out.println(this.toString+" : child_dduc_obj_yn is null" );
}else{
	System.out.println(this.toString+" : child_dduc_obj_yn is "+child_dduc_obj_yn );
}
String oldg_dduc_obj_yn = req.getParameter("oldg_dduc_obj_yn");
if( oldg_dduc_obj_yn == null){
	System.out.println(this.toString+" : oldg_dduc_obj_yn is null" );
}else{
	System.out.println(this.toString+" : oldg_dduc_obj_yn is "+oldg_dduc_obj_yn );
}
String rspc_dduc_obj_yn = req.getParameter("rspc_dduc_obj_yn");
if( rspc_dduc_obj_yn == null){
	System.out.println(this.toString+" : rspc_dduc_obj_yn is null" );
}else{
	System.out.println(this.toString+" : rspc_dduc_obj_yn is "+rspc_dduc_obj_yn );
}
String obcl_pers_dduc_obj_yn = req.getParameter("obcl_pers_dduc_obj_yn");
if( obcl_pers_dduc_obj_yn == null){
	System.out.println(this.toString+" : obcl_pers_dduc_obj_yn is null" );
}else{
	System.out.println(this.toString+" : obcl_pers_dduc_obj_yn is "+obcl_pers_dduc_obj_yn );
}
String fml_hshd_dduc_yn = req.getParameter("fml_hshd_dduc_yn");
if( fml_hshd_dduc_yn == null){
	System.out.println(this.toString+" : fml_hshd_dduc_yn is null" );
}else{
	System.out.println(this.toString+" : fml_hshd_dduc_yn is "+fml_hshd_dduc_yn );
}
String care_fee_dduc_yn = req.getParameter("care_fee_dduc_yn");
if( care_fee_dduc_yn == null){
	System.out.println(this.toString+" : care_fee_dduc_yn is null" );
}else{
	System.out.println(this.toString+" : care_fee_dduc_yn is "+care_fee_dduc_yn );
}
String adopt_dt = req.getParameter("adopt_dt");
if( adopt_dt == null){
	System.out.println(this.toString+" : adopt_dt is null" );
}else{
	System.out.println(this.toString+" : adopt_dt is "+adopt_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String mode = Util.checkString(req.getParameter("mode"));
String faml_seq = Util.checkString(req.getParameter("faml_seq"));
String faml_rshp_cd = Util.checkString(req.getParameter("faml_rshp_cd"));
String faml_rshp_nm = Util.checkString(req.getParameter("faml_rshp_nm"));
String faml_flnm = Util.checkString(req.getParameter("faml_flnm"));
String faml_prn = Util.checkString(req.getParameter("faml_prn"));
String nmat_yn = Util.checkString(req.getParameter("nmat_yn"));
String ocpn_cd = Util.checkString(req.getParameter("ocpn_cd"));
String offi_nm = Util.checkString(req.getParameter("offi_nm"));
String posi = Util.checkString(req.getParameter("posi"));
String schir_cd = Util.checkString(req.getParameter("schir_cd"));
String dth_dt = Util.checkString(req.getParameter("dth_dt"));
String spos_dduc_obj_yn = Util.checkString(req.getParameter("spos_dduc_obj_yn"));
String child_dduc_obj_yn = Util.checkString(req.getParameter("child_dduc_obj_yn"));
String oldg_dduc_obj_yn = Util.checkString(req.getParameter("oldg_dduc_obj_yn"));
String rspc_dduc_obj_yn = Util.checkString(req.getParameter("rspc_dduc_obj_yn"));
String obcl_pers_dduc_obj_yn = Util.checkString(req.getParameter("obcl_pers_dduc_obj_yn"));
String fml_hshd_dduc_yn = Util.checkString(req.getParameter("fml_hshd_dduc_yn"));
String care_fee_dduc_yn = Util.checkString(req.getParameter("care_fee_dduc_yn"));
String adopt_dt = Util.checkString(req.getParameter("adopt_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String adjm_rvrs_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_rvrs_yy")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String faml_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_seq")));
String faml_rshp_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_rshp_cd")));
String faml_rshp_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_rshp_nm")));
String faml_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_flnm")));
String faml_prn = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_prn")));
String nmat_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("nmat_yn")));
String ocpn_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("ocpn_cd")));
String offi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("offi_nm")));
String posi = Util.Uni2Ksc(Util.checkString(req.getParameter("posi")));
String schir_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("schir_cd")));
String dth_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("dth_dt")));
String spos_dduc_obj_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("spos_dduc_obj_yn")));
String child_dduc_obj_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("child_dduc_obj_yn")));
String oldg_dduc_obj_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("oldg_dduc_obj_yn")));
String rspc_dduc_obj_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("rspc_dduc_obj_yn")));
String obcl_pers_dduc_obj_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("obcl_pers_dduc_obj_yn")));
String fml_hshd_dduc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("fml_hshd_dduc_yn")));
String care_fee_dduc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("care_fee_dduc_yn")));
String adopt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("adopt_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAdjm_rvrs_yy(adjm_rvrs_yy);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setMode(mode);
dm.setFaml_seq(faml_seq);
dm.setFaml_rshp_cd(faml_rshp_cd);
dm.setFaml_rshp_nm(faml_rshp_nm);
dm.setFaml_flnm(faml_flnm);
dm.setFaml_prn(faml_prn);
dm.setNmat_yn(nmat_yn);
dm.setOcpn_cd(ocpn_cd);
dm.setOffi_nm(offi_nm);
dm.setPosi(posi);
dm.setSchir_cd(schir_cd);
dm.setDth_dt(dth_dt);
dm.setSpos_dduc_obj_yn(spos_dduc_obj_yn);
dm.setChild_dduc_obj_yn(child_dduc_obj_yn);
dm.setOldg_dduc_obj_yn(oldg_dduc_obj_yn);
dm.setRspc_dduc_obj_yn(rspc_dduc_obj_yn);
dm.setObcl_pers_dduc_obj_yn(obcl_pers_dduc_obj_yn);
dm.setFml_hshd_dduc_yn(fml_hshd_dduc_yn);
dm.setCare_fee_dduc_yn(care_fee_dduc_yn);
dm.setAdopt_dt(adopt_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 11 17:13:13 KST 2010 */