/***************************************************************************************************
* 파일명 : CO_DLCO_1005_LDM.java
* 기능 : 공통-공통거래처
* 작성일자 : 2009-04-13
* 작성자 : 양정녕
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.co.dlco.dm;


import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.dlco.ds.*;
import chosun.ciis.co.dlco.rec.*;

/**
 * 
 */


public class CO_DLCO_1005_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String ern;

	public CO_DLCO_1005_LDM(){}
	public CO_DLCO_1005_LDM(String cmpy_cd, String ern){
		this.cmpy_cd = cmpy_cd;
		this.ern = ern;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getErn(){
		return this.ern;
	}

	public String getSQL(){
		 return "{ call MISCOM.SP_CO_DLCO_1005_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_DLCO_1005_LDM dm = (CO_DLCO_1005_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.ern);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.dlco.ds.CO_DLCO_1005_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("ern = [" + getErn() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String ern = req.getParameter("ern");
if( ern == null){
	System.out.println(this.toString+" : ern is null" );
}else{
	System.out.println(this.toString+" : ern is "+ern );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String ern = Util.checkString(req.getParameter("ern"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String ern = Util.Uni2Ksc(Util.checkString(req.getParameter("ern")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setErn(ern);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 08 21:09:15 KST 2009 */