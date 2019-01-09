/***************************************************************************************************
* ���ϸ� : SS_L_EDI_RECP_RJCTDM.java
* ��� : ����EDI Reject�����ȸ
* �ۼ����� : 2004-03-10
* �ۼ��� : ���
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
 * ����EDI Reject�����ȸ
 *
 */


public class SS_L_EDI_RECP_RJCTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String f_acqdt;
	public String t_acqdt;
	public String girono;

	public SS_L_EDI_RECP_RJCTDM(){}
	public SS_L_EDI_RECP_RJCTDM(String f_acqdt, String t_acqdt, String girono){
		this.f_acqdt = f_acqdt;
		this.t_acqdt = t_acqdt;
		this.girono = girono;
	}

	public void setF_acqdt(String f_acqdt){
		this.f_acqdt = f_acqdt;
	}

	public void setT_acqdt(String t_acqdt){
		this.t_acqdt = t_acqdt;
	}

	public void setGirono(String girono){
		this.girono = girono;
	}

	public String getF_acqdt(){
		return this.f_acqdt;
	}

	public String getT_acqdt(){
		return this.t_acqdt;
	}

	public String getGirono(){
		return this.girono;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_EDI_RECP_RJCT( ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_EDI_RECP_RJCTDM dm = (SS_L_EDI_RECP_RJCTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.f_acqdt);
		cstmt.setString(4, dm.t_acqdt);
		cstmt.setString(5, dm.girono);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_EDI_RECP_RJCTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String f_acqdt = req.getParameter("f_acqdt");
if( f_acqdt == null){
	System.out.println(this.toString+" : f_acqdt is null" );
}else{
	System.out.println(this.toString+" : f_acqdt is "+f_acqdt );
}
String t_acqdt = req.getParameter("t_acqdt");
if( t_acqdt == null){
	System.out.println(this.toString+" : t_acqdt is null" );
}else{
	System.out.println(this.toString+" : t_acqdt is "+t_acqdt );
}
String girono = req.getParameter("girono");
if( girono == null){
	System.out.println(this.toString+" : girono is null" );
}else{
	System.out.println(this.toString+" : girono is "+girono );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String f_acqdt = Util.checkString(req.getParameter("f_acqdt"));
String t_acqdt = Util.checkString(req.getParameter("t_acqdt"));
String girono = Util.checkString(req.getParameter("girono"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String f_acqdt = Util.Uni2Ksc(Util.checkString(req.getParameter("f_acqdt")));
String t_acqdt = Util.Uni2Ksc(Util.checkString(req.getParameter("t_acqdt")));
String girono = Util.Uni2Ksc(Util.checkString(req.getParameter("girono")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setF_acqdt(f_acqdt);
dm.setT_acqdt(t_acqdt);
dm.setGirono(girono);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Mar 10 17:04:02 KST 2004 */