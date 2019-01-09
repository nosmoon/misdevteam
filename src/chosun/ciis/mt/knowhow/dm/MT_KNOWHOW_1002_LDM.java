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


package chosun.ciis.mt.knowhow.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.knowhow.ds.*;
import chosun.ciis.mt.knowhow.rec.*;

/**
 * 
 */


public class MT_KNOWHOW_1002_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String lcls;
	public String qust_answer;
	public String reg_dt_fr;
	public String reg_dt_to;
	public String dept_cd;

	public MT_KNOWHOW_1002_LDM(){}
	public MT_KNOWHOW_1002_LDM(String cmpy_cd, String lcls, String qust_answer, String reg_dt_fr, String reg_dt_to, String dept_cd){
		this.cmpy_cd = cmpy_cd;
		this.lcls = lcls;
		this.qust_answer = qust_answer;
		this.reg_dt_fr = reg_dt_fr;
		this.reg_dt_to = reg_dt_to;
		this.dept_cd = dept_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setLcls(String lcls){
		this.lcls = lcls;
	}

	public void setQust_answer(String qust_answer){
		this.qust_answer = qust_answer;
	}

	public void setReg_dt_fr(String reg_dt_fr){
		this.reg_dt_fr = reg_dt_fr;
	}

	public void setReg_dt_to(String reg_dt_to){
		this.reg_dt_to = reg_dt_to;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getLcls(){
		return this.lcls;
	}

	public String getQust_answer(){
		return this.qust_answer;
	}

	public String getReg_dt_fr(){
		return this.reg_dt_fr;
	}

	public String getReg_dt_to(){
		return this.reg_dt_to;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_KNOWHOW_1002_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_KNOWHOW_1002_LDM dm = (MT_KNOWHOW_1002_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.lcls);
		cstmt.setString(5, dm.qust_answer);
		cstmt.setString(6, dm.reg_dt_fr);
		cstmt.setString(7, dm.reg_dt_to);
		cstmt.setString(8, dm.dept_cd);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.knowhow.ds.MT_KNOWHOW_1002_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("lcls = [" + getLcls() + "]");
		System.out.println("qust_answer = [" + getQust_answer() + "]");
		System.out.println("reg_dt_fr = [" + getReg_dt_fr() + "]");
		System.out.println("reg_dt_to = [" + getReg_dt_to() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
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
String lcls = req.getParameter("lcls");
if( lcls == null){
	System.out.println(this.toString+" : lcls is null" );
}else{
	System.out.println(this.toString+" : lcls is "+lcls );
}
String qust_answer = req.getParameter("qust_answer");
if( qust_answer == null){
	System.out.println(this.toString+" : qust_answer is null" );
}else{
	System.out.println(this.toString+" : qust_answer is "+qust_answer );
}
String reg_dt_fr = req.getParameter("reg_dt_fr");
if( reg_dt_fr == null){
	System.out.println(this.toString+" : reg_dt_fr is null" );
}else{
	System.out.println(this.toString+" : reg_dt_fr is "+reg_dt_fr );
}
String reg_dt_to = req.getParameter("reg_dt_to");
if( reg_dt_to == null){
	System.out.println(this.toString+" : reg_dt_to is null" );
}else{
	System.out.println(this.toString+" : reg_dt_to is "+reg_dt_to );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String lcls = Util.checkString(req.getParameter("lcls"));
String qust_answer = Util.checkString(req.getParameter("qust_answer"));
String reg_dt_fr = Util.checkString(req.getParameter("reg_dt_fr"));
String reg_dt_to = Util.checkString(req.getParameter("reg_dt_to"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String lcls = Util.Uni2Ksc(Util.checkString(req.getParameter("lcls")));
String qust_answer = Util.Uni2Ksc(Util.checkString(req.getParameter("qust_answer")));
String reg_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_dt_fr")));
String reg_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_dt_to")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setLcls(lcls);
dm.setQust_answer(qust_answer);
dm.setReg_dt_fr(reg_dt_fr);
dm.setReg_dt_to(reg_dt_to);
dm.setDept_cd(dept_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 10 13:20:24 KST 2009 */