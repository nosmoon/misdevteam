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


package chosun.ciis.mt.etccar.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etccar.ds.*;
import chosun.ciis.mt.etccar.rec.*;

/**
 * 
 */


public class MT_ETCCAR_9301_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String driv_dt;
	public String search_gubun;

	public MT_ETCCAR_9301_LDM(){}
	public MT_ETCCAR_9301_LDM(String cmpy_cd, String drvr_dt, String search_gubun){
		this.cmpy_cd = cmpy_cd;
		this.driv_dt = drvr_dt;
		this.search_gubun = search_gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDriv_dt(String driv_dt){
		this.driv_dt = driv_dt;
	}
	
	public void setSearch_gubun(String search_gubun){
		this.search_gubun = search_gubun;
	}
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDriv_dt(){
		return this.driv_dt;
	}

	public String getSearch_gubun(){
		return this.search_gubun;
	}
	
	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCCAR_9301_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCCAR_9301_LDM dm = (MT_ETCCAR_9301_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.driv_dt);
		cstmt.setString(5, dm.search_gubun);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etccar.ds.MT_ETCCAR_9301_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("drvr_dt = [" + getDriv_dt() + "]");
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
String drvr_dt = req.getParameter("drvr_dt");
if( drvr_dt == null){
	System.out.println(this.toString+" : drvr_dt is null" );
}else{
	System.out.println(this.toString+" : drvr_dt is "+drvr_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String drvr_dt = Util.checkString(req.getParameter("drvr_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String drvr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("drvr_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setDrvr_dt(drvr_dt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Sep 10 18:49:20 KST 2012 */