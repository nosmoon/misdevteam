/***************************************************************************************************
 * ���ϸ�   : SP_SS_S_BO_SEND_INIT
 * ���     : �����濵-�ְ������߼۰���
 * �ۼ����� : 2007/04/25
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
**  SP_SS_S_BO_SEND_INIT
**/

public class SS_S_BO_SEND_INITDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String medicd;
	public String deptcd;

	public SS_S_BO_SEND_INITDM(){}
	public SS_S_BO_SEND_INITDM(String cmpycd, String medicd, String deptcd){
		this.cmpycd = cmpycd;
		this.medicd = medicd;
		this.deptcd = deptcd;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_BO_SEND_INIT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_BO_SEND_INITDM dm = (SS_S_BO_SEND_INITDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.medicd);
		cstmt.setString(5, dm.deptcd);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_S_BO_SEND_INITDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String medicd = Util.checkString(req.getParameter("medicd"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpycd(cmpycd);
dm.setMedicd(medicd);
dm.setDeptcd(deptcd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Apr 25 10:07:11 KST 2007 */