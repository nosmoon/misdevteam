/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
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


public class SS_SLS_BRMGR_2852_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String medicd;
	public String basiyymm;
	public String yymm;
	public String tgtclsf;

	public SS_SLS_BRMGR_2852_SDM(){}
	public SS_SLS_BRMGR_2852_SDM(String bocd, String medicd, String basiyymm, String yymm, String tgtclsf){
		this.bocd = bocd;
		this.medicd = medicd;
		this.basiyymm = basiyymm;
		this.yymm = yymm;
		this.tgtclsf = tgtclsf;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setBasiyymm(String basiyymm){
		this.basiyymm = basiyymm;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setTgtclsf(String tgtclsf){
		this.tgtclsf = tgtclsf;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getBasiyymm(){
		return this.basiyymm;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getTgtclsf(){
		return this.tgtclsf;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_BRMGR_2852_S(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_BRMGR_2852_SDM dm = (SS_SLS_BRMGR_2852_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.medicd);
		cstmt.setString(5, dm.basiyymm);
		cstmt.setString(6, dm.yymm);
		cstmt.setString(7, dm.tgtclsf);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_SLS_BRMGR_2852_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("medicd = [" + getMedicd() + "]");
		System.out.println("basiyymm = [" + getBasiyymm() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("tgtclsf = [" + getTgtclsf() + "]");
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
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String basiyymm = req.getParameter("basiyymm");
if( basiyymm == null){
	System.out.println(this.toString+" : basiyymm is null" );
}else{
	System.out.println(this.toString+" : basiyymm is "+basiyymm );
}
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String tgtclsf = req.getParameter("tgtclsf");
if( tgtclsf == null){
	System.out.println(this.toString+" : tgtclsf is null" );
}else{
	System.out.println(this.toString+" : tgtclsf is "+tgtclsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String medicd = Util.checkString(req.getParameter("medicd"));
String basiyymm = Util.checkString(req.getParameter("basiyymm"));
String yymm = Util.checkString(req.getParameter("yymm"));
String tgtclsf = Util.checkString(req.getParameter("tgtclsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String basiyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("basiyymm")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String tgtclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("tgtclsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setMedicd(medicd);
dm.setBasiyymm(basiyymm);
dm.setYymm(yymm);
dm.setTgtclsf(tgtclsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 16 16:01:46 KST 2017 */