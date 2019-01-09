/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자관리 비독자관리 상세조회 
* 작성일자 : 2009/09/25
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * 독자관리 비독자관리 상세조회
 */

public class SS_S_RDR_MNGMEMBDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String custclas;
	public String custseq;

	public SS_S_RDR_MNGMEMBDM(){}
	public SS_S_RDR_MNGMEMBDM(String cmpycd, String custclas, String custseq){
		this.cmpycd = cmpycd;
		this.custclas = custclas;
		this.custseq = custseq;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setCustclas(String custclas){
		this.custclas = custclas;
	}

	public void setCustseq(String custseq){
		this.custseq = custseq;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getCustclas(){
		return this.custclas;
	}

	public String getCustseq(){
		return this.custseq;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_RDR_MNGMEMB( ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_RDR_MNGMEMBDM dm = (SS_S_RDR_MNGMEMBDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.custclas);
		cstmt.setString(5, dm.custseq);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.rdr.ds.SS_S_RDR_MNGMEMBDataSet();
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
String custclas = req.getParameter("custclas");
if( custclas == null){
	System.out.println(this.toString+" : custclas is null" );
}else{
	System.out.println(this.toString+" : custclas is "+custclas );
}
String custseq = req.getParameter("custseq");
if( custseq == null){
	System.out.println(this.toString+" : custseq is null" );
}else{
	System.out.println(this.toString+" : custseq is "+custseq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String custclas = Util.checkString(req.getParameter("custclas"));
String custseq = Util.checkString(req.getParameter("custseq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String custclas = Util.Uni2Ksc(Util.checkString(req.getParameter("custclas")));
String custseq = Util.Uni2Ksc(Util.checkString(req.getParameter("custseq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setCustclas(custclas);
dm.setCustseq(custseq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Sep 25 13:44:51 KST 2009 */