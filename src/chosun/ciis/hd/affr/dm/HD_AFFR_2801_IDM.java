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


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_2801_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String emp_no;
	public String flnm;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String qunt_side_clam_qunt;
	public String dn_side_clam_qunt;
	public String nm_engl;
	public String dty_nm;
	public String aplc_offi_nm;
	public String dept_nm;
	public String tel_no;
	public String fax_no;
	public String ptph_no;
	public String email_id;
	public String zip_1;
	public String zip_2;
	public String addr;
	public String dtls_addr;
	public String remk;
	public String aplc_cnfm_yn;
	public String incmg_pers_ipadd;
	public String ss_emp_no;

	public HD_AFFR_2801_IDM(){}
	public HD_AFFR_2801_IDM(String cmpy_cd, String mode, String emp_no, String flnm, String dept_cd, String dty_cd, String posi_cd, String qunt_side_clam_qunt, String dn_side_clam_qunt, String nm_engl, String dty_nm, String aplc_offi_nm, String dept_nm, String tel_no, String fax_no, String ptph_no, String email_id, String zip_1, String zip_2, String addr, String dtls_addr, String remk, String aplc_cnfm_yn, String incmg_pers_ipadd, String ss_emp_no){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.dept_cd = dept_cd;
		this.dty_cd = dty_cd;
		this.posi_cd = posi_cd;
		this.qunt_side_clam_qunt = qunt_side_clam_qunt;
		this.dn_side_clam_qunt = dn_side_clam_qunt;
		this.nm_engl = nm_engl;
		this.dty_nm = dty_nm;
		this.aplc_offi_nm = aplc_offi_nm;
		this.dept_nm = dept_nm;
		this.tel_no = tel_no;
		this.fax_no = fax_no;
		this.ptph_no = ptph_no;
		this.email_id = email_id;
		this.zip_1 = zip_1;
		this.zip_2 = zip_2;
		this.addr = addr;
		this.dtls_addr = dtls_addr;
		this.remk = remk;
		this.aplc_cnfm_yn = aplc_cnfm_yn;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.ss_emp_no = ss_emp_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setQunt_side_clam_qunt(String qunt_side_clam_qunt){
		this.qunt_side_clam_qunt = qunt_side_clam_qunt;
	}

	public void setDn_side_clam_qunt(String dn_side_clam_qunt){
		this.dn_side_clam_qunt = dn_side_clam_qunt;
	}

	public void setNm_engl(String nm_engl){
		this.nm_engl = nm_engl;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setAplc_offi_nm(String aplc_offi_nm){
		this.aplc_offi_nm = aplc_offi_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setFax_no(String fax_no){
		this.fax_no = fax_no;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public void setEmail_id(String email_id){
		this.email_id = email_id;
	}

	public void setZip_1(String zip_1){
		this.zip_1 = zip_1;
	}

	public void setZip_2(String zip_2){
		this.zip_2 = zip_2;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtls_addr(String dtls_addr){
		this.dtls_addr = dtls_addr;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setAplc_cnfm_yn(String aplc_cnfm_yn){
		this.aplc_cnfm_yn = aplc_cnfm_yn;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setSs_emp_no(String ss_emp_no){
		this.ss_emp_no = ss_emp_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getQunt_side_clam_qunt(){
		return this.qunt_side_clam_qunt;
	}

	public String getDn_side_clam_qunt(){
		return this.dn_side_clam_qunt;
	}

	public String getNm_engl(){
		return this.nm_engl;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getAplc_offi_nm(){
		return this.aplc_offi_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getFax_no(){
		return this.fax_no;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}

	public String getEmail_id(){
		return this.email_id;
	}

	public String getZip_1(){
		return this.zip_1;
	}

	public String getZip_2(){
		return this.zip_2;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtls_addr(){
		return this.dtls_addr;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getAplc_cnfm_yn(){
		return this.aplc_cnfm_yn;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSs_emp_no(){
		return this.ss_emp_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_2801_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_2801_IDM dm = (HD_AFFR_2801_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.flnm);
		cstmt.setString(7, dm.dept_cd);
		cstmt.setString(8, dm.dty_cd);
		cstmt.setString(9, dm.posi_cd);
		cstmt.setString(10, dm.qunt_side_clam_qunt);
		cstmt.setString(11, dm.dn_side_clam_qunt);
		cstmt.setString(12, dm.nm_engl);
		cstmt.setString(13, dm.dty_nm);
		cstmt.setString(14, dm.aplc_offi_nm);
		cstmt.setString(15, dm.dept_nm);
		cstmt.setString(16, dm.tel_no);
		cstmt.setString(17, dm.fax_no);
		cstmt.setString(18, dm.ptph_no);
		cstmt.setString(19, dm.email_id);
		cstmt.setString(20, dm.zip_1);
		cstmt.setString(21, dm.zip_2);
		cstmt.setString(22, dm.addr);
		cstmt.setString(23, dm.dtls_addr);
		cstmt.setString(24, dm.remk);
		cstmt.setString(25, dm.aplc_cnfm_yn);
		cstmt.setString(26, dm.incmg_pers_ipadd);
		cstmt.setString(27, dm.ss_emp_no);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_2801_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("dty_cd = [" + getDty_cd() + "]");
		System.out.println("posi_cd = [" + getPosi_cd() + "]");
		System.out.println("qunt_side_clam_qunt = [" + getQunt_side_clam_qunt() + "]");
		System.out.println("dn_side_clam_qunt = [" + getDn_side_clam_qunt() + "]");
		System.out.println("nm_engl = [" + getNm_engl() + "]");
		System.out.println("dty_nm = [" + getDty_nm() + "]");
		System.out.println("aplc_offi_nm = [" + getAplc_offi_nm() + "]");
		System.out.println("dept_nm = [" + getDept_nm() + "]");
		System.out.println("tel_no = [" + getTel_no() + "]");
		System.out.println("fax_no = [" + getFax_no() + "]");
		System.out.println("ptph_no = [" + getPtph_no() + "]");
		System.out.println("email_id = [" + getEmail_id() + "]");
		System.out.println("zip_1 = [" + getZip_1() + "]");
		System.out.println("zip_2 = [" + getZip_2() + "]");
		System.out.println("addr = [" + getAddr() + "]");
		System.out.println("dtls_addr = [" + getDtls_addr() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("aplc_cnfm_yn = [" + getAplc_cnfm_yn() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("ss_emp_no = [" + getSs_emp_no() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
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
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String dty_cd = req.getParameter("dty_cd");
if( dty_cd == null){
	System.out.println(this.toString+" : dty_cd is null" );
}else{
	System.out.println(this.toString+" : dty_cd is "+dty_cd );
}
String posi_cd = req.getParameter("posi_cd");
if( posi_cd == null){
	System.out.println(this.toString+" : posi_cd is null" );
}else{
	System.out.println(this.toString+" : posi_cd is "+posi_cd );
}
String qunt_side_clam_qunt = req.getParameter("qunt_side_clam_qunt");
if( qunt_side_clam_qunt == null){
	System.out.println(this.toString+" : qunt_side_clam_qunt is null" );
}else{
	System.out.println(this.toString+" : qunt_side_clam_qunt is "+qunt_side_clam_qunt );
}
String dn_side_clam_qunt = req.getParameter("dn_side_clam_qunt");
if( dn_side_clam_qunt == null){
	System.out.println(this.toString+" : dn_side_clam_qunt is null" );
}else{
	System.out.println(this.toString+" : dn_side_clam_qunt is "+dn_side_clam_qunt );
}
String nm_engl = req.getParameter("nm_engl");
if( nm_engl == null){
	System.out.println(this.toString+" : nm_engl is null" );
}else{
	System.out.println(this.toString+" : nm_engl is "+nm_engl );
}
String dty_nm = req.getParameter("dty_nm");
if( dty_nm == null){
	System.out.println(this.toString+" : dty_nm is null" );
}else{
	System.out.println(this.toString+" : dty_nm is "+dty_nm );
}
String aplc_offi_nm = req.getParameter("aplc_offi_nm");
if( aplc_offi_nm == null){
	System.out.println(this.toString+" : aplc_offi_nm is null" );
}else{
	System.out.println(this.toString+" : aplc_offi_nm is "+aplc_offi_nm );
}
String dept_nm = req.getParameter("dept_nm");
if( dept_nm == null){
	System.out.println(this.toString+" : dept_nm is null" );
}else{
	System.out.println(this.toString+" : dept_nm is "+dept_nm );
}
String tel_no = req.getParameter("tel_no");
if( tel_no == null){
	System.out.println(this.toString+" : tel_no is null" );
}else{
	System.out.println(this.toString+" : tel_no is "+tel_no );
}
String fax_no = req.getParameter("fax_no");
if( fax_no == null){
	System.out.println(this.toString+" : fax_no is null" );
}else{
	System.out.println(this.toString+" : fax_no is "+fax_no );
}
String ptph_no = req.getParameter("ptph_no");
if( ptph_no == null){
	System.out.println(this.toString+" : ptph_no is null" );
}else{
	System.out.println(this.toString+" : ptph_no is "+ptph_no );
}
String email_id = req.getParameter("email_id");
if( email_id == null){
	System.out.println(this.toString+" : email_id is null" );
}else{
	System.out.println(this.toString+" : email_id is "+email_id );
}
String zip_1 = req.getParameter("zip_1");
if( zip_1 == null){
	System.out.println(this.toString+" : zip_1 is null" );
}else{
	System.out.println(this.toString+" : zip_1 is "+zip_1 );
}
String zip_2 = req.getParameter("zip_2");
if( zip_2 == null){
	System.out.println(this.toString+" : zip_2 is null" );
}else{
	System.out.println(this.toString+" : zip_2 is "+zip_2 );
}
String addr = req.getParameter("addr");
if( addr == null){
	System.out.println(this.toString+" : addr is null" );
}else{
	System.out.println(this.toString+" : addr is "+addr );
}
String dtls_addr = req.getParameter("dtls_addr");
if( dtls_addr == null){
	System.out.println(this.toString+" : dtls_addr is null" );
}else{
	System.out.println(this.toString+" : dtls_addr is "+dtls_addr );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String aplc_cnfm_yn = req.getParameter("aplc_cnfm_yn");
if( aplc_cnfm_yn == null){
	System.out.println(this.toString+" : aplc_cnfm_yn is null" );
}else{
	System.out.println(this.toString+" : aplc_cnfm_yn is "+aplc_cnfm_yn );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String ss_emp_no = req.getParameter("ss_emp_no");
if( ss_emp_no == null){
	System.out.println(this.toString+" : ss_emp_no is null" );
}else{
	System.out.println(this.toString+" : ss_emp_no is "+ss_emp_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dty_cd = Util.checkString(req.getParameter("dty_cd"));
String posi_cd = Util.checkString(req.getParameter("posi_cd"));
String qunt_side_clam_qunt = Util.checkString(req.getParameter("qunt_side_clam_qunt"));
String dn_side_clam_qunt = Util.checkString(req.getParameter("dn_side_clam_qunt"));
String nm_engl = Util.checkString(req.getParameter("nm_engl"));
String dty_nm = Util.checkString(req.getParameter("dty_nm"));
String aplc_offi_nm = Util.checkString(req.getParameter("aplc_offi_nm"));
String dept_nm = Util.checkString(req.getParameter("dept_nm"));
String tel_no = Util.checkString(req.getParameter("tel_no"));
String fax_no = Util.checkString(req.getParameter("fax_no"));
String ptph_no = Util.checkString(req.getParameter("ptph_no"));
String email_id = Util.checkString(req.getParameter("email_id"));
String zip_1 = Util.checkString(req.getParameter("zip_1"));
String zip_2 = Util.checkString(req.getParameter("zip_2"));
String addr = Util.checkString(req.getParameter("addr"));
String dtls_addr = Util.checkString(req.getParameter("dtls_addr"));
String remk = Util.checkString(req.getParameter("remk"));
String aplc_cnfm_yn = Util.checkString(req.getParameter("aplc_cnfm_yn"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String ss_emp_no = Util.checkString(req.getParameter("ss_emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_cd")));
String posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_cd")));
String qunt_side_clam_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("qunt_side_clam_qunt")));
String dn_side_clam_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("dn_side_clam_qunt")));
String nm_engl = Util.Uni2Ksc(Util.checkString(req.getParameter("nm_engl")));
String dty_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_nm")));
String aplc_offi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_offi_nm")));
String dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nm")));
String tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no")));
String fax_no = Util.Uni2Ksc(Util.checkString(req.getParameter("fax_no")));
String ptph_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no")));
String email_id = Util.Uni2Ksc(Util.checkString(req.getParameter("email_id")));
String zip_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_1")));
String zip_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_2")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String dtls_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_addr")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String aplc_cnfm_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_cnfm_yn")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String ss_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ss_emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setDept_cd(dept_cd);
dm.setDty_cd(dty_cd);
dm.setPosi_cd(posi_cd);
dm.setQunt_side_clam_qunt(qunt_side_clam_qunt);
dm.setDn_side_clam_qunt(dn_side_clam_qunt);
dm.setNm_engl(nm_engl);
dm.setDty_nm(dty_nm);
dm.setAplc_offi_nm(aplc_offi_nm);
dm.setDept_nm(dept_nm);
dm.setTel_no(tel_no);
dm.setFax_no(fax_no);
dm.setPtph_no(ptph_no);
dm.setEmail_id(email_id);
dm.setZip_1(zip_1);
dm.setZip_2(zip_2);
dm.setAddr(addr);
dm.setDtls_addr(dtls_addr);
dm.setRemk(remk);
dm.setAplc_cnfm_yn(aplc_cnfm_yn);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setSs_emp_no(ss_emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Jul 19 17:43:13 KST 2009 */