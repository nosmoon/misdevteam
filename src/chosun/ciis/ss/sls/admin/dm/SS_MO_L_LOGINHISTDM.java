/***************************************************************************************************
* 파일명 : SS_MO_L_LOGINHISTDM.java
* 기능 : CIIS-판매-기준정보관리-모바일로그인관리-로그인이력을 위한 DM
* 작성일자 : 2017-07-10
* 작성자 : 장선희
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
 *  CIIS-판매-기준정보관리-모바일로그인관리-로그인이력을 위한 DM
 */


public class SS_MO_L_LOGINHISTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String boemp_id;

	public SS_MO_L_LOGINHISTDM(){}
	public SS_MO_L_LOGINHISTDM(String boemp_id){
		this.boemp_id = boemp_id;
	}

	public void setBoemp_id(String boemp_id){
		this.boemp_id = boemp_id;
	}

	public String getBoemp_id(){
		return this.boemp_id;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_MO_L_LOGINHIST(? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_MO_L_LOGINHISTDM dm = (SS_MO_L_LOGINHISTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.boemp_id);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_MO_L_LOGINHISTDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("boemp_id = [" + getBoemp_id() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String boemp_id = req.getParameter("boemp_id");
if( boemp_id == null){
	System.out.println(this.toString+" : boemp_id is null" );
}else{
	System.out.println(this.toString+" : boemp_id is "+boemp_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String boemp_id = Util.checkString(req.getParameter("boemp_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String boemp_id = Util.Uni2Ksc(Util.checkString(req.getParameter("boemp_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBoemp_id(boemp_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 10 17:17:49 KST 2017 */