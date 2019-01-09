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


public class FC_FUNC_3074_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fund_cd;
	public String expn_yymm;
	public String expn_dt;
	public String expn_dt_u;
	public String expn_amt;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public FC_FUNC_3074_IDM(){}
	public FC_FUNC_3074_IDM(String cmpy_cd, String fund_cd, String expn_yymm, String expn_dt, String expn_dt_u, String expn_amt, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.fund_cd = fund_cd;
		this.expn_yymm = expn_yymm;
		this.expn_dt = expn_dt;
		this.expn_dt_u = expn_dt_u;
		this.expn_amt = expn_amt;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFund_cd(String fund_cd){
		this.fund_cd = fund_cd;
	}

	public void setExpn_yymm(String expn_yymm){
		this.expn_yymm = expn_yymm;
	}

	public void setExpn_dt(String expn_dt){
		this.expn_dt = expn_dt;
	}

	public void setExpn_dt_u(String expn_dt_u){
		this.expn_dt_u = expn_dt_u;
	}

	public void setExpn_amt(String expn_amt){
		this.expn_amt = expn_amt;
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

	public String getFund_cd(){
		return this.fund_cd;
	}

	public String getExpn_yymm(){
		return this.expn_yymm;
	}

	public String getExpn_dt(){
		return this.expn_dt;
	}

	public String getExpn_dt_u(){
		return this.expn_dt_u;
	}

	public String getExpn_amt(){
		return this.expn_amt;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_3074_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_3074_IDM dm = (FC_FUNC_3074_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fund_cd);
		cstmt.setString(5, dm.expn_yymm);
		cstmt.setString(6, dm.expn_dt);
		cstmt.setString(7, dm.expn_dt_u);
		cstmt.setString(8, dm.expn_amt);
		cstmt.setString(9, dm.incmg_pers_ipadd);
		cstmt.setString(10, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_3074_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fund_cd = [" + getFund_cd() + "]");
		System.out.println("expn_yymm = [" + getExpn_yymm() + "]");
		System.out.println("expn_dt = [" + getExpn_dt() + "]");
		System.out.println("expn_dt_u = [" + getExpn_dt_u() + "]");
		System.out.println("expn_amt = [" + getExpn_amt() + "]");
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
String fund_cd = req.getParameter("fund_cd");
if( fund_cd == null){
	System.out.println(this.toString+" : fund_cd is null" );
}else{
	System.out.println(this.toString+" : fund_cd is "+fund_cd );
}
String expn_yymm = req.getParameter("expn_yymm");
if( expn_yymm == null){
	System.out.println(this.toString+" : expn_yymm is null" );
}else{
	System.out.println(this.toString+" : expn_yymm is "+expn_yymm );
}
String expn_dt = req.getParameter("expn_dt");
if( expn_dt == null){
	System.out.println(this.toString+" : expn_dt is null" );
}else{
	System.out.println(this.toString+" : expn_dt is "+expn_dt );
}
String expn_dt_u = req.getParameter("expn_dt_u");
if( expn_dt_u == null){
	System.out.println(this.toString+" : expn_dt_u is null" );
}else{
	System.out.println(this.toString+" : expn_dt_u is "+expn_dt_u );
}
String expn_amt = req.getParameter("expn_amt");
if( expn_amt == null){
	System.out.println(this.toString+" : expn_amt is null" );
}else{
	System.out.println(this.toString+" : expn_amt is "+expn_amt );
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
String fund_cd = Util.checkString(req.getParameter("fund_cd"));
String expn_yymm = Util.checkString(req.getParameter("expn_yymm"));
String expn_dt = Util.checkString(req.getParameter("expn_dt"));
String expn_dt_u = Util.checkString(req.getParameter("expn_dt_u"));
String expn_amt = Util.checkString(req.getParameter("expn_amt"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fund_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("fund_cd")));
String expn_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("expn_yymm")));
String expn_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("expn_dt")));
String expn_dt_u = Util.Uni2Ksc(Util.checkString(req.getParameter("expn_dt_u")));
String expn_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("expn_amt")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFund_cd(fund_cd);
dm.setExpn_yymm(expn_yymm);
dm.setExpn_dt(expn_dt);
dm.setExpn_dt_u(expn_dt_u);
dm.setExpn_amt(expn_amt);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 30 14:05:22 KST 2009 */