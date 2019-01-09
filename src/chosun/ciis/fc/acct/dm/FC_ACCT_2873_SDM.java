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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2873_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String frrcpm_shet_dlv_dt;
	public String torcpm_shet_dlv_dt;
	public String dept_cd;
	public String emp_no;
	public String bef_dept_cd;
	public String retn_dt;

	public FC_ACCT_2873_SDM(){}
	public FC_ACCT_2873_SDM(String cmpy_cd, String frrcpm_shet_dlv_dt, String torcpm_shet_dlv_dt, String dept_cd, String emp_no, String bef_dept_cd, String retn_dt){
		this.cmpy_cd = cmpy_cd;
		this.frrcpm_shet_dlv_dt = frrcpm_shet_dlv_dt;
		this.torcpm_shet_dlv_dt = torcpm_shet_dlv_dt;
		this.dept_cd = dept_cd;
		this.emp_no = emp_no;
		this.bef_dept_cd = bef_dept_cd;
		this.retn_dt = retn_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFrrcpm_shet_dlv_dt(String frrcpm_shet_dlv_dt){
		this.frrcpm_shet_dlv_dt = frrcpm_shet_dlv_dt;
	}

	public void setTorcpm_shet_dlv_dt(String torcpm_shet_dlv_dt){
		this.torcpm_shet_dlv_dt = torcpm_shet_dlv_dt;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setBef_dept_cd(String bef_dept_cd){
		this.bef_dept_cd = bef_dept_cd;
	}

	public void setRetn_dt(String retn_dt){
		this.retn_dt = retn_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFrrcpm_shet_dlv_dt(){
		return this.frrcpm_shet_dlv_dt;
	}

	public String getTorcpm_shet_dlv_dt(){
		return this.torcpm_shet_dlv_dt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getBef_dept_cd(){
		return this.bef_dept_cd;
	}

	public String getRetn_dt(){
		return this.retn_dt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2873_S(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2873_SDM dm = (FC_ACCT_2873_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.frrcpm_shet_dlv_dt);
		cstmt.setString(5, dm.torcpm_shet_dlv_dt);
		cstmt.setString(6, dm.dept_cd);
		cstmt.setString(7, dm.emp_no);
		cstmt.setString(8, dm.bef_dept_cd);
		cstmt.setString(9, dm.retn_dt);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2873_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("frrcpm_shet_dlv_dt = [" + getFrrcpm_shet_dlv_dt() + "]");
		System.out.println("torcpm_shet_dlv_dt = [" + getTorcpm_shet_dlv_dt() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("bef_dept_cd = [" + getBef_dept_cd() + "]");
		System.out.println("retn_dt = [" + getRetn_dt() + "]");
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
String frrcpm_shet_dlv_dt = req.getParameter("frrcpm_shet_dlv_dt");
if( frrcpm_shet_dlv_dt == null){
	System.out.println(this.toString+" : frrcpm_shet_dlv_dt is null" );
}else{
	System.out.println(this.toString+" : frrcpm_shet_dlv_dt is "+frrcpm_shet_dlv_dt );
}
String torcpm_shet_dlv_dt = req.getParameter("torcpm_shet_dlv_dt");
if( torcpm_shet_dlv_dt == null){
	System.out.println(this.toString+" : torcpm_shet_dlv_dt is null" );
}else{
	System.out.println(this.toString+" : torcpm_shet_dlv_dt is "+torcpm_shet_dlv_dt );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String bef_dept_cd = req.getParameter("bef_dept_cd");
if( bef_dept_cd == null){
	System.out.println(this.toString+" : bef_dept_cd is null" );
}else{
	System.out.println(this.toString+" : bef_dept_cd is "+bef_dept_cd );
}
String retn_dt = req.getParameter("retn_dt");
if( retn_dt == null){
	System.out.println(this.toString+" : retn_dt is null" );
}else{
	System.out.println(this.toString+" : retn_dt is "+retn_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String frrcpm_shet_dlv_dt = Util.checkString(req.getParameter("frrcpm_shet_dlv_dt"));
String torcpm_shet_dlv_dt = Util.checkString(req.getParameter("torcpm_shet_dlv_dt"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String bef_dept_cd = Util.checkString(req.getParameter("bef_dept_cd"));
String retn_dt = Util.checkString(req.getParameter("retn_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String frrcpm_shet_dlv_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("frrcpm_shet_dlv_dt")));
String torcpm_shet_dlv_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("torcpm_shet_dlv_dt")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String bef_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bef_dept_cd")));
String retn_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("retn_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFrrcpm_shet_dlv_dt(frrcpm_shet_dlv_dt);
dm.setTorcpm_shet_dlv_dt(torcpm_shet_dlv_dt);
dm.setDept_cd(dept_cd);
dm.setEmp_no(emp_no);
dm.setBef_dept_cd(bef_dept_cd);
dm.setRetn_dt(retn_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 03 17:11:07 KST 2009 */