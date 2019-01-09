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


public class HD_SRCH_5222_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String basi_dt;
	public String gridtitle;
	public String emp_clsf_nm;
	public String dept_nm;
	public String flnm;
	public String posi_nm;
	public String dspch_prd;
	public String remk;
	public String mode;
	public String incmg_pers;
	public String chg_pers;
	public String head_clsf_00_01;
	public String head_clsf_01_01;
	public String head_clsf_01_02;
	public String text_tag;

	public HD_SRCH_5222_ADM(){}
	public HD_SRCH_5222_ADM(String cmpy_cd, String basi_dt, String gridtitle, String emp_clsf_nm, String dept_nm, String flnm, String posi_nm, String dspch_prd, String remk, String mode, String incmg_pers, String chg_pers, String head_clsf_00_01, String head_clsf_01_01, String head_clsf_01_02, String text_tag){
		this.cmpy_cd = cmpy_cd;
		this.basi_dt = basi_dt;
		this.gridtitle = gridtitle;
		this.emp_clsf_nm = emp_clsf_nm;
		this.dept_nm = dept_nm;
		this.flnm = flnm;
		this.posi_nm = posi_nm;
		this.dspch_prd = dspch_prd;
		this.remk = remk;
		this.mode = mode;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
		this.head_clsf_00_01 = head_clsf_00_01;
		this.head_clsf_01_01 = head_clsf_01_01;
		this.head_clsf_01_02 = head_clsf_01_02;
		this.text_tag = text_tag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setGridtitle(String gridtitle){
		this.gridtitle = gridtitle;
	}

	public void setEmp_clsf_nm(String emp_clsf_nm){
		this.emp_clsf_nm = emp_clsf_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setDspch_prd(String dspch_prd){
		this.dspch_prd = dspch_prd;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
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

	public void setText_tag(String text_tag){
		this.text_tag = text_tag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getGridtitle(){
		return this.gridtitle;
	}

	public String getEmp_clsf_nm(){
		return this.emp_clsf_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getDspch_prd(){
		return this.dspch_prd;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getMode(){
		return this.mode;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
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

	public String getText_tag(){
		return this.text_tag;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SRCH_5222_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SRCH_5222_ADM dm = (HD_SRCH_5222_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.basi_dt);
		cstmt.setString(6, dm.gridtitle);
		cstmt.setString(7, dm.emp_clsf_nm);
		cstmt.setString(8, dm.dept_nm);
		cstmt.setString(9, dm.flnm);
		cstmt.setString(10, dm.posi_nm);
		cstmt.setString(11, dm.dspch_prd);
		cstmt.setString(12, dm.remk);
		cstmt.setString(13, dm.mode);
		cstmt.setString(14, dm.incmg_pers);
		cstmt.setString(15, dm.chg_pers);
		cstmt.setString(16, dm.head_clsf_00_01);
		cstmt.setString(17, dm.head_clsf_01_01);
		cstmt.setString(18, dm.head_clsf_01_02);
		cstmt.setString(19, dm.text_tag);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.srch.ds.HD_SRCH_5222_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("basi_dt = [" + getBasi_dt() + "]");
		System.out.println("gridtitle = [" + getGridtitle() + "]");
		System.out.println("emp_clsf_nm = [" + getEmp_clsf_nm() + "]");
		System.out.println("dept_nm = [" + getDept_nm() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("posi_nm = [" + getPosi_nm() + "]");
		System.out.println("dspch_prd = [" + getDspch_prd() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("head_clsf_00_01 = [" + getHead_clsf_00_01() + "]");
		System.out.println("head_clsf_01_01 = [" + getHead_clsf_01_01() + "]");
		System.out.println("head_clsf_01_02 = [" + getHead_clsf_01_02() + "]");
		System.out.println("text_tag = [" + getText_tag() + "]");
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
String gridtitle = req.getParameter("gridtitle");
if( gridtitle == null){
	System.out.println(this.toString+" : gridtitle is null" );
}else{
	System.out.println(this.toString+" : gridtitle is "+gridtitle );
}
String emp_clsf_nm = req.getParameter("emp_clsf_nm");
if( emp_clsf_nm == null){
	System.out.println(this.toString+" : emp_clsf_nm is null" );
}else{
	System.out.println(this.toString+" : emp_clsf_nm is "+emp_clsf_nm );
}
String dept_nm = req.getParameter("dept_nm");
if( dept_nm == null){
	System.out.println(this.toString+" : dept_nm is null" );
}else{
	System.out.println(this.toString+" : dept_nm is "+dept_nm );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String posi_nm = req.getParameter("posi_nm");
if( posi_nm == null){
	System.out.println(this.toString+" : posi_nm is null" );
}else{
	System.out.println(this.toString+" : posi_nm is "+posi_nm );
}
String dspch_prd = req.getParameter("dspch_prd");
if( dspch_prd == null){
	System.out.println(this.toString+" : dspch_prd is null" );
}else{
	System.out.println(this.toString+" : dspch_prd is "+dspch_prd );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
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
String text_tag = req.getParameter("text_tag");
if( text_tag == null){
	System.out.println(this.toString+" : text_tag is null" );
}else{
	System.out.println(this.toString+" : text_tag is "+text_tag );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String basi_dt = Util.checkString(req.getParameter("basi_dt"));
String gridtitle = Util.checkString(req.getParameter("gridtitle"));
String emp_clsf_nm = Util.checkString(req.getParameter("emp_clsf_nm"));
String dept_nm = Util.checkString(req.getParameter("dept_nm"));
String flnm = Util.checkString(req.getParameter("flnm"));
String posi_nm = Util.checkString(req.getParameter("posi_nm"));
String dspch_prd = Util.checkString(req.getParameter("dspch_prd"));
String remk = Util.checkString(req.getParameter("remk"));
String mode = Util.checkString(req.getParameter("mode"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String head_clsf_00_01 = Util.checkString(req.getParameter("head_clsf_00_01"));
String head_clsf_01_01 = Util.checkString(req.getParameter("head_clsf_01_01"));
String head_clsf_01_02 = Util.checkString(req.getParameter("head_clsf_01_02"));
String text_tag = Util.checkString(req.getParameter("text_tag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_dt")));
String gridtitle = Util.Uni2Ksc(Util.checkString(req.getParameter("gridtitle")));
String emp_clsf_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf_nm")));
String dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nm")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String posi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_nm")));
String dspch_prd = Util.Uni2Ksc(Util.checkString(req.getParameter("dspch_prd")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String head_clsf_00_01 = Util.Uni2Ksc(Util.checkString(req.getParameter("head_clsf_00_01")));
String head_clsf_01_01 = Util.Uni2Ksc(Util.checkString(req.getParameter("head_clsf_01_01")));
String head_clsf_01_02 = Util.Uni2Ksc(Util.checkString(req.getParameter("head_clsf_01_02")));
String text_tag = Util.Uni2Ksc(Util.checkString(req.getParameter("text_tag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBasi_dt(basi_dt);
dm.setGridtitle(gridtitle);
dm.setEmp_clsf_nm(emp_clsf_nm);
dm.setDept_nm(dept_nm);
dm.setFlnm(flnm);
dm.setPosi_nm(posi_nm);
dm.setDspch_prd(dspch_prd);
dm.setRemk(remk);
dm.setMode(mode);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setHead_clsf_00_01(head_clsf_00_01);
dm.setHead_clsf_01_01(head_clsf_01_01);
dm.setHead_clsf_01_02(head_clsf_01_02);
dm.setText_tag(text_tag);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Nov 15 15:23:13 KST 2018 */