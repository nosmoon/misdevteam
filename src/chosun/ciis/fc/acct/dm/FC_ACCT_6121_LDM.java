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


public class FC_ACCT_6121_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fisc_dt_fr;
	public String fisc_dt_to;
	public String erplace_cd;

	public FC_ACCT_6121_LDM(){}
	public FC_ACCT_6121_LDM(String cmpy_cd, String fisc_dt_fr, String fisc_dt_to, String erplace_cd){
		this.cmpy_cd = cmpy_cd;
		this.fisc_dt_fr = fisc_dt_fr;
		this.fisc_dt_to = fisc_dt_to;
		this.erplace_cd = erplace_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFisc_dt_fr(String fisc_dt_fr){
		this.fisc_dt_fr = fisc_dt_fr;
	}

	public void setFisc_dt_to(String fisc_dt_to){
		this.fisc_dt_to = fisc_dt_to;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFisc_dt_fr(){
		return this.fisc_dt_fr;
	}

	public String getFisc_dt_to(){
		return this.fisc_dt_to;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_6121_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_6121_LDM dm = (FC_ACCT_6121_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fisc_dt_fr);
		cstmt.setString(5, dm.fisc_dt_to);
		cstmt.setString(6, dm.erplace_cd);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_6121_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fisc_dt_fr = [" + getFisc_dt_fr() + "]");
		System.out.println("fisc_dt_to = [" + getFisc_dt_to() + "]");
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
String fisc_dt_fr = req.getParameter("fisc_dt_fr");
if( fisc_dt_fr == null){
	System.out.println(this.toString+" : fisc_dt_fr is null" );
}else{
	System.out.println(this.toString+" : fisc_dt_fr is "+fisc_dt_fr );
}
String fisc_dt_to = req.getParameter("fisc_dt_to");
if( fisc_dt_to == null){
	System.out.println(this.toString+" : fisc_dt_to is null" );
}else{
	System.out.println(this.toString+" : fisc_dt_to is "+fisc_dt_to );
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
String fisc_dt_fr = Util.checkString(req.getParameter("fisc_dt_fr"));
String fisc_dt_to = Util.checkString(req.getParameter("fisc_dt_to"));
String erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fisc_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_dt_fr")));
String fisc_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_dt_to")));
String erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFisc_dt_fr(fisc_dt_fr);
dm.setFisc_dt_to(fisc_dt_to);
dm.setErplace_cd(erplace_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 15 15:11:40 KST 2009 */