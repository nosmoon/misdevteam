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


package chosun.ciis.sp.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.ds.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_3640_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String sale_yymm;
	public String incmg_dept_cd;
	public String incmg_pers_ip;
	public String incmg_pers;

	public SP_SAL_3640_ADM(){}
	public SP_SAL_3640_ADM(String cmpy_cd, String sale_yymm, String incmg_dept_cd, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.sale_yymm = sale_yymm;
		this.incmg_dept_cd = incmg_dept_cd;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSale_yymm(String sale_yymm){
		this.sale_yymm = sale_yymm;
	}

	public void setIncmg_dept_cd(String incmg_dept_cd){
		this.incmg_dept_cd = incmg_dept_cd;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSale_yymm(){
		return this.sale_yymm;
	}

	public String getIncmg_dept_cd(){
		return this.incmg_dept_cd;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SAL_3640_A(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SAL_3640_ADM dm = (SP_SAL_3640_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.sale_yymm);
		cstmt.setString(5, dm.incmg_dept_cd);
		cstmt.setString(6, dm.incmg_pers_ip);
		cstmt.setString(7, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sal.ds.SP_SAL_3640_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("sale_yymm = [" + getSale_yymm() + "]");
		System.out.println("incmg_dept_cd = [" + getIncmg_dept_cd() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
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
String sale_yymm = req.getParameter("sale_yymm");
if( sale_yymm == null){
	System.out.println(this.toString+" : sale_yymm is null" );
}else{
	System.out.println(this.toString+" : sale_yymm is "+sale_yymm );
}
String incmg_dept_cd = req.getParameter("incmg_dept_cd");
if( incmg_dept_cd == null){
	System.out.println(this.toString+" : incmg_dept_cd is null" );
}else{
	System.out.println(this.toString+" : incmg_dept_cd is "+incmg_dept_cd );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
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
String sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
String incmg_dept_cd = Util.checkString(req.getParameter("incmg_dept_cd"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String sale_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_yymm")));
String incmg_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dept_cd")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSale_yymm(sale_yymm);
dm.setIncmg_dept_cd(incmg_dept_cd);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Jul 29 13:50:37 KST 2012 */