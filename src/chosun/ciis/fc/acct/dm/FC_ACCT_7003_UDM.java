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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_7003_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String card_mang_no;
	public String card_no;
	public String bcusesabeon;
	public String issu_dt;
	public String mtry_dt;
	public String decid_dd;
	public String wste_dt;
	public String dlco_cd;
	public String decid_bank_cd;
	public String memb_dnmn;
	public String emp_no;
	public String incmg_pers_ipadd;
	public String use_yn;
	public String corp_card_clsf;
	public String pch_ynm;

	public FC_ACCT_7003_UDM(){}
	public FC_ACCT_7003_UDM(String cmpy_cd, String card_mang_no, String card_no, String bcusesabeon, String issu_dt, String mtry_dt, String decid_dd, String wste_dt, String dlco_cd, String decid_bank_cd, String memb_dnmn, String emp_no, String incmg_pers_ipadd, String use_yn, String corp_card_clsf, String pch_ynm){
		this.cmpy_cd = cmpy_cd;
		this.card_mang_no = card_mang_no;
		this.card_no = card_no;
		this.bcusesabeon = bcusesabeon;
		this.issu_dt = issu_dt;
		this.mtry_dt = mtry_dt;
		this.decid_dd = decid_dd;
		this.wste_dt = wste_dt;
		this.dlco_cd = dlco_cd;
		this.decid_bank_cd = decid_bank_cd;
		this.memb_dnmn = memb_dnmn;
		this.emp_no = emp_no;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.use_yn = use_yn;
		this.corp_card_clsf = corp_card_clsf;
		this.pch_ynm = pch_ynm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCard_mang_no(String card_mang_no){
		this.card_mang_no = card_mang_no;
	}

	public void setCard_no(String card_no){
		this.card_no = card_no;
	}

	public void setBcusesabeon(String bcusesabeon){
		this.bcusesabeon = bcusesabeon;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setDecid_dd(String decid_dd){
		this.decid_dd = decid_dd;
	}

	public void setWste_dt(String wste_dt){
		this.wste_dt = wste_dt;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDecid_bank_cd(String decid_bank_cd){
		this.decid_bank_cd = decid_bank_cd;
	}

	public void setMemb_dnmn(String memb_dnmn){
		this.memb_dnmn = memb_dnmn;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setCorp_card_clsf(String corp_card_clsf){
		this.corp_card_clsf = corp_card_clsf;
	}

	public void setPch_ynm(String pch_ynm){
		this.pch_ynm = pch_ynm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCard_mang_no(){
		return this.card_mang_no;
	}

	public String getCard_no(){
		return this.card_no;
	}

	public String getBcusesabeon(){
		return this.bcusesabeon;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getDecid_dd(){
		return this.decid_dd;
	}

	public String getWste_dt(){
		return this.wste_dt;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDecid_bank_cd(){
		return this.decid_bank_cd;
	}

	public String getMemb_dnmn(){
		return this.memb_dnmn;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getCorp_card_clsf(){
		return this.corp_card_clsf;
	}

	public String getPch_ynm(){
		return this.pch_ynm;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_7003_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_7003_UDM dm = (FC_ACCT_7003_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.card_mang_no);
		cstmt.setString(5, dm.card_no);
		cstmt.setString(6, dm.bcusesabeon);
		cstmt.setString(7, dm.issu_dt);
		cstmt.setString(8, dm.mtry_dt);
		cstmt.setString(9, dm.decid_dd);
		cstmt.setString(10, dm.wste_dt);
		cstmt.setString(11, dm.dlco_cd);
		cstmt.setString(12, dm.decid_bank_cd);
		cstmt.setString(13, dm.memb_dnmn);
		cstmt.setString(14, dm.emp_no);
		cstmt.setString(15, dm.incmg_pers_ipadd);
		cstmt.setString(16, dm.use_yn);
		cstmt.setString(17, dm.corp_card_clsf);
		cstmt.setString(18, dm.pch_ynm);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_7003_UDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("card_mang_no = " + getCard_mang_no());
        System.out.println("card_no = " + getCard_no());
        System.out.println("bcusesabeon = " + getBcusesabeon());
        System.out.println("issu_dt = " + getIssu_dt());
        System.out.println("mtry_dt = " + getMtry_dt());
        System.out.println("decid_dd = " + getDecid_dd());
        System.out.println("wste_dt = " + getWste_dt());
        System.out.println("dlco_cd = " + getDlco_cd());
        System.out.println("decid_bank_cd = " + getDecid_bank_cd());
        System.out.println("memb_dnmn = " + getMemb_dnmn());
        System.out.println("emp_no = " + getEmp_no());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("use_yn = " + getUse_yn());
        System.out.println("corp_card_clsf = " + getCorp_card_clsf());
        System.out.println("pch_ynm = " + getPch_ynm());
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
String card_mang_no = req.getParameter("card_mang_no");
if( card_mang_no == null){
	System.out.println(this.toString+" : card_mang_no is null" );
}else{
	System.out.println(this.toString+" : card_mang_no is "+card_mang_no );
}
String card_no = req.getParameter("card_no");
if( card_no == null){
	System.out.println(this.toString+" : card_no is null" );
}else{
	System.out.println(this.toString+" : card_no is "+card_no );
}
String bcusesabeon = req.getParameter("bcusesabeon");
if( bcusesabeon == null){
	System.out.println(this.toString+" : bcusesabeon is null" );
}else{
	System.out.println(this.toString+" : bcusesabeon is "+bcusesabeon );
}
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String mtry_dt = req.getParameter("mtry_dt");
if( mtry_dt == null){
	System.out.println(this.toString+" : mtry_dt is null" );
}else{
	System.out.println(this.toString+" : mtry_dt is "+mtry_dt );
}
String decid_dd = req.getParameter("decid_dd");
if( decid_dd == null){
	System.out.println(this.toString+" : decid_dd is null" );
}else{
	System.out.println(this.toString+" : decid_dd is "+decid_dd );
}
String wste_dt = req.getParameter("wste_dt");
if( wste_dt == null){
	System.out.println(this.toString+" : wste_dt is null" );
}else{
	System.out.println(this.toString+" : wste_dt is "+wste_dt );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String decid_bank_cd = req.getParameter("decid_bank_cd");
if( decid_bank_cd == null){
	System.out.println(this.toString+" : decid_bank_cd is null" );
}else{
	System.out.println(this.toString+" : decid_bank_cd is "+decid_bank_cd );
}
String memb_dnmn = req.getParameter("memb_dnmn");
if( memb_dnmn == null){
	System.out.println(this.toString+" : memb_dnmn is null" );
}else{
	System.out.println(this.toString+" : memb_dnmn is "+memb_dnmn );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String use_yn = req.getParameter("use_yn");
if( use_yn == null){
	System.out.println(this.toString+" : use_yn is null" );
}else{
	System.out.println(this.toString+" : use_yn is "+use_yn );
}
String corp_card_clsf = req.getParameter("corp_card_clsf");
if( corp_card_clsf == null){
	System.out.println(this.toString+" : corp_card_clsf is null" );
}else{
	System.out.println(this.toString+" : corp_card_clsf is "+corp_card_clsf );
}
String pch_ynm = req.getParameter("pch_ynm");
if( pch_ynm == null){
	System.out.println(this.toString+" : pch_ynm is null" );
}else{
	System.out.println(this.toString+" : pch_ynm is "+pch_ynm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String card_mang_no = Util.checkString(req.getParameter("card_mang_no"));
String card_no = Util.checkString(req.getParameter("card_no"));
String bcusesabeon = Util.checkString(req.getParameter("bcusesabeon"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String decid_dd = Util.checkString(req.getParameter("decid_dd"));
String wste_dt = Util.checkString(req.getParameter("wste_dt"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String decid_bank_cd = Util.checkString(req.getParameter("decid_bank_cd"));
String memb_dnmn = Util.checkString(req.getParameter("memb_dnmn"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String use_yn = Util.checkString(req.getParameter("use_yn"));
String corp_card_clsf = Util.checkString(req.getParameter("corp_card_clsf"));
String pch_ynm = Util.checkString(req.getParameter("pch_ynm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String card_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("card_mang_no")));
String card_no = Util.Uni2Ksc(Util.checkString(req.getParameter("card_no")));
String bcusesabeon = Util.Uni2Ksc(Util.checkString(req.getParameter("bcusesabeon")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String decid_dd = Util.Uni2Ksc(Util.checkString(req.getParameter("decid_dd")));
String wste_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("wste_dt")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String decid_bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("decid_bank_cd")));
String memb_dnmn = Util.Uni2Ksc(Util.checkString(req.getParameter("memb_dnmn")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("use_yn")));
String corp_card_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("corp_card_clsf")));
String pch_ynm = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_ynm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCard_mang_no(card_mang_no);
dm.setCard_no(card_no);
dm.setBcusesabeon(bcusesabeon);
dm.setIssu_dt(issu_dt);
dm.setMtry_dt(mtry_dt);
dm.setDecid_dd(decid_dd);
dm.setWste_dt(wste_dt);
dm.setDlco_cd(dlco_cd);
dm.setDecid_bank_cd(decid_bank_cd);
dm.setMemb_dnmn(memb_dnmn);
dm.setEmp_no(emp_no);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setUse_yn(use_yn);
dm.setCorp_card_clsf(corp_card_clsf);
dm.setPch_ynm(pch_ynm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 06 13:21:09 KST 2009 */