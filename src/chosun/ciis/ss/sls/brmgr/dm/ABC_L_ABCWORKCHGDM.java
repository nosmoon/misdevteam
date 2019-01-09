/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매-지국지원-이사독자수당현황
* 작성일자 : 2011-12-05
* 작성자 : 이기영
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 
 */


public class ABC_L_ABCWORKCHGDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String subsmappli;
	public String wrkcode;
	public String rdr_no;

	public ABC_L_ABCWORKCHGDM(){}
	public ABC_L_ABCWORKCHGDM(String bocd, String subsmappli, String wrkcode, String rdr_no){
		this.bocd = bocd;
		this.subsmappli = subsmappli;
		this.wrkcode = wrkcode;
		this.rdr_no = rdr_no;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setSubsmappli(String subsmappli){
		this.subsmappli = subsmappli;
	}

	public void setWrkcode(String wrkcode){
		this.wrkcode = wrkcode;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getSubsmappli(){
		return this.subsmappli;
	}

	public String getWrkcode(){
		return this.wrkcode;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_ABC_L_ABCWORKCHG(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		ABC_L_ABCWORKCHGDM dm = (ABC_L_ABCWORKCHGDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.subsmappli);
		cstmt.setString(5, dm.wrkcode);
		cstmt.setString(6, dm.rdr_no);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.ABC_L_ABCWORKCHGDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("subsmappli = [" + getSubsmappli() + "]");
		System.out.println("wrkcode = [" + getWrkcode() + "]");
		System.out.println("rdr_no = [" + getRdr_no() + "]");
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
String subsmappli = req.getParameter("subsmappli");
if( subsmappli == null){
	System.out.println(this.toString+" : subsmappli is null" );
}else{
	System.out.println(this.toString+" : subsmappli is "+subsmappli );
}
String wrkcode = req.getParameter("wrkcode");
if( wrkcode == null){
	System.out.println(this.toString+" : wrkcode is null" );
}else{
	System.out.println(this.toString+" : wrkcode is "+wrkcode );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String subsmappli = Util.checkString(req.getParameter("subsmappli"));
String wrkcode = Util.checkString(req.getParameter("wrkcode"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String subsmappli = Util.Uni2Ksc(Util.checkString(req.getParameter("subsmappli")));
String wrkcode = Util.Uni2Ksc(Util.checkString(req.getParameter("wrkcode")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setSubsmappli(subsmappli);
dm.setWrkcode(wrkcode);
dm.setRdr_no(rdr_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 03 05:13:07 GMT 2013 */