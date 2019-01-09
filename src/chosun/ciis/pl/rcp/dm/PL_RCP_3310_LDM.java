/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.pl.rcp.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.rcp.ds.*;
import chosun.ciis.pl.rcp.rec.*;

/**
 * 
 */


public class PL_RCP_3310_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String colt_clsf;
	public String setup_stat;
	public String gurt_end_dd;
	public String dlco_cd;
	public String dlco_seq;

	public PL_RCP_3310_LDM(){}
	public PL_RCP_3310_LDM(String cmpy_cd, String incmg_pers, String colt_clsf, String setup_stat, String gurt_end_dd, String dlco_cd, String dlco_seq){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.colt_clsf = colt_clsf;
		this.setup_stat = setup_stat;
		this.gurt_end_dd = gurt_end_dd;
		this.dlco_cd = dlco_cd;
		this.dlco_seq = dlco_seq;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setColt_clsf(String colt_clsf){
		this.colt_clsf = colt_clsf;
	}

	public void setSetup_stat(String setup_stat){
		this.setup_stat = setup_stat;
	}

	public void setGurt_end_dd(String gurt_end_dd){
		this.gurt_end_dd = gurt_end_dd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_seq(String dlco_seq){
		this.dlco_seq = dlco_seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getColt_clsf(){
		return this.colt_clsf;
	}

	public String getSetup_stat(){
		return this.setup_stat;
	}

	public String getGurt_end_dd(){
		return this.gurt_end_dd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_seq(){
		return this.dlco_seq;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_PL_RCP_3310_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PL_RCP_3310_LDM dm = (PL_RCP_3310_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.colt_clsf);
		cstmt.setString(6, dm.setup_stat);
		cstmt.setString(7, dm.gurt_end_dd);
		cstmt.setString(8, dm.dlco_cd);
		cstmt.setString(9, dm.dlco_seq);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pl.rcp.ds.PL_RCP_3310_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("colt_clsf = [" + getColt_clsf() + "]");
		System.out.println("setup_stat = [" + getSetup_stat() + "]");
		System.out.println("gurt_end_dd = [" + getGurt_end_dd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("dlco_seq = [" + getDlco_seq() + "]");
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
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String colt_clsf = req.getParameter("colt_clsf");
if( colt_clsf == null){
	System.out.println(this.toString+" : colt_clsf is null" );
}else{
	System.out.println(this.toString+" : colt_clsf is "+colt_clsf );
}
String setup_stat = req.getParameter("setup_stat");
if( setup_stat == null){
	System.out.println(this.toString+" : setup_stat is null" );
}else{
	System.out.println(this.toString+" : setup_stat is "+setup_stat );
}
String gurt_end_dd = req.getParameter("gurt_end_dd");
if( gurt_end_dd == null){
	System.out.println(this.toString+" : gurt_end_dd is null" );
}else{
	System.out.println(this.toString+" : gurt_end_dd is "+gurt_end_dd );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String dlco_seq = req.getParameter("dlco_seq");
if( dlco_seq == null){
	System.out.println(this.toString+" : dlco_seq is null" );
}else{
	System.out.println(this.toString+" : dlco_seq is "+dlco_seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String colt_clsf = Util.checkString(req.getParameter("colt_clsf"));
String setup_stat = Util.checkString(req.getParameter("setup_stat"));
String gurt_end_dd = Util.checkString(req.getParameter("gurt_end_dd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String colt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("colt_clsf")));
String setup_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("setup_stat")));
String gurt_end_dd = Util.Uni2Ksc(Util.checkString(req.getParameter("gurt_end_dd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String dlco_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setColt_clsf(colt_clsf);
dm.setSetup_stat(setup_stat);
dm.setGurt_end_dd(gurt_end_dd);
dm.setDlco_cd(dlco_cd);
dm.setDlco_seq(dlco_seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 27 18:18:56 KST 2009 */