/***************************************************************************************************
* ���ϸ� : PS_L_SEND_ADDM_CNFM.java
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

public class PS_L_SEND_ADDM_CNFMDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String bocd;
	public String senddt;
	public String medicd;
	public String mediser_no;

	public PS_L_SEND_ADDM_CNFMDM(){}
	public PS_L_SEND_ADDM_CNFMDM(String cmpycd, String bocd, String senddt, String medicd, String mediser_no){
		this.cmpycd = cmpycd;
		this.bocd = bocd;
		this.senddt = senddt;
		this.medicd = medicd;
		this.mediser_no = mediser_no;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setSenddt(String senddt){
		this.senddt = senddt;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMediser_no(String mediser_no){
		this.mediser_no = mediser_no;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getSenddt(){
		return this.senddt;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMediser_no(){
		return this.mediser_no;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_SEND_ADDM_CNFM( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_SEND_ADDM_CNFMDM dm = (PS_L_SEND_ADDM_CNFMDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.bocd);
		cstmt.setString(5, dm.senddt);
		cstmt.setString(6, dm.medicd);
		cstmt.setString(7, dm.mediser_no);
		cstmt.registerOutParameter(8, Types.INTEGER);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.send.ds.PS_L_SEND_ADDM_CNFMDataSet();
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
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String senddt = req.getParameter("senddt");
if( senddt == null){
	System.out.println(this.toString+" : senddt is null" );
}else{
	System.out.println(this.toString+" : senddt is "+senddt );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String mediser_no = req.getParameter("mediser_no");
if( mediser_no == null){
	System.out.println(this.toString+" : mediser_no is null" );
}else{
	System.out.println(this.toString+" : mediser_no is "+mediser_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String senddt = Util.checkString(req.getParameter("senddt"));
String medicd = Util.checkString(req.getParameter("medicd"));
String mediser_no = Util.checkString(req.getParameter("mediser_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String senddt = Util.Uni2Ksc(Util.checkString(req.getParameter("senddt")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String mediser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mediser_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpycd(cmpycd);
dm.setBocd(bocd);
dm.setSenddt(senddt);
dm.setMedicd(medicd);
dm.setMediser_no(mediser_no);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 07 21:25:04 KST 2005 */