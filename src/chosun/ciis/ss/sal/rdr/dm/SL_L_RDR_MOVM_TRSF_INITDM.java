/***************************************************************************************************
* ���ϸ� : SL_L_RDR_MOVM_TRSF_INITDM.java
* ��� : �̻絶�ڰ���-�ΰ�(�ʱ�ȭ��)
* �ۼ����� : 2003-12-17
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
 * �̻絶�ڰ���-�ΰ�(�ʱ�ȭ��)
 *
 */

public class SL_L_RDR_MOVM_TRSF_INITDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;

	public SL_L_RDR_MOVM_TRSF_INITDM(){}
	public SL_L_RDR_MOVM_TRSF_INITDM(String bocd){
		this.bocd = bocd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getSQL(){
        return "{ call SP_SL_L_RDR_MOVM_TRSF_INIT( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_L_RDR_MOVM_TRSF_INITDM dm = (SL_L_RDR_MOVM_TRSF_INITDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_L_RDR_MOVM_TRSF_INITDataSet();
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.checkString(req.getParameter("bocd"));
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setBocd(bocd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Feb 02 21:48:01 KST 2004 */