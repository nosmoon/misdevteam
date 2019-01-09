/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.as.mach.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.mach.ds.*;
import chosun.ciis.as.mach.rec.*;

/**
 * 
 */


public class AS_MACH_1120_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String work_clsf_cd;
	public String mach_clsf_cd;
	public String mach_clsf_nm;
	public String cont_year;
	public String bldg_clsf_cd;
	public String bldg_clsf_nm;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String job_clsf;
	public String tab_mode;

	public AS_MACH_1120_ADM(){}
	public AS_MACH_1120_ADM(String cmpy_cd, String work_clsf_cd, String mach_clsf_cd, String mach_clsf_nm, String cont_year, String bldg_clsf_cd, String bldg_clsf_nm, String incmg_pers_ipadd, String incmg_pers, String job_clsf, String tab_mode){
		this.cmpy_cd = cmpy_cd;
		this.work_clsf_cd = work_clsf_cd;
		this.mach_clsf_cd = mach_clsf_cd;
		this.mach_clsf_nm = mach_clsf_nm;
		this.cont_year = cont_year;
		this.bldg_clsf_cd = bldg_clsf_cd;
		this.bldg_clsf_nm = bldg_clsf_nm;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.job_clsf = job_clsf;
		this.tab_mode = tab_mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setWork_clsf_cd(String work_clsf_cd){
		this.work_clsf_cd = work_clsf_cd;
	}

	public void setMach_clsf_cd(String mach_clsf_cd){
		this.mach_clsf_cd = mach_clsf_cd;
	}

	public void setMach_clsf_nm(String mach_clsf_nm){
		this.mach_clsf_nm = mach_clsf_nm;
	}

	public void setCont_year(String cont_year){
		this.cont_year = cont_year;
	}

	public void setBldg_clsf_cd(String bldg_clsf_cd){
		this.bldg_clsf_cd = bldg_clsf_cd;
	}

	public void setBldg_clsf_nm(String bldg_clsf_nm){
		this.bldg_clsf_nm = bldg_clsf_nm;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public void setTab_mode(String tab_mode){
		this.tab_mode = tab_mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getWork_clsf_cd(){
		return this.work_clsf_cd;
	}

	public String getMach_clsf_cd(){
		return this.mach_clsf_cd;
	}

	public String getMach_clsf_nm(){
		return this.mach_clsf_nm;
	}

	public String getCont_year(){
		return this.cont_year;
	}

	public String getBldg_clsf_cd(){
		return this.bldg_clsf_cd;
	}

	public String getBldg_clsf_nm(){
		return this.bldg_clsf_nm;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getTab_mode(){
		return this.tab_mode;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_MACH_1120_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_MACH_1120_ADM dm = (AS_MACH_1120_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.work_clsf_cd);
		cstmt.setString(5, dm.mach_clsf_cd);
		cstmt.setString(6, dm.mach_clsf_nm);
		cstmt.setString(7, dm.cont_year);
		cstmt.setString(8, dm.bldg_clsf_cd);
		cstmt.setString(9, dm.bldg_clsf_nm);
		cstmt.setString(10, dm.incmg_pers_ipadd);
		cstmt.setString(11, dm.incmg_pers);
		cstmt.setString(12, dm.job_clsf);
		cstmt.setString(13, dm.tab_mode);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.mach.ds.AS_MACH_1120_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("work_clsf_cd = [" + getWork_clsf_cd() + "]");
		System.out.println("mach_clsf_cd = [" + getMach_clsf_cd() + "]");
		System.out.println("mach_clsf_nm = [" + getMach_clsf_nm() + "]");
		System.out.println("cont_year = [" + getCont_year() + "]");
		System.out.println("bldg_clsf_cd = [" + getBldg_clsf_cd() + "]");
		System.out.println("bldg_clsf_nm = [" + getBldg_clsf_nm() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("job_clsf = [" + getJob_clsf() + "]");
		System.out.println("tab_mode = [" + getTab_mode() + "]");
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
String work_clsf_cd = req.getParameter("work_clsf_cd");
if( work_clsf_cd == null){
	System.out.println(this.toString+" : work_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : work_clsf_cd is "+work_clsf_cd );
}
String mach_clsf_cd = req.getParameter("mach_clsf_cd");
if( mach_clsf_cd == null){
	System.out.println(this.toString+" : mach_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : mach_clsf_cd is "+mach_clsf_cd );
}
String mach_clsf_nm = req.getParameter("mach_clsf_nm");
if( mach_clsf_nm == null){
	System.out.println(this.toString+" : mach_clsf_nm is null" );
}else{
	System.out.println(this.toString+" : mach_clsf_nm is "+mach_clsf_nm );
}
String cont_year = req.getParameter("cont_year");
if( cont_year == null){
	System.out.println(this.toString+" : cont_year is null" );
}else{
	System.out.println(this.toString+" : cont_year is "+cont_year );
}
String bldg_clsf_cd = req.getParameter("bldg_clsf_cd");
if( bldg_clsf_cd == null){
	System.out.println(this.toString+" : bldg_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : bldg_clsf_cd is "+bldg_clsf_cd );
}
String bldg_clsf_nm = req.getParameter("bldg_clsf_nm");
if( bldg_clsf_nm == null){
	System.out.println(this.toString+" : bldg_clsf_nm is null" );
}else{
	System.out.println(this.toString+" : bldg_clsf_nm is "+bldg_clsf_nm );
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
String job_clsf = req.getParameter("job_clsf");
if( job_clsf == null){
	System.out.println(this.toString+" : job_clsf is null" );
}else{
	System.out.println(this.toString+" : job_clsf is "+job_clsf );
}
String tab_mode = req.getParameter("tab_mode");
if( tab_mode == null){
	System.out.println(this.toString+" : tab_mode is null" );
}else{
	System.out.println(this.toString+" : tab_mode is "+tab_mode );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String work_clsf_cd = Util.checkString(req.getParameter("work_clsf_cd"));
String mach_clsf_cd = Util.checkString(req.getParameter("mach_clsf_cd"));
String mach_clsf_nm = Util.checkString(req.getParameter("mach_clsf_nm"));
String cont_year = Util.checkString(req.getParameter("cont_year"));
String bldg_clsf_cd = Util.checkString(req.getParameter("bldg_clsf_cd"));
String bldg_clsf_nm = Util.checkString(req.getParameter("bldg_clsf_nm"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String job_clsf = Util.checkString(req.getParameter("job_clsf"));
String tab_mode = Util.checkString(req.getParameter("tab_mode"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String work_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("work_clsf_cd")));
String mach_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("mach_clsf_cd")));
String mach_clsf_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("mach_clsf_nm")));
String cont_year = Util.Uni2Ksc(Util.checkString(req.getParameter("cont_year")));
String bldg_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bldg_clsf_cd")));
String bldg_clsf_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("bldg_clsf_nm")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String job_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("job_clsf")));
String tab_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("tab_mode")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setWork_clsf_cd(work_clsf_cd);
dm.setMach_clsf_cd(mach_clsf_cd);
dm.setMach_clsf_nm(mach_clsf_nm);
dm.setCont_year(cont_year);
dm.setBldg_clsf_cd(bldg_clsf_cd);
dm.setBldg_clsf_nm(bldg_clsf_nm);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setJob_clsf(job_clsf);
dm.setTab_mode(tab_mode);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 25 15:38:28 KST 2015 */