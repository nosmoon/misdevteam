/***************************************************************************************************
* 파일명 : CO_L_CDVDM.java
* 기능 : 관리자-공통코드-목록을 위한 DM 
* 작성일자 : 2004-03-09
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
 * 관리자-공통코드-목록을 위한 DM 
 */

public class CO_L_CDVDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String ciymgbcd;
	public String cicdgb;
	public String cicodeval;
	public String cicdnm;
	public long pageno;
	public long pagesize;

	public CO_L_CDVDM(){}
	public CO_L_CDVDM(String ciymgbcd, String cicdgb, String cicodeval, String cicdnm, long pageno, long pagesize){
		this.ciymgbcd = ciymgbcd;
		this.cicdgb = cicdgb;
		this.cicodeval = cicodeval;
		this.cicdnm = cicdnm;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setCiymgbcd(String ciymgbcd){
		this.ciymgbcd = ciymgbcd;
	}

	public void setCicdgb(String cicdgb){
		this.cicdgb = cicdgb;
	}

	public void setCicodeval(String cicodeval){
		this.cicodeval = cicodeval;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getCiymgbcd(){
		return this.ciymgbcd;
	}

	public String getCicdgb(){
		return this.cicdgb;
	}

	public String getCicodeval(){
		return this.cicodeval;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_CO_L_CDV( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_L_CDVDM dm = (CO_L_CDVDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.ciymgbcd);
		cstmt.setString(4, dm.cicdgb);
		cstmt.setString(5, dm.cicodeval);
		cstmt.setString(6, dm.cicdnm);
		cstmt.setLong(7, dm.pageno);
		cstmt.setLong(8, dm.pagesize);
		cstmt.registerOutParameter(9, Types.INTEGER);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.CO_L_CDVDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String ciymgbcd = req.getParameter("ciymgbcd");
if( ciymgbcd == null){
	System.out.println(this.toString+" : ciymgbcd is null" );
}else{
	System.out.println(this.toString+" : ciymgbcd is "+ciymgbcd );
}
String cicdgb = req.getParameter("cicdgb");
if( cicdgb == null){
	System.out.println(this.toString+" : cicdgb is null" );
}else{
	System.out.println(this.toString+" : cicdgb is "+cicdgb );
}
String cicodeval = req.getParameter("cicodeval");
if( cicodeval == null){
	System.out.println(this.toString+" : cicodeval is null" );
}else{
	System.out.println(this.toString+" : cicodeval is "+cicodeval );
}
String cicdnm = req.getParameter("cicdnm");
if( cicdnm == null){
	System.out.println(this.toString+" : cicdnm is null" );
}else{
	System.out.println(this.toString+" : cicdnm is "+cicdnm );
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

String ciymgbcd = Util.checkString(req.getParameter("ciymgbcd"));
String cicdgb = Util.checkString(req.getParameter("cicdgb"));
String cicodeval = Util.checkString(req.getParameter("cicodeval"));
String cicdnm = Util.checkString(req.getParameter("cicdnm"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String ciymgbcd = Util.Uni2Ksc(Util.checkString(req.getParameter("ciymgbcd")));
String cicdgb = Util.Uni2Ksc(Util.checkString(req.getParameter("cicdgb")));
String cicodeval = Util.Uni2Ksc(Util.checkString(req.getParameter("cicodeval")));
String cicdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cicdnm")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCiymgbcd(ciymgbcd);
dm.setCicdgb(cicdgb);
dm.setCicodeval(cicodeval);
dm.setCicdnm(cicdnm);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 09 19:27:20 KST 2004 */