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


package chosun.ciis.mc.budg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.ds.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_6116_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yy;
	public String kind;
	public String budg_clas_cd;
	public String mm_amt_1;
	public String mm_amt_2;
	public String mm_amt_3;
	public String mm_amt_4;
	public String mm_amt_5;
	public String mm_amt_6;
	public String mm_amt_7;
	public String mm_amt_8;
	public String mm_amt_9;
	public String mm_amt_10;
	public String mm_amt_11;
	public String mm_amt_12;
	public String prvyy_rslt_amt;
	public String kind_2;
	public String budg_clas_cd_2;
	public String mm_amt_1_2;
	public String mm_amt_2_2;
	public String mm_amt_3_2;
	public String mm_amt_4_2;
	public String mm_amt_5_2;
	public String mm_amt_6_2;
	public String mm_amt_7_2;
	public String mm_amt_8_2;
	public String mm_amt_9_2;
	public String mm_amt_10_2;
	public String mm_amt_11_2;
	public String mm_amt_12_2;
	public String prvyy_rslt_amt_2;
	public String rslt_aply_prd_bgn;
	public String rslt_aply_prd_end;
	public String expt_aply_prd_bgn;
	public String expt_aply_prd_end;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public MC_BUDG_6116_IDM(){}
	public MC_BUDG_6116_IDM(String cmpy_cd, String yy, String kind, String budg_clas_cd, String mm_amt_1, String mm_amt_2, String mm_amt_3, String mm_amt_4, String mm_amt_5, String mm_amt_6, String mm_amt_7, String mm_amt_8, String mm_amt_9, String mm_amt_10, String mm_amt_11, String mm_amt_12, String prvyy_rslt_amt, String kind_2, String budg_clas_cd_2, String mm_amt_1_2, String mm_amt_2_2, String mm_amt_3_2, String mm_amt_4_2, String mm_amt_5_2, String mm_amt_6_2, String mm_amt_7_2, String mm_amt_8_2, String mm_amt_9_2, String mm_amt_10_2, String mm_amt_11_2, String mm_amt_12_2, String prvyy_rslt_amt_2, String rslt_aply_prd_bgn, String rslt_aply_prd_end, String expt_aply_prd_bgn, String expt_aply_prd_end, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.yy = yy;
		this.kind = kind;
		this.budg_clas_cd = budg_clas_cd;
		this.mm_amt_1 = mm_amt_1;
		this.mm_amt_2 = mm_amt_2;
		this.mm_amt_3 = mm_amt_3;
		this.mm_amt_4 = mm_amt_4;
		this.mm_amt_5 = mm_amt_5;
		this.mm_amt_6 = mm_amt_6;
		this.mm_amt_7 = mm_amt_7;
		this.mm_amt_8 = mm_amt_8;
		this.mm_amt_9 = mm_amt_9;
		this.mm_amt_10 = mm_amt_10;
		this.mm_amt_11 = mm_amt_11;
		this.mm_amt_12 = mm_amt_12;
		this.prvyy_rslt_amt = prvyy_rslt_amt;
		this.kind_2 = kind_2;
		this.budg_clas_cd_2 = budg_clas_cd_2;
		this.mm_amt_1_2 = mm_amt_1_2;
		this.mm_amt_2_2 = mm_amt_2_2;
		this.mm_amt_3_2 = mm_amt_3_2;
		this.mm_amt_4_2 = mm_amt_4_2;
		this.mm_amt_5_2 = mm_amt_5_2;
		this.mm_amt_6_2 = mm_amt_6_2;
		this.mm_amt_7_2 = mm_amt_7_2;
		this.mm_amt_8_2 = mm_amt_8_2;
		this.mm_amt_9_2 = mm_amt_9_2;
		this.mm_amt_10_2 = mm_amt_10_2;
		this.mm_amt_11_2 = mm_amt_11_2;
		this.mm_amt_12_2 = mm_amt_12_2;
		this.prvyy_rslt_amt_2 = prvyy_rslt_amt_2;
		this.rslt_aply_prd_bgn = rslt_aply_prd_bgn;
		this.rslt_aply_prd_end = rslt_aply_prd_end;
		this.expt_aply_prd_bgn = expt_aply_prd_bgn;
		this.expt_aply_prd_end = expt_aply_prd_end;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYy(String yy){
		this.yy = yy;
	}

	public void setKind(String kind){
		this.kind = kind;
	}

	public void setBudg_clas_cd(String budg_clas_cd){
		this.budg_clas_cd = budg_clas_cd;
	}

	public void setMm_amt_1(String mm_amt_1){
		this.mm_amt_1 = mm_amt_1;
	}

	public void setMm_amt_2(String mm_amt_2){
		this.mm_amt_2 = mm_amt_2;
	}

	public void setMm_amt_3(String mm_amt_3){
		this.mm_amt_3 = mm_amt_3;
	}

	public void setMm_amt_4(String mm_amt_4){
		this.mm_amt_4 = mm_amt_4;
	}

	public void setMm_amt_5(String mm_amt_5){
		this.mm_amt_5 = mm_amt_5;
	}

	public void setMm_amt_6(String mm_amt_6){
		this.mm_amt_6 = mm_amt_6;
	}

	public void setMm_amt_7(String mm_amt_7){
		this.mm_amt_7 = mm_amt_7;
	}

	public void setMm_amt_8(String mm_amt_8){
		this.mm_amt_8 = mm_amt_8;
	}

	public void setMm_amt_9(String mm_amt_9){
		this.mm_amt_9 = mm_amt_9;
	}

	public void setMm_amt_10(String mm_amt_10){
		this.mm_amt_10 = mm_amt_10;
	}

	public void setMm_amt_11(String mm_amt_11){
		this.mm_amt_11 = mm_amt_11;
	}

	public void setMm_amt_12(String mm_amt_12){
		this.mm_amt_12 = mm_amt_12;
	}

	public void setPrvyy_rslt_amt(String prvyy_rslt_amt){
		this.prvyy_rslt_amt = prvyy_rslt_amt;
	}

	public void setKind_2(String kind_2){
		this.kind_2 = kind_2;
	}

	public void setBudg_clas_cd_2(String budg_clas_cd_2){
		this.budg_clas_cd_2 = budg_clas_cd_2;
	}

	public void setMm_amt_1_2(String mm_amt_1_2){
		this.mm_amt_1_2 = mm_amt_1_2;
	}

	public void setMm_amt_2_2(String mm_amt_2_2){
		this.mm_amt_2_2 = mm_amt_2_2;
	}

	public void setMm_amt_3_2(String mm_amt_3_2){
		this.mm_amt_3_2 = mm_amt_3_2;
	}

	public void setMm_amt_4_2(String mm_amt_4_2){
		this.mm_amt_4_2 = mm_amt_4_2;
	}

	public void setMm_amt_5_2(String mm_amt_5_2){
		this.mm_amt_5_2 = mm_amt_5_2;
	}

	public void setMm_amt_6_2(String mm_amt_6_2){
		this.mm_amt_6_2 = mm_amt_6_2;
	}

	public void setMm_amt_7_2(String mm_amt_7_2){
		this.mm_amt_7_2 = mm_amt_7_2;
	}

	public void setMm_amt_8_2(String mm_amt_8_2){
		this.mm_amt_8_2 = mm_amt_8_2;
	}

	public void setMm_amt_9_2(String mm_amt_9_2){
		this.mm_amt_9_2 = mm_amt_9_2;
	}

	public void setMm_amt_10_2(String mm_amt_10_2){
		this.mm_amt_10_2 = mm_amt_10_2;
	}

	public void setMm_amt_11_2(String mm_amt_11_2){
		this.mm_amt_11_2 = mm_amt_11_2;
	}

	public void setMm_amt_12_2(String mm_amt_12_2){
		this.mm_amt_12_2 = mm_amt_12_2;
	}

	public void setPrvyy_rslt_amt_2(String prvyy_rslt_amt_2){
		this.prvyy_rslt_amt_2 = prvyy_rslt_amt_2;
	}

	public void setRslt_aply_prd_bgn(String rslt_aply_prd_bgn){
		this.rslt_aply_prd_bgn = rslt_aply_prd_bgn;
	}

	public void setRslt_aply_prd_end(String rslt_aply_prd_end){
		this.rslt_aply_prd_end = rslt_aply_prd_end;
	}

	public void setExpt_aply_prd_bgn(String expt_aply_prd_bgn){
		this.expt_aply_prd_bgn = expt_aply_prd_bgn;
	}

	public void setExpt_aply_prd_end(String expt_aply_prd_end){
		this.expt_aply_prd_end = expt_aply_prd_end;
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

	public String getYy(){
		return this.yy;
	}

	public String getKind(){
		return this.kind;
	}

	public String getBudg_clas_cd(){
		return this.budg_clas_cd;
	}

	public String getMm_amt_1(){
		return this.mm_amt_1;
	}

	public String getMm_amt_2(){
		return this.mm_amt_2;
	}

	public String getMm_amt_3(){
		return this.mm_amt_3;
	}

	public String getMm_amt_4(){
		return this.mm_amt_4;
	}

	public String getMm_amt_5(){
		return this.mm_amt_5;
	}

	public String getMm_amt_6(){
		return this.mm_amt_6;
	}

	public String getMm_amt_7(){
		return this.mm_amt_7;
	}

	public String getMm_amt_8(){
		return this.mm_amt_8;
	}

	public String getMm_amt_9(){
		return this.mm_amt_9;
	}

	public String getMm_amt_10(){
		return this.mm_amt_10;
	}

	public String getMm_amt_11(){
		return this.mm_amt_11;
	}

	public String getMm_amt_12(){
		return this.mm_amt_12;
	}

	public String getPrvyy_rslt_amt(){
		return this.prvyy_rslt_amt;
	}

	public String getKind_2(){
		return this.kind_2;
	}

	public String getBudg_clas_cd_2(){
		return this.budg_clas_cd_2;
	}

	public String getMm_amt_1_2(){
		return this.mm_amt_1_2;
	}

	public String getMm_amt_2_2(){
		return this.mm_amt_2_2;
	}

	public String getMm_amt_3_2(){
		return this.mm_amt_3_2;
	}

	public String getMm_amt_4_2(){
		return this.mm_amt_4_2;
	}

	public String getMm_amt_5_2(){
		return this.mm_amt_5_2;
	}

	public String getMm_amt_6_2(){
		return this.mm_amt_6_2;
	}

	public String getMm_amt_7_2(){
		return this.mm_amt_7_2;
	}

	public String getMm_amt_8_2(){
		return this.mm_amt_8_2;
	}

	public String getMm_amt_9_2(){
		return this.mm_amt_9_2;
	}

	public String getMm_amt_10_2(){
		return this.mm_amt_10_2;
	}

	public String getMm_amt_11_2(){
		return this.mm_amt_11_2;
	}

	public String getMm_amt_12_2(){
		return this.mm_amt_12_2;
	}

	public String getPrvyy_rslt_amt_2(){
		return this.prvyy_rslt_amt_2;
	}

	public String getRslt_aply_prd_bgn(){
		return this.rslt_aply_prd_bgn;
	}

	public String getRslt_aply_prd_end(){
		return this.rslt_aply_prd_end;
	}

	public String getExpt_aply_prd_bgn(){
		return this.expt_aply_prd_bgn;
	}

	public String getExpt_aply_prd_end(){
		return this.expt_aply_prd_end;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_6116_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_6116_IDM dm = (MC_BUDG_6116_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yy);
		cstmt.setString(5, dm.kind);
		cstmt.setString(6, dm.budg_clas_cd);
		cstmt.setString(7, dm.mm_amt_1);
		cstmt.setString(8, dm.mm_amt_2);
		cstmt.setString(9, dm.mm_amt_3);
		cstmt.setString(10, dm.mm_amt_4);
		cstmt.setString(11, dm.mm_amt_5);
		cstmt.setString(12, dm.mm_amt_6);
		cstmt.setString(13, dm.mm_amt_7);
		cstmt.setString(14, dm.mm_amt_8);
		cstmt.setString(15, dm.mm_amt_9);
		cstmt.setString(16, dm.mm_amt_10);
		cstmt.setString(17, dm.mm_amt_11);
		cstmt.setString(18, dm.mm_amt_12);
		cstmt.setString(19, dm.prvyy_rslt_amt);
		cstmt.setString(20, dm.kind_2);
		cstmt.setString(21, dm.budg_clas_cd_2);
		cstmt.setString(22, dm.mm_amt_1_2);
		cstmt.setString(23, dm.mm_amt_2_2);
		cstmt.setString(24, dm.mm_amt_3_2);
		cstmt.setString(25, dm.mm_amt_4_2);
		cstmt.setString(26, dm.mm_amt_5_2);
		cstmt.setString(27, dm.mm_amt_6_2);
		cstmt.setString(28, dm.mm_amt_7_2);
		cstmt.setString(29, dm.mm_amt_8_2);
		cstmt.setString(30, dm.mm_amt_9_2);
		cstmt.setString(31, dm.mm_amt_10_2);
		cstmt.setString(32, dm.mm_amt_11_2);
		cstmt.setString(33, dm.mm_amt_12_2);
		cstmt.setString(34, dm.prvyy_rslt_amt_2);
		cstmt.setString(35, dm.rslt_aply_prd_bgn);
		cstmt.setString(36, dm.rslt_aply_prd_end);
		cstmt.setString(37, dm.expt_aply_prd_bgn);
		cstmt.setString(38, dm.expt_aply_prd_end);
		cstmt.setString(39, dm.incmg_pers);
		cstmt.setString(40, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_6116_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yy = [" + getYy() + "]");
		System.out.println("kind = [" + getKind() + "]");
		System.out.println("budg_clas_cd = [" + getBudg_clas_cd() + "]");
		System.out.println("mm_amt_1 = [" + getMm_amt_1() + "]");
		System.out.println("mm_amt_2 = [" + getMm_amt_2() + "]");
		System.out.println("mm_amt_3 = [" + getMm_amt_3() + "]");
		System.out.println("mm_amt_4 = [" + getMm_amt_4() + "]");
		System.out.println("mm_amt_5 = [" + getMm_amt_5() + "]");
		System.out.println("mm_amt_6 = [" + getMm_amt_6() + "]");
		System.out.println("mm_amt_7 = [" + getMm_amt_7() + "]");
		System.out.println("mm_amt_8 = [" + getMm_amt_8() + "]");
		System.out.println("mm_amt_9 = [" + getMm_amt_9() + "]");
		System.out.println("mm_amt_10 = [" + getMm_amt_10() + "]");
		System.out.println("mm_amt_11 = [" + getMm_amt_11() + "]");
		System.out.println("mm_amt_12 = [" + getMm_amt_12() + "]");
		System.out.println("prvyy_rslt_amt = [" + getPrvyy_rslt_amt() + "]");
		System.out.println("kind_2 = [" + getKind_2() + "]");
		System.out.println("budg_clas_cd_2 = [" + getBudg_clas_cd_2() + "]");
		System.out.println("mm_amt_1_2 = [" + getMm_amt_1_2() + "]");
		System.out.println("mm_amt_2_2 = [" + getMm_amt_2_2() + "]");
		System.out.println("mm_amt_3_2 = [" + getMm_amt_3_2() + "]");
		System.out.println("mm_amt_4_2 = [" + getMm_amt_4_2() + "]");
		System.out.println("mm_amt_5_2 = [" + getMm_amt_5_2() + "]");
		System.out.println("mm_amt_6_2 = [" + getMm_amt_6_2() + "]");
		System.out.println("mm_amt_7_2 = [" + getMm_amt_7_2() + "]");
		System.out.println("mm_amt_8_2 = [" + getMm_amt_8_2() + "]");
		System.out.println("mm_amt_9_2 = [" + getMm_amt_9_2() + "]");
		System.out.println("mm_amt_10_2 = [" + getMm_amt_10_2() + "]");
		System.out.println("mm_amt_11_2 = [" + getMm_amt_11_2() + "]");
		System.out.println("mm_amt_12_2 = [" + getMm_amt_12_2() + "]");
		System.out.println("prvyy_rslt_amt_2 = [" + getPrvyy_rslt_amt_2() + "]");
		System.out.println("rslt_aply_prd_bgn = [" + getRslt_aply_prd_bgn() + "]");
		System.out.println("rslt_aply_prd_end = [" + getRslt_aply_prd_end() + "]");
		System.out.println("expt_aply_prd_bgn = [" + getExpt_aply_prd_bgn() + "]");
		System.out.println("expt_aply_prd_end = [" + getExpt_aply_prd_end() + "]");
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
String yy = req.getParameter("yy");
if( yy == null){
	System.out.println(this.toString+" : yy is null" );
}else{
	System.out.println(this.toString+" : yy is "+yy );
}
String kind = req.getParameter("kind");
if( kind == null){
	System.out.println(this.toString+" : kind is null" );
}else{
	System.out.println(this.toString+" : kind is "+kind );
}
String budg_clas_cd = req.getParameter("budg_clas_cd");
if( budg_clas_cd == null){
	System.out.println(this.toString+" : budg_clas_cd is null" );
}else{
	System.out.println(this.toString+" : budg_clas_cd is "+budg_clas_cd );
}
String mm_amt_1 = req.getParameter("mm_amt_1");
if( mm_amt_1 == null){
	System.out.println(this.toString+" : mm_amt_1 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_1 is "+mm_amt_1 );
}
String mm_amt_2 = req.getParameter("mm_amt_2");
if( mm_amt_2 == null){
	System.out.println(this.toString+" : mm_amt_2 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_2 is "+mm_amt_2 );
}
String mm_amt_3 = req.getParameter("mm_amt_3");
if( mm_amt_3 == null){
	System.out.println(this.toString+" : mm_amt_3 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_3 is "+mm_amt_3 );
}
String mm_amt_4 = req.getParameter("mm_amt_4");
if( mm_amt_4 == null){
	System.out.println(this.toString+" : mm_amt_4 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_4 is "+mm_amt_4 );
}
String mm_amt_5 = req.getParameter("mm_amt_5");
if( mm_amt_5 == null){
	System.out.println(this.toString+" : mm_amt_5 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_5 is "+mm_amt_5 );
}
String mm_amt_6 = req.getParameter("mm_amt_6");
if( mm_amt_6 == null){
	System.out.println(this.toString+" : mm_amt_6 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_6 is "+mm_amt_6 );
}
String mm_amt_7 = req.getParameter("mm_amt_7");
if( mm_amt_7 == null){
	System.out.println(this.toString+" : mm_amt_7 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_7 is "+mm_amt_7 );
}
String mm_amt_8 = req.getParameter("mm_amt_8");
if( mm_amt_8 == null){
	System.out.println(this.toString+" : mm_amt_8 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_8 is "+mm_amt_8 );
}
String mm_amt_9 = req.getParameter("mm_amt_9");
if( mm_amt_9 == null){
	System.out.println(this.toString+" : mm_amt_9 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_9 is "+mm_amt_9 );
}
String mm_amt_10 = req.getParameter("mm_amt_10");
if( mm_amt_10 == null){
	System.out.println(this.toString+" : mm_amt_10 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_10 is "+mm_amt_10 );
}
String mm_amt_11 = req.getParameter("mm_amt_11");
if( mm_amt_11 == null){
	System.out.println(this.toString+" : mm_amt_11 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_11 is "+mm_amt_11 );
}
String mm_amt_12 = req.getParameter("mm_amt_12");
if( mm_amt_12 == null){
	System.out.println(this.toString+" : mm_amt_12 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_12 is "+mm_amt_12 );
}
String prvyy_rslt_amt = req.getParameter("prvyy_rslt_amt");
if( prvyy_rslt_amt == null){
	System.out.println(this.toString+" : prvyy_rslt_amt is null" );
}else{
	System.out.println(this.toString+" : prvyy_rslt_amt is "+prvyy_rslt_amt );
}
String kind_2 = req.getParameter("kind_2");
if( kind_2 == null){
	System.out.println(this.toString+" : kind_2 is null" );
}else{
	System.out.println(this.toString+" : kind_2 is "+kind_2 );
}
String budg_clas_cd_2 = req.getParameter("budg_clas_cd_2");
if( budg_clas_cd_2 == null){
	System.out.println(this.toString+" : budg_clas_cd_2 is null" );
}else{
	System.out.println(this.toString+" : budg_clas_cd_2 is "+budg_clas_cd_2 );
}
String mm_amt_1_2 = req.getParameter("mm_amt_1_2");
if( mm_amt_1_2 == null){
	System.out.println(this.toString+" : mm_amt_1_2 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_1_2 is "+mm_amt_1_2 );
}
String mm_amt_2_2 = req.getParameter("mm_amt_2_2");
if( mm_amt_2_2 == null){
	System.out.println(this.toString+" : mm_amt_2_2 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_2_2 is "+mm_amt_2_2 );
}
String mm_amt_3_2 = req.getParameter("mm_amt_3_2");
if( mm_amt_3_2 == null){
	System.out.println(this.toString+" : mm_amt_3_2 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_3_2 is "+mm_amt_3_2 );
}
String mm_amt_4_2 = req.getParameter("mm_amt_4_2");
if( mm_amt_4_2 == null){
	System.out.println(this.toString+" : mm_amt_4_2 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_4_2 is "+mm_amt_4_2 );
}
String mm_amt_5_2 = req.getParameter("mm_amt_5_2");
if( mm_amt_5_2 == null){
	System.out.println(this.toString+" : mm_amt_5_2 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_5_2 is "+mm_amt_5_2 );
}
String mm_amt_6_2 = req.getParameter("mm_amt_6_2");
if( mm_amt_6_2 == null){
	System.out.println(this.toString+" : mm_amt_6_2 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_6_2 is "+mm_amt_6_2 );
}
String mm_amt_7_2 = req.getParameter("mm_amt_7_2");
if( mm_amt_7_2 == null){
	System.out.println(this.toString+" : mm_amt_7_2 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_7_2 is "+mm_amt_7_2 );
}
String mm_amt_8_2 = req.getParameter("mm_amt_8_2");
if( mm_amt_8_2 == null){
	System.out.println(this.toString+" : mm_amt_8_2 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_8_2 is "+mm_amt_8_2 );
}
String mm_amt_9_2 = req.getParameter("mm_amt_9_2");
if( mm_amt_9_2 == null){
	System.out.println(this.toString+" : mm_amt_9_2 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_9_2 is "+mm_amt_9_2 );
}
String mm_amt_10_2 = req.getParameter("mm_amt_10_2");
if( mm_amt_10_2 == null){
	System.out.println(this.toString+" : mm_amt_10_2 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_10_2 is "+mm_amt_10_2 );
}
String mm_amt_11_2 = req.getParameter("mm_amt_11_2");
if( mm_amt_11_2 == null){
	System.out.println(this.toString+" : mm_amt_11_2 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_11_2 is "+mm_amt_11_2 );
}
String mm_amt_12_2 = req.getParameter("mm_amt_12_2");
if( mm_amt_12_2 == null){
	System.out.println(this.toString+" : mm_amt_12_2 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_12_2 is "+mm_amt_12_2 );
}
String prvyy_rslt_amt_2 = req.getParameter("prvyy_rslt_amt_2");
if( prvyy_rslt_amt_2 == null){
	System.out.println(this.toString+" : prvyy_rslt_amt_2 is null" );
}else{
	System.out.println(this.toString+" : prvyy_rslt_amt_2 is "+prvyy_rslt_amt_2 );
}
String rslt_aply_prd_bgn = req.getParameter("rslt_aply_prd_bgn");
if( rslt_aply_prd_bgn == null){
	System.out.println(this.toString+" : rslt_aply_prd_bgn is null" );
}else{
	System.out.println(this.toString+" : rslt_aply_prd_bgn is "+rslt_aply_prd_bgn );
}
String rslt_aply_prd_end = req.getParameter("rslt_aply_prd_end");
if( rslt_aply_prd_end == null){
	System.out.println(this.toString+" : rslt_aply_prd_end is null" );
}else{
	System.out.println(this.toString+" : rslt_aply_prd_end is "+rslt_aply_prd_end );
}
String expt_aply_prd_bgn = req.getParameter("expt_aply_prd_bgn");
if( expt_aply_prd_bgn == null){
	System.out.println(this.toString+" : expt_aply_prd_bgn is null" );
}else{
	System.out.println(this.toString+" : expt_aply_prd_bgn is "+expt_aply_prd_bgn );
}
String expt_aply_prd_end = req.getParameter("expt_aply_prd_end");
if( expt_aply_prd_end == null){
	System.out.println(this.toString+" : expt_aply_prd_end is null" );
}else{
	System.out.println(this.toString+" : expt_aply_prd_end is "+expt_aply_prd_end );
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
String yy = Util.checkString(req.getParameter("yy"));
String kind = Util.checkString(req.getParameter("kind"));
String budg_clas_cd = Util.checkString(req.getParameter("budg_clas_cd"));
String mm_amt_1 = Util.checkString(req.getParameter("mm_amt_1"));
String mm_amt_2 = Util.checkString(req.getParameter("mm_amt_2"));
String mm_amt_3 = Util.checkString(req.getParameter("mm_amt_3"));
String mm_amt_4 = Util.checkString(req.getParameter("mm_amt_4"));
String mm_amt_5 = Util.checkString(req.getParameter("mm_amt_5"));
String mm_amt_6 = Util.checkString(req.getParameter("mm_amt_6"));
String mm_amt_7 = Util.checkString(req.getParameter("mm_amt_7"));
String mm_amt_8 = Util.checkString(req.getParameter("mm_amt_8"));
String mm_amt_9 = Util.checkString(req.getParameter("mm_amt_9"));
String mm_amt_10 = Util.checkString(req.getParameter("mm_amt_10"));
String mm_amt_11 = Util.checkString(req.getParameter("mm_amt_11"));
String mm_amt_12 = Util.checkString(req.getParameter("mm_amt_12"));
String prvyy_rslt_amt = Util.checkString(req.getParameter("prvyy_rslt_amt"));
String kind_2 = Util.checkString(req.getParameter("kind_2"));
String budg_clas_cd_2 = Util.checkString(req.getParameter("budg_clas_cd_2"));
String mm_amt_1_2 = Util.checkString(req.getParameter("mm_amt_1_2"));
String mm_amt_2_2 = Util.checkString(req.getParameter("mm_amt_2_2"));
String mm_amt_3_2 = Util.checkString(req.getParameter("mm_amt_3_2"));
String mm_amt_4_2 = Util.checkString(req.getParameter("mm_amt_4_2"));
String mm_amt_5_2 = Util.checkString(req.getParameter("mm_amt_5_2"));
String mm_amt_6_2 = Util.checkString(req.getParameter("mm_amt_6_2"));
String mm_amt_7_2 = Util.checkString(req.getParameter("mm_amt_7_2"));
String mm_amt_8_2 = Util.checkString(req.getParameter("mm_amt_8_2"));
String mm_amt_9_2 = Util.checkString(req.getParameter("mm_amt_9_2"));
String mm_amt_10_2 = Util.checkString(req.getParameter("mm_amt_10_2"));
String mm_amt_11_2 = Util.checkString(req.getParameter("mm_amt_11_2"));
String mm_amt_12_2 = Util.checkString(req.getParameter("mm_amt_12_2"));
String prvyy_rslt_amt_2 = Util.checkString(req.getParameter("prvyy_rslt_amt_2"));
String rslt_aply_prd_bgn = Util.checkString(req.getParameter("rslt_aply_prd_bgn"));
String rslt_aply_prd_end = Util.checkString(req.getParameter("rslt_aply_prd_end"));
String expt_aply_prd_bgn = Util.checkString(req.getParameter("expt_aply_prd_bgn"));
String expt_aply_prd_end = Util.checkString(req.getParameter("expt_aply_prd_end"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yy = Util.Uni2Ksc(Util.checkString(req.getParameter("yy")));
String kind = Util.Uni2Ksc(Util.checkString(req.getParameter("kind")));
String budg_clas_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_clas_cd")));
String mm_amt_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_1")));
String mm_amt_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_2")));
String mm_amt_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_3")));
String mm_amt_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_4")));
String mm_amt_5 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_5")));
String mm_amt_6 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_6")));
String mm_amt_7 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_7")));
String mm_amt_8 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_8")));
String mm_amt_9 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_9")));
String mm_amt_10 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_10")));
String mm_amt_11 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_11")));
String mm_amt_12 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_12")));
String prvyy_rslt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("prvyy_rslt_amt")));
String kind_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("kind_2")));
String budg_clas_cd_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_clas_cd_2")));
String mm_amt_1_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_1_2")));
String mm_amt_2_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_2_2")));
String mm_amt_3_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_3_2")));
String mm_amt_4_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_4_2")));
String mm_amt_5_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_5_2")));
String mm_amt_6_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_6_2")));
String mm_amt_7_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_7_2")));
String mm_amt_8_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_8_2")));
String mm_amt_9_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_9_2")));
String mm_amt_10_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_10_2")));
String mm_amt_11_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_11_2")));
String mm_amt_12_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_12_2")));
String prvyy_rslt_amt_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("prvyy_rslt_amt_2")));
String rslt_aply_prd_bgn = Util.Uni2Ksc(Util.checkString(req.getParameter("rslt_aply_prd_bgn")));
String rslt_aply_prd_end = Util.Uni2Ksc(Util.checkString(req.getParameter("rslt_aply_prd_end")));
String expt_aply_prd_bgn = Util.Uni2Ksc(Util.checkString(req.getParameter("expt_aply_prd_bgn")));
String expt_aply_prd_end = Util.Uni2Ksc(Util.checkString(req.getParameter("expt_aply_prd_end")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYy(yy);
dm.setKind(kind);
dm.setBudg_clas_cd(budg_clas_cd);
dm.setMm_amt_1(mm_amt_1);
dm.setMm_amt_2(mm_amt_2);
dm.setMm_amt_3(mm_amt_3);
dm.setMm_amt_4(mm_amt_4);
dm.setMm_amt_5(mm_amt_5);
dm.setMm_amt_6(mm_amt_6);
dm.setMm_amt_7(mm_amt_7);
dm.setMm_amt_8(mm_amt_8);
dm.setMm_amt_9(mm_amt_9);
dm.setMm_amt_10(mm_amt_10);
dm.setMm_amt_11(mm_amt_11);
dm.setMm_amt_12(mm_amt_12);
dm.setPrvyy_rslt_amt(prvyy_rslt_amt);
dm.setKind_2(kind_2);
dm.setBudg_clas_cd_2(budg_clas_cd_2);
dm.setMm_amt_1_2(mm_amt_1_2);
dm.setMm_amt_2_2(mm_amt_2_2);
dm.setMm_amt_3_2(mm_amt_3_2);
dm.setMm_amt_4_2(mm_amt_4_2);
dm.setMm_amt_5_2(mm_amt_5_2);
dm.setMm_amt_6_2(mm_amt_6_2);
dm.setMm_amt_7_2(mm_amt_7_2);
dm.setMm_amt_8_2(mm_amt_8_2);
dm.setMm_amt_9_2(mm_amt_9_2);
dm.setMm_amt_10_2(mm_amt_10_2);
dm.setMm_amt_11_2(mm_amt_11_2);
dm.setMm_amt_12_2(mm_amt_12_2);
dm.setPrvyy_rslt_amt_2(prvyy_rslt_amt_2);
dm.setRslt_aply_prd_bgn(rslt_aply_prd_bgn);
dm.setRslt_aply_prd_end(rslt_aply_prd_end);
dm.setExpt_aply_prd_bgn(expt_aply_prd_bgn);
dm.setExpt_aply_prd_end(expt_aply_prd_end);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 13 15:47:54 KST 2009 */