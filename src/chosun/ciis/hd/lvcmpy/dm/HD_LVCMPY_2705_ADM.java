/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 :
* 작성자 :
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


public class HD_LVCMPY_2705_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String nm_korn;
	public String dept_cd;
	public String dept_nm;
	public String in_lvcmpy_dt;
	public String in_slip_occr_dt;
	public String in_slip_seq;
	public String in_acctgb;
	public String in_managecd;
	public String lvcmpy_clsf;
	public String comp_dt;
	public String no1;
	public String no2;
	public String no3;
	public String no5;
	public String no7;
	public String no8;
	public String no9;
	public String no10;
	public String no11;
	public String real_pay_lvcmpy_saly;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_LVCMPY_2705_ADM(){}
	public HD_LVCMPY_2705_ADM(String cmpy_cd, String emp_no, String nm_korn, String dept_cd, String dept_nm, String in_lvcmpy_dt, String in_slip_occr_dt, String in_slip_seq, String in_acctgb, String in_managecd, String lvcmpy_clsf, String comp_dt, String no1, String no2, String no3, String no5, String no7, String no8, String no9, String no10, String no11, String real_pay_lvcmpy_saly, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.nm_korn = nm_korn;
		this.dept_cd = dept_cd;
		this.dept_nm = dept_nm;
		this.in_lvcmpy_dt = in_lvcmpy_dt;
		this.in_slip_occr_dt = in_slip_occr_dt;
		this.in_slip_seq = in_slip_seq;
		this.in_acctgb = in_acctgb;
		this.in_managecd = in_managecd;
		this.lvcmpy_clsf = lvcmpy_clsf;
		this.comp_dt = comp_dt;
		this.no1 = no1;
		this.no2 = no2;
		this.no3 = no3;
		this.no5 = no5;
		this.no7 = no7;
		this.no8 = no8;
		this.no9 = no9;
		this.no10 = no10;
		this.no11 = no11;
		this.real_pay_lvcmpy_saly = real_pay_lvcmpy_saly;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setIn_lvcmpy_dt(String in_lvcmpy_dt){
		this.in_lvcmpy_dt = in_lvcmpy_dt;
	}

	public void setIn_slip_occr_dt(String in_slip_occr_dt){
		this.in_slip_occr_dt = in_slip_occr_dt;
	}

	public void setIn_slip_seq(String in_slip_seq){
		this.in_slip_seq = in_slip_seq;
	}

	public void setIn_acctgb(String in_acctgb){
		this.in_acctgb = in_acctgb;
	}

	public void setIn_managecd(String in_managecd){
		this.in_managecd = in_managecd;
	}

	public void setLvcmpy_clsf(String lvcmpy_clsf){
		this.lvcmpy_clsf = lvcmpy_clsf;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setNo1(String no1){
		this.no1 = no1;
	}

	public void setNo2(String no2){
		this.no2 = no2;
	}

	public void setNo3(String no3){
		this.no3 = no3;
	}

	public void setNo5(String no5){
		this.no5 = no5;
	}

	public void setNo7(String no7){
		this.no7 = no7;
	}

	public void setNo8(String no8){
		this.no8 = no8;
	}

	public void setNo9(String no9){
		this.no9 = no9;
	}

	public void setNo10(String no10){
		this.no10 = no10;
	}

	public void setNo11(String no11){
		this.no11 = no11;
	}

	public void setReal_pay_lvcmpy_saly(String real_pay_lvcmpy_saly){
		this.real_pay_lvcmpy_saly = real_pay_lvcmpy_saly;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
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

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getIn_lvcmpy_dt(){
		return this.in_lvcmpy_dt;
	}

	public String getIn_slip_occr_dt(){
		return this.in_slip_occr_dt;
	}

	public String getIn_slip_seq(){
		return this.in_slip_seq;
	}

	public String getIn_acctgb(){
		return this.in_acctgb;
	}

	public String getIn_managecd(){
		return this.in_managecd;
	}

	public String getLvcmpy_clsf(){
		return this.lvcmpy_clsf;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getNo1(){
		return this.no1;
	}

	public String getNo2(){
		return this.no2;
	}

	public String getNo3(){
		return this.no3;
	}

	public String getNo5(){
		return this.no5;
	}

	public String getNo7(){
		return this.no7;
	}

	public String getNo8(){
		return this.no8;
	}

	public String getNo9(){
		return this.no9;
	}

	public String getNo10(){
		return this.no10;
	}

	public String getNo11(){
		return this.no11;
	}

	public String getReal_pay_lvcmpy_saly(){
		return this.real_pay_lvcmpy_saly;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_LVCMPY_2705_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_LVCMPY_2705_ADM dm = (HD_LVCMPY_2705_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.nm_korn);
		cstmt.setString(6, dm.dept_cd);
		cstmt.setString(7, dm.dept_nm);
		cstmt.setString(8, dm.in_lvcmpy_dt);
		cstmt.setString(9, dm.in_slip_occr_dt);
		cstmt.setString(10, dm.in_slip_seq);
		cstmt.setString(11, dm.in_acctgb);
		cstmt.setString(12, dm.in_managecd);
		cstmt.setString(13, dm.lvcmpy_clsf);
		cstmt.setString(14, dm.comp_dt);
		cstmt.setString(15, dm.no1);
		cstmt.setString(16, dm.no2);
		cstmt.setString(17, dm.no3);
		cstmt.setString(18, dm.no5);
		cstmt.setString(19, dm.no7);
		cstmt.setString(20, dm.no8);
		cstmt.setString(21, dm.no9);
		cstmt.setString(22, dm.no10);
		cstmt.setString(23, dm.no11);
		cstmt.setString(24, dm.real_pay_lvcmpy_saly);
		cstmt.setString(25, dm.incmg_pers_ipadd);
		cstmt.setString(26, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.lvcmpy.ds.HD_LVCMPY_2705_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("nm_korn = [" + getNm_korn() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("dept_nm = [" + getDept_nm() + "]");
		System.out.println("in_lvcmpy_dt = [" + getIn_lvcmpy_dt() + "]");
		System.out.println("in_slip_occr_dt = [" + getIn_slip_occr_dt() + "]");
		System.out.println("in_slip_seq = [" + getIn_slip_seq() + "]");
		System.out.println("in_acctgb = [" + getIn_acctgb() + "]");
		System.out.println("in_managecd = [" + getIn_managecd() + "]");
		System.out.println("lvcmpy_clsf = [" + getLvcmpy_clsf() + "]");
		System.out.println("comp_dt = [" + getComp_dt() + "]");
		System.out.println("no1 = [" + getNo1() + "]");
		System.out.println("no2 = [" + getNo2() + "]");
		System.out.println("no3 = [" + getNo3() + "]");
		System.out.println("no5 = [" + getNo5() + "]");
		System.out.println("no7 = [" + getNo7() + "]");
		System.out.println("no8 = [" + getNo8() + "]");
		System.out.println("no9 = [" + getNo9() + "]");
		System.out.println("no10 = [" + getNo10() + "]");
		System.out.println("no11 = [" + getNo11() + "]");
		System.out.println("real_pay_lvcmpy_saly = [" + getReal_pay_lvcmpy_saly() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String nm_korn = req.getParameter("nm_korn");
if( nm_korn == null){
	System.out.println(this.toString+" : nm_korn is null" );
}else{
	System.out.println(this.toString+" : nm_korn is "+nm_korn );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String dept_nm = req.getParameter("dept_nm");
if( dept_nm == null){
	System.out.println(this.toString+" : dept_nm is null" );
}else{
	System.out.println(this.toString+" : dept_nm is "+dept_nm );
}
String in_lvcmpy_dt = req.getParameter("in_lvcmpy_dt");
if( in_lvcmpy_dt == null){
	System.out.println(this.toString+" : in_lvcmpy_dt is null" );
}else{
	System.out.println(this.toString+" : in_lvcmpy_dt is "+in_lvcmpy_dt );
}
String in_slip_occr_dt = req.getParameter("in_slip_occr_dt");
if( in_slip_occr_dt == null){
	System.out.println(this.toString+" : in_slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : in_slip_occr_dt is "+in_slip_occr_dt );
}
String in_slip_seq = req.getParameter("in_slip_seq");
if( in_slip_seq == null){
	System.out.println(this.toString+" : in_slip_seq is null" );
}else{
	System.out.println(this.toString+" : in_slip_seq is "+in_slip_seq );
}
String in_acctgb = req.getParameter("in_acctgb");
if( in_acctgb == null){
	System.out.println(this.toString+" : in_acctgb is null" );
}else{
	System.out.println(this.toString+" : in_acctgb is "+in_acctgb );
}
String in_managecd = req.getParameter("in_managecd");
if( in_managecd == null){
	System.out.println(this.toString+" : in_managecd is null" );
}else{
	System.out.println(this.toString+" : in_managecd is "+in_managecd );
}
String lvcmpy_clsf = req.getParameter("lvcmpy_clsf");
if( lvcmpy_clsf == null){
	System.out.println(this.toString+" : lvcmpy_clsf is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_clsf is "+lvcmpy_clsf );
}
String comp_dt = req.getParameter("comp_dt");
if( comp_dt == null){
	System.out.println(this.toString+" : comp_dt is null" );
}else{
	System.out.println(this.toString+" : comp_dt is "+comp_dt );
}
String no1 = req.getParameter("no1");
if( no1 == null){
	System.out.println(this.toString+" : no1 is null" );
}else{
	System.out.println(this.toString+" : no1 is "+no1 );
}
String no2 = req.getParameter("no2");
if( no2 == null){
	System.out.println(this.toString+" : no2 is null" );
}else{
	System.out.println(this.toString+" : no2 is "+no2 );
}
String no3 = req.getParameter("no3");
if( no3 == null){
	System.out.println(this.toString+" : no3 is null" );
}else{
	System.out.println(this.toString+" : no3 is "+no3 );
}
String no5 = req.getParameter("no5");
if( no5 == null){
	System.out.println(this.toString+" : no5 is null" );
}else{
	System.out.println(this.toString+" : no5 is "+no5 );
}
String no7 = req.getParameter("no7");
if( no7 == null){
	System.out.println(this.toString+" : no7 is null" );
}else{
	System.out.println(this.toString+" : no7 is "+no7 );
}
String no8 = req.getParameter("no8");
if( no8 == null){
	System.out.println(this.toString+" : no8 is null" );
}else{
	System.out.println(this.toString+" : no8 is "+no8 );
}
String no9 = req.getParameter("no9");
if( no9 == null){
	System.out.println(this.toString+" : no9 is null" );
}else{
	System.out.println(this.toString+" : no9 is "+no9 );
}
String no10 = req.getParameter("no10");
if( no10 == null){
	System.out.println(this.toString+" : no10 is null" );
}else{
	System.out.println(this.toString+" : no10 is "+no10 );
}
String no11 = req.getParameter("no11");
if( no11 == null){
	System.out.println(this.toString+" : no11 is null" );
}else{
	System.out.println(this.toString+" : no11 is "+no11 );
}
String real_pay_lvcmpy_saly = req.getParameter("real_pay_lvcmpy_saly");
if( real_pay_lvcmpy_saly == null){
	System.out.println(this.toString+" : real_pay_lvcmpy_saly is null" );
}else{
	System.out.println(this.toString+" : real_pay_lvcmpy_saly is "+real_pay_lvcmpy_saly );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
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
String nm_korn = Util.checkString(req.getParameter("nm_korn"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dept_nm = Util.checkString(req.getParameter("dept_nm"));
String in_lvcmpy_dt = Util.checkString(req.getParameter("in_lvcmpy_dt"));
String in_slip_occr_dt = Util.checkString(req.getParameter("in_slip_occr_dt"));
String in_slip_seq = Util.checkString(req.getParameter("in_slip_seq"));
String in_acctgb = Util.checkString(req.getParameter("in_acctgb"));
String in_managecd = Util.checkString(req.getParameter("in_managecd"));
String lvcmpy_clsf = Util.checkString(req.getParameter("lvcmpy_clsf"));
String comp_dt = Util.checkString(req.getParameter("comp_dt"));
String no1 = Util.checkString(req.getParameter("no1"));
String no2 = Util.checkString(req.getParameter("no2"));
String no3 = Util.checkString(req.getParameter("no3"));
String no5 = Util.checkString(req.getParameter("no5"));
String no7 = Util.checkString(req.getParameter("no7"));
String no8 = Util.checkString(req.getParameter("no8"));
String no9 = Util.checkString(req.getParameter("no9"));
String no10 = Util.checkString(req.getParameter("no10"));
String no11 = Util.checkString(req.getParameter("no11"));
String real_pay_lvcmpy_saly = Util.checkString(req.getParameter("real_pay_lvcmpy_saly"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String nm_korn = Util.Uni2Ksc(Util.checkString(req.getParameter("nm_korn")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nm")));
String in_lvcmpy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("in_lvcmpy_dt")));
String in_slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("in_slip_occr_dt")));
String in_slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("in_slip_seq")));
String in_acctgb = Util.Uni2Ksc(Util.checkString(req.getParameter("in_acctgb")));
String in_managecd = Util.Uni2Ksc(Util.checkString(req.getParameter("in_managecd")));
String lvcmpy_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_clsf")));
String comp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_dt")));
String no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("no1")));
String no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("no2")));
String no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("no3")));
String no5 = Util.Uni2Ksc(Util.checkString(req.getParameter("no5")));
String no7 = Util.Uni2Ksc(Util.checkString(req.getParameter("no7")));
String no8 = Util.Uni2Ksc(Util.checkString(req.getParameter("no8")));
String no9 = Util.Uni2Ksc(Util.checkString(req.getParameter("no9")));
String no10 = Util.Uni2Ksc(Util.checkString(req.getParameter("no10")));
String no11 = Util.Uni2Ksc(Util.checkString(req.getParameter("no11")));
String real_pay_lvcmpy_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("real_pay_lvcmpy_saly")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setNm_korn(nm_korn);
dm.setDept_cd(dept_cd);
dm.setDept_nm(dept_nm);
dm.setIn_lvcmpy_dt(in_lvcmpy_dt);
dm.setIn_slip_occr_dt(in_slip_occr_dt);
dm.setIn_slip_seq(in_slip_seq);
dm.setIn_acctgb(in_acctgb);
dm.setIn_managecd(in_managecd);
dm.setLvcmpy_clsf(lvcmpy_clsf);
dm.setComp_dt(comp_dt);
dm.setNo1(no1);
dm.setNo2(no2);
dm.setNo3(no3);
dm.setNo5(no5);
dm.setNo7(no7);
dm.setNo8(no8);
dm.setNo9(no9);
dm.setNo10(no10);
dm.setNo11(no11);
dm.setReal_pay_lvcmpy_saly(real_pay_lvcmpy_saly);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Sep 09 13:40:57 KST 2011 */