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


package chosun.ciis.pr.sendmg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.sendmg.ds.*;
import chosun.ciis.pr.sendmg.rec.*;

/**
 * 
 */


public class PR_SENDMG_1039_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd	= "";
	public String pr_dt		= "";

	public PR_SENDMG_1039_LDM(){}
	public PR_SENDMG_1039_LDM(String pr_dt){
		this.pr_dt = pr_dt;
	}

	public void setPr_dt(String pr_dt){
		this.pr_dt = pr_dt;
	}
	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public String getPr_dt(){
		return this.pr_dt;
	}
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}
	
	public String getSQL(){
		 return "";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_SENDMG_1039_LDM dm = (PR_SENDMG_1039_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.pr_dt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.sendmg.ds.PR_SENDMG_1039_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("pr_dt = [" + getPr_dt() + "]");
	}
	
	
	
	
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String send_dt = req.getParameter("send_dt");
if( send_dt == null){
	System.out.println(this.toString+" : send_dt is null" );
}else{
	System.out.println(this.toString+" : send_dt is "+send_dt );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String send_dt = Util.checkString(req.getParameter("send_dt"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String send_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("send_dt")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setSend_dt(send_dt);
dm.setCmpy_cd(cmpy_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Apr 29 16:42:00 KST 2009 */