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


public class HD_SRCH_5412_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String basi_dt;
	public String head_clsf_00_01;
	public String head_clsf_01_01;
	public String head_clsf_01_02;
	public String gridtitle;
	public String clas_clsf1;
	public String clas_clsf2;
	public String prv_mm_amt;
	public String base_mm_amt;
	public String prvmm_cmpr;
	public String icdc_amt;
	public String remk;
	public String mode;
	public String text_tag;
	public String incmg_pers;
	public String chg_pers;

	public HD_SRCH_5412_ADM(){}
	public HD_SRCH_5412_ADM(String cmpy_cd, String basi_dt, String head_clsf_00_01, String head_clsf_01_01, String head_clsf_01_02, String gridtitle, String clas_clsf1, String clas_clsf2, String prv_mm_amt, String base_mm_amt, String prvmm_cmpr, String icdc_amt, String remk, String mode, String text_tag, String incmg_pers, String chg_pers){
		this.cmpy_cd = cmpy_cd;
		this.basi_dt = basi_dt;
		this.head_clsf_00_01 = head_clsf_00_01;
		this.head_clsf_01_01 = head_clsf_01_01;
		this.head_clsf_01_02 = head_clsf_01_02;
		this.gridtitle = gridtitle;
		this.clas_clsf1 = clas_clsf1;
		this.clas_clsf2 = clas_clsf2;
		this.prv_mm_amt = prv_mm_amt;
		this.base_mm_amt = base_mm_amt;
		this.prvmm_cmpr = prvmm_cmpr;
		this.icdc_amt = icdc_amt;
		this.remk = remk;
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

	public void setClas_clsf1(String clas_clsf1){
		this.clas_clsf1 = clas_clsf1;
	}

	public void setClas_clsf2(String clas_clsf2){
		this.clas_clsf2 = clas_clsf2;
	}

	public void setPrv_mm_amt(String prv_mm_amt){
		this.prv_mm_amt = prv_mm_amt;
	}

	public void setBase_mm_amt(String base_mm_amt){
		this.base_mm_amt = base_mm_amt;
	}

	public void setPrvmm_cmpr(String prvmm_cmpr){
		this.prvmm_cmpr = prvmm_cmpr;
	}

	public void setIcdc_amt(String icdc_amt){
		this.icdc_amt = icdc_amt;
	}

	public void setRemk(String remk){
		this.remk = remk;
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

	public String getClas_clsf1(){
		return this.clas_clsf1;
	}

	public String getClas_clsf2(){
		return this.clas_clsf2;
	}

	public String getPrv_mm_amt(){
		return this.prv_mm_amt;
	}

	public String getBase_mm_amt(){
		return this.base_mm_amt;
	}

	public String getPrvmm_cmpr(){
		return this.prvmm_cmpr;
	}

	public String getIcdc_amt(){
		return this.icdc_amt;
	}

	public String getRemk(){
		return this.remk;
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
		 return "{ call MISHDL.SP_HD_SRCH_5412_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SRCH_5412_ADM dm = (HD_SRCH_5412_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.basi_dt);
		cstmt.setString(6, dm.head_clsf_00_01);
		cstmt.setString(7, dm.head_clsf_01_01);
		cstmt.setString(8, dm.head_clsf_01_02);
		cstmt.setString(9, dm.gridtitle);
		cstmt.setString(10, dm.clas_clsf1);
		cstmt.setString(11, dm.clas_clsf2);
		cstmt.setString(12, dm.prv_mm_amt);
		cstmt.setString(13, dm.base_mm_amt);
		cstmt.setString(14, dm.prvmm_cmpr);
		cstmt.setString(15, dm.icdc_amt);
		cstmt.setString(16, dm.remk);
		cstmt.setString(17, dm.mode);
		cstmt.setString(18, dm.text_tag);
		cstmt.setString(19, dm.incmg_pers);
		cstmt.setString(20, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.srch.ds.HD_SRCH_5412_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("basi_dt = [" + getBasi_dt() + "]");
		System.out.println("head_clsf_00_01 = [" + getHead_clsf_00_01() + "]");
		System.out.println("head_clsf_01_01 = [" + getHead_clsf_01_01() + "]");
		System.out.println("head_clsf_01_02 = [" + getHead_clsf_01_02() + "]");
		System.out.println("gridtitle = [" + getGridtitle() + "]");
		System.out.println("clas_clsf1 = [" + getClas_clsf1() + "]");
		System.out.println("clas_clsf2 = [" + getClas_clsf2() + "]");
		System.out.println("prv_mm_amt = [" + getPrv_mm_amt() + "]");
		System.out.println("base_mm_amt = [" + getBase_mm_amt() + "]");
		System.out.println("prvmm_cmpr = [" + getPrvmm_cmpr() + "]");
		System.out.println("icdc_amt = [" + getIcdc_amt() + "]");
		System.out.println("remk = [" + getRemk() + "]");
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
String clas_clsf1 = req.getParameter("clas_clsf1");
if( clas_clsf1 == null){
	System.out.println(this.toString+" : clas_clsf1 is null" );
}else{
	System.out.println(this.toString+" : clas_clsf1 is "+clas_clsf1 );
}
String clas_clsf2 = req.getParameter("clas_clsf2");
if( clas_clsf2 == null){
	System.out.println(this.toString+" : clas_clsf2 is null" );
}else{
	System.out.println(this.toString+" : clas_clsf2 is "+clas_clsf2 );
}
String prv_mm_amt = req.getParameter("prv_mm_amt");
if( prv_mm_amt == null){
	System.out.println(this.toString+" : prv_mm_amt is null" );
}else{
	System.out.println(this.toString+" : prv_mm_amt is "+prv_mm_amt );
}
String base_mm_amt = req.getParameter("base_mm_amt");
if( base_mm_amt == null){
	System.out.println(this.toString+" : base_mm_amt is null" );
}else{
	System.out.println(this.toString+" : base_mm_amt is "+base_mm_amt );
}
String prvmm_cmpr = req.getParameter("prvmm_cmpr");
if( prvmm_cmpr == null){
	System.out.println(this.toString+" : prvmm_cmpr is null" );
}else{
	System.out.println(this.toString+" : prvmm_cmpr is "+prvmm_cmpr );
}
String icdc_amt = req.getParameter("icdc_amt");
if( icdc_amt == null){
	System.out.println(this.toString+" : icdc_amt is null" );
}else{
	System.out.println(this.toString+" : icdc_amt is "+icdc_amt );
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
String clas_clsf1 = Util.checkString(req.getParameter("clas_clsf1"));
String clas_clsf2 = Util.checkString(req.getParameter("clas_clsf2"));
String prv_mm_amt = Util.checkString(req.getParameter("prv_mm_amt"));
String base_mm_amt = Util.checkString(req.getParameter("base_mm_amt"));
String prvmm_cmpr = Util.checkString(req.getParameter("prvmm_cmpr"));
String icdc_amt = Util.checkString(req.getParameter("icdc_amt"));
String remk = Util.checkString(req.getParameter("remk"));
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
String clas_clsf1 = Util.Uni2Ksc(Util.checkString(req.getParameter("clas_clsf1")));
String clas_clsf2 = Util.Uni2Ksc(Util.checkString(req.getParameter("clas_clsf2")));
String prv_mm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("prv_mm_amt")));
String base_mm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("base_mm_amt")));
String prvmm_cmpr = Util.Uni2Ksc(Util.checkString(req.getParameter("prvmm_cmpr")));
String icdc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("icdc_amt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
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
dm.setClas_clsf1(clas_clsf1);
dm.setClas_clsf2(clas_clsf2);
dm.setPrv_mm_amt(prv_mm_amt);
dm.setBase_mm_amt(base_mm_amt);
dm.setPrvmm_cmpr(prvmm_cmpr);
dm.setIcdc_amt(icdc_amt);
dm.setRemk(remk);
dm.setMode(mode);
dm.setText_tag(text_tag);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Nov 23 19:08:56 KST 2018 */