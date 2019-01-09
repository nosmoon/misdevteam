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


public class SS_A_ADDRCD_BOCHGDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String uid;
	public String trsfbocd;
	public String acptbocd;
	public String addrcd;
	public String new_addrcd;

	public SS_A_ADDRCD_BOCHGDM(){}
	public SS_A_ADDRCD_BOCHGDM(String uid, String trsfbocd, String acptbocd, String addrcd, String new_addrcd){
		this.uid = uid;
		this.trsfbocd = trsfbocd;
		this.acptbocd = acptbocd;
		this.addrcd = addrcd;
		this.new_addrcd = new_addrcd;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setTrsfbocd(String trsfbocd){
		this.trsfbocd = trsfbocd;
	}

	public void setAcptbocd(String acptbocd){
		this.acptbocd = acptbocd;
	}

	public void setAddrcd(String addrcd){
		this.addrcd = addrcd;
	}

	public void setNew_addrcd(String new_addrcd){
		this.new_addrcd = new_addrcd;
	}

	public String getUid(){
		return this.uid;
	}

	public String getTrsfbocd(){
		return this.trsfbocd;
	}

	public String getAcptbocd(){
		return this.acptbocd;
	}

	public String getAddrcd(){
		return this.addrcd;
	}

	public String getNew_addrcd(){
		return this.new_addrcd;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_A_ADDRCD_BOCHG(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_ADDRCD_BOCHGDM dm = (SS_A_ADDRCD_BOCHGDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.uid);
		cstmt.setString(4, dm.trsfbocd);
		cstmt.setString(5, dm.acptbocd);
		cstmt.setString(6, dm.addrcd);
		cstmt.setString(7, dm.new_addrcd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_A_ADDRCD_BOCHGDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("uid = [" + getUid() + "]");
		System.out.println("trsfbocd = [" + getTrsfbocd() + "]");
		System.out.println("acptbocd = [" + getAcptbocd() + "]");
		System.out.println("addrcd = [" + getAddrcd() + "]");
		System.out.println("new_addrcd = [" + getNew_addrcd() + "]");
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
String trsfbocd = req.getParameter("trsfbocd");
if( trsfbocd == null){
	System.out.println(this.toString+" : trsfbocd is null" );
}else{
	System.out.println(this.toString+" : trsfbocd is "+trsfbocd );
}
String acptbocd = req.getParameter("acptbocd");
if( acptbocd == null){
	System.out.println(this.toString+" : acptbocd is null" );
}else{
	System.out.println(this.toString+" : acptbocd is "+acptbocd );
}
String addrcd = req.getParameter("addrcd");
if( addrcd == null){
	System.out.println(this.toString+" : addrcd is null" );
}else{
	System.out.println(this.toString+" : addrcd is "+addrcd );
}
String new_addrcd = req.getParameter("new_addrcd");
if( new_addrcd == null){
	System.out.println(this.toString+" : new_addrcd is null" );
}else{
	System.out.println(this.toString+" : new_addrcd is "+new_addrcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String uid = Util.checkString(req.getParameter("uid"));
String trsfbocd = Util.checkString(req.getParameter("trsfbocd"));
String acptbocd = Util.checkString(req.getParameter("acptbocd"));
String addrcd = Util.checkString(req.getParameter("addrcd"));
String new_addrcd = Util.checkString(req.getParameter("new_addrcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String trsfbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("trsfbocd")));
String acptbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("acptbocd")));
String addrcd = Util.Uni2Ksc(Util.checkString(req.getParameter("addrcd")));
String new_addrcd = Util.Uni2Ksc(Util.checkString(req.getParameter("new_addrcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setUid(uid);
dm.setTrsfbocd(trsfbocd);
dm.setAcptbocd(acptbocd);
dm.setAddrcd(addrcd);
dm.setNew_addrcd(new_addrcd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 04 16:36:13 KST 2014 */