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


package chosun.ciis.hd.orga.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.orga.ds.*;
import chosun.ciis.hd.orga.rec.*;

/**
 * 
 */


public class HD_ORGA_1204_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String orga_reorga_dd;
	public String mode;
	public String supr_dept_cd;
	public String dept_cd;
	public String level;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_ORGA_1204_ADM(){}
	public HD_ORGA_1204_ADM(String cmpy_cd, String orga_reorga_dd, String mode, String supr_dept_cd, String dept_cd, String level, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.orga_reorga_dd = orga_reorga_dd;
		this.mode = mode;
		this.supr_dept_cd = supr_dept_cd;
		this.dept_cd = dept_cd;
		this.level = level;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOrga_reorga_dd(String orga_reorga_dd){
		this.orga_reorga_dd = orga_reorga_dd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setSupr_dept_cd(String supr_dept_cd){
		this.supr_dept_cd = supr_dept_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setLevel(String level){
		this.level = level;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOrga_reorga_dd(){
		return this.orga_reorga_dd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSupr_dept_cd(){
		return this.supr_dept_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getLevel(){
		return this.level;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_ORGA_1204_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_ORGA_1204_ADM dm = (HD_ORGA_1204_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.orga_reorga_dd);
		cstmt.setString(5, dm.mode);
		cstmt.setString(6, dm.supr_dept_cd);
		cstmt.setString(7, dm.dept_cd);
		cstmt.setString(8, dm.level);
		cstmt.setString(9, dm.incmg_pers_ipadd);
		cstmt.setString(10, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.orga.ds.HD_ORGA_1204_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("orga_reorga_dd = [" + getOrga_reorga_dd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("supr_dept_cd = [" + getSupr_dept_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("level = [" + getLevel() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String orga_reorga_dd = req.getParameter("orga_reorga_dd");
if( orga_reorga_dd == null){
	System.out.println(this.toString+" : orga_reorga_dd is null" );
}else{
	System.out.println(this.toString+" : orga_reorga_dd is "+orga_reorga_dd );
}
String supr_dept_cd = req.getParameter("supr_dept_cd");
if( supr_dept_cd == null){
	System.out.println(this.toString+" : supr_dept_cd is null" );
}else{
	System.out.println(this.toString+" : supr_dept_cd is "+supr_dept_cd );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String level = req.getParameter("level");
if( level == null){
	System.out.println(this.toString+" : level is null" );
}else{
	System.out.println(this.toString+" : level is "+level );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String orga_reorga_dd = Util.checkString(req.getParameter("orga_reorga_dd"));
String supr_dept_cd = Util.checkString(req.getParameter("supr_dept_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String level = Util.checkString(req.getParameter("level"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String orga_reorga_dd = Util.Uni2Ksc(Util.checkString(req.getParameter("orga_reorga_dd")));
String supr_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("supr_dept_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String level = Util.Uni2Ksc(Util.checkString(req.getParameter("level")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOrga_reorga_dd(orga_reorga_dd);
dm.setSupr_dept_cd(supr_dept_cd);
dm.setDept_cd(dept_cd);
dm.setLevel(level);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 11 10:45:14 KST 2009 */