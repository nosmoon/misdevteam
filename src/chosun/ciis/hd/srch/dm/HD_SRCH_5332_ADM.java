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


public class HD_SRCH_5332_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String basi_dt;
	public String gridtitle_01;
	public String gridtitle_02;
	public String clas_clsf1_01;
	public String clas_clsf2_01;
	public String pre_emp_cnt_01;
	public String pre_servcost_01;
	public String emp_cnt_01;
	public String servcost_01;
	public String icdc_amt_01;
	public String head_clsf_00_01;
	public String head_clsf_01_01;
	public String head_clsf_01_02;
	public String mode_01;
	public String head_clsf_02_01;
	public String head_clsf_02_02;
	public String clas_clsf1_02;
	public String clas_clsf2_02;
	public String pre_emp_cnt_02;
	public String pre_servcost_02;
	public String emp_cnt_02;
	public String servcost_02;
	public String remk_02;
	public String mode_02;
	public String text_tag;
	public String incmg_pers;
	public String chg_pers;

	public HD_SRCH_5332_ADM(){}
	public HD_SRCH_5332_ADM(String cmpy_cd, String basi_dt, String gridtitle_01, String gridtitle_02, String clas_clsf1_01, String clas_clsf2_01, String pre_emp_cnt_01, String pre_servcost_01, String emp_cnt_01, String servcost_01, String icdc_amt_01, String head_clsf_00_01, String head_clsf_01_01, String head_clsf_01_02, String mode_01, String head_clsf_02_01, String head_clsf_02_02, String clas_clsf1_02, String clas_clsf2_02, String pre_emp_cnt_02, String pre_servcost_02, String emp_cnt_02, String servcost_02, String remk_02, String mode_02, String text_tag, String incmg_pers, String chg_pers){
		this.cmpy_cd = cmpy_cd;
		this.basi_dt = basi_dt;
		this.gridtitle_01 = gridtitle_01;
		this.gridtitle_02 = gridtitle_02;
		this.clas_clsf1_01 = clas_clsf1_01;
		this.clas_clsf2_01 = clas_clsf2_01;
		this.pre_emp_cnt_01 = pre_emp_cnt_01;
		this.pre_servcost_01 = pre_servcost_01;
		this.emp_cnt_01 = emp_cnt_01;
		this.servcost_01 = servcost_01;
		this.icdc_amt_01 = icdc_amt_01;
		this.head_clsf_00_01 = head_clsf_00_01;
		this.head_clsf_01_01 = head_clsf_01_01;
		this.head_clsf_01_02 = head_clsf_01_02;
		this.mode_01 = mode_01;
		this.head_clsf_02_01 = head_clsf_02_01;
		this.head_clsf_02_02 = head_clsf_02_02;
		this.clas_clsf1_02 = clas_clsf1_02;
		this.clas_clsf2_02 = clas_clsf2_02;
		this.pre_emp_cnt_02 = pre_emp_cnt_02;
		this.pre_servcost_02 = pre_servcost_02;
		this.emp_cnt_02 = emp_cnt_02;
		this.servcost_02 = servcost_02;
		this.remk_02 = remk_02;
		this.mode_02 = mode_02;
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

	public void setGridtitle_01(String gridtitle_01){
		this.gridtitle_01 = gridtitle_01;
	}

	public void setGridtitle_02(String gridtitle_02){
		this.gridtitle_02 = gridtitle_02;
	}

	public void setClas_clsf1_01(String clas_clsf1_01){
		this.clas_clsf1_01 = clas_clsf1_01;
	}

	public void setClas_clsf2_01(String clas_clsf2_01){
		this.clas_clsf2_01 = clas_clsf2_01;
	}

	public void setPre_emp_cnt_01(String pre_emp_cnt_01){
		this.pre_emp_cnt_01 = pre_emp_cnt_01;
	}

	public void setPre_servcost_01(String pre_servcost_01){
		this.pre_servcost_01 = pre_servcost_01;
	}

	public void setEmp_cnt_01(String emp_cnt_01){
		this.emp_cnt_01 = emp_cnt_01;
	}

	public void setServcost_01(String servcost_01){
		this.servcost_01 = servcost_01;
	}

	public void setIcdc_amt_01(String icdc_amt_01){
		this.icdc_amt_01 = icdc_amt_01;
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

	public void setMode_01(String mode_01){
		this.mode_01 = mode_01;
	}

	public void setHead_clsf_02_01(String head_clsf_02_01){
		this.head_clsf_02_01 = head_clsf_02_01;
	}

	public void setHead_clsf_02_02(String head_clsf_02_02){
		this.head_clsf_02_02 = head_clsf_02_02;
	}

	public void setClas_clsf1_02(String clas_clsf1_02){
		this.clas_clsf1_02 = clas_clsf1_02;
	}

	public void setClas_clsf2_02(String clas_clsf2_02){
		this.clas_clsf2_02 = clas_clsf2_02;
	}

	public void setPre_emp_cnt_02(String pre_emp_cnt_02){
		this.pre_emp_cnt_02 = pre_emp_cnt_02;
	}

	public void setPre_servcost_02(String pre_servcost_02){
		this.pre_servcost_02 = pre_servcost_02;
	}

	public void setEmp_cnt_02(String emp_cnt_02){
		this.emp_cnt_02 = emp_cnt_02;
	}

	public void setServcost_02(String servcost_02){
		this.servcost_02 = servcost_02;
	}

	public void setRemk_02(String remk_02){
		this.remk_02 = remk_02;
	}

	public void setMode_02(String mode_02){
		this.mode_02 = mode_02;
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

	public String getGridtitle_01(){
		return this.gridtitle_01;
	}

	public String getGridtitle_02(){
		return this.gridtitle_02;
	}

	public String getClas_clsf1_01(){
		return this.clas_clsf1_01;
	}

	public String getClas_clsf2_01(){
		return this.clas_clsf2_01;
	}

	public String getPre_emp_cnt_01(){
		return this.pre_emp_cnt_01;
	}

	public String getPre_servcost_01(){
		return this.pre_servcost_01;
	}

	public String getEmp_cnt_01(){
		return this.emp_cnt_01;
	}

	public String getServcost_01(){
		return this.servcost_01;
	}

	public String getIcdc_amt_01(){
		return this.icdc_amt_01;
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

	public String getMode_01(){
		return this.mode_01;
	}

	public String getHead_clsf_02_01(){
		return this.head_clsf_02_01;
	}

	public String getHead_clsf_02_02(){
		return this.head_clsf_02_02;
	}

	public String getClas_clsf1_02(){
		return this.clas_clsf1_02;
	}

	public String getClas_clsf2_02(){
		return this.clas_clsf2_02;
	}

	public String getPre_emp_cnt_02(){
		return this.pre_emp_cnt_02;
	}

	public String getPre_servcost_02(){
		return this.pre_servcost_02;
	}

	public String getEmp_cnt_02(){
		return this.emp_cnt_02;
	}

	public String getServcost_02(){
		return this.servcost_02;
	}

	public String getRemk_02(){
		return this.remk_02;
	}

	public String getMode_02(){
		return this.mode_02;
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
		 return "{ call MISHDL.SP_HD_SRCH_5332_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SRCH_5332_ADM dm = (HD_SRCH_5332_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.basi_dt);
		cstmt.setString(6, dm.gridtitle_01);
		cstmt.setString(7, dm.gridtitle_02);
		cstmt.setString(8, dm.clas_clsf1_01);
		cstmt.setString(9, dm.clas_clsf2_01);
		cstmt.setString(10, dm.pre_emp_cnt_01);
		cstmt.setString(11, dm.pre_servcost_01);
		cstmt.setString(12, dm.emp_cnt_01);
		cstmt.setString(13, dm.servcost_01);
		cstmt.setString(14, dm.icdc_amt_01);
		cstmt.setString(15, dm.head_clsf_00_01);
		cstmt.setString(16, dm.head_clsf_01_01);
		cstmt.setString(17, dm.head_clsf_01_02);
		cstmt.setString(18, dm.mode_01);
		cstmt.setString(19, dm.head_clsf_02_01);
		cstmt.setString(20, dm.head_clsf_02_02);
		cstmt.setString(21, dm.clas_clsf1_02);
		cstmt.setString(22, dm.clas_clsf2_02);
		cstmt.setString(23, dm.pre_emp_cnt_02);
		cstmt.setString(24, dm.pre_servcost_02);
		cstmt.setString(25, dm.emp_cnt_02);
		cstmt.setString(26, dm.servcost_02);
		cstmt.setString(27, dm.remk_02);
		cstmt.setString(28, dm.mode_02);
		cstmt.setString(29, dm.text_tag);
		cstmt.setString(30, dm.incmg_pers);
		cstmt.setString(31, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.srch.ds.HD_SRCH_5332_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("basi_dt = [" + getBasi_dt() + "]");
		System.out.println("gridtitle_01 = [" + getGridtitle_01() + "]");
		System.out.println("gridtitle_02 = [" + getGridtitle_02() + "]");
		System.out.println("clas_clsf1_01 = [" + getClas_clsf1_01() + "]");
		System.out.println("clas_clsf2_01 = [" + getClas_clsf2_01() + "]");
		System.out.println("pre_emp_cnt_01 = [" + getPre_emp_cnt_01() + "]");
		System.out.println("pre_servcost_01 = [" + getPre_servcost_01() + "]");
		System.out.println("emp_cnt_01 = [" + getEmp_cnt_01() + "]");
		System.out.println("servcost_01 = [" + getServcost_01() + "]");
		System.out.println("icdc_amt_01 = [" + getIcdc_amt_01() + "]");
		System.out.println("head_clsf_00_01 = [" + getHead_clsf_00_01() + "]");
		System.out.println("head_clsf_01_01 = [" + getHead_clsf_01_01() + "]");
		System.out.println("head_clsf_01_02 = [" + getHead_clsf_01_02() + "]");
		System.out.println("mode_01 = [" + getMode_01() + "]");
		System.out.println("head_clsf_02_01 = [" + getHead_clsf_02_01() + "]");
		System.out.println("head_clsf_02_02 = [" + getHead_clsf_02_02() + "]");
		System.out.println("clas_clsf1_02 = [" + getClas_clsf1_02() + "]");
		System.out.println("clas_clsf2_02 = [" + getClas_clsf2_02() + "]");
		System.out.println("pre_emp_cnt_02 = [" + getPre_emp_cnt_02() + "]");
		System.out.println("pre_servcost_02 = [" + getPre_servcost_02() + "]");
		System.out.println("emp_cnt_02 = [" + getEmp_cnt_02() + "]");
		System.out.println("servcost_02 = [" + getServcost_02() + "]");
		System.out.println("remk_02 = [" + getRemk_02() + "]");
		System.out.println("mode_02 = [" + getMode_02() + "]");
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
String gridtitle_01 = req.getParameter("gridtitle_01");
if( gridtitle_01 == null){
	System.out.println(this.toString+" : gridtitle_01 is null" );
}else{
	System.out.println(this.toString+" : gridtitle_01 is "+gridtitle_01 );
}
String gridtitle_02 = req.getParameter("gridtitle_02");
if( gridtitle_02 == null){
	System.out.println(this.toString+" : gridtitle_02 is null" );
}else{
	System.out.println(this.toString+" : gridtitle_02 is "+gridtitle_02 );
}
String clas_clsf1_01 = req.getParameter("clas_clsf1_01");
if( clas_clsf1_01 == null){
	System.out.println(this.toString+" : clas_clsf1_01 is null" );
}else{
	System.out.println(this.toString+" : clas_clsf1_01 is "+clas_clsf1_01 );
}
String clas_clsf2_01 = req.getParameter("clas_clsf2_01");
if( clas_clsf2_01 == null){
	System.out.println(this.toString+" : clas_clsf2_01 is null" );
}else{
	System.out.println(this.toString+" : clas_clsf2_01 is "+clas_clsf2_01 );
}
String pre_emp_cnt_01 = req.getParameter("pre_emp_cnt_01");
if( pre_emp_cnt_01 == null){
	System.out.println(this.toString+" : pre_emp_cnt_01 is null" );
}else{
	System.out.println(this.toString+" : pre_emp_cnt_01 is "+pre_emp_cnt_01 );
}
String pre_servcost_01 = req.getParameter("pre_servcost_01");
if( pre_servcost_01 == null){
	System.out.println(this.toString+" : pre_servcost_01 is null" );
}else{
	System.out.println(this.toString+" : pre_servcost_01 is "+pre_servcost_01 );
}
String emp_cnt_01 = req.getParameter("emp_cnt_01");
if( emp_cnt_01 == null){
	System.out.println(this.toString+" : emp_cnt_01 is null" );
}else{
	System.out.println(this.toString+" : emp_cnt_01 is "+emp_cnt_01 );
}
String servcost_01 = req.getParameter("servcost_01");
if( servcost_01 == null){
	System.out.println(this.toString+" : servcost_01 is null" );
}else{
	System.out.println(this.toString+" : servcost_01 is "+servcost_01 );
}
String icdc_amt_01 = req.getParameter("icdc_amt_01");
if( icdc_amt_01 == null){
	System.out.println(this.toString+" : icdc_amt_01 is null" );
}else{
	System.out.println(this.toString+" : icdc_amt_01 is "+icdc_amt_01 );
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
String mode_01 = req.getParameter("mode_01");
if( mode_01 == null){
	System.out.println(this.toString+" : mode_01 is null" );
}else{
	System.out.println(this.toString+" : mode_01 is "+mode_01 );
}
String head_clsf_02_01 = req.getParameter("head_clsf_02_01");
if( head_clsf_02_01 == null){
	System.out.println(this.toString+" : head_clsf_02_01 is null" );
}else{
	System.out.println(this.toString+" : head_clsf_02_01 is "+head_clsf_02_01 );
}
String head_clsf_02_02 = req.getParameter("head_clsf_02_02");
if( head_clsf_02_02 == null){
	System.out.println(this.toString+" : head_clsf_02_02 is null" );
}else{
	System.out.println(this.toString+" : head_clsf_02_02 is "+head_clsf_02_02 );
}
String clas_clsf1_02 = req.getParameter("clas_clsf1_02");
if( clas_clsf1_02 == null){
	System.out.println(this.toString+" : clas_clsf1_02 is null" );
}else{
	System.out.println(this.toString+" : clas_clsf1_02 is "+clas_clsf1_02 );
}
String clas_clsf2_02 = req.getParameter("clas_clsf2_02");
if( clas_clsf2_02 == null){
	System.out.println(this.toString+" : clas_clsf2_02 is null" );
}else{
	System.out.println(this.toString+" : clas_clsf2_02 is "+clas_clsf2_02 );
}
String pre_emp_cnt_02 = req.getParameter("pre_emp_cnt_02");
if( pre_emp_cnt_02 == null){
	System.out.println(this.toString+" : pre_emp_cnt_02 is null" );
}else{
	System.out.println(this.toString+" : pre_emp_cnt_02 is "+pre_emp_cnt_02 );
}
String pre_servcost_02 = req.getParameter("pre_servcost_02");
if( pre_servcost_02 == null){
	System.out.println(this.toString+" : pre_servcost_02 is null" );
}else{
	System.out.println(this.toString+" : pre_servcost_02 is "+pre_servcost_02 );
}
String emp_cnt_02 = req.getParameter("emp_cnt_02");
if( emp_cnt_02 == null){
	System.out.println(this.toString+" : emp_cnt_02 is null" );
}else{
	System.out.println(this.toString+" : emp_cnt_02 is "+emp_cnt_02 );
}
String servcost_02 = req.getParameter("servcost_02");
if( servcost_02 == null){
	System.out.println(this.toString+" : servcost_02 is null" );
}else{
	System.out.println(this.toString+" : servcost_02 is "+servcost_02 );
}
String remk_02 = req.getParameter("remk_02");
if( remk_02 == null){
	System.out.println(this.toString+" : remk_02 is null" );
}else{
	System.out.println(this.toString+" : remk_02 is "+remk_02 );
}
String mode_02 = req.getParameter("mode_02");
if( mode_02 == null){
	System.out.println(this.toString+" : mode_02 is null" );
}else{
	System.out.println(this.toString+" : mode_02 is "+mode_02 );
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
String gridtitle_01 = Util.checkString(req.getParameter("gridtitle_01"));
String gridtitle_02 = Util.checkString(req.getParameter("gridtitle_02"));
String clas_clsf1_01 = Util.checkString(req.getParameter("clas_clsf1_01"));
String clas_clsf2_01 = Util.checkString(req.getParameter("clas_clsf2_01"));
String pre_emp_cnt_01 = Util.checkString(req.getParameter("pre_emp_cnt_01"));
String pre_servcost_01 = Util.checkString(req.getParameter("pre_servcost_01"));
String emp_cnt_01 = Util.checkString(req.getParameter("emp_cnt_01"));
String servcost_01 = Util.checkString(req.getParameter("servcost_01"));
String icdc_amt_01 = Util.checkString(req.getParameter("icdc_amt_01"));
String head_clsf_00_01 = Util.checkString(req.getParameter("head_clsf_00_01"));
String head_clsf_01_01 = Util.checkString(req.getParameter("head_clsf_01_01"));
String head_clsf_01_02 = Util.checkString(req.getParameter("head_clsf_01_02"));
String mode_01 = Util.checkString(req.getParameter("mode_01"));
String head_clsf_02_01 = Util.checkString(req.getParameter("head_clsf_02_01"));
String head_clsf_02_02 = Util.checkString(req.getParameter("head_clsf_02_02"));
String clas_clsf1_02 = Util.checkString(req.getParameter("clas_clsf1_02"));
String clas_clsf2_02 = Util.checkString(req.getParameter("clas_clsf2_02"));
String pre_emp_cnt_02 = Util.checkString(req.getParameter("pre_emp_cnt_02"));
String pre_servcost_02 = Util.checkString(req.getParameter("pre_servcost_02"));
String emp_cnt_02 = Util.checkString(req.getParameter("emp_cnt_02"));
String servcost_02 = Util.checkString(req.getParameter("servcost_02"));
String remk_02 = Util.checkString(req.getParameter("remk_02"));
String mode_02 = Util.checkString(req.getParameter("mode_02"));
String text_tag = Util.checkString(req.getParameter("text_tag"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_dt")));
String gridtitle_01 = Util.Uni2Ksc(Util.checkString(req.getParameter("gridtitle_01")));
String gridtitle_02 = Util.Uni2Ksc(Util.checkString(req.getParameter("gridtitle_02")));
String clas_clsf1_01 = Util.Uni2Ksc(Util.checkString(req.getParameter("clas_clsf1_01")));
String clas_clsf2_01 = Util.Uni2Ksc(Util.checkString(req.getParameter("clas_clsf2_01")));
String pre_emp_cnt_01 = Util.Uni2Ksc(Util.checkString(req.getParameter("pre_emp_cnt_01")));
String pre_servcost_01 = Util.Uni2Ksc(Util.checkString(req.getParameter("pre_servcost_01")));
String emp_cnt_01 = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_cnt_01")));
String servcost_01 = Util.Uni2Ksc(Util.checkString(req.getParameter("servcost_01")));
String icdc_amt_01 = Util.Uni2Ksc(Util.checkString(req.getParameter("icdc_amt_01")));
String head_clsf_00_01 = Util.Uni2Ksc(Util.checkString(req.getParameter("head_clsf_00_01")));
String head_clsf_01_01 = Util.Uni2Ksc(Util.checkString(req.getParameter("head_clsf_01_01")));
String head_clsf_01_02 = Util.Uni2Ksc(Util.checkString(req.getParameter("head_clsf_01_02")));
String mode_01 = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_01")));
String head_clsf_02_01 = Util.Uni2Ksc(Util.checkString(req.getParameter("head_clsf_02_01")));
String head_clsf_02_02 = Util.Uni2Ksc(Util.checkString(req.getParameter("head_clsf_02_02")));
String clas_clsf1_02 = Util.Uni2Ksc(Util.checkString(req.getParameter("clas_clsf1_02")));
String clas_clsf2_02 = Util.Uni2Ksc(Util.checkString(req.getParameter("clas_clsf2_02")));
String pre_emp_cnt_02 = Util.Uni2Ksc(Util.checkString(req.getParameter("pre_emp_cnt_02")));
String pre_servcost_02 = Util.Uni2Ksc(Util.checkString(req.getParameter("pre_servcost_02")));
String emp_cnt_02 = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_cnt_02")));
String servcost_02 = Util.Uni2Ksc(Util.checkString(req.getParameter("servcost_02")));
String remk_02 = Util.Uni2Ksc(Util.checkString(req.getParameter("remk_02")));
String mode_02 = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_02")));
String text_tag = Util.Uni2Ksc(Util.checkString(req.getParameter("text_tag")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBasi_dt(basi_dt);
dm.setGridtitle_01(gridtitle_01);
dm.setGridtitle_02(gridtitle_02);
dm.setClas_clsf1_01(clas_clsf1_01);
dm.setClas_clsf2_01(clas_clsf2_01);
dm.setPre_emp_cnt_01(pre_emp_cnt_01);
dm.setPre_servcost_01(pre_servcost_01);
dm.setEmp_cnt_01(emp_cnt_01);
dm.setServcost_01(servcost_01);
dm.setIcdc_amt_01(icdc_amt_01);
dm.setHead_clsf_00_01(head_clsf_00_01);
dm.setHead_clsf_01_01(head_clsf_01_01);
dm.setHead_clsf_01_02(head_clsf_01_02);
dm.setMode_01(mode_01);
dm.setHead_clsf_02_01(head_clsf_02_01);
dm.setHead_clsf_02_02(head_clsf_02_02);
dm.setClas_clsf1_02(clas_clsf1_02);
dm.setClas_clsf2_02(clas_clsf2_02);
dm.setPre_emp_cnt_02(pre_emp_cnt_02);
dm.setPre_servcost_02(pre_servcost_02);
dm.setEmp_cnt_02(emp_cnt_02);
dm.setServcost_02(servcost_02);
dm.setRemk_02(remk_02);
dm.setMode_02(mode_02);
dm.setText_tag(text_tag);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Nov 26 14:06:04 KST 2018 */