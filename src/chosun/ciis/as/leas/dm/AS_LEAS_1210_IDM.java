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


package chosun.ciis.as.leas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.leas.ds.*;
import chosun.ciis.as.leas.rec.*;

/**
 * 
 */


public class AS_LEAS_1210_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String bldg_cd;
	public String cntr_yy;
	public String cntr_seq;
	public String clam_yymm;
	public String clam_seq;
	public String leas_clam_amt;
	public String mang_clam_amt;
	public String vat_clam_amt;
	public String clam_dt;
	public String upd_slip_yymm;
	public String upd_slip_dt;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public AS_LEAS_1210_IDM(){}
	public AS_LEAS_1210_IDM(String cmpy_cd, String bldg_cd, String cntr_yy, String cntr_seq, String clam_yymm, String clam_seq, String leas_clam_amt, String mang_clam_amt, String vat_clam_amt, String clam_dt, String upd_slip_yymm, String upd_slip_dt, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.bldg_cd = bldg_cd;
		this.cntr_yy = cntr_yy;
		this.cntr_seq = cntr_seq;
		this.clam_yymm = clam_yymm;
		this.clam_seq = clam_seq;
		this.leas_clam_amt = leas_clam_amt;
		this.mang_clam_amt = mang_clam_amt;
		this.vat_clam_amt = vat_clam_amt;
		this.clam_dt = clam_dt;
		this.upd_slip_yymm = upd_slip_yymm;
		this.upd_slip_dt = upd_slip_dt;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBldg_cd(String bldg_cd){
		this.bldg_cd = bldg_cd;
	}

	public void setCntr_yy(String cntr_yy){
		this.cntr_yy = cntr_yy;
	}

	public void setCntr_seq(String cntr_seq){
		this.cntr_seq = cntr_seq;
	}

	public void setClam_yymm(String clam_yymm){
		this.clam_yymm = clam_yymm;
	}

	public void setClam_seq(String clam_seq){
		this.clam_seq = clam_seq;
	}

	public void setLeas_clam_amt(String leas_clam_amt){
		this.leas_clam_amt = leas_clam_amt;
	}

	public void setMang_clam_amt(String mang_clam_amt){
		this.mang_clam_amt = mang_clam_amt;
	}

	public void setVat_clam_amt(String vat_clam_amt){
		this.vat_clam_amt = vat_clam_amt;
	}

	public void setClam_dt(String clam_dt){
		this.clam_dt = clam_dt;
	}

	public void setUpd_slip_yymm(String upd_slip_yymm){
		this.upd_slip_yymm = upd_slip_yymm;
	}

	public void setUpd_slip_dt(String upd_slip_dt){
		this.upd_slip_dt = upd_slip_dt;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBldg_cd(){
		return this.bldg_cd;
	}

	public String getCntr_yy(){
		return this.cntr_yy;
	}

	public String getCntr_seq(){
		return this.cntr_seq;
	}

	public String getClam_yymm(){
		return this.clam_yymm;
	}

	public String getClam_seq(){
		return this.clam_seq;
	}

	public String getLeas_clam_amt(){
		return this.leas_clam_amt;
	}

	public String getMang_clam_amt(){
		return this.mang_clam_amt;
	}

	public String getVat_clam_amt(){
		return this.vat_clam_amt;
	}

	public String getClam_dt(){
		return this.clam_dt;
	}

	public String getUpd_slip_yymm(){
		return this.upd_slip_yymm;
	}

	public String getUpd_slip_dt(){
		return this.upd_slip_dt;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_LEAS_1210_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_LEAS_1210_IDM dm = (AS_LEAS_1210_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.bldg_cd);
		cstmt.setString(5, dm.cntr_yy);
		cstmt.setString(6, dm.cntr_seq);
		cstmt.setString(7, dm.clam_yymm);
		cstmt.setString(8, dm.clam_seq);
		cstmt.setString(9, dm.leas_clam_amt);
		cstmt.setString(10, dm.mang_clam_amt);
		cstmt.setString(11, dm.vat_clam_amt);
		cstmt.setString(12, dm.clam_dt);
		cstmt.setString(13, dm.upd_slip_yymm);
		cstmt.setString(14, dm.upd_slip_dt);
		cstmt.setString(15, dm.incmg_pers_ipadd);
		cstmt.setString(16, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.leas.ds.AS_LEAS_1210_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("bldg_cd = [" + getBldg_cd() + "]");
		System.out.println("cntr_yy = [" + getCntr_yy() + "]");
		System.out.println("cntr_seq = [" + getCntr_seq() + "]");
		System.out.println("clam_yymm = [" + getClam_yymm() + "]");
		System.out.println("clam_seq = [" + getClam_seq() + "]");
		System.out.println("leas_clam_amt = [" + getLeas_clam_amt() + "]");
		System.out.println("mang_clam_amt = [" + getMang_clam_amt() + "]");
		System.out.println("vat_clam_amt = [" + getVat_clam_amt() + "]");
		System.out.println("clam_dt = [" + getClam_dt() + "]");
		System.out.println("upd_slip_yymm = [" + getUpd_slip_yymm() + "]");
		System.out.println("upd_slip_dt = [" + getUpd_slip_dt() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String bldg_cd = req.getParameter("bldg_cd");
if( bldg_cd == null){
	System.out.println(this.toString+" : bldg_cd is null" );
}else{
	System.out.println(this.toString+" : bldg_cd is "+bldg_cd );
}
String cntr_yy = req.getParameter("cntr_yy");
if( cntr_yy == null){
	System.out.println(this.toString+" : cntr_yy is null" );
}else{
	System.out.println(this.toString+" : cntr_yy is "+cntr_yy );
}
String cntr_seq = req.getParameter("cntr_seq");
if( cntr_seq == null){
	System.out.println(this.toString+" : cntr_seq is null" );
}else{
	System.out.println(this.toString+" : cntr_seq is "+cntr_seq );
}
String clam_yymm = req.getParameter("clam_yymm");
if( clam_yymm == null){
	System.out.println(this.toString+" : clam_yymm is null" );
}else{
	System.out.println(this.toString+" : clam_yymm is "+clam_yymm );
}
String clam_seq = req.getParameter("clam_seq");
if( clam_seq == null){
	System.out.println(this.toString+" : clam_seq is null" );
}else{
	System.out.println(this.toString+" : clam_seq is "+clam_seq );
}
String leas_clam_amt = req.getParameter("leas_clam_amt");
if( leas_clam_amt == null){
	System.out.println(this.toString+" : leas_clam_amt is null" );
}else{
	System.out.println(this.toString+" : leas_clam_amt is "+leas_clam_amt );
}
String mang_clam_amt = req.getParameter("mang_clam_amt");
if( mang_clam_amt == null){
	System.out.println(this.toString+" : mang_clam_amt is null" );
}else{
	System.out.println(this.toString+" : mang_clam_amt is "+mang_clam_amt );
}
String vat_clam_amt = req.getParameter("vat_clam_amt");
if( vat_clam_amt == null){
	System.out.println(this.toString+" : vat_clam_amt is null" );
}else{
	System.out.println(this.toString+" : vat_clam_amt is "+vat_clam_amt );
}
String clam_dt = req.getParameter("clam_dt");
if( clam_dt == null){
	System.out.println(this.toString+" : clam_dt is null" );
}else{
	System.out.println(this.toString+" : clam_dt is "+clam_dt );
}
String upd_slip_yymm = req.getParameter("upd_slip_yymm");
if( upd_slip_yymm == null){
	System.out.println(this.toString+" : upd_slip_yymm is null" );
}else{
	System.out.println(this.toString+" : upd_slip_yymm is "+upd_slip_yymm );
}
String upd_slip_dt = req.getParameter("upd_slip_dt");
if( upd_slip_dt == null){
	System.out.println(this.toString+" : upd_slip_dt is null" );
}else{
	System.out.println(this.toString+" : upd_slip_dt is "+upd_slip_dt );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String bldg_cd = Util.checkString(req.getParameter("bldg_cd"));
String cntr_yy = Util.checkString(req.getParameter("cntr_yy"));
String cntr_seq = Util.checkString(req.getParameter("cntr_seq"));
String clam_yymm = Util.checkString(req.getParameter("clam_yymm"));
String clam_seq = Util.checkString(req.getParameter("clam_seq"));
String leas_clam_amt = Util.checkString(req.getParameter("leas_clam_amt"));
String mang_clam_amt = Util.checkString(req.getParameter("mang_clam_amt"));
String vat_clam_amt = Util.checkString(req.getParameter("vat_clam_amt"));
String clam_dt = Util.checkString(req.getParameter("clam_dt"));
String upd_slip_yymm = Util.checkString(req.getParameter("upd_slip_yymm"));
String upd_slip_dt = Util.checkString(req.getParameter("upd_slip_dt"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String bldg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bldg_cd")));
String cntr_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_yy")));
String cntr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_seq")));
String clam_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_yymm")));
String clam_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_seq")));
String leas_clam_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_clam_amt")));
String mang_clam_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_clam_amt")));
String vat_clam_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_clam_amt")));
String clam_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_dt")));
String upd_slip_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("upd_slip_yymm")));
String upd_slip_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("upd_slip_dt")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBldg_cd(bldg_cd);
dm.setCntr_yy(cntr_yy);
dm.setCntr_seq(cntr_seq);
dm.setClam_yymm(clam_yymm);
dm.setClam_seq(clam_seq);
dm.setLeas_clam_amt(leas_clam_amt);
dm.setMang_clam_amt(mang_clam_amt);
dm.setVat_clam_amt(vat_clam_amt);
dm.setClam_dt(clam_dt);
dm.setUpd_slip_yymm(upd_slip_yymm);
dm.setUpd_slip_dt(upd_slip_dt);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 29 09:17:36 KST 2009 */