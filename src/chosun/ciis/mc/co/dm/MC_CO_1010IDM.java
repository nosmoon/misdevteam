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


package chosun.ciis.mc.co.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.co.ds.*;
import chosun.ciis.mc.co.rec.*;

/**
 * 
 */


public class MC_CO_1010IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String yymm;
	public String job_clsf_cd;
	public String dtls_clsf_cd;
	public String medi_cd;
	public String dept_cd;
	public String ini_plan_qunt;
	public String rmks;
	public String form_dept_cd;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public MC_CO_1010IDM(){}
	public MC_CO_1010IDM(String cmpy_cd, String mode, String yymm, String job_clsf_cd, String dtls_clsf_cd, String medi_cd, String dept_cd, String ini_plan_qunt, String rmks, String form_dept_cd, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.yymm = yymm;
		this.job_clsf_cd = job_clsf_cd;
		this.dtls_clsf_cd = dtls_clsf_cd;
		this.medi_cd = medi_cd;
		this.dept_cd = dept_cd;
		this.ini_plan_qunt = ini_plan_qunt;
		this.rmks = rmks;
		this.form_dept_cd = form_dept_cd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setJob_clsf_cd(String job_clsf_cd){
		this.job_clsf_cd = job_clsf_cd;
	}

	public void setDtls_clsf_cd(String dtls_clsf_cd){
		this.dtls_clsf_cd = dtls_clsf_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setIni_plan_qunt(String ini_plan_qunt){
		this.ini_plan_qunt = ini_plan_qunt;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setForm_dept_cd(String form_dept_cd){
		this.form_dept_cd = form_dept_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getJob_clsf_cd(){
		return this.job_clsf_cd;
	}

	public String getDtls_clsf_cd(){
		return this.dtls_clsf_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getIni_plan_qunt(){
		return this.ini_plan_qunt;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getForm_dept_cd(){
		return this.form_dept_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_CO_1010I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_CO_1010IDM dm = (MC_CO_1010IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.yymm);
		cstmt.setString(6, dm.job_clsf_cd);
		cstmt.setString(7, dm.dtls_clsf_cd);
		cstmt.setString(8, dm.medi_cd);
		cstmt.setString(9, dm.dept_cd);
		cstmt.setString(10, dm.ini_plan_qunt);
		cstmt.setString(11, dm.rmks);
		cstmt.setString(12, dm.form_dept_cd);
		cstmt.setString(13, dm.incmg_pers);
		cstmt.setString(14, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.co.ds.MC_CO_1010IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("job_clsf_cd = [" + getJob_clsf_cd() + "]");
		System.out.println("dtls_clsf_cd = [" + getDtls_clsf_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("ini_plan_qunt = [" + getIni_plan_qunt() + "]");
		System.out.println("rmks = [" + getRmks() + "]");
		System.out.println("form_dept_cd = [" + getForm_dept_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String job_clsf_cd = req.getParameter("job_clsf_cd");
if( job_clsf_cd == null){
	System.out.println(this.toString+" : job_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : job_clsf_cd is "+job_clsf_cd );
}
String dtls_clsf_cd = req.getParameter("dtls_clsf_cd");
if( dtls_clsf_cd == null){
	System.out.println(this.toString+" : dtls_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dtls_clsf_cd is "+dtls_clsf_cd );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String ini_plan_qunt = req.getParameter("ini_plan_qunt");
if( ini_plan_qunt == null){
	System.out.println(this.toString+" : ini_plan_qunt is null" );
}else{
	System.out.println(this.toString+" : ini_plan_qunt is "+ini_plan_qunt );
}
String rmks = req.getParameter("rmks");
if( rmks == null){
	System.out.println(this.toString+" : rmks is null" );
}else{
	System.out.println(this.toString+" : rmks is "+rmks );
}
String form_dept_cd = req.getParameter("form_dept_cd");
if( form_dept_cd == null){
	System.out.println(this.toString+" : form_dept_cd is null" );
}else{
	System.out.println(this.toString+" : form_dept_cd is "+form_dept_cd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String yymm = Util.checkString(req.getParameter("yymm"));
String job_clsf_cd = Util.checkString(req.getParameter("job_clsf_cd"));
String dtls_clsf_cd = Util.checkString(req.getParameter("dtls_clsf_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String ini_plan_qunt = Util.checkString(req.getParameter("ini_plan_qunt"));
String rmks = Util.checkString(req.getParameter("rmks"));
String form_dept_cd = Util.checkString(req.getParameter("form_dept_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String job_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("job_clsf_cd")));
String dtls_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_clsf_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String ini_plan_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("ini_plan_qunt")));
String rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks")));
String form_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("form_dept_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setYymm(yymm);
dm.setJob_clsf_cd(job_clsf_cd);
dm.setDtls_clsf_cd(dtls_clsf_cd);
dm.setMedi_cd(medi_cd);
dm.setDept_cd(dept_cd);
dm.setIni_plan_qunt(ini_plan_qunt);
dm.setRmks(rmks);
dm.setForm_dept_cd(form_dept_cd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 15 17:46:46 KST 2009 */