/***************************************************************************************************
* 파일명 : SS_L_JUSODM.java
* 기능 : 관리자-우편번호-상세목록(판매국 우편번호)을 위한 DM
* 작성일자 : 2004-03-09
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
 * 관리자-우편번호-상세목록(판매국 우편번호)을 위한 DM
 */

public class SS_L_JUSODM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String zip1;
	public String zip2;
	public String zip3;

	public SS_L_JUSODM(){}
	public SS_L_JUSODM(String zip1, String zip2, String zip3){
		this.zip1 = zip1;
		this.zip2 = zip2;
		this.zip3 = zip3;
	}

	public void setZip1(String zip1){
		this.zip1 = zip1;
	}

	public void setZip2(String zip2){
		this.zip2 = zip2;
	}

	public void setZip3(String zip3){
		this.zip3 = zip3;
	}

	public String getZip1(){
		return this.zip1;
	}

	public String getZip2(){
		return this.zip2;
	}

	public String getZip3(){
		return this.zip3;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_JUSO( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_JUSODM dm = (SS_L_JUSODM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.zip1);
		cstmt.setString(4, dm.zip2);
		cstmt.setString(5, dm.zip3);
		cstmt.registerOutParameter(6, Types.INTEGER);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_L_JUSODataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String zip1 = req.getParameter("zip1");
if( zip1 == null){
	System.out.println(this.toString+" : zip1 is null" );
}else{
	System.out.println(this.toString+" : zip1 is "+zip1 );
}
String zip2 = req.getParameter("zip2");
if( zip2 == null){
	System.out.println(this.toString+" : zip2 is null" );
}else{
	System.out.println(this.toString+" : zip2 is "+zip2 );
}
String zip3 = req.getParameter("zip3");
if( zip3 == null){
	System.out.println(this.toString+" : zip3 is null" );
}else{
	System.out.println(this.toString+" : zip3 is "+zip3 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String zip1 = Util.checkString(req.getParameter("zip1"));
String zip2 = Util.checkString(req.getParameter("zip2"));
String zip3 = Util.checkString(req.getParameter("zip3"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String zip1 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip1")));
String zip2 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip2")));
String zip3 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip3")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setZip1(zip1);
dm.setZip2(zip2);
dm.setZip3(zip3);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 10 15:28:17 KST 2004 */