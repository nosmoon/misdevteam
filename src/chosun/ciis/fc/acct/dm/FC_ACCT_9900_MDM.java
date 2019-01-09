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


public class FC_ACCT_9900_MDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String u_id;
	public String dept_cd;
	public String page_id;

	public FC_ACCT_9900_MDM(){}
	public FC_ACCT_9900_MDM(String cmpy_cd, String u_id, String dept_cd, String page_id){
		this.cmpy_cd = cmpy_cd;
		this.u_id = u_id;
		this.dept_cd = dept_cd;
		this.page_id = page_id;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setU_id(String u_id){
		this.u_id = u_id;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setPage_id(String page_id){
		this.page_id = page_id;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getU_id(){
		return this.u_id;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getPage_id(){
		return this.page_id;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_9900_M(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_9900_MDM dm = (FC_ACCT_9900_MDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.u_id);
		cstmt.setString(5, dm.dept_cd);
		cstmt.setString(6, dm.page_id);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_9900_MDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("u_id = [" + getU_id() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("page_id = [" + getPage_id() + "]");
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
String u_id = req.getParameter("u_id");
if( u_id == null){
	System.out.println(this.toString+" : u_id is null" );
}else{
	System.out.println(this.toString+" : u_id is "+u_id );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String page_id = req.getParameter("page_id");
if( page_id == null){
	System.out.println(this.toString+" : page_id is null" );
}else{
	System.out.println(this.toString+" : page_id is "+page_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String u_id = Util.checkString(req.getParameter("u_id"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String page_id = Util.checkString(req.getParameter("page_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String u_id = Util.Uni2Ksc(Util.checkString(req.getParameter("u_id")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String page_id = Util.Uni2Ksc(Util.checkString(req.getParameter("page_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setU_id(u_id);
dm.setDept_cd(dept_cd);
dm.setPage_id(page_id);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Feb 14 14:05:33 KST 2014 */