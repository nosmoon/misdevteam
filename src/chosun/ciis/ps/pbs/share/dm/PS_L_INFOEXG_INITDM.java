/***************************************************************************************************
* 파일명 : PS_L_INFOEXG_INIT.java
* 기능 : 정보공유 게시판 - 공지사항,각종통계(확장목록,중재,불편접수,이사신청)
* 작성일자 : 2004-03-29
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.share.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.share.ds.*;
import chosun.ciis.ps.pbs.share.rec.*;

/**
 * 출판국- 정보공유 게시판 공지사항,각종통계(확장목록,중재,불편접수,이사신청)
 *
 */

public class PS_L_INFOEXG_INITDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String clsf;
	public String cmpycd;
	public String pub_branch;
	public String incmgpers;
	public long pageno;
	public long pagesize;

	public PS_L_INFOEXG_INITDM(){}
	public PS_L_INFOEXG_INITDM(String clsf, String cmpycd, String pub_branch, String incmgpers, long pageno, long pagesize){
		this.clsf = clsf;
		this.cmpycd = cmpycd;
		this.pub_branch = pub_branch;
		this.incmgpers = incmgpers;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setPub_branch(String pub_branch){
		this.pub_branch = pub_branch;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getClsf(){
		return this.clsf;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getPub_branch(){
		return this.pub_branch;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_INFOEXG_INIT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_INFOEXG_INITDM dm = (PS_L_INFOEXG_INITDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.clsf);
		cstmt.setString(4, dm.cmpycd);
		cstmt.setString(5, dm.pub_branch);
		cstmt.setString(6, dm.incmgpers);
		cstmt.setLong(7, dm.pageno);
		cstmt.setLong(8, dm.pagesize);
		cstmt.registerOutParameter(9, Types.INTEGER);
		cstmt.registerOutParameter(10, Types.INTEGER);
		cstmt.registerOutParameter(11, Types.INTEGER);
		cstmt.registerOutParameter(12, Types.INTEGER);
		cstmt.registerOutParameter(13, Types.INTEGER);
		cstmt.registerOutParameter(14, Types.INTEGER);
		cstmt.registerOutParameter(15, Types.INTEGER);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, OracleTypes.CURSOR);
		cstmt.registerOutParameter(18, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.share.ds.PS_L_INFOEXG_INITDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String clsf = req.getParameter("clsf");
if( clsf == null){
	System.out.println(this.toString+" : clsf is null" );
}else{
	System.out.println(this.toString+" : clsf is "+clsf );
}
String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String pub_branch = req.getParameter("pub_branch");
if( pub_branch == null){
	System.out.println(this.toString+" : pub_branch is null" );
}else{
	System.out.println(this.toString+" : pub_branch is "+pub_branch );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
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

String clsf = Util.checkString(req.getParameter("clsf"));
String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String pub_branch = Util.checkString(req.getParameter("pub_branch"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String pub_branch = Util.Uni2Ksc(Util.checkString(req.getParameter("pub_branch")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setClsf(clsf);
dm.setCmpycd(cmpycd);
dm.setPub_branch(pub_branch);
dm.setIncmgpers(incmgpers);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 25 16:28:24 KST 2006 */