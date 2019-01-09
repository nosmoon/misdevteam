/***************************************************************************************************
* ���ϸ� : SS_L_MIGRWORKPTCRDM.java
* ��� : ������-�۾�-���̱׷��̼�-���(����)�� ���� DM
* �ۼ����� : 2004-03-12
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
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
 * ������-�۾�-���̱׷��̼�-���(����)�� ���� DM
 */

public class SS_L_MIGRWORKPTCRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String workclsf;
	public String workno;
	public long pageno;
	public long pagesize;

	public SS_L_MIGRWORKPTCRDM(){}
	public SS_L_MIGRWORKPTCRDM(String bocd, String workclsf, String workno, long pageno, long pagesize){
		this.bocd = bocd;
		this.workclsf = workclsf;
		this.workno = workno;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setWorkclsf(String workclsf){
		this.workclsf = workclsf;
	}

	public void setWorkno(String workno){
		this.workno = workno;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getWorkclsf(){
		return this.workclsf;
	}

	public String getWorkno(){
		return this.workno;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_MIGRWORKPTCR( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_MIGRWORKPTCRDM dm = (SS_L_MIGRWORKPTCRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.workclsf);
		cstmt.setString(5, dm.workno);
		cstmt.setLong(6, dm.pageno);
		cstmt.setLong(7, dm.pagesize);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_L_MIGRWORKPTCRDataSet();
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
String workclsf = req.getParameter("workclsf");
if( workclsf == null){
	System.out.println(this.toString+" : workclsf is null" );
}else{
	System.out.println(this.toString+" : workclsf is "+workclsf );
}
String workno = req.getParameter("workno");
if( workno == null){
	System.out.println(this.toString+" : workno is null" );
}else{
	System.out.println(this.toString+" : workno is "+workno );
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
String workclsf = Util.checkString(req.getParameter("workclsf"));
String workno = Util.checkString(req.getParameter("workno"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String workclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("workclsf")));
String workno = Util.Uni2Ksc(Util.checkString(req.getParameter("workno")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setBocd(bocd);
dm.setWorkclsf(workclsf);
dm.setWorkno(workno);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Mar 15 13:15:14 KST 2004 */