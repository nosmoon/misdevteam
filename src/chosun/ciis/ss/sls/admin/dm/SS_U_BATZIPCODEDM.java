/***************************************************************************************************
* 파일명 : .java
* 기능 : 관리자-일괄 우편번호 변경처리-일괄적용
* 작성일자 : 2009-05-08
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
 * 관리자-일괄 우편번호 변경처리-일괄적용
 */

public class SS_U_BATZIPCODEDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String uid;
	public String newzip1_cnfm;
	public String newzip2_cnfm;
	public String newzip3_cnfm;
	public String newzip4_cnfm;
	public String bocd;

	public SS_U_BATZIPCODEDM(){}
	public SS_U_BATZIPCODEDM(String uid, String newzip1_cnfm, String newzip2_cnfm, String newzip3_cnfm, String newzip4_cnfm, String bocd){
		this.uid = uid;
		this.newzip1_cnfm = newzip1_cnfm;
		this.newzip2_cnfm = newzip2_cnfm;
		this.newzip3_cnfm = newzip3_cnfm;
		this.newzip4_cnfm = newzip4_cnfm;
		this.bocd = bocd;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setNewzip1_cnfm(String newzip1_cnfm){
		this.newzip1_cnfm = newzip1_cnfm;
	}

	public void setNewzip2_cnfm(String newzip2_cnfm){
		this.newzip2_cnfm = newzip2_cnfm;
	}

	public void setNewzip3_cnfm(String newzip3_cnfm){
		this.newzip3_cnfm = newzip3_cnfm;
	}

	public void setNewzip4_cnfm(String newzip4_cnfm){
		this.newzip4_cnfm = newzip4_cnfm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public String getUid(){
		return this.uid;
	}

	public String getNewzip1_cnfm(){
		return this.newzip1_cnfm;
	}

	public String getNewzip2_cnfm(){
		return this.newzip2_cnfm;
	}

	public String getNewzip3_cnfm(){
		return this.newzip3_cnfm;
	}

	public String getNewzip4_cnfm(){
		return this.newzip4_cnfm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_BATZIPCODE( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_BATZIPCODEDM dm = (SS_U_BATZIPCODEDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.uid);
		cstmt.setString(4, dm.newzip1_cnfm);
		cstmt.setString(5, dm.newzip2_cnfm);
		cstmt.setString(6, dm.newzip3_cnfm);
		cstmt.setString(7, dm.newzip4_cnfm);
		cstmt.setString(8, dm.bocd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_U_BATZIPCODEDataSet();
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
String newzip1_cnfm = req.getParameter("newzip1_cnfm");
if( newzip1_cnfm == null){
	System.out.println(this.toString+" : newzip1_cnfm is null" );
}else{
	System.out.println(this.toString+" : newzip1_cnfm is "+newzip1_cnfm );
}
String newzip2_cnfm = req.getParameter("newzip2_cnfm");
if( newzip2_cnfm == null){
	System.out.println(this.toString+" : newzip2_cnfm is null" );
}else{
	System.out.println(this.toString+" : newzip2_cnfm is "+newzip2_cnfm );
}
String newzip3_cnfm = req.getParameter("newzip3_cnfm");
if( newzip3_cnfm == null){
	System.out.println(this.toString+" : newzip3_cnfm is null" );
}else{
	System.out.println(this.toString+" : newzip3_cnfm is "+newzip3_cnfm );
}
String newzip4_cnfm = req.getParameter("newzip4_cnfm");
if( newzip4_cnfm == null){
	System.out.println(this.toString+" : newzip4_cnfm is null" );
}else{
	System.out.println(this.toString+" : newzip4_cnfm is "+newzip4_cnfm );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String uid = Util.checkString(req.getParameter("uid"));
String newzip1_cnfm = Util.checkString(req.getParameter("newzip1_cnfm"));
String newzip2_cnfm = Util.checkString(req.getParameter("newzip2_cnfm"));
String newzip3_cnfm = Util.checkString(req.getParameter("newzip3_cnfm"));
String newzip4_cnfm = Util.checkString(req.getParameter("newzip4_cnfm"));
String bocd = Util.checkString(req.getParameter("bocd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String newzip1_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("newzip1_cnfm")));
String newzip2_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("newzip2_cnfm")));
String newzip3_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("newzip3_cnfm")));
String newzip4_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("newzip4_cnfm")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setUid(uid);
dm.setNewzip1_cnfm(newzip1_cnfm);
dm.setNewzip2_cnfm(newzip2_cnfm);
dm.setNewzip3_cnfm(newzip3_cnfm);
dm.setNewzip4_cnfm(newzip4_cnfm);
dm.setBocd(bocd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 08 17:03:00 KST 2009 */