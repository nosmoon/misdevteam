/***************************************************************************************************
* ���ϸ� : SL_L_SUBS_CNTR_STOP_HISTDM.java
* ��� : ������������(���������˾�)(�����ȸ)
* �ۼ����� : 2004-04-01
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
 * ������������(���������˾�)(�����ȸ)
 *
 */

public class SL_L_SUBS_CNTR_STOP_HISTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String rdr_no;
	public String medicd;

	public SL_L_SUBS_CNTR_STOP_HISTDM(){}
	public SL_L_SUBS_CNTR_STOP_HISTDM(String bocd, String rdr_no, String medicd){
		this.bocd = bocd;
		this.rdr_no = rdr_no;
		this.medicd = medicd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getSQL(){
		 return "{ call SP_SL_L_SUBS_CNTR_STOP_HIST( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_L_SUBS_CNTR_STOP_HISTDM dm = (SL_L_SUBS_CNTR_STOP_HISTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.rdr_no);
		cstmt.setString(5, dm.medicd);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_L_SUBS_CNTR_STOP_HISTDataSet();
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
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
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
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String medicd = Util.checkString(req.getParameter("medicd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setBocd(bocd);
dm.setRdr_no(rdr_no);
dm.setMedicd(medicd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Apr 03 21:58:52 KST 2004 */