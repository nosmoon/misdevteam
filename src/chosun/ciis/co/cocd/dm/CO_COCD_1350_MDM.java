/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
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
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String menu_id = req.getParameter("menu_id");
if( menu_id == null){
	System.out.println(this.toString+" : menu_id is null" );
}else{
	System.out.println(this.toString+" : menu_id is "+menu_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String menu_id = Util.checkString(req.getParameter("menu_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String menu_id = Util.Uni2Ksc(Util.checkString(req.getParameter("menu_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setMenu_id(menu_id);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Dec 26 20:36:51 KST 2011 */