/***************************************************************************************************
* ���ϸ� : SS_L_VSCDDM.java
* ��� : ����-VacationStop-�ڵ�-����� ���� DM
* �ۼ����� : 2004-03-20
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/

package chosun.ciis.ss.sls.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * ����-VacationStop-�ڵ�-����� ���� DM
 */

public class SS_L_VSCDDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String vaca_arearegncd;
	public long pageno;
	public long pagesize;

	public SS_L_VSCDDM(){}
	public SS_L_VSCDDM(String vaca_arearegncd, long pageno, long pagesize){
		this.vaca_arearegncd = vaca_arearegncd;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setVaca_arearegncd(String vaca_arearegncd){
		this.vaca_arearegncd = vaca_arearegncd;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getVaca_arearegncd(){
		return this.vaca_arearegncd;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_VSCD( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_VSCDDM dm = (SS_L_VSCDDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.vaca_arearegncd);
		cstmt.setLong(4, dm.pageno);
		cstmt.setLong(5, dm.pagesize);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
		cstmt.registerOutParameter(7, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.rdr.ds.SS_L_VSCDDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String vaca_arearegncd = req.getParameter("vaca_arearegncd");
if( vaca_arearegncd == null){
	System.out.println(this.toString+" : vaca_arearegncd is null" );
}else{
	System.out.println(this.toString+" : vaca_arearegncd is "+vaca_arearegncd );
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

String vaca_arearegncd = Util.checkString(req.getParameter("vaca_arearegncd"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String vaca_arearegncd = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_arearegncd")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setVaca_arearegncd(vaca_arearegncd);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Mar 29 17:03:07 KST 2004 */