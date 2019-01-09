/***************************************************************************************************
* ���ϸ� : .java
* ��� : ������-����������-��
* �ۼ����� : 2005-02-02
* �ۼ��� : �迵��
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
 * ������-����������-��
 */


public class SS_S_BOCLOSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String yymm;
	public String detail_yymm;

	public SS_S_BOCLOSDM(){}
	public SS_S_BOCLOSDM(String bocd, String yymm, String detail_yymm){
		this.bocd = bocd;
		this.yymm = yymm;
		this.detail_yymm = detail_yymm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setDetail_yymm(String detail_yymm){
		this.detail_yymm = detail_yymm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getDetail_yymm(){
		return this.detail_yymm;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_BOCLOS( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_BOCLOSDM dm = (SS_S_BOCLOSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.yymm);
		cstmt.setString(5, dm.detail_yymm);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_S_BOCLOSDataSet();
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
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String detail_yymm = req.getParameter("detail_yymm");
if( detail_yymm == null){
	System.out.println(this.toString+" : detail_yymm is null" );
}else{
	System.out.println(this.toString+" : detail_yymm is "+detail_yymm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.checkString(req.getParameter("bocd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String detail_yymm = Util.checkString(req.getParameter("detail_yymm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String detail_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("detail_yymm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setBocd(bocd);
dm.setYymm(yymm);
dm.setDetail_yymm(detail_yymm);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Feb 02 11:54:15 KST 2005 */