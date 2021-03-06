/***************************************************************************************************
* 파일명 : SS_L_VSCDDM.java
* 기능 : 독자-VacationStop-코드-목록을 위한 DM
* 작성일자 : 2004-03-20
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * 독자-VacationStop-코드-목록을 위한 DM
 */

public class SS_L_VSCDDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String vaca_arearegncd;
	public long pageno;
	public long pagesize;

	public SS_L_VSCDDM(){}
	public SS_L_VSCDDM(String vaca_arearegncd, long pageno, long pagesize){
		this.vaca_arearegncd = vaca_arearegncd;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setVaca_arearegncd(String vaca_arearegncd){
		this.vaca_arearegncd = vaca_arearegncd;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getVaca_arearegncd(){
		return this.vaca_arearegncd;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_VSCD( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_VSCDDM dm = (SS_L_VSCDDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.vaca_arearegncd);
		cstmt.setLong(4, dm.pageno);
		cstmt.setLong(5, dm.pagesize);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
		cstmt.registerOutParameter(7, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.rdr.ds.SS_L_VSCDDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String vaca_arearegncd = req.getParameter("vaca_arearegncd");
if( vaca_arearegncd == null){
	System.out.println(this.toString+" : vaca_arearegncd is null" );
}else{
	System.out.println(this.toString+" : vaca_arearegncd is "+vaca_arearegncd );
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

String vaca_arearegncd = Util.checkString(req.getParameter("vaca_arearegncd"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String vaca_arearegncd = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_arearegncd")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setVaca_arearegncd(vaca_arearegncd);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 29 17:03:07 KST 2004 */