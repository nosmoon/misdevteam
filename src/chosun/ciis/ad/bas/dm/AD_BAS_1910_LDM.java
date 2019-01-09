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

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleTypes;
import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_BAS_1910_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_clsf;
	public String frdt;
	public String todt;
	public String make_pers;
	public String make_pers_nm;
	public String srch_all;

	public AD_BAS_1910_LDM(){}
	public AD_BAS_1910_LDM(String cmpy_cd, String medi_clsf, String frdt, String todt, String make_pers, String make_pers_nm, String srch_all){
		this.cmpy_cd = cmpy_cd;
		this.medi_clsf = medi_clsf;
		this.frdt = frdt;
		this.todt = todt;
		this.make_pers = make_pers;
		this.make_pers_nm = make_pers_nm;
		this.srch_all = srch_all;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setMake_pers(String make_pers){
		this.make_pers = make_pers;
	}

	public void setMake_pers_nm(String make_pers_nm){
		this.make_pers_nm = make_pers_nm;
	}

	public void setSrch_all(String srch_all){
		this.srch_all = srch_all;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getMake_pers(){
		return this.make_pers;
	}

	public String getMake_pers_nm(){
		return this.make_pers_nm;
	}

	public String getSrch_all(){
		return this.srch_all;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BAS_1910_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_1910_LDM dm = (AD_BAS_1910_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_clsf);
		cstmt.setString(5, dm.frdt);
		cstmt.setString(6, dm.todt);
		cstmt.setString(7, dm.make_pers);
		cstmt.setString(8, dm.make_pers_nm);
		cstmt.setString(9, dm.srch_all);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_1910_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_clsf = [" + getMedi_clsf() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("make_pers = [" + getMake_pers() + "]");
		System.out.println("make_pers_nm = [" + getMake_pers_nm() + "]");
		System.out.println("srch_all = [" + getSrch_all() + "]");
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
String medi_clsf = req.getParameter("medi_clsf");
if( medi_clsf == null){
	System.out.println(this.toString+" : medi_clsf is null" );
}else{
	System.out.println(this.toString+" : medi_clsf is "+medi_clsf );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String make_pers = req.getParameter("make_pers");
if( make_pers == null){
	System.out.println(this.toString+" : make_pers is null" );
}else{
	System.out.println(this.toString+" : make_pers is "+make_pers );
}
String make_pers_nm = req.getParameter("make_pers_nm");
if( make_pers_nm == null){
	System.out.println(this.toString+" : make_pers_nm is null" );
}else{
	System.out.println(this.toString+" : make_pers_nm is "+make_pers_nm );
}
String srch_all = req.getParameter("srch_all");
if( srch_all == null){
	System.out.println(this.toString+" : srch_all is null" );
}else{
	System.out.println(this.toString+" : srch_all is "+srch_all );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String make_pers = Util.checkString(req.getParameter("make_pers"));
String make_pers_nm = Util.checkString(req.getParameter("make_pers_nm"));
String srch_all = Util.checkString(req.getParameter("srch_all"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String make_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("make_pers")));
String make_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("make_pers_nm")));
String srch_all = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_all")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_clsf(medi_clsf);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setMake_pers(make_pers);
dm.setMake_pers_nm(make_pers_nm);
dm.setSrch_all(srch_all);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 29 13:06:47 KST 2009 */