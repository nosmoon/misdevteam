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


package chosun.ciis.co.cocd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.cocd.ds.*;
import chosun.ciis.co.cocd.rec.*;

/**
 * 
 */


public class CO_COCD_1350_MDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String menu_id;

	public CO_COCD_1350_MDM(){}
	public CO_COCD_1350_MDM(String menu_id){
		this.menu_id = menu_id;
	}

	public void setMenu_id(String menu_id){
		this.menu_id = menu_id;
	}

	public String getMenu_id(){
		return this.menu_id;
	}

	public String getSQL(){
		 return "{ call MISCOM.SP_CO_COCD_1350_M(? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_COCD_1350_MDM dm = (CO_COCD_1350_MDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.menu_id);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.cocd.ds.CO_COCD_1350_MDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("menu_id = [" + getMenu_id() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String menu_id = req.getParameter("menu_id");
if( menu_id == null){
	System.out.println(this.toString+" : menu_id is null" );
}else{
	System.out.println(this.toString+" : menu_id is "+menu_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String menu_id = Util.checkString(req.getParameter("menu_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String menu_id = Util.Uni2Ksc(Util.checkString(req.getParameter("menu_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMenu_id(menu_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 26 20:36:51 KST 2011 */