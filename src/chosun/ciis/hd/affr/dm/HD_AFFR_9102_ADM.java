/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
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


public class HD_AFFR_9102_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String otn_mgng_cd;
	public String outside_clsf_cd;
	public String outside_flnm;
	public String outside_tel_no;
	public String zipcode;
	public String addr;
	public String use_yn;
	public String incmg_pers_ipadd;
	public String ss_emp_no;

	public HD_AFFR_9102_ADM(){}
	public HD_AFFR_9102_ADM(String cmpy_cd, String mode, String otn_mgng_cd, String outside_clsf_cd, String outside_flnm, String outside_tel_no, String zipcode, String addr, String use_yn, String incmg_pers_ipadd, String ss_emp_no){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.otn_mgng_cd = otn_mgng_cd;
		this.outside_clsf_cd = outside_clsf_cd;
		this.outside_flnm = outside_flnm;
		this.outside_tel_no = outside_tel_no;
		this.zipcode = zipcode;
		this.addr = addr;
		this.use_yn = use_yn;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.ss_emp_no = ss_emp_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setOtn_mgng_cd(String otn_mgng_cd){
		this.otn_mgng_cd = otn_mgng_cd;
	}

	public void setOutside_clsf_cd(String outside_clsf_cd){
		this.outside_clsf_cd = outside_clsf_cd;
	}

	public void setOutside_flnm(String outside_flnm){
		this.outside_flnm = outside_flnm;
	}

	public void setOutside_tel_no(String outside_tel_no){
		this.outside_tel_no = outside_tel_no;
	}

	public void setZipcode(String zipcode){
		this.zipcode = zipcode;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
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

	public String getOtn_mgng_cd(){
		return this.otn_mgng_cd;
	}

	public String getOutside_clsf_cd(){
		return this.outside_clsf_cd;
	}

	public String getOutside_flnm(){
		return this.outside_flnm;
	}

	public String getOutside_tel_no(){
		return this.outside_tel_no;
	}

	public String getZipcode(){
		return this.zipcode;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSs_emp_no(){
		return this.ss_emp_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_9102_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_9102_ADM dm = (HD_AFFR_9102_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.otn_mgng_cd);
		cstmt.setString(6, dm.outside_clsf_cd);
		cstmt.setString(7, dm.outside_flnm);
		cstmt.setString(8, dm.outside_tel_no);
		cstmt.setString(9, dm.zipcode);
		cstmt.setString(10, dm.addr);
		cstmt.setString(11, dm.use_yn);
		cstmt.setString(12, dm.incmg_pers_ipadd);
		cstmt.setString(13, dm.ss_emp_no);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_9102_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("otn_mgng_cd = [" + getOtn_mgng_cd() + "]");
		System.out.println("outside_clsf_cd = [" + getOutside_clsf_cd() + "]");
		System.out.println("outside_flnm = [" + getOutside_flnm() + "]");
		System.out.println("outside_tel_no = [" + getOutside_tel_no() + "]");
		System.out.println("zipcode = [" + getZipcode() + "]");
		System.out.println("addr = [" + getAddr() + "]");
		System.out.println("use_yn = [" + getUse_yn() + "]");
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
String otn_mgng_cd = req.getParameter("otn_mgng_cd");
if( otn_mgng_cd == null){
	System.out.println(this.toString+" : otn_mgng_cd is null" );
}else{
	System.out.println(this.toString+" : otn_mgng_cd is "+otn_mgng_cd );
}
String outside_clsf_cd = req.getParameter("outside_clsf_cd");
if( outside_clsf_cd == null){
	System.out.println(this.toString+" : outside_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : outside_clsf_cd is "+outside_clsf_cd );
}
String outside_flnm = req.getParameter("outside_flnm");
if( outside_flnm == null){
	System.out.println(this.toString+" : outside_flnm is null" );
}else{
	System.out.println(this.toString+" : outside_flnm is "+outside_flnm );
}
String outside_tel_no = req.getParameter("outside_tel_no");
if( outside_tel_no == null){
	System.out.println(this.toString+" : outside_tel_no is null" );
}else{
	System.out.println(this.toString+" : outside_tel_no is "+outside_tel_no );
}
String zipcode = req.getParameter("zipcode");
if( zipcode == null){
	System.out.println(this.toString+" : zipcode is null" );
}else{
	System.out.println(this.toString+" : zipcode is "+zipcode );
}
String addr = req.getParameter("addr");
if( addr == null){
	System.out.println(this.toString+" : addr is null" );
}else{
	System.out.println(this.toString+" : addr is "+addr );
}
String use_yn = req.getParameter("use_yn");
if( use_yn == null){
	System.out.println(this.toString+" : use_yn is null" );
}else{
	System.out.println(this.toString+" : use_yn is "+use_yn );
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
String otn_mgng_cd = Util.checkString(req.getParameter("otn_mgng_cd"));
String outside_clsf_cd = Util.checkString(req.getParameter("outside_clsf_cd"));
String outside_flnm = Util.checkString(req.getParameter("outside_flnm"));
String outside_tel_no = Util.checkString(req.getParameter("outside_tel_no"));
String zipcode = Util.checkString(req.getParameter("zipcode"));
String addr = Util.checkString(req.getParameter("addr"));
String use_yn = Util.checkString(req.getParameter("use_yn"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String ss_emp_no = Util.checkString(req.getParameter("ss_emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String otn_mgng_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("otn_mgng_cd")));
String outside_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("outside_clsf_cd")));
String outside_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("outside_flnm")));
String outside_tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("outside_tel_no")));
String zipcode = Util.Uni2Ksc(Util.checkString(req.getParameter("zipcode")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("use_yn")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String ss_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ss_emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setOtn_mgng_cd(otn_mgng_cd);
dm.setOutside_clsf_cd(outside_clsf_cd);
dm.setOutside_flnm(outside_flnm);
dm.setOutside_tel_no(outside_tel_no);
dm.setZipcode(zipcode);
dm.setAddr(addr);
dm.setUse_yn(use_yn);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setSs_emp_no(ss_emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 11 19:29:56 KST 2016 */