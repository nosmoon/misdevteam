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


public class FC_ACCT_1046_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String insd_acct_cd;
	public String use_dt;

	public FC_ACCT_1046_LDM(){}
	public FC_ACCT_1046_LDM(String cmpy_cd, String insd_acct_cd, String use_dt){
		this.cmpy_cd = cmpy_cd;
		this.insd_acct_cd = insd_acct_cd;
		this.use_dt = use_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setInsd_acct_cd(String insd_acct_cd){
		this.insd_acct_cd = insd_acct_cd;
	}

	public void setUse_dt(String use_dt){
		this.use_dt = use_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getInsd_acct_cd(){
		return this.insd_acct_cd;
	}

	public String getUse_dt(){
		return this.use_dt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_1046_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_1046_LDM dm = (FC_ACCT_1046_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.insd_acct_cd);
		cstmt.setString(5, dm.use_dt);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_1046_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("insd_acct_cd = [" + getInsd_acct_cd() + "]");
		System.out.println("use_dt = [" + getUse_dt() + "]");
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
String insd_acct_cd = req.getParameter("insd_acct_cd");
if( insd_acct_cd == null){
	System.out.println(this.toString+" : insd_acct_cd is null" );
}else{
	System.out.println(this.toString+" : insd_acct_cd is "+insd_acct_cd );
}
String use_dt = req.getParameter("use_dt");
if( use_dt == null){
	System.out.println(this.toString+" : use_dt is null" );
}else{
	System.out.println(this.toString+" : use_dt is "+use_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String insd_acct_cd = Util.checkString(req.getParameter("insd_acct_cd"));
String use_dt = Util.checkString(req.getParameter("use_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String insd_acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("insd_acct_cd")));
String use_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setInsd_acct_cd(insd_acct_cd);
dm.setUse_dt(use_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 01 17:37:53 KST 2009 */