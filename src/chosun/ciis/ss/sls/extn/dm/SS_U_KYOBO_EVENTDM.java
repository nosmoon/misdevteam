/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_U_KYOBO_EVENTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String rdr_extndt;
	public String rdr_extnno;
	public String chgpers;

	public SS_U_KYOBO_EVENTDM(){}
	public SS_U_KYOBO_EVENTDM(String rdr_extndt, String rdr_extnno, String chgpers){
		this.rdr_extndt = rdr_extndt;
		this.rdr_extnno = rdr_extnno;
		this.chgpers = chgpers;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setRdr_extnno(String rdr_extnno){
		this.rdr_extnno = rdr_extnno;
	}

	public void setChgpers(String chgpers){
		this.chgpers = chgpers;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getRdr_extnno(){
		return this.rdr_extnno;
	}

	public String getChgpers(){
		return this.chgpers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_U_KYOBO_EVENT(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_KYOBO_EVENTDM dm = (SS_U_KYOBO_EVENTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.rdr_extndt);
		cstmt.setString(4, dm.rdr_extnno);
		cstmt.setString(5, dm.chgpers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_U_KYOBO_EVENTDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("rdr_extndt = [" + getRdr_extndt() + "]");
		System.out.println("rdr_extnno = [" + getRdr_extnno() + "]");
		System.out.println("chgpers = [" + getChgpers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String rdr_extndt = req.getParameter("rdr_extndt");
if( rdr_extndt == null){
	System.out.println(this.toString+" : rdr_extndt is null" );
}else{
	System.out.println(this.toString+" : rdr_extndt is "+rdr_extndt );
}
String rdr_extnno = req.getParameter("rdr_extnno");
if( rdr_extnno == null){
	System.out.println(this.toString+" : rdr_extnno is null" );
}else{
	System.out.println(this.toString+" : rdr_extnno is "+rdr_extnno );
}
String chgpers = req.getParameter("chgpers");
if( chgpers == null){
	System.out.println(this.toString+" : chgpers is null" );
}else{
	System.out.println(this.toString+" : chgpers is "+chgpers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String rdr_extndt = Util.checkString(req.getParameter("rdr_extndt"));
String rdr_extnno = Util.checkString(req.getParameter("rdr_extnno"));
String chgpers = Util.checkString(req.getParameter("chgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String rdr_extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extndt")));
String rdr_extnno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnno")));
String chgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("chgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setRdr_extndt(rdr_extndt);
dm.setRdr_extnno(rdr_extnno);
dm.setChgpers(chgpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 06 01:24:51 GMT 2014 */