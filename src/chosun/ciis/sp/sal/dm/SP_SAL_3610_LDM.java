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


package chosun.ciis.sp.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.ds.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_3610_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String sale_yymm;
	public String make_dt;
	public String dlco_nm;
	public String elec_trsm_yn;
	public String vat_gubun;
	public String erplace_cd;
	public String incmg_pers;

	public SP_SAL_3610_LDM(){}
	public SP_SAL_3610_LDM(String cmpy_cd, String sale_yymm, String make_dt, String dlco_nm, String elec_trsm_yn, String vat_gubun, String erplace_cd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.sale_yymm = sale_yymm;
		this.make_dt = make_dt;
		this.dlco_nm = dlco_nm;
		this.elec_trsm_yn = elec_trsm_yn;
		this.vat_gubun = vat_gubun;
		this.erplace_cd = erplace_cd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSale_yymm(String sale_yymm){
		this.sale_yymm = sale_yymm;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setElec_trsm_yn(String elec_trsm_yn){
		this.elec_trsm_yn = elec_trsm_yn;
	}

	public void setVat_gubun(String vat_gubun){
		this.vat_gubun = vat_gubun;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSale_yymm(){
		return this.sale_yymm;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getElec_trsm_yn(){
		return this.elec_trsm_yn;
	}

	public String getVat_gubun(){
		return this.vat_gubun;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SAL_3610_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SAL_3610_LDM dm = (SP_SAL_3610_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.sale_yymm);
		cstmt.setString(5, dm.make_dt);
		cstmt.setString(6, dm.dlco_nm);
		cstmt.setString(7, dm.elec_trsm_yn);
		cstmt.setString(8, dm.vat_gubun);
		cstmt.setString(9, dm.erplace_cd);
		cstmt.setString(10, dm.incmg_pers);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sal.ds.SP_SAL_3610_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("sale_yymm = [" + getSale_yymm() + "]");
		System.out.println("make_dt = [" + getMake_dt() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("elec_trsm_yn = [" + getElec_trsm_yn() + "]");
		System.out.println("vat_gubun = [" + getVat_gubun() + "]");
		System.out.println("erplace_cd = [" + getErplace_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String sale_yymm = req.getParameter("sale_yymm");
if( sale_yymm == null){
	System.out.println(this.toString+" : sale_yymm is null" );
}else{
	System.out.println(this.toString+" : sale_yymm is "+sale_yymm );
}
String make_dt = req.getParameter("make_dt");
if( make_dt == null){
	System.out.println(this.toString+" : make_dt is null" );
}else{
	System.out.println(this.toString+" : make_dt is "+make_dt );
}
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String elec_trsm_yn = req.getParameter("elec_trsm_yn");
if( elec_trsm_yn == null){
	System.out.println(this.toString+" : elec_trsm_yn is null" );
}else{
	System.out.println(this.toString+" : elec_trsm_yn is "+elec_trsm_yn );
}
String vat_gubun = req.getParameter("vat_gubun");
if( vat_gubun == null){
	System.out.println(this.toString+" : vat_gubun is null" );
}else{
	System.out.println(this.toString+" : vat_gubun is "+vat_gubun );
}
String erplace_cd = req.getParameter("erplace_cd");
if( erplace_cd == null){
	System.out.println(this.toString+" : erplace_cd is null" );
}else{
	System.out.println(this.toString+" : erplace_cd is "+erplace_cd );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
String make_dt = Util.checkString(req.getParameter("make_dt"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String elec_trsm_yn = Util.checkString(req.getParameter("elec_trsm_yn"));
String vat_gubun = Util.checkString(req.getParameter("vat_gubun"));
String erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String sale_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_yymm")));
String make_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String elec_trsm_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("elec_trsm_yn")));
String vat_gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_gubun")));
String erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSale_yymm(sale_yymm);
dm.setMake_dt(make_dt);
dm.setDlco_nm(dlco_nm);
dm.setElec_trsm_yn(elec_trsm_yn);
dm.setVat_gubun(vat_gubun);
dm.setErplace_cd(erplace_cd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 27 21:27:16 KST 2012 */