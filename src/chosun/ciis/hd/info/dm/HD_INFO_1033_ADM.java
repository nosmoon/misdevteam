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


package chosun.ciis.hd.info.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.ds.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_1033_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String faml_seq;
	public String faml_rshp_cd;
	public String faml_prn;
	public String faml_flnm;
	public String ocpn_cd;
	public String offi_nm;
	public String posi;
	public String schir_cd;
	public String nmat_yn;
	public String dth_dt;
	public String spos_dduc_obj_yn;
	public String child_dduc_obj_yn;
	public String oldg_dduc_obj_yn;
	public String obcl_pers_dduc_obj_yn;
	public String rspc_dduc_obj_yn;
	public String fml_hshd_dduc_yn;
	public String care_fee_dduc_yn;
	public String adopt_dt;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_INFO_1033_ADM(){}
	public HD_INFO_1033_ADM(String mode, String cmpy_cd, String emp_no, String faml_seq, String faml_rshp_cd, String faml_prn, String faml_flnm, String ocpn_cd, String offi_nm, String posi, String schir_cd, String nmat_yn, String dth_dt, String spos_dduc_obj_yn, String child_dduc_obj_yn, String oldg_dduc_obj_yn, String obcl_pers_dduc_obj_yn, String rspc_dduc_obj_yn, String fml_hshd_dduc_yn, String care_fee_dduc_yn, String adopt_dt, String incmg_pers_ipadd, String incmg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.faml_seq = faml_seq;
		this.faml_rshp_cd = faml_rshp_cd;
		this.faml_prn = faml_prn;
		this.faml_flnm = faml_flnm;
		this.ocpn_cd = ocpn_cd;
		this.offi_nm = offi_nm;
		this.posi = posi;
		this.schir_cd = schir_cd;
		this.nmat_yn = nmat_yn;
		this.dth_dt = dth_dt;
		this.spos_dduc_obj_yn = spos_dduc_obj_yn;
		this.child_dduc_obj_yn = child_dduc_obj_yn;
		this.oldg_dduc_obj_yn = oldg_dduc_obj_yn;
		this.obcl_pers_dduc_obj_yn = obcl_pers_dduc_obj_yn;
		this.rspc_dduc_obj_yn = rspc_dduc_obj_yn;
		this.fml_hshd_dduc_yn = fml_hshd_dduc_yn;
		this.care_fee_dduc_yn = care_fee_dduc_yn;
		this.adopt_dt = adopt_dt;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFaml_seq(String faml_seq){
		this.faml_seq = faml_seq;
	}

	public void setFaml_rshp_cd(String faml_rshp_cd){
		this.faml_rshp_cd = faml_rshp_cd;
	}

	public void setFaml_prn(String faml_prn){
		this.faml_prn = faml_prn;
	}

	public void setFaml_flnm(String faml_flnm){
		this.faml_flnm = faml_flnm;
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

	public void setNmat_yn(String nmat_yn){
		this.nmat_yn = nmat_yn;
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

	public void setObcl_pers_dduc_obj_yn(String obcl_pers_dduc_obj_yn){
		this.obcl_pers_dduc_obj_yn = obcl_pers_dduc_obj_yn;
	}

	public void setRspc_dduc_obj_yn(String rspc_dduc_obj_yn){
		this.rspc_dduc_obj_yn = rspc_dduc_obj_yn;
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

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFaml_seq(){
		return this.faml_seq;
	}

	public String getFaml_rshp_cd(){
		return this.faml_rshp_cd;
	}

	public String getFaml_prn(){
		return this.faml_prn;
	}

	public String getFaml_flnm(){
		return this.faml_flnm;
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

	public String getNmat_yn(){
		return this.nmat_yn;
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

	public String getObcl_pers_dduc_obj_yn(){
		return this.obcl_pers_dduc_obj_yn;
	}

	public String getRspc_dduc_obj_yn(){
		return this.rspc_dduc_obj_yn;
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

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_1033_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_1033_ADM dm = (HD_INFO_1033_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.faml_seq);
		cstmt.setString(7, dm.faml_rshp_cd);
		cstmt.setString(8, dm.faml_prn);
		cstmt.setString(9, dm.faml_flnm);
		cstmt.setString(10, dm.ocpn_cd);
		cstmt.setString(11, dm.offi_nm);
		cstmt.setString(12, dm.posi);
		cstmt.setString(13, dm.schir_cd);
		cstmt.setString(14, dm.nmat_yn);
		cstmt.setString(15, dm.dth_dt);
		cstmt.setString(16, dm.spos_dduc_obj_yn);
		cstmt.setString(17, dm.child_dduc_obj_yn);
		cstmt.setString(18, dm.oldg_dduc_obj_yn);
		cstmt.setString(19, dm.obcl_pers_dduc_obj_yn);
		cstmt.setString(20, dm.rspc_dduc_obj_yn);
		cstmt.setString(21, dm.fml_hshd_dduc_yn);
		cstmt.setString(22, dm.care_fee_dduc_yn);
		cstmt.setString(23, dm.adopt_dt);
		cstmt.setString(24, dm.incmg_pers_ipadd);
		cstmt.setString(25, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.info.ds.HD_INFO_1033_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("faml_seq = [" + getFaml_seq() + "]");
		System.out.println("faml_rshp_cd = [" + getFaml_rshp_cd() + "]");
		System.out.println("faml_prn = [" + getFaml_prn() + "]");
		System.out.println("faml_flnm = [" + getFaml_flnm() + "]");
		System.out.println("ocpn_cd = [" + getOcpn_cd() + "]");
		System.out.println("offi_nm = [" + getOffi_nm() + "]");
		System.out.println("posi = [" + getPosi() + "]");
		System.out.println("schir_cd = [" + getSchir_cd() + "]");
		System.out.println("nmat_yn = [" + getNmat_yn() + "]");
		System.out.println("dth_dt = [" + getDth_dt() + "]");
		System.out.println("spos_dduc_obj_yn = [" + getSpos_dduc_obj_yn() + "]");
		System.out.println("child_dduc_obj_yn = [" + getChild_dduc_obj_yn() + "]");
		System.out.println("oldg_dduc_obj_yn = [" + getOldg_dduc_obj_yn() + "]");
		System.out.println("obcl_pers_dduc_obj_yn = [" + getObcl_pers_dduc_obj_yn() + "]");
		System.out.println("rspc_dduc_obj_yn = [" + getRspc_dduc_obj_yn() + "]");
		System.out.println("fml_hshd_dduc_yn = [" + getFml_hshd_dduc_yn() + "]");
		System.out.println("care_fee_dduc_yn = [" + getCare_fee_dduc_yn() + "]");
		System.out.println("adopt_dt = [" + getAdopt_dt() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
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
String faml_prn = req.getParameter("faml_prn");
if( faml_prn == null){
	System.out.println(this.toString+" : faml_prn is null" );
}else{
	System.out.println(this.toString+" : faml_prn is "+faml_prn );
}
String faml_flnm = req.getParameter("faml_flnm");
if( faml_flnm == null){
	System.out.println(this.toString+" : faml_flnm is null" );
}else{
	System.out.println(this.toString+" : faml_flnm is "+faml_flnm );
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
String nmat_yn = req.getParameter("nmat_yn");
if( nmat_yn == null){
	System.out.println(this.toString+" : nmat_yn is null" );
}else{
	System.out.println(this.toString+" : nmat_yn is "+nmat_yn );
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
String obcl_pers_dduc_obj_yn = req.getParameter("obcl_pers_dduc_obj_yn");
if( obcl_pers_dduc_obj_yn == null){
	System.out.println(this.toString+" : obcl_pers_dduc_obj_yn is null" );
}else{
	System.out.println(this.toString+" : obcl_pers_dduc_obj_yn is "+obcl_pers_dduc_obj_yn );
}
String rspc_dduc_obj_yn = req.getParameter("rspc_dduc_obj_yn");
if( rspc_dduc_obj_yn == null){
	System.out.println(this.toString+" : rspc_dduc_obj_yn is null" );
}else{
	System.out.println(this.toString+" : rspc_dduc_obj_yn is "+rspc_dduc_obj_yn );
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
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String faml_seq = Util.checkString(req.getParameter("faml_seq"));
String faml_rshp_cd = Util.checkString(req.getParameter("faml_rshp_cd"));
String faml_prn = Util.checkString(req.getParameter("faml_prn"));
String faml_flnm = Util.checkString(req.getParameter("faml_flnm"));
String ocpn_cd = Util.checkString(req.getParameter("ocpn_cd"));
String offi_nm = Util.checkString(req.getParameter("offi_nm"));
String posi = Util.checkString(req.getParameter("posi"));
String schir_cd = Util.checkString(req.getParameter("schir_cd"));
String nmat_yn = Util.checkString(req.getParameter("nmat_yn"));
String dth_dt = Util.checkString(req.getParameter("dth_dt"));
String spos_dduc_obj_yn = Util.checkString(req.getParameter("spos_dduc_obj_yn"));
String child_dduc_obj_yn = Util.checkString(req.getParameter("child_dduc_obj_yn"));
String oldg_dduc_obj_yn = Util.checkString(req.getParameter("oldg_dduc_obj_yn"));
String obcl_pers_dduc_obj_yn = Util.checkString(req.getParameter("obcl_pers_dduc_obj_yn"));
String rspc_dduc_obj_yn = Util.checkString(req.getParameter("rspc_dduc_obj_yn"));
String fml_hshd_dduc_yn = Util.checkString(req.getParameter("fml_hshd_dduc_yn"));
String care_fee_dduc_yn = Util.checkString(req.getParameter("care_fee_dduc_yn"));
String adopt_dt = Util.checkString(req.getParameter("adopt_dt"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String faml_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_seq")));
String faml_rshp_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_rshp_cd")));
String faml_prn = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_prn")));
String faml_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_flnm")));
String ocpn_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("ocpn_cd")));
String offi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("offi_nm")));
String posi = Util.Uni2Ksc(Util.checkString(req.getParameter("posi")));
String schir_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("schir_cd")));
String nmat_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("nmat_yn")));
String dth_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("dth_dt")));
String spos_dduc_obj_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("spos_dduc_obj_yn")));
String child_dduc_obj_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("child_dduc_obj_yn")));
String oldg_dduc_obj_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("oldg_dduc_obj_yn")));
String obcl_pers_dduc_obj_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("obcl_pers_dduc_obj_yn")));
String rspc_dduc_obj_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("rspc_dduc_obj_yn")));
String fml_hshd_dduc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("fml_hshd_dduc_yn")));
String care_fee_dduc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("care_fee_dduc_yn")));
String adopt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("adopt_dt")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setFaml_seq(faml_seq);
dm.setFaml_rshp_cd(faml_rshp_cd);
dm.setFaml_prn(faml_prn);
dm.setFaml_flnm(faml_flnm);
dm.setOcpn_cd(ocpn_cd);
dm.setOffi_nm(offi_nm);
dm.setPosi(posi);
dm.setSchir_cd(schir_cd);
dm.setNmat_yn(nmat_yn);
dm.setDth_dt(dth_dt);
dm.setSpos_dduc_obj_yn(spos_dduc_obj_yn);
dm.setChild_dduc_obj_yn(child_dduc_obj_yn);
dm.setOldg_dduc_obj_yn(oldg_dduc_obj_yn);
dm.setObcl_pers_dduc_obj_yn(obcl_pers_dduc_obj_yn);
dm.setRspc_dduc_obj_yn(rspc_dduc_obj_yn);
dm.setFml_hshd_dduc_yn(fml_hshd_dduc_yn);
dm.setCare_fee_dduc_yn(care_fee_dduc_yn);
dm.setAdopt_dt(adopt_dt);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Nov 27 16:41:52 KST 2009 */