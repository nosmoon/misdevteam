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


package chosun.ciis.hd.saly.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.ds.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_8002_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String dept_cd;
	public String pens_clsf;
	public String pens_aply_mm;
	public String prsn_pens_amt;
	public String prsn_sppt_amt;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String remk;

	public HD_SALY_8002_ADM(){}
	public HD_SALY_8002_ADM(String cmpy_cd, String emp_no, String dept_cd, String pens_clsf, String pens_aply_mm, String prsn_pens_amt, String prsn_sppt_amt, String incmg_pers, String incmg_pers_ipadd, String remk){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.dept_cd = dept_cd;
		this.pens_clsf = pens_clsf;
		this.pens_aply_mm = pens_aply_mm;
		this.prsn_pens_amt = prsn_pens_amt;
		this.prsn_sppt_amt = prsn_sppt_amt;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.remk = remk;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setPens_clsf(String pens_clsf){
		this.pens_clsf = pens_clsf;
	}

	public void setPens_aply_mm(String pens_aply_mm){
		this.pens_aply_mm = pens_aply_mm;
	}

	public void setPrsn_pens_amt(String prsn_pens_amt){
		this.prsn_pens_amt = prsn_pens_amt;
	}

	public void setPrsn_sppt_amt(String prsn_sppt_amt){
		this.prsn_sppt_amt = prsn_sppt_amt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getPens_clsf(){
		return this.pens_clsf;
	}

	public String getPens_aply_mm(){
		return this.pens_aply_mm;
	}

	public String getPrsn_pens_amt(){
		return this.prsn_pens_amt;
	}

	public String getPrsn_sppt_amt(){
		return this.prsn_sppt_amt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_8002_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_8002_ADM dm = (HD_SALY_8002_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.dept_cd);
		cstmt.setString(6, dm.pens_clsf);
		cstmt.setString(7, dm.pens_aply_mm);
		cstmt.setString(8, dm.prsn_pens_amt);
		cstmt.setString(9, dm.prsn_sppt_amt);
		cstmt.setString(10, dm.incmg_pers);
		cstmt.setString(11, dm.incmg_pers_ipadd);
		cstmt.setString(12, dm.remk);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.saly.ds.HD_SALY_8002_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("pens_clsf = [" + getPens_clsf() + "]");
		System.out.println("pens_aply_mm = [" + getPens_aply_mm() + "]");
		System.out.println("prsn_pens_amt = [" + getPrsn_pens_amt() + "]");
		System.out.println("prsn_sppt_amt = [" + getPrsn_sppt_amt() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("remk = [" + getRemk() + "]");
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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String pens_clsf = req.getParameter("pens_clsf");
if( pens_clsf == null){
	System.out.println(this.toString+" : pens_clsf is null" );
}else{
	System.out.println(this.toString+" : pens_clsf is "+pens_clsf );
}
String pens_aply_mm = req.getParameter("pens_aply_mm");
if( pens_aply_mm == null){
	System.out.println(this.toString+" : pens_aply_mm is null" );
}else{
	System.out.println(this.toString+" : pens_aply_mm is "+pens_aply_mm );
}
String prsn_pens_amt = req.getParameter("prsn_pens_amt");
if( prsn_pens_amt == null){
	System.out.println(this.toString+" : prsn_pens_amt is null" );
}else{
	System.out.println(this.toString+" : prsn_pens_amt is "+prsn_pens_amt );
}
String prsn_sppt_amt = req.getParameter("prsn_sppt_amt");
if( prsn_sppt_amt == null){
	System.out.println(this.toString+" : prsn_sppt_amt is null" );
}else{
	System.out.println(this.toString+" : prsn_sppt_amt is "+prsn_sppt_amt );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String pens_clsf = Util.checkString(req.getParameter("pens_clsf"));
String pens_aply_mm = Util.checkString(req.getParameter("pens_aply_mm"));
String prsn_pens_amt = Util.checkString(req.getParameter("prsn_pens_amt"));
String prsn_sppt_amt = Util.checkString(req.getParameter("prsn_sppt_amt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String remk = Util.checkString(req.getParameter("remk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String pens_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("pens_clsf")));
String pens_aply_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("pens_aply_mm")));
String prsn_pens_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("prsn_pens_amt")));
String prsn_sppt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("prsn_sppt_amt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setDept_cd(dept_cd);
dm.setPens_clsf(pens_clsf);
dm.setPens_aply_mm(pens_aply_mm);
dm.setPrsn_pens_amt(prsn_pens_amt);
dm.setPrsn_sppt_amt(prsn_sppt_amt);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setRemk(remk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 19 15:23:47 KST 2016 */