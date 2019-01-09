/***************************************************************************************************
* 파일명 : SS_S_INSRACCDDM.java
* 기능 : 지국지원-상해보험-사고-상세를 위한 DM
* 작성일자 : 2004-02-23
* 작성자 : 김대섭
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
 * 지국지원-상해보험-사고-상세를 위한 DM
 */

public class SS_S_INSRACCDDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String acpndt;
	public String accdacpnno;

	public SS_S_INSRACCDDM(){}
	public SS_S_INSRACCDDM(String acpndt, String accdacpnno){
		this.acpndt = acpndt;
		this.accdacpnno = accdacpnno;
	}

	public void setAcpndt(String acpndt){
		this.acpndt = acpndt;
	}

	public void setAccdacpnno(String accdacpnno){
		this.accdacpnno = accdacpnno;
	}

	public String getAcpndt(){
		return this.acpndt;
	}

	public String getAccdacpnno(){
		return this.accdacpnno;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_INSRACCD( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_INSRACCDDM dm = (SS_S_INSRACCDDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.acpndt);
		cstmt.setString(4, dm.accdacpnno);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_S_INSRACCDDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String acpndt = req.getParameter("acpndt");
if( acpndt == null){
	System.out.println(this.toString+" : acpndt is null" );
}else{
	System.out.println(this.toString+" : acpndt is "+acpndt );
}
String accdacpnno = req.getParameter("accdacpnno");
if( accdacpnno == null){
	System.out.println(this.toString+" : accdacpnno is null" );
}else{
	System.out.println(this.toString+" : accdacpnno is "+accdacpnno );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String acpndt = Util.checkString(req.getParameter("acpndt"));
String accdacpnno = Util.checkString(req.getParameter("accdacpnno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String acpndt = Util.Uni2Ksc(Util.checkString(req.getParameter("acpndt")));
String accdacpnno = Util.Uni2Ksc(Util.checkString(req.getParameter("accdacpnno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAcpndt(acpndt);
dm.setAccdacpnno(accdacpnno);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 23 20:55:38 KST 2004 */