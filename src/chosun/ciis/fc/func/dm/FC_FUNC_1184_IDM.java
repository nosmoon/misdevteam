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


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_1184_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String pch_compnm;
	public String stat_dt;
	public String sbbsamt;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String use_dept_cd;

	public FC_FUNC_1184_IDM(){}
	public FC_FUNC_1184_IDM(String cmpy_cd, String dlco_clsf_cd, String dlco_cd, String pch_compnm, String stat_dt, String sbbsamt, String incmg_pers, String incmg_pers_ipadd, String use_dept_cd){
		this.cmpy_cd = cmpy_cd;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.pch_compnm = pch_compnm;
		this.stat_dt = stat_dt;
		this.sbbsamt = sbbsamt;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.use_dept_cd = use_dept_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setPch_compnm(String pch_compnm){
		this.pch_compnm = pch_compnm;
	}

	public void setStat_dt(String stat_dt){
		this.stat_dt = stat_dt;
	}

	public void setSbbsamt(String sbbsamt){
		this.sbbsamt = sbbsamt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getPch_compnm(){
		return this.pch_compnm;
	}

	public String getStat_dt(){
		return this.stat_dt;
	}

	public String getSbbsamt(){
		return this.sbbsamt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_1184_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_1184_IDM dm = (FC_FUNC_1184_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dlco_clsf_cd);
		cstmt.setString(5, dm.dlco_cd);
		cstmt.setString(6, dm.pch_compnm);
		cstmt.setString(7, dm.stat_dt);
		cstmt.setString(8, dm.sbbsamt);
		cstmt.setString(9, dm.incmg_pers);
		cstmt.setString(10, dm.incmg_pers_ipadd);
		cstmt.setString(11, dm.use_dept_cd);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_1184_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("pch_compnm = [" + getPch_compnm() + "]");
		System.out.println("stat_dt = [" + getStat_dt() + "]");
		System.out.println("sbbsamt = [" + getSbbsamt() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("use_dept_cd = [" + getUse_dept_cd() + "]");
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
String dlco_clsf_cd = req.getParameter("dlco_clsf_cd");
if( dlco_clsf_cd == null){
	System.out.println(this.toString+" : dlco_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd is "+dlco_clsf_cd );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String pch_compnm = req.getParameter("pch_compnm");
if( pch_compnm == null){
	System.out.println(this.toString+" : pch_compnm is null" );
}else{
	System.out.println(this.toString+" : pch_compnm is "+pch_compnm );
}
String stat_dt = req.getParameter("stat_dt");
if( stat_dt == null){
	System.out.println(this.toString+" : stat_dt is null" );
}else{
	System.out.println(this.toString+" : stat_dt is "+stat_dt );
}
String sbbsamt = req.getParameter("sbbsamt");
if( sbbsamt == null){
	System.out.println(this.toString+" : sbbsamt is null" );
}else{
	System.out.println(this.toString+" : sbbsamt is "+sbbsamt );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String use_dept_cd = req.getParameter("use_dept_cd");
if( use_dept_cd == null){
	System.out.println(this.toString+" : use_dept_cd is null" );
}else{
	System.out.println(this.toString+" : use_dept_cd is "+use_dept_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String pch_compnm = Util.checkString(req.getParameter("pch_compnm"));
String stat_dt = Util.checkString(req.getParameter("stat_dt"));
String sbbsamt = Util.checkString(req.getParameter("sbbsamt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String pch_compnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_compnm")));
String stat_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("stat_dt")));
String sbbsamt = Util.Uni2Ksc(Util.checkString(req.getParameter("sbbsamt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setPch_compnm(pch_compnm);
dm.setStat_dt(stat_dt);
dm.setSbbsamt(sbbsamt);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setUse_dept_cd(use_dept_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 27 12:53:08 KST 2009 */