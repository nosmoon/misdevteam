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


public class FC_ACCT_5382_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String from_fisc_dt;
	public String to_fisc_dt;
	public String from_acct_cd;
	public String to_acct_cd;

	public FC_ACCT_5382_SDM(){}
	public FC_ACCT_5382_SDM(String cmpy_cd, String from_fisc_dt, String to_fisc_dt, String from_acct_cd, String to_acct_cd){
		this.cmpy_cd = cmpy_cd;
		this.from_fisc_dt = from_fisc_dt;
		this.to_fisc_dt = to_fisc_dt;
		this.from_acct_cd = from_acct_cd;
		this.to_acct_cd = to_acct_cd;
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

	public void setFrom_acct_cd(String from_acct_cd){
		this.from_acct_cd = from_acct_cd;
	}

	public void setTo_acct_cd(String to_acct_cd){
		this.to_acct_cd = to_acct_cd;
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

	public String getFrom_acct_cd(){
		return this.from_acct_cd;
	}

	public String getTo_acct_cd(){
		return this.to_acct_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_5382_S(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_5382_SDM dm = (FC_ACCT_5382_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.from_fisc_dt);
		cstmt.setString(5, dm.to_fisc_dt);
		cstmt.setString(6, dm.from_acct_cd);
		cstmt.setString(7, dm.to_acct_cd);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_5382_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("from_fisc_dt = [" + getFrom_fisc_dt() + "]");
		System.out.println("to_fisc_dt = [" + getTo_fisc_dt() + "]");
		System.out.println("from_acct_cd = [" + getFrom_acct_cd() + "]");
		System.out.println("to_acct_cd = [" + getTo_acct_cd() + "]");
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
String from_acct_cd = req.getParameter("from_acct_cd");
if( from_acct_cd == null){
	System.out.println(this.toString+" : from_acct_cd is null" );
}else{
	System.out.println(this.toString+" : from_acct_cd is "+from_acct_cd );
}
String to_acct_cd = req.getParameter("to_acct_cd");
if( to_acct_cd == null){
	System.out.println(this.toString+" : to_acct_cd is null" );
}else{
	System.out.println(this.toString+" : to_acct_cd is "+to_acct_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String from_fisc_dt = Util.checkString(req.getParameter("from_fisc_dt"));
String to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
String from_acct_cd = Util.checkString(req.getParameter("from_acct_cd"));
String to_acct_cd = Util.checkString(req.getParameter("to_acct_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String from_fisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("from_fisc_dt")));
String to_fisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_fisc_dt")));
String from_acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("from_acct_cd")));
String to_acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("to_acct_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFrom_fisc_dt(from_fisc_dt);
dm.setTo_fisc_dt(to_fisc_dt);
dm.setFrom_acct_cd(from_acct_cd);
dm.setTo_acct_cd(to_acct_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 24 12:14:24 KST 2009 */