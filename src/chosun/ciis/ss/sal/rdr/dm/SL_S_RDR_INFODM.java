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


package chosun.ciis.ss.sal.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.ds.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * 
 */


public class SL_S_RDR_INFODM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String rdr_no;
	public String medicd;
	public String basiyymm;

	public SL_S_RDR_INFODM(){}
	public SL_S_RDR_INFODM(String bocd, String rdr_no, String medicd, String basiyymm){
		this.bocd = bocd;
		this.rdr_no = rdr_no;
		this.medicd = medicd;
		this.basiyymm = basiyymm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setBasiyymm(String basiyymm){
		this.basiyymm = basiyymm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getBasiyymm(){
		return this.basiyymm;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SL_S_RDR_INFO(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_S_RDR_INFODM dm = (SL_S_RDR_INFODM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.rdr_no);
		cstmt.setString(5, dm.medicd);
		cstmt.setString(6, dm.basiyymm);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.INTEGER);
		cstmt.registerOutParameter(10, Types.INTEGER);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.INTEGER);
		cstmt.registerOutParameter(13, Types.INTEGER);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, Types.VARCHAR);
		cstmt.registerOutParameter(19, Types.VARCHAR);
		cstmt.registerOutParameter(20, Types.VARCHAR);
		cstmt.registerOutParameter(21, Types.VARCHAR);
		cstmt.registerOutParameter(22, OracleTypes.CURSOR);
		cstmt.registerOutParameter(23, OracleTypes.CURSOR);
		cstmt.registerOutParameter(24, OracleTypes.CURSOR);
		cstmt.registerOutParameter(25, OracleTypes.CURSOR);
		cstmt.registerOutParameter(26, OracleTypes.CURSOR);
		cstmt.registerOutParameter(27, OracleTypes.CURSOR);
		cstmt.registerOutParameter(28, OracleTypes.CURSOR);
		cstmt.registerOutParameter(29, OracleTypes.CURSOR);
		cstmt.registerOutParameter(30, OracleTypes.CURSOR);
		cstmt.registerOutParameter(31, OracleTypes.CURSOR);
		cstmt.registerOutParameter(32, OracleTypes.CURSOR);
		cstmt.registerOutParameter(33, OracleTypes.CURSOR);
		cstmt.registerOutParameter(34, OracleTypes.CURSOR);
		cstmt.registerOutParameter(35, OracleTypes.CURSOR);
		cstmt.registerOutParameter(36, OracleTypes.CURSOR);
		cstmt.registerOutParameter(37, OracleTypes.CURSOR);
		cstmt.registerOutParameter(38, OracleTypes.CURSOR);
		cstmt.registerOutParameter(39, OracleTypes.CURSOR);
		cstmt.registerOutParameter(40, OracleTypes.CURSOR);
		cstmt.registerOutParameter(41, OracleTypes.CURSOR);
		cstmt.registerOutParameter(42, OracleTypes.CURSOR);
		cstmt.registerOutParameter(43, OracleTypes.CURSOR);
		cstmt.registerOutParameter(44, Types.VARCHAR);
		cstmt.registerOutParameter(45, OracleTypes.CURSOR);
		cstmt.registerOutParameter(46, OracleTypes.CURSOR);
		cstmt.registerOutParameter(47, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_S_RDR_INFODataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("rdr_no = [" + getRdr_no() + "]");
		System.out.println("medicd = [" + getMedicd() + "]");
		System.out.println("basiyymm = [" + getBasiyymm() + "]");
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
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String medicd = Util.checkString(req.getParameter("medicd"));
String basiyymm = Util.checkString(req.getParameter("basiyymm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String basiyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("basiyymm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setRdr_no(rdr_no);
dm.setMedicd(medicd);
dm.setBasiyymm(basiyymm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Oct 11 17:10:57 KST 2017 */