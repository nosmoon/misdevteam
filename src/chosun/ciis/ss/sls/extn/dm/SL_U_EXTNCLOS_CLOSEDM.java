/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매 확장점검부실 점검마감
* 작성일자 : 2012-01-12
* 작성자 : 이혁
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


public class SL_U_EXTNCLOS_CLOSEDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String closmm;
	public String chgid;
	public String workno;

	public SL_U_EXTNCLOS_CLOSEDM(){}
	public SL_U_EXTNCLOS_CLOSEDM(String closmm, String chgid, String workno){
		this.closmm = closmm;
		this.chgid = chgid;
		this.workno = workno;
	}

	public void setClosmm(String closmm){
		this.closmm = closmm;
	}

	public void setChgid(String chgid){
		this.chgid = chgid;
	}

	public void setWorkno(String workno){
		this.workno = workno;
	}

	public String getClosmm(){
		return this.closmm;
	}

	public String getChgid(){
		return this.chgid;
	}

	public String getWorkno(){
		return this.workno;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SL_U_EXTNCLOS_CLOSE(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_U_EXTNCLOS_CLOSEDM dm = (SL_U_EXTNCLOS_CLOSEDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.closmm);
		cstmt.setString(4, dm.chgid);
		cstmt.setString(5, dm.workno);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SL_U_EXTNCLOS_CLOSEDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("closmm = [" + getClosmm() + "]");
		System.out.println("chgid = [" + getChgid() + "]");
		System.out.println("workno = [" + getWorkno() + "]");
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
String workno = req.getParameter("workno");
if( workno == null){
	System.out.println(this.toString+" : workno is null" );
}else{
	System.out.println(this.toString+" : workno is "+workno );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String closmm = Util.checkString(req.getParameter("closmm"));
String chgid = Util.checkString(req.getParameter("chgid"));
String workno = Util.checkString(req.getParameter("workno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String closmm = Util.Uni2Ksc(Util.checkString(req.getParameter("closmm")));
String chgid = Util.Uni2Ksc(Util.checkString(req.getParameter("chgid")));
String workno = Util.Uni2Ksc(Util.checkString(req.getParameter("workno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setClosmm(closmm);
dm.setChgid(chgid);
dm.setWorkno(workno);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jan 12 14:18:16 KST 2012 */