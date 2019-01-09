/***************************************************************************************************
* ���ϸ� : SS_A_NWSPITEMEWHDM.java
* ��� : ��������-�Ź�������ǰ-�԰�-���,����,������ ���� DM
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
 * ��������-�Ź�������ǰ-�԰�-���,����,������ ���� DM
 */


public class SS_A_NWSPITEMEWHDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String accflag;
	public String ewhdt;
	public String ewhno;
	public String itemcd;
	public long ewhqunt;

	public SS_A_NWSPITEMEWHDM(){}
	public SS_A_NWSPITEMEWHDM(String incmgpers, String accflag, String ewhdt, String ewhno, String itemcd, long ewhqunt){
		this.incmgpers = incmgpers;
		this.accflag = accflag;
		this.ewhdt = ewhdt;
		this.ewhno = ewhno;
		this.itemcd = itemcd;
		this.ewhqunt = ewhqunt;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
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

	public void setEwhqunt(long ewhqunt){
		this.ewhqunt = ewhqunt;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAccflag(){
		return this.accflag;
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

	public long getEwhqunt(){
		return this.ewhqunt;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_NWSPITEMEWH( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_NWSPITEMEWHDM dm = (SS_A_NWSPITEMEWHDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.ewhdt);
		cstmt.setString(6, dm.ewhno);
		cstmt.setString(7, dm.itemcd);
		cstmt.setLong(8, dm.ewhqunt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_A_NWSPITEMEWHDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
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
String ewhqunt = req.getParameter("ewhqunt");
if( ewhqunt == null){
	System.out.println(this.toString+" : ewhqunt is null" );
}else{
	System.out.println(this.toString+" : ewhqunt is "+ewhqunt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String accflag = Util.checkString(req.getParameter("accflag"));
String ewhdt = Util.checkString(req.getParameter("ewhdt"));
String ewhno = Util.checkString(req.getParameter("ewhno"));
String itemcd = Util.checkString(req.getParameter("itemcd"));
String ewhqunt = Util.checkString(req.getParameter("ewhqunt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String ewhdt = Util.Uni2Ksc(Util.checkString(req.getParameter("ewhdt")));
String ewhno = Util.Uni2Ksc(Util.checkString(req.getParameter("ewhno")));
String itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("itemcd")));
String ewhqunt = Util.Uni2Ksc(Util.checkString(req.getParameter("ewhqunt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setIncmgpers(incmgpers);
dm.setAccflag(accflag);
dm.setEwhdt(ewhdt);
dm.setEwhno(ewhno);
dm.setItemcd(itemcd);
dm.setEwhqunt(ewhqunt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jan 30 10:43:39 KST 2004 */