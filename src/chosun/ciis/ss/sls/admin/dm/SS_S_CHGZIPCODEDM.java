/***************************************************************************************************
* 파일명 : .java
* 기능 : 관리자-담당별 우편번호 변경처리 상세조회
* 작성일자 : 2009-05-01
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
 * 관리자-담당별 우편번호 변경처리 상세조회
 */

public class SS_S_CHGZIPCODEDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String uid;
	public String workver;
	public String zip1;
	public String zip2;
	public String zip3;
	public String chggubun;

	public SS_S_CHGZIPCODEDM(){}
	public SS_S_CHGZIPCODEDM(String uid, String workver, String zip1, String zip2, String zip3, String chggubun){
		this.uid = uid;
		this.workver = workver;
		this.zip1 = zip1;
		this.zip2 = zip2;
		this.zip3 = zip3;
		this.chggubun = chggubun;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setWorkver(String workver){
		this.workver = workver;
	}

	public void setZip1(String zip1){
		this.zip1 = zip1;
	}

	public void setZip2(String zip2){
		this.zip2 = zip2;
	}

	public void setZip3(String zip3){
		this.zip3 = zip3;
	}

	public void setChggubun(String chggubun){
		this.chggubun = chggubun;
	}

	public String getUid(){
		return this.uid;
	}

	public String getWorkver(){
		return this.workver;
	}

	public String getZip1(){
		return this.zip1;
	}

	public String getZip2(){
		return this.zip2;
	}

	public String getZip3(){
		return this.zip3;
	}

	public String getChggubun(){
		return this.chggubun;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_CHGZIPCODE( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_CHGZIPCODEDM dm = (SS_S_CHGZIPCODEDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.uid);
		cstmt.setString(4, dm.workver);
		cstmt.setString(5, dm.zip1);
		cstmt.setString(6, dm.zip2);
		cstmt.setString(7, dm.zip3);
		cstmt.setString(8, dm.chggubun);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_S_CHGZIPCODEDataSet();
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
String zip1 = req.getParameter("zip1");
if( zip1 == null){
	System.out.println(this.toString+" : zip1 is null" );
}else{
	System.out.println(this.toString+" : zip1 is "+zip1 );
}
String zip2 = req.getParameter("zip2");
if( zip2 == null){
	System.out.println(this.toString+" : zip2 is null" );
}else{
	System.out.println(this.toString+" : zip2 is "+zip2 );
}
String zip3 = req.getParameter("zip3");
if( zip3 == null){
	System.out.println(this.toString+" : zip3 is null" );
}else{
	System.out.println(this.toString+" : zip3 is "+zip3 );
}
String chggubun = req.getParameter("chggubun");
if( chggubun == null){
	System.out.println(this.toString+" : chggubun is null" );
}else{
	System.out.println(this.toString+" : chggubun is "+chggubun );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String uid = Util.checkString(req.getParameter("uid"));
String workver = Util.checkString(req.getParameter("workver"));
String zip1 = Util.checkString(req.getParameter("zip1"));
String zip2 = Util.checkString(req.getParameter("zip2"));
String zip3 = Util.checkString(req.getParameter("zip3"));
String chggubun = Util.checkString(req.getParameter("chggubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String workver = Util.Uni2Ksc(Util.checkString(req.getParameter("workver")));
String zip1 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip1")));
String zip2 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip2")));
String zip3 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip3")));
String chggubun = Util.Uni2Ksc(Util.checkString(req.getParameter("chggubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setUid(uid);
dm.setWorkver(workver);
dm.setZip1(zip1);
dm.setZip2(zip2);
dm.setZip3(zip3);
dm.setChggubun(chggubun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 06 16:18:06 KST 2009 */