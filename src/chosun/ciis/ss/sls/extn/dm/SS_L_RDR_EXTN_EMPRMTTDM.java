/***************************************************************************************************
* 파일명 : SS_L_RDR_EXTN_EMPRMTTDM.java
* 기능 : 확장현황-사원확장-수당-목록을 위한 DM
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 확장현황-사원확장-수당-목록을 위한 DM
 */

public class SS_L_RDR_EXTN_EMPRMTTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String rdr_extncampno;
	public String frdt;
	public String todt;
	public String sortflag;
	public long pageno;
	public long pagesize;

	public SS_L_RDR_EXTN_EMPRMTTDM(){}
	public SS_L_RDR_EXTN_EMPRMTTDM(String rdr_extncampno, String frdt, String todt, String sortflag, long pageno, long pagesize){
		this.rdr_extncampno = rdr_extncampno;
		this.frdt = frdt;
		this.todt = todt;
		this.sortflag = sortflag;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setRdr_extncampno(String rdr_extncampno){
		this.rdr_extncampno = rdr_extncampno;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setSortflag(String sortflag){
		this.sortflag = sortflag;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getRdr_extncampno(){
		return this.rdr_extncampno;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getSortflag(){
		return this.sortflag;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_RDR_EXTN_EMPRMTT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_RDR_EXTN_EMPRMTTDM dm = (SS_L_RDR_EXTN_EMPRMTTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.rdr_extncampno);
		cstmt.setString(4, dm.frdt);
		cstmt.setString(5, dm.todt);
		cstmt.setString(6, dm.sortflag);
		cstmt.setLong(7, dm.pageno);
		cstmt.setLong(8, dm.pagesize);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
		cstmt.registerOutParameter(10, Types.INTEGER);
		cstmt.registerOutParameter(11, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_RDR_EXTN_EMPRMTTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String rdr_extncampno = req.getParameter("rdr_extncampno");
if( rdr_extncampno == null){
	System.out.println(this.toString+" : rdr_extncampno is null" );
}else{
	System.out.println(this.toString+" : rdr_extncampno is "+rdr_extncampno );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String sortflag = req.getParameter("sortflag");
if( sortflag == null){
	System.out.println(this.toString+" : sortflag is null" );
}else{
	System.out.println(this.toString+" : sortflag is "+sortflag );
}
String pageno = req.getParameter("pageno");
if( pageno == null){
	System.out.println(this.toString+" : pageno is null" );
}else{
	System.out.println(this.toString+" : pageno is "+pageno );
}
String pagesize = req.getParameter("pagesize");
if( pagesize == null){
	System.out.println(this.toString+" : pagesize is null" );
}else{
	System.out.println(this.toString+" : pagesize is "+pagesize );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String rdr_extncampno = Util.checkString(req.getParameter("rdr_extncampno"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String sortflag = Util.checkString(req.getParameter("sortflag"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String rdr_extncampno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extncampno")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String sortflag = Util.Uni2Ksc(Util.checkString(req.getParameter("sortflag")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setRdr_extncampno(rdr_extncampno);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setSortflag(sortflag);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat May 08 12:20:08 KST 2004 */