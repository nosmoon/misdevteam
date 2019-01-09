

package chosun.ciis.hd.vaca.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.vaca.ds.*;
import chosun.ciis.hd.vaca.rec.*;

/**
 * 
 */


public class HD_VACA_1614_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String vaca_clsf;
	public String vaca_dtls_clsf;
	public String vaca_frdt;
	public String vaca_todt;
	public String vaca_dds;
	public String alvc_use_dt;
	public String remk;
	public String app_emp_no;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_VACA_1614_ADM(){}
	public HD_VACA_1614_ADM(String cmpy_cd, String emp_no, String vaca_clsf, String vaca_dtls_clsf, String vaca_frdt, String vaca_todt, String vaca_dds, String alvc_use_dt, String remk, String app_emp_no, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.vaca_clsf = vaca_clsf;
		this.vaca_dtls_clsf = vaca_dtls_clsf;
		this.vaca_frdt = vaca_frdt;
		this.vaca_todt = vaca_todt;
		this.vaca_dds = vaca_dds;
		this.alvc_use_dt = alvc_use_dt;
		this.remk = remk;
		this.app_emp_no = app_emp_no;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setVaca_clsf(String vaca_clsf){
		this.vaca_clsf = vaca_clsf;
	}

	public void setVaca_dtls_clsf(String vaca_dtls_clsf){
		this.vaca_dtls_clsf = vaca_dtls_clsf;
	}

	public void setVaca_frdt(String vaca_frdt){
		this.vaca_frdt = vaca_frdt;
	}

	public void setVaca_todt(String vaca_todt){
		this.vaca_todt = vaca_todt;
	}

	public void setVaca_dds(String vaca_dds){
		this.vaca_dds = vaca_dds;
	}

	public void setAlvc_use_dt(String alvc_use_dt){
		this.alvc_use_dt = alvc_use_dt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setApp_emp_no(String app_emp_no){
		this.app_emp_no = app_emp_no;
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

	public String getVaca_clsf(){
		return this.vaca_clsf;
	}

	public String getVaca_dtls_clsf(){
		return this.vaca_dtls_clsf;
	}

	public String getVaca_frdt(){
		return this.vaca_frdt;
	}

	public String getVaca_todt(){
		return this.vaca_todt;
	}

	public String getVaca_dds(){
		return this.vaca_dds;
	}

	public String getAlvc_use_dt(){
		return this.alvc_use_dt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getApp_emp_no(){
		return this.app_emp_no;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_VACA_1614_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_VACA_1614_ADM dm = (HD_VACA_1614_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.vaca_clsf);
		cstmt.setString(6, dm.vaca_dtls_clsf);
		cstmt.setString(7, dm.vaca_frdt);
		cstmt.setString(8, dm.vaca_todt);
		cstmt.setString(9, dm.vaca_dds);
		cstmt.setString(10, dm.alvc_use_dt);
		cstmt.setString(11, dm.remk);
		cstmt.setString(12, dm.app_emp_no);
		cstmt.setString(13, dm.incmg_pers_ipadd);
		cstmt.setString(14, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_VACA_1614_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("vaca_clsf = [" + getVaca_clsf() + "]");
		System.out.println("vaca_dtls_clsf = [" + getVaca_dtls_clsf() + "]");
		System.out.println("vaca_frdt = [" + getVaca_frdt() + "]");
		System.out.println("vaca_todt = [" + getVaca_todt() + "]");
		System.out.println("vaca_dds = [" + getVaca_dds() + "]");
		System.out.println("alvc_use_dt = [" + getAlvc_use_dt() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("app_emp_no = [" + getApp_emp_no() + "]");
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
String vaca_clsf = req.getParameter("vaca_clsf");
if( vaca_clsf == null){
	System.out.println(this.toString+" : vaca_clsf is null" );
}else{
	System.out.println(this.toString+" : vaca_clsf is "+vaca_clsf );
}
String vaca_dtls_clsf = req.getParameter("vaca_dtls_clsf");
if( vaca_dtls_clsf == null){
	System.out.println(this.toString+" : vaca_dtls_clsf is null" );
}else{
	System.out.println(this.toString+" : vaca_dtls_clsf is "+vaca_dtls_clsf );
}
String vaca_frdt = req.getParameter("vaca_frdt");
if( vaca_frdt == null){
	System.out.println(this.toString+" : vaca_frdt is null" );
}else{
	System.out.println(this.toString+" : vaca_frdt is "+vaca_frdt );
}
String vaca_todt = req.getParameter("vaca_todt");
if( vaca_todt == null){
	System.out.println(this.toString+" : vaca_todt is null" );
}else{
	System.out.println(this.toString+" : vaca_todt is "+vaca_todt );
}
String vaca_dds = req.getParameter("vaca_dds");
if( vaca_dds == null){
	System.out.println(this.toString+" : vaca_dds is null" );
}else{
	System.out.println(this.toString+" : vaca_dds is "+vaca_dds );
}
String alvc_use_dt = req.getParameter("alvc_use_dt");
if( alvc_use_dt == null){
	System.out.println(this.toString+" : alvc_use_dt is null" );
}else{
	System.out.println(this.toString+" : alvc_use_dt is "+alvc_use_dt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String app_emp_no = req.getParameter("app_emp_no");
if( app_emp_no == null){
	System.out.println(this.toString+" : app_emp_no is null" );
}else{
	System.out.println(this.toString+" : app_emp_no is "+app_emp_no );
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
String vaca_clsf = Util.checkString(req.getParameter("vaca_clsf"));
String vaca_dtls_clsf = Util.checkString(req.getParameter("vaca_dtls_clsf"));
String vaca_frdt = Util.checkString(req.getParameter("vaca_frdt"));
String vaca_todt = Util.checkString(req.getParameter("vaca_todt"));
String vaca_dds = Util.checkString(req.getParameter("vaca_dds"));
String alvc_use_dt = Util.checkString(req.getParameter("alvc_use_dt"));
String remk = Util.checkString(req.getParameter("remk"));
String app_emp_no = Util.checkString(req.getParameter("app_emp_no"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String vaca_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_clsf")));
String vaca_dtls_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_dtls_clsf")));
String vaca_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_frdt")));
String vaca_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_todt")));
String vaca_dds = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_dds")));
String alvc_use_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("alvc_use_dt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String app_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("app_emp_no")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setVaca_clsf(vaca_clsf);
dm.setVaca_dtls_clsf(vaca_dtls_clsf);
dm.setVaca_frdt(vaca_frdt);
dm.setVaca_todt(vaca_todt);
dm.setVaca_dds(vaca_dds);
dm.setAlvc_use_dt(alvc_use_dt);
dm.setRemk(remk);
dm.setApp_emp_no(app_emp_no);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Nov 02 10:45:48 KST 2010 */