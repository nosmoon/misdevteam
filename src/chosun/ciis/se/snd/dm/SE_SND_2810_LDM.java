/***************************************************************************************************
* 파일명 : SE_SND_2810_LDM.java
* 기능 : 발송관리 - 마감관리 - 발송정보 DOWNLOAD
* 작성일자 : 2009-03-25
* 작성자 : 김대준
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


public class SE_SND_2810_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String bgn_issu_dt;
	public String end_issu_dt;
	public String incmg_pers;

	public SE_SND_2810_LDM(){}
	public SE_SND_2810_LDM(String cmpy_cd, String bgn_issu_dt, String end_issu_dt, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.bgn_issu_dt = bgn_issu_dt;
		this.end_issu_dt = end_issu_dt;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBgn_issu_dt(String bgn_issu_dt){
		this.bgn_issu_dt = bgn_issu_dt;
	}

	public void setEnd_issu_dt(String end_issu_dt){
		this.end_issu_dt = end_issu_dt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBgn_issu_dt(){
		return this.bgn_issu_dt;
	}

	public String getEnd_issu_dt(){
		return this.end_issu_dt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_SE_SND_2810_L( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_2810_LDM dm = (SE_SND_2810_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.bgn_issu_dt);
		cstmt.setString(5, dm.end_issu_dt);
		cstmt.setString(6, dm.incmg_pers);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_2810_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("bgn_issu_dt = " + getBgn_issu_dt());
        System.out.println("end_issu_dt = " + getEnd_issu_dt());
        System.out.println("incmg_pers = " + getIncmg_pers());
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
String bgn_issu_dt = req.getParameter("bgn_issu_dt");
if( bgn_issu_dt == null){
	System.out.println(this.toString+" : bgn_issu_dt is null" );
}else{
	System.out.println(this.toString+" : bgn_issu_dt is "+bgn_issu_dt );
}
String end_issu_dt = req.getParameter("end_issu_dt");
if( end_issu_dt == null){
	System.out.println(this.toString+" : end_issu_dt is null" );
}else{
	System.out.println(this.toString+" : end_issu_dt is "+end_issu_dt );
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
String bgn_issu_dt = Util.checkString(req.getParameter("bgn_issu_dt"));
String end_issu_dt = Util.checkString(req.getParameter("end_issu_dt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String bgn_issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("bgn_issu_dt")));
String end_issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("end_issu_dt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBgn_issu_dt(bgn_issu_dt);
dm.setEnd_issu_dt(end_issu_dt);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 25 20:29:53 KST 2009 */