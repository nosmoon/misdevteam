/***************************************************************************************************
* ���ϸ� : SS_S_INSRAPLCDM.java
* ��� : ��������-���غ���-�űԽ�û-�󼼸���� ���� DM
* �ۼ����� : 2004-02-19
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * ��������-���غ���-�űԽ�û-�󼼸���� ���� DM
 */

public class SS_S_INSRAPLCDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String cntryy;

	public SS_S_INSRAPLCDM(){}
	public SS_S_INSRAPLCDM(String bocd, String cntryy){
		this.bocd = bocd;
		this.cntryy = cntryy;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setCntryy(String cntryy){
		this.cntryy = cntryy;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getCntryy(){
		return this.cntryy;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_INSRAPLC( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_INSRAPLCDM dm = (SS_S_INSRAPLCDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.cntryy);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_S_INSRAPLCDataSet();
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
String cntryy = req.getParameter("cntryy");
if( cntryy == null){
	System.out.println(this.toString+" : cntryy is null" );
}else{
	System.out.println(this.toString+" : cntryy is "+cntryy );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.checkString(req.getParameter("bocd"));
String cntryy = Util.checkString(req.getParameter("cntryy"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String cntryy = Util.Uni2Ksc(Util.checkString(req.getParameter("cntryy")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setBocd(bocd);
dm.setCntryy(cntryy);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Feb 19 19:09:38 KST 2004 */