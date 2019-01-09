/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_1020_MDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String acct_type_cd;

	public FC_ACCT_1020_MDM(){}
	public FC_ACCT_1020_MDM(String cmpy_cd, String acct_type_cd){
		this.cmpy_cd = cmpy_cd;
		this.acct_type_cd = acct_type_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}
	
	public void setAcct_type_cd(String acct_type_cd){
		this.acct_type_cd = acct_type_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}
	
	public String getAcct_type_cd(){
		return this.acct_type_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_1020_M(? ,? ,? ,?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_1020_MDM dm = (FC_ACCT_1020_MDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.acct_type_cd);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_1020_MDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("acct_type_cd = [" + getAcct_type_cd() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jun 11 13:53:35 KST 2014 */