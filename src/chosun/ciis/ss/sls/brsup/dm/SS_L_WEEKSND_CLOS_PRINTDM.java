/***************************************************************************************************
 * ���ϸ�   : SP_SS_L_WEEKSND_CLOS_PRINT
 * ���     : ��������-�ְ���������-�۱ݸ�� �������� 
 * �ۼ����� : 2007/05/14
 * �ۼ���   : ����
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
**  SP_SS_L_WEEKSND_CLOS_PRINT
**/

public class SS_L_WEEKSND_CLOS_PRINTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String closyymm;

	public SS_L_WEEKSND_CLOS_PRINTDM(){}
	public SS_L_WEEKSND_CLOS_PRINTDM(String closyymm){
		this.closyymm = closyymm;
	}

	public void setClosyymm(String closyymm){
		this.closyymm = closyymm;
	}

	public String getClosyymm(){
		return this.closyymm;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_WEEKSND_CLOS_PRINT( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_WEEKSND_CLOS_PRINTDM dm = (SS_L_WEEKSND_CLOS_PRINTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.closyymm);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_WEEKSND_CLOS_PRINTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String closyymm = req.getParameter("closyymm");
if( closyymm == null){
	System.out.println(this.toString+" : closyymm is null" );
}else{
	System.out.println(this.toString+" : closyymm is "+closyymm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String closyymm = Util.checkString(req.getParameter("closyymm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String closyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("closyymm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setClosyymm(closyymm);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed May 16 11:16:39 KST 2007 */