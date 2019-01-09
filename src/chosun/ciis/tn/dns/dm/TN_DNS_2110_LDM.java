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


package chosun.ciis.tn.dns.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.dns.ds.*;
import chosun.ciis.tn.dns.rec.*;

/**
 * 
 */


public class TN_DNS_2110_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	
	public TN_DNS_2110_LDM(){}
	public TN_DNS_2110_LDM(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}
	
	public String getSQL(){
		 return "{ call MISTNN.SP_TN_DNS_2110_L(? ,? ,? ,?) }";
	}
	
	public void setCmpy_cd(String cmpy_cd) {
		this.cmpy_cd = cmpy_cd;
	}

	public String getCmpy_cd() {
		return cmpy_cd;
	}
	
	
	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_DNS_2110_LDM dm = (TN_DNS_2110_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.dns.ds.TN_DNS_2110_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jun 15 18:49:00 KST 2016 */