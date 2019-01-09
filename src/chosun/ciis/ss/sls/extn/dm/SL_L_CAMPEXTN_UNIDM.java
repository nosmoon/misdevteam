/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 2012-02-20
* 작성자 : 
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
 * 
 */


public class SL_L_CAMPEXTN_UNIDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String fr_dt;
	public String to_dt;

	public SL_L_CAMPEXTN_UNIDM(){}
	public SL_L_CAMPEXTN_UNIDM(String fr_dt, String to_dt){
		this.fr_dt = fr_dt;
		this.to_dt = to_dt;
	}

	public void setFr_dt(String fr_dt){
		this.fr_dt = fr_dt;
	}

	public void setTo_dt(String to_dt){
		this.to_dt = to_dt;
	}

	public String getFr_dt(){
		return this.fr_dt;
	}

	public String getTo_dt(){
		return this.to_dt;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SL_L_CAMPEXTN_UNI(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_L_CAMPEXTN_UNIDM dm = (SL_L_CAMPEXTN_UNIDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.fr_dt);
		cstmt.setString(4, dm.to_dt);
		cstmt.registerOutParameter(5, Types.INTEGER);
		cstmt.registerOutParameter(6, Types.INTEGER);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SL_L_CAMPEXTN_UNIDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("fr_dt = [" + getFr_dt() + "]");
		System.out.println("to_dt = [" + getTo_dt() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String fr_dt = req.getParameter("fr_dt");
if( fr_dt == null){
	System.out.println(this.toString+" : fr_dt is null" );
}else{
	System.out.println(this.toString+" : fr_dt is "+fr_dt );
}
String to_dt = req.getParameter("to_dt");
if( to_dt == null){
	System.out.println(this.toString+" : to_dt is null" );
}else{
	System.out.println(this.toString+" : to_dt is "+to_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String fr_dt = Util.checkString(req.getParameter("fr_dt"));
String to_dt = Util.checkString(req.getParameter("to_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_dt")));
String to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFr_dt(fr_dt);
dm.setTo_dt(to_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 21 16:54:07 KST 2012 */