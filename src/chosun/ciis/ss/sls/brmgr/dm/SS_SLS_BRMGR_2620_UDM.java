/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ������
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
 * 
 */


public class SS_SLS_BRMGR_2620_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String acct_cd;
	public String mode;

	public SS_SLS_BRMGR_2620_UDM(){}
	public SS_SLS_BRMGR_2620_UDM(String acct_cd, String mode){
		this.acct_cd = acct_cd;
		this.mode = mode;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_BRMGR_2620_U(? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_BRMGR_2620_UDM dm = (SS_SLS_BRMGR_2620_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.acct_cd);
		cstmt.setString(4, dm.mode);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_SLS_BRMGR_2620_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("acct_cd = [" + getAcct_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String acct_cd = req.getParameter("acct_cd");
if( acct_cd == null){
	System.out.println(this.toString+" : acct_cd is null" );
}else{
	System.out.println(this.toString+" : acct_cd is "+acct_cd );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String acct_cd = Util.checkString(req.getParameter("acct_cd"));
String mode = Util.checkString(req.getParameter("mode"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setAcct_cd(acct_cd);
dm.setMode(mode);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Mar 10 19:08:12 KST 2016 */