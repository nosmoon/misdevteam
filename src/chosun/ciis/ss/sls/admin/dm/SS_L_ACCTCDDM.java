/***************************************************************************************************
* 파일명 : SS_L_ACCTCDDM.java
* 기능 : 관리자-계정코드-목록을 위한 DM
* 작성일자 : 2004-04-24
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
 * 관리자-계정코드-목록을 위한 DM
 */


public class SS_L_ACCTCDDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String imptexpnclsf;
	public String acctcd;
	public String acctnm;
	public long pageno;
	public long pagesize;

	public SS_L_ACCTCDDM(){}
	public SS_L_ACCTCDDM(String imptexpnclsf, String acctcd, String acctnm, long pageno, long pagesize){
		this.imptexpnclsf = imptexpnclsf;
		this.acctcd = acctcd;
		this.acctnm = acctnm;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setImptexpnclsf(String imptexpnclsf){
		this.imptexpnclsf = imptexpnclsf;
	}

	public void setAcctcd(String acctcd){
		this.acctcd = acctcd;
	}

	public void setAcctnm(String acctnm){
		this.acctnm = acctnm;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getImptexpnclsf(){
		return this.imptexpnclsf;
	}

	public String getAcctcd(){
		return this.acctcd;
	}

	public String getAcctnm(){
		return this.acctnm;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_ACCTCD( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_ACCTCDDM dm = (SS_L_ACCTCDDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.imptexpnclsf);
		cstmt.setString(4, dm.acctcd);
		cstmt.setString(5, dm.acctnm);
		cstmt.setLong(6, dm.pageno);
		cstmt.setLong(7, dm.pagesize);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_L_ACCTCDDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String imptexpnclsf = req.getParameter("imptexpnclsf");
if( imptexpnclsf == null){
	System.out.println(this.toString+" : imptexpnclsf is null" );
}else{
	System.out.println(this.toString+" : imptexpnclsf is "+imptexpnclsf );
}
String acctcd = req.getParameter("acctcd");
if( acctcd == null){
	System.out.println(this.toString+" : acctcd is null" );
}else{
	System.out.println(this.toString+" : acctcd is "+acctcd );
}
String acctnm = req.getParameter("acctnm");
if( acctnm == null){
	System.out.println(this.toString+" : acctnm is null" );
}else{
	System.out.println(this.toString+" : acctnm is "+acctnm );
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

String imptexpnclsf = Util.checkString(req.getParameter("imptexpnclsf"));
String acctcd = Util.checkString(req.getParameter("acctcd"));
String acctnm = Util.checkString(req.getParameter("acctnm"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String imptexpnclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("imptexpnclsf")));
String acctcd = Util.Uni2Ksc(Util.checkString(req.getParameter("acctcd")));
String acctnm = Util.Uni2Ksc(Util.checkString(req.getParameter("acctnm")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setImptexpnclsf(imptexpnclsf);
dm.setAcctcd(acctcd);
dm.setAcctnm(acctnm);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jul 03 17:32:29 KST 2004 */