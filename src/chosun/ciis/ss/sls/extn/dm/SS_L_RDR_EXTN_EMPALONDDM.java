/***************************************************************************************************
* 파일명 : SS_L_RDR_EXTN_EMPALONDDM.java
* 기능 : 사원확장 수당 상세목록을 위한 DM
* 작성일자 : 2003-12-15
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * class definition
 *
 */


public class SS_L_RDR_EXTN_EMPALONDDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String rdr_extncampno;
	public String empseq;

	public SS_L_RDR_EXTN_EMPALONDDM(){}
	public SS_L_RDR_EXTN_EMPALONDDM(String rdr_extncampno, String empseq){
		this.rdr_extncampno = rdr_extncampno;
		this.empseq = empseq;
	}

	public void setRdr_extncampno(String rdr_extncampno){
		this.rdr_extncampno = rdr_extncampno;
	}

	public void setEmpseq(String empseq){
		this.empseq = empseq;
	}

	public String getRdr_extncampno(){
		return this.rdr_extncampno;
	}

	public String getEmpseq(){
		return this.empseq;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_RDR_EXTN_EMPALOND( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_RDR_EXTN_EMPALONDDM dm = (SS_L_RDR_EXTN_EMPALONDDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.rdr_extncampno);
		cstmt.setString(4, dm.empseq);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_RDR_EXTN_EMPALONDDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String rdr_extncampno = req.getParameter("rdr_extncampno");
if( rdr_extncampno == null){
	System.out.println(this.toString+" : rdr_extncampno is null" );
}else{
	System.out.println(this.toString+" : rdr_extncampno is "+rdr_extncampno );
}
String empseq = req.getParameter("empseq");
if( empseq == null){
	System.out.println(this.toString+" : empseq is null" );
}else{
	System.out.println(this.toString+" : empseq is "+empseq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String rdr_extncampno = Util.checkString(req.getParameter("rdr_extncampno"));
String empseq = Util.checkString(req.getParameter("empseq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String rdr_extncampno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extncampno")));
String empseq = Util.Uni2Ksc(Util.checkString(req.getParameter("empseq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setRdr_extncampno(rdr_extncampno);
dm.setEmpseq(empseq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Dec 16 11:53:45 KST 2003 */