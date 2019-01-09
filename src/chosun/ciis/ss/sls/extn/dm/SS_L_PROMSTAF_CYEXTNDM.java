/***************************************************************************************************
* 파일명 : SS_L_PROMSTAF_CYEXTN.java
* 기능 :   확장현황-사이버확장-요원-목록조회
* 작성일자 : 2004-10-13
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	: 
* 수정자	: 
* 수정일자	:
* 백업		: 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 확장현황-사이버확장-요원-목록조회
 *
 */


public class SS_L_PROMSTAF_CYEXTNDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String frdt;
	public String todt;
	public String stafclsfcd;
	public String stafnm;
	public String cnvsstafnm;
	public long pageno;
	public long pagesize;

	public SS_L_PROMSTAF_CYEXTNDM(){}
	public SS_L_PROMSTAF_CYEXTNDM(String frdt, String todt, String stafclsfcd, String stafnm, String cnvsstafnm, long pageno, long pagesize){
		this.frdt = frdt;
		this.todt = todt;
		this.stafclsfcd = stafclsfcd;
		this.stafnm = stafnm;
		this.cnvsstafnm = cnvsstafnm;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setStafclsfcd(String stafclsfcd){
		this.stafclsfcd = stafclsfcd;
	}

	public void setStafnm(String stafnm){
		this.stafnm = stafnm;
	}

	public void setCnvsstafnm(String cnvsstafnm){
		this.cnvsstafnm = cnvsstafnm;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getStafclsfcd(){
		return this.stafclsfcd;
	}

	public String getStafnm(){
		return this.stafnm;
	}

	public String getCnvsstafnm(){
		return this.cnvsstafnm;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_PROMSTAF_CYEXTN( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_PROMSTAF_CYEXTNDM dm = (SS_L_PROMSTAF_CYEXTNDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.frdt);
		cstmt.setString(4, dm.todt);
		cstmt.setString(5, dm.stafclsfcd);
		cstmt.setString(6, dm.stafnm);
		cstmt.setString(7, dm.cnvsstafnm);
		cstmt.setLong(8, dm.pageno);
		cstmt.setLong(9, dm.pagesize);
		cstmt.registerOutParameter(10, Types.INTEGER);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_PROMSTAF_CYEXTNDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

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
String stafclsfcd = req.getParameter("stafclsfcd");
if( stafclsfcd == null){
	System.out.println(this.toString+" : stafclsfcd is null" );
}else{
	System.out.println(this.toString+" : stafclsfcd is "+stafclsfcd );
}
String stafnm = req.getParameter("stafnm");
if( stafnm == null){
	System.out.println(this.toString+" : stafnm is null" );
}else{
	System.out.println(this.toString+" : stafnm is "+stafnm );
}
String cnvsstafnm = req.getParameter("cnvsstafnm");
if( cnvsstafnm == null){
	System.out.println(this.toString+" : cnvsstafnm is null" );
}else{
	System.out.println(this.toString+" : cnvsstafnm is "+cnvsstafnm );
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

String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String stafclsfcd = Util.checkString(req.getParameter("stafclsfcd"));
String stafnm = Util.checkString(req.getParameter("stafnm"));
String cnvsstafnm = Util.checkString(req.getParameter("cnvsstafnm"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String stafclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("stafclsfcd")));
String stafnm = Util.Uni2Ksc(Util.checkString(req.getParameter("stafnm")));
String cnvsstafnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cnvsstafnm")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setStafclsfcd(stafclsfcd);
dm.setStafnm(stafnm);
dm.setCnvsstafnm(cnvsstafnm);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Oct 12 21:24:45 KST 2004 */