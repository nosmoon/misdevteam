/***************************************************************************************************
* ���ϸ� : SS_L_RDR_EXTN_EXGCOST_PRINTDM.java
* ��� : Ȯ����Ȳ-ǰ����Ȯ��-���-�۱� �μ⸦ ���� DM
* �ۼ����� : 2004-04-10
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/

package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * Ȯ����Ȳ-ǰ����Ȯ��-���-�۱� �μ⸦ ���� DM
 */

public class SS_L_RDR_EXTN_EXGCOST_PRINTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String areacd;
	public String bocd;
	public String basidt;

	public SS_L_RDR_EXTN_EXGCOST_PRINTDM(){}
	public SS_L_RDR_EXTN_EXGCOST_PRINTDM(String deptcd, String areacd, String bocd, String basidt){
		this.deptcd = deptcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.basidt = basidt;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_RDR_EXTN_EXGCOST_PRINT( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_RDR_EXTN_EXGCOST_PRINTDM dm = (SS_L_RDR_EXTN_EXGCOST_PRINTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.areacd);
		cstmt.setString(5, dm.bocd);
		cstmt.setString(6, dm.basidt);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, Types.INTEGER);
		cstmt.registerOutParameter(9, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_RDR_EXTN_EXGCOST_PRINTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
}
String areacd = req.getParameter("areacd");
if( areacd == null){
	System.out.println(this.toString+" : areacd is null" );
}else{
	System.out.println(this.toString+" : areacd is "+areacd );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String basidt = req.getParameter("basidt");
if( basidt == null){
	System.out.println(this.toString+" : basidt is null" );
}else{
	System.out.println(this.toString+" : basidt is "+basidt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String deptcd = Util.checkString(req.getParameter("deptcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String basidt = Util.checkString(req.getParameter("basidt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String basidt = Util.Uni2Ksc(Util.checkString(req.getParameter("basidt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setDeptcd(deptcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setBasidt(basidt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Apr 30 17:29:02 KST 2004 */