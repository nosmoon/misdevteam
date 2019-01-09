/***************************************************************************************************
* 파일명 : .java
* 기능 : 관리자-담당별 우편번호 변경처리 삭제
* 작성일자 : 2009-04-29
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * 관리자-담당별 우편번호 변경처리 삭제
 */

public class SS_D_CHGZIPCODEDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String uid;
	public String workver;
	public String chgclsf_cnfm;
	public String zip1_cnfm;
	public String zip2_cnfm;
	public String zip3_cnfm;

	public SS_D_CHGZIPCODEDM(){}
	public SS_D_CHGZIPCODEDM(String uid, String workver, String chgclsf_cnfm, String zip1_cnfm, String zip2_cnfm, String zip3_cnfm){
		this.uid = uid;
		this.workver = workver;
		this.chgclsf_cnfm = chgclsf_cnfm;
		this.zip1_cnfm = zip1_cnfm;
		this.zip2_cnfm = zip2_cnfm;
		this.zip3_cnfm = zip3_cnfm;				
	}
		
	public void setUid(String uid){
		this.uid = uid;
	}

	public void setWorkver(String workver){
		this.workver = workver;
	}

	public void setChgclsf_cnfm(String chgclsf_cnfm){
		this.chgclsf_cnfm = chgclsf_cnfm;
	}

	public void setZip1_cnfm(String zip1_cnfm){
		this.zip1_cnfm = zip1_cnfm;
	}

	public void setZip2_cnfm(String zip2_cnfm){
		this.zip2_cnfm = zip2_cnfm;
	}

	public void setZip3_cnfm(String zip3_cnfm){
		this.zip3_cnfm = zip3_cnfm;
	}

	public String getUid(){
		return this.uid;
	}

	public String getWorkver(){
		return this.workver;
	}

	public String getChgclsf_cnfm(){
		return this.chgclsf_cnfm;
	}

	public String getZip1_cnfm(){
		return this.zip1_cnfm;
	}

	public String getZip2_cnfm(){
		return this.zip2_cnfm;
	}

	public String getZip3_cnfm(){
		return this.zip3_cnfm;
	}

	public String getSQL(){
		 return "{ call SP_SS_D_CHGZIPCODE( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_D_CHGZIPCODEDM dm = (SS_D_CHGZIPCODEDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.uid);
		cstmt.setString(4, dm.workver);
		cstmt.setString(5, dm.chgclsf_cnfm);
		cstmt.setString(6, dm.zip1_cnfm);
		cstmt.setString(7, dm.zip2_cnfm);
		cstmt.setString(8, dm.zip3_cnfm);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_D_CHGZIPCODEDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String uid = req.getParameter("uid");
if( uid == null){
	System.out.println(this.toString+" : uid is null" );
}else{
	System.out.println(this.toString+" : uid is "+uid );
}
String workver = req.getParameter("workver");
if( workver == null){
	System.out.println(this.toString+" : workver is null" );
}else{
	System.out.println(this.toString+" : workver is "+workver );
}
String chgclsf_cnfm = req.getParameter("chgclsf_cnfm");
if( chgclsf_cnfm == null){
	System.out.println(this.toString+" : chgclsf_cnfm is null" );
}else{
	System.out.println(this.toString+" : chgclsf_cnfm is "+chgclsf_cnfm );
}
String zip1_cnfm = req.getParameter("zip1_cnfm");
if( zip1_cnfm == null){
	System.out.println(this.toString+" : zip1_cnfm is null" );
}else{
	System.out.println(this.toString+" : zip1_cnfm is "+zip1_cnfm );
}
String zip2_cnfm = req.getParameter("zip2_cnfm");
if( zip2_cnfm == null){
	System.out.println(this.toString+" : zip2_cnfm is null" );
}else{
	System.out.println(this.toString+" : zip2_cnfm is "+zip2_cnfm );
}
String zip3_cnfm = req.getParameter("zip3_cnfm");
if( zip3_cnfm == null){
	System.out.println(this.toString+" : zip3_cnfm is null" );
}else{
	System.out.println(this.toString+" : zip3_cnfm is "+zip3_cnfm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String uid = Util.checkString(req.getParameter("uid"));
String workver = Util.checkString(req.getParameter("workver"));
String chgclsf_cnfm = Util.checkString(req.getParameter("chgclsf_cnfm"));
String zip1_cnfm = Util.checkString(req.getParameter("zip1_cnfm"));
String zip2_cnfm = Util.checkString(req.getParameter("zip2_cnfm"));
String zip3_cnfm = Util.checkString(req.getParameter("zip3_cnfm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String workver = Util.Uni2Ksc(Util.checkString(req.getParameter("workver")));
String chgclsf_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("chgclsf_cnfm")));
String zip1_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("zip1_cnfm")));
String zip2_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("zip2_cnfm")));
String zip3_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("zip3_cnfm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setUid(uid);
dm.setWorkver(workver);
dm.setChgclsf_cnfm(chgclsf_cnfm);
dm.setZip1_cnfm(zip1_cnfm);
dm.setZip2_cnfm(zip2_cnfm);
dm.setZip3_cnfm(zip3_cnfm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 30 15:13:44 KST 2009 */