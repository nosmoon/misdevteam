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


public class MC_CO_1012_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String cd;
	public String cdnm;
	public String dept_cd;
	public String clas_cd1;
	public String clas_cd2;
	public String clas_cd3;
	public String clas_cd4;

	public MC_CO_1012_LDM(){}
	public MC_CO_1012_LDM(String cmpy_cd, String cd, String cdnm, String dept_cd, String clas_cd1, String clas_cd2, String clas_cd3, String clas_cd4){
		this.cmpy_cd = cmpy_cd;
		this.cd = cd;
		this.cdnm = cdnm;
		this.dept_cd = dept_cd;
		this.clas_cd1 = clas_cd1;
		this.clas_cd2 = clas_cd2;
		this.clas_cd3 = clas_cd3;
		this.clas_cd4 = clas_cd4;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
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

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
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
		 return "{ call MISFNC.SP_MC_CO_1012_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_CO_1012_LDM dm = (MC_CO_1012_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.cd);
		cstmt.setString(5, dm.cdnm);
		cstmt.setString(6, dm.dept_cd);
		cstmt.setString(7, dm.clas_cd1);
		cstmt.setString(8, dm.clas_cd2);
		cstmt.setString(9, dm.clas_cd3);
		cstmt.setString(10, dm.clas_cd4);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.co.ds.MC_CO_1012_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("cd = [" + getCd() + "]");
		System.out.println("cdnm = [" + getCdnm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
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
String cd = req.getParameter("cd");
if( cd == null){
	System.out.println(this.toString+" : cd is null" );
}else{
	System.out.println(this.toString+" : cd is "+cd );
}
String cdnm = req.getParameter("cdnm");
if( cdnm == null){
	System.out.println(this.toString+" : cdnm is null" );
}else{
	System.out.println(this.toString+" : cdnm is "+cdnm );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
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
String cd = Util.checkString(req.getParameter("cd"));
String cdnm = Util.checkString(req.getParameter("cdnm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String clas_cd1 = Util.checkString(req.getParameter("clas_cd1"));
String clas_cd2 = Util.checkString(req.getParameter("clas_cd2"));
String clas_cd3 = Util.checkString(req.getParameter("clas_cd3"));
String clas_cd4 = Util.checkString(req.getParameter("clas_cd4"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cd")));
String cdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cdnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String clas_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("clas_cd1")));
String clas_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("clas_cd2")));
String clas_cd3 = Util.Uni2Ksc(Util.checkString(req.getParameter("clas_cd3")));
String clas_cd4 = Util.Uni2Ksc(Util.checkString(req.getParameter("clas_cd4")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCd(cd);
dm.setCdnm(cdnm);
dm.setDept_cd(dept_cd);
dm.setClas_cd1(clas_cd1);
dm.setClas_cd2(clas_cd2);
dm.setClas_cd3(clas_cd3);
dm.setClas_cd4(clas_cd4);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 10 15:59:23 KST 2009 */