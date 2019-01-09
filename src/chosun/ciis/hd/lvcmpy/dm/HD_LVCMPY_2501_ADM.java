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


package chosun.ciis.hd.lvcmpy.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.ds.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_2501_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String incmp_welf_livg_lon_bal;
	public String incmp_welf_livg_lon_int;
	public String jrnst_safe_livg_patr_bal;
	public String jrnst_safe_livg_patr_int;
	public String lvmpy_amt_etc_dduc_nm;
	public String lvmpy_amt_etc_dduc;
	public String adv_bal;
	public String lvcmpy_dt;
	public String lvcmpy_clsf;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_LVCMPY_2501_ADM(){}
	public HD_LVCMPY_2501_ADM(String cmpy_cd, String emp_no, String incmp_welf_livg_lon_bal, String incmp_welf_livg_lon_int, String jrnst_safe_livg_patr_bal, String jrnst_safe_livg_patr_int, String lvmpy_amt_etc_dduc_nm, String lvmpy_amt_etc_dduc, String adv_bal, String lvcmpy_dt, String lvcmpy_clsf, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.incmp_welf_livg_lon_bal = incmp_welf_livg_lon_bal;
		this.incmp_welf_livg_lon_int = incmp_welf_livg_lon_int;
		this.jrnst_safe_livg_patr_bal = jrnst_safe_livg_patr_bal;
		this.jrnst_safe_livg_patr_int = jrnst_safe_livg_patr_int;
		this.lvmpy_amt_etc_dduc_nm = lvmpy_amt_etc_dduc_nm;
		this.lvmpy_amt_etc_dduc = lvmpy_amt_etc_dduc;
		this.adv_bal = adv_bal;
		this.lvcmpy_dt = lvcmpy_dt;
		this.lvcmpy_clsf = lvcmpy_clsf;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setIncmp_welf_livg_lon_bal(String incmp_welf_livg_lon_bal){
		this.incmp_welf_livg_lon_bal = incmp_welf_livg_lon_bal;
	}

	public void setIncmp_welf_livg_lon_int(String incmp_welf_livg_lon_int){
		this.incmp_welf_livg_lon_int = incmp_welf_livg_lon_int;
	}

	public void setJrnst_safe_livg_patr_bal(String jrnst_safe_livg_patr_bal){
		this.jrnst_safe_livg_patr_bal = jrnst_safe_livg_patr_bal;
	}

	public void setJrnst_safe_livg_patr_int(String jrnst_safe_livg_patr_int){
		this.jrnst_safe_livg_patr_int = jrnst_safe_livg_patr_int;
	}

	public void setLvmpy_amt_etc_dduc_nm(String lvmpy_amt_etc_dduc_nm){
		this.lvmpy_amt_etc_dduc_nm = lvmpy_amt_etc_dduc_nm;
	}

	public void setLvmpy_amt_etc_dduc(String lvmpy_amt_etc_dduc){
		this.lvmpy_amt_etc_dduc = lvmpy_amt_etc_dduc;
	}

	public void setAdv_bal(String adv_bal){
		this.adv_bal = adv_bal;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public void setLvcmpy_clsf(String lvcmpy_clsf){
		this.lvcmpy_clsf = lvcmpy_clsf;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getIncmp_welf_livg_lon_bal(){
		return this.incmp_welf_livg_lon_bal;
	}

	public String getIncmp_welf_livg_lon_int(){
		return this.incmp_welf_livg_lon_int;
	}

	public String getJrnst_safe_livg_patr_bal(){
		return this.jrnst_safe_livg_patr_bal;
	}

	public String getJrnst_safe_livg_patr_int(){
		return this.jrnst_safe_livg_patr_int;
	}

	public String getLvmpy_amt_etc_dduc_nm(){
		return this.lvmpy_amt_etc_dduc_nm;
	}

	public String getLvmpy_amt_etc_dduc(){
		return this.lvmpy_amt_etc_dduc;
	}

	public String getAdv_bal(){
		return this.adv_bal;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}

	public String getLvcmpy_clsf(){
		return this.lvcmpy_clsf;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_LVCMPY_2501_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_LVCMPY_2501_ADM dm = (HD_LVCMPY_2501_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.incmp_welf_livg_lon_bal);
		cstmt.setString(6, dm.incmp_welf_livg_lon_int);
		cstmt.setString(7, dm.jrnst_safe_livg_patr_bal);
		cstmt.setString(8, dm.jrnst_safe_livg_patr_int);
		cstmt.setString(9, dm.lvmpy_amt_etc_dduc_nm);
		cstmt.setString(10, dm.lvmpy_amt_etc_dduc);
		cstmt.setString(11, dm.adv_bal);
		cstmt.setString(12, dm.lvcmpy_dt);
		cstmt.setString(13, dm.lvcmpy_clsf);
		cstmt.setString(14, dm.incmg_pers_ipadd);
		cstmt.setString(15, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.lvcmpy.ds.HD_LVCMPY_2501_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("incmp_welf_livg_lon_bal = [" + getIncmp_welf_livg_lon_bal() + "]");
		System.out.println("incmp_welf_livg_lon_int = [" + getIncmp_welf_livg_lon_int() + "]");
		System.out.println("jrnst_safe_livg_patr_bal = [" + getJrnst_safe_livg_patr_bal() + "]");
		System.out.println("jrnst_safe_livg_patr_int = [" + getJrnst_safe_livg_patr_int() + "]");
		System.out.println("lvmpy_amt_etc_dduc_nm = [" + getLvmpy_amt_etc_dduc_nm() + "]");
		System.out.println("lvmpy_amt_etc_dduc = [" + getLvmpy_amt_etc_dduc() + "]");
		System.out.println("adv_bal = [" + getAdv_bal() + "]");
		System.out.println("lvcmpy_dt = [" + getLvcmpy_dt() + "]");
		System.out.println("lvcmpy_clsf = [" + getLvcmpy_clsf() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String incmp_welf_livg_lon_bal = req.getParameter("incmp_welf_livg_lon_bal");
if( incmp_welf_livg_lon_bal == null){
	System.out.println(this.toString+" : incmp_welf_livg_lon_bal is null" );
}else{
	System.out.println(this.toString+" : incmp_welf_livg_lon_bal is "+incmp_welf_livg_lon_bal );
}
String incmp_welf_livg_lon_int = req.getParameter("incmp_welf_livg_lon_int");
if( incmp_welf_livg_lon_int == null){
	System.out.println(this.toString+" : incmp_welf_livg_lon_int is null" );
}else{
	System.out.println(this.toString+" : incmp_welf_livg_lon_int is "+incmp_welf_livg_lon_int );
}
String jrnst_safe_livg_patr_bal = req.getParameter("jrnst_safe_livg_patr_bal");
if( jrnst_safe_livg_patr_bal == null){
	System.out.println(this.toString+" : jrnst_safe_livg_patr_bal is null" );
}else{
	System.out.println(this.toString+" : jrnst_safe_livg_patr_bal is "+jrnst_safe_livg_patr_bal );
}
String jrnst_safe_livg_patr_int = req.getParameter("jrnst_safe_livg_patr_int");
if( jrnst_safe_livg_patr_int == null){
	System.out.println(this.toString+" : jrnst_safe_livg_patr_int is null" );
}else{
	System.out.println(this.toString+" : jrnst_safe_livg_patr_int is "+jrnst_safe_livg_patr_int );
}
String lvmpy_amt_etc_dduc_nm = req.getParameter("lvmpy_amt_etc_dduc_nm");
if( lvmpy_amt_etc_dduc_nm == null){
	System.out.println(this.toString+" : lvmpy_amt_etc_dduc_nm is null" );
}else{
	System.out.println(this.toString+" : lvmpy_amt_etc_dduc_nm is "+lvmpy_amt_etc_dduc_nm );
}
String lvmpy_amt_etc_dduc = req.getParameter("lvmpy_amt_etc_dduc");
if( lvmpy_amt_etc_dduc == null){
	System.out.println(this.toString+" : lvmpy_amt_etc_dduc is null" );
}else{
	System.out.println(this.toString+" : lvmpy_amt_etc_dduc is "+lvmpy_amt_etc_dduc );
}
String adv_bal = req.getParameter("adv_bal");
if( adv_bal == null){
	System.out.println(this.toString+" : adv_bal is null" );
}else{
	System.out.println(this.toString+" : adv_bal is "+adv_bal );
}
String lvcmpy_dt = req.getParameter("lvcmpy_dt");
if( lvcmpy_dt == null){
	System.out.println(this.toString+" : lvcmpy_dt is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_dt is "+lvcmpy_dt );
}
String lvcmpy_clsf = req.getParameter("lvcmpy_clsf");
if( lvcmpy_clsf == null){
	System.out.println(this.toString+" : lvcmpy_clsf is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_clsf is "+lvcmpy_clsf );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String incmp_welf_livg_lon_bal = Util.checkString(req.getParameter("incmp_welf_livg_lon_bal"));
String incmp_welf_livg_lon_int = Util.checkString(req.getParameter("incmp_welf_livg_lon_int"));
String jrnst_safe_livg_patr_bal = Util.checkString(req.getParameter("jrnst_safe_livg_patr_bal"));
String jrnst_safe_livg_patr_int = Util.checkString(req.getParameter("jrnst_safe_livg_patr_int"));
String lvmpy_amt_etc_dduc_nm = Util.checkString(req.getParameter("lvmpy_amt_etc_dduc_nm"));
String lvmpy_amt_etc_dduc = Util.checkString(req.getParameter("lvmpy_amt_etc_dduc"));
String adv_bal = Util.checkString(req.getParameter("adv_bal"));
String lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));
String lvcmpy_clsf = Util.checkString(req.getParameter("lvcmpy_clsf"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String incmp_welf_livg_lon_bal = Util.Uni2Ksc(Util.checkString(req.getParameter("incmp_welf_livg_lon_bal")));
String incmp_welf_livg_lon_int = Util.Uni2Ksc(Util.checkString(req.getParameter("incmp_welf_livg_lon_int")));
String jrnst_safe_livg_patr_bal = Util.Uni2Ksc(Util.checkString(req.getParameter("jrnst_safe_livg_patr_bal")));
String jrnst_safe_livg_patr_int = Util.Uni2Ksc(Util.checkString(req.getParameter("jrnst_safe_livg_patr_int")));
String lvmpy_amt_etc_dduc_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("lvmpy_amt_etc_dduc_nm")));
String lvmpy_amt_etc_dduc = Util.Uni2Ksc(Util.checkString(req.getParameter("lvmpy_amt_etc_dduc")));
String adv_bal = Util.Uni2Ksc(Util.checkString(req.getParameter("adv_bal")));
String lvcmpy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_dt")));
String lvcmpy_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_clsf")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setIncmp_welf_livg_lon_bal(incmp_welf_livg_lon_bal);
dm.setIncmp_welf_livg_lon_int(incmp_welf_livg_lon_int);
dm.setJrnst_safe_livg_patr_bal(jrnst_safe_livg_patr_bal);
dm.setJrnst_safe_livg_patr_int(jrnst_safe_livg_patr_int);
dm.setLvmpy_amt_etc_dduc_nm(lvmpy_amt_etc_dduc_nm);
dm.setLvmpy_amt_etc_dduc(lvmpy_amt_etc_dduc);
dm.setAdv_bal(adv_bal);
dm.setLvcmpy_dt(lvcmpy_dt);
dm.setLvcmpy_clsf(lvcmpy_clsf);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 19 11:24:00 KST 2009 */