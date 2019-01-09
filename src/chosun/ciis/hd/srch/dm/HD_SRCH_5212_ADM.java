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


public class HD_SRCH_5212_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String basi_dt;
	public String gridtitle;
	public String gridtitle2;
	public String addm_dept_nm;
	public String dept_nm;
	public String flnm;
	public String dspch_prd;
	public String remk;
	public String head_clsf_00_01;
	public String head_clsf_01_01;
	public String head_clsf_01_02;
	public String mode1;
	public String head_clsf_02_01;
	public String head_clsf_02_02;
	public String dept_nm2;
	public String posi_nm2;
	public String flnm2;
	public String dspch_prd2;
	public String mode2;
	public String text_tag;
	public String incmg_pers;
	public String chg_pers;

	public HD_SRCH_5212_ADM(){}
	public HD_SRCH_5212_ADM(String cmpy_cd, String basi_dt, String gridtitle, String gridtitle2, String addm_dept_nm, String dept_nm, String flnm, String dspch_prd, String remk, String head_clsf_00_01, String head_clsf_01_01, String head_clsf_01_02, String mode1, String head_clsf_02_01, String head_clsf_02_02, String dept_nm2, String posi_nm2, String flnm2, String dspch_prd2, String mode2, String text_tag, String incmg_pers, String chg_pers){
		this.cmpy_cd = cmpy_cd;
		this.basi_dt = basi_dt;
		this.gridtitle = gridtitle;
		this.gridtitle2 = gridtitle2;
		this.addm_dept_nm = addm_dept_nm;
		this.dept_nm = dept_nm;
		this.flnm = flnm;
		this.dspch_prd = dspch_prd;
		this.remk = remk;
		this.head_clsf_00_01 = head_clsf_00_01;
		this.head_clsf_01_01 = head_clsf_01_01;
		this.head_clsf_01_02 = head_clsf_01_02;
		this.mode1 = mode1;
		this.head_clsf_02_01 = head_clsf_02_01;
		this.head_clsf_02_02 = head_clsf_02_02;
		this.dept_nm2 = dept_nm2;
		this.posi_nm2 = posi_nm2;
		this.flnm2 = flnm2;
		this.dspch_prd2 = dspch_prd2;
		this.mode2 = mode2;
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

	public void setGridtitle(String gridtitle){
		this.gridtitle = gridtitle;
	}

	public void setGridtitle2(String gridtitle2){
		this.gridtitle2 = gridtitle2;
	}

	public void setAddm_dept_nm(String addm_dept_nm){
		this.addm_dept_nm = addm_dept_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDspch_prd(String dspch_prd){
		this.dspch_prd = dspch_prd;
	}

	public void setRemk(String remk){
		this.remk = remk;
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

	public void setMode1(String mode1){
		this.mode1 = mode1;
	}

	public void setHead_clsf_02_01(String head_clsf_02_01){
		this.head_clsf_02_01 = head_clsf_02_01;
	}

	public void setHead_clsf_02_02(String head_clsf_02_02){
		this.head_clsf_02_02 = head_clsf_02_02;
	}

	public void setDept_nm2(String dept_nm2){
		this.dept_nm2 = dept_nm2;
	}

	public void setPosi_nm2(String posi_nm2){
		this.posi_nm2 = posi_nm2;
	}

	public void setFlnm2(String flnm2){
		this.flnm2 = flnm2;
	}

	public void setDspch_prd2(String dspch_prd2){
		this.dspch_prd2 = dspch_prd2;
	}

	public void setMode2(String mode2){
		this.mode2 = mode2;
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

	public String getGridtitle(){
		return this.gridtitle;
	}

	public String getGridtitle2(){
		return this.gridtitle2;
	}

	public String getAddm_dept_nm(){
		return this.addm_dept_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDspch_prd(){
		return this.dspch_prd;
	}

	public String getRemk(){
		return this.remk;
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

	public String getMode1(){
		return this.mode1;
	}

	public String getHead_clsf_02_01(){
		return this.head_clsf_02_01;
	}

	public String getHead_clsf_02_02(){
		return this.head_clsf_02_02;
	}

	public String getDept_nm2(){
		return this.dept_nm2;
	}

	public String getPosi_nm2(){
		return this.posi_nm2;
	}

	public String getFlnm2(){
		return this.flnm2;
	}

	public String getDspch_prd2(){
		return this.dspch_prd2;
	}

	public String getMode2(){
		return this.mode2;
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
		 return "{ call MISHDL.SP_HD_SRCH_5212_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SRCH_5212_ADM dm = (HD_SRCH_5212_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.basi_dt);
		cstmt.setString(6, dm.gridtitle);
		cstmt.setString(7, dm.gridtitle2);
		cstmt.setString(8, dm.addm_dept_nm);
		cstmt.setString(9, dm.dept_nm);
		cstmt.setString(10, dm.flnm);
		cstmt.setString(11, dm.dspch_prd);
		cstmt.setString(12, dm.remk);
		cstmt.setString(13, dm.head_clsf_00_01);
		cstmt.setString(14, dm.head_clsf_01_01);
		cstmt.setString(15, dm.head_clsf_01_02);
		cstmt.setString(16, dm.mode1);
		cstmt.setString(17, dm.head_clsf_02_01);
		cstmt.setString(18, dm.head_clsf_02_02);
		cstmt.setString(19, dm.dept_nm2);
		cstmt.setString(20, dm.posi_nm2);
		cstmt.setString(21, dm.flnm2);
		cstmt.setString(22, dm.dspch_prd2);
		cstmt.setString(23, dm.mode2);
		cstmt.setString(24, dm.text_tag);
		cstmt.setString(25, dm.incmg_pers);
		cstmt.setString(26, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.srch.ds.HD_SRCH_5212_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("basi_dt = [" + getBasi_dt() + "]");
		System.out.println("gridtitle = [" + getGridtitle() + "]");
		System.out.println("gridtitle2 = [" + getGridtitle2() + "]");
		System.out.println("addm_dept_nm = [" + getAddm_dept_nm() + "]");
		System.out.println("dept_nm = [" + getDept_nm() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("dspch_prd = [" + getDspch_prd() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("head_clsf_00_01 = [" + getHead_clsf_00_01() + "]");
		System.out.println("head_clsf_01_01 = [" + getHead_clsf_01_01() + "]");
		System.out.println("head_clsf_01_02 = [" + getHead_clsf_01_02() + "]");
		System.out.println("mode1 = [" + getMode1() + "]");
		System.out.println("head_clsf_02_01 = [" + getHead_clsf_02_01() + "]");
		System.out.println("head_clsf_02_02 = [" + getHead_clsf_02_02() + "]");
		System.out.println("dept_nm2 = [" + getDept_nm2() + "]");
		System.out.println("posi_nm2 = [" + getPosi_nm2() + "]");
		System.out.println("flnm2 = [" + getFlnm2() + "]");
		System.out.println("dspch_prd2 = [" + getDspch_prd2() + "]");
		System.out.println("mode2 = [" + getMode2() + "]");
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
String gridtitle = req.getParameter("gridtitle");
if( gridtitle == null){
	System.out.println(this.toString+" : gridtitle is null" );
}else{
	System.out.println(this.toString+" : gridtitle is "+gridtitle );
}
String gridtitle2 = req.getParameter("gridtitle2");
if( gridtitle2 == null){
	System.out.println(this.toString+" : gridtitle2 is null" );
}else{
	System.out.println(this.toString+" : gridtitle2 is "+gridtitle2 );
}
String addm_dept_nm = req.getParameter("addm_dept_nm");
if( addm_dept_nm == null){
	System.out.println(this.toString+" : addm_dept_nm is null" );
}else{
	System.out.println(this.toString+" : addm_dept_nm is "+addm_dept_nm );
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
String mode1 = req.getParameter("mode1");
if( mode1 == null){
	System.out.println(this.toString+" : mode1 is null" );
}else{
	System.out.println(this.toString+" : mode1 is "+mode1 );
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
String dept_nm2 = req.getParameter("dept_nm2");
if( dept_nm2 == null){
	System.out.println(this.toString+" : dept_nm2 is null" );
}else{
	System.out.println(this.toString+" : dept_nm2 is "+dept_nm2 );
}
String posi_nm2 = req.getParameter("posi_nm2");
if( posi_nm2 == null){
	System.out.println(this.toString+" : posi_nm2 is null" );
}else{
	System.out.println(this.toString+" : posi_nm2 is "+posi_nm2 );
}
String flnm2 = req.getParameter("flnm2");
if( flnm2 == null){
	System.out.println(this.toString+" : flnm2 is null" );
}else{
	System.out.println(this.toString+" : flnm2 is "+flnm2 );
}
String dspch_prd2 = req.getParameter("dspch_prd2");
if( dspch_prd2 == null){
	System.out.println(this.toString+" : dspch_prd2 is null" );
}else{
	System.out.println(this.toString+" : dspch_prd2 is "+dspch_prd2 );
}
String mode2 = req.getParameter("mode2");
if( mode2 == null){
	System.out.println(this.toString+" : mode2 is null" );
}else{
	System.out.println(this.toString+" : mode2 is "+mode2 );
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
String gridtitle = Util.checkString(req.getParameter("gridtitle"));
String gridtitle2 = Util.checkString(req.getParameter("gridtitle2"));
String addm_dept_nm = Util.checkString(req.getParameter("addm_dept_nm"));
String dept_nm = Util.checkString(req.getParameter("dept_nm"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dspch_prd = Util.checkString(req.getParameter("dspch_prd"));
String remk = Util.checkString(req.getParameter("remk"));
String head_clsf_00_01 = Util.checkString(req.getParameter("head_clsf_00_01"));
String head_clsf_01_01 = Util.checkString(req.getParameter("head_clsf_01_01"));
String head_clsf_01_02 = Util.checkString(req.getParameter("head_clsf_01_02"));
String mode1 = Util.checkString(req.getParameter("mode1"));
String head_clsf_02_01 = Util.checkString(req.getParameter("head_clsf_02_01"));
String head_clsf_02_02 = Util.checkString(req.getParameter("head_clsf_02_02"));
String dept_nm2 = Util.checkString(req.getParameter("dept_nm2"));
String posi_nm2 = Util.checkString(req.getParameter("posi_nm2"));
String flnm2 = Util.checkString(req.getParameter("flnm2"));
String dspch_prd2 = Util.checkString(req.getParameter("dspch_prd2"));
String mode2 = Util.checkString(req.getParameter("mode2"));
String text_tag = Util.checkString(req.getParameter("text_tag"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_dt")));
String gridtitle = Util.Uni2Ksc(Util.checkString(req.getParameter("gridtitle")));
String gridtitle2 = Util.Uni2Ksc(Util.checkString(req.getParameter("gridtitle2")));
String addm_dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("addm_dept_nm")));
String dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nm")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dspch_prd = Util.Uni2Ksc(Util.checkString(req.getParameter("dspch_prd")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String head_clsf_00_01 = Util.Uni2Ksc(Util.checkString(req.getParameter("head_clsf_00_01")));
String head_clsf_01_01 = Util.Uni2Ksc(Util.checkString(req.getParameter("head_clsf_01_01")));
String head_clsf_01_02 = Util.Uni2Ksc(Util.checkString(req.getParameter("head_clsf_01_02")));
String mode1 = Util.Uni2Ksc(Util.checkString(req.getParameter("mode1")));
String head_clsf_02_01 = Util.Uni2Ksc(Util.checkString(req.getParameter("head_clsf_02_01")));
String head_clsf_02_02 = Util.Uni2Ksc(Util.checkString(req.getParameter("head_clsf_02_02")));
String dept_nm2 = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nm2")));
String posi_nm2 = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_nm2")));
String flnm2 = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm2")));
String dspch_prd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("dspch_prd2")));
String mode2 = Util.Uni2Ksc(Util.checkString(req.getParameter("mode2")));
String text_tag = Util.Uni2Ksc(Util.checkString(req.getParameter("text_tag")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBasi_dt(basi_dt);
dm.setGridtitle(gridtitle);
dm.setGridtitle2(gridtitle2);
dm.setAddm_dept_nm(addm_dept_nm);
dm.setDept_nm(dept_nm);
dm.setFlnm(flnm);
dm.setDspch_prd(dspch_prd);
dm.setRemk(remk);
dm.setHead_clsf_00_01(head_clsf_00_01);
dm.setHead_clsf_01_01(head_clsf_01_01);
dm.setHead_clsf_01_02(head_clsf_01_02);
dm.setMode1(mode1);
dm.setHead_clsf_02_01(head_clsf_02_01);
dm.setHead_clsf_02_02(head_clsf_02_02);
dm.setDept_nm2(dept_nm2);
dm.setPosi_nm2(posi_nm2);
dm.setFlnm2(flnm2);
dm.setDspch_prd2(dspch_prd2);
dm.setMode2(mode2);
dm.setText_tag(text_tag);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Nov 15 15:00:08 KST 2018 */