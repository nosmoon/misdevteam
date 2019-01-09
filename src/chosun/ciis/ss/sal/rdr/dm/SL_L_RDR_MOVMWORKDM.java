/***************************************************************************************************
* ���ϸ� : SL_L_RDR_MOVMWORKDM.java
* ��� : ����������������-�ΰ�(�ΰ��۾���ϰ˻�)
*       ����������������-�μ�(�μ��۾���ϰ˻�)
* �ۼ����� : 2004-02-07
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
 * ����������������-�ΰ�(�ΰ��۾���ϰ˻�)
 * ����������������-�μ�(�μ��۾���ϰ˻�)
 * Ư����� : ���������ڴ� ����������������(�ΰ�� �μ��� ���� ���ӿ� ������ ��)
 */


public class SL_L_RDR_MOVMWORKDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String actrclsf;

	public SL_L_RDR_MOVMWORKDM(){}
	public SL_L_RDR_MOVMWORKDM(String bocd, String actrclsf){
		this.bocd = bocd;
		this.actrclsf = actrclsf;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setActrclsf(String actrclsf){
		this.actrclsf = actrclsf;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getActrclsf(){
		return this.actrclsf;
	}

	public String getSQL(){
		 return "{ call SP_SL_L_RDR_MOVMWORK( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_L_RDR_MOVMWORKDM dm = (SL_L_RDR_MOVMWORKDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.actrclsf);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_L_RDR_MOVMWORKDataSet();
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
String actrclsf = req.getParameter("actrclsf");
if( actrclsf == null){
	System.out.println(this.toString+" : actrclsf is null" );
}else{
	System.out.println(this.toString+" : actrclsf is "+actrclsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.checkString(req.getParameter("bocd"));
String actrclsf = Util.checkString(req.getParameter("actrclsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String actrclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("actrclsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setBocd(bocd);
dm.setActrclsf(actrclsf);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Feb 07 16:47:38 KST 2004 */