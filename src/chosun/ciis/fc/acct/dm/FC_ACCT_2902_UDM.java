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


public class FC_ACCT_2902_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yyyymmdd;
	public String fisc_dt;
	public String incmg_emp_no;
	public String chrg_emp_no;
	public String incmg_pers_ipadd;
	public String blng_dept;
	public String cnt;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String slip_sub_seq;
	public String cal_pay_amt;
	public String ptcr;
	public String budg_cd1;
	public String mang_clsf_cd1;

	public FC_ACCT_2902_UDM(){}
	public FC_ACCT_2902_UDM(String cmpy_cd, String yyyymmdd, String fisc_dt, String incmg_emp_no, String chrg_emp_no, String incmg_pers_ipadd, String blng_dept, String cnt, String slip_occr_dt, String slip_clsf_cd, String slip_seq, String slip_sub_seq, String cal_pay_amt, String ptcr, String budg_cd1, String mang_clsf_cd1){
		this.cmpy_cd = cmpy_cd;
		this.yyyymmdd = yyyymmdd;
		this.fisc_dt = fisc_dt;
		this.incmg_emp_no = incmg_emp_no;
		this.chrg_emp_no = chrg_emp_no;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.blng_dept = blng_dept;
		this.cnt = cnt;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_seq = slip_seq;
		this.slip_sub_seq = slip_sub_seq;
		this.cal_pay_amt = cal_pay_amt;
		this.ptcr = ptcr;
		this.budg_cd1 = budg_cd1;
		this.mang_clsf_cd1 = mang_clsf_cd1;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYyyymmdd(String yyyymmdd){
		this.yyyymmdd = yyyymmdd;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setIncmg_emp_no(String incmg_emp_no){
		this.incmg_emp_no = incmg_emp_no;
	}

	public void setChrg_emp_no(String chrg_emp_no){
		this.chrg_emp_no = chrg_emp_no;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setBlng_dept(String blng_dept){
		this.blng_dept = blng_dept;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setSlip_sub_seq(String slip_sub_seq){
		this.slip_sub_seq = slip_sub_seq;
	}

	public void setCal_pay_amt(String cal_pay_amt){
		this.cal_pay_amt = cal_pay_amt;
	}

	public void setPtcr(String ptcr){
		this.ptcr = ptcr;
	}

	public void setBudg_cd1(String budg_cd1){
		this.budg_cd1 = budg_cd1;
	}

	public void setMang_clsf_cd1(String mang_clsf_cd1){
		this.mang_clsf_cd1 = mang_clsf_cd1;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYyyymmdd(){
		return this.yyyymmdd;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getIncmg_emp_no(){
		return this.incmg_emp_no;
	}

	public String getChrg_emp_no(){
		return this.chrg_emp_no;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getBlng_dept(){
		return this.blng_dept;
	}

	public String getCnt(){
		return this.cnt;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getSlip_sub_seq(){
		return this.slip_sub_seq;
	}

	public String getCal_pay_amt(){
		return this.cal_pay_amt;
	}

	public String getPtcr(){
		return this.ptcr;
	}

	public String getBudg_cd1(){
		return this.budg_cd1;
	}

	public String getMang_clsf_cd1(){
		return this.mang_clsf_cd1;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2902_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2902_UDM dm = (FC_ACCT_2902_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yyyymmdd);
		cstmt.setString(5, dm.fisc_dt);
		cstmt.setString(6, dm.incmg_emp_no);
		cstmt.setString(7, dm.chrg_emp_no);
		cstmt.setString(8, dm.incmg_pers_ipadd);
		cstmt.setString(9, dm.blng_dept);
		cstmt.setString(10, dm.cnt);
		cstmt.setString(11, dm.slip_occr_dt);
		cstmt.setString(12, dm.slip_clsf_cd);
		cstmt.setString(13, dm.slip_seq);
		cstmt.setString(14, dm.slip_sub_seq);
		cstmt.setString(15, dm.cal_pay_amt);
		cstmt.setString(16, dm.ptcr);
		cstmt.setString(17, dm.budg_cd1);
		cstmt.setString(18, dm.mang_clsf_cd1);
		cstmt.registerOutParameter(19, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2902_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yyyymmdd = [" + getYyyymmdd() + "]");
		System.out.println("fisc_dt = [" + getFisc_dt() + "]");
		System.out.println("incmg_emp_no = [" + getIncmg_emp_no() + "]");
		System.out.println("chrg_emp_no = [" + getChrg_emp_no() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("blng_dept = [" + getBlng_dept() + "]");
		System.out.println("cnt = [" + getCnt() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_seq = [" + getSlip_seq() + "]");
		System.out.println("slip_sub_seq = [" + getSlip_sub_seq() + "]");
		System.out.println("cal_pay_amt = [" + getCal_pay_amt() + "]");
		System.out.println("ptcr = [" + getPtcr() + "]");
		System.out.println("budg_cd1 = [" + getBudg_cd1() + "]");
		System.out.println("mang_clsf_cd1 = [" + getMang_clsf_cd1() + "]");
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
String yyyymmdd = req.getParameter("yyyymmdd");
if( yyyymmdd == null){
	System.out.println(this.toString+" : yyyymmdd is null" );
}else{
	System.out.println(this.toString+" : yyyymmdd is "+yyyymmdd );
}
String fisc_dt = req.getParameter("fisc_dt");
if( fisc_dt == null){
	System.out.println(this.toString+" : fisc_dt is null" );
}else{
	System.out.println(this.toString+" : fisc_dt is "+fisc_dt );
}
String incmg_emp_no = req.getParameter("incmg_emp_no");
if( incmg_emp_no == null){
	System.out.println(this.toString+" : incmg_emp_no is null" );
}else{
	System.out.println(this.toString+" : incmg_emp_no is "+incmg_emp_no );
}
String chrg_emp_no = req.getParameter("chrg_emp_no");
if( chrg_emp_no == null){
	System.out.println(this.toString+" : chrg_emp_no is null" );
}else{
	System.out.println(this.toString+" : chrg_emp_no is "+chrg_emp_no );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String blng_dept = req.getParameter("blng_dept");
if( blng_dept == null){
	System.out.println(this.toString+" : blng_dept is null" );
}else{
	System.out.println(this.toString+" : blng_dept is "+blng_dept );
}
String cnt = req.getParameter("cnt");
if( cnt == null){
	System.out.println(this.toString+" : cnt is null" );
}else{
	System.out.println(this.toString+" : cnt is "+cnt );
}
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String slip_seq = req.getParameter("slip_seq");
if( slip_seq == null){
	System.out.println(this.toString+" : slip_seq is null" );
}else{
	System.out.println(this.toString+" : slip_seq is "+slip_seq );
}
String slip_sub_seq = req.getParameter("slip_sub_seq");
if( slip_sub_seq == null){
	System.out.println(this.toString+" : slip_sub_seq is null" );
}else{
	System.out.println(this.toString+" : slip_sub_seq is "+slip_sub_seq );
}
String cal_pay_amt = req.getParameter("cal_pay_amt");
if( cal_pay_amt == null){
	System.out.println(this.toString+" : cal_pay_amt is null" );
}else{
	System.out.println(this.toString+" : cal_pay_amt is "+cal_pay_amt );
}
String ptcr = req.getParameter("ptcr");
if( ptcr == null){
	System.out.println(this.toString+" : ptcr is null" );
}else{
	System.out.println(this.toString+" : ptcr is "+ptcr );
}
String budg_cd1 = req.getParameter("budg_cd1");
if( budg_cd1 == null){
	System.out.println(this.toString+" : budg_cd1 is null" );
}else{
	System.out.println(this.toString+" : budg_cd1 is "+budg_cd1 );
}
String mang_clsf_cd1 = req.getParameter("mang_clsf_cd1");
if( mang_clsf_cd1 == null){
	System.out.println(this.toString+" : mang_clsf_cd1 is null" );
}else{
	System.out.println(this.toString+" : mang_clsf_cd1 is "+mang_clsf_cd1 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yyyymmdd = Util.checkString(req.getParameter("yyyymmdd"));
String fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
String incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
String chrg_emp_no = Util.checkString(req.getParameter("chrg_emp_no"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String blng_dept = Util.checkString(req.getParameter("blng_dept"));
String cnt = Util.checkString(req.getParameter("cnt"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
String cal_pay_amt = Util.checkString(req.getParameter("cal_pay_amt"));
String ptcr = Util.checkString(req.getParameter("ptcr"));
String budg_cd1 = Util.checkString(req.getParameter("budg_cd1"));
String mang_clsf_cd1 = Util.checkString(req.getParameter("mang_clsf_cd1"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yyyymmdd = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyymmdd")));
String fisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_dt")));
String incmg_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_emp_no")));
String chrg_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_emp_no")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String blng_dept = Util.Uni2Ksc(Util.checkString(req.getParameter("blng_dept")));
String cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("cnt")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String slip_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_sub_seq")));
String cal_pay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("cal_pay_amt")));
String ptcr = Util.Uni2Ksc(Util.checkString(req.getParameter("ptcr")));
String budg_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd1")));
String mang_clsf_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_clsf_cd1")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYyyymmdd(yyyymmdd);
dm.setFisc_dt(fisc_dt);
dm.setIncmg_emp_no(incmg_emp_no);
dm.setChrg_emp_no(chrg_emp_no);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setBlng_dept(blng_dept);
dm.setCnt(cnt);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_seq(slip_seq);
dm.setSlip_sub_seq(slip_sub_seq);
dm.setCal_pay_amt(cal_pay_amt);
dm.setPtcr(ptcr);
dm.setBudg_cd1(budg_cd1);
dm.setMang_clsf_cd1(mang_clsf_cd1);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Oct 19 13:40:41 KST 2009 */