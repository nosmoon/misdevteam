/***************************************************************************************************
* ���ϸ� : .java
* ��� : �Ǹ�-��������-�̻絶�ڼ�����Ȳ
* �ۼ����� : 2011-12-05
* �ۼ��� : �̱⿵
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 
 */


public class ABC_L_AUTHRATIODM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String basi_dt;
	public String basi_yy;
	public String bocd;

	public ABC_L_AUTHRATIODM(){}
	public ABC_L_AUTHRATIODM(String basi_dt, String basi_yy, String bocd){
		this.basi_dt = basi_dt;
		this.basi_yy = basi_yy;
		this.bocd = bocd;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setBasi_yy(String basi_yy){
		this.basi_yy = basi_yy;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getBasi_yy(){
		return this.basi_yy;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_ABC_L_AUTHRATIO(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		ABC_L_AUTHRATIODM dm = (ABC_L_AUTHRATIODM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.basi_dt);
		cstmt.setString(4, dm.basi_yy);
		cstmt.setString(5, dm.bocd);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.ABC_L_AUTHRATIODataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("basi_dt = [" + getBasi_dt() + "]");
		System.out.println("basi_yy = [" + getBasi_yy() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String basi_dt = req.getParameter("basi_dt");
if( basi_dt == null){
	System.out.println(this.toString+" : basi_dt is null" );
}else{
	System.out.println(this.toString+" : basi_dt is "+basi_dt );
}
String basi_yy = req.getParameter("basi_yy");
if( basi_yy == null){
	System.out.println(this.toString+" : basi_yy is null" );
}else{
	System.out.println(this.toString+" : basi_yy is "+basi_yy );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String basi_dt = Util.checkString(req.getParameter("basi_dt"));
String basi_yy = Util.checkString(req.getParameter("basi_yy"));
String bocd = Util.checkString(req.getParameter("bocd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_dt")));
String basi_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_yy")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setBasi_dt(basi_dt);
dm.setBasi_yy(basi_yy);
dm.setBocd(bocd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Apr 03 07:50:27 GMT 2013 */