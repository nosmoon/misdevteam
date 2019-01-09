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


public class ABC_L_AUTHRATIODTLDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String basi_dt;
	public String bocd;
	public String abcclsf;

	public ABC_L_AUTHRATIODTLDM(){}
	public ABC_L_AUTHRATIODTLDM(String basi_dt, String bocd, String abcclsf){
		this.basi_dt = basi_dt;
		this.bocd = bocd;
		this.abcclsf = abcclsf;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setAbcclsf(String abcclsf){
		this.abcclsf = abcclsf;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getAbcclsf(){
		return this.abcclsf;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_ABC_L_AUTHRATIODTL(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		ABC_L_AUTHRATIODTLDM dm = (ABC_L_AUTHRATIODTLDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.basi_dt);
		cstmt.setString(4, dm.bocd);
		cstmt.setString(5, dm.abcclsf);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.ABC_L_AUTHRATIODTLDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("basi_dt = [" + getBasi_dt() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("abcclsf = [" + getAbcclsf() + "]");
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
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String abcclsf = req.getParameter("abcclsf");
if( abcclsf == null){
	System.out.println(this.toString+" : abcclsf is null" );
}else{
	System.out.println(this.toString+" : abcclsf is "+abcclsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String basi_dt = Util.checkString(req.getParameter("basi_dt"));
String bocd = Util.checkString(req.getParameter("bocd"));
String abcclsf = Util.checkString(req.getParameter("abcclsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_dt")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String abcclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("abcclsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setBasi_dt(basi_dt);
dm.setBocd(bocd);
dm.setAbcclsf(abcclsf);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Apr 03 08:16:01 GMT 2013 */