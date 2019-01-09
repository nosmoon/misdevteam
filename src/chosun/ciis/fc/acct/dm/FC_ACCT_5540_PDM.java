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


public class FC_ACCT_5540_PDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fisc_yyyy;

	public FC_ACCT_5540_PDM(){}
	public FC_ACCT_5540_PDM(String cmpy_cd, String fisc_yyyy){
		this.cmpy_cd = cmpy_cd;
		this.fisc_yyyy = fisc_yyyy;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFisc_yyyy(String fisc_yyyy){
		this.fisc_yyyy = fisc_yyyy;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFisc_yyyy(){
		return this.fisc_yyyy;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_5540_P(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_5540_PDM dm = (FC_ACCT_5540_PDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fisc_yyyy);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_5540_PDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fisc_yyyy = [" + getFisc_yyyy() + "]");
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
String fisc_yyyy = req.getParameter("fisc_yyyy");
if( fisc_yyyy == null){
	System.out.println(this.toString+" : fisc_yyyy is null" );
}else{
	System.out.println(this.toString+" : fisc_yyyy is "+fisc_yyyy );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fisc_yyyy = Util.checkString(req.getParameter("fisc_yyyy"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fisc_yyyy = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_yyyy")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setFisc_yyyy(fisc_yyyy);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Aug 10 16:00:46 KST 2009 */