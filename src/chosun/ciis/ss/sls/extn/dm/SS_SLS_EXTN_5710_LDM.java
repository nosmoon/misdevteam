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


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_SLS_EXTN_5710_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String subscrpt_cd;

	public SS_SLS_EXTN_5710_LDM(){}
	public SS_SLS_EXTN_5710_LDM(String subscrpt_cd){
		this.subscrpt_cd = subscrpt_cd;
	}

	public void setSubscrpt_cd(String subscrpt_cd){
		this.subscrpt_cd = subscrpt_cd;
	}

	public String getSubscrpt_cd(){
		return this.subscrpt_cd;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_EXTN_5710_L(? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_EXTN_5710_LDM dm = (SS_SLS_EXTN_5710_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.subscrpt_cd);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_SLS_EXTN_5710_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("subscrpt_cd = [" + getSubscrpt_cd() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String subscrpt_cd = req.getParameter("subscrpt_cd");
if( subscrpt_cd == null){
	System.out.println(this.toString+" : subscrpt_cd is null" );
}else{
	System.out.println(this.toString+" : subscrpt_cd is "+subscrpt_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String subscrpt_cd = Util.checkString(req.getParameter("subscrpt_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String subscrpt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("subscrpt_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setSubscrpt_cd(subscrpt_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jan 10 11:07:43 KST 2018 */