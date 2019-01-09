/***************************************************************************************************
* ���ϸ� : SS_L_WRKDTLDM.java
* ��� : ������-�۾�-�۾��̷�-���(����) �� ���� DM
* �ۼ����� : 2004-04-10
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
 * ������-�۾�-�۾��̷�-���(����) �� ���� DM
 */

public class SS_L_WRKDTLDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String id;
	public String execno;
	public long pageno;
	public long pagesize;

	public SS_L_WRKDTLDM(){}
	public SS_L_WRKDTLDM(String id, String execno, long pageno, long pagesize){
		this.id = id;
		this.execno = execno;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setId(String id){
		this.id = id;
	}

	public void setExecno(String execno){
		this.execno = execno;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getId(){
		return this.id;
	}

	public String getExecno(){
		return this.execno;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_WRKDTL( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_WRKDTLDM dm = (SS_L_WRKDTLDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.id);
		cstmt.setString(4, dm.execno);
		cstmt.setLong(5, dm.pageno);
		cstmt.setLong(6, dm.pagesize);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_L_WRKDTLDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String id = req.getParameter("id");
if( id == null){
	System.out.println(this.toString+" : id is null" );
}else{
	System.out.println(this.toString+" : id is "+id );
}
String execno = req.getParameter("execno");
if( execno == null){
	System.out.println(this.toString+" : execno is null" );
}else{
	System.out.println(this.toString+" : execno is "+execno );
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

String id = Util.checkString(req.getParameter("id"));
String execno = Util.checkString(req.getParameter("execno"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String id = Util.Uni2Ksc(Util.checkString(req.getParameter("id")));
String execno = Util.Uni2Ksc(Util.checkString(req.getParameter("execno")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setId(id);
dm.setExecno(execno);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Apr 12 11:46:05 KST 2004 */