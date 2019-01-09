/***************************************************************************************************
* ���ϸ� : 
* ��� :  �߼�-�߰��߼� �߼�ó��
* �ۼ����� : 2004-03-08
* �ۼ��� : ���ȯ
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
 * �߼�-�߰��߼� �߼�ó��
 *
 */

public class PS_L_SEND_ADDM_MTHD_DTLSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String medicd;
	public String senddt;

	public PS_L_SEND_ADDM_MTHD_DTLSDM(){}
	public PS_L_SEND_ADDM_MTHD_DTLSDM(String bocd, String medicd, String senddt){
		this.bocd = bocd;
		this.medicd = medicd;
		this.senddt = senddt;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setSenddt(String senddt){
		this.senddt = senddt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getSenddt(){
		return this.senddt;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_SEND_ADDM_MTHD_DTLS( ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_SEND_ADDM_MTHD_DTLSDM dm = (PS_L_SEND_ADDM_MTHD_DTLSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.medicd);
		cstmt.setString(5, dm.senddt);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.send.ds.PS_L_SEND_ADDM_MTHD_DTLSDataSet();
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
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String senddt = req.getParameter("senddt");
if( senddt == null){
	System.out.println(this.toString+" : senddt is null" );
}else{
	System.out.println(this.toString+" : senddt is "+senddt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.checkString(req.getParameter("bocd"));
String medicd = Util.checkString(req.getParameter("medicd"));
String senddt = Util.checkString(req.getParameter("senddt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String senddt = Util.Uni2Ksc(Util.checkString(req.getParameter("senddt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setBocd(bocd);
dm.setMedicd(medicd);
dm.setSenddt(senddt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Mar 09 10:31:36 KST 2004 */