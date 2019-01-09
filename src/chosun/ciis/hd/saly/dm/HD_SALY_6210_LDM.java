/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.saly.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.ds.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_6210_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String fit_yy;
	public String fit_no;

	public HD_SALY_6210_LDM(){}
	public HD_SALY_6210_LDM(String fit_yy, String fit_no){
		this.fit_yy = fit_yy;
		this.fit_no = fit_no;
	}

	public void setFit_yy(String fit_yy){
		this.fit_yy = fit_yy;
	}

	public void setFit_no(String fit_no){
		this.fit_no = fit_no;
	}

	public String getFit_yy(){
		return this.fit_yy;
	}

	public String getFit_no(){
		return this.fit_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_6210_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_6210_LDM dm = (HD_SALY_6210_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.fit_yy);
		cstmt.setString(4, dm.fit_no);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.saly.ds.HD_SALY_6210_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("fit_yy = [" + getFit_yy() + "]");
		System.out.println("fit_no = [" + getFit_no() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String fit_yy = req.getParameter("fit_yy");
if( fit_yy == null){
	System.out.println(this.toString+" : fit_yy is null" );
}else{
	System.out.println(this.toString+" : fit_yy is "+fit_yy );
}
String fit_no = req.getParameter("fit_no");
if( fit_no == null){
	System.out.println(this.toString+" : fit_no is null" );
}else{
	System.out.println(this.toString+" : fit_no is "+fit_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String fit_yy = Util.checkString(req.getParameter("fit_yy"));
String fit_no = Util.checkString(req.getParameter("fit_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String fit_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("fit_yy")));
String fit_no = Util.Uni2Ksc(Util.checkString(req.getParameter("fit_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFit_yy(fit_yy);
dm.setFit_no(fit_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Sep 17 14:12:39 KST 2015 */