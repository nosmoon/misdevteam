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


package chosun.ciis.mt.prnpap.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.prnpap.ds.*;
import chosun.ciis.mt.prnpap.rec.*;

/**
 * 
 */


public class MT_PRNPAP_3202_MDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String rem_length;

	public MT_PRNPAP_3202_MDM(){}
	public MT_PRNPAP_3202_MDM(String cmpy_cd, String rem_length){
		this.cmpy_cd = cmpy_cd;
		this.rem_length = rem_length;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRem_length(String rem_length){
		this.rem_length = rem_length;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRem_length(){
		return this.rem_length;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PRNPAP_3202_M(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PRNPAP_3202_MDM dm = (MT_PRNPAP_3202_MDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.rem_length);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.prnpap.ds.MT_PRNPAP_3202_MDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("rem_length = [" + getRem_length() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String rem_length = req.getParameter("rem_length");
if( rem_length == null){
	System.out.println(this.toString+" : rem_length is null" );
}else{
	System.out.println(this.toString+" : rem_length is "+rem_length );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String rem_length = Util.checkString(req.getParameter("rem_length"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rem_length = Util.Uni2Ksc(Util.checkString(req.getParameter("rem_length")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRem_length(rem_length);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 22 19:40:34 KST 2009 */