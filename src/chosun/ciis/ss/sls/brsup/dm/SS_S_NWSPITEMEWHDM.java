/***************************************************************************************************
* ���ϸ� : SS_S_NWSPITEMEWHDM.java
* ��� : ��������-�Ź�������ǰ-�԰�-�󼼸� ���� DM
* �ۼ����� : 2004-01-20
* �ۼ��� : ��뼷
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
 * ��������-�Ź�������ǰ-�԰�-�󼼸� ���� DM
 */


public class SS_S_NWSPITEMEWHDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String ewhdt;
	public String ewhno;
	public String itemcd;

	public SS_S_NWSPITEMEWHDM(){}
	public SS_S_NWSPITEMEWHDM(String ewhdt, String ewhno, String itemcd){
		this.ewhdt = ewhdt;
		this.ewhno = ewhno;
		this.itemcd = itemcd;
	}

	public void setEwhdt(String ewhdt){
		this.ewhdt = ewhdt;
	}

	public void setEwhno(String ewhno){
		this.ewhno = ewhno;
	}

	public void setItemcd(String itemcd){
		this.itemcd = itemcd;
	}

	public String getEwhdt(){
		return this.ewhdt;
	}

	public String getEwhno(){
		return this.ewhno;
	}

	public String getItemcd(){
		return this.itemcd;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_NWSPITEMEWH( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_NWSPITEMEWHDM dm = (SS_S_NWSPITEMEWHDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.ewhdt);
		cstmt.setString(4, dm.ewhno);
		cstmt.setString(5, dm.itemcd);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.INTEGER);
		cstmt.registerOutParameter(9, Types.INTEGER);
		cstmt.registerOutParameter(10, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_S_NWSPITEMEWHDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String ewhdt = req.getParameter("ewhdt");
if( ewhdt == null){
	System.out.println(this.toString+" : ewhdt is null" );
}else{
	System.out.println(this.toString+" : ewhdt is "+ewhdt );
}
String ewhno = req.getParameter("ewhno");
if( ewhno == null){
	System.out.println(this.toString+" : ewhno is null" );
}else{
	System.out.println(this.toString+" : ewhno is "+ewhno );
}
String itemcd = req.getParameter("itemcd");
if( itemcd == null){
	System.out.println(this.toString+" : itemcd is null" );
}else{
	System.out.println(this.toString+" : itemcd is "+itemcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String ewhdt = Util.checkString(req.getParameter("ewhdt"));
String ewhno = Util.checkString(req.getParameter("ewhno"));
String itemcd = Util.checkString(req.getParameter("itemcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String ewhdt = Util.Uni2Ksc(Util.checkString(req.getParameter("ewhdt")));
String ewhno = Util.Uni2Ksc(Util.checkString(req.getParameter("ewhno")));
String itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("itemcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setEwhdt(ewhdt);
dm.setEwhno(ewhno);
dm.setItemcd(itemcd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jan 30 10:43:39 KST 2004 */