/***************************************************************************************************
* ���ϸ� : SL_L_DTLSADDRDM.java
* ��� :  �ش������Ǿ���Ʈ �ּ��ڵ忡 ���� �� ����Ʈ ����_����Ͽ�
* �ۼ����� : 2017-01-13
* �ۼ��� : �� �� ��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 *
 */

public class SL_L_DTLSADDRDM extends somo.framework.db.BaseDM implements
		java.io.Serializable {

	public String bocd;
	public String addrcd;
	public long pageno;
	public long pagesize;

	public SL_L_DTLSADDRDM() {
	}

	public SL_L_DTLSADDRDM(String bocd, String addrcd, long pageno,
			long pagesize) {
		this.bocd = bocd;
		this.addrcd = addrcd;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setBocd(String bocd) {
		this.bocd = bocd;
	}

	public void setAddrcd(String addrcd) {
		this.addrcd = addrcd;
	}

	public void setPageno(long pageno) {
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize) {
		this.pagesize = pagesize;
	}

	public String getBocd() {
		return this.bocd;
	}

	public String getAddrcd() {
		return this.addrcd;
	}

	public long getPageno() {
		return this.pageno;
	}

	public long getPagesize() {
		return this.pagesize;
	}

	public String getSQL() {
		return "{ call SP_SL_L_DTLSADDR( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm)
			throws SQLException {
		SL_L_DTLSADDRDM dm = (SL_L_DTLSADDRDM) bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.addrcd);
		cstmt.setLong(5, dm.pageno);
		cstmt.setLong(6, dm.pagesize);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.INTEGER);
		cstmt.registerOutParameter(16, OracleTypes.CURSOR);
		cstmt.registerOutParameter(17, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject() {
		return new chosun.ciis.ss.sls.brmgr.ds.SL_L_DTLSADDRDataSet();
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

 String bocd = Util.checkString(req.getParameter("bocd"));
 String addrcd = Util.checkString(req.getParameter("addrcd"));
 String pageno = Util.checkString(req.getParameter("pageno"));
 String pagesize = Util.checkString(req.getParameter("pagesize"));
 ----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String addrcd = Util.Uni2Ksc(Util.checkString(req.getParameter("addrcd")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
 Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

 dm.setBocd(bocd);
 dm.setAddrcd(addrcd);
 dm.setPageno(pageno);
 dm.setPagesize(pagesize);
 ----------------------------------------------------------------------------------------------------*/

/* �ۼ��ð� : Mon May 15 10:55:42 KST 2006 */