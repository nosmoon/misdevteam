/***************************************************************************************************
* 파일명 : .java
* 기능 : 확장현황-본사확장- 유형별 상세  
* 작성일자 : 2009-05-25
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
 * 확장현황-본사확장- 유형별 상세  
 */

public class SS_S_EXTN_HDQTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String rdr_no;
	public String medicd;
	public String cntrno;
	public String mangno;

	public SS_S_EXTN_HDQTDM(){}
	public SS_S_EXTN_HDQTDM(String rdr_no, String medicd, String cntrno, String mangno){
		this.rdr_no = rdr_no;
		this.medicd = medicd;
		this.cntrno = cntrno;
		this.mangno = mangno;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setCntrno(String cntrno){
		this.cntrno = cntrno;
	}

	public void setMangno(String mangno){
		this.mangno = mangno;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getCntrno(){
		return this.cntrno;
	}

	public String getMangno(){
		return this.mangno;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_EXTN_HDQT( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_EXTN_HDQTDM dm = (SS_S_EXTN_HDQTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.rdr_no);
		cstmt.setString(4, dm.medicd);
		cstmt.setString(5, dm.cntrno);
		cstmt.setString(6, dm.mangno);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_S_EXTN_HDQTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

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
String cntrno = req.getParameter("cntrno");
if( cntrno == null){
	System.out.println(this.toString+" : cntrno is null" );
}else{
	System.out.println(this.toString+" : cntrno is "+cntrno );
}
String mangno = req.getParameter("mangno");
if( mangno == null){
	System.out.println(this.toString+" : mangno is null" );
}else{
	System.out.println(this.toString+" : mangno is "+mangno );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String medicd = Util.checkString(req.getParameter("medicd"));
String cntrno = Util.checkString(req.getParameter("cntrno"));
String mangno = Util.checkString(req.getParameter("mangno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String cntrno = Util.Uni2Ksc(Util.checkString(req.getParameter("cntrno")));
String mangno = Util.Uni2Ksc(Util.checkString(req.getParameter("mangno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setRdr_no(rdr_no);
dm.setMedicd(medicd);
dm.setCntrno(cntrno);
dm.setMangno(mangno);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 08 11:31:41 KST 2009 */