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


package chosun.ciis.as.base.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.base.ds.*;
import chosun.ciis.as.base.rec.*;

/**
 * 
 */


public class AS_BASE_1103_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String bund_cd;
	public String bund_nm;
	public String mang_dt;
	public String usag;
	public String supv_dept_cd;
	public String dlvs_plac;
	public String tot_amt;
	public String mony_unit_cd;
	public String ltrm_adpay_cost;
	public String leas_cmpy;
	public String leas_no;
	public String leas_frdt;
	public String leas_todt;
	public String re_leas_frdt;
	public String re_leas_todt;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;

	public AS_BASE_1103_ADM(){}
	public AS_BASE_1103_ADM(String mode, String cmpy_cd, String bund_cd, String bund_nm, String mang_dt, String usag, String supv_dept_cd, String dlvs_plac, String tot_amt, String mony_unit_cd, String ltrm_adpay_cost, String leas_cmpy, String leas_no, String leas_frdt, String leas_todt, String re_leas_frdt, String re_leas_todt, String incmg_pers_ipadd, String incmg_pers, String chg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.bund_cd = bund_cd;
		this.bund_nm = bund_nm;
		this.mang_dt = mang_dt;
		this.usag = usag;
		this.supv_dept_cd = supv_dept_cd;
		this.dlvs_plac = dlvs_plac;
		this.tot_amt = tot_amt;
		this.mony_unit_cd = mony_unit_cd;
		this.ltrm_adpay_cost = ltrm_adpay_cost;
		this.leas_cmpy = leas_cmpy;
		this.leas_no = leas_no;
		this.leas_frdt = leas_frdt;
		this.leas_todt = leas_todt;
		this.re_leas_frdt = re_leas_frdt;
		this.re_leas_todt = re_leas_todt;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBund_cd(String bund_cd){
		this.bund_cd = bund_cd;
	}

	public void setBund_nm(String bund_nm){
		this.bund_nm = bund_nm;
	}

	public void setMang_dt(String mang_dt){
		this.mang_dt = mang_dt;
	}

	public void setUsag(String usag){
		this.usag = usag;
	}

	public void setSupv_dept_cd(String supv_dept_cd){
		this.supv_dept_cd = supv_dept_cd;
	}

	public void setDlvs_plac(String dlvs_plac){
		this.dlvs_plac = dlvs_plac;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setMony_unit_cd(String mony_unit_cd){
		this.mony_unit_cd = mony_unit_cd;
	}

	public void setLtrm_adpay_cost(String ltrm_adpay_cost){
		this.ltrm_adpay_cost = ltrm_adpay_cost;
	}

	public void setLeas_cmpy(String leas_cmpy){
		this.leas_cmpy = leas_cmpy;
	}

	public void setLeas_no(String leas_no){
		this.leas_no = leas_no;
	}

	public void setLeas_frdt(String leas_frdt){
		this.leas_frdt = leas_frdt;
	}

	public void setLeas_todt(String leas_todt){
		this.leas_todt = leas_todt;
	}

	public void setRe_leas_frdt(String re_leas_frdt){
		this.re_leas_frdt = re_leas_frdt;
	}

	public void setRe_leas_todt(String re_leas_todt){
		this.re_leas_todt = re_leas_todt;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBund_cd(){
		return this.bund_cd;
	}

	public String getBund_nm(){
		return this.bund_nm;
	}

	public String getMang_dt(){
		return this.mang_dt;
	}

	public String getUsag(){
		return this.usag;
	}

	public String getSupv_dept_cd(){
		return this.supv_dept_cd;
	}

	public String getDlvs_plac(){
		return this.dlvs_plac;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getMony_unit_cd(){
		return this.mony_unit_cd;
	}

	public String getLtrm_adpay_cost(){
		return this.ltrm_adpay_cost;
	}

	public String getLeas_cmpy(){
		return this.leas_cmpy;
	}

	public String getLeas_no(){
		return this.leas_no;
	}

	public String getLeas_frdt(){
		return this.leas_frdt;
	}

	public String getLeas_todt(){
		return this.leas_todt;
	}

	public String getRe_leas_frdt(){
		return this.re_leas_frdt;
	}

	public String getRe_leas_todt(){
		return this.re_leas_todt;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_BASE_1103_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_BASE_1103_ADM dm = (AS_BASE_1103_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.bund_cd);
		cstmt.setString(6, dm.bund_nm);
		cstmt.setString(7, dm.mang_dt);
		cstmt.setString(8, dm.usag);
		cstmt.setString(9, dm.supv_dept_cd);
		cstmt.setString(10, dm.dlvs_plac);
		cstmt.setString(11, dm.tot_amt);
		cstmt.setString(12, dm.mony_unit_cd);
		cstmt.setString(13, dm.ltrm_adpay_cost);
		cstmt.setString(14, dm.leas_cmpy);
		cstmt.setString(15, dm.leas_no);
		cstmt.setString(16, dm.leas_frdt);
		cstmt.setString(17, dm.leas_todt);
		cstmt.setString(18, dm.re_leas_frdt);
		cstmt.setString(19, dm.re_leas_todt);
		cstmt.setString(20, dm.incmg_pers_ipadd);
		cstmt.setString(21, dm.incmg_pers);
		cstmt.setString(22, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.base.ds.AS_BASE_1103_ADataSet();
	}



    public void print(){
        System.out.println("mode = " + getMode());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("bund_cd = " + getBund_cd());
        System.out.println("bund_nm = " + getBund_nm());
        System.out.println("mang_dt = " + getMang_dt());
        System.out.println("usag = " + getUsag());
        System.out.println("supv_dept_cd = " + getSupv_dept_cd());
        System.out.println("dlvs_plac = " + getDlvs_plac());
        System.out.println("tot_amt = " + getTot_amt());
        System.out.println("mony_unit_cd = " + getMony_unit_cd());
        System.out.println("ltrm_adpay_cost = " + getLtrm_adpay_cost());
        System.out.println("leas_cmpy = " + getLeas_cmpy());
        System.out.println("leas_no = " + getLeas_no());
        System.out.println("leas_frdt = " + getLeas_frdt());
        System.out.println("leas_todt = " + getLeas_todt());
        System.out.println("re_leas_frdt = " + getRe_leas_frdt());
        System.out.println("re_leas_todt = " + getRe_leas_todt());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("chg_pers = " + getChg_pers());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String bund_cd = req.getParameter("bund_cd");
if( bund_cd == null){
	System.out.println(this.toString+" : bund_cd is null" );
}else{
	System.out.println(this.toString+" : bund_cd is "+bund_cd );
}
String bund_nm = req.getParameter("bund_nm");
if( bund_nm == null){
	System.out.println(this.toString+" : bund_nm is null" );
}else{
	System.out.println(this.toString+" : bund_nm is "+bund_nm );
}
String mang_dt = req.getParameter("mang_dt");
if( mang_dt == null){
	System.out.println(this.toString+" : mang_dt is null" );
}else{
	System.out.println(this.toString+" : mang_dt is "+mang_dt );
}
String usag = req.getParameter("usag");
if( usag == null){
	System.out.println(this.toString+" : usag is null" );
}else{
	System.out.println(this.toString+" : usag is "+usag );
}
String supv_dept_cd = req.getParameter("supv_dept_cd");
if( supv_dept_cd == null){
	System.out.println(this.toString+" : supv_dept_cd is null" );
}else{
	System.out.println(this.toString+" : supv_dept_cd is "+supv_dept_cd );
}
String dlvs_plac = req.getParameter("dlvs_plac");
if( dlvs_plac == null){
	System.out.println(this.toString+" : dlvs_plac is null" );
}else{
	System.out.println(this.toString+" : dlvs_plac is "+dlvs_plac );
}
String tot_amt = req.getParameter("tot_amt");
if( tot_amt == null){
	System.out.println(this.toString+" : tot_amt is null" );
}else{
	System.out.println(this.toString+" : tot_amt is "+tot_amt );
}
String mony_unit_cd = req.getParameter("mony_unit_cd");
if( mony_unit_cd == null){
	System.out.println(this.toString+" : mony_unit_cd is null" );
}else{
	System.out.println(this.toString+" : mony_unit_cd is "+mony_unit_cd );
}
String ltrm_adpay_cost = req.getParameter("ltrm_adpay_cost");
if( ltrm_adpay_cost == null){
	System.out.println(this.toString+" : ltrm_adpay_cost is null" );
}else{
	System.out.println(this.toString+" : ltrm_adpay_cost is "+ltrm_adpay_cost );
}
String leas_cmpy = req.getParameter("leas_cmpy");
if( leas_cmpy == null){
	System.out.println(this.toString+" : leas_cmpy is null" );
}else{
	System.out.println(this.toString+" : leas_cmpy is "+leas_cmpy );
}
String leas_no = req.getParameter("leas_no");
if( leas_no == null){
	System.out.println(this.toString+" : leas_no is null" );
}else{
	System.out.println(this.toString+" : leas_no is "+leas_no );
}
String leas_frdt = req.getParameter("leas_frdt");
if( leas_frdt == null){
	System.out.println(this.toString+" : leas_frdt is null" );
}else{
	System.out.println(this.toString+" : leas_frdt is "+leas_frdt );
}
String leas_todt = req.getParameter("leas_todt");
if( leas_todt == null){
	System.out.println(this.toString+" : leas_todt is null" );
}else{
	System.out.println(this.toString+" : leas_todt is "+leas_todt );
}
String re_leas_frdt = req.getParameter("re_leas_frdt");
if( re_leas_frdt == null){
	System.out.println(this.toString+" : re_leas_frdt is null" );
}else{
	System.out.println(this.toString+" : re_leas_frdt is "+re_leas_frdt );
}
String re_leas_todt = req.getParameter("re_leas_todt");
if( re_leas_todt == null){
	System.out.println(this.toString+" : re_leas_todt is null" );
}else{
	System.out.println(this.toString+" : re_leas_todt is "+re_leas_todt );
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
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String bund_cd = Util.checkString(req.getParameter("bund_cd"));
String bund_nm = Util.checkString(req.getParameter("bund_nm"));
String mang_dt = Util.checkString(req.getParameter("mang_dt"));
String usag = Util.checkString(req.getParameter("usag"));
String supv_dept_cd = Util.checkString(req.getParameter("supv_dept_cd"));
String dlvs_plac = Util.checkString(req.getParameter("dlvs_plac"));
String tot_amt = Util.checkString(req.getParameter("tot_amt"));
String mony_unit_cd = Util.checkString(req.getParameter("mony_unit_cd"));
String ltrm_adpay_cost = Util.checkString(req.getParameter("ltrm_adpay_cost"));
String leas_cmpy = Util.checkString(req.getParameter("leas_cmpy"));
String leas_no = Util.checkString(req.getParameter("leas_no"));
String leas_frdt = Util.checkString(req.getParameter("leas_frdt"));
String leas_todt = Util.checkString(req.getParameter("leas_todt"));
String re_leas_frdt = Util.checkString(req.getParameter("re_leas_frdt"));
String re_leas_todt = Util.checkString(req.getParameter("re_leas_todt"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String bund_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bund_cd")));
String bund_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("bund_nm")));
String mang_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_dt")));
String usag = Util.Uni2Ksc(Util.checkString(req.getParameter("usag")));
String supv_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("supv_dept_cd")));
String dlvs_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvs_plac")));
String tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_amt")));
String mony_unit_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("mony_unit_cd")));
String ltrm_adpay_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("ltrm_adpay_cost")));
String leas_cmpy = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_cmpy")));
String leas_no = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_no")));
String leas_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_frdt")));
String leas_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_todt")));
String re_leas_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("re_leas_frdt")));
String re_leas_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("re_leas_todt")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setBund_cd(bund_cd);
dm.setBund_nm(bund_nm);
dm.setMang_dt(mang_dt);
dm.setUsag(usag);
dm.setSupv_dept_cd(supv_dept_cd);
dm.setDlvs_plac(dlvs_plac);
dm.setTot_amt(tot_amt);
dm.setMony_unit_cd(mony_unit_cd);
dm.setLtrm_adpay_cost(ltrm_adpay_cost);
dm.setLeas_cmpy(leas_cmpy);
dm.setLeas_no(leas_no);
dm.setLeas_frdt(leas_frdt);
dm.setLeas_todt(leas_todt);
dm.setRe_leas_frdt(re_leas_frdt);
dm.setRe_leas_todt(re_leas_todt);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 24 21:12:20 KST 2009 */