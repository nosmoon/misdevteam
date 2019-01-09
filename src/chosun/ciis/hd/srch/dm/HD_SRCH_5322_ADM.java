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


public class HD_SRCH_5322_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String basi_dt;
	public String head_clsf_00_01;
	public String head_clsf_01_01;
	public String head_clsf_01_02;
	public String gridtitle;
	public String clsf1;
	public String clsf2;
	public String emp_clsf1;
	public String emp_clsf2;
	public String emp_clsf3;
	public String emp_clsf4;
	public String tot_stot;
	public String mode;
	public String text_tag;
	public String incmg_pers;
	public String chg_pers;

	public HD_SRCH_5322_ADM(){}
	public HD_SRCH_5322_ADM(String cmpy_cd, String basi_dt, String head_clsf_00_01, String head_clsf_01_01, String head_clsf_01_02, String gridtitle, String clsf1, String clsf2, String emp_clsf1, String emp_clsf2, String emp_clsf3, String emp_clsf4, String tot_stot, String mode, String text_tag, String incmg_pers, String chg_pers){
		this.cmpy_cd = cmpy_cd;
		this.basi_dt = basi_dt;
		this.head_clsf_00_01 = head_clsf_00_01;
		this.head_clsf_01_01 = head_clsf_01_01;
		this.head_clsf_01_02 = head_clsf_01_02;
		this.gridtitle = gridtitle;
		this.clsf1 = clsf1;
		this.clsf2 = clsf2;
		this.emp_clsf1 = emp_clsf1;
		this.emp_clsf2 = emp_clsf2;
		this.emp_clsf3 = emp_clsf3;
		this.emp_clsf4 = emp_clsf4;
		this.tot_stot = tot_stot;
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

	public void setClsf1(String clsf1){
		this.clsf1 = clsf1;
	}

	public void setClsf2(String clsf2){
		this.clsf2 = clsf2;
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

	public void setTot_stot(String tot_stot){
		this.tot_stot = tot_stot;
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

	public String getClsf1(){
		return this.clsf1;
	}

	public String getClsf2(){
		return this.clsf2;
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

	public String getTot_stot(){
		return this.tot_stot;
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
		 return "{ call MISHDL.SP_HD_SRCH_5322_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SRCH_5322_ADM dm = (HD_SRCH_5322_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.basi_dt);
		cstmt.setString(6, dm.head_clsf_00_01);
		cstmt.setString(7, dm.head_clsf_01_01);
		cstmt.setString(8, dm.head_clsf_01_02);
		cstmt.setString(9, dm.gridtitle);
		cstmt.setString(10, dm.clsf1);
		cstmt.setString(11, dm.clsf2);
		cstmt.setString(12, dm.emp_clsf1);
		cstmt.setString(13, dm.emp_clsf2);
		cstmt.setString(14, dm.emp_clsf3);
		cstmt.setString(15, dm.emp_clsf4);
		cstmt.setString(16, dm.tot_stot);
		cstmt.setString(17, dm.mode);
		cstmt.setString(18, dm.text_tag);
		cstmt.setString(19, dm.incmg_pers);
		cstmt.setString(20, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.srch.ds.HD_SRCH_5322_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("basi_dt = [" + getBasi_dt() + "]");
		System.out.println("head_clsf_00_01 = [" + getHead_clsf_00_01() + "]");
		System.out.println("head_clsf_01_01 = [" + getHead_clsf_01_01() + "]");
		System.out.println("head_clsf_01_02 = [" + getHead_clsf_01_02() + "]");
		System.out.println("gridtitle = [" + getGridtitle() + "]");
		System.out.println("clsf1 = [" + getClsf1() + "]");
		System.out.println("clsf2 = [" + getClsf2() + "]");
		System.out.println("emp_clsf1 = [" + getEmp_clsf1() + "]");
		System.out.println("emp_clsf2 = [" + getEmp_clsf2() + "]");
		System.out.println("emp_clsf3 = [" + getEmp_clsf3() + "]");
		System.out.println("emp_clsf4 = [" + getEmp_clsf4() + "]");
		System.out.println("tot_stot = [" + getTot_stot() + "]");
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
String clsf1 = req.getParameter("clsf1");
if( clsf1 == null){
	System.out.println(this.toString+" : clsf1 is null" );
}else{
	System.out.println(this.toString+" : clsf1 is "+clsf1 );
}
String clsf2 = req.getParameter("clsf2");
if( clsf2 == null){
	System.out.println(this.toString+" : clsf2 is null" );
}else{
	System.out.println(this.toString+" : clsf2 is "+clsf2 );
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
String tot_stot = req.getParameter("tot_stot");
if( tot_stot == null){
	System.out.println(this.toString+" : tot_stot is null" );
}else{
	System.out.println(this.toString+" : tot_stot is "+tot_stot );
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
String clsf1 = Util.checkString(req.getParameter("clsf1"));
String clsf2 = Util.checkString(req.getParameter("clsf2"));
String emp_clsf1 = Util.checkString(req.getParameter("emp_clsf1"));
String emp_clsf2 = Util.checkString(req.getParameter("emp_clsf2"));
String emp_clsf3 = Util.checkString(req.getParameter("emp_clsf3"));
String emp_clsf4 = Util.checkString(req.getParameter("emp_clsf4"));
String tot_stot = Util.checkString(req.getParameter("tot_stot"));
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
String clsf1 = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf1")));
String clsf2 = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf2")));
String emp_clsf1 = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf1")));
String emp_clsf2 = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf2")));
String emp_clsf3 = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf3")));
String emp_clsf4 = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf4")));
String tot_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_stot")));
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
dm.setClsf1(clsf1);
dm.setClsf2(clsf2);
dm.setEmp_clsf1(emp_clsf1);
dm.setEmp_clsf2(emp_clsf2);
dm.setEmp_clsf3(emp_clsf3);
dm.setEmp_clsf4(emp_clsf4);
dm.setTot_stot(tot_stot);
dm.setMode(mode);
dm.setText_tag(text_tag);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Nov 15 16:13:50 KST 2018 */