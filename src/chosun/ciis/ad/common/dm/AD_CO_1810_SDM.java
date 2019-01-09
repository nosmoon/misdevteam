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


package chosun.ciis.ad.common.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.common.ds.*;
import chosun.ciis.ad.common.rec.*;

/**
 * 
 */


public class AD_CO_1810_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String pubc_dt;
	public String hndl_nm_cd;

	public AD_CO_1810_SDM(){}
	public AD_CO_1810_SDM(String cmpy_cd, String pubc_dt, String hndl_nm_cd){
		this.cmpy_cd = cmpy_cd;
		this.pubc_dt = pubc_dt;
		this.hndl_nm_cd = hndl_nm_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt; 
	}

	public void setHndl_nm_cd(String hndl_nm_cd){
		this.hndl_nm_cd = hndl_nm_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getHndl_nm_cd(){
		return this.hndl_nm_cd;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_CO_1810_S(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_CO_1810_SDM dm = (AD_CO_1810_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.pubc_dt);
		cstmt.setString(5, dm.hndl_nm_cd);
		cstmt.registerOutParameter(6, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.common.ds.AD_CO_1810_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("pubc_dt = [" + getPubc_dt() + "]");
		System.out.println("hndl_nm_cd = [" + getHndl_nm_cd() + "]");
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
String pubc_dt = req.getParameter("pubc_dt");
if( pubc_dt == null){
	System.out.println(this.toString+" : pubc_dt is null" );
}else{
	System.out.println(this.toString+" : pubc_dt is "+pubc_dt );
}
String hndl_nm_cd = req.getParameter("hndl_nm_cd");
if( hndl_nm_cd == null){
	System.out.println(this.toString+" : hndl_nm_cd is null" );
}else{
	System.out.println(this.toString+" : hndl_nm_cd is "+hndl_nm_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));
String hndl_nm_cd = Util.checkString(req.getParameter("hndl_nm_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String pubc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_dt")));
String hndl_nm_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("hndl_nm_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setPubc_dt(pubc_dt);
dm.setHndl_nm_cd(hndl_nm_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Feb 06 16:15:24 KST 2014 */