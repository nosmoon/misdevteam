/***************************************************************************************************
* ���ϸ� : PS_L_DAY_SCHEDM.java
* ��� : ���Ǳ� ����-�޷�(�Ϻ�)
* �ۼ����� : 2004-03-09
* �ۼ��� : ����ǥ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.share.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.share.ds.*;
import chosun.ciis.ps.pbs.share.rec.*;

/**
 * ���Ǳ� ����-�޷�(�Ϻ�)
 *
 */


public class PS_L_DAY_SCHEDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String incmgpers;
	public String yyyymmdd;

	public PS_L_DAY_SCHEDM(){}
	public PS_L_DAY_SCHEDM(String deptcd, String incmgpers, String yyyymmdd){
		this.deptcd = deptcd;
		this.incmgpers = incmgpers;
		this.yyyymmdd = yyyymmdd;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setYyyymmdd(String yyyymmdd){
		this.yyyymmdd = yyyymmdd;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getYyyymmdd(){
		return this.yyyymmdd;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_DAY_SCHE( ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_DAY_SCHEDM dm = (PS_L_DAY_SCHEDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.yyyymmdd);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.share.ds.PS_L_DAY_SCHEDataSet();
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
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String yyyymmdd = req.getParameter("yyyymmdd");
if( yyyymmdd == null){
	System.out.println(this.toString+" : yyyymmdd is null" );
}else{
	System.out.println(this.toString+" : yyyymmdd is "+yyyymmdd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String deptcd = Util.checkString(req.getParameter("deptcd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String yyyymmdd = Util.checkString(req.getParameter("yyyymmdd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String yyyymmdd = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyymmdd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setDeptcd(deptcd);
dm.setIncmgpers(incmgpers);
dm.setYyyymmdd(yyyymmdd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Mar 09 21:43:44 KST 2004 */