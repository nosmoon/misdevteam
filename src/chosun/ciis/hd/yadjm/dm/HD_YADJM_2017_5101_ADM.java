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


package chosun.ciis.hd.yadjm.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.yadjm.ds.*;
import chosun.ciis.hd.yadjm.rec.*;

/**
 * 
 */


public class HD_YADJM_2017_5101_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String adjm_rvrs_yy;
	public String emp_no;
	public String flag;
	public String hous_loan_amt_int_1;
	public String ltrm_hous_mogg_loan_amt_int;
	public String hous_loan_amt_int;
	public String hous_loan_amt_int_2012_1;
	public String hous_loan_amt_int_2012_2;
	public String hous_loan_amt_int_15_15y_fn;
	public String hous_loan_amt_int_15_15y;
	public String hous_loan_amt_int_15_15y_e;
	public String hous_loan_amt_int_15_10y;
	public String incmg_pers;

	public HD_YADJM_2017_5101_ADM(){}
	public HD_YADJM_2017_5101_ADM(String cmpy_cd, String adjm_rvrs_yy, String emp_no, String flag, String hous_loan_amt_int_1, String ltrm_hous_mogg_loan_amt_int, String hous_loan_amt_int, String hous_loan_amt_int_2012_1, String hous_loan_amt_int_2012_2, String hous_loan_amt_int_15_15y_fn, String hous_loan_amt_int_15_15y, String hous_loan_amt_int_15_15y_e, String hous_loan_amt_int_15_10y, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.adjm_rvrs_yy = adjm_rvrs_yy;
		this.emp_no = emp_no;
		this.flag = flag;
		this.hous_loan_amt_int_1 = hous_loan_amt_int_1;
		this.ltrm_hous_mogg_loan_amt_int = ltrm_hous_mogg_loan_amt_int;
		this.hous_loan_amt_int = hous_loan_amt_int;
		this.hous_loan_amt_int_2012_1 = hous_loan_amt_int_2012_1;
		this.hous_loan_amt_int_2012_2 = hous_loan_amt_int_2012_2;
		this.hous_loan_amt_int_15_15y_fn = hous_loan_amt_int_15_15y_fn;
		this.hous_loan_amt_int_15_15y = hous_loan_amt_int_15_15y;
		this.hous_loan_amt_int_15_15y_e = hous_loan_amt_int_15_15y_e;
		this.hous_loan_amt_int_15_10y = hous_loan_amt_int_15_10y;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAdjm_rvrs_yy(String adjm_rvrs_yy){
		this.adjm_rvrs_yy = adjm_rvrs_yy;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setHous_loan_amt_int_1(String hous_loan_amt_int_1){
		this.hous_loan_amt_int_1 = hous_loan_amt_int_1;
	}

	public void setLtrm_hous_mogg_loan_amt_int(String ltrm_hous_mogg_loan_amt_int){
		this.ltrm_hous_mogg_loan_amt_int = ltrm_hous_mogg_loan_amt_int;
	}

	public void setHous_loan_amt_int(String hous_loan_amt_int){
		this.hous_loan_amt_int = hous_loan_amt_int;
	}

	public void setHous_loan_amt_int_2012_1(String hous_loan_amt_int_2012_1){
		this.hous_loan_amt_int_2012_1 = hous_loan_amt_int_2012_1;
	}

	public void setHous_loan_amt_int_2012_2(String hous_loan_amt_int_2012_2){
		this.hous_loan_amt_int_2012_2 = hous_loan_amt_int_2012_2;
	}

	public void setHous_loan_amt_int_15_15y_fn(String hous_loan_amt_int_15_15y_fn){
		this.hous_loan_amt_int_15_15y_fn = hous_loan_amt_int_15_15y_fn;
	}

	public void setHous_loan_amt_int_15_15y(String hous_loan_amt_int_15_15y){
		this.hous_loan_amt_int_15_15y = hous_loan_amt_int_15_15y;
	}

	public void setHous_loan_amt_int_15_15y_e(String hous_loan_amt_int_15_15y_e){
		this.hous_loan_amt_int_15_15y_e = hous_loan_amt_int_15_15y_e;
	}

	public void setHous_loan_amt_int_15_10y(String hous_loan_amt_int_15_10y){
		this.hous_loan_amt_int_15_10y = hous_loan_amt_int_15_10y;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAdjm_rvrs_yy(){
		return this.adjm_rvrs_yy;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getHous_loan_amt_int_1(){
		return this.hous_loan_amt_int_1;
	}

	public String getLtrm_hous_mogg_loan_amt_int(){
		return this.ltrm_hous_mogg_loan_amt_int;
	}

	public String getHous_loan_amt_int(){
		return this.hous_loan_amt_int;
	}

	public String getHous_loan_amt_int_2012_1(){
		return this.hous_loan_amt_int_2012_1;
	}

	public String getHous_loan_amt_int_2012_2(){
		return this.hous_loan_amt_int_2012_2;
	}

	public String getHous_loan_amt_int_15_15y_fn(){
		return this.hous_loan_amt_int_15_15y_fn;
	}

	public String getHous_loan_amt_int_15_15y(){
		return this.hous_loan_amt_int_15_15y;
	}

	public String getHous_loan_amt_int_15_15y_e(){
		return this.hous_loan_amt_int_15_15y_e;
	}

	public String getHous_loan_amt_int_15_10y(){
		return this.hous_loan_amt_int_15_10y;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_YADJM_2017_5101_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_YADJM_2017_5101_ADM dm = (HD_YADJM_2017_5101_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.adjm_rvrs_yy);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.flag);
		cstmt.setString(7, dm.hous_loan_amt_int_1);
		cstmt.setString(8, dm.ltrm_hous_mogg_loan_amt_int);
		cstmt.setString(9, dm.hous_loan_amt_int);
		cstmt.setString(10, dm.hous_loan_amt_int_2012_1);
		cstmt.setString(11, dm.hous_loan_amt_int_2012_2);
		cstmt.setString(12, dm.hous_loan_amt_int_15_15y_fn);
		cstmt.setString(13, dm.hous_loan_amt_int_15_15y);
		cstmt.setString(14, dm.hous_loan_amt_int_15_15y_e);
		cstmt.setString(15, dm.hous_loan_amt_int_15_10y);
		cstmt.setString(16, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.yadjm.ds.HD_YADJM_2017_5101_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("adjm_rvrs_yy = [" + getAdjm_rvrs_yy() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("hous_loan_amt_int_1 = [" + getHous_loan_amt_int_1() + "]");
		System.out.println("ltrm_hous_mogg_loan_amt_int = [" + getLtrm_hous_mogg_loan_amt_int() + "]");
		System.out.println("hous_loan_amt_int = [" + getHous_loan_amt_int() + "]");
		System.out.println("hous_loan_amt_int_2012_1 = [" + getHous_loan_amt_int_2012_1() + "]");
		System.out.println("hous_loan_amt_int_2012_2 = [" + getHous_loan_amt_int_2012_2() + "]");
		System.out.println("hous_loan_amt_int_15_15y_fn = [" + getHous_loan_amt_int_15_15y_fn() + "]");
		System.out.println("hous_loan_amt_int_15_15y = [" + getHous_loan_amt_int_15_15y() + "]");
		System.out.println("hous_loan_amt_int_15_15y_e = [" + getHous_loan_amt_int_15_15y_e() + "]");
		System.out.println("hous_loan_amt_int_15_10y = [" + getHous_loan_amt_int_15_10y() + "]");
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
String adjm_rvrs_yy = req.getParameter("adjm_rvrs_yy");
if( adjm_rvrs_yy == null){
	System.out.println(this.toString+" : adjm_rvrs_yy is null" );
}else{
	System.out.println(this.toString+" : adjm_rvrs_yy is "+adjm_rvrs_yy );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String hous_loan_amt_int_1 = req.getParameter("hous_loan_amt_int_1");
if( hous_loan_amt_int_1 == null){
	System.out.println(this.toString+" : hous_loan_amt_int_1 is null" );
}else{
	System.out.println(this.toString+" : hous_loan_amt_int_1 is "+hous_loan_amt_int_1 );
}
String ltrm_hous_mogg_loan_amt_int = req.getParameter("ltrm_hous_mogg_loan_amt_int");
if( ltrm_hous_mogg_loan_amt_int == null){
	System.out.println(this.toString+" : ltrm_hous_mogg_loan_amt_int is null" );
}else{
	System.out.println(this.toString+" : ltrm_hous_mogg_loan_amt_int is "+ltrm_hous_mogg_loan_amt_int );
}
String hous_loan_amt_int = req.getParameter("hous_loan_amt_int");
if( hous_loan_amt_int == null){
	System.out.println(this.toString+" : hous_loan_amt_int is null" );
}else{
	System.out.println(this.toString+" : hous_loan_amt_int is "+hous_loan_amt_int );
}
String hous_loan_amt_int_2012_1 = req.getParameter("hous_loan_amt_int_2012_1");
if( hous_loan_amt_int_2012_1 == null){
	System.out.println(this.toString+" : hous_loan_amt_int_2012_1 is null" );
}else{
	System.out.println(this.toString+" : hous_loan_amt_int_2012_1 is "+hous_loan_amt_int_2012_1 );
}
String hous_loan_amt_int_2012_2 = req.getParameter("hous_loan_amt_int_2012_2");
if( hous_loan_amt_int_2012_2 == null){
	System.out.println(this.toString+" : hous_loan_amt_int_2012_2 is null" );
}else{
	System.out.println(this.toString+" : hous_loan_amt_int_2012_2 is "+hous_loan_amt_int_2012_2 );
}
String hous_loan_amt_int_15_15y_fn = req.getParameter("hous_loan_amt_int_15_15y_fn");
if( hous_loan_amt_int_15_15y_fn == null){
	System.out.println(this.toString+" : hous_loan_amt_int_15_15y_fn is null" );
}else{
	System.out.println(this.toString+" : hous_loan_amt_int_15_15y_fn is "+hous_loan_amt_int_15_15y_fn );
}
String hous_loan_amt_int_15_15y = req.getParameter("hous_loan_amt_int_15_15y");
if( hous_loan_amt_int_15_15y == null){
	System.out.println(this.toString+" : hous_loan_amt_int_15_15y is null" );
}else{
	System.out.println(this.toString+" : hous_loan_amt_int_15_15y is "+hous_loan_amt_int_15_15y );
}
String hous_loan_amt_int_15_15y_e = req.getParameter("hous_loan_amt_int_15_15y_e");
if( hous_loan_amt_int_15_15y_e == null){
	System.out.println(this.toString+" : hous_loan_amt_int_15_15y_e is null" );
}else{
	System.out.println(this.toString+" : hous_loan_amt_int_15_15y_e is "+hous_loan_amt_int_15_15y_e );
}
String hous_loan_amt_int_15_10y = req.getParameter("hous_loan_amt_int_15_10y");
if( hous_loan_amt_int_15_10y == null){
	System.out.println(this.toString+" : hous_loan_amt_int_15_10y is null" );
}else{
	System.out.println(this.toString+" : hous_loan_amt_int_15_10y is "+hous_loan_amt_int_15_10y );
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
String adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flag = Util.checkString(req.getParameter("flag"));
String hous_loan_amt_int_1 = Util.checkString(req.getParameter("hous_loan_amt_int_1"));
String ltrm_hous_mogg_loan_amt_int = Util.checkString(req.getParameter("ltrm_hous_mogg_loan_amt_int"));
String hous_loan_amt_int = Util.checkString(req.getParameter("hous_loan_amt_int"));
String hous_loan_amt_int_2012_1 = Util.checkString(req.getParameter("hous_loan_amt_int_2012_1"));
String hous_loan_amt_int_2012_2 = Util.checkString(req.getParameter("hous_loan_amt_int_2012_2"));
String hous_loan_amt_int_15_15y_fn = Util.checkString(req.getParameter("hous_loan_amt_int_15_15y_fn"));
String hous_loan_amt_int_15_15y = Util.checkString(req.getParameter("hous_loan_amt_int_15_15y"));
String hous_loan_amt_int_15_15y_e = Util.checkString(req.getParameter("hous_loan_amt_int_15_15y_e"));
String hous_loan_amt_int_15_10y = Util.checkString(req.getParameter("hous_loan_amt_int_15_10y"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String adjm_rvrs_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_rvrs_yy")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String hous_loan_amt_int_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("hous_loan_amt_int_1")));
String ltrm_hous_mogg_loan_amt_int = Util.Uni2Ksc(Util.checkString(req.getParameter("ltrm_hous_mogg_loan_amt_int")));
String hous_loan_amt_int = Util.Uni2Ksc(Util.checkString(req.getParameter("hous_loan_amt_int")));
String hous_loan_amt_int_2012_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("hous_loan_amt_int_2012_1")));
String hous_loan_amt_int_2012_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("hous_loan_amt_int_2012_2")));
String hous_loan_amt_int_15_15y_fn = Util.Uni2Ksc(Util.checkString(req.getParameter("hous_loan_amt_int_15_15y_fn")));
String hous_loan_amt_int_15_15y = Util.Uni2Ksc(Util.checkString(req.getParameter("hous_loan_amt_int_15_15y")));
String hous_loan_amt_int_15_15y_e = Util.Uni2Ksc(Util.checkString(req.getParameter("hous_loan_amt_int_15_15y_e")));
String hous_loan_amt_int_15_10y = Util.Uni2Ksc(Util.checkString(req.getParameter("hous_loan_amt_int_15_10y")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAdjm_rvrs_yy(adjm_rvrs_yy);
dm.setEmp_no(emp_no);
dm.setFlag(flag);
dm.setHous_loan_amt_int_1(hous_loan_amt_int_1);
dm.setLtrm_hous_mogg_loan_amt_int(ltrm_hous_mogg_loan_amt_int);
dm.setHous_loan_amt_int(hous_loan_amt_int);
dm.setHous_loan_amt_int_2012_1(hous_loan_amt_int_2012_1);
dm.setHous_loan_amt_int_2012_2(hous_loan_amt_int_2012_2);
dm.setHous_loan_amt_int_15_15y_fn(hous_loan_amt_int_15_15y_fn);
dm.setHous_loan_amt_int_15_15y(hous_loan_amt_int_15_15y);
dm.setHous_loan_amt_int_15_15y_e(hous_loan_amt_int_15_15y_e);
dm.setHous_loan_amt_int_15_10y(hous_loan_amt_int_15_10y);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 28 17:02:25 KST 2015 */