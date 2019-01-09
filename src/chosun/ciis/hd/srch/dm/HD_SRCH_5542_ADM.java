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


package chosun.ciis.hd.srch.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.srch.ds.*;
import chosun.ciis.hd.srch.rec.*;

/**
 * 
 */


public class HD_SRCH_5542_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String basi_dt;
	public String head_clsf_00_01;
	public String head_clsf_01_01;
	public String head_clsf_01_02;
	public String gridtitle;
	public String guk_nm;
	public String dept_nm;
	public String emp_clsf1;
	public String emp_clsf2;
	public String emp_clsf3;
	public String emp_clsf4;
	public String emp_clsf5;
	public String emp_clsf6;
	public String emp_clsf7;
	public String emp_clsf8;
	public String emp_clsf9;
	public String emp_clsf10;
	public String emp_clsf11;
	public String tot_sum;
	public String mode;
	public String text_tag;
	public String incmg_pers;
	public String chg_pers;

	public HD_SRCH_5542_ADM(){}
	public HD_SRCH_5542_ADM(String cmpy_cd, String basi_dt, String head_clsf_00_01, String head_clsf_01_01, String head_clsf_01_02, String gridtitle, String guk_nm, String dept_nm, String emp_clsf1, String emp_clsf2, String emp_clsf3, String emp_clsf4, String emp_clsf5, String emp_clsf6, String emp_clsf7, String emp_clsf8, String emp_clsf9, String emp_clsf10, String emp_clsf11, String tot_sum, String mode, String text_tag, String incmg_pers, String chg_pers){
		this.cmpy_cd = cmpy_cd;
		this.basi_dt = basi_dt;
		this.head_clsf_00_01 = head_clsf_00_01;
		this.head_clsf_01_01 = head_clsf_01_01;
		this.head_clsf_01_02 = head_clsf_01_02;
		this.gridtitle = gridtitle;
		this.guk_nm = guk_nm;
		this.dept_nm = dept_nm;
		this.emp_clsf1 = emp_clsf1;
		this.emp_clsf2 = emp_clsf2;
		this.emp_clsf3 = emp_clsf3;
		this.emp_clsf4 = emp_clsf4;
		this.emp_clsf5 = emp_clsf5;
		this.emp_clsf6 = emp_clsf6;
		this.emp_clsf7 = emp_clsf7;
		this.emp_clsf8 = emp_clsf8;
		this.emp_clsf9 = emp_clsf9;
		this.emp_clsf10 = emp_clsf10;
		this.emp_clsf11 = emp_clsf11;
		this.tot_sum = tot_sum;
		this.mode = mode;
		this.text_tag = text_tag;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setHead_clsf_00_01(String head_clsf_00_01){
		this.head_clsf_00_01 = head_clsf_00_01;
	}

	public void setHead_clsf_01_01(String head_clsf_01_01){
		this.head_clsf_01_01 = head_clsf_01_01;
	}

	public void setHead_clsf_01_02(String head_clsf_01_02){
		this.head_clsf_01_02 = head_clsf_01_02;
	}

	public void setGridtitle(String gridtitle){
		this.gridtitle = gridtitle;
	}

	public void setGuk_nm(String guk_nm){
		this.guk_nm = guk_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_clsf1(String emp_clsf1){
		this.emp_clsf1 = emp_clsf1;
	}

	public void setEmp_clsf2(String emp_clsf2){
		this.emp_clsf2 = emp_clsf2;
	}

	public void setEmp_clsf3(String emp_clsf3){
		this.emp_clsf3 = emp_clsf3;
	}

	public void setEmp_clsf4(String emp_clsf4){
		this.emp_clsf4 = emp_clsf4;
	}

	public void setEmp_clsf5(String emp_clsf5){
		this.emp_clsf5 = emp_clsf5;
	}

	public void setEmp_clsf6(String emp_clsf6){
		this.emp_clsf6 = emp_clsf6;
	}

	public void setEmp_clsf7(String emp_clsf7){
		this.emp_clsf7 = emp_clsf7;
	}

	public void setEmp_clsf8(String emp_clsf8){
		this.emp_clsf8 = emp_clsf8;
	}

	public void setEmp_clsf9(String emp_clsf9){
		this.emp_clsf9 = emp_clsf9;
	}

	public void setEmp_clsf10(String emp_clsf10){
		this.emp_clsf10 = emp_clsf10;
	}

	public void setEmp_clsf11(String emp_clsf11){
		this.emp_clsf11 = emp_clsf11;
	}

	public void setTot_sum(String tot_sum){
		this.tot_sum = tot_sum;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setText_tag(String text_tag){
		this.text_tag = text_tag;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getHead_clsf_00_01(){
		return this.head_clsf_00_01;
	}

	public String getHead_clsf_01_01(){
		return this.head_clsf_01_01;
	}

	public String getHead_clsf_01_02(){
		return this.head_clsf_01_02;
	}

	public String getGridtitle(){
		return this.gridtitle;
	}

	public String getGuk_nm(){
		return this.guk_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_clsf1(){
		return this.emp_clsf1;
	}

	public String getEmp_clsf2(){
		return this.emp_clsf2;
	}

	public String getEmp_clsf3(){
		return this.emp_clsf3;
	}

	public String getEmp_clsf4(){
		return this.emp_clsf4;
	}

	public String getEmp_clsf5(){
		return this.emp_clsf5;
	}

	public String getEmp_clsf6(){
		return this.emp_clsf6;
	}

	public String getEmp_clsf7(){
		return this.emp_clsf7;
	}

	public String getEmp_clsf8(){
		return this.emp_clsf8;
	}

	public String getEmp_clsf9(){
		return this.emp_clsf9;
	}

	public String getEmp_clsf10(){
		return this.emp_clsf10;
	}

	public String getEmp_clsf11(){
		return this.emp_clsf11;
	}

	public String getTot_sum(){
		return this.tot_sum;
	}

	public String getMode(){
		return this.mode;
	}

	public String getText_tag(){
		return this.text_tag;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SRCH_5542_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SRCH_5542_ADM dm = (HD_SRCH_5542_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.basi_dt);
		cstmt.setString(6, dm.head_clsf_00_01);
		cstmt.setString(7, dm.head_clsf_01_01);
		cstmt.setString(8, dm.head_clsf_01_02);
		cstmt.setString(9, dm.gridtitle);
		cstmt.setString(10, dm.guk_nm);
		cstmt.setString(11, dm.dept_nm);
		cstmt.setString(12, dm.emp_clsf1);
		cstmt.setString(13, dm.emp_clsf2);
		cstmt.setString(14, dm.emp_clsf3);
		cstmt.setString(15, dm.emp_clsf4);
		cstmt.setString(16, dm.emp_clsf5);
		cstmt.setString(17, dm.emp_clsf6);
		cstmt.setString(18, dm.emp_clsf7);
		cstmt.setString(19, dm.emp_clsf8);
		cstmt.setString(20, dm.emp_clsf9);
		cstmt.setString(21, dm.emp_clsf10);
		cstmt.setString(22, dm.emp_clsf11);
		cstmt.setString(23, dm.tot_sum);
		cstmt.setString(24, dm.mode);
		cstmt.setString(25, dm.text_tag);
		cstmt.setString(26, dm.incmg_pers);
		cstmt.setString(27, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.srch.ds.HD_SRCH_5542_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("basi_dt = [" + getBasi_dt() + "]");
		System.out.println("head_clsf_00_01 = [" + getHead_clsf_00_01() + "]");
		System.out.println("head_clsf_01_01 = [" + getHead_clsf_01_01() + "]");
		System.out.println("head_clsf_01_02 = [" + getHead_clsf_01_02() + "]");
		System.out.println("gridtitle = [" + getGridtitle() + "]");
		System.out.println("guk_nm = [" + getGuk_nm() + "]");
		System.out.println("dept_nm = [" + getDept_nm() + "]");
		System.out.println("emp_clsf1 = [" + getEmp_clsf1() + "]");
		System.out.println("emp_clsf2 = [" + getEmp_clsf2() + "]");
		System.out.println("emp_clsf3 = [" + getEmp_clsf3() + "]");
		System.out.println("emp_clsf4 = [" + getEmp_clsf4() + "]");
		System.out.println("emp_clsf5 = [" + getEmp_clsf5() + "]");
		System.out.println("emp_clsf6 = [" + getEmp_clsf6() + "]");
		System.out.println("emp_clsf7 = [" + getEmp_clsf7() + "]");
		System.out.println("emp_clsf8 = [" + getEmp_clsf8() + "]");
		System.out.println("emp_clsf9 = [" + getEmp_clsf9() + "]");
		System.out.println("emp_clsf10 = [" + getEmp_clsf10() + "]");
		System.out.println("emp_clsf11 = [" + getEmp_clsf11() + "]");
		System.out.println("tot_sum = [" + getTot_sum() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("text_tag = [" + getText_tag() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
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
String basi_dt = req.getParameter("basi_dt");
if( basi_dt == null){
	System.out.println(this.toString+" : basi_dt is null" );
}else{
	System.out.println(this.toString+" : basi_dt is "+basi_dt );
}
String head_clsf_00_01 = req.getParameter("head_clsf_00_01");
if( head_clsf_00_01 == null){
	System.out.println(this.toString+" : head_clsf_00_01 is null" );
}else{
	System.out.println(this.toString+" : head_clsf_00_01 is "+head_clsf_00_01 );
}
String head_clsf_01_01 = req.getParameter("head_clsf_01_01");
if( head_clsf_01_01 == null){
	System.out.println(this.toString+" : head_clsf_01_01 is null" );
}else{
	System.out.println(this.toString+" : head_clsf_01_01 is "+head_clsf_01_01 );
}
String head_clsf_01_02 = req.getParameter("head_clsf_01_02");
if( head_clsf_01_02 == null){
	System.out.println(this.toString+" : head_clsf_01_02 is null" );
}else{
	System.out.println(this.toString+" : head_clsf_01_02 is "+head_clsf_01_02 );
}
String gridtitle = req.getParameter("gridtitle");
if( gridtitle == null){
	System.out.println(this.toString+" : gridtitle is null" );
}else{
	System.out.println(this.toString+" : gridtitle is "+gridtitle );
}
String guk_nm = req.getParameter("guk_nm");
if( guk_nm == null){
	System.out.println(this.toString+" : guk_nm is null" );
}else{
	System.out.println(this.toString+" : guk_nm is "+guk_nm );
}
String dept_nm = req.getParameter("dept_nm");
if( dept_nm == null){
	System.out.println(this.toString+" : dept_nm is null" );
}else{
	System.out.println(this.toString+" : dept_nm is "+dept_nm );
}
String emp_clsf1 = req.getParameter("emp_clsf1");
if( emp_clsf1 == null){
	System.out.println(this.toString+" : emp_clsf1 is null" );
}else{
	System.out.println(this.toString+" : emp_clsf1 is "+emp_clsf1 );
}
String emp_clsf2 = req.getParameter("emp_clsf2");
if( emp_clsf2 == null){
	System.out.println(this.toString+" : emp_clsf2 is null" );
}else{
	System.out.println(this.toString+" : emp_clsf2 is "+emp_clsf2 );
}
String emp_clsf3 = req.getParameter("emp_clsf3");
if( emp_clsf3 == null){
	System.out.println(this.toString+" : emp_clsf3 is null" );
}else{
	System.out.println(this.toString+" : emp_clsf3 is "+emp_clsf3 );
}
String emp_clsf4 = req.getParameter("emp_clsf4");
if( emp_clsf4 == null){
	System.out.println(this.toString+" : emp_clsf4 is null" );
}else{
	System.out.println(this.toString+" : emp_clsf4 is "+emp_clsf4 );
}
String emp_clsf5 = req.getParameter("emp_clsf5");
if( emp_clsf5 == null){
	System.out.println(this.toString+" : emp_clsf5 is null" );
}else{
	System.out.println(this.toString+" : emp_clsf5 is "+emp_clsf5 );
}
String emp_clsf6 = req.getParameter("emp_clsf6");
if( emp_clsf6 == null){
	System.out.println(this.toString+" : emp_clsf6 is null" );
}else{
	System.out.println(this.toString+" : emp_clsf6 is "+emp_clsf6 );
}
String emp_clsf7 = req.getParameter("emp_clsf7");
if( emp_clsf7 == null){
	System.out.println(this.toString+" : emp_clsf7 is null" );
}else{
	System.out.println(this.toString+" : emp_clsf7 is "+emp_clsf7 );
}
String emp_clsf8 = req.getParameter("emp_clsf8");
if( emp_clsf8 == null){
	System.out.println(this.toString+" : emp_clsf8 is null" );
}else{
	System.out.println(this.toString+" : emp_clsf8 is "+emp_clsf8 );
}
String emp_clsf9 = req.getParameter("emp_clsf9");
if( emp_clsf9 == null){
	System.out.println(this.toString+" : emp_clsf9 is null" );
}else{
	System.out.println(this.toString+" : emp_clsf9 is "+emp_clsf9 );
}
String emp_clsf10 = req.getParameter("emp_clsf10");
if( emp_clsf10 == null){
	System.out.println(this.toString+" : emp_clsf10 is null" );
}else{
	System.out.println(this.toString+" : emp_clsf10 is "+emp_clsf10 );
}
String emp_clsf11 = req.getParameter("emp_clsf11");
if( emp_clsf11 == null){
	System.out.println(this.toString+" : emp_clsf11 is null" );
}else{
	System.out.println(this.toString+" : emp_clsf11 is "+emp_clsf11 );
}
String tot_sum = req.getParameter("tot_sum");
if( tot_sum == null){
	System.out.println(this.toString+" : tot_sum is null" );
}else{
	System.out.println(this.toString+" : tot_sum is "+tot_sum );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String text_tag = req.getParameter("text_tag");
if( text_tag == null){
	System.out.println(this.toString+" : text_tag is null" );
}else{
	System.out.println(this.toString+" : text_tag is "+text_tag );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String basi_dt = Util.checkString(req.getParameter("basi_dt"));
String head_clsf_00_01 = Util.checkString(req.getParameter("head_clsf_00_01"));
String head_clsf_01_01 = Util.checkString(req.getParameter("head_clsf_01_01"));
String head_clsf_01_02 = Util.checkString(req.getParameter("head_clsf_01_02"));
String gridtitle = Util.checkString(req.getParameter("gridtitle"));
String guk_nm = Util.checkString(req.getParameter("guk_nm"));
String dept_nm = Util.checkString(req.getParameter("dept_nm"));
String emp_clsf1 = Util.checkString(req.getParameter("emp_clsf1"));
String emp_clsf2 = Util.checkString(req.getParameter("emp_clsf2"));
String emp_clsf3 = Util.checkString(req.getParameter("emp_clsf3"));
String emp_clsf4 = Util.checkString(req.getParameter("emp_clsf4"));
String emp_clsf5 = Util.checkString(req.getParameter("emp_clsf5"));
String emp_clsf6 = Util.checkString(req.getParameter("emp_clsf6"));
String emp_clsf7 = Util.checkString(req.getParameter("emp_clsf7"));
String emp_clsf8 = Util.checkString(req.getParameter("emp_clsf8"));
String emp_clsf9 = Util.checkString(req.getParameter("emp_clsf9"));
String emp_clsf10 = Util.checkString(req.getParameter("emp_clsf10"));
String emp_clsf11 = Util.checkString(req.getParameter("emp_clsf11"));
String tot_sum = Util.checkString(req.getParameter("tot_sum"));
String mode = Util.checkString(req.getParameter("mode"));
String text_tag = Util.checkString(req.getParameter("text_tag"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_dt")));
String head_clsf_00_01 = Util.Uni2Ksc(Util.checkString(req.getParameter("head_clsf_00_01")));
String head_clsf_01_01 = Util.Uni2Ksc(Util.checkString(req.getParameter("head_clsf_01_01")));
String head_clsf_01_02 = Util.Uni2Ksc(Util.checkString(req.getParameter("head_clsf_01_02")));
String gridtitle = Util.Uni2Ksc(Util.checkString(req.getParameter("gridtitle")));
String guk_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("guk_nm")));
String dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nm")));
String emp_clsf1 = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf1")));
String emp_clsf2 = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf2")));
String emp_clsf3 = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf3")));
String emp_clsf4 = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf4")));
String emp_clsf5 = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf5")));
String emp_clsf6 = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf6")));
String emp_clsf7 = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf7")));
String emp_clsf8 = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf8")));
String emp_clsf9 = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf9")));
String emp_clsf10 = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf10")));
String emp_clsf11 = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf11")));
String tot_sum = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_sum")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String text_tag = Util.Uni2Ksc(Util.checkString(req.getParameter("text_tag")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBasi_dt(basi_dt);
dm.setHead_clsf_00_01(head_clsf_00_01);
dm.setHead_clsf_01_01(head_clsf_01_01);
dm.setHead_clsf_01_02(head_clsf_01_02);
dm.setGridtitle(gridtitle);
dm.setGuk_nm(guk_nm);
dm.setDept_nm(dept_nm);
dm.setEmp_clsf1(emp_clsf1);
dm.setEmp_clsf2(emp_clsf2);
dm.setEmp_clsf3(emp_clsf3);
dm.setEmp_clsf4(emp_clsf4);
dm.setEmp_clsf5(emp_clsf5);
dm.setEmp_clsf6(emp_clsf6);
dm.setEmp_clsf7(emp_clsf7);
dm.setEmp_clsf8(emp_clsf8);
dm.setEmp_clsf9(emp_clsf9);
dm.setEmp_clsf10(emp_clsf10);
dm.setEmp_clsf11(emp_clsf11);
dm.setTot_sum(tot_sum);
dm.setMode(mode);
dm.setText_tag(text_tag);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Nov 19 18:35:50 KST 2018 */