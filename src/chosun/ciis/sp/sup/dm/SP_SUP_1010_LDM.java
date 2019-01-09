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


package chosun.ciis.sp.sup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sup.ds.*;
import chosun.ciis.sp.sup.rec.*;

/**
 * 
 */


public class SP_SUP_1010_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dt;
	public String purc_dlco_clsf_cd_seq;
	public String chrg_pers;
	public String incmg_pers;

	public SP_SUP_1010_LDM(){}
	public SP_SUP_1010_LDM(String cmpy_cd, String dt, String purc_dlco_clsf_cd_seq, String chrg_pers, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.dt = dt;
		this.purc_dlco_clsf_cd_seq = purc_dlco_clsf_cd_seq;
		this.chrg_pers = chrg_pers;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDt(String dt){
		this.dt = dt;
	}

	public void setPurc_dlco_clsf_cd_seq(String purc_dlco_clsf_cd_seq){
		this.purc_dlco_clsf_cd_seq = purc_dlco_clsf_cd_seq;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDt(){
		return this.dt;
	}

	public String getPurc_dlco_clsf_cd_seq(){
		return this.purc_dlco_clsf_cd_seq;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SUP_1010_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SUP_1010_LDM dm = (SP_SUP_1010_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dt);
		cstmt.setString(5, dm.purc_dlco_clsf_cd_seq);
		cstmt.setString(6, dm.chrg_pers);
		cstmt.setString(7, dm.incmg_pers);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sup.ds.SP_SUP_1010_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dt = [" + getDt() + "]");
		System.out.println("purc_dlco_clsf_cd_seq = [" + getPurc_dlco_clsf_cd_seq() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
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
String dt = req.getParameter("dt");
if( dt == null){
	System.out.println(this.toString+" : dt is null" );
}else{
	System.out.println(this.toString+" : dt is "+dt );
}
String purc_dlco_clsf_cd_seq = req.getParameter("purc_dlco_clsf_cd_seq");
if( purc_dlco_clsf_cd_seq == null){
	System.out.println(this.toString+" : purc_dlco_clsf_cd_seq is null" );
}else{
	System.out.println(this.toString+" : purc_dlco_clsf_cd_seq is "+purc_dlco_clsf_cd_seq );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
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
String dt = Util.checkString(req.getParameter("dt"));
String purc_dlco_clsf_cd_seq = Util.checkString(req.getParameter("purc_dlco_clsf_cd_seq"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dt = Util.Uni2Ksc(Util.checkString(req.getParameter("dt")));
String purc_dlco_clsf_cd_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_dlco_clsf_cd_seq")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDt(dt);
dm.setPurc_dlco_clsf_cd_seq(purc_dlco_clsf_cd_seq);
dm.setChrg_pers(chrg_pers);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 23 16:58:10 KST 2012 */