/***************************************************************************************************
* 파일명 : SS_S_SHFT_PYMTDM.java
* 기능 : 지국업무지원-Billing자동이체-납부자-상세조회
* 작성일자 : 2004-07-18
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
 * 지국업무지원-Billing자동이체-납부자-상세조회
 *
 */


public class SS_S_SHFT_PYMTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String pymtseq;
	public String cnfm;

	public SS_S_SHFT_PYMTDM(){}
	public SS_S_SHFT_PYMTDM(String pymtseq, String cnfm){
		this.pymtseq = pymtseq;
		this.cnfm = cnfm;
	}

	public void setPymtseq(String pymtseq){
		this.pymtseq = pymtseq;
	}

	public void setCnfm(String cnfm){
		this.cnfm = cnfm;
	}

	public String getPymtseq(){
		return this.pymtseq;
	}

	public String getCnfm(){
		return this.cnfm;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_SHFT_PYMT( ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_SHFT_PYMTDM dm = (SS_S_SHFT_PYMTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.pymtseq);
		cstmt.setString(4, dm.cnfm);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_S_SHFT_PYMTDataSet();
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
String cnfm = req.getParameter("cnfm");
if( cnfm == null){
	System.out.println(this.toString+" : cnfm is null" );
}else{
	System.out.println(this.toString+" : cnfm is "+cnfm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String pymtseq = Util.checkString(req.getParameter("pymtseq"));
String cnfm = Util.checkString(req.getParameter("cnfm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String pymtseq = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtseq")));
String cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("cnfm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setPymtseq(pymtseq);
dm.setCnfm(cnfm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 27 23:00:43 KST 2004 */