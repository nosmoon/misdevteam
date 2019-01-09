/***************************************************************************************************
* 파일명 : .java
* 기능 : * 관리자-담당별 우편번호 변경처리-판매국 복사
* 작성일자 : 2010-03-21
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 *  관리자-담당별 우편번호 변경처리-판매국 복사
 */

public class SS_I_COPYZIPCODEDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String uid;
	public String workver;
	public String zip1_cnfm;
	public String zip2_cnfm;
	public String zip3_cnfm;
	public String newzipcode_cnfm;
	public String oldzipcode_cnfm;
	public String chgclsf_cnfm;

	public SS_I_COPYZIPCODEDM(){}
	public SS_I_COPYZIPCODEDM(String uid, String workver, String zip1_cnfm, String zip2_cnfm, String zip3_cnfm, String newzipcode_cnfm, String oldzipcode_cnfm, String chgclsf_cnfm){
		this.uid = uid;
		this.workver = workver;
		this.zip1_cnfm = zip1_cnfm;
		this.zip2_cnfm = zip2_cnfm;
		this.zip3_cnfm = zip3_cnfm;
		this.newzipcode_cnfm = newzipcode_cnfm;
		this.oldzipcode_cnfm = oldzipcode_cnfm;
		this.chgclsf_cnfm = chgclsf_cnfm;
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

	public void setNewzipcode_cnfm(String newzipcode_cnfm){
		this.newzipcode_cnfm = newzipcode_cnfm;
	}

	public void setOldzipcode_cnfm(String oldzipcode_cnfm){
		this.oldzipcode_cnfm = oldzipcode_cnfm;
	}

	public void setChgclsf_cnfm(String chgclsf_cnfm){
		this.chgclsf_cnfm = chgclsf_cnfm;
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

	public String getNewzipcode_cnfm(){
		return this.newzipcode_cnfm;
	}

	public String getOldzipcode_cnfm(){
		return this.oldzipcode_cnfm;
	}

	public String getChgclsf_cnfm(){
		return this.chgclsf_cnfm;
	}

	public String getSQL(){
		 return "{ call SP_SS_I_COPYZIPCODE( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_I_COPYZIPCODEDM dm = (SS_I_COPYZIPCODEDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.uid);
		cstmt.setString(4, dm.workver);
		cstmt.setString(5, dm.zip1_cnfm);
		cstmt.setString(6, dm.zip2_cnfm);
		cstmt.setString(7, dm.zip3_cnfm);
		cstmt.setString(8, dm.newzipcode_cnfm);
		cstmt.setString(9, dm.oldzipcode_cnfm);
		cstmt.setString(10, dm.chgclsf_cnfm);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_I_COPYZIPCODEDataSet();
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
String newzipcode_cnfm = req.getParameter("newzipcode_cnfm");
if( newzipcode_cnfm == null){
	System.out.println(this.toString+" : newzipcode_cnfm is null" );
}else{
	System.out.println(this.toString+" : newzipcode_cnfm is "+newzipcode_cnfm );
}
String oldzipcode_cnfm = req.getParameter("oldzipcode_cnfm");
if( oldzipcode_cnfm == null){
	System.out.println(this.toString+" : oldzipcode_cnfm is null" );
}else{
	System.out.println(this.toString+" : oldzipcode_cnfm is "+oldzipcode_cnfm );
}
String chgclsf_cnfm = req.getParameter("chgclsf_cnfm");
if( chgclsf_cnfm == null){
	System.out.println(this.toString+" : chgclsf_cnfm is null" );
}else{
	System.out.println(this.toString+" : chgclsf_cnfm is "+chgclsf_cnfm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String uid = Util.checkString(req.getParameter("uid"));
String workver = Util.checkString(req.getParameter("workver"));
String zip1_cnfm = Util.checkString(req.getParameter("zip1_cnfm"));
String zip2_cnfm = Util.checkString(req.getParameter("zip2_cnfm"));
String zip3_cnfm = Util.checkString(req.getParameter("zip3_cnfm"));
String newzipcode_cnfm = Util.checkString(req.getParameter("newzipcode_cnfm"));
String oldzipcode_cnfm = Util.checkString(req.getParameter("oldzipcode_cnfm"));
String chgclsf_cnfm = Util.checkString(req.getParameter("chgclsf_cnfm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String workver = Util.Uni2Ksc(Util.checkString(req.getParameter("workver")));
String zip1_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("zip1_cnfm")));
String zip2_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("zip2_cnfm")));
String zip3_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("zip3_cnfm")));
String newzipcode_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("newzipcode_cnfm")));
String oldzipcode_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("oldzipcode_cnfm")));
String chgclsf_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("chgclsf_cnfm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setUid(uid);
dm.setWorkver(workver);
dm.setZip1_cnfm(zip1_cnfm);
dm.setZip2_cnfm(zip2_cnfm);
dm.setZip3_cnfm(zip3_cnfm);
dm.setNewzipcode_cnfm(newzipcode_cnfm);
dm.setOldzipcode_cnfm(oldzipcode_cnfm);
dm.setChgclsf_cnfm(chgclsf_cnfm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Mar 21 11:40:58 KST 2010 */