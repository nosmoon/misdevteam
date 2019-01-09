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


package chosun.ciis.en.comm.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.comm.ds.*;
import chosun.ciis.en.comm.rec.*;

/**
 * 
 */


public class EN_COMM_1302_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_slip_clsf;
	public String budg_cd;
	public String frdt;
	public String todt;
	public String proc_clsf1;
	public String proc_clsf2;
	public String kind;

	public EN_COMM_1302_LDM(){}
	public EN_COMM_1302_LDM(String cmpy_cd, String occr_slip_clsf, String budg_cd, String frdt, String todt, String proc_clsf1, String proc_clsf2, String kind){
		this.cmpy_cd = cmpy_cd;
		this.occr_slip_clsf = occr_slip_clsf;
		this.budg_cd = budg_cd;
		this.frdt = frdt;
		this.todt = todt;
		this.proc_clsf1 = proc_clsf1;
		this.proc_clsf2 = proc_clsf2;
		this.kind = kind;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_slip_clsf(String occr_slip_clsf){
		this.occr_slip_clsf = occr_slip_clsf;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setProc_clsf1(String proc_clsf1){
		this.proc_clsf1 = proc_clsf1;
	}

	public void setProc_clsf2(String proc_clsf2){
		this.proc_clsf2 = proc_clsf2;
	}

	public void setKind(String kind){
		this.kind = kind;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_slip_clsf(){
		return this.occr_slip_clsf;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getProc_clsf1(){
		return this.proc_clsf1;
	}

	public String getProc_clsf2(){
		return this.proc_clsf2;
	}

	public String getKind(){
		return this.kind;
	}

	public String getSQL(){
		 return "{ call MISENP.SP_EN_COMM_1302_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		EN_COMM_1302_LDM dm = (EN_COMM_1302_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_slip_clsf);
		cstmt.setString(5, dm.budg_cd);
		cstmt.setString(6, dm.frdt);
		cstmt.setString(7, dm.todt);
		cstmt.setString(8, dm.proc_clsf1);
		cstmt.setString(9, dm.proc_clsf2);
		cstmt.setString(10, dm.kind);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.en.comm.ds.EN_COMM_1302_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_slip_clsf = [" + getOccr_slip_clsf() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("proc_clsf1 = [" + getProc_clsf1() + "]");
		System.out.println("proc_clsf2 = [" + getProc_clsf2() + "]");
		System.out.println("kind = [" + getKind() + "]");
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
String occr_slip_clsf = req.getParameter("occr_slip_clsf");
if( occr_slip_clsf == null){
	System.out.println(this.toString+" : occr_slip_clsf is null" );
}else{
	System.out.println(this.toString+" : occr_slip_clsf is "+occr_slip_clsf );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String proc_clsf1 = req.getParameter("proc_clsf1");
if( proc_clsf1 == null){
	System.out.println(this.toString+" : proc_clsf1 is null" );
}else{
	System.out.println(this.toString+" : proc_clsf1 is "+proc_clsf1 );
}
String proc_clsf2 = req.getParameter("proc_clsf2");
if( proc_clsf2 == null){
	System.out.println(this.toString+" : proc_clsf2 is null" );
}else{
	System.out.println(this.toString+" : proc_clsf2 is "+proc_clsf2 );
}
String kind = req.getParameter("kind");
if( kind == null){
	System.out.println(this.toString+" : kind is null" );
}else{
	System.out.println(this.toString+" : kind is "+kind );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_slip_clsf = Util.checkString(req.getParameter("occr_slip_clsf"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String proc_clsf1 = Util.checkString(req.getParameter("proc_clsf1"));
String proc_clsf2 = Util.checkString(req.getParameter("proc_clsf2"));
String kind = Util.checkString(req.getParameter("kind"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_slip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_slip_clsf")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String proc_clsf1 = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_clsf1")));
String proc_clsf2 = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_clsf2")));
String kind = Util.Uni2Ksc(Util.checkString(req.getParameter("kind")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_slip_clsf(occr_slip_clsf);
dm.setBudg_cd(budg_cd);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setProc_clsf1(proc_clsf1);
dm.setProc_clsf2(proc_clsf2);
dm.setKind(kind);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 01 13:36:42 KST 2009 */