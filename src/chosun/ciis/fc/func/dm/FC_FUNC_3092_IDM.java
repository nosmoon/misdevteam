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


public class FC_FUNC_3092_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dlco_cd;
	public String prd_from;
	public String prd_end;
	public String amt;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public FC_FUNC_3092_IDM(){}
	public FC_FUNC_3092_IDM(String cmpy_cd, String dlco_cd, String prd_from, String prd_end, String amt, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.dlco_cd = dlco_cd;
		this.prd_from = prd_from;
		this.prd_end = prd_end;
		this.amt = amt;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setPrd_from(String prd_from){
		this.prd_from = prd_from;
	}

	public void setPrd_end(String prd_end){
		this.prd_end = prd_end;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getPrd_from(){
		return this.prd_from;
	}

	public String getPrd_end(){
		return this.prd_end;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_3092_I(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_3092_IDM dm = (FC_FUNC_3092_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dlco_cd);
		cstmt.setString(5, dm.prd_from);
		cstmt.setString(6, dm.prd_end);
		cstmt.setString(7, dm.amt);
		cstmt.setString(8, dm.incmg_pers);
		cstmt.setString(9, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_3092_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("prd_from = [" + getPrd_from() + "]");
		System.out.println("prd_end = [" + getPrd_end() + "]");
		System.out.println("amt = [" + getAmt() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String prd_from = req.getParameter("prd_from");
if( prd_from == null){
	System.out.println(this.toString+" : prd_from is null" );
}else{
	System.out.println(this.toString+" : prd_from is "+prd_from );
}
String prd_end = req.getParameter("prd_end");
if( prd_end == null){
	System.out.println(this.toString+" : prd_end is null" );
}else{
	System.out.println(this.toString+" : prd_end is "+prd_end );
}
String amt = req.getParameter("amt");
if( amt == null){
	System.out.println(this.toString+" : amt is null" );
}else{
	System.out.println(this.toString+" : amt is "+amt );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String prd_from = Util.checkString(req.getParameter("prd_from"));
String prd_end = Util.checkString(req.getParameter("prd_end"));
String amt = Util.checkString(req.getParameter("amt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String prd_from = Util.Uni2Ksc(Util.checkString(req.getParameter("prd_from")));
String prd_end = Util.Uni2Ksc(Util.checkString(req.getParameter("prd_end")));
String amt = Util.Uni2Ksc(Util.checkString(req.getParameter("amt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDlco_cd(dlco_cd);
dm.setPrd_from(prd_from);
dm.setPrd_end(prd_end);
dm.setAmt(amt);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 14 10:55:00 KST 2009 */