/***************************************************************************************************
* ���ϸ� : SS_L_EDI_RCPM_CATLDM.java
* ��� : ����EDI �Ա�ó����� �����ȸ
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
 * ����EDI �Ա�ó����� �����ȸ
 *
 */


public class SS_L_EDI_RCPM_CATLDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String acqdt;
	public String girono;

	public SS_L_EDI_RCPM_CATLDM(){}
	public SS_L_EDI_RCPM_CATLDM(String acqdt, String girono){
		this.acqdt = acqdt;
		this.girono = girono;
	}

	public void setAcqdt(String acqdt){
		this.acqdt = acqdt;
	}

	public void setGirono(String girono){
		this.girono = girono;
	}

	public String getAcqdt(){
		return this.acqdt;
	}

	public String getGirono(){
		return this.girono;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_EDI_RCPM_CATL( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_EDI_RCPM_CATLDM dm = (SS_L_EDI_RCPM_CATLDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.acqdt);
		cstmt.setString(4, dm.girono);
		cstmt.registerOutParameter(5, Types.INTEGER);
		cstmt.registerOutParameter(6, Types.INTEGER);
		cstmt.registerOutParameter(7, Types.INTEGER);
		cstmt.registerOutParameter(8, Types.INTEGER);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_EDI_RCPM_CATLDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String acqdt = req.getParameter("acqdt");
if( acqdt == null){
	System.out.println(this.toString+" : acqdt is null" );
}else{
	System.out.println(this.toString+" : acqdt is "+acqdt );
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

String acqdt = Util.checkString(req.getParameter("acqdt"));
String girono = Util.checkString(req.getParameter("girono"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String acqdt = Util.Uni2Ksc(Util.checkString(req.getParameter("acqdt")));
String girono = Util.Uni2Ksc(Util.checkString(req.getParameter("girono")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setAcqdt(acqdt);
dm.setGirono(girono);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Mar 10 15:47:12 KST 2004 */