/***************************************************************************************************
* ���ϸ� : SS_MO_S_LOGINAPLC_APRVDM.java
* ��� : ������-����ϰ���-�α��ν��ν�û �󼼸� ���� DM
* �ۼ����� : 2016-09-28
* �ۼ��� : �弱��
***************************************************************************************************/
/***************************************************************************************************
* �������� : ����ڸ�, �Ի�����, �������. ���Ϳ���������, ���͵������, ���Ͱ������, ��������,�����α���
* ������ : �弱��
* �������� : 2017-07-06
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 *  ������-����ϰ���-�α��ν��ν�û �󼼸� ���� DM
 */


public class SS_MO_S_LOGINAPLC_APRVDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String boemp_no;
	public String boemp_id;

	public SS_MO_S_LOGINAPLC_APRVDM(){}
	public SS_MO_S_LOGINAPLC_APRVDM(String bocd, String boemp_no, String boemp_id){
		this.bocd = bocd;
		this.boemp_no = boemp_no;
		this.boemp_id = boemp_id;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBoemp_no(String boemp_no){
		this.boemp_no = boemp_no;
	}

	public void setBoemp_id(String boemp_id){
		this.boemp_id = boemp_id;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBoemp_no(){
		return this.boemp_no;
	}

	public String getBoemp_id(){
		return this.boemp_id;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_MO_S_LOGINAPLC_APRV(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_MO_S_LOGINAPLC_APRVDM dm = (SS_MO_S_LOGINAPLC_APRVDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.boemp_no);
		cstmt.setString(5, dm.boemp_id);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, Types.VARCHAR);
		cstmt.registerOutParameter(19, Types.VARCHAR);
		cstmt.registerOutParameter(20, Types.VARCHAR);
		cstmt.registerOutParameter(21, Types.VARCHAR);
		cstmt.registerOutParameter(22, Types.VARCHAR);
		cstmt.registerOutParameter(23, Types.VARCHAR);
		cstmt.registerOutParameter(24, Types.VARCHAR);
		cstmt.registerOutParameter(25, Types.VARCHAR);
		cstmt.registerOutParameter(26, Types.VARCHAR);
		cstmt.registerOutParameter(27, Types.VARCHAR);
		cstmt.registerOutParameter(28, Types.VARCHAR);
		cstmt.registerOutParameter(29, Types.VARCHAR);
		cstmt.registerOutParameter(30, Types.VARCHAR);
		cstmt.registerOutParameter(31, Types.VARCHAR);
		cstmt.registerOutParameter(32, Types.VARCHAR);
		cstmt.registerOutParameter(33, Types.VARCHAR);
		cstmt.registerOutParameter(34, Types.VARCHAR);
		cstmt.registerOutParameter(35, Types.VARCHAR);
		cstmt.registerOutParameter(36, Types.VARCHAR);
		cstmt.registerOutParameter(37, Types.VARCHAR);
		cstmt.registerOutParameter(38, Types.VARCHAR);
		cstmt.registerOutParameter(39, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_MO_S_LOGINAPLC_APRVDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("boemp_no = [" + getBoemp_no() + "]");
		System.out.println("boemp_id = [" + getBoemp_id() + "]");
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
String boemp_no = req.getParameter("boemp_no");
if( boemp_no == null){
	System.out.println(this.toString+" : boemp_no is null" );
}else{
	System.out.println(this.toString+" : boemp_no is "+boemp_no );
}
String boemp_id = req.getParameter("boemp_id");
if( boemp_id == null){
	System.out.println(this.toString+" : boemp_id is null" );
}else{
	System.out.println(this.toString+" : boemp_id is "+boemp_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.checkString(req.getParameter("bocd"));
String boemp_no = Util.checkString(req.getParameter("boemp_no"));
String boemp_id = Util.checkString(req.getParameter("boemp_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String boemp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("boemp_no")));
String boemp_id = Util.Uni2Ksc(Util.checkString(req.getParameter("boemp_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setBocd(bocd);
dm.setBoemp_no(boemp_no);
dm.setBoemp_id(boemp_id);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jul 21 11:48:06 KST 2017 */