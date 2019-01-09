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


public class SL_U_EXTNCLOS_JM_ISSUPDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String closmm;
	public String chgid;

	public SL_U_EXTNCLOS_JM_ISSUPDM(){}
	public SL_U_EXTNCLOS_JM_ISSUPDM(String closmm, String chgid){
		this.closmm = closmm;
		this.chgid = chgid;
	}

	public void setClosmm(String closmm){
		this.closmm = closmm;
	}

	public void setChgid(String chgid){
		this.chgid = chgid;
	}

	public String getClosmm(){
		return this.closmm;
	}

	public String getChgid(){
		return this.chgid;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SL_U_EXTNCLOS_JM_ISSUP(? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_U_EXTNCLOS_JM_ISSUPDM dm = (SL_U_EXTNCLOS_JM_ISSUPDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.closmm);
		cstmt.setString(4, dm.chgid);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SL_U_EXTNCLOS_JM_ISSUPDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("closmm = [" + getClosmm() + "]");
		System.out.println("chgid = [" + getChgid() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String closmm = req.getParameter("closmm");
if( closmm == null){
	System.out.println(this.toString+" : closmm is null" );
}else{
	System.out.println(this.toString+" : closmm is "+closmm );
}
String chgid = req.getParameter("chgid");
if( chgid == null){
	System.out.println(this.toString+" : chgid is null" );
}else{
	System.out.println(this.toString+" : chgid is "+chgid );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String closmm = Util.checkString(req.getParameter("closmm"));
String chgid = Util.checkString(req.getParameter("chgid"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String closmm = Util.Uni2Ksc(Util.checkString(req.getParameter("closmm")));
String chgid = Util.Uni2Ksc(Util.checkString(req.getParameter("chgid")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setClosmm(closmm);
dm.setChgid(chgid);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Mar 01 15:20:16 KST 2015 */