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


package chosun.ciis.is.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bas.ds.*;
import chosun.ciis.is.bas.rec.*;

/**
 * 
 */


public class IS_BAS_1830_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dept_cd;
	public String mode;
	public String decid_pre_seq;
	public String decid_pers_dty_cd;
	public String decid_pers;
	public String aprv_step_yn;
	public String incmg_pers;
	public String incmg_pers_ip;

	public IS_BAS_1830_ADM(){}
	public IS_BAS_1830_ADM(String cmpy_cd, String dept_cd, String mode, String decid_pre_seq, String decid_pers_dty_cd, String decid_pers, String aprv_step_yn, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.dept_cd = dept_cd;
		this.mode = mode;
		this.decid_pre_seq = decid_pre_seq;
		this.decid_pers_dty_cd = decid_pers_dty_cd;
		this.decid_pers = decid_pers;
		this.aprv_step_yn = aprv_step_yn;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setDecid_pre_seq(String decid_pre_seq){
		this.decid_pre_seq = decid_pre_seq;
	}

	public void setDecid_pers_dty_cd(String decid_pers_dty_cd){
		this.decid_pers_dty_cd = decid_pers_dty_cd;
	}

	public void setDecid_pers(String decid_pers){
		this.decid_pers = decid_pers;
	}

	public void setAprv_step_yn(String aprv_step_yn){
		this.aprv_step_yn = aprv_step_yn;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getDecid_pre_seq(){
		return this.decid_pre_seq;
	}

	public String getDecid_pers_dty_cd(){
		return this.decid_pers_dty_cd;
	}

	public String getDecid_pers(){
		return this.decid_pers;
	}

	public String getAprv_step_yn(){
		return this.aprv_step_yn;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_BAS_1830_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_BAS_1830_ADM dm = (IS_BAS_1830_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dept_cd);
		cstmt.setString(5, dm.mode);
		cstmt.setString(6, dm.decid_pre_seq);
		cstmt.setString(7, dm.decid_pers_dty_cd);
		cstmt.setString(8, dm.decid_pers);
		cstmt.setString(9, dm.aprv_step_yn);
		cstmt.setString(10, dm.incmg_pers);
		cstmt.setString(11, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.bas.ds.IS_BAS_1830_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("decid_pre_seq = [" + getDecid_pre_seq() + "]");
		System.out.println("decid_pers_dty_cd = [" + getDecid_pers_dty_cd() + "]");
		System.out.println("decid_pers = [" + getDecid_pers() + "]");
		System.out.println("aprv_step_yn = [" + getAprv_step_yn() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
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
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String decid_pre_seq = req.getParameter("decid_pre_seq");
if( decid_pre_seq == null){
	System.out.println(this.toString+" : decid_pre_seq is null" );
}else{
	System.out.println(this.toString+" : decid_pre_seq is "+decid_pre_seq );
}
String decid_pers_dty_cd = req.getParameter("decid_pers_dty_cd");
if( decid_pers_dty_cd == null){
	System.out.println(this.toString+" : decid_pers_dty_cd is null" );
}else{
	System.out.println(this.toString+" : decid_pers_dty_cd is "+decid_pers_dty_cd );
}
String decid_pers = req.getParameter("decid_pers");
if( decid_pers == null){
	System.out.println(this.toString+" : decid_pers is null" );
}else{
	System.out.println(this.toString+" : decid_pers is "+decid_pers );
}
String aprv_step_yn = req.getParameter("aprv_step_yn");
if( aprv_step_yn == null){
	System.out.println(this.toString+" : aprv_step_yn is null" );
}else{
	System.out.println(this.toString+" : aprv_step_yn is "+aprv_step_yn );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String decid_pre_seq = Util.checkString(req.getParameter("decid_pre_seq"));
String decid_pers_dty_cd = Util.checkString(req.getParameter("decid_pers_dty_cd"));
String decid_pers = Util.checkString(req.getParameter("decid_pers"));
String aprv_step_yn = Util.checkString(req.getParameter("aprv_step_yn"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String decid_pre_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("decid_pre_seq")));
String decid_pers_dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("decid_pers_dty_cd")));
String decid_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("decid_pers")));
String aprv_step_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("aprv_step_yn")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDept_cd(dept_cd);
dm.setMode(mode);
dm.setDecid_pre_seq(decid_pre_seq);
dm.setDecid_pers_dty_cd(decid_pers_dty_cd);
dm.setDecid_pers(decid_pers);
dm.setAprv_step_yn(aprv_step_yn);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 24 10:59:42 KST 2012 */