/***************************************************************************************************
* 파일명   : SP_AD_BAS_1530_A.java
* 기능     : 기초자료관리-일일보고 팀장의견 저장, 삭제
* 작성일자 : 
* 작성자   : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
***************************************************************************************************/


package chosun.ciis.ad.bas.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 기초자료관리-일일보고 팀장의견 저장, 삭제
 */


public class AD_BAS_1530_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String rept_clsf;
	public String make_dt;
	public long rept_no;
	public String taem_chf_opn;
	public String incmg_pers;
	public String flag;

	public AD_BAS_1530_ADM(){}
	public AD_BAS_1530_ADM(String cmpy_cd, String rept_clsf, String make_dt, long rept_no, String taem_chf_opn, String incmg_pers, String flag){
		this.cmpy_cd = cmpy_cd;
		this.rept_clsf = rept_clsf;
		this.make_dt = make_dt;
		this.rept_no = rept_no;
		this.taem_chf_opn = taem_chf_opn;
		this.incmg_pers = incmg_pers;
		this.flag = flag;
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

	public void setRept_no(long rept_no){
		this.rept_no = rept_no;
	}

	public void setTaem_chf_opn(String taem_chf_opn){
		this.taem_chf_opn = taem_chf_opn;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setFlag(String flag){
		this.flag = flag;
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

	public long getRept_no(){
		return this.rept_no;
	}

	public String getTaem_chf_opn(){
		return this.taem_chf_opn;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getSQL(){
		 return "{ call SP_AD_BAS_1530_A( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_1530_ADM dm = (AD_BAS_1530_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.rept_clsf);
		cstmt.setString(5, dm.make_dt);
		cstmt.setLong(6, dm.rept_no);
		cstmt.setString(7, dm.taem_chf_opn);
		cstmt.setString(8, dm.incmg_pers);
		cstmt.setString(9, dm.flag);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_1530_ADataSet();
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
String taem_chf_opn = req.getParameter("taem_chf_opn");
if( taem_chf_opn == null){
	System.out.println(this.toString+" : taem_chf_opn is null" );
}else{
	System.out.println(this.toString+" : taem_chf_opn is "+taem_chf_opn );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String rept_clsf = Util.checkString(req.getParameter("rept_clsf"));
String make_dt = Util.checkString(req.getParameter("make_dt"));
String rept_no = Util.checkString(req.getParameter("rept_no"));
String taem_chf_opn = Util.checkString(req.getParameter("taem_chf_opn"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String flag = Util.checkString(req.getParameter("flag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rept_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rept_clsf")));
String make_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt")));
String rept_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rept_no")));
String taem_chf_opn = Util.Uni2Ksc(Util.checkString(req.getParameter("taem_chf_opn")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRept_clsf(rept_clsf);
dm.setMake_dt(make_dt);
dm.setRept_no(rept_no);
dm.setTaem_chf_opn(taem_chf_opn);
dm.setIncmg_pers(incmg_pers);
dm.setFlag(flag);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 16 09:59:11 KST 2009 */