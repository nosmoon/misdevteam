/***************************************************************************************************
* ���ϸ� : PS_L_SEND_LUMP_CNFM.java
* ��� :  �߼�-�ϰ��߼� Ȯ��ó�� 
* �ۼ����� : 2004-02-26
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
 * �߼�-�ϰ��߼� Ȯ��ó��
 *
 */

public class PS_L_SEND_LUMP_CNFMDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String cmpycd;
	public String mediser_no;
	public String medicd;

	public PS_L_SEND_LUMP_CNFMDM(){}
	public PS_L_SEND_LUMP_CNFMDM(String bocd, String cmpycd, String mediser_no, String medicd){
		this.bocd = bocd;
		this.cmpycd = cmpycd;
		this.mediser_no = mediser_no;
		this.medicd = medicd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setMediser_no(String mediser_no){
		this.mediser_no = mediser_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getMediser_no(){
		return this.mediser_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_SEND_LUMP_CNFM( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_SEND_LUMP_CNFMDM dm = (PS_L_SEND_LUMP_CNFMDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.cmpycd);
		cstmt.setString(5, dm.mediser_no);
		cstmt.setString(6, dm.medicd);
		cstmt.registerOutParameter(7, Types.INTEGER);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.send.ds.PS_L_SEND_LUMP_CNFMDataSet();
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
String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String mediser_no = req.getParameter("mediser_no");
if( mediser_no == null){
	System.out.println(this.toString+" : mediser_no is null" );
}else{
	System.out.println(this.toString+" : mediser_no is "+mediser_no );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.checkString(req.getParameter("bocd"));
String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String mediser_no = Util.checkString(req.getParameter("mediser_no"));
String medicd = Util.checkString(req.getParameter("medicd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String mediser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mediser_no")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setBocd(bocd);
dm.setCmpycd(cmpycd);
dm.setMediser_no(mediser_no);
dm.setMedicd(medicd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 07 21:29:48 KST 2005 */