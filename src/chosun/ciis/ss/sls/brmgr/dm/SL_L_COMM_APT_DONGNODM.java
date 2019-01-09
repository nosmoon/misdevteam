/***************************************************************************************************
 * ���ϸ�   : SL_L_COMM_APT_DONGNODM.java
 * ���     : �����濵-����Ʈ������-�����
 * �ۼ����� : 2005/10/14
 * �ۼ���   : ����
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
**  �����濵-����Ʈ������-�����
**/

public class SL_L_COMM_APT_DONGNODM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String addrcd;

	public SL_L_COMM_APT_DONGNODM(){}
	public SL_L_COMM_APT_DONGNODM(String bocd, String addrcd){
		this.bocd = bocd;
		this.addrcd = addrcd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setAddrcd(String addrcd){
		this.addrcd = addrcd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getAddrcd(){
		return this.addrcd;
	}

	public String getSQL(){
		 return "{ call SP_SL_L_COMM_APT_DONGNO( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_L_COMM_APT_DONGNODM dm = (SL_L_COMM_APT_DONGNODM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.addrcd);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SL_L_COMM_APT_DONGNODataSet();
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
String addrcd = req.getParameter("addrcd");
if( addrcd == null){
	System.out.println(this.toString+" : addrcd is null" );
}else{
	System.out.println(this.toString+" : addrcd is "+addrcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.checkString(req.getParameter("bocd"));
String addrcd = Util.checkString(req.getParameter("addrcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String addrcd = Util.Uni2Ksc(Util.checkString(req.getParameter("addrcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setBocd(bocd);
dm.setAddrcd(addrcd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Oct 14 14:11:02 KST 2005 */