/***************************************************************************************************
* ���ϸ� : .java
* ��� : Ȯ����Ȳ-����Ȯ��- ��������� ��������
* �ۼ����� : 2009-06-09
* �ۼ��� : ������
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * Ȯ����Ȳ-����Ȯ��- ��������� ��������  
 */

public class SS_L_EXTN_HDQT_ALERTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String emp_no;
	public String valmm;

	public SS_L_EXTN_HDQT_ALERTDM(){}
	public SS_L_EXTN_HDQT_ALERTDM(String emp_no, String valmm){
		this.emp_no = emp_no;
		this.valmm = valmm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getValmm(){
		return this.valmm;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_EXTN_HDQT_ALERT( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_EXTN_HDQT_ALERTDM dm = (SS_L_EXTN_HDQT_ALERTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.emp_no);
		cstmt.setString(4, dm.valmm);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_EXTN_HDQT_ALERTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String valmm = req.getParameter("valmm");
if( valmm == null){
	System.out.println(this.toString+" : valmm is null" );
}else{
	System.out.println(this.toString+" : valmm is "+valmm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String emp_no = Util.checkString(req.getParameter("emp_no"));
String valmm = Util.checkString(req.getParameter("valmm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String valmm = Util.Uni2Ksc(Util.checkString(req.getParameter("valmm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setEmp_no(emp_no);
dm.setValmm(valmm);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jun 12 11:56:45 KST 2009 */