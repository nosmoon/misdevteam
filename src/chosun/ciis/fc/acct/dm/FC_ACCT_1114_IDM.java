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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_1114_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String busn_yymm;
	public String busn_dt;
	public String busn_dd_clsf_cd;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public FC_ACCT_1114_IDM(){}
	public FC_ACCT_1114_IDM(String cmpy_cd, String busn_yymm, String busn_dt, String busn_dd_clsf_cd, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.busn_yymm = busn_yymm;
		this.busn_dt = busn_dt;
		this.busn_dd_clsf_cd = busn_dd_clsf_cd;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBusn_yymm(String busn_yymm){
		this.busn_yymm = busn_yymm;
	}

	public void setBusn_dt(String busn_dt){
		this.busn_dt = busn_dt;
	}

	public void setBusn_dd_clsf_cd(String busn_dd_clsf_cd){
		this.busn_dd_clsf_cd = busn_dd_clsf_cd;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBusn_yymm(){
		return this.busn_yymm;
	}

	public String getBusn_dt(){
		return this.busn_dt;
	}

	public String getBusn_dd_clsf_cd(){
		return this.busn_dd_clsf_cd;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_1114_I(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_1114_IDM dm = (FC_ACCT_1114_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.busn_yymm);
		cstmt.setString(5, dm.busn_dt);
		cstmt.setString(6, dm.busn_dd_clsf_cd);
		cstmt.setString(7, dm.incmg_pers_ipadd);
		cstmt.setString(8, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_1114_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("busn_yymm = [" + getBusn_yymm() + "]");
		System.out.println("busn_dt = [" + getBusn_dt() + "]");
		System.out.println("busn_dd_clsf_cd = [" + getBusn_dd_clsf_cd() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String busn_yymm = req.getParameter("busn_yymm");
if( busn_yymm == null){
	System.out.println(this.toString+" : busn_yymm is null" );
}else{
	System.out.println(this.toString+" : busn_yymm is "+busn_yymm );
}
String busn_dt = req.getParameter("busn_dt");
if( busn_dt == null){
	System.out.println(this.toString+" : busn_dt is null" );
}else{
	System.out.println(this.toString+" : busn_dt is "+busn_dt );
}
String busn_dd_clsf_cd = req.getParameter("busn_dd_clsf_cd");
if( busn_dd_clsf_cd == null){
	System.out.println(this.toString+" : busn_dd_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : busn_dd_clsf_cd is "+busn_dd_clsf_cd );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
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
String busn_yymm = Util.checkString(req.getParameter("busn_yymm"));
String busn_dt = Util.checkString(req.getParameter("busn_dt"));
String busn_dd_clsf_cd = Util.checkString(req.getParameter("busn_dd_clsf_cd"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String busn_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("busn_yymm")));
String busn_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("busn_dt")));
String busn_dd_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("busn_dd_clsf_cd")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBusn_yymm(busn_yymm);
dm.setBusn_dt(busn_dt);
dm.setBusn_dd_clsf_cd(busn_dd_clsf_cd);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 06 15:24:02 KST 2009 */