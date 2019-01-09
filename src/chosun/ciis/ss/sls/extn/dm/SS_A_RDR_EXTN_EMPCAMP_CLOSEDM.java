/***************************************************************************************************
* 파일명 : SS_A_RDR_EXTN_EMPCAMP_CLOSEDM.java
* 기능 : 사원확장 대회 마감을 위한 DM
* 작성일자 : 2003-12-11
* 작성자 : 김대섭
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
 * class definition
 *
 */


public class SS_A_RDR_EXTN_EMPCAMP_CLOSEDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String accflag;
	public String rdr_extncampno;

	public SS_A_RDR_EXTN_EMPCAMP_CLOSEDM(){}
	public SS_A_RDR_EXTN_EMPCAMP_CLOSEDM(String incmgpers, String accflag, String rdr_extncampno){
		this.incmgpers = incmgpers;
		this.accflag = accflag;
		this.rdr_extncampno = rdr_extncampno;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setRdr_extncampno(String rdr_extncampno){
		this.rdr_extncampno = rdr_extncampno;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getRdr_extncampno(){
		return this.rdr_extncampno;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_RDR_EXTN_EMPCAMP_CLOSE( ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_RDR_EXTN_EMPCAMP_CLOSEDM dm = (SS_A_RDR_EXTN_EMPCAMP_CLOSEDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.rdr_extncampno);
		cstmt.registerOutParameter(6, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_A_RDR_EXTN_EMPCAMP_CLOSEDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String rdr_extncampno = req.getParameter("rdr_extncampno");
if( rdr_extncampno == null){
	System.out.println(this.toString+" : rdr_extncampno is null" );
}else{
	System.out.println(this.toString+" : rdr_extncampno is "+rdr_extncampno );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String accflag = Util.checkString(req.getParameter("accflag"));
String rdr_extncampno = Util.checkString(req.getParameter("rdr_extncampno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String rdr_extncampno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extncampno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setAccflag(accflag);
dm.setRdr_extncampno(rdr_extncampno);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Dec 12 20:34:26 KST 2003 */