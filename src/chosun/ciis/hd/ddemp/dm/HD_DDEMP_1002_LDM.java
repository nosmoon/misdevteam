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


package chosun.ciis.hd.ddemp.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.ddemp.ds.*;
import chosun.ciis.hd.ddemp.rec.*;

/**
 * 
 */


public class HD_DDEMP_1002_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String duty_yymm;
	public String proc_stat_clsf;
	public String actu_slip_no;
	public String dept_cd;
	public String gubun;

	public HD_DDEMP_1002_LDM(){}
	public HD_DDEMP_1002_LDM(String cmpy_cd, String duty_yymm, String proc_stat_clsf, String actu_slip_no, String dept_cd, String gubun){
		this.cmpy_cd = cmpy_cd;
		this.duty_yymm = duty_yymm;
		this.proc_stat_clsf = proc_stat_clsf;
		this.actu_slip_no = actu_slip_no;
		this.dept_cd = dept_cd;
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDuty_yymm(String duty_yymm){
		this.duty_yymm = duty_yymm;
	}

	public void setProc_stat_clsf(String proc_stat_clsf){
		this.proc_stat_clsf = proc_stat_clsf;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDuty_yymm(){
		return this.duty_yymm;
	}

	public String getProc_stat_clsf(){
		return this.proc_stat_clsf;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_DDEMP_1002_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_DDEMP_1002_LDM dm = (HD_DDEMP_1002_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.duty_yymm);
		cstmt.setString(5, dm.proc_stat_clsf);
		cstmt.setString(6, dm.actu_slip_no);
		cstmt.setString(7, dm.dept_cd);
		cstmt.setString(8, dm.gubun);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.ddemp.ds.HD_DDEMP_1002_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("duty_yymm = [" + getDuty_yymm() + "]");
		System.out.println("proc_stat_clsf = [" + getProc_stat_clsf() + "]");
		System.out.println("actu_slip_no = [" + getActu_slip_no() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
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
String duty_yymm = req.getParameter("duty_yymm");
if( duty_yymm == null){
	System.out.println(this.toString+" : duty_yymm is null" );
}else{
	System.out.println(this.toString+" : duty_yymm is "+duty_yymm );
}
String proc_stat_clsf = req.getParameter("proc_stat_clsf");
if( proc_stat_clsf == null){
	System.out.println(this.toString+" : proc_stat_clsf is null" );
}else{
	System.out.println(this.toString+" : proc_stat_clsf is "+proc_stat_clsf );
}
String actu_slip_no = req.getParameter("actu_slip_no");
if( actu_slip_no == null){
	System.out.println(this.toString+" : actu_slip_no is null" );
}else{
	System.out.println(this.toString+" : actu_slip_no is "+actu_slip_no );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String duty_yymm = Util.checkString(req.getParameter("duty_yymm"));
String proc_stat_clsf = Util.checkString(req.getParameter("proc_stat_clsf"));
String actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String gubun = Util.checkString(req.getParameter("gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String duty_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_yymm")));
String proc_stat_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat_clsf")));
String actu_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("actu_slip_no")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDuty_yymm(duty_yymm);
dm.setProc_stat_clsf(proc_stat_clsf);
dm.setActu_slip_no(actu_slip_no);
dm.setDept_cd(dept_cd);
dm.setGubun(gubun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Dec 27 10:47:05 KST 2017 */