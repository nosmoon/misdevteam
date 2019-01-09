/***************************************************************************************************
* 파일명 : SS_L_WRKDM.java
* 기능 : 관리자-작업-등록-목록을 위한 DM
* 작성일자 : 2004-04-08
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
 * 관리자-작업-등록-목록을 위한 DM
 */

public class SS_L_WRKDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cycl;
	public String id;
	public long pageno;
	public long pagesize;

	public SS_L_WRKDM(){}
	public SS_L_WRKDM(String cycl, String id, long pageno, long pagesize){
		this.cycl = cycl;
		this.id = id;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setCycl(String cycl){
		this.cycl = cycl;
	}

	public void setId(String id){
		this.id = id;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getCycl(){
		return this.cycl;
	}

	public String getId(){
		return this.id;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_WRK( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_WRKDM dm = (SS_L_WRKDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cycl);
		cstmt.setString(4, dm.id);
		cstmt.setLong(5, dm.pageno);
		cstmt.setLong(6, dm.pagesize);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_L_WRKDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cycl = req.getParameter("cycl");
if( cycl == null){
	System.out.println(this.toString+" : cycl is null" );
}else{
	System.out.println(this.toString+" : cycl is "+cycl );
}
String id = req.getParameter("id");
if( id == null){
	System.out.println(this.toString+" : id is null" );
}else{
	System.out.println(this.toString+" : id is "+id );
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

String cycl = Util.checkString(req.getParameter("cycl"));
String id = Util.checkString(req.getParameter("id"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cycl = Util.Uni2Ksc(Util.checkString(req.getParameter("cycl")));
String id = Util.Uni2Ksc(Util.checkString(req.getParameter("id")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCycl(cycl);
dm.setId(id);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 08 21:03:58 KST 2004 */