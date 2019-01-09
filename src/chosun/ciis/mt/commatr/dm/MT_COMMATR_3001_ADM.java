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


package chosun.ciis.mt.commatr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.commatr.ds.*;
import chosun.ciis.mt.commatr.rec.*;

/**
 * 
 */


public class MT_COMMATR_3001_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String gubun;
	public String cmpy_cd;
	public String dlco_no;
	public String presi_tel_no_1;
	public String presi_tel_no_2;
	public String presi_email;
	public String presi_prof;
	public String chrg_pers;
	public String chrg_pers_tel_no_1;
	public String chrg_pers_tel_no_2;
	public String chrg_pers_email_1;
	public String trsm_usag_email_yn_1;
	public String chrg_pers_email_2;
	public String trsm_usag_email_yn_2;
	public String chrg_pers_dept;
	public String chrg_pers_prof;
	public String fndt_dt;
	public String cmpy_hmpg;
	public String sale_amt;
	public String mrkt_ocpy_rate;
	public String dlco_pcond;
	public String remk;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public MT_COMMATR_3001_ADM(){}
	public MT_COMMATR_3001_ADM(String gubun, String cmpy_cd, String dlco_no, String presi_tel_no_1, String presi_tel_no_2, String presi_email, String presi_prof, String chrg_pers, String chrg_pers_tel_no_1, String chrg_pers_tel_no_2, String chrg_pers_email_1, String trsm_usag_email_yn_1, String chrg_pers_email_2, String trsm_usag_email_yn_2, String chrg_pers_dept, String chrg_pers_prof, String fndt_dt, String cmpy_hmpg, String sale_amt, String mrkt_ocpy_rate, String dlco_pcond, String remk, String incmg_pers_ipadd, String incmg_pers){
		this.gubun = gubun;
		this.cmpy_cd = cmpy_cd;
		this.dlco_no = dlco_no;
		this.presi_tel_no_1 = presi_tel_no_1;
		this.presi_tel_no_2 = presi_tel_no_2;
		this.presi_email = presi_email;
		this.presi_prof = presi_prof;
		this.chrg_pers = chrg_pers;
		this.chrg_pers_tel_no_1 = chrg_pers_tel_no_1;
		this.chrg_pers_tel_no_2 = chrg_pers_tel_no_2;
		this.chrg_pers_email_1 = chrg_pers_email_1;
		this.trsm_usag_email_yn_1 = trsm_usag_email_yn_1;
		this.chrg_pers_email_2 = chrg_pers_email_2;
		this.trsm_usag_email_yn_2 = trsm_usag_email_yn_2;
		this.chrg_pers_dept = chrg_pers_dept;
		this.chrg_pers_prof = chrg_pers_prof;
		this.fndt_dt = fndt_dt;
		this.cmpy_hmpg = cmpy_hmpg;
		this.sale_amt = sale_amt;
		this.mrkt_ocpy_rate = mrkt_ocpy_rate;
		this.dlco_pcond = dlco_pcond;
		this.remk = remk;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setPresi_tel_no_1(String presi_tel_no_1){
		this.presi_tel_no_1 = presi_tel_no_1;
	}

	public void setPresi_tel_no_2(String presi_tel_no_2){
		this.presi_tel_no_2 = presi_tel_no_2;
	}

	public void setPresi_email(String presi_email){
		this.presi_email = presi_email;
	}

	public void setPresi_prof(String presi_prof){
		this.presi_prof = presi_prof;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setChrg_pers_tel_no_1(String chrg_pers_tel_no_1){
		this.chrg_pers_tel_no_1 = chrg_pers_tel_no_1;
	}

	public void setChrg_pers_tel_no_2(String chrg_pers_tel_no_2){
		this.chrg_pers_tel_no_2 = chrg_pers_tel_no_2;
	}

	public void setChrg_pers_email_1(String chrg_pers_email_1){
		this.chrg_pers_email_1 = chrg_pers_email_1;
	}

	public void setTrsm_usag_email_yn_1(String trsm_usag_email_yn_1){
		this.trsm_usag_email_yn_1 = trsm_usag_email_yn_1;
	}

	public void setChrg_pers_email_2(String chrg_pers_email_2){
		this.chrg_pers_email_2 = chrg_pers_email_2;
	}

	public void setTrsm_usag_email_yn_2(String trsm_usag_email_yn_2){
		this.trsm_usag_email_yn_2 = trsm_usag_email_yn_2;
	}

	public void setChrg_pers_dept(String chrg_pers_dept){
		this.chrg_pers_dept = chrg_pers_dept;
	}

	public void setChrg_pers_prof(String chrg_pers_prof){
		this.chrg_pers_prof = chrg_pers_prof;
	}

	public void setFndt_dt(String fndt_dt){
		this.fndt_dt = fndt_dt;
	}

	public void setCmpy_hmpg(String cmpy_hmpg){
		this.cmpy_hmpg = cmpy_hmpg;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public void setMrkt_ocpy_rate(String mrkt_ocpy_rate){
		this.mrkt_ocpy_rate = mrkt_ocpy_rate;
	}

	public void setDlco_pcond(String dlco_pcond){
		this.dlco_pcond = dlco_pcond;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getPresi_tel_no_1(){
		return this.presi_tel_no_1;
	}

	public String getPresi_tel_no_2(){
		return this.presi_tel_no_2;
	}

	public String getPresi_email(){
		return this.presi_email;
	}

	public String getPresi_prof(){
		return this.presi_prof;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getChrg_pers_tel_no_1(){
		return this.chrg_pers_tel_no_1;
	}

	public String getChrg_pers_tel_no_2(){
		return this.chrg_pers_tel_no_2;
	}

	public String getChrg_pers_email_1(){
		return this.chrg_pers_email_1;
	}

	public String getTrsm_usag_email_yn_1(){
		return this.trsm_usag_email_yn_1;
	}

	public String getChrg_pers_email_2(){
		return this.chrg_pers_email_2;
	}

	public String getTrsm_usag_email_yn_2(){
		return this.trsm_usag_email_yn_2;
	}

	public String getChrg_pers_dept(){
		return this.chrg_pers_dept;
	}

	public String getChrg_pers_prof(){
		return this.chrg_pers_prof;
	}

	public String getFndt_dt(){
		return this.fndt_dt;
	}

	public String getCmpy_hmpg(){
		return this.cmpy_hmpg;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getMrkt_ocpy_rate(){
		return this.mrkt_ocpy_rate;
	}

	public String getDlco_pcond(){
		return this.dlco_pcond;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_COMMATR_3001_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_COMMATR_3001_ADM dm = (MT_COMMATR_3001_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.gubun);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.dlco_no);
		cstmt.setString(6, dm.presi_tel_no_1);
		cstmt.setString(7, dm.presi_tel_no_2);
		cstmt.setString(8, dm.presi_email);
		cstmt.setString(9, dm.presi_prof);
		cstmt.setString(10, dm.chrg_pers);
		cstmt.setString(11, dm.chrg_pers_tel_no_1);
		cstmt.setString(12, dm.chrg_pers_tel_no_2);
		cstmt.setString(13, dm.chrg_pers_email_1);
		cstmt.setString(14, dm.trsm_usag_email_yn_1);
		cstmt.setString(15, dm.chrg_pers_email_2);
		cstmt.setString(16, dm.trsm_usag_email_yn_2);
		cstmt.setString(17, dm.chrg_pers_dept);
		cstmt.setString(18, dm.chrg_pers_prof);
		cstmt.setString(19, dm.fndt_dt);
		cstmt.setString(20, dm.cmpy_hmpg);
		cstmt.setString(21, dm.sale_amt);
		cstmt.setString(22, dm.mrkt_ocpy_rate);
		cstmt.setString(23, dm.dlco_pcond);
		cstmt.setString(24, dm.remk);
		cstmt.setString(25, dm.incmg_pers_ipadd);
		cstmt.setString(26, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.commatr.ds.MT_COMMATR_3001_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("gubun = [" + getGubun() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("presi_tel_no_1 = [" + getPresi_tel_no_1() + "]");
		System.out.println("presi_tel_no_2 = [" + getPresi_tel_no_2() + "]");
		System.out.println("presi_email = [" + getPresi_email() + "]");
		System.out.println("presi_prof = [" + getPresi_prof() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("chrg_pers_tel_no_1 = [" + getChrg_pers_tel_no_1() + "]");
		System.out.println("chrg_pers_tel_no_2 = [" + getChrg_pers_tel_no_2() + "]");
		System.out.println("chrg_pers_email_1 = [" + getChrg_pers_email_1() + "]");
		System.out.println("trsm_usag_email_yn_1 = [" + getTrsm_usag_email_yn_1() + "]");
		System.out.println("chrg_pers_email_2 = [" + getChrg_pers_email_2() + "]");
		System.out.println("trsm_usag_email_yn_2 = [" + getTrsm_usag_email_yn_2() + "]");
		System.out.println("chrg_pers_dept = [" + getChrg_pers_dept() + "]");
		System.out.println("chrg_pers_prof = [" + getChrg_pers_prof() + "]");
		System.out.println("fndt_dt = [" + getFndt_dt() + "]");
		System.out.println("cmpy_hmpg = [" + getCmpy_hmpg() + "]");
		System.out.println("sale_amt = [" + getSale_amt() + "]");
		System.out.println("mrkt_ocpy_rate = [" + getMrkt_ocpy_rate() + "]");
		System.out.println("dlco_pcond = [" + getDlco_pcond() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String presi_tel_no_1 = req.getParameter("presi_tel_no_1");
if( presi_tel_no_1 == null){
	System.out.println(this.toString+" : presi_tel_no_1 is null" );
}else{
	System.out.println(this.toString+" : presi_tel_no_1 is "+presi_tel_no_1 );
}
String presi_tel_no_2 = req.getParameter("presi_tel_no_2");
if( presi_tel_no_2 == null){
	System.out.println(this.toString+" : presi_tel_no_2 is null" );
}else{
	System.out.println(this.toString+" : presi_tel_no_2 is "+presi_tel_no_2 );
}
String presi_email = req.getParameter("presi_email");
if( presi_email == null){
	System.out.println(this.toString+" : presi_email is null" );
}else{
	System.out.println(this.toString+" : presi_email is "+presi_email );
}
String presi_prof = req.getParameter("presi_prof");
if( presi_prof == null){
	System.out.println(this.toString+" : presi_prof is null" );
}else{
	System.out.println(this.toString+" : presi_prof is "+presi_prof );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String chrg_pers_tel_no_1 = req.getParameter("chrg_pers_tel_no_1");
if( chrg_pers_tel_no_1 == null){
	System.out.println(this.toString+" : chrg_pers_tel_no_1 is null" );
}else{
	System.out.println(this.toString+" : chrg_pers_tel_no_1 is "+chrg_pers_tel_no_1 );
}
String chrg_pers_tel_no_2 = req.getParameter("chrg_pers_tel_no_2");
if( chrg_pers_tel_no_2 == null){
	System.out.println(this.toString+" : chrg_pers_tel_no_2 is null" );
}else{
	System.out.println(this.toString+" : chrg_pers_tel_no_2 is "+chrg_pers_tel_no_2 );
}
String chrg_pers_email_1 = req.getParameter("chrg_pers_email_1");
if( chrg_pers_email_1 == null){
	System.out.println(this.toString+" : chrg_pers_email_1 is null" );
}else{
	System.out.println(this.toString+" : chrg_pers_email_1 is "+chrg_pers_email_1 );
}
String trsm_usag_email_yn_1 = req.getParameter("trsm_usag_email_yn_1");
if( trsm_usag_email_yn_1 == null){
	System.out.println(this.toString+" : trsm_usag_email_yn_1 is null" );
}else{
	System.out.println(this.toString+" : trsm_usag_email_yn_1 is "+trsm_usag_email_yn_1 );
}
String chrg_pers_email_2 = req.getParameter("chrg_pers_email_2");
if( chrg_pers_email_2 == null){
	System.out.println(this.toString+" : chrg_pers_email_2 is null" );
}else{
	System.out.println(this.toString+" : chrg_pers_email_2 is "+chrg_pers_email_2 );
}
String trsm_usag_email_yn_2 = req.getParameter("trsm_usag_email_yn_2");
if( trsm_usag_email_yn_2 == null){
	System.out.println(this.toString+" : trsm_usag_email_yn_2 is null" );
}else{
	System.out.println(this.toString+" : trsm_usag_email_yn_2 is "+trsm_usag_email_yn_2 );
}
String chrg_pers_dept = req.getParameter("chrg_pers_dept");
if( chrg_pers_dept == null){
	System.out.println(this.toString+" : chrg_pers_dept is null" );
}else{
	System.out.println(this.toString+" : chrg_pers_dept is "+chrg_pers_dept );
}
String chrg_pers_prof = req.getParameter("chrg_pers_prof");
if( chrg_pers_prof == null){
	System.out.println(this.toString+" : chrg_pers_prof is null" );
}else{
	System.out.println(this.toString+" : chrg_pers_prof is "+chrg_pers_prof );
}
String fndt_dt = req.getParameter("fndt_dt");
if( fndt_dt == null){
	System.out.println(this.toString+" : fndt_dt is null" );
}else{
	System.out.println(this.toString+" : fndt_dt is "+fndt_dt );
}
String cmpy_hmpg = req.getParameter("cmpy_hmpg");
if( cmpy_hmpg == null){
	System.out.println(this.toString+" : cmpy_hmpg is null" );
}else{
	System.out.println(this.toString+" : cmpy_hmpg is "+cmpy_hmpg );
}
String sale_amt = req.getParameter("sale_amt");
if( sale_amt == null){
	System.out.println(this.toString+" : sale_amt is null" );
}else{
	System.out.println(this.toString+" : sale_amt is "+sale_amt );
}
String mrkt_ocpy_rate = req.getParameter("mrkt_ocpy_rate");
if( mrkt_ocpy_rate == null){
	System.out.println(this.toString+" : mrkt_ocpy_rate is null" );
}else{
	System.out.println(this.toString+" : mrkt_ocpy_rate is "+mrkt_ocpy_rate );
}
String dlco_pcond = req.getParameter("dlco_pcond");
if( dlco_pcond == null){
	System.out.println(this.toString+" : dlco_pcond is null" );
}else{
	System.out.println(this.toString+" : dlco_pcond is "+dlco_pcond );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String gubun = Util.checkString(req.getParameter("gubun"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String presi_tel_no_1 = Util.checkString(req.getParameter("presi_tel_no_1"));
String presi_tel_no_2 = Util.checkString(req.getParameter("presi_tel_no_2"));
String presi_email = Util.checkString(req.getParameter("presi_email"));
String presi_prof = Util.checkString(req.getParameter("presi_prof"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String chrg_pers_tel_no_1 = Util.checkString(req.getParameter("chrg_pers_tel_no_1"));
String chrg_pers_tel_no_2 = Util.checkString(req.getParameter("chrg_pers_tel_no_2"));
String chrg_pers_email_1 = Util.checkString(req.getParameter("chrg_pers_email_1"));
String trsm_usag_email_yn_1 = Util.checkString(req.getParameter("trsm_usag_email_yn_1"));
String chrg_pers_email_2 = Util.checkString(req.getParameter("chrg_pers_email_2"));
String trsm_usag_email_yn_2 = Util.checkString(req.getParameter("trsm_usag_email_yn_2"));
String chrg_pers_dept = Util.checkString(req.getParameter("chrg_pers_dept"));
String chrg_pers_prof = Util.checkString(req.getParameter("chrg_pers_prof"));
String fndt_dt = Util.checkString(req.getParameter("fndt_dt"));
String cmpy_hmpg = Util.checkString(req.getParameter("cmpy_hmpg"));
String sale_amt = Util.checkString(req.getParameter("sale_amt"));
String mrkt_ocpy_rate = Util.checkString(req.getParameter("mrkt_ocpy_rate"));
String dlco_pcond = Util.checkString(req.getParameter("dlco_pcond"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String presi_tel_no_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("presi_tel_no_1")));
String presi_tel_no_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("presi_tel_no_2")));
String presi_email = Util.Uni2Ksc(Util.checkString(req.getParameter("presi_email")));
String presi_prof = Util.Uni2Ksc(Util.checkString(req.getParameter("presi_prof")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String chrg_pers_tel_no_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers_tel_no_1")));
String chrg_pers_tel_no_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers_tel_no_2")));
String chrg_pers_email_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers_email_1")));
String trsm_usag_email_yn_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("trsm_usag_email_yn_1")));
String chrg_pers_email_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers_email_2")));
String trsm_usag_email_yn_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("trsm_usag_email_yn_2")));
String chrg_pers_dept = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers_dept")));
String chrg_pers_prof = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers_prof")));
String fndt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fndt_dt")));
String cmpy_hmpg = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_hmpg")));
String sale_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_amt")));
String mrkt_ocpy_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("mrkt_ocpy_rate")));
String dlco_pcond = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_pcond")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setGubun(gubun);
dm.setCmpy_cd(cmpy_cd);
dm.setDlco_no(dlco_no);
dm.setPresi_tel_no_1(presi_tel_no_1);
dm.setPresi_tel_no_2(presi_tel_no_2);
dm.setPresi_email(presi_email);
dm.setPresi_prof(presi_prof);
dm.setChrg_pers(chrg_pers);
dm.setChrg_pers_tel_no_1(chrg_pers_tel_no_1);
dm.setChrg_pers_tel_no_2(chrg_pers_tel_no_2);
dm.setChrg_pers_email_1(chrg_pers_email_1);
dm.setTrsm_usag_email_yn_1(trsm_usag_email_yn_1);
dm.setChrg_pers_email_2(chrg_pers_email_2);
dm.setTrsm_usag_email_yn_2(trsm_usag_email_yn_2);
dm.setChrg_pers_dept(chrg_pers_dept);
dm.setChrg_pers_prof(chrg_pers_prof);
dm.setFndt_dt(fndt_dt);
dm.setCmpy_hmpg(cmpy_hmpg);
dm.setSale_amt(sale_amt);
dm.setMrkt_ocpy_rate(mrkt_ocpy_rate);
dm.setDlco_pcond(dlco_pcond);
dm.setRemk(remk);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 13 13:47:11 KST 2009 */