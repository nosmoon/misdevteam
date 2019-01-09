/***************************************************************************************************
* 파일명 : .java
* 기능 : 예산관리/예산계획관리/예산계획등록
* 작성일자 : 2009-12-17
* 작성자 : 노상현
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
 * 예산관리/예산계획관리/예산계획등록
 */


public class MC_BUDG_2076_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String tag;
	public String jobtag;
	public String budg_yy;
	public String budg_yymm01;
	public String budg_yymm02;
	public String budg_yymm03;
	public String budg_yymm04;
	public String budg_yymm05;
	public String budg_yymm06;
	public String budg_yymm07;
	public String budg_yymm08;
	public String budg_yymm09;
	public String budg_yymm10;
	public String budg_yymm11;
	public String budg_yymm12;
	public String use_dept_cd;
	public String budg_cd;
	public String dept_cd;
	public String evnt_cd;
	public String work_no;
	public String seq;
	public String medi_cd;
	public String dtls_medi_cd;
	public String rmks;
	public String incmg_pers;
	public String chg_pers;
	public String incmg_pers_ipadd;

	public MC_BUDG_2076_IDM(){}
	public MC_BUDG_2076_IDM(String cmpy_cd, String tag, String jobtag, String budg_yy, String budg_yymm01, String budg_yymm02, String budg_yymm03, String budg_yymm04, String budg_yymm05, String budg_yymm06, String budg_yymm07, String budg_yymm08, String budg_yymm09, String budg_yymm10, String budg_yymm11, String budg_yymm12, String use_dept_cd, String budg_cd, String dept_cd, String evnt_cd, String work_no, String seq, String medi_cd, String dtls_medi_cd, String rmks, String incmg_pers, String chg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.tag = tag;
		this.jobtag = jobtag;
		this.budg_yy = budg_yy;
		this.budg_yymm01 = budg_yymm01;
		this.budg_yymm02 = budg_yymm02;
		this.budg_yymm03 = budg_yymm03;
		this.budg_yymm04 = budg_yymm04;
		this.budg_yymm05 = budg_yymm05;
		this.budg_yymm06 = budg_yymm06;
		this.budg_yymm07 = budg_yymm07;
		this.budg_yymm08 = budg_yymm08;
		this.budg_yymm09 = budg_yymm09;
		this.budg_yymm10 = budg_yymm10;
		this.budg_yymm11 = budg_yymm11;
		this.budg_yymm12 = budg_yymm12;
		this.use_dept_cd = use_dept_cd;
		this.budg_cd = budg_cd;
		this.dept_cd = dept_cd;
		this.evnt_cd = evnt_cd;
		this.work_no = work_no;
		this.seq = seq;
		this.medi_cd = medi_cd;
		this.dtls_medi_cd = dtls_medi_cd;
		this.rmks = rmks;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setTag(String tag){
		this.tag = tag;
	}

	public void setJobtag(String jobtag){
		this.jobtag = jobtag;
	}

	public void setBudg_yy(String budg_yy){
		this.budg_yy = budg_yy;
	}

	public void setBudg_yymm01(String budg_yymm01){
		this.budg_yymm01 = budg_yymm01;
	}

	public void setBudg_yymm02(String budg_yymm02){
		this.budg_yymm02 = budg_yymm02;
	}

	public void setBudg_yymm03(String budg_yymm03){
		this.budg_yymm03 = budg_yymm03;
	}

	public void setBudg_yymm04(String budg_yymm04){
		this.budg_yymm04 = budg_yymm04;
	}

	public void setBudg_yymm05(String budg_yymm05){
		this.budg_yymm05 = budg_yymm05;
	}

	public void setBudg_yymm06(String budg_yymm06){
		this.budg_yymm06 = budg_yymm06;
	}

	public void setBudg_yymm07(String budg_yymm07){
		this.budg_yymm07 = budg_yymm07;
	}

	public void setBudg_yymm08(String budg_yymm08){
		this.budg_yymm08 = budg_yymm08;
	}

	public void setBudg_yymm09(String budg_yymm09){
		this.budg_yymm09 = budg_yymm09;
	}

	public void setBudg_yymm10(String budg_yymm10){
		this.budg_yymm10 = budg_yymm10;
	}

	public void setBudg_yymm11(String budg_yymm11){
		this.budg_yymm11 = budg_yymm11;
	}

	public void setBudg_yymm12(String budg_yymm12){
		this.budg_yymm12 = budg_yymm12;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setWork_no(String work_no){
		this.work_no = work_no;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDtls_edi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getTag(){
		return this.tag;
	}

	public String getJobtag(){
		return this.jobtag;
	}

	public String getBudg_yy(){
		return this.budg_yy;
	}

	public String getBudg_yymm01(){
		return this.budg_yymm01;
	}

	public String getBudg_yymm02(){
		return this.budg_yymm02;
	}

	public String getBudg_yymm03(){
		return this.budg_yymm03;
	}

	public String getBudg_yymm04(){
		return this.budg_yymm04;
	}

	public String getBudg_yymm05(){
		return this.budg_yymm05;
	}

	public String getBudg_yymm06(){
		return this.budg_yymm06;
	}

	public String getBudg_yymm07(){
		return this.budg_yymm07;
	}

	public String getBudg_yymm08(){
		return this.budg_yymm08;
	}

	public String getBudg_yymm09(){
		return this.budg_yymm09;
	}

	public String getBudg_yymm10(){
		return this.budg_yymm10;
	}

	public String getBudg_yymm11(){
		return this.budg_yymm11;
	}

	public String getBudg_yymm12(){
		return this.budg_yymm12;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getWork_no(){
		return this.work_no;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDtls_edi_cd(){
		return this.dtls_medi_cd;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_2076_I(?, ? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_2076_IDM dm = (MC_BUDG_2076_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.tag);
		cstmt.setString(5, dm.jobtag);
		cstmt.setString(6, dm.budg_yy);
		cstmt.setString(7, dm.budg_yymm01);
		cstmt.setString(8, dm.budg_yymm02);
		cstmt.setString(9, dm.budg_yymm03);
		cstmt.setString(10, dm.budg_yymm04);
		cstmt.setString(11, dm.budg_yymm05);
		cstmt.setString(12, dm.budg_yymm06);
		cstmt.setString(13, dm.budg_yymm07);
		cstmt.setString(14, dm.budg_yymm08);
		cstmt.setString(15, dm.budg_yymm09);
		cstmt.setString(16, dm.budg_yymm10);
		cstmt.setString(17, dm.budg_yymm11);
		cstmt.setString(18, dm.budg_yymm12);
		cstmt.setString(19, dm.use_dept_cd);
		cstmt.setString(20, dm.budg_cd);
		cstmt.setString(21, dm.dept_cd);
		cstmt.setString(22, dm.evnt_cd);
		cstmt.setString(23, dm.work_no);
		cstmt.setString(24, dm.seq);
		cstmt.setString(25, dm.medi_cd);
		cstmt.setString(26, dm.dtls_medi_cd);
		cstmt.setString(27, dm.rmks);
		cstmt.setString(28, dm.incmg_pers);
		cstmt.setString(29, dm.chg_pers);
		cstmt.setString(30, dm.incmg_pers_ipadd);
		cstmt.registerOutParameter(31, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_2076_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("tag = [" + getTag() + "]");
		System.out.println("jobtag = [" + getJobtag() + "]");
		System.out.println("budg_yy = [" + getBudg_yy() + "]");
		System.out.println("budg_yymm01 = [" + getBudg_yymm01() + "]");
		System.out.println("budg_yymm02 = [" + getBudg_yymm02() + "]");
		System.out.println("budg_yymm03 = [" + getBudg_yymm03() + "]");
		System.out.println("budg_yymm04 = [" + getBudg_yymm04() + "]");
		System.out.println("budg_yymm05 = [" + getBudg_yymm05() + "]");
		System.out.println("budg_yymm06 = [" + getBudg_yymm06() + "]");
		System.out.println("budg_yymm07 = [" + getBudg_yymm07() + "]");
		System.out.println("budg_yymm08 = [" + getBudg_yymm08() + "]");
		System.out.println("budg_yymm09 = [" + getBudg_yymm09() + "]");
		System.out.println("budg_yymm10 = [" + getBudg_yymm10() + "]");
		System.out.println("budg_yymm11 = [" + getBudg_yymm11() + "]");
		System.out.println("budg_yymm12 = [" + getBudg_yymm12() + "]");
		System.out.println("use_dept_cd = [" + getUse_dept_cd() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("evnt_cd = [" + getEvnt_cd() + "]");
		System.out.println("work_no = [" + getWork_no() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("rmks = [" + getRmks() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
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
String tag = req.getParameter("tag");
if( tag == null){
	System.out.println(this.toString+" : tag is null" );
}else{
	System.out.println(this.toString+" : tag is "+tag );
}
String jobtag = req.getParameter("jobtag");
if( jobtag == null){
	System.out.println(this.toString+" : jobtag is null" );
}else{
	System.out.println(this.toString+" : jobtag is "+jobtag );
}
String budg_yy = req.getParameter("budg_yy");
if( budg_yy == null){
	System.out.println(this.toString+" : budg_yy is null" );
}else{
	System.out.println(this.toString+" : budg_yy is "+budg_yy );
}
String budg_yymm01 = req.getParameter("budg_yymm01");
if( budg_yymm01 == null){
	System.out.println(this.toString+" : budg_yymm01 is null" );
}else{
	System.out.println(this.toString+" : budg_yymm01 is "+budg_yymm01 );
}
String budg_yymm02 = req.getParameter("budg_yymm02");
if( budg_yymm02 == null){
	System.out.println(this.toString+" : budg_yymm02 is null" );
}else{
	System.out.println(this.toString+" : budg_yymm02 is "+budg_yymm02 );
}
String budg_yymm03 = req.getParameter("budg_yymm03");
if( budg_yymm03 == null){
	System.out.println(this.toString+" : budg_yymm03 is null" );
}else{
	System.out.println(this.toString+" : budg_yymm03 is "+budg_yymm03 );
}
String budg_yymm04 = req.getParameter("budg_yymm04");
if( budg_yymm04 == null){
	System.out.println(this.toString+" : budg_yymm04 is null" );
}else{
	System.out.println(this.toString+" : budg_yymm04 is "+budg_yymm04 );
}
String budg_yymm05 = req.getParameter("budg_yymm05");
if( budg_yymm05 == null){
	System.out.println(this.toString+" : budg_yymm05 is null" );
}else{
	System.out.println(this.toString+" : budg_yymm05 is "+budg_yymm05 );
}
String budg_yymm06 = req.getParameter("budg_yymm06");
if( budg_yymm06 == null){
	System.out.println(this.toString+" : budg_yymm06 is null" );
}else{
	System.out.println(this.toString+" : budg_yymm06 is "+budg_yymm06 );
}
String budg_yymm07 = req.getParameter("budg_yymm07");
if( budg_yymm07 == null){
	System.out.println(this.toString+" : budg_yymm07 is null" );
}else{
	System.out.println(this.toString+" : budg_yymm07 is "+budg_yymm07 );
}
String budg_yymm08 = req.getParameter("budg_yymm08");
if( budg_yymm08 == null){
	System.out.println(this.toString+" : budg_yymm08 is null" );
}else{
	System.out.println(this.toString+" : budg_yymm08 is "+budg_yymm08 );
}
String budg_yymm09 = req.getParameter("budg_yymm09");
if( budg_yymm09 == null){
	System.out.println(this.toString+" : budg_yymm09 is null" );
}else{
	System.out.println(this.toString+" : budg_yymm09 is "+budg_yymm09 );
}
String budg_yymm10 = req.getParameter("budg_yymm10");
if( budg_yymm10 == null){
	System.out.println(this.toString+" : budg_yymm10 is null" );
}else{
	System.out.println(this.toString+" : budg_yymm10 is "+budg_yymm10 );
}
String budg_yymm11 = req.getParameter("budg_yymm11");
if( budg_yymm11 == null){
	System.out.println(this.toString+" : budg_yymm11 is null" );
}else{
	System.out.println(this.toString+" : budg_yymm11 is "+budg_yymm11 );
}
String budg_yymm12 = req.getParameter("budg_yymm12");
if( budg_yymm12 == null){
	System.out.println(this.toString+" : budg_yymm12 is null" );
}else{
	System.out.println(this.toString+" : budg_yymm12 is "+budg_yymm12 );
}
String use_dept_cd = req.getParameter("use_dept_cd");
if( use_dept_cd == null){
	System.out.println(this.toString+" : use_dept_cd is null" );
}else{
	System.out.println(this.toString+" : use_dept_cd is "+use_dept_cd );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String evnt_cd = req.getParameter("evnt_cd");
if( evnt_cd == null){
	System.out.println(this.toString+" : evnt_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_cd is "+evnt_cd );
}
String work_no = req.getParameter("work_no");
if( work_no == null){
	System.out.println(this.toString+" : work_no is null" );
}else{
	System.out.println(this.toString+" : work_no is "+work_no );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String rmks = req.getParameter("rmks");
if( rmks == null){
	System.out.println(this.toString+" : rmks is null" );
}else{
	System.out.println(this.toString+" : rmks is "+rmks );
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
String tag = Util.checkString(req.getParameter("tag"));
String jobtag = Util.checkString(req.getParameter("jobtag"));
String budg_yy = Util.checkString(req.getParameter("budg_yy"));
String budg_yymm01 = Util.checkString(req.getParameter("budg_yymm01"));
String budg_yymm02 = Util.checkString(req.getParameter("budg_yymm02"));
String budg_yymm03 = Util.checkString(req.getParameter("budg_yymm03"));
String budg_yymm04 = Util.checkString(req.getParameter("budg_yymm04"));
String budg_yymm05 = Util.checkString(req.getParameter("budg_yymm05"));
String budg_yymm06 = Util.checkString(req.getParameter("budg_yymm06"));
String budg_yymm07 = Util.checkString(req.getParameter("budg_yymm07"));
String budg_yymm08 = Util.checkString(req.getParameter("budg_yymm08"));
String budg_yymm09 = Util.checkString(req.getParameter("budg_yymm09"));
String budg_yymm10 = Util.checkString(req.getParameter("budg_yymm10"));
String budg_yymm11 = Util.checkString(req.getParameter("budg_yymm11"));
String budg_yymm12 = Util.checkString(req.getParameter("budg_yymm12"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
String work_no = Util.checkString(req.getParameter("work_no"));
String seq = Util.checkString(req.getParameter("seq"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String rmks = Util.checkString(req.getParameter("rmks"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String tag = Util.Uni2Ksc(Util.checkString(req.getParameter("tag")));
String jobtag = Util.Uni2Ksc(Util.checkString(req.getParameter("jobtag")));
String budg_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yy")));
String budg_yymm01 = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yymm01")));
String budg_yymm02 = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yymm02")));
String budg_yymm03 = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yymm03")));
String budg_yymm04 = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yymm04")));
String budg_yymm05 = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yymm05")));
String budg_yymm06 = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yymm06")));
String budg_yymm07 = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yymm07")));
String budg_yymm08 = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yymm08")));
String budg_yymm09 = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yymm09")));
String budg_yymm10 = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yymm10")));
String budg_yymm11 = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yymm11")));
String budg_yymm12 = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yymm12")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
String work_no = Util.Uni2Ksc(Util.checkString(req.getParameter("work_no")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setTag(tag);
dm.setJobtag(jobtag);
dm.setBudg_yy(budg_yy);
dm.setBudg_yymm01(budg_yymm01);
dm.setBudg_yymm02(budg_yymm02);
dm.setBudg_yymm03(budg_yymm03);
dm.setBudg_yymm04(budg_yymm04);
dm.setBudg_yymm05(budg_yymm05);
dm.setBudg_yymm06(budg_yymm06);
dm.setBudg_yymm07(budg_yymm07);
dm.setBudg_yymm08(budg_yymm08);
dm.setBudg_yymm09(budg_yymm09);
dm.setBudg_yymm10(budg_yymm10);
dm.setBudg_yymm11(budg_yymm11);
dm.setBudg_yymm12(budg_yymm12);
dm.setUse_dept_cd(use_dept_cd);
dm.setBudg_cd(budg_cd);
dm.setDept_cd(dept_cd);
dm.setEvnt_cd(evnt_cd);
dm.setWork_no(work_no);
dm.setSeq(seq);
dm.setMedi_cd(medi_cd);
dm.setRmks(rmks);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Dec 17 19:57:49 KST 2009 */