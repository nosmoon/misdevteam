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


public class SS_SLS_EXTN_5110_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String fr_yymm;
	public String to_yymm;
	public String proc_yn;

	public SS_SLS_EXTN_5110_LDM(){}
	public SS_SLS_EXTN_5110_LDM(String fr_yymm, String to_yymm, String proc_yn){
		this.fr_yymm = fr_yymm;
		this.to_yymm = to_yymm;
		this.proc_yn = proc_yn;
	}

	public void setFr_yymm(String fr_yymm){
		this.fr_yymm = fr_yymm;
	}

	public void setTo_yymm(String to_yymm){
		this.to_yymm = to_yymm;
	}

	public void setProc_yn(String proc_yn){
		this.proc_yn = proc_yn;
	}

	public String getFr_yymm(){
		return this.fr_yymm;
	}

	public String getTo_yymm(){
		return this.to_yymm;
	}

	public String getProc_yn(){
		return this.proc_yn;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_EXTN_5110_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_EXTN_5110_LDM dm = (SS_SLS_EXTN_5110_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.fr_yymm);
		cstmt.setString(4, dm.to_yymm);
		cstmt.setString(5, dm.proc_yn);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_SLS_EXTN_5110_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("fr_yymm = [" + getFr_yymm() + "]");
		System.out.println("to_yymm = [" + getTo_yymm() + "]");
		System.out.println("proc_yn = [" + getProc_yn() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String fr_yymm = req.getParameter("fr_yymm");
if( fr_yymm == null){
	System.out.println(this.toString+" : fr_yymm is null" );
}else{
	System.out.println(this.toString+" : fr_yymm is "+fr_yymm );
}
String to_yymm = req.getParameter("to_yymm");
if( to_yymm == null){
	System.out.println(this.toString+" : to_yymm is null" );
}else{
	System.out.println(this.toString+" : to_yymm is "+to_yymm );
}
String proc_yn = req.getParameter("proc_yn");
if( proc_yn == null){
	System.out.println(this.toString+" : proc_yn is null" );
}else{
	System.out.println(this.toString+" : proc_yn is "+proc_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String fr_yymm = Util.checkString(req.getParameter("fr_yymm"));
String to_yymm = Util.checkString(req.getParameter("to_yymm"));
String proc_yn = Util.checkString(req.getParameter("proc_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String fr_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_yymm")));
String to_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("to_yymm")));
String proc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFr_yymm(fr_yymm);
dm.setTo_yymm(to_yymm);
dm.setProc_yn(proc_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Oct 04 16:15:05 KST 2016 */