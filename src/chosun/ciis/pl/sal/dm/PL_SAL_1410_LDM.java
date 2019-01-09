/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.pl.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.sal.ds.*;
import chosun.ciis.pl.sal.rec.*;

/**
 * 
 */


public class PL_SAL_1410_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String medi_clsf;
	public String basi_dt_fr;
	public String basi_dt_to;
	public String dlco_cd;
	public String dlco_seq;
	public String send_plac_nm;
	public String phone_no_1;
	public String phone_no_2;
	public String phone_no_3;
	public String owh_yn;

	public PL_SAL_1410_LDM(){}
	public PL_SAL_1410_LDM(String cmpy_cd, String incmg_pers, String medi_clsf, String basi_dt_fr, String basi_dt_to, String dlco_cd, String dlco_seq, String send_plac_nm, String phone_no_1, String phone_no_2, String phone_no_3, String owh_yn){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.medi_clsf = medi_clsf;
		this.basi_dt_fr = basi_dt_fr;
		this.basi_dt_to = basi_dt_to;
		this.dlco_cd = dlco_cd;
		this.dlco_seq = dlco_seq;
		this.send_plac_nm = send_plac_nm;
		this.phone_no_1 = phone_no_1;
		this.phone_no_2 = phone_no_2;
		this.phone_no_3 = phone_no_3;
		this.owh_yn = owh_yn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setBasi_dt_fr(String basi_dt_fr){
		this.basi_dt_fr = basi_dt_fr;
	}

	public void setBasi_dt_to(String basi_dt_to){
		this.basi_dt_to = basi_dt_to;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_seq(String dlco_seq){
		this.dlco_seq = dlco_seq;
	}

	public void setSend_plac_nm(String send_plac_nm){
		this.send_plac_nm = send_plac_nm;
	}

	public void setPhone_no_1(String phone_no_1){
		this.phone_no_1 = phone_no_1;
	}

	public void setPhone_no_2(String phone_no_2){
		this.phone_no_2 = phone_no_2;
	}

	public void setPhone_no_3(String phone_no_3){
		this.phone_no_3 = phone_no_3;
	}

	public void setOwh_yn(String owh_yn){
		this.owh_yn = owh_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getBasi_dt_fr(){
		return this.basi_dt_fr;
	}

	public String getBasi_dt_to(){
		return this.basi_dt_to;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_seq(){
		return this.dlco_seq;
	}

	public String getSend_plac_nm(){
		return this.send_plac_nm;
	}

	public String getPhone_no_1(){
		return this.phone_no_1;
	}

	public String getPhone_no_2(){
		return this.phone_no_2;
	}

	public String getPhone_no_3(){
		return this.phone_no_3;
	}

	public String getOwh_yn(){
		return this.owh_yn;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_PL_SAL_1410_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PL_SAL_1410_LDM dm = (PL_SAL_1410_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.medi_clsf);
		cstmt.setString(6, dm.basi_dt_fr);
		cstmt.setString(7, dm.basi_dt_to);
		cstmt.setString(8, dm.dlco_cd);
		cstmt.setString(9, dm.dlco_seq);
		cstmt.setString(10, dm.send_plac_nm);
		cstmt.setString(11, dm.phone_no_1);
		cstmt.setString(12, dm.phone_no_2);
		cstmt.setString(13, dm.phone_no_3);
		cstmt.setString(14, dm.owh_yn);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pl.sal.ds.PL_SAL_1410_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("medi_clsf = [" + getMedi_clsf() + "]");
		System.out.println("basi_dt_fr = [" + getBasi_dt_fr() + "]");
		System.out.println("basi_dt_to = [" + getBasi_dt_to() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("dlco_seq = [" + getDlco_seq() + "]");
		System.out.println("send_plac_nm = [" + getSend_plac_nm() + "]");
		System.out.println("phone_no_1 = [" + getPhone_no_1() + "]");
		System.out.println("phone_no_2 = [" + getPhone_no_2() + "]");
		System.out.println("phone_no_3 = [" + getPhone_no_3() + "]");
		System.out.println("owh_yn = [" + getOwh_yn() + "]");
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
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String medi_clsf = req.getParameter("medi_clsf");
if( medi_clsf == null){
	System.out.println(this.toString+" : medi_clsf is null" );
}else{
	System.out.println(this.toString+" : medi_clsf is "+medi_clsf );
}
String basi_dt_fr = req.getParameter("basi_dt_fr");
if( basi_dt_fr == null){
	System.out.println(this.toString+" : basi_dt_fr is null" );
}else{
	System.out.println(this.toString+" : basi_dt_fr is "+basi_dt_fr );
}
String basi_dt_to = req.getParameter("basi_dt_to");
if( basi_dt_to == null){
	System.out.println(this.toString+" : basi_dt_to is null" );
}else{
	System.out.println(this.toString+" : basi_dt_to is "+basi_dt_to );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String dlco_seq = req.getParameter("dlco_seq");
if( dlco_seq == null){
	System.out.println(this.toString+" : dlco_seq is null" );
}else{
	System.out.println(this.toString+" : dlco_seq is "+dlco_seq );
}
String send_plac_nm = req.getParameter("send_plac_nm");
if( send_plac_nm == null){
	System.out.println(this.toString+" : send_plac_nm is null" );
}else{
	System.out.println(this.toString+" : send_plac_nm is "+send_plac_nm );
}
String phone_no_1 = req.getParameter("phone_no_1");
if( phone_no_1 == null){
	System.out.println(this.toString+" : phone_no_1 is null" );
}else{
	System.out.println(this.toString+" : phone_no_1 is "+phone_no_1 );
}
String phone_no_2 = req.getParameter("phone_no_2");
if( phone_no_2 == null){
	System.out.println(this.toString+" : phone_no_2 is null" );
}else{
	System.out.println(this.toString+" : phone_no_2 is "+phone_no_2 );
}
String phone_no_3 = req.getParameter("phone_no_3");
if( phone_no_3 == null){
	System.out.println(this.toString+" : phone_no_3 is null" );
}else{
	System.out.println(this.toString+" : phone_no_3 is "+phone_no_3 );
}
String owh_yn = req.getParameter("owh_yn");
if( owh_yn == null){
	System.out.println(this.toString+" : owh_yn is null" );
}else{
	System.out.println(this.toString+" : owh_yn is "+owh_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
String basi_dt_fr = Util.checkString(req.getParameter("basi_dt_fr"));
String basi_dt_to = Util.checkString(req.getParameter("basi_dt_to"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));
String send_plac_nm = Util.checkString(req.getParameter("send_plac_nm"));
String phone_no_1 = Util.checkString(req.getParameter("phone_no_1"));
String phone_no_2 = Util.checkString(req.getParameter("phone_no_2"));
String phone_no_3 = Util.checkString(req.getParameter("phone_no_3"));
String owh_yn = Util.checkString(req.getParameter("owh_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));
String basi_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_dt_fr")));
String basi_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_dt_to")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String dlco_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_seq")));
String send_plac_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("send_plac_nm")));
String phone_no_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("phone_no_1")));
String phone_no_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("phone_no_2")));
String phone_no_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("phone_no_3")));
String owh_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("owh_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setMedi_clsf(medi_clsf);
dm.setBasi_dt_fr(basi_dt_fr);
dm.setBasi_dt_to(basi_dt_to);
dm.setDlco_cd(dlco_cd);
dm.setDlco_seq(dlco_seq);
dm.setSend_plac_nm(send_plac_nm);
dm.setPhone_no_1(phone_no_1);
dm.setPhone_no_2(phone_no_2);
dm.setPhone_no_3(phone_no_3);
dm.setOwh_yn(owh_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 02 20:36:33 KST 2009 */