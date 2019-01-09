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


package chosun.ciis.ad.com.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.com.ds.*;
import chosun.ciis.ad.com.rec.*;

/**
 * 
 */


public class AD_COM_1410_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String search_dt;

	public AD_COM_1410_LDM(){}
	public AD_COM_1410_LDM(String cmpy_cd, String search_dt){
		this.cmpy_cd = cmpy_cd;
		this.search_dt = search_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSearch_dt(String search_dt){
		this.search_dt = search_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSearch_dt(){
		return this.search_dt;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_COM_1410_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_COM_1410_LDM dm = (AD_COM_1410_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.search_dt);
		cstmt.registerOutParameter(5, Types.INTEGER);
		cstmt.registerOutParameter(6, Types.INTEGER);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.com.ds.AD_COM_1410_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("search_dt = [" + getSearch_dt() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String search_dt = req.getParameter("search_dt");
if( search_dt == null){
	System.out.println(this.toString+" : search_dt is null" );
}else{
	System.out.println(this.toString+" : search_dt is "+search_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String search_dt = Util.checkString(req.getParameter("search_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String search_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("search_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setSearch_dt(search_dt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Mar 27 17:31:31 KST 2012 */