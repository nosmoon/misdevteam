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


package chosun.ciis.ad.brn.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleTypes;
import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_BRN_2040_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String rept_clsf;
	public String make_dt;
	public String rept_no;
	public String incmg_pers;
	public String page_id;

	public AD_BRN_2040_SDM(){}
	public AD_BRN_2040_SDM(String cmpy_cd, String rept_clsf, String make_dt, String rept_no, String incmg_pers, String page_id){
		this.cmpy_cd = cmpy_cd;
		this.rept_clsf = rept_clsf;
		this.make_dt = make_dt;
		this.rept_no = rept_no;
		this.incmg_pers = incmg_pers;
		this.page_id = page_id;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRept_clsf(String rept_clsf){
		this.rept_clsf = rept_clsf;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setRept_no(String rept_no){
		this.rept_no = rept_no;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setPage_id(String page_id){
		this.page_id = page_id;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRept_clsf(){
		return this.rept_clsf;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getRept_no(){
		return this.rept_no;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getPage_id(){
		return this.page_id;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BRN_2040_S(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BRN_2040_SDM dm = (AD_BRN_2040_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.rept_clsf);
		cstmt.setString(5, dm.make_dt);
		cstmt.setString(6, dm.rept_no);
		cstmt.setString(7, dm.incmg_pers);
		cstmt.setString(8, dm.page_id);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.brn.ds.AD_BRN_2040_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("rept_clsf = [" + getRept_clsf() + "]");
		System.out.println("make_dt = [" + getMake_dt() + "]");
		System.out.println("rept_no = [" + getRept_no() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("page_id = [" + getPage_id() + "]");
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
String make_dt = req.getParameter("make_dt");
if( make_dt == null){
	System.out.println(this.toString+" : make_dt is null" );
}else{
	System.out.println(this.toString+" : make_dt is "+make_dt );
}
String rept_no = req.getParameter("rept_no");
if( rept_no == null){
	System.out.println(this.toString+" : rept_no is null" );
}else{
	System.out.println(this.toString+" : rept_no is "+rept_no );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String page_id = req.getParameter("page_id");
if( page_id == null){
	System.out.println(this.toString+" : page_id is null" );
}else{
	System.out.println(this.toString+" : page_id is "+page_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String rept_clsf = Util.checkString(req.getParameter("rept_clsf"));
String make_dt = Util.checkString(req.getParameter("make_dt"));
String rept_no = Util.checkString(req.getParameter("rept_no"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String page_id = Util.checkString(req.getParameter("page_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rept_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rept_clsf")));
String make_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt")));
String rept_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rept_no")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String page_id = Util.Uni2Ksc(Util.checkString(req.getParameter("page_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRept_clsf(rept_clsf);
dm.setMake_dt(make_dt);
dm.setRept_no(rept_no);
dm.setIncmg_pers(incmg_pers);
dm.setPage_id(page_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 23 09:36:40 KST 2009 */