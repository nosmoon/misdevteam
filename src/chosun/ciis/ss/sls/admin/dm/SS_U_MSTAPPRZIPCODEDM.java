/***************************************************************************************************
* 파일명 : .java
* 기능 : 마스터 우편번호 변경처리 승인
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
 * 마스터 우편번호 변경처리 승인
 */

public class SS_U_MSTAPPRZIPCODEDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String uid;
	public String newzip1;
	public String newzip2;
	public String newzip3;
	public String newzip4;
	public String workver;

	public SS_U_MSTAPPRZIPCODEDM(){}
	public SS_U_MSTAPPRZIPCODEDM(String uid, String newzip1, String newzip2, String newzip3, String newzip4, String workver){
		this.uid = uid;
		this.newzip1 = newzip1;
		this.newzip2 = newzip2;
		this.newzip3 = newzip3;
		this.newzip4 = newzip4;
		this.workver = workver;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setNewzip1(String newzip1){
		this.newzip1 = newzip1;
	}

	public void setNewzip2(String newzip2){
		this.newzip2 = newzip2;
	}

	public void setNewzip3(String newzip3){
		this.newzip3 = newzip3;
	}

	public void setNewzip4(String newzip4){
		this.newzip4 = newzip4;
	}

	public void setWorkver(String workver){
		this.workver = workver;
	}

	public String getUid(){
		return this.uid;
	}

	public String getNewzip1(){
		return this.newzip1;
	}

	public String getNewzip2(){
		return this.newzip2;
	}

	public String getNewzip3(){
		return this.newzip3;
	}

	public String getNewzip4(){
		return this.newzip4;
	}

	public String getWorkver(){
		return this.workver;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_MSTAPPRZIPCODE( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_MSTAPPRZIPCODEDM dm = (SS_U_MSTAPPRZIPCODEDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.uid);
		cstmt.setString(4, dm.newzip1);
		cstmt.setString(5, dm.newzip2);
		cstmt.setString(6, dm.newzip3);
		cstmt.setString(7, dm.newzip4);
		cstmt.setString(8, dm.workver);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_U_MSTAPPRZIPCODEDataSet();
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
String newzip1 = req.getParameter("newzip1");
if( newzip1 == null){
	System.out.println(this.toString+" : newzip1 is null" );
}else{
	System.out.println(this.toString+" : newzip1 is "+newzip1 );
}
String newzip2 = req.getParameter("newzip2");
if( newzip2 == null){
	System.out.println(this.toString+" : newzip2 is null" );
}else{
	System.out.println(this.toString+" : newzip2 is "+newzip2 );
}
String newzip3 = req.getParameter("newzip3");
if( newzip3 == null){
	System.out.println(this.toString+" : newzip3 is null" );
}else{
	System.out.println(this.toString+" : newzip3 is "+newzip3 );
}
String newzip4 = req.getParameter("newzip4");
if( newzip4 == null){
	System.out.println(this.toString+" : newzip4 is null" );
}else{
	System.out.println(this.toString+" : newzip4 is "+newzip4 );
}
String workver = req.getParameter("workver");
if( workver == null){
	System.out.println(this.toString+" : workver is null" );
}else{
	System.out.println(this.toString+" : workver is "+workver );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String uid = Util.checkString(req.getParameter("uid"));
String newzip1 = Util.checkString(req.getParameter("newzip1"));
String newzip2 = Util.checkString(req.getParameter("newzip2"));
String newzip3 = Util.checkString(req.getParameter("newzip3"));
String newzip4 = Util.checkString(req.getParameter("newzip4"));
String workver = Util.checkString(req.getParameter("workver"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String newzip1 = Util.Uni2Ksc(Util.checkString(req.getParameter("newzip1")));
String newzip2 = Util.Uni2Ksc(Util.checkString(req.getParameter("newzip2")));
String newzip3 = Util.Uni2Ksc(Util.checkString(req.getParameter("newzip3")));
String newzip4 = Util.Uni2Ksc(Util.checkString(req.getParameter("newzip4")));
String workver = Util.Uni2Ksc(Util.checkString(req.getParameter("workver")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setUid(uid);
dm.setNewzip1(newzip1);
dm.setNewzip2(newzip2);
dm.setNewzip3(newzip3);
dm.setNewzip4(newzip4);
dm.setWorkver(workver);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 15 14:33:17 KST 2009 */