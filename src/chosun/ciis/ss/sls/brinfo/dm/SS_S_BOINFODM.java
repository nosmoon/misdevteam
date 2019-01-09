/***************************************************************************************************
* ���ϸ� : SS_S_BOINFODM.java
* ��� : ����Info-������Ȳ-�󼼸� ���� DM
* �ۼ����� : 2004-04-24
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.rec.*;

/**
 * ����Info-������Ȳ-�󼼸� ���� DM
 */

public class SS_S_BOINFODM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String basi_yymm;

	public SS_S_BOINFODM(){}
	public SS_S_BOINFODM(String bocd, String basi_yymm){
		this.bocd = bocd;
		this.basi_yymm = basi_yymm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBasi_yymm(String basi_yymm){
		this.basi_yymm = basi_yymm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBasi_yymm(){
		return this.basi_yymm;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_BOINFO( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_BOINFODM dm = (SS_S_BOINFODM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.basi_yymm);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brinfo.ds.SS_S_BOINFODataSet();
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
String basi_yymm = req.getParameter("basi_yymm");
if( basi_yymm == null){
	System.out.println(this.toString+" : basi_yymm is null" );
}else{
	System.out.println(this.toString+" : basi_yymm is "+basi_yymm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.checkString(req.getParameter("bocd"));
String basi_yymm = Util.checkString(req.getParameter("basi_yymm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String basi_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_yymm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setBocd(bocd);
dm.setBasi_yymm(basi_yymm);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed May 19 17:16:57 KST 2004 */