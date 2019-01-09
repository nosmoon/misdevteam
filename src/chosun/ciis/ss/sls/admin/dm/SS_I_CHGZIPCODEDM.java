/***************************************************************************************************
* 파일명 : .java
* 기능 : 관리자-담당별 우편번호 변경처리 하단저장
* 작성일자 : 2009-05-06
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
 * 관리자-담당별 우편번호 변경처리 하단저장
 */

public class SS_I_CHGZIPCODEDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String uid;
	public String workver;
	public String zip1_cnfm;
	public String zip2_cnfm;
	public String zip3_cnfm;
	public String newaddr1_cnfm;
	public String newaddr2_cnfm;
	public String newaddr3_cnfm;
	public String newaddr4_cnfm;
	public String newbgnbnji_cnfm;
	public String newendbnji_cnfm;
	public String bocd_cnfm;

	public SS_I_CHGZIPCODEDM(){}
	public SS_I_CHGZIPCODEDM(String uid, String workver, String zip1_cnfm, String zip2_cnfm, String zip3_cnfm, String newaddr1_cnfm, String newaddr2_cnfm, String newaddr3_cnfm, String newaddr4_cnfm, String newbgnbnji_cnfm, String newendbnji_cnfm, String bocd_cnfm){
		this.uid = uid;
		this.workver = workver;
		this.zip1_cnfm = zip1_cnfm;
		this.zip2_cnfm = zip2_cnfm;
		this.zip3_cnfm = zip3_cnfm;
		this.newaddr1_cnfm = newaddr1_cnfm;
		this.newaddr2_cnfm = newaddr2_cnfm;
		this.newaddr3_cnfm = newaddr3_cnfm;
		this.newaddr4_cnfm = newaddr4_cnfm;
		this.newbgnbnji_cnfm = newbgnbnji_cnfm;
		this.newendbnji_cnfm = newendbnji_cnfm;
		this.bocd_cnfm = bocd_cnfm;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setWorkver(String workver){
		this.workver = workver;
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

	public void setNewaddr1_cnfm(String newaddr1_cnfm){
		this.newaddr1_cnfm = newaddr1_cnfm;
	}

	public void setNewaddr2_cnfm(String newaddr2_cnfm){
		this.newaddr2_cnfm = newaddr2_cnfm;
	}

	public void setNewaddr3_cnfm(String newaddr3_cnfm){
		this.newaddr3_cnfm = newaddr3_cnfm;
	}

	public void setNewaddr4_cnfm(String newaddr4_cnfm){
		this.newaddr4_cnfm = newaddr4_cnfm;
	}

	public void setNewbgnbnji_cnfm(String newbgnbnji_cnfm){
		this.newbgnbnji_cnfm = newbgnbnji_cnfm;
	}

	public void setNewendbnji_cnfm(String newendbnji_cnfm){
		this.newendbnji_cnfm = newendbnji_cnfm;
	}

	public void setBocd_cnfm(String bocd_cnfm){
		this.bocd_cnfm = bocd_cnfm;
	}

	public String getUid(){
		return this.uid;
	}

	public String getWorkver(){
		return this.workver;
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

	public String getNewaddr1_cnfm(){
		return this.newaddr1_cnfm;
	}

	public String getNewaddr2_cnfm(){
		return this.newaddr2_cnfm;
	}

	public String getNewaddr3_cnfm(){
		return this.newaddr3_cnfm;
	}

	public String getNewaddr4_cnfm(){
		return this.newaddr4_cnfm;
	}

	public String getNewbgnbnji_cnfm(){
		return this.newbgnbnji_cnfm;
	}

	public String getNewendbnji_cnfm(){
		return this.newendbnji_cnfm;
	}

	public String getBocd_cnfm(){
		return this.bocd_cnfm;
	}

	public String getSQL(){
		 return "{ call SP_SS_I_CHGZIPCODE( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_I_CHGZIPCODEDM dm = (SS_I_CHGZIPCODEDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.uid);
		cstmt.setString(4, dm.workver);
		cstmt.setString(5, dm.zip1_cnfm);
		cstmt.setString(6, dm.zip2_cnfm);
		cstmt.setString(7, dm.zip3_cnfm);
		cstmt.setString(8, dm.newaddr1_cnfm);
		cstmt.setString(9, dm.newaddr2_cnfm);
		cstmt.setString(10, dm.newaddr3_cnfm);
		cstmt.setString(11, dm.newaddr4_cnfm);
		cstmt.setString(12, dm.newbgnbnji_cnfm);
		cstmt.setString(13, dm.newendbnji_cnfm);
		cstmt.setString(14, dm.bocd_cnfm);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_I_CHGZIPCODEDataSet();
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
String newaddr1_cnfm = req.getParameter("newaddr1_cnfm");
if( newaddr1_cnfm == null){
	System.out.println(this.toString+" : newaddr1_cnfm is null" );
}else{
	System.out.println(this.toString+" : newaddr1_cnfm is "+newaddr1_cnfm );
}
String newaddr2_cnfm = req.getParameter("newaddr2_cnfm");
if( newaddr2_cnfm == null){
	System.out.println(this.toString+" : newaddr2_cnfm is null" );
}else{
	System.out.println(this.toString+" : newaddr2_cnfm is "+newaddr2_cnfm );
}
String newaddr3_cnfm = req.getParameter("newaddr3_cnfm");
if( newaddr3_cnfm == null){
	System.out.println(this.toString+" : newaddr3_cnfm is null" );
}else{
	System.out.println(this.toString+" : newaddr3_cnfm is "+newaddr3_cnfm );
}
String newaddr4_cnfm = req.getParameter("newaddr4_cnfm");
if( newaddr4_cnfm == null){
	System.out.println(this.toString+" : newaddr4_cnfm is null" );
}else{
	System.out.println(this.toString+" : newaddr4_cnfm is "+newaddr4_cnfm );
}
String newbgnbnji_cnfm = req.getParameter("newbgnbnji_cnfm");
if( newbgnbnji_cnfm == null){
	System.out.println(this.toString+" : newbgnbnji_cnfm is null" );
}else{
	System.out.println(this.toString+" : newbgnbnji_cnfm is "+newbgnbnji_cnfm );
}
String newendbnji_cnfm = req.getParameter("newendbnji_cnfm");
if( newendbnji_cnfm == null){
	System.out.println(this.toString+" : newendbnji_cnfm is null" );
}else{
	System.out.println(this.toString+" : newendbnji_cnfm is "+newendbnji_cnfm );
}
String bocd_cnfm = req.getParameter("bocd_cnfm");
if( bocd_cnfm == null){
	System.out.println(this.toString+" : bocd_cnfm is null" );
}else{
	System.out.println(this.toString+" : bocd_cnfm is "+bocd_cnfm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String uid = Util.checkString(req.getParameter("uid"));
String workver = Util.checkString(req.getParameter("workver"));
String zip1_cnfm = Util.checkString(req.getParameter("zip1_cnfm"));
String zip2_cnfm = Util.checkString(req.getParameter("zip2_cnfm"));
String zip3_cnfm = Util.checkString(req.getParameter("zip3_cnfm"));
String newaddr1_cnfm = Util.checkString(req.getParameter("newaddr1_cnfm"));
String newaddr2_cnfm = Util.checkString(req.getParameter("newaddr2_cnfm"));
String newaddr3_cnfm = Util.checkString(req.getParameter("newaddr3_cnfm"));
String newaddr4_cnfm = Util.checkString(req.getParameter("newaddr4_cnfm"));
String newbgnbnji_cnfm = Util.checkString(req.getParameter("newbgnbnji_cnfm"));
String newendbnji_cnfm = Util.checkString(req.getParameter("newendbnji_cnfm"));
String bocd_cnfm = Util.checkString(req.getParameter("bocd_cnfm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String workver = Util.Uni2Ksc(Util.checkString(req.getParameter("workver")));
String zip1_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("zip1_cnfm")));
String zip2_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("zip2_cnfm")));
String zip3_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("zip3_cnfm")));
String newaddr1_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("newaddr1_cnfm")));
String newaddr2_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("newaddr2_cnfm")));
String newaddr3_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("newaddr3_cnfm")));
String newaddr4_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("newaddr4_cnfm")));
String newbgnbnji_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("newbgnbnji_cnfm")));
String newendbnji_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("newendbnji_cnfm")));
String bocd_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd_cnfm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setUid(uid);
dm.setWorkver(workver);
dm.setZip1_cnfm(zip1_cnfm);
dm.setZip2_cnfm(zip2_cnfm);
dm.setZip3_cnfm(zip3_cnfm);
dm.setNewaddr1_cnfm(newaddr1_cnfm);
dm.setNewaddr2_cnfm(newaddr2_cnfm);
dm.setNewaddr3_cnfm(newaddr3_cnfm);
dm.setNewaddr4_cnfm(newaddr4_cnfm);
dm.setNewbgnbnji_cnfm(newbgnbnji_cnfm);
dm.setNewendbnji_cnfm(newendbnji_cnfm);
dm.setBocd_cnfm(bocd_cnfm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 06 18:35:40 KST 2009 */