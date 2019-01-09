/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_SLS_EXTN_5220_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String proc_dt;
	public String regdt;
	public String regno;
	public String empseq;
	public String medi_amt;
	public String mob_amt;
	public String tax1;
	public String tax2;
	public String tax3;

	public SS_SLS_EXTN_5220_UDM(){}
	public SS_SLS_EXTN_5220_UDM(String incmgpers, String proc_dt, String regdt, String regno, String empseq, String medi_amt, String mob_amt, String tax1, String tax2, String tax3){
		this.incmgpers = incmgpers;
		this.proc_dt = proc_dt;
		this.regdt = regdt;
		this.regno = regno;
		this.empseq = empseq;
		this.medi_amt = medi_amt;
		this.mob_amt = mob_amt;
		this.tax1 = tax1;
		this.tax2 = tax2;
		this.tax3 = tax3;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setProc_dt(String proc_dt){
		this.proc_dt = proc_dt;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setEmpseq(String empseq){
		this.empseq = empseq;
	}

	public void setMedi_amt(String medi_amt){
		this.medi_amt = medi_amt;
	}

	public void setMob_amt(String mob_amt){
		this.mob_amt = mob_amt;
	}

	public void setTax1(String tax1){
		this.tax1 = tax1;
	}

	public void setTax2(String tax2){
		this.tax2 = tax2;
	}

	public void setTax3(String tax3){
		this.tax3 = tax3;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getProc_dt(){
		return this.proc_dt;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getEmpseq(){
		return this.empseq;
	}

	public String getMedi_amt(){
		return this.medi_amt;
	}

	public String getMob_amt(){
		return this.mob_amt;
	}

	public String getTax1(){
		return this.tax1;
	}

	public String getTax2(){
		return this.tax2;
	}

	public String getTax3(){
		return this.tax3;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_EXTN_5220_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_EXTN_5220_UDM dm = (SS_SLS_EXTN_5220_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.proc_dt);
		cstmt.setString(5, dm.regdt);
		cstmt.setString(6, dm.regno);
		cstmt.setString(7, dm.empseq);
		cstmt.setString(8, dm.medi_amt);
		cstmt.setString(9, dm.mob_amt);
		cstmt.setString(10, dm.tax1);
		cstmt.setString(11, dm.tax2);
		cstmt.setString(12, dm.tax3);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_SLS_EXTN_5220_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
		System.out.println("proc_dt = [" + getProc_dt() + "]");
		System.out.println("regdt = [" + getRegdt() + "]");
		System.out.println("regno = [" + getRegno() + "]");
		System.out.println("empseq = [" + getEmpseq() + "]");
		System.out.println("medi_amt = [" + getMedi_amt() + "]");
		System.out.println("mob_amt = [" + getMob_amt() + "]");
		System.out.println("tax1 = [" + getTax1() + "]");
		System.out.println("tax2 = [" + getTax2() + "]");
		System.out.println("tax3 = [" + getTax3() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String proc_dt = req.getParameter("proc_dt");
if( proc_dt == null){
	System.out.println(this.toString+" : proc_dt is null" );
}else{
	System.out.println(this.toString+" : proc_dt is "+proc_dt );
}
String regdt = req.getParameter("regdt");
if( regdt == null){
	System.out.println(this.toString+" : regdt is null" );
}else{
	System.out.println(this.toString+" : regdt is "+regdt );
}
String regno = req.getParameter("regno");
if( regno == null){
	System.out.println(this.toString+" : regno is null" );
}else{
	System.out.println(this.toString+" : regno is "+regno );
}
String empseq = req.getParameter("empseq");
if( empseq == null){
	System.out.println(this.toString+" : empseq is null" );
}else{
	System.out.println(this.toString+" : empseq is "+empseq );
}
String medi_amt = req.getParameter("medi_amt");
if( medi_amt == null){
	System.out.println(this.toString+" : medi_amt is null" );
}else{
	System.out.println(this.toString+" : medi_amt is "+medi_amt );
}
String mob_amt = req.getParameter("mob_amt");
if( mob_amt == null){
	System.out.println(this.toString+" : mob_amt is null" );
}else{
	System.out.println(this.toString+" : mob_amt is "+mob_amt );
}
String tax1 = req.getParameter("tax1");
if( tax1 == null){
	System.out.println(this.toString+" : tax1 is null" );
}else{
	System.out.println(this.toString+" : tax1 is "+tax1 );
}
String tax2 = req.getParameter("tax2");
if( tax2 == null){
	System.out.println(this.toString+" : tax2 is null" );
}else{
	System.out.println(this.toString+" : tax2 is "+tax2 );
}
String tax3 = req.getParameter("tax3");
if( tax3 == null){
	System.out.println(this.toString+" : tax3 is null" );
}else{
	System.out.println(this.toString+" : tax3 is "+tax3 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String proc_dt = Util.checkString(req.getParameter("proc_dt"));
String regdt = Util.checkString(req.getParameter("regdt"));
String regno = Util.checkString(req.getParameter("regno"));
String empseq = Util.checkString(req.getParameter("empseq"));
String medi_amt = Util.checkString(req.getParameter("medi_amt"));
String mob_amt = Util.checkString(req.getParameter("mob_amt"));
String tax1 = Util.checkString(req.getParameter("tax1"));
String tax2 = Util.checkString(req.getParameter("tax2"));
String tax3 = Util.checkString(req.getParameter("tax3"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String proc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_dt")));
String regdt = Util.Uni2Ksc(Util.checkString(req.getParameter("regdt")));
String regno = Util.Uni2Ksc(Util.checkString(req.getParameter("regno")));
String empseq = Util.Uni2Ksc(Util.checkString(req.getParameter("empseq")));
String medi_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_amt")));
String mob_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("mob_amt")));
String tax1 = Util.Uni2Ksc(Util.checkString(req.getParameter("tax1")));
String tax2 = Util.Uni2Ksc(Util.checkString(req.getParameter("tax2")));
String tax3 = Util.Uni2Ksc(Util.checkString(req.getParameter("tax3")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setProc_dt(proc_dt);
dm.setRegdt(regdt);
dm.setRegno(regno);
dm.setEmpseq(empseq);
dm.setMedi_amt(medi_amt);
dm.setMob_amt(mob_amt);
dm.setTax1(tax1);
dm.setTax2(tax2);
dm.setTax3(tax3);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Oct 13 17:58:27 KST 2016 */