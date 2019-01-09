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


public class FC_ACCT_1044_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String insd_acct_cd;
	public String use_dt;

	public FC_ACCT_1044_DDM(){}
	public FC_ACCT_1044_DDM(String cmpy_cd, String insd_acct_cd, String use_dt){
		this.cmpy_cd = cmpy_cd;
		this.insd_acct_cd = insd_acct_cd;
		this.use_dt = use_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setInsd_acct_cd(String insd_acct_cd){
		this.insd_acct_cd = insd_acct_cd;
	}

	public void setUse_dt(String use_dt){
		this.use_dt = use_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getInsd_acct_cd(){
		return this.insd_acct_cd;
	}

	public String getUse_dt(){
		return this.use_dt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_1044_D(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_1044_DDM dm = (FC_ACCT_1044_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.insd_acct_cd);
		cstmt.setString(5, dm.use_dt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_1044_DDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("insd_acct_cd = [" + getInsd_acct_cd() + "]");
		System.out.println("use_dt = [" + getUse_dt() + "]");
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
String insd_acct_cd = req.getParameter("insd_acct_cd");
if( insd_acct_cd == null){
	System.out.println(this.toString+" : insd_acct_cd is null" );
}else{
	System.out.println(this.toString+" : insd_acct_cd is "+insd_acct_cd );
}
String use_dt = req.getParameter("use_dt");
if( use_dt == null){
	System.out.println(this.toString+" : use_dt is null" );
}else{
	System.out.println(this.toString+" : use_dt is "+use_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String insd_acct_cd = Util.checkString(req.getParameter("insd_acct_cd"));
String use_dt = Util.checkString(req.getParameter("use_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String insd_acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("insd_acct_cd")));
String use_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setInsd_acct_cd(insd_acct_cd);
dm.setUse_dt(use_dt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 02 15:40:13 KST 2009 */