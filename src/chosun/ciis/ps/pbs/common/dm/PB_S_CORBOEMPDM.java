/***************************************************************************************************
 * 파일명 :PB_S_RBOEMPDM.java
 * 기능 : 출판지사의 사원조회 화면중 사원정보 조회
 * 작성일자 : 2003-11-21
 * 작성자 : 김건호
 **************************************************************************************************/
 /**************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
 **************************************************************************************************/


package chosun.ciis.ps.pbs.common.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.common.ds.*;
import chosun.ciis.ps.pbs.common.rec.*;

/**
 * class definition
 *
 */


public class PB_S_CORBOEMPDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String boemp_no;

	public PB_S_CORBOEMPDM(){}
	public PB_S_CORBOEMPDM(String bocd, String boemp_no){
		this.bocd = bocd;
		this.boemp_no = boemp_no;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBoemp_no(String boemp_no){
		this.boemp_no = boemp_no;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBoemp_no(){
		return this.boemp_no;
	}

	public String getSQL(){
		 return "{ call SP_PB_S_CORBOEMP( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PB_S_CORBOEMPDM dm = (PB_S_CORBOEMPDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.boemp_no);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.common.ds.PB_S_CORBOEMPDataSet();
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
String boemp_no = req.getParameter("boemp_no");
if( boemp_no == null){
	System.out.println(this.toString+" : boemp_no is null" );
}else{
	System.out.println(this.toString+" : boemp_no is "+boemp_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String boemp_no = Util.checkString(req.getParameter("boemp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String boemp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("boemp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setBoemp_no(boemp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Dec 27 13:27:02 KST 2003 */