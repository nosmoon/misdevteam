/***************************************************************************************************
* 파일명 : SS_L_SHFT_PYMT_CNTR_LOGDM.java
* 기능 : 지국업무지원-Billing자동이체-납부자관리-납부계약 로그내역
* 작성일자 : 2004-04-12
* 작성자 : 김상열
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
 * 지국업무지원-Billing자동이체-납부자관리-납부계약 로그내역
 *
 */


public class SS_L_SHFT_PYMT_CNTR_LOGDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String pymtseq;
	public long pageno;
	public long pagesize;

	public SS_L_SHFT_PYMT_CNTR_LOGDM(){}
	public SS_L_SHFT_PYMT_CNTR_LOGDM(String pymtseq, long pageno, long pagesize){
		this.pymtseq = pymtseq;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setPymtseq(String pymtseq){
		this.pymtseq = pymtseq;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getPymtseq(){
		return this.pymtseq;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_SHFT_PYMT_CNTR_LOG( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_SHFT_PYMT_CNTR_LOGDM dm = (SS_L_SHFT_PYMT_CNTR_LOGDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.pymtseq);
		cstmt.setLong(4, dm.pageno);
		cstmt.setLong(5, dm.pagesize);
		cstmt.registerOutParameter(6, Types.INTEGER);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_SHFT_PYMT_CNTR_LOGDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String pymtseq = req.getParameter("pymtseq");
if( pymtseq == null){
	System.out.println(this.toString+" : pymtseq is null" );
}else{
	System.out.println(this.toString+" : pymtseq is "+pymtseq );
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

String pymtseq = Util.checkString(req.getParameter("pymtseq"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String pymtseq = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtseq")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setPymtseq(pymtseq);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 12 10:24:30 KST 2004 */