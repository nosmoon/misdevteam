/***************************************************************************************************
* ���ϸ� : SS_U_RDR_MOVMWORKDM.java
* ��� : �����濵-������������-���Ȯ��
* �ۼ����� : 2004-03-19
* �ۼ��� : �迵��
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
 * �����濵-������������-���Ȯ��
 *
 */


public class SS_U_RDR_MOVMWORKDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String regdt;
	public String regno;

	public SS_U_RDR_MOVMWORKDM(){}
	public SS_U_RDR_MOVMWORKDM(String incmgpers, String regdt, String regno){
		this.incmgpers = incmgpers;
		this.regdt = regdt;
		this.regno = regno;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_RDR_MOVMWORK( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_RDR_MOVMWORKDM dm = (SS_U_RDR_MOVMWORKDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.regdt);
		cstmt.setString(5, dm.regno);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_U_RDR_MOVMWORKDataSet();
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
String regdt = req.getParameter("regdt");
if( regdt == null){
	System.out.println(this.toString+" : regdt is null" );
}else{
	System.out.println(this.toString+" : regdt is "+regdt );
}
String regno = req.getParameter("regno");
if( regno == null){
	System.out.println(this.toString+" : regno is null" );
}else{
	System.out.println(this.toString+" : regno is "+regno );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String regdt = Util.checkString(req.getParameter("regdt"));
String regno = Util.checkString(req.getParameter("regno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String regdt = Util.Uni2Ksc(Util.checkString(req.getParameter("regdt")));
String regno = Util.Uni2Ksc(Util.checkString(req.getParameter("regno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setIncmgpers(incmgpers);
dm.setRegdt(regdt);
dm.setRegno(regno);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Mar 20 13:55:02 KST 2004 */