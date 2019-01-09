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


package chosun.ciis.se.snd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.ds.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_2510_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String tran_uprc_clas;
	public String bgn_pay_dt;
	public String end_pay_dt;
	public String incmg_pers;

	public SE_SND_2510_LDM(){}
	public SE_SND_2510_LDM(String cmpy_cd, String tran_uprc_clas, String bgn_pay_dt, String end_pay_dt, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.tran_uprc_clas = tran_uprc_clas;
		this.bgn_pay_dt = bgn_pay_dt;
		this.end_pay_dt = end_pay_dt;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setTran_uprc_clas(String tran_uprc_clas){
		this.tran_uprc_clas = tran_uprc_clas;
	}

	public void setBgn_pay_dt(String bgn_pay_dt){
		this.bgn_pay_dt = bgn_pay_dt;
	}

	public void setEnd_pay_dt(String end_pay_dt){
		this.end_pay_dt = end_pay_dt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getTran_uprc_clas(){
		return this.tran_uprc_clas;
	}

	public String getBgn_pay_dt(){
		return this.bgn_pay_dt;
	}

	public String getEnd_pay_dt(){
		return this.end_pay_dt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_SND_2510_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_2510_LDM dm = (SE_SND_2510_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.tran_uprc_clas);
		cstmt.setString(5, dm.bgn_pay_dt);
		cstmt.setString(6, dm.end_pay_dt);
		cstmt.setString(7, dm.incmg_pers);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_2510_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("tran_uprc_clas = [" + getTran_uprc_clas() + "]");
		System.out.println("bgn_pay_dt = [" + getBgn_pay_dt() + "]");
		System.out.println("end_pay_dt = [" + getEnd_pay_dt() + "]");
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
String tran_uprc_clas = req.getParameter("tran_uprc_clas");
if( tran_uprc_clas == null){
	System.out.println(this.toString+" : tran_uprc_clas is null" );
}else{
	System.out.println(this.toString+" : tran_uprc_clas is "+tran_uprc_clas );
}
String bgn_pay_dt = req.getParameter("bgn_pay_dt");
if( bgn_pay_dt == null){
	System.out.println(this.toString+" : bgn_pay_dt is null" );
}else{
	System.out.println(this.toString+" : bgn_pay_dt is "+bgn_pay_dt );
}
String end_pay_dt = req.getParameter("end_pay_dt");
if( end_pay_dt == null){
	System.out.println(this.toString+" : end_pay_dt is null" );
}else{
	System.out.println(this.toString+" : end_pay_dt is "+end_pay_dt );
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
String tran_uprc_clas = Util.checkString(req.getParameter("tran_uprc_clas"));
String bgn_pay_dt = Util.checkString(req.getParameter("bgn_pay_dt"));
String end_pay_dt = Util.checkString(req.getParameter("end_pay_dt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String tran_uprc_clas = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_uprc_clas")));
String bgn_pay_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("bgn_pay_dt")));
String end_pay_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("end_pay_dt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setTran_uprc_clas(tran_uprc_clas);
dm.setBgn_pay_dt(bgn_pay_dt);
dm.setEnd_pay_dt(end_pay_dt);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 04 20:32:25 KST 2009 */