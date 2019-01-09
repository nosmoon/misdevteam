/***************************************************************************************************
 * 파일명   : PS_U_EXTN_BO_ASINDM.java
 * 기능     : 독자-지사배정처리 저장
 * 작성일자 : 2004-03-03
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/


package chosun.ciis.ps.pbs.reader.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.reader.ds.*;
import chosun.ciis.ps.pbs.reader.rec.*;

/**
 * 독자-지사배정처리 저장
 */

public class PS_U_EXTN_BO_ASINDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String incmgpers;
	public String extnboasinarr;

	public PS_U_EXTN_BO_ASINDM(){}
	public PS_U_EXTN_BO_ASINDM(String cmpycd, String incmgpers, String extnboasinarr){
		this.cmpycd = cmpycd;
		this.incmgpers = incmgpers;
		this.extnboasinarr = extnboasinarr;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setExtnboasinarr(String extnboasinarr){
		this.extnboasinarr = extnboasinarr;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getExtnboasinarr(){
		return this.extnboasinarr;
	}

	public String getSQL(){
		 return "{ call SP_PS_U_EXTN_BO_ASIN( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_U_EXTN_BO_ASINDM dm = (PS_U_EXTN_BO_ASINDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.extnboasinarr);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.reader.ds.PS_U_EXTN_BO_ASINDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String extnboasinarr = req.getParameter("extnboasinarr");
if( extnboasinarr == null){
	System.out.println(this.toString+" : extnboasinarr is null" );
}else{
	System.out.println(this.toString+" : extnboasinarr is "+extnboasinarr );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String extnboasinarr = Util.checkString(req.getParameter("extnboasinarr"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String extnboasinarr = Util.Uni2Ksc(Util.checkString(req.getParameter("extnboasinarr")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setIncmgpers(incmgpers);
dm.setExtnboasinarr(extnboasinarr);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 03 19:20:33 KST 2004 */