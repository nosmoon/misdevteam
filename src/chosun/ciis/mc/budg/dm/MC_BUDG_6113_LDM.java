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


public class MC_BUDG_6113_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yyyy;
	public String tms;
	public String last_yyyymm;
	public String clas_cd1;
	public String clas_cd2;
	public String clas_cd3;
	public String clas_cd4;

	public MC_BUDG_6113_LDM(){}
	public MC_BUDG_6113_LDM(String cmpy_cd, String yyyy, String tms, String last_yyyymm, String clas_cd1, String clas_cd2, String clas_cd3, String clas_cd4){
		this.cmpy_cd = cmpy_cd;
		this.yyyy = yyyy;
		this.tms = tms;
		this.last_yyyymm = last_yyyymm;
		this.clas_cd1 = clas_cd1;
		this.clas_cd2 = clas_cd2;
		this.clas_cd3 = clas_cd3;
		this.clas_cd4 = clas_cd4;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYyyy(String yyyy){
		this.yyyy = yyyy;
	}

	public void setTms(String tms){
		this.tms = tms;
	}

	public void setLast_yyyymm(String last_yyyymm){
		this.last_yyyymm = last_yyyymm;
	}

	public void setClas_cd1(String clas_cd1){
		this.clas_cd1 = clas_cd1;
	}

	public void setClas_cd2(String clas_cd2){
		this.clas_cd2 = clas_cd2;
	}

	public void setClas_cd3(String clas_cd3){
		this.clas_cd3 = clas_cd3;
	}

	public void setClas_cd4(String clas_cd4){
		this.clas_cd4 = clas_cd4;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYyyy(){
		return this.yyyy;
	}

	public String getTms(){
		return this.tms;
	}

	public String getLast_yyyymm(){
		return this.last_yyyymm;
	}

	public String getClas_cd1(){
		return this.clas_cd1;
	}

	public String getClas_cd2(){
		return this.clas_cd2;
	}

	public String getClas_cd3(){
		return this.clas_cd3;
	}

	public String getClas_cd4(){
		return this.clas_cd4;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_6113_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_6113_LDM dm = (MC_BUDG_6113_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yyyy);
		cstmt.setString(5, dm.tms);
		cstmt.setString(6, dm.last_yyyymm);
		cstmt.setString(7, dm.clas_cd1);
		cstmt.setString(8, dm.clas_cd2);
		cstmt.setString(9, dm.clas_cd3);
		cstmt.setString(10, dm.clas_cd4);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_6113_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yyyy = [" + getYyyy() + "]");
		System.out.println("tms = [" + getTms() + "]");
		System.out.println("last_yyyymm = [" + getLast_yyyymm() + "]");
		System.out.println("clas_cd1 = [" + getClas_cd1() + "]");
		System.out.println("clas_cd2 = [" + getClas_cd2() + "]");
		System.out.println("clas_cd3 = [" + getClas_cd3() + "]");
		System.out.println("clas_cd4 = [" + getClas_cd4() + "]");
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
String yyyy = req.getParameter("yyyy");
if( yyyy == null){
	System.out.println(this.toString+" : yyyy is null" );
}else{
	System.out.println(this.toString+" : yyyy is "+yyyy );
}
String tms = req.getParameter("tms");
if( tms == null){
	System.out.println(this.toString+" : tms is null" );
}else{
	System.out.println(this.toString+" : tms is "+tms );
}
String last_yyyymm = req.getParameter("last_yyyymm");
if( last_yyyymm == null){
	System.out.println(this.toString+" : last_yyyymm is null" );
}else{
	System.out.println(this.toString+" : last_yyyymm is "+last_yyyymm );
}
String clas_cd1 = req.getParameter("clas_cd1");
if( clas_cd1 == null){
	System.out.println(this.toString+" : clas_cd1 is null" );
}else{
	System.out.println(this.toString+" : clas_cd1 is "+clas_cd1 );
}
String clas_cd2 = req.getParameter("clas_cd2");
if( clas_cd2 == null){
	System.out.println(this.toString+" : clas_cd2 is null" );
}else{
	System.out.println(this.toString+" : clas_cd2 is "+clas_cd2 );
}
String clas_cd3 = req.getParameter("clas_cd3");
if( clas_cd3 == null){
	System.out.println(this.toString+" : clas_cd3 is null" );
}else{
	System.out.println(this.toString+" : clas_cd3 is "+clas_cd3 );
}
String clas_cd4 = req.getParameter("clas_cd4");
if( clas_cd4 == null){
	System.out.println(this.toString+" : clas_cd4 is null" );
}else{
	System.out.println(this.toString+" : clas_cd4 is "+clas_cd4 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yyyy = Util.checkString(req.getParameter("yyyy"));
String tms = Util.checkString(req.getParameter("tms"));
String last_yyyymm = Util.checkString(req.getParameter("last_yyyymm"));
String clas_cd1 = Util.checkString(req.getParameter("clas_cd1"));
String clas_cd2 = Util.checkString(req.getParameter("clas_cd2"));
String clas_cd3 = Util.checkString(req.getParameter("clas_cd3"));
String clas_cd4 = Util.checkString(req.getParameter("clas_cd4"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yyyy = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyy")));
String tms = Util.Uni2Ksc(Util.checkString(req.getParameter("tms")));
String last_yyyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("last_yyyymm")));
String clas_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("clas_cd1")));
String clas_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("clas_cd2")));
String clas_cd3 = Util.Uni2Ksc(Util.checkString(req.getParameter("clas_cd3")));
String clas_cd4 = Util.Uni2Ksc(Util.checkString(req.getParameter("clas_cd4")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYyyy(yyyy);
dm.setTms(tms);
dm.setLast_yyyymm(last_yyyymm);
dm.setClas_cd1(clas_cd1);
dm.setClas_cd2(clas_cd2);
dm.setClas_cd3(clas_cd3);
dm.setClas_cd4(clas_cd4);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 06 19:43:07 KST 2009 */