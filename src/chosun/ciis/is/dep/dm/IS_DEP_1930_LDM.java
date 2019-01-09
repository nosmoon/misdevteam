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


package chosun.ciis.is.dep.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.dep.ds.*;
import chosun.ciis.is.dep.rec.*;

/**
 * 
 */


public class IS_DEP_1930_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_frdt;
	public String occr_todt;
	public String chg_frdt;
	public String chg_todt;
	public String dept_cd;
	public String sub_dept_cd;
	public String chrg_pers;
	public String dlco_no;
	public String trsm_yymm;
	public String sms_trsm_yn;
	public String card_rcpm_yn;

	public IS_DEP_1930_LDM(){}
	public IS_DEP_1930_LDM(String cmpy_cd, String occr_frdt, String occr_todt, String chg_frdt, String chg_todt, String dept_cd, String sub_dept_cd, String chrg_pers, String dlco_no, String trsm_yymm, String sms_trsm_yn, String card_rcpm_yn){
		this.cmpy_cd = cmpy_cd;
		this.occr_frdt = occr_frdt;
		this.occr_todt = occr_todt;
		this.chg_frdt = chg_frdt;
		this.chg_todt = chg_todt;
		this.dept_cd = dept_cd;
		this.sub_dept_cd = sub_dept_cd;
		this.chrg_pers = chrg_pers;
		this.dlco_no = dlco_no;
		this.trsm_yymm = trsm_yymm;
		this.sms_trsm_yn = sms_trsm_yn;
		this.card_rcpm_yn = card_rcpm_yn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_frdt(String occr_frdt){
		this.occr_frdt = occr_frdt;
	}

	public void setOccr_todt(String occr_todt){
		this.occr_todt = occr_todt;
	}

	public void setChg_frdt(String chg_frdt){
		this.chg_frdt = chg_frdt;
	}

	public void setChg_todt(String chg_todt){
		this.chg_todt = chg_todt;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setTrsm_yymm(String trsm_yymm){
		this.trsm_yymm = trsm_yymm;
	}

	public void setSms_trsm_yn(String sms_trsm_yn){
		this.sms_trsm_yn = sms_trsm_yn;
	}

	public void setCard_rcpm_yn(String card_rcpm_yn){
		this.card_rcpm_yn = card_rcpm_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_frdt(){
		return this.occr_frdt;
	}

	public String getOccr_todt(){
		return this.occr_todt;
	}

	public String getChg_frdt(){
		return this.chg_frdt;
	}

	public String getChg_todt(){
		return this.chg_todt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getTrsm_yymm(){
		return this.trsm_yymm;
	}

	public String getSms_trsm_yn(){
		return this.sms_trsm_yn;
	}

	public String getCard_rcpm_yn(){
		return this.card_rcpm_yn;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_DEP_1930_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_DEP_1930_LDM dm = (IS_DEP_1930_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_frdt);
		cstmt.setString(5, dm.occr_todt);
		cstmt.setString(6, dm.chg_frdt);
		cstmt.setString(7, dm.chg_todt);
		cstmt.setString(8, dm.dept_cd);
		cstmt.setString(9, dm.sub_dept_cd);
		cstmt.setString(10, dm.chrg_pers);
		cstmt.setString(11, dm.dlco_no);
		cstmt.setString(12, dm.trsm_yymm);
		cstmt.setString(13, dm.sms_trsm_yn);
		cstmt.setString(14, dm.card_rcpm_yn);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.dep.ds.IS_DEP_1930_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_frdt = [" + getOccr_frdt() + "]");
		System.out.println("occr_todt = [" + getOccr_todt() + "]");
		System.out.println("chg_frdt = [" + getChg_frdt() + "]");
		System.out.println("chg_todt = [" + getChg_todt() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("sub_dept_cd = [" + getSub_dept_cd() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("trsm_yymm = [" + getTrsm_yymm() + "]");
		System.out.println("sms_trsm_yn = [" + getSms_trsm_yn() + "]");
		System.out.println("card_rcpm_yn = [" + getCard_rcpm_yn() + "]");
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
String occr_frdt = req.getParameter("occr_frdt");
if( occr_frdt == null){
	System.out.println(this.toString+" : occr_frdt is null" );
}else{
	System.out.println(this.toString+" : occr_frdt is "+occr_frdt );
}
String occr_todt = req.getParameter("occr_todt");
if( occr_todt == null){
	System.out.println(this.toString+" : occr_todt is null" );
}else{
	System.out.println(this.toString+" : occr_todt is "+occr_todt );
}
String chg_frdt = req.getParameter("chg_frdt");
if( chg_frdt == null){
	System.out.println(this.toString+" : chg_frdt is null" );
}else{
	System.out.println(this.toString+" : chg_frdt is "+chg_frdt );
}
String chg_todt = req.getParameter("chg_todt");
if( chg_todt == null){
	System.out.println(this.toString+" : chg_todt is null" );
}else{
	System.out.println(this.toString+" : chg_todt is "+chg_todt );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String sub_dept_cd = req.getParameter("sub_dept_cd");
if( sub_dept_cd == null){
	System.out.println(this.toString+" : sub_dept_cd is null" );
}else{
	System.out.println(this.toString+" : sub_dept_cd is "+sub_dept_cd );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String trsm_yymm = req.getParameter("trsm_yymm");
if( trsm_yymm == null){
	System.out.println(this.toString+" : trsm_yymm is null" );
}else{
	System.out.println(this.toString+" : trsm_yymm is "+trsm_yymm );
}
String sms_trsm_yn = req.getParameter("sms_trsm_yn");
if( sms_trsm_yn == null){
	System.out.println(this.toString+" : sms_trsm_yn is null" );
}else{
	System.out.println(this.toString+" : sms_trsm_yn is "+sms_trsm_yn );
}
String card_rcpm_yn = req.getParameter("card_rcpm_yn");
if( card_rcpm_yn == null){
	System.out.println(this.toString+" : card_rcpm_yn is null" );
}else{
	System.out.println(this.toString+" : card_rcpm_yn is "+card_rcpm_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_frdt = Util.checkString(req.getParameter("occr_frdt"));
String occr_todt = Util.checkString(req.getParameter("occr_todt"));
String chg_frdt = Util.checkString(req.getParameter("chg_frdt"));
String chg_todt = Util.checkString(req.getParameter("chg_todt"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String trsm_yymm = Util.checkString(req.getParameter("trsm_yymm"));
String sms_trsm_yn = Util.checkString(req.getParameter("sms_trsm_yn"));
String card_rcpm_yn = Util.checkString(req.getParameter("card_rcpm_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_frdt")));
String occr_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_todt")));
String chg_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_frdt")));
String chg_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_todt")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String sub_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_dept_cd")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String trsm_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("trsm_yymm")));
String sms_trsm_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("sms_trsm_yn")));
String card_rcpm_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("card_rcpm_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_frdt(occr_frdt);
dm.setOccr_todt(occr_todt);
dm.setChg_frdt(chg_frdt);
dm.setChg_todt(chg_todt);
dm.setDept_cd(dept_cd);
dm.setSub_dept_cd(sub_dept_cd);
dm.setChrg_pers(chrg_pers);
dm.setDlco_no(dlco_no);
dm.setTrsm_yymm(trsm_yymm);
dm.setSms_trsm_yn(sms_trsm_yn);
dm.setCard_rcpm_yn(card_rcpm_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 24 15:44:59 KST 2012 */