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


public class MC_BUDG_6011_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String len;
	public String level;
	public String budg_clas_frcd;
	public String budg_clas_tocd;
	public String budg_frym;
	public String budg_toym;
	public String dept_frcd;
	public String dept_tocd;
	public String tms;

	public MC_BUDG_6011_LDM(){}
	public MC_BUDG_6011_LDM(String cmpy_cd, String len, String level, String budg_clas_frcd, String budg_clas_tocd, String budg_frym, String budg_toym, String dept_frcd, String dept_tocd, String tms){
		this.cmpy_cd = cmpy_cd;
		this.len = len;
		this.level = level;
		this.budg_clas_frcd = budg_clas_frcd;
		this.budg_clas_tocd = budg_clas_tocd;
		this.budg_frym = budg_frym;
		this.budg_toym = budg_toym;
		this.dept_frcd = dept_frcd;
		this.dept_tocd = dept_tocd;
		this.tms = tms;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setLen(String len){
		this.len = len;
	}

	public void setLevel(String level){
		this.level = level;
	}

	public void setBudg_clas_frcd(String budg_clas_frcd){
		this.budg_clas_frcd = budg_clas_frcd;
	}

	public void setBudg_clas_tocd(String budg_clas_tocd){
		this.budg_clas_tocd = budg_clas_tocd;
	}

	public void setBudg_frym(String budg_frym){
		this.budg_frym = budg_frym;
	}

	public void setBudg_toym(String budg_toym){
		this.budg_toym = budg_toym;
	}

	public void setDept_frcd(String dept_frcd){
		this.dept_frcd = dept_frcd;
	}

	public void setDept_tocd(String dept_tocd){
		this.dept_tocd = dept_tocd;
	}

	public void setTms(String tms){
		this.tms = tms;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getLen(){
		return this.len;
	}

	public String getLevel(){
		return this.level;
	}

	public String getBudg_clas_frcd(){
		return this.budg_clas_frcd;
	}

	public String getBudg_clas_tocd(){
		return this.budg_clas_tocd;
	}

	public String getBudg_frym(){
		return this.budg_frym;
	}

	public String getBudg_toym(){
		return this.budg_toym;
	}

	public String getDept_frcd(){
		return this.dept_frcd;
	}

	public String getDept_tocd(){
		return this.dept_tocd;
	}

	public String getTms(){
		return this.tms;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_6011_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_6011_LDM dm = (MC_BUDG_6011_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.len);
		cstmt.setString(5, dm.level);
		cstmt.setString(6, dm.budg_clas_frcd);
		cstmt.setString(7, dm.budg_clas_tocd);
		cstmt.setString(8, dm.budg_frym);
		cstmt.setString(9, dm.budg_toym);
		cstmt.setString(10, dm.dept_frcd);
		cstmt.setString(11, dm.dept_tocd);
		cstmt.setString(12, dm.tms);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_6011_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("len = [" + getLen() + "]");
		System.out.println("level = [" + getLevel() + "]");
		System.out.println("budg_clas_frcd = [" + getBudg_clas_frcd() + "]");
		System.out.println("budg_clas_tocd = [" + getBudg_clas_tocd() + "]");
		System.out.println("budg_frym = [" + getBudg_frym() + "]");
		System.out.println("budg_toym = [" + getBudg_toym() + "]");
		System.out.println("dept_frcd = [" + getDept_frcd() + "]");
		System.out.println("dept_tocd = [" + getDept_tocd() + "]");
		System.out.println("tms = [" + getTms() + "]");
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
String len = req.getParameter("len");
if( len == null){
	System.out.println(this.toString+" : len is null" );
}else{
	System.out.println(this.toString+" : len is "+len );
}
String level = req.getParameter("level");
if( level == null){
	System.out.println(this.toString+" : level is null" );
}else{
	System.out.println(this.toString+" : level is "+level );
}
String budg_clas_frcd = req.getParameter("budg_clas_frcd");
if( budg_clas_frcd == null){
	System.out.println(this.toString+" : budg_clas_frcd is null" );
}else{
	System.out.println(this.toString+" : budg_clas_frcd is "+budg_clas_frcd );
}
String budg_clas_tocd = req.getParameter("budg_clas_tocd");
if( budg_clas_tocd == null){
	System.out.println(this.toString+" : budg_clas_tocd is null" );
}else{
	System.out.println(this.toString+" : budg_clas_tocd is "+budg_clas_tocd );
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
String tms = req.getParameter("tms");
if( tms == null){
	System.out.println(this.toString+" : tms is null" );
}else{
	System.out.println(this.toString+" : tms is "+tms );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String len = Util.checkString(req.getParameter("len"));
String level = Util.checkString(req.getParameter("level"));
String budg_clas_frcd = Util.checkString(req.getParameter("budg_clas_frcd"));
String budg_clas_tocd = Util.checkString(req.getParameter("budg_clas_tocd"));
String budg_frym = Util.checkString(req.getParameter("budg_frym"));
String budg_toym = Util.checkString(req.getParameter("budg_toym"));
String dept_frcd = Util.checkString(req.getParameter("dept_frcd"));
String dept_tocd = Util.checkString(req.getParameter("dept_tocd"));
String tms = Util.checkString(req.getParameter("tms"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String len = Util.Uni2Ksc(Util.checkString(req.getParameter("len")));
String level = Util.Uni2Ksc(Util.checkString(req.getParameter("level")));
String budg_clas_frcd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_clas_frcd")));
String budg_clas_tocd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_clas_tocd")));
String budg_frym = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_frym")));
String budg_toym = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_toym")));
String dept_frcd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_frcd")));
String dept_tocd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_tocd")));
String tms = Util.Uni2Ksc(Util.checkString(req.getParameter("tms")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setLen(len);
dm.setLevel(level);
dm.setBudg_clas_frcd(budg_clas_frcd);
dm.setBudg_clas_tocd(budg_clas_tocd);
dm.setBudg_frym(budg_frym);
dm.setBudg_toym(budg_toym);
dm.setDept_frcd(dept_frcd);
dm.setDept_tocd(dept_tocd);
dm.setTms(tms);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 01 11:53:50 KST 2009 */