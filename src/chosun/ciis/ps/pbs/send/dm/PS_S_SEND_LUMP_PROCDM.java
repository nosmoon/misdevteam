/***************************************************************************************************
* ���ϸ� : PS_S_SEND_LUMP_PROC.java
* ���   : ���Ǳ� �߼� ���� ���� �ڵ�
* �ۼ����� : 2006-04-19
* �ۼ��� : ����ǥ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/



package chosun.ciis.ps.pbs.send.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.send.ds.*;
import chosun.ciis.ps.pbs.send.rec.*;

/**
 * ���Ǳ� -�߼� ���� �ڵ�
 *
 */

public class PS_S_SEND_LUMP_PROCDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String medicd;
	public String sendtype;

	public PS_S_SEND_LUMP_PROCDM(){}
	public PS_S_SEND_LUMP_PROCDM(String cmpycd, String medicd, String sendtype){
		this.cmpycd = cmpycd;
		this.medicd = medicd;
		this.sendtype = sendtype;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setSendtype(String sendtype){
		this.sendtype = sendtype;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getSendtype(){
		return this.sendtype;
	}

	public String getSQL(){
		 return "{ call SP_PS_S_SEND_LUMP_PROC( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_S_SEND_LUMP_PROCDM dm = (PS_S_SEND_LUMP_PROCDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.medicd);
		cstmt.setString(5, dm.sendtype);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.send.ds.PS_S_SEND_LUMP_PROCDataSet();
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
String sendtype = req.getParameter("sendtype");
if( sendtype == null){
	System.out.println(this.toString+" : sendtype is null" );
}else{
	System.out.println(this.toString+" : sendtype is "+sendtype );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String medicd = Util.checkString(req.getParameter("medicd"));
String sendtype = Util.checkString(req.getParameter("sendtype"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String sendtype = Util.Uni2Ksc(Util.checkString(req.getParameter("sendtype")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpycd(cmpycd);
dm.setMedicd(medicd);
dm.setSendtype(sendtype);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Oct 27 17:45:56 KST 2006 */