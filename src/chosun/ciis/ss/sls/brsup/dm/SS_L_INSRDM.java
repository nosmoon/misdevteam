/***************************************************************************************************
* 파일명 : SS_L_INSRDM.java
* 기능 : 지국지원-상해보험-목록을 위한 DM
* 작성일자 : 2004-02-10
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국지원-상해보험-목록 위한 DM
 */

public class SS_L_INSRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String fryy;
	public String toyy;
	public long pageno;
	public long pagesize;

	public SS_L_INSRDM(){}
	public SS_L_INSRDM(String fryy, String toyy, long pageno, long pagesize){
		this.fryy = fryy;
		this.toyy = toyy;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setFryy(String fryy){
		this.fryy = fryy;
	}

	public void setToyy(String toyy){
		this.toyy = toyy;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getFryy(){
		return this.fryy;
	}

	public String getToyy(){
		return this.toyy;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_INSR( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_INSRDM dm = (SS_L_INSRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.fryy);
		cstmt.setString(4, dm.toyy);
		cstmt.setLong(5, dm.pageno);
		cstmt.setLong(6, dm.pagesize);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_INSRDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String fryy = req.getParameter("fryy");
if( fryy == null){
	System.out.println(this.toString+" : fryy is null" );
}else{
	System.out.println(this.toString+" : fryy is "+fryy );
}
String toyy = req.getParameter("toyy");
if( toyy == null){
	System.out.println(this.toString+" : toyy is null" );
}else{
	System.out.println(this.toString+" : toyy is "+toyy );
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

String fryy = Util.checkString(req.getParameter("fryy"));
String toyy = Util.checkString(req.getParameter("toyy"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String fryy = Util.Uni2Ksc(Util.checkString(req.getParameter("fryy")));
String toyy = Util.Uni2Ksc(Util.checkString(req.getParameter("toyy")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFryy(fryy);
dm.setToyy(toyy);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 16 13:13:33 KST 2004 */