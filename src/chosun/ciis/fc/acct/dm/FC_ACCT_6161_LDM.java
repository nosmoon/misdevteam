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


public class FC_ACCT_6161_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String from_fisc_dt;
	public String to_fisc_dt;
	public String erplace_cd;

	public FC_ACCT_6161_LDM(){}
	public FC_ACCT_6161_LDM(String cmpy_cd, String from_fisc_dt, String to_fisc_dt, String erplace_cd){
		this.cmpy_cd = cmpy_cd;
		this.from_fisc_dt = from_fisc_dt;
		this.to_fisc_dt = to_fisc_dt;
		this.erplace_cd = erplace_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFrom_fisc_dt(String from_fisc_dt){
		this.from_fisc_dt = from_fisc_dt;
	}

	public void setTo_fisc_dt(String to_fisc_dt){
		this.to_fisc_dt = to_fisc_dt;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFrom_fisc_dt(){
		return this.from_fisc_dt;
	}

	public String getTo_fisc_dt(){
		return this.to_fisc_dt;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_6161_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_6161_LDM dm = (FC_ACCT_6161_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.from_fisc_dt);
		cstmt.setString(5, dm.to_fisc_dt);
		cstmt.setString(6, dm.erplace_cd);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_6161_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("from_fisc_dt = [" + getFrom_fisc_dt() + "]");
		System.out.println("to_fisc_dt = [" + getTo_fisc_dt() + "]");
		System.out.println("erplace_cd = [" + getErplace_cd() + "]");
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
String from_fisc_dt = req.getParameter("from_fisc_dt");
if( from_fisc_dt == null){
	System.out.println(this.toString+" : from_fisc_dt is null" );
}else{
	System.out.println(this.toString+" : from_fisc_dt is "+from_fisc_dt );
}
String to_fisc_dt = req.getParameter("to_fisc_dt");
if( to_fisc_dt == null){
	System.out.println(this.toString+" : to_fisc_dt is null" );
}else{
	System.out.println(this.toString+" : to_fisc_dt is "+to_fisc_dt );
}
String erplace_cd = req.getParameter("erplace_cd");
if( erplace_cd == null){
	System.out.println(this.toString+" : erplace_cd is null" );
}else{
	System.out.println(this.toString+" : erplace_cd is "+erplace_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String from_fisc_dt = Util.checkString(req.getParameter("from_fisc_dt"));
String to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
String erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String from_fisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("from_fisc_dt")));
String to_fisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_fisc_dt")));
String erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFrom_fisc_dt(from_fisc_dt);
dm.setTo_fisc_dt(to_fisc_dt);
dm.setErplace_cd(erplace_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 15 16:08:12 KST 2009 */