/***************************************************************************************************
* 파일명 : CO_L_SCHEDM.java
* 기능 : 정보공유-일정-목록을 위한 DM
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.share.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.ds.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * 정보공유-일정-목록을 위한 DM
 */

public class CO_L_SCHEDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String schemangunitcd;
	public String frdt;
	public String todt;
	public String deptcd;
	public String use_pers;
	public String use_persclsf;
	public long pageno;
	public long pagesize;

	public CO_L_SCHEDM(){}
	public CO_L_SCHEDM(String schemangunitcd, String frdt, String todt, String deptcd, String use_pers, String use_persclsf, long pageno, long pagesize){
		this.schemangunitcd = schemangunitcd;
		this.frdt = frdt;
		this.todt = todt;
		this.deptcd = deptcd;
		this.use_pers = use_pers;
		this.use_persclsf = use_persclsf;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setSchemangunitcd(String schemangunitcd){
		this.schemangunitcd = schemangunitcd;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setUse_pers(String use_pers){
		this.use_pers = use_pers;
	}

	public void setUse_persclsf(String use_persclsf){
		this.use_persclsf = use_persclsf;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getSchemangunitcd(){
		return this.schemangunitcd;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getUse_pers(){
		return this.use_pers;
	}

	public String getUse_persclsf(){
		return this.use_persclsf;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_CO_L_SCHE( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_L_SCHEDM dm = (CO_L_SCHEDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.schemangunitcd);
		cstmt.setString(4, dm.frdt);
		cstmt.setString(5, dm.todt);
		cstmt.setString(6, dm.deptcd);
		cstmt.setString(7, dm.use_pers);
		cstmt.setString(8, dm.use_persclsf);
		cstmt.setLong(9, dm.pageno);
		cstmt.setLong(10, dm.pagesize);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
		cstmt.registerOutParameter(12, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.share.ds.CO_L_SCHEDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String schemangunitcd = req.getParameter("schemangunitcd");
if( schemangunitcd == null){
	System.out.println(this.toString+" : schemangunitcd is null" );
}else{
	System.out.println(this.toString+" : schemangunitcd is "+schemangunitcd );
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
String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
}
String use_pers = req.getParameter("use_pers");
if( use_pers == null){
	System.out.println(this.toString+" : use_pers is null" );
}else{
	System.out.println(this.toString+" : use_pers is "+use_pers );
}
String use_persclsf = req.getParameter("use_persclsf");
if( use_persclsf == null){
	System.out.println(this.toString+" : use_persclsf is null" );
}else{
	System.out.println(this.toString+" : use_persclsf is "+use_persclsf );
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

String schemangunitcd = Util.checkString(req.getParameter("schemangunitcd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String use_pers = Util.checkString(req.getParameter("use_pers"));
String use_persclsf = Util.checkString(req.getParameter("use_persclsf"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String schemangunitcd = Util.Uni2Ksc(Util.checkString(req.getParameter("schemangunitcd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String use_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("use_pers")));
String use_persclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("use_persclsf")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setSchemangunitcd(schemangunitcd);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setDeptcd(deptcd);
dm.setUse_pers(use_pers);
dm.setUse_persclsf(use_persclsf);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jun 05 22:49:40 KST 2004 */