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


package chosun.ciis.mc.budg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.ds.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_6001_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String tms;
	public String budg_frym;
	public String budg_toym;
	public String budg_frcd;
	public String budg_tocd;
	public String dept_frcd;
	public String dept_tocd;
	public String evnt_frcd;
	public String evnt_tocd;
	public String sort;

	public MC_BUDG_6001_LDM(){}
	public MC_BUDG_6001_LDM(String cmpy_cd, String tms, String budg_frym, String budg_toym, String budg_frcd, String budg_tocd, String dept_frcd, String dept_tocd, String evnt_frcd, String evnt_tocd, String sort){
		this.cmpy_cd = cmpy_cd;
		this.tms = tms;
		this.budg_frym = budg_frym;
		this.budg_toym = budg_toym;
		this.budg_frcd = budg_frcd;
		this.budg_tocd = budg_tocd;
		this.dept_frcd = dept_frcd;
		this.dept_tocd = dept_tocd;
		this.evnt_frcd = evnt_frcd;
		this.evnt_tocd = evnt_tocd;
		this.sort = sort;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setTms(String tms){
		this.tms = tms;
	}

	public void setBudg_frym(String budg_frym){
		this.budg_frym = budg_frym;
	}

	public void setBudg_toym(String budg_toym){
		this.budg_toym = budg_toym;
	}

	public void setBudg_frcd(String budg_frcd){
		this.budg_frcd = budg_frcd;
	}

	public void setBudg_tocd(String budg_tocd){
		this.budg_tocd = budg_tocd;
	}

	public void setDept_frcd(String dept_frcd){
		this.dept_frcd = dept_frcd;
	}

	public void setDept_tocd(String dept_tocd){
		this.dept_tocd = dept_tocd;
	}

	public void setEvnt_frcd(String evnt_frcd){
		this.evnt_frcd = evnt_frcd;
	}

	public void setEvnt_tocd(String evnt_tocd){
		this.evnt_tocd = evnt_tocd;
	}

	public void setSort(String sort){
		this.sort = sort;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getTms(){
		return this.tms;
	}

	public String getBudg_frym(){
		return this.budg_frym;
	}

	public String getBudg_toym(){
		return this.budg_toym;
	}

	public String getBudg_frcd(){
		return this.budg_frcd;
	}

	public String getBudg_tocd(){
		return this.budg_tocd;
	}

	public String getDept_frcd(){
		return this.dept_frcd;
	}

	public String getDept_tocd(){
		return this.dept_tocd;
	}

	public String getEvnt_frcd(){
		return this.evnt_frcd;
	}

	public String getEvnt_tocd(){
		return this.evnt_tocd;
	}

	public String getSort(){
		return this.sort;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_6001_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_6001_LDM dm = (MC_BUDG_6001_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.tms);
		cstmt.setString(5, dm.budg_frym);
		cstmt.setString(6, dm.budg_toym);
		cstmt.setString(7, dm.budg_frcd);
		cstmt.setString(8, dm.budg_tocd);
		cstmt.setString(9, dm.dept_frcd);
		cstmt.setString(10, dm.dept_tocd);
		cstmt.setString(11, dm.evnt_frcd);
		cstmt.setString(12, dm.evnt_tocd);
		cstmt.setString(13, dm.sort);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_6001_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("tms = [" + getTms() + "]");
		System.out.println("budg_frym = [" + getBudg_frym() + "]");
		System.out.println("budg_toym = [" + getBudg_toym() + "]");
		System.out.println("budg_frcd = [" + getBudg_frcd() + "]");
		System.out.println("budg_tocd = [" + getBudg_tocd() + "]");
		System.out.println("dept_frcd = [" + getDept_frcd() + "]");
		System.out.println("dept_tocd = [" + getDept_tocd() + "]");
		System.out.println("evnt_frcd = [" + getEvnt_frcd() + "]");
		System.out.println("evnt_tocd = [" + getEvnt_tocd() + "]");
		System.out.println("sort = [" + getSort() + "]");
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
String tms = req.getParameter("tms");
if( tms == null){
	System.out.println(this.toString+" : tms is null" );
}else{
	System.out.println(this.toString+" : tms is "+tms );
}
String budg_frym = req.getParameter("budg_frym");
if( budg_frym == null){
	System.out.println(this.toString+" : budg_frym is null" );
}else{
	System.out.println(this.toString+" : budg_frym is "+budg_frym );
}
String budg_toym = req.getParameter("budg_toym");
if( budg_toym == null){
	System.out.println(this.toString+" : budg_toym is null" );
}else{
	System.out.println(this.toString+" : budg_toym is "+budg_toym );
}
String budg_frcd = req.getParameter("budg_frcd");
if( budg_frcd == null){
	System.out.println(this.toString+" : budg_frcd is null" );
}else{
	System.out.println(this.toString+" : budg_frcd is "+budg_frcd );
}
String budg_tocd = req.getParameter("budg_tocd");
if( budg_tocd == null){
	System.out.println(this.toString+" : budg_tocd is null" );
}else{
	System.out.println(this.toString+" : budg_tocd is "+budg_tocd );
}
String dept_frcd = req.getParameter("dept_frcd");
if( dept_frcd == null){
	System.out.println(this.toString+" : dept_frcd is null" );
}else{
	System.out.println(this.toString+" : dept_frcd is "+dept_frcd );
}
String dept_tocd = req.getParameter("dept_tocd");
if( dept_tocd == null){
	System.out.println(this.toString+" : dept_tocd is null" );
}else{
	System.out.println(this.toString+" : dept_tocd is "+dept_tocd );
}
String evnt_frcd = req.getParameter("evnt_frcd");
if( evnt_frcd == null){
	System.out.println(this.toString+" : evnt_frcd is null" );
}else{
	System.out.println(this.toString+" : evnt_frcd is "+evnt_frcd );
}
String evnt_tocd = req.getParameter("evnt_tocd");
if( evnt_tocd == null){
	System.out.println(this.toString+" : evnt_tocd is null" );
}else{
	System.out.println(this.toString+" : evnt_tocd is "+evnt_tocd );
}
String sort = req.getParameter("sort");
if( sort == null){
	System.out.println(this.toString+" : sort is null" );
}else{
	System.out.println(this.toString+" : sort is "+sort );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String tms = Util.checkString(req.getParameter("tms"));
String budg_frym = Util.checkString(req.getParameter("budg_frym"));
String budg_toym = Util.checkString(req.getParameter("budg_toym"));
String budg_frcd = Util.checkString(req.getParameter("budg_frcd"));
String budg_tocd = Util.checkString(req.getParameter("budg_tocd"));
String dept_frcd = Util.checkString(req.getParameter("dept_frcd"));
String dept_tocd = Util.checkString(req.getParameter("dept_tocd"));
String evnt_frcd = Util.checkString(req.getParameter("evnt_frcd"));
String evnt_tocd = Util.checkString(req.getParameter("evnt_tocd"));
String sort = Util.checkString(req.getParameter("sort"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String tms = Util.Uni2Ksc(Util.checkString(req.getParameter("tms")));
String budg_frym = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_frym")));
String budg_toym = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_toym")));
String budg_frcd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_frcd")));
String budg_tocd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_tocd")));
String dept_frcd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_frcd")));
String dept_tocd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_tocd")));
String evnt_frcd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_frcd")));
String evnt_tocd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_tocd")));
String sort = Util.Uni2Ksc(Util.checkString(req.getParameter("sort")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setTms(tms);
dm.setBudg_frym(budg_frym);
dm.setBudg_toym(budg_toym);
dm.setBudg_frcd(budg_frcd);
dm.setBudg_tocd(budg_tocd);
dm.setDept_frcd(dept_frcd);
dm.setDept_tocd(dept_tocd);
dm.setEvnt_frcd(evnt_frcd);
dm.setEvnt_tocd(evnt_tocd);
dm.setSort(sort);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 25 19:17:19 KST 2009 */