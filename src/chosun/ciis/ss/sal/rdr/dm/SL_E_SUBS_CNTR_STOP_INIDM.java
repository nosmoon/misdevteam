/***************************************************************************************************
* ���ϸ� : SL_E_SUBS_CNTR_STOP_INIDM.java
* ��� : ������������(���������˾�-�ʱ�ȭ)
* �ۼ����� : 2004-02-11
* �ۼ��� : �迵��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.ds.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * ������������(���������˾�-�ʱ�ȭ)
 *
 */


public class SL_E_SUBS_CNTR_STOP_INIDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String rdr_no;

	public SL_E_SUBS_CNTR_STOP_INIDM(){}
	public SL_E_SUBS_CNTR_STOP_INIDM(String bocd, String rdr_no){
		this.bocd = bocd;
		this.rdr_no = rdr_no;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getSQL(){
		 return "{ call SP_SL_E_SUBS_CNTR_STOP_INI( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_E_SUBS_CNTR_STOP_INIDM dm = (SL_E_SUBS_CNTR_STOP_INIDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.rdr_no);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_E_SUBS_CNTR_STOP_INIDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.checkString(req.getParameter("bocd"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setBocd(bocd);
dm.setRdr_no(rdr_no);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Feb 11 21:56:53 KST 2004 */