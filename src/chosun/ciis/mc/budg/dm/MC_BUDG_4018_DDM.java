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


public class MC_BUDG_4018_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String budg_yy;
	public String work_dt;
	public String hsty_no;
	public String sub_no;

	public MC_BUDG_4018_DDM(){}
	public MC_BUDG_4018_DDM(String cmpy_cd, String budg_yy, String work_dt, String hsty_no, String sub_no){
		this.cmpy_cd = cmpy_cd;
		this.budg_yy = budg_yy;
		this.work_dt = work_dt;
		this.hsty_no = hsty_no;
		this.sub_no = sub_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBudg_yy(String budg_yy){
		this.budg_yy = budg_yy;
	}

	public void setWork_dt(String work_dt){
		this.work_dt = work_dt;
	}

	public void setHsty_no(String hsty_no){
		this.hsty_no = hsty_no;
	}

	public void setSub_no(String sub_no){
		this.sub_no = sub_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBudg_yy(){
		return this.budg_yy;
	}

	public String getWork_dt(){
		return this.work_dt;
	}

	public String getHsty_no(){
		return this.hsty_no;
	}

	public String getSub_no(){
		return this.sub_no;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_4018_D(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_4018_DDM dm = (MC_BUDG_4018_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.budg_yy);
		cstmt.setString(5, dm.work_dt);
		cstmt.setString(6, dm.hsty_no);
		cstmt.setString(7, dm.sub_no);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_4018_DDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("budg_yy = [" + getBudg_yy() + "]");
		System.out.println("work_dt = [" + getWork_dt() + "]");
		System.out.println("hsty_no = [" + getHsty_no() + "]");
		System.out.println("sub_no = [" + getSub_no() + "]");
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
String budg_yy = req.getParameter("budg_yy");
if( budg_yy == null){
	System.out.println(this.toString+" : budg_yy is null" );
}else{
	System.out.println(this.toString+" : budg_yy is "+budg_yy );
}
String work_dt = req.getParameter("work_dt");
if( work_dt == null){
	System.out.println(this.toString+" : work_dt is null" );
}else{
	System.out.println(this.toString+" : work_dt is "+work_dt );
}
String hsty_no = req.getParameter("hsty_no");
if( hsty_no == null){
	System.out.println(this.toString+" : hsty_no is null" );
}else{
	System.out.println(this.toString+" : hsty_no is "+hsty_no );
}
String sub_no = req.getParameter("sub_no");
if( sub_no == null){
	System.out.println(this.toString+" : sub_no is null" );
}else{
	System.out.println(this.toString+" : sub_no is "+sub_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String budg_yy = Util.checkString(req.getParameter("budg_yy"));
String work_dt = Util.checkString(req.getParameter("work_dt"));
String hsty_no = Util.checkString(req.getParameter("hsty_no"));
String sub_no = Util.checkString(req.getParameter("sub_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String budg_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yy")));
String work_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("work_dt")));
String hsty_no = Util.Uni2Ksc(Util.checkString(req.getParameter("hsty_no")));
String sub_no = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBudg_yy(budg_yy);
dm.setWork_dt(work_dt);
dm.setHsty_no(hsty_no);
dm.setSub_no(sub_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 25 19:56:49 KST 2009 */