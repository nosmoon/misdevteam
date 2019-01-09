/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


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


public class HD_VACA_3520_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String save;
	public String cmpy_cd;
	public String emp_no;
	public String chg_dept_cd;
	public String chg_dty_cd;
	public String chg_posi_cd;
	public String plan_dt;
	public String incmg_pers;

	public HD_VACA_3520_ADM(){}
	public HD_VACA_3520_ADM(String mode, String save, String cmpy_cd, String emp_no, String chg_dept_cd, String chg_dty_cd, String chg_posi_cd, String plan_dt, String incmg_pers){
		this.mode = mode;
		this.save = save;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.chg_dept_cd = chg_dept_cd;
		this.chg_dty_cd = chg_dty_cd;
		this.chg_posi_cd = chg_posi_cd;
		this.plan_dt = plan_dt;
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setSave(String save){
		this.save = save;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setChg_dept_cd(String chg_dept_cd){
		this.chg_dept_cd = chg_dept_cd;
	}

	public void setChg_dty_cd(String chg_dty_cd){
		this.chg_dty_cd = chg_dty_cd;
	}

	public void setChg_posi_cd(String chg_posi_cd){
		this.chg_posi_cd = chg_posi_cd;
	}

	public void setPlan_dt(String plan_dt){
		this.plan_dt = plan_dt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSave(){
		return this.save;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getChg_dept_cd(){
		return this.chg_dept_cd;
	}

	public String getChg_dty_cd(){
		return this.chg_dty_cd;
	}

	public String getChg_posi_cd(){
		return this.chg_posi_cd;
	}

	public String getPlan_dt(){
		return this.plan_dt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_VACA_3520_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_VACA_3520_ADM dm = (HD_VACA_3520_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.save);
		cstmt.setString(5, dm.cmpy_cd);
		cstmt.setString(6, dm.emp_no);
		cstmt.setString(7, dm.chg_dept_cd);
		cstmt.setString(8, dm.chg_dty_cd);
		cstmt.setString(9, dm.chg_posi_cd);
		cstmt.setString(10, dm.plan_dt);
		cstmt.setString(11, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.vaca.ds.HD_VACA_3520_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("save = [" + getSave() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("chg_dept_cd = [" + getChg_dept_cd() + "]");
		System.out.println("chg_dty_cd = [" + getChg_dty_cd() + "]");
		System.out.println("chg_posi_cd = [" + getChg_posi_cd() + "]");
		System.out.println("plan_dt = [" + getPlan_dt() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String save = req.getParameter("save");
if( save == null){
	System.out.println(this.toString+" : save is null" );
}else{
	System.out.println(this.toString+" : save is "+save );
}
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
String chg_dept_cd = req.getParameter("chg_dept_cd");
if( chg_dept_cd == null){
	System.out.println(this.toString+" : chg_dept_cd is null" );
}else{
	System.out.println(this.toString+" : chg_dept_cd is "+chg_dept_cd );
}
String chg_dty_cd = req.getParameter("chg_dty_cd");
if( chg_dty_cd == null){
	System.out.println(this.toString+" : chg_dty_cd is null" );
}else{
	System.out.println(this.toString+" : chg_dty_cd is "+chg_dty_cd );
}
String chg_posi_cd = req.getParameter("chg_posi_cd");
if( chg_posi_cd == null){
	System.out.println(this.toString+" : chg_posi_cd is null" );
}else{
	System.out.println(this.toString+" : chg_posi_cd is "+chg_posi_cd );
}
String plan_dt = req.getParameter("plan_dt");
if( plan_dt == null){
	System.out.println(this.toString+" : plan_dt is null" );
}else{
	System.out.println(this.toString+" : plan_dt is "+plan_dt );
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

String mode = Util.checkString(req.getParameter("mode"));
String save = Util.checkString(req.getParameter("save"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String chg_dept_cd = Util.checkString(req.getParameter("chg_dept_cd"));
String chg_dty_cd = Util.checkString(req.getParameter("chg_dty_cd"));
String chg_posi_cd = Util.checkString(req.getParameter("chg_posi_cd"));
String plan_dt = Util.checkString(req.getParameter("plan_dt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String save = Util.Uni2Ksc(Util.checkString(req.getParameter("save")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String chg_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_dept_cd")));
String chg_dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_dty_cd")));
String chg_posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_posi_cd")));
String plan_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("plan_dt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setSave(save);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setChg_dept_cd(chg_dept_cd);
dm.setChg_dty_cd(chg_dty_cd);
dm.setChg_posi_cd(chg_posi_cd);
dm.setPlan_dt(plan_dt);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 06 11:30:44 KST 2015 */