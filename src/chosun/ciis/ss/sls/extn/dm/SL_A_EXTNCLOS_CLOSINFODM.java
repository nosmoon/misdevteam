/***************************************************************************************************
* ���ϸ� : .java
* ��� : �Ǹ� Ȯ�����˺ν� ���˸������� ��ȸ
* �ۼ����� : 2012-01-12
* �ۼ��� : ����
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


public class SL_A_EXTNCLOS_CLOSINFODM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String closmm;

	public SL_A_EXTNCLOS_CLOSINFODM(){}
	public SL_A_EXTNCLOS_CLOSINFODM(String closmm){
		this.closmm = closmm;
	}

	public void setClosmm(String closmm){
		this.closmm = closmm;
	}

	public String getClosmm(){
		return this.closmm;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SL_A_EXTNCLOS_CLOSINFO(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_A_EXTNCLOS_CLOSINFODM dm = (SL_A_EXTNCLOS_CLOSINFODM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.closmm);
		cstmt.registerOutParameter(4, Types.VARCHAR);
		cstmt.registerOutParameter(5, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SL_A_EXTNCLOS_CLOSINFODataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("closmm = [" + getClosmm() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String closmm = req.getParameter("closmm");
if( closmm == null){
	System.out.println(this.toString+" : closmm is null" );
}else{
	System.out.println(this.toString+" : closmm is "+closmm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String closmm = Util.checkString(req.getParameter("closmm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String closmm = Util.Uni2Ksc(Util.checkString(req.getParameter("closmm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setClosmm(closmm);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jan 12 16:41:20 KST 2012 */