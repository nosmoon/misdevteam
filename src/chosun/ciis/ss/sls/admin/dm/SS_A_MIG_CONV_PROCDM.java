/***************************************************************************************************
* 파일명 : SS_A_MIG_CONV_PROCDM.java
* 기능 : 관리자-작업-마이그레이션-전환을 위한 DM
* 작성일자 : 2004-02-24
* 작성자 : 김대섭
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
 * 관리자-작업-마이그레이션-전환을 위한 DM
 */

public class SS_A_MIG_CONV_PROCDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String plist;
	public String mgyn;

	public SS_A_MIG_CONV_PROCDM(){}
	public SS_A_MIG_CONV_PROCDM(String bocd, String plist, String mgyn){
		this.bocd = bocd;
		this.plist = plist;
		this.mgyn = mgyn;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setPlist(String plist){
		this.plist = plist;
	}

	public void setMgyn(String mgyn){
		this.mgyn = mgyn;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getPlist(){
		return this.plist;
	}

	public String getMgyn(){
		return this.mgyn;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_MIG_CONV_PROC( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_MIG_CONV_PROCDM dm = (SS_A_MIG_CONV_PROCDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.plist);
		cstmt.setString(5, dm.mgyn);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_A_MIG_CONV_PROCDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String plist = req.getParameter("plist");
if( plist == null){
	System.out.println(this.toString+" : plist is null" );
}else{
	System.out.println(this.toString+" : plist is "+plist );
}
String mgyn = req.getParameter("mgyn");
if( mgyn == null){
	System.out.println(this.toString+" : mgyn is null" );
}else{
	System.out.println(this.toString+" : mgyn is "+mgyn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String plist = Util.checkString(req.getParameter("plist"));
String mgyn = Util.checkString(req.getParameter("mgyn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String plist = Util.Uni2Ksc(Util.checkString(req.getParameter("plist")));
String mgyn = Util.Uni2Ksc(Util.checkString(req.getParameter("mgyn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setPlist(plist);
dm.setMgyn(mgyn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 25 14:59:46 KST 2004 */