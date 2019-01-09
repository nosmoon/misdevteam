/***************************************************************************************************
* 파일명 : .java
* 기능 : 입주아파트관리 조회
* 작성일자 : 2009-05-18
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 입주아파트관리 조회
 */

public class SS_L_EXTN_APTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String uid;
	public String yyyy;
	public String aptnm;
	public String addr1;
	public String addr2;

	public SS_L_EXTN_APTDM(){}
	public SS_L_EXTN_APTDM(String uid, String yyyy, String aptnm, String addr1, String addr2){
		this.uid = uid;
		this.yyyy = yyyy;
		this.aptnm = aptnm;
		this.addr1 = addr1;
		this.addr2 = addr2;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setYyyy(String yyyy){
		this.yyyy = yyyy;
	}

	public void setAptnm(String aptnm){
		this.aptnm = aptnm;
	}

	public void setAddr1(String addr1){
		this.addr1 = addr1;
	}

	public void setAddr2(String addr2){
		this.addr2 = addr2;
	}

	public String getUid(){
		return this.uid;
	}

	public String getYyyy(){
		return this.yyyy;
	}

	public String getAptnm(){
		return this.aptnm;
	}

	public String getAddr1(){
		return this.addr1;
	}

	public String getAddr2(){
		return this.addr2;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_EXTN_APT( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_EXTN_APTDM dm = (SS_L_EXTN_APTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.uid);
		cstmt.setString(4, dm.yyyy);
		cstmt.setString(5, dm.aptnm);
		cstmt.setString(6, dm.addr1);
		cstmt.setString(7, dm.addr2);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_EXTN_APTDataSet();
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
String yyyy = req.getParameter("yyyy");
if( yyyy == null){
	System.out.println(this.toString+" : yyyy is null" );
}else{
	System.out.println(this.toString+" : yyyy is "+yyyy );
}
String aptnm = req.getParameter("aptnm");
if( aptnm == null){
	System.out.println(this.toString+" : aptnm is null" );
}else{
	System.out.println(this.toString+" : aptnm is "+aptnm );
}
String addr1 = req.getParameter("addr1");
if( addr1 == null){
	System.out.println(this.toString+" : addr1 is null" );
}else{
	System.out.println(this.toString+" : addr1 is "+addr1 );
}
String addr2 = req.getParameter("addr2");
if( addr2 == null){
	System.out.println(this.toString+" : addr2 is null" );
}else{
	System.out.println(this.toString+" : addr2 is "+addr2 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String uid = Util.checkString(req.getParameter("uid"));
String yyyy = Util.checkString(req.getParameter("yyyy"));
String aptnm = Util.checkString(req.getParameter("aptnm"));
String addr1 = Util.checkString(req.getParameter("addr1"));
String addr2 = Util.checkString(req.getParameter("addr2"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String yyyy = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyy")));
String aptnm = Util.Uni2Ksc(Util.checkString(req.getParameter("aptnm")));
String addr1 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr1")));
String addr2 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr2")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setUid(uid);
dm.setYyyy(yyyy);
dm.setAptnm(aptnm);
dm.setAddr1(addr1);
dm.setAddr2(addr2);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 19 15:17:45 KST 2009 */