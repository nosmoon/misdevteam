/***************************************************************************************************
* 파일명 : SS_L_RDR_EXTN_SERVCOSTDDM.java
* 기능 : 확장현황-조선IS확장-마감내역 상세목록을 위한 DM
* 작성일자 : 2004-04-24
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
 * 확장현황-조선IS확장-마감내역 상세목록을 위한 DM
 */


public class SS_L_RDR_EXTN_SERVCOSTDDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String basidt;
	public String stafno;

	public SS_L_RDR_EXTN_SERVCOSTDDM(){}
	public SS_L_RDR_EXTN_SERVCOSTDDM(String basidt, String stafno){
		this.basidt = basidt;
		this.stafno = stafno;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setStafno(String stafno){
		this.stafno = stafno;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public String getStafno(){
		return this.stafno;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_RDR_EXTN_SERVCOSTD( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_RDR_EXTN_SERVCOSTDDM dm = (SS_L_RDR_EXTN_SERVCOSTDDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.basidt);
		cstmt.setString(4, dm.stafno);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_RDR_EXTN_SERVCOSTDDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String basidt = req.getParameter("basidt");
if( basidt == null){
	System.out.println(this.toString+" : basidt is null" );
}else{
	System.out.println(this.toString+" : basidt is "+basidt );
}
String stafno = req.getParameter("stafno");
if( stafno == null){
	System.out.println(this.toString+" : stafno is null" );
}else{
	System.out.println(this.toString+" : stafno is "+stafno );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String basidt = Util.checkString(req.getParameter("basidt"));
String stafno = Util.checkString(req.getParameter("stafno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String basidt = Util.Uni2Ksc(Util.checkString(req.getParameter("basidt")));
String stafno = Util.Uni2Ksc(Util.checkString(req.getParameter("stafno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBasidt(basidt);
dm.setStafno(stafno);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 03 19:37:00 KST 2004 */