/***************************************************************************************************
* 파일명 : SS_A_MIGLLMMT_CLOS_CLOSEDM.java
* 기능 : 관리자-마일리지-마감-마감,마감취소를 위한 DM
* 작성일자 : 2004-03-20
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * 관리자-마일리지-마감-마감,마감취소를 위한 DM
 */

public class SS_A_MIGLLMMT_CLOS_CLOSEDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String accflag;
	public String basidt;

	public SS_A_MIGLLMMT_CLOS_CLOSEDM(){}
	public SS_A_MIGLLMMT_CLOS_CLOSEDM(String incmgpers, String accflag, String basidt){
		this.incmgpers = incmgpers;
		this.accflag = accflag;
		this.basidt = basidt;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_MIGLLMMT_CLOS_CLOSE( ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_MIGLLMMT_CLOS_CLOSEDM dm = (SS_A_MIGLLMMT_CLOS_CLOSEDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.basidt);
		cstmt.registerOutParameter(6, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_A_MIGLLMMT_CLOS_CLOSEDataSet();
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
String basidt = req.getParameter("basidt");
if( basidt == null){
	System.out.println(this.toString+" : basidt is null" );
}else{
	System.out.println(this.toString+" : basidt is "+basidt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String accflag = Util.checkString(req.getParameter("accflag"));
String basidt = Util.checkString(req.getParameter("basidt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String basidt = Util.Uni2Ksc(Util.checkString(req.getParameter("basidt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setAccflag(accflag);
dm.setBasidt(basidt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 22 11:37:23 KST 2004 */