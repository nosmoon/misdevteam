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


public class AD_BAS_3510_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String oth_clsf;
	public String frdt;
	public String todt;
	public String advcs;
	public String advt_cont;
	public String indt_nm;
	public String slcrg_pers;

	public AD_BAS_3510_LDM(){}
	public AD_BAS_3510_LDM(String cmpy_cd, String oth_clsf, String frdt, String todt, String advcs, String advt_cont, String indt_nm, String slcrg_pers){
		this.cmpy_cd = cmpy_cd;
		this.oth_clsf = oth_clsf;
		this.frdt = frdt;
		this.todt = todt;
		this.advcs = advcs;
		this.advt_cont = advt_cont;
		this.indt_nm = indt_nm;
		this.slcrg_pers = slcrg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOth_clsf(String oth_clsf){
		this.oth_clsf = oth_clsf;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setAdvcs(String advcs){
		this.advcs = advcs;
	}

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
	}

	public void setIndt_nm(String indt_nm){
		this.indt_nm = indt_nm;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOth_clsf(){
		return this.oth_clsf;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getAdvcs(){
		return this.advcs;
	}

	public String getAdvt_cont(){
		return this.advt_cont;
	}

	public String getIndt_nm(){
		return this.indt_nm;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BAS_3510_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_3510_LDM dm = (AD_BAS_3510_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.oth_clsf);
		cstmt.setString(5, dm.frdt);
		cstmt.setString(6, dm.todt);
		cstmt.setString(7, dm.advcs);
		cstmt.setString(8, dm.advt_cont);
		cstmt.setString(9, dm.indt_nm);
		cstmt.setString(10, dm.slcrg_pers);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_3510_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("oth_clsf = [" + getOth_clsf() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("advcs = [" + getAdvcs() + "]");
		System.out.println("advt_cont = [" + getAdvt_cont() + "]");
		System.out.println("indt_nm = [" + getIndt_nm() + "]");
		System.out.println("slcrg_pers = [" + getSlcrg_pers() + "]");
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
String oth_clsf = req.getParameter("oth_clsf");
if( oth_clsf == null){
	System.out.println(this.toString+" : oth_clsf is null" );
}else{
	System.out.println(this.toString+" : oth_clsf is "+oth_clsf );
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
String advcs = req.getParameter("advcs");
if( advcs == null){
	System.out.println(this.toString+" : advcs is null" );
}else{
	System.out.println(this.toString+" : advcs is "+advcs );
}
String advt_cont = req.getParameter("advt_cont");
if( advt_cont == null){
	System.out.println(this.toString+" : advt_cont is null" );
}else{
	System.out.println(this.toString+" : advt_cont is "+advt_cont );
}
String indt_nm = req.getParameter("indt_nm");
if( indt_nm == null){
	System.out.println(this.toString+" : indt_nm is null" );
}else{
	System.out.println(this.toString+" : indt_nm is "+indt_nm );
}
String slcrg_pers = req.getParameter("slcrg_pers");
if( slcrg_pers == null){
	System.out.println(this.toString+" : slcrg_pers is null" );
}else{
	System.out.println(this.toString+" : slcrg_pers is "+slcrg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String oth_clsf = Util.checkString(req.getParameter("oth_clsf"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String advcs = Util.checkString(req.getParameter("advcs"));
String advt_cont = Util.checkString(req.getParameter("advt_cont"));
String indt_nm = Util.checkString(req.getParameter("indt_nm"));
String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String oth_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("oth_clsf")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String advcs = Util.Uni2Ksc(Util.checkString(req.getParameter("advcs")));
String advt_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_cont")));
String indt_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("indt_nm")));
String slcrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOth_clsf(oth_clsf);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setAdvcs(advcs);
dm.setAdvt_cont(advt_cont);
dm.setIndt_nm(indt_nm);
dm.setSlcrg_pers(slcrg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 15 18:21:44 KST 2009 */