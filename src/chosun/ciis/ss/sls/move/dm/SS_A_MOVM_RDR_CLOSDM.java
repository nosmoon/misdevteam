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


package chosun.ciis.ss.sls.move.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.move.ds.*;
import chosun.ciis.ss.sls.move.rec.*;

/**
 * 
 */


public class SS_A_MOVM_RDR_CLOSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String yyyymm;
	public String flag;

	public SS_A_MOVM_RDR_CLOSDM(){}
	public SS_A_MOVM_RDR_CLOSDM(String incmgpers, String yyyymm, String flag){
		this.incmgpers = incmgpers;
		this.yyyymm = yyyymm;
		this.flag = flag;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setYyyymm(String yyyymm){
		this.yyyymm = yyyymm;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getYyyymm(){
		return this.yyyymm;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_A_MOVM_RDR_CLOS(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_MOVM_RDR_CLOSDM dm = (SS_A_MOVM_RDR_CLOSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.yyyymm);
		cstmt.setString(5, dm.flag);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.move.ds.SS_A_MOVM_RDR_CLOSDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
		System.out.println("yyyymm = [" + getYyyymm() + "]");
		System.out.println("flag = [" + getFlag() + "]");
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
String yyyymm = req.getParameter("yyyymm");
if( yyyymm == null){
	System.out.println(this.toString+" : yyyymm is null" );
}else{
	System.out.println(this.toString+" : yyyymm is "+yyyymm );
}
String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String yyyymm = Util.checkString(req.getParameter("yyyymm"));
String flag = Util.checkString(req.getParameter("flag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String yyyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyymm")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setIncmgpers(incmgpers);
dm.setYyyymm(yyyymm);
dm.setFlag(flag);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jun 05 04:47:17 GMT 2014 */