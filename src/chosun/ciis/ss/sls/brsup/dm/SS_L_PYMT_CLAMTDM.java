/***************************************************************************************************
* ���ϸ� : SS_L_PYMT_CLAMTDM.java
* ��� : ������������-Billing�ڵ���ü-�����ڰ���-���ݳ�����ȸ
* �ۼ����� : 2004-04-12
* �ۼ��� : ���
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
 * ������������-Billing�ڵ���ü-�����ڰ���-���ݳ�����ȸ
 *
 */


public class SS_L_PYMT_CLAMTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String rdr_no;
	public String medicd;
	public long pageno;
	public long pagesize;

	public SS_L_PYMT_CLAMTDM(){}
	public SS_L_PYMT_CLAMTDM(String rdr_no, String medicd, long pageno, long pagesize){
		this.rdr_no = rdr_no;
		this.medicd = medicd;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_PYMT_CLAMT( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_PYMT_CLAMTDM dm = (SS_L_PYMT_CLAMTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.rdr_no);
		cstmt.setString(4, dm.medicd);
		cstmt.setLong(5, dm.pageno);
		cstmt.setLong(6, dm.pagesize);
		cstmt.registerOutParameter(7, Types.INTEGER);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_PYMT_CLAMTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

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
String pageno = req.getParameter("pageno");
if( pageno == null){
	System.out.println(this.toString+" : pageno is null" );
}else{
	System.out.println(this.toString+" : pageno is "+pageno );
}
String pagesize = req.getParameter("pagesize");
if( pagesize == null){
	System.out.println(this.toString+" : pagesize is null" );
}else{
	System.out.println(this.toString+" : pagesize is "+pagesize );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String medicd = Util.checkString(req.getParameter("medicd"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setRdr_no(rdr_no);
dm.setMedicd(medicd);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Apr 12 10:43:35 KST 2004 */