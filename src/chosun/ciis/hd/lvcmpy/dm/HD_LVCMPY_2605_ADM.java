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


package chosun.ciis.hd.lvcmpy.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.ds.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_2605_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String flnm;
	public String ernm;
	public String ern_no;
	public String acct_no;
	public String lgl_rcpm_amt;
	public String rcpm_amt;
	public String rcpm_dt;
	public String mtry_dt;
	public String irp_amt;
	public String lvcmpy_dt;
	public String incmg_pers;

	public HD_LVCMPY_2605_ADM(){}
	public HD_LVCMPY_2605_ADM(String cmpy_cd, String emp_no, String flnm, String ernm, String ern_no, String acct_no, String lgl_rcpm_amt, String rcpm_amt, String rcpm_dt, String mtry_dt, String irp_amt, String lvcmpy_dt, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.ernm = ernm;
		this.ern_no = ern_no;
		this.acct_no = acct_no;
		this.lgl_rcpm_amt = lgl_rcpm_amt;
		this.rcpm_amt = rcpm_amt;
		this.rcpm_dt = rcpm_dt;
		this.mtry_dt = mtry_dt;
		this.irp_amt = irp_amt;
		this.lvcmpy_dt = lvcmpy_dt;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setErnm(String ernm){
		this.ernm = ernm;
	}

	public void setErn_no(String ern_no){
		this.ern_no = ern_no;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setLgl_rcpm_amt(String lgl_rcpm_amt){
		this.lgl_rcpm_amt = lgl_rcpm_amt;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setRcpm_dt(String rcpm_dt){
		this.rcpm_dt = rcpm_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setIrp_amt(String irp_amt){
		this.irp_amt = irp_amt;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getErnm(){
		return this.ernm;
	}

	public String getErn_no(){
		return this.ern_no;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getLgl_rcpm_amt(){
		return this.lgl_rcpm_amt;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getRcpm_dt(){
		return this.rcpm_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getIrp_amt(){
		return this.irp_amt;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){ 
		 return "{ call MISHDL.SP_HD_LVCMPY_2605_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_LVCMPY_2605_ADM dm = (HD_LVCMPY_2605_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.flnm);
		cstmt.setString(6, dm.ernm);
		cstmt.setString(7, dm.ern_no);
		cstmt.setString(8, dm.acct_no);
		cstmt.setString(9, dm.lgl_rcpm_amt);
		cstmt.setString(10, dm.rcpm_amt);
		cstmt.setString(11, dm.rcpm_dt);
		cstmt.setString(12, dm.mtry_dt);
		cstmt.setString(13, dm.irp_amt);
		cstmt.setString(14, dm.lvcmpy_dt);
		cstmt.setString(15, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.lvcmpy.ds.HD_LVCMPY_2605_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("ernm = [" + getErnm() + "]");
		System.out.println("ern_no = [" + getErn_no() + "]");
		System.out.println("acct_no = [" + getAcct_no() + "]");
		System.out.println("lgl_rcpm_amt = [" + getLgl_rcpm_amt() + "]");
		System.out.println("rcpm_amt = [" + getRcpm_amt() + "]");
		System.out.println("rcpm_dt = [" + getRcpm_dt() + "]");
		System.out.println("mtry_dt = [" + getMtry_dt() + "]");
		System.out.println("irp_amt = [" + getIrp_amt() + "]");
		System.out.println("lvcmpy_dt = [" + getLvcmpy_dt() + "]");
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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String ernm = req.getParameter("ernm");
if( ernm == null){
	System.out.println(this.toString+" : ernm is null" );
}else{
	System.out.println(this.toString+" : ernm is "+ernm );
}
String ern_no = req.getParameter("ern_no");
if( ern_no == null){
	System.out.println(this.toString+" : ern_no is null" );
}else{
	System.out.println(this.toString+" : ern_no is "+ern_no );
}
String acct_no = req.getParameter("acct_no");
if( acct_no == null){
	System.out.println(this.toString+" : acct_no is null" );
}else{
	System.out.println(this.toString+" : acct_no is "+acct_no );
}
String lgl_rcpm_amt = req.getParameter("lgl_rcpm_amt");
if( lgl_rcpm_amt == null){
	System.out.println(this.toString+" : lgl_rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : lgl_rcpm_amt is "+lgl_rcpm_amt );
}
String rcpm_amt = req.getParameter("rcpm_amt");
if( rcpm_amt == null){
	System.out.println(this.toString+" : rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : rcpm_amt is "+rcpm_amt );
}
String rcpm_dt = req.getParameter("rcpm_dt");
if( rcpm_dt == null){
	System.out.println(this.toString+" : rcpm_dt is null" );
}else{
	System.out.println(this.toString+" : rcpm_dt is "+rcpm_dt );
}
String mtry_dt = req.getParameter("mtry_dt");
if( mtry_dt == null){
	System.out.println(this.toString+" : mtry_dt is null" );
}else{
	System.out.println(this.toString+" : mtry_dt is "+mtry_dt );
}
String irp_amt = req.getParameter("irp_amt");
if( irp_amt == null){
	System.out.println(this.toString+" : irp_amt is null" );
}else{
	System.out.println(this.toString+" : irp_amt is "+irp_amt );
}
String lvcmpy_dt = req.getParameter("lvcmpy_dt");
if( lvcmpy_dt == null){
	System.out.println(this.toString+" : lvcmpy_dt is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_dt is "+lvcmpy_dt );
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
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String ernm = Util.checkString(req.getParameter("ernm"));
String ern_no = Util.checkString(req.getParameter("ern_no"));
String acct_no = Util.checkString(req.getParameter("acct_no"));
String lgl_rcpm_amt = Util.checkString(req.getParameter("lgl_rcpm_amt"));
String rcpm_amt = Util.checkString(req.getParameter("rcpm_amt"));
String rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String irp_amt = Util.checkString(req.getParameter("irp_amt"));
String lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String ernm = Util.Uni2Ksc(Util.checkString(req.getParameter("ernm")));
String ern_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ern_no")));
String acct_no = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_no")));
String lgl_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("lgl_rcpm_amt")));
String rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_amt")));
String rcpm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_dt")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String irp_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("irp_amt")));
String lvcmpy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_dt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setErnm(ernm);
dm.setErn_no(ern_no);
dm.setAcct_no(acct_no);
dm.setLgl_rcpm_amt(lgl_rcpm_amt);
dm.setRcpm_amt(rcpm_amt);
dm.setRcpm_dt(rcpm_dt);
dm.setMtry_dt(mtry_dt);
dm.setIrp_amt(irp_amt);
dm.setLvcmpy_dt(lvcmpy_dt);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 12 18:56:34 KST 2013 */