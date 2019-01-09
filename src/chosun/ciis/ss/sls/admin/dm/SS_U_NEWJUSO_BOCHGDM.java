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


package chosun.ciis.ss.sls.admin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * 
 */


public class SS_U_NEWJUSO_BOCHGDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String uid;
	public String prebocd;
	public String bocd;
	public String bldmngnn;
	public String allmove;

	public SS_U_NEWJUSO_BOCHGDM(){}
	public SS_U_NEWJUSO_BOCHGDM(String uid, String prebocd, String bocd, String bldmngnn, String allmove){
		this.uid = uid;
		this.prebocd = prebocd;
		this.bocd = bocd;
		this.bldmngnn = bldmngnn;
		this.allmove = allmove;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setPrebocd(String prebocd){
		this.prebocd = prebocd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBldmngnn(String bldmngnn){
		this.bldmngnn = bldmngnn;
	}

	public void setAllmove(String allmove){
		this.allmove = allmove;
	}

	public String getUid(){
		return this.uid;
	}

	public String getPrebocd(){
		return this.prebocd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBldmngnn(){
		return this.bldmngnn;
	}

	public String getAllmove(){
		return this.allmove;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_U_NEWJUSO_BOCHG(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_NEWJUSO_BOCHGDM dm = (SS_U_NEWJUSO_BOCHGDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.uid);
		cstmt.setString(4, dm.prebocd);
		cstmt.setString(5, dm.bocd);
		cstmt.setString(6, dm.bldmngnn);
		cstmt.setString(7, dm.allmove);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_U_NEWJUSO_BOCHGDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("uid = [" + getUid() + "]");
		System.out.println("prebocd = [" + getPrebocd() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("bldmngnn = [" + getBldmngnn() + "]");
		System.out.println("allmove = [" + getAllmove() + "]");
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
String prebocd = req.getParameter("prebocd");
if( prebocd == null){
	System.out.println(this.toString+" : prebocd is null" );
}else{
	System.out.println(this.toString+" : prebocd is "+prebocd );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String bldmngnn = req.getParameter("bldmngnn");
if( bldmngnn == null){
	System.out.println(this.toString+" : bldmngnn is null" );
}else{
	System.out.println(this.toString+" : bldmngnn is "+bldmngnn );
}
String allmove = req.getParameter("allmove");
if( allmove == null){
	System.out.println(this.toString+" : allmove is null" );
}else{
	System.out.println(this.toString+" : allmove is "+allmove );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String uid = Util.checkString(req.getParameter("uid"));
String prebocd = Util.checkString(req.getParameter("prebocd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String bldmngnn = Util.checkString(req.getParameter("bldmngnn"));
String allmove = Util.checkString(req.getParameter("allmove"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String prebocd = Util.Uni2Ksc(Util.checkString(req.getParameter("prebocd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String bldmngnn = Util.Uni2Ksc(Util.checkString(req.getParameter("bldmngnn")));
String allmove = Util.Uni2Ksc(Util.checkString(req.getParameter("allmove")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setUid(uid);
dm.setPrebocd(prebocd);
dm.setBocd(bocd);
dm.setBldmngnn(bldmngnn);
dm.setAllmove(allmove);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 21 18:35:05 KST 2015 */