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


package chosun.ciis.as.com.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.com.ds.*;
import chosun.ciis.as.com.rec.*;

/**
 * 
 */


public class AS_COM_1300_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String srch_dept_cd;

	public AS_COM_1300_LDM(){}
	public AS_COM_1300_LDM(String cmpy_cd, String srch_dept_cd){
		this.cmpy_cd = cmpy_cd;
		this.srch_dept_cd = srch_dept_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSrch_dept_cd(String srch_dept_cd){
		this.srch_dept_cd = srch_dept_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSrch_dept_cd(){
		return this.srch_dept_cd;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_COM_1300_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_COM_1300_LDM dm = (AS_COM_1300_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.srch_dept_cd);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.com.ds.AS_COM_1300_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("srch_dept_cd = " + getSrch_dept_cd());
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
String srch_dept_cd = req.getParameter("srch_dept_cd");
if( srch_dept_cd == null){
	System.out.println(this.toString+" : srch_dept_cd is null" );
}else{
	System.out.println(this.toString+" : srch_dept_cd is "+srch_dept_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String srch_dept_cd = Util.checkString(req.getParameter("srch_dept_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String srch_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_dept_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setSrch_dept_cd(srch_dept_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Mar 02 10:46:15 KST 2009 */