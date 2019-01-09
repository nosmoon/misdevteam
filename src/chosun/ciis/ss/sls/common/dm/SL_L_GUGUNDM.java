/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.common.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.rec.*;

/**
 * 
 */


public class SL_L_GUGUNDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String citynm;

	public SL_L_GUGUNDM(){}
	public SL_L_GUGUNDM(String citynm){
		this.citynm = citynm;
	}

	public void setCitynm(String citynm){
		this.citynm = citynm;
	}

	public String getCitynm(){
		return this.citynm;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SL_L_GUGUN(? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_L_GUGUNDM dm = (SL_L_GUGUNDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.citynm);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.common.ds.SL_L_GUGUNDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("citynm = [" + getCitynm() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String citynm = req.getParameter("citynm");
if( citynm == null){
	System.out.println(this.toString+" : citynm is null" );
}else{
	System.out.println(this.toString+" : citynm is "+citynm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String citynm = Util.checkString(req.getParameter("citynm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String citynm = Util.Uni2Ksc(Util.checkString(req.getParameter("citynm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCitynm(citynm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Nov 29 07:18:25 GMT 2013 */