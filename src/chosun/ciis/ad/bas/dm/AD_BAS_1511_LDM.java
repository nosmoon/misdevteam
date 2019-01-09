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


package chosun.ciis.ad.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.bas.ds.*;
import chosun.ciis.ad.bas.rec.*;

/**
 * 
 */


public class AD_BAS_1511_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String rept_clsf;
	public String medi_clsf;
	public String search_dt_fr;
	public String search_dt_to;
	public String advcs_clsf;
	public String patr_chrg_pers;
	public String chrg_pers;
	public String search_wd;
	public String dlco_no;
	public String sch_clsf;
	public String incmg_pers;

	public AD_BAS_1511_LDM(){}
	public AD_BAS_1511_LDM(String cmpy_cd, String rept_clsf, String medi_clsf, String search_dt_fr, String search_dt_to, String advcs_clsf, String patr_chrg_pers, String chrg_pers, String search_wd, String dlco_no, String sch_clsf, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.rept_clsf = rept_clsf;
		this.medi_clsf = medi_clsf;
		this.search_dt_fr = search_dt_fr;
		this.search_dt_to = search_dt_to;
		this.advcs_clsf = advcs_clsf;
		this.patr_chrg_pers = patr_chrg_pers;
		this.chrg_pers = chrg_pers;
		this.search_wd = search_wd;
		this.dlco_no = dlco_no;
		this.sch_clsf = sch_clsf;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRept_clsf(String rept_clsf){
		this.rept_clsf = rept_clsf;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setSearch_dt_fr(String search_dt_fr){
		this.search_dt_fr = search_dt_fr;
	}

	public void setSearch_dt_to(String search_dt_to){
		this.search_dt_to = search_dt_to;
	}

	public void setAdvcs_clsf(String advcs_clsf){
		this.advcs_clsf = advcs_clsf;
	}

	public void setPatr_chrg_pers(String patr_chrg_pers){
		this.patr_chrg_pers = patr_chrg_pers;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setSearch_wd(String search_wd){
		this.search_wd = search_wd;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setSch_clsf(String sch_clsf){
		this.sch_clsf = sch_clsf;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRept_clsf(){
		return this.rept_clsf;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getSearch_dt_fr(){
		return this.search_dt_fr;
	}

	public String getSearch_dt_to(){
		return this.search_dt_to;
	}

	public String getAdvcs_clsf(){
		return this.advcs_clsf;
	}

	public String getPatr_chrg_pers(){
		return this.patr_chrg_pers;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getSearch_wd(){
		return this.search_wd;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getSch_clsf(){
		return this.sch_clsf;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BAS_1511_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_1511_LDM dm = (AD_BAS_1511_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.rept_clsf);
		cstmt.setString(5, dm.medi_clsf);
		cstmt.setString(6, dm.search_dt_fr);
		cstmt.setString(7, dm.search_dt_to);
		cstmt.setString(8, dm.advcs_clsf);
		cstmt.setString(9, dm.patr_chrg_pers);
		cstmt.setString(10, dm.chrg_pers);
		cstmt.setString(11, dm.search_wd);
		cstmt.setString(12, dm.dlco_no);
		cstmt.setString(13, dm.sch_clsf);
		cstmt.setString(14, dm.incmg_pers);
		cstmt.registerOutParameter(15, Types.INTEGER);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_1511_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("rept_clsf = [" + getRept_clsf() + "]");
		System.out.println("medi_clsf = [" + getMedi_clsf() + "]");
		System.out.println("search_dt_fr = [" + getSearch_dt_fr() + "]");
		System.out.println("search_dt_to = [" + getSearch_dt_to() + "]");
		System.out.println("advcs_clsf = [" + getAdvcs_clsf() + "]");
		System.out.println("patr_chrg_pers = [" + getPatr_chrg_pers() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("search_wd = [" + getSearch_wd() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("sch_clsf = [" + getSch_clsf() + "]");
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
String rept_clsf = req.getParameter("rept_clsf");
if( rept_clsf == null){
	System.out.println(this.toString+" : rept_clsf is null" );
}else{
	System.out.println(this.toString+" : rept_clsf is "+rept_clsf );
}
String medi_clsf = req.getParameter("medi_clsf");
if( medi_clsf == null){
	System.out.println(this.toString+" : medi_clsf is null" );
}else{
	System.out.println(this.toString+" : medi_clsf is "+medi_clsf );
}
String search_dt_fr = req.getParameter("search_dt_fr");
if( search_dt_fr == null){
	System.out.println(this.toString+" : search_dt_fr is null" );
}else{
	System.out.println(this.toString+" : search_dt_fr is "+search_dt_fr );
}
String search_dt_to = req.getParameter("search_dt_to");
if( search_dt_to == null){
	System.out.println(this.toString+" : search_dt_to is null" );
}else{
	System.out.println(this.toString+" : search_dt_to is "+search_dt_to );
}
String advcs_clsf = req.getParameter("advcs_clsf");
if( advcs_clsf == null){
	System.out.println(this.toString+" : advcs_clsf is null" );
}else{
	System.out.println(this.toString+" : advcs_clsf is "+advcs_clsf );
}
String patr_chrg_pers = req.getParameter("patr_chrg_pers");
if( patr_chrg_pers == null){
	System.out.println(this.toString+" : patr_chrg_pers is null" );
}else{
	System.out.println(this.toString+" : patr_chrg_pers is "+patr_chrg_pers );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String search_wd = req.getParameter("search_wd");
if( search_wd == null){
	System.out.println(this.toString+" : search_wd is null" );
}else{
	System.out.println(this.toString+" : search_wd is "+search_wd );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String sch_clsf = req.getParameter("sch_clsf");
if( sch_clsf == null){
	System.out.println(this.toString+" : sch_clsf is null" );
}else{
	System.out.println(this.toString+" : sch_clsf is "+sch_clsf );
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
String rept_clsf = Util.checkString(req.getParameter("rept_clsf"));
String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
String search_dt_fr = Util.checkString(req.getParameter("search_dt_fr"));
String search_dt_to = Util.checkString(req.getParameter("search_dt_to"));
String advcs_clsf = Util.checkString(req.getParameter("advcs_clsf"));
String patr_chrg_pers = Util.checkString(req.getParameter("patr_chrg_pers"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String search_wd = Util.checkString(req.getParameter("search_wd"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String sch_clsf = Util.checkString(req.getParameter("sch_clsf"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rept_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rept_clsf")));
String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));
String search_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("search_dt_fr")));
String search_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("search_dt_to")));
String advcs_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("advcs_clsf")));
String patr_chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("patr_chrg_pers")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String search_wd = Util.Uni2Ksc(Util.checkString(req.getParameter("search_wd")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String sch_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sch_clsf")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRept_clsf(rept_clsf);
dm.setMedi_clsf(medi_clsf);
dm.setSearch_dt_fr(search_dt_fr);
dm.setSearch_dt_to(search_dt_to);
dm.setAdvcs_clsf(advcs_clsf);
dm.setPatr_chrg_pers(patr_chrg_pers);
dm.setChrg_pers(chrg_pers);
dm.setSearch_wd(search_wd);
dm.setDlco_no(dlco_no);
dm.setSch_clsf(sch_clsf);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Oct 31 16:09:24 KST 2016 */