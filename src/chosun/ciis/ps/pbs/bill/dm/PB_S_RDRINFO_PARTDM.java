/***************************************************************************************************
 * ���ϸ�   : PB_S_RDRINFO_PARTDM.java
 * ���     : ����-�ʰ��Ա�ó�� ���������� �Ϻκ� ã��
 * �ۼ����� : 2004-03-31
 * �ۼ���   : ����
 **************************************************************************************************/
 /**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 **************************************************************************************************/


package chosun.ciis.ps.pbs.bill.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.bill.ds.*;
import chosun.ciis.ps.pbs.bill.rec.*;

/**
 * ����-�ʰ��Ա�ó�� ���������� �Ϻκ� ã��
 */

public class PB_S_RDRINFO_PARTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String rdr_no;
	public String medicd;
	public String termsubsno;

	public PB_S_RDRINFO_PARTDM(){}
	public PB_S_RDRINFO_PARTDM(String bocd, String rdr_no, String medicd, String termsubsno){
		this.bocd = bocd;
		this.rdr_no = rdr_no;
		this.medicd = medicd;
		this.termsubsno = termsubsno;
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

	public void setTermsubsno(String termsubsno){
		this.termsubsno = termsubsno;
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

	public String getTermsubsno(){
		return this.termsubsno;
	}

	public String getSQL(){
		 return "{ call SP_PB_S_RDRINFO_PART( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PB_S_RDRINFO_PARTDM dm = (PB_S_RDRINFO_PARTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.rdr_no);
		cstmt.setString(5, dm.medicd);
		cstmt.setString(6, dm.termsubsno);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.bill.ds.PB_S_RDRINFO_PARTDataSet();
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
String termsubsno = req.getParameter("termsubsno");
if( termsubsno == null){
	System.out.println(this.toString+" : termsubsno is null" );
}else{
	System.out.println(this.toString+" : termsubsno is "+termsubsno );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.checkString(req.getParameter("bocd"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String medicd = Util.checkString(req.getParameter("medicd"));
String termsubsno = Util.checkString(req.getParameter("termsubsno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String termsubsno = Util.Uni2Ksc(Util.checkString(req.getParameter("termsubsno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setBocd(bocd);
dm.setRdr_no(rdr_no);
dm.setMedicd(medicd);
dm.setTermsubsno(termsubsno);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Mar 31 19:08:53 KST 2004 */