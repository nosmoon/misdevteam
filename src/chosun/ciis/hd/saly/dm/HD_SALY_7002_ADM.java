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


public class HD_SALY_7002_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String new_aply_basi_mm;
	public String saly_amt_fr;
	public String saly_amt_to;
	public String faml_1;
	public String faml_2;
	public String faml_3;
	public String faml_4;
	public String faml_5;
	public String faml_6;
	public String faml_7;
	public String faml_8;
	public String faml_9;
	public String faml_10;
	public String faml_11;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public HD_SALY_7002_ADM(){}
	public HD_SALY_7002_ADM(String cmpy_cd, String mode, String new_aply_basi_mm, String saly_amt_fr, String saly_amt_to, String faml_1, String faml_2, String faml_3, String faml_4, String faml_5, String faml_6, String faml_7, String faml_8, String faml_9, String faml_10, String faml_11, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.new_aply_basi_mm = new_aply_basi_mm;
		this.saly_amt_fr = saly_amt_fr;
		this.saly_amt_to = saly_amt_to;
		this.faml_1 = faml_1;
		this.faml_2 = faml_2;
		this.faml_3 = faml_3;
		this.faml_4 = faml_4;
		this.faml_5 = faml_5;
		this.faml_6 = faml_6;
		this.faml_7 = faml_7;
		this.faml_8 = faml_8;
		this.faml_9 = faml_9;
		this.faml_10 = faml_10;
		this.faml_11 = faml_11;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setNew_aply_basi_mm(String new_aply_basi_mm){
		this.new_aply_basi_mm = new_aply_basi_mm;
	}

	public void setSaly_amt_fr(String saly_amt_fr){
		this.saly_amt_fr = saly_amt_fr;
	}

	public void setSaly_amt_to(String saly_amt_to){
		this.saly_amt_to = saly_amt_to;
	}

	public void setFaml_1(String faml_1){
		this.faml_1 = faml_1;
	}

	public void setFaml_2(String faml_2){
		this.faml_2 = faml_2;
	}

	public void setFaml_3(String faml_3){
		this.faml_3 = faml_3;
	}

	public void setFaml_4(String faml_4){
		this.faml_4 = faml_4;
	}

	public void setFaml_5(String faml_5){
		this.faml_5 = faml_5;
	}

	public void setFaml_6(String faml_6){
		this.faml_6 = faml_6;
	}

	public void setFaml_7(String faml_7){
		this.faml_7 = faml_7;
	}

	public void setFaml_8(String faml_8){
		this.faml_8 = faml_8;
	}

	public void setFaml_9(String faml_9){
		this.faml_9 = faml_9;
	}

	public void setFaml_10(String faml_10){
		this.faml_10 = faml_10;
	}

	public void setFaml_11(String faml_11){
		this.faml_11 = faml_11;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getNew_aply_basi_mm(){
		return this.new_aply_basi_mm;
	}

	public String getSaly_amt_fr(){
		return this.saly_amt_fr;
	}

	public String getSaly_amt_to(){
		return this.saly_amt_to;
	}

	public String getFaml_1(){
		return this.faml_1;
	}

	public String getFaml_2(){
		return this.faml_2;
	}

	public String getFaml_3(){
		return this.faml_3;
	}

	public String getFaml_4(){
		return this.faml_4;
	}

	public String getFaml_5(){
		return this.faml_5;
	}

	public String getFaml_6(){
		return this.faml_6;
	}

	public String getFaml_7(){
		return this.faml_7;
	}

	public String getFaml_8(){
		return this.faml_8;
	}

	public String getFaml_9(){
		return this.faml_9;
	}

	public String getFaml_10(){
		return this.faml_10;
	}

	public String getFaml_11(){
		return this.faml_11;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_7002_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_7002_ADM dm = (HD_SALY_7002_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.new_aply_basi_mm);
		cstmt.setString(6, dm.saly_amt_fr);
		cstmt.setString(7, dm.saly_amt_to);
		cstmt.setString(8, dm.faml_1);
		cstmt.setString(9, dm.faml_2);
		cstmt.setString(10, dm.faml_3);
		cstmt.setString(11, dm.faml_4);
		cstmt.setString(12, dm.faml_5);
		cstmt.setString(13, dm.faml_6);
		cstmt.setString(14, dm.faml_7);
		cstmt.setString(15, dm.faml_8);
		cstmt.setString(16, dm.faml_9);
		cstmt.setString(17, dm.faml_10);
		cstmt.setString(18, dm.faml_11);
		cstmt.setString(19, dm.incmg_pers);
		cstmt.setString(20, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.saly.ds.HD_SALY_7002_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("new_aply_basi_mm = [" + getNew_aply_basi_mm() + "]");
		System.out.println("saly_amt_fr = [" + getSaly_amt_fr() + "]");
		System.out.println("saly_amt_to = [" + getSaly_amt_to() + "]");
		System.out.println("faml_1 = [" + getFaml_1() + "]");
		System.out.println("faml_2 = [" + getFaml_2() + "]");
		System.out.println("faml_3 = [" + getFaml_3() + "]");
		System.out.println("faml_4 = [" + getFaml_4() + "]");
		System.out.println("faml_5 = [" + getFaml_5() + "]");
		System.out.println("faml_6 = [" + getFaml_6() + "]");
		System.out.println("faml_7 = [" + getFaml_7() + "]");
		System.out.println("faml_8 = [" + getFaml_8() + "]");
		System.out.println("faml_9 = [" + getFaml_9() + "]");
		System.out.println("faml_10 = [" + getFaml_10() + "]");
		System.out.println("faml_11 = [" + getFaml_11() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String new_aply_basi_mm = req.getParameter("new_aply_basi_mm");
if( new_aply_basi_mm == null){
	System.out.println(this.toString+" : new_aply_basi_mm is null" );
}else{
	System.out.println(this.toString+" : new_aply_basi_mm is "+new_aply_basi_mm );
}
String saly_amt_fr = req.getParameter("saly_amt_fr");
if( saly_amt_fr == null){
	System.out.println(this.toString+" : saly_amt_fr is null" );
}else{
	System.out.println(this.toString+" : saly_amt_fr is "+saly_amt_fr );
}
String saly_amt_to = req.getParameter("saly_amt_to");
if( saly_amt_to == null){
	System.out.println(this.toString+" : saly_amt_to is null" );
}else{
	System.out.println(this.toString+" : saly_amt_to is "+saly_amt_to );
}
String faml_1 = req.getParameter("faml_1");
if( faml_1 == null){
	System.out.println(this.toString+" : faml_1 is null" );
}else{
	System.out.println(this.toString+" : faml_1 is "+faml_1 );
}
String faml_2 = req.getParameter("faml_2");
if( faml_2 == null){
	System.out.println(this.toString+" : faml_2 is null" );
}else{
	System.out.println(this.toString+" : faml_2 is "+faml_2 );
}
String faml_3 = req.getParameter("faml_3");
if( faml_3 == null){
	System.out.println(this.toString+" : faml_3 is null" );
}else{
	System.out.println(this.toString+" : faml_3 is "+faml_3 );
}
String faml_4 = req.getParameter("faml_4");
if( faml_4 == null){
	System.out.println(this.toString+" : faml_4 is null" );
}else{
	System.out.println(this.toString+" : faml_4 is "+faml_4 );
}
String faml_5 = req.getParameter("faml_5");
if( faml_5 == null){
	System.out.println(this.toString+" : faml_5 is null" );
}else{
	System.out.println(this.toString+" : faml_5 is "+faml_5 );
}
String faml_6 = req.getParameter("faml_6");
if( faml_6 == null){
	System.out.println(this.toString+" : faml_6 is null" );
}else{
	System.out.println(this.toString+" : faml_6 is "+faml_6 );
}
String faml_7 = req.getParameter("faml_7");
if( faml_7 == null){
	System.out.println(this.toString+" : faml_7 is null" );
}else{
	System.out.println(this.toString+" : faml_7 is "+faml_7 );
}
String faml_8 = req.getParameter("faml_8");
if( faml_8 == null){
	System.out.println(this.toString+" : faml_8 is null" );
}else{
	System.out.println(this.toString+" : faml_8 is "+faml_8 );
}
String faml_9 = req.getParameter("faml_9");
if( faml_9 == null){
	System.out.println(this.toString+" : faml_9 is null" );
}else{
	System.out.println(this.toString+" : faml_9 is "+faml_9 );
}
String faml_10 = req.getParameter("faml_10");
if( faml_10 == null){
	System.out.println(this.toString+" : faml_10 is null" );
}else{
	System.out.println(this.toString+" : faml_10 is "+faml_10 );
}
String faml_11 = req.getParameter("faml_11");
if( faml_11 == null){
	System.out.println(this.toString+" : faml_11 is null" );
}else{
	System.out.println(this.toString+" : faml_11 is "+faml_11 );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String new_aply_basi_mm = Util.checkString(req.getParameter("new_aply_basi_mm"));
String saly_amt_fr = Util.checkString(req.getParameter("saly_amt_fr"));
String saly_amt_to = Util.checkString(req.getParameter("saly_amt_to"));
String faml_1 = Util.checkString(req.getParameter("faml_1"));
String faml_2 = Util.checkString(req.getParameter("faml_2"));
String faml_3 = Util.checkString(req.getParameter("faml_3"));
String faml_4 = Util.checkString(req.getParameter("faml_4"));
String faml_5 = Util.checkString(req.getParameter("faml_5"));
String faml_6 = Util.checkString(req.getParameter("faml_6"));
String faml_7 = Util.checkString(req.getParameter("faml_7"));
String faml_8 = Util.checkString(req.getParameter("faml_8"));
String faml_9 = Util.checkString(req.getParameter("faml_9"));
String faml_10 = Util.checkString(req.getParameter("faml_10"));
String faml_11 = Util.checkString(req.getParameter("faml_11"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String new_aply_basi_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("new_aply_basi_mm")));
String saly_amt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_amt_fr")));
String saly_amt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_amt_to")));
String faml_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_1")));
String faml_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_2")));
String faml_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_3")));
String faml_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_4")));
String faml_5 = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_5")));
String faml_6 = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_6")));
String faml_7 = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_7")));
String faml_8 = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_8")));
String faml_9 = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_9")));
String faml_10 = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_10")));
String faml_11 = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_11")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setNew_aply_basi_mm(new_aply_basi_mm);
dm.setSaly_amt_fr(saly_amt_fr);
dm.setSaly_amt_to(saly_amt_to);
dm.setFaml_1(faml_1);
dm.setFaml_2(faml_2);
dm.setFaml_3(faml_3);
dm.setFaml_4(faml_4);
dm.setFaml_5(faml_5);
dm.setFaml_6(faml_6);
dm.setFaml_7(faml_7);
dm.setFaml_8(faml_8);
dm.setFaml_9(faml_9);
dm.setFaml_10(faml_10);
dm.setFaml_11(faml_11);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 06 18:37:03 KST 2015 */