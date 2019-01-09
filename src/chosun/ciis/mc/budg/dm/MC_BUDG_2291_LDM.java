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


public class MC_BUDG_2291_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String budg_yymm_fr;
	public String budg_yymm_to;
	public String dept_cd;
	public String in_bulen;
	public String budg_cd_fr;
	public String budg_cd_to;
	public String medi_cd;
	public String dtls_medi_cd;
	public String rmks;
	public String emp_no;

	public MC_BUDG_2291_LDM(){}
	public MC_BUDG_2291_LDM(String cmpy_cd, String budg_yymm_fr, String budg_yymm_to, String dept_cd, String in_bulen, String budg_cd_fr, String budg_cd_to, String medi_cd, String dtls_medi_cd, String rmks, String emp_no){
		this.cmpy_cd = cmpy_cd;
		this.budg_yymm_fr = budg_yymm_fr;
		this.budg_yymm_to = budg_yymm_to;
		this.dept_cd = dept_cd;
		this.in_bulen = in_bulen;
		this.budg_cd_fr = budg_cd_fr;
		this.budg_cd_to = budg_cd_to;
		this.medi_cd = medi_cd;
		this.dtls_medi_cd = dtls_medi_cd;
		this.rmks = rmks;
		this.emp_no = emp_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBudg_yymm_fr(String budg_yymm_fr){
		this.budg_yymm_fr = budg_yymm_fr;
	}

	public void setBudg_yymm_to(String budg_yymm_to){
		this.budg_yymm_to = budg_yymm_to;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setIn_bulen(String in_bulen){
		this.in_bulen = in_bulen;
	}

	public void setBudg_cd_fr(String budg_cd_fr){
		this.budg_cd_fr = budg_cd_fr;
	}

	public void setBudg_cd_to(String budg_cd_to){
		this.budg_cd_to = budg_cd_to;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBudg_yymm_fr(){
		return this.budg_yymm_fr;
	}

	public String getBudg_yymm_to(){
		return this.budg_yymm_to;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getIn_bulen(){
		return this.in_bulen;
	}

	public String getBudg_cd_fr(){
		return this.budg_cd_fr;
	}

	public String getBudg_cd_to(){
		return this.budg_cd_to;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_2291_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_2291_LDM dm = (MC_BUDG_2291_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.budg_yymm_fr);
		cstmt.setString(5, dm.budg_yymm_to);
		cstmt.setString(6, dm.dept_cd);
		cstmt.setString(7, dm.in_bulen);
		cstmt.setString(8, dm.budg_cd_fr);
		cstmt.setString(9, dm.budg_cd_to);
		cstmt.setString(10, dm.medi_cd);
		cstmt.setString(11, dm.dtls_medi_cd);
		cstmt.setString(12, dm.rmks);
		cstmt.setString(13, dm.emp_no);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_2291_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("budg_yymm_fr = [" + getBudg_yymm_fr() + "]");
		System.out.println("budg_yymm_to = [" + getBudg_yymm_to() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("in_bulen = [" + getIn_bulen() + "]");
		System.out.println("budg_cd_fr = [" + getBudg_cd_fr() + "]");
		System.out.println("budg_cd_to = [" + getBudg_cd_to() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("dtls_medi_cd = [" + getDtls_medi_cd() + "]");
		System.out.println("rmks = [" + getRmks() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
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
String budg_yymm_fr = req.getParameter("budg_yymm_fr");
if( budg_yymm_fr == null){
	System.out.println(this.toString+" : budg_yymm_fr is null" );
}else{
	System.out.println(this.toString+" : budg_yymm_fr is "+budg_yymm_fr );
}
String budg_yymm_to = req.getParameter("budg_yymm_to");
if( budg_yymm_to == null){
	System.out.println(this.toString+" : budg_yymm_to is null" );
}else{
	System.out.println(this.toString+" : budg_yymm_to is "+budg_yymm_to );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String in_bulen = req.getParameter("in_bulen");
if( in_bulen == null){
	System.out.println(this.toString+" : in_bulen is null" );
}else{
	System.out.println(this.toString+" : in_bulen is "+in_bulen );
}
String budg_cd_fr = req.getParameter("budg_cd_fr");
if( budg_cd_fr == null){
	System.out.println(this.toString+" : budg_cd_fr is null" );
}else{
	System.out.println(this.toString+" : budg_cd_fr is "+budg_cd_fr );
}
String budg_cd_to = req.getParameter("budg_cd_to");
if( budg_cd_to == null){
	System.out.println(this.toString+" : budg_cd_to is null" );
}else{
	System.out.println(this.toString+" : budg_cd_to is "+budg_cd_to );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String dtls_medi_cd = req.getParameter("dtls_medi_cd");
if( dtls_medi_cd == null){
	System.out.println(this.toString+" : dtls_medi_cd is null" );
}else{
	System.out.println(this.toString+" : dtls_medi_cd is "+dtls_medi_cd );
}
String rmks = req.getParameter("rmks");
if( rmks == null){
	System.out.println(this.toString+" : rmks is null" );
}else{
	System.out.println(this.toString+" : rmks is "+rmks );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String budg_yymm_fr = Util.checkString(req.getParameter("budg_yymm_fr"));
String budg_yymm_to = Util.checkString(req.getParameter("budg_yymm_to"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String in_bulen = Util.checkString(req.getParameter("in_bulen"));
String budg_cd_fr = Util.checkString(req.getParameter("budg_cd_fr"));
String budg_cd_to = Util.checkString(req.getParameter("budg_cd_to"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
String rmks = Util.checkString(req.getParameter("rmks"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String budg_yymm_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yymm_fr")));
String budg_yymm_to = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yymm_to")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String in_bulen = Util.Uni2Ksc(Util.checkString(req.getParameter("in_bulen")));
String budg_cd_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd_fr")));
String budg_cd_to = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd_to")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String dtls_medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_medi_cd")));
String rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBudg_yymm_fr(budg_yymm_fr);
dm.setBudg_yymm_to(budg_yymm_to);
dm.setDept_cd(dept_cd);
dm.setIn_bulen(in_bulen);
dm.setBudg_cd_fr(budg_cd_fr);
dm.setBudg_cd_to(budg_cd_to);
dm.setMedi_cd(medi_cd);
dm.setDtls_medi_cd(dtls_medi_cd);
dm.setRmks(rmks);
dm.setEmp_no(emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 12 16:51:47 KST 2015 */