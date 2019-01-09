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


package chosun.ciis.mc.cost.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.cost.ds.*;
import chosun.ciis.mc.cost.rec.*;

/**
 * 
 */


public class MC_COST_1043_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yymm;
	public String emp_no;
	public String dstb_cd;
	public String incmg_pers;
	public String cost_clsf;

	public MC_COST_1043_UDM(){}
	public MC_COST_1043_UDM(String cmpy_cd, String yymm, String emp_no, String dstb_cd, String incmg_pers, String cost_clsf){
		this.cmpy_cd = cmpy_cd;
		this.yymm = yymm;
		this.emp_no = emp_no;
		this.dstb_cd = dstb_cd;
		this.incmg_pers = incmg_pers;
		this.cost_clsf = cost_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setDstb_cd(String dstb_cd){
		this.dstb_cd = dstb_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setCost_clsf(String cost_clsf){
		this.cost_clsf = cost_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getDstb_cd(){
		return this.dstb_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getCost_clsf(){
		return this.cost_clsf;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_COST_1043_U(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_COST_1043_UDM dm = (MC_COST_1043_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yymm);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.dstb_cd);
		cstmt.setString(7, dm.incmg_pers);
		cstmt.setString(8, dm.cost_clsf);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.cost.ds.MC_COST_1043_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("dstb_cd = [" + getDstb_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("cost_clsf = [" + getCost_clsf() + "]");
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
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String dstb_cd = req.getParameter("dstb_cd");
if( dstb_cd == null){
	System.out.println(this.toString+" : dstb_cd is null" );
}else{
	System.out.println(this.toString+" : dstb_cd is "+dstb_cd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String cost_clsf = req.getParameter("cost_clsf");
if( cost_clsf == null){
	System.out.println(this.toString+" : cost_clsf is null" );
}else{
	System.out.println(this.toString+" : cost_clsf is "+cost_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String dstb_cd = Util.checkString(req.getParameter("dstb_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String cost_clsf = Util.checkString(req.getParameter("cost_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String dstb_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dstb_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String cost_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYymm(yymm);
dm.setEmp_no(emp_no);
dm.setDstb_cd(dstb_cd);
dm.setIncmg_pers(incmg_pers);
dm.setCost_clsf(cost_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 29 21:19:46 KST 2009 */