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


public class FC_ACCT_2541_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fisc_dt;
	public String mang_clsf_cd;

	public FC_ACCT_2541_LDM(){}
	public FC_ACCT_2541_LDM(String cmpy_cd, String fisc_dt, String mang_clsf_cd){
		this.cmpy_cd = cmpy_cd;
		this.fisc_dt = fisc_dt;
		this.mang_clsf_cd = mang_clsf_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setMang_clsf_cd(String mang_clsf_cd){
		this.mang_clsf_cd = mang_clsf_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getMang_clsf_cd(){
		return this.mang_clsf_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2541_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2541_LDM dm = (FC_ACCT_2541_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fisc_dt);
		cstmt.setString(5, dm.mang_clsf_cd);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2541_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fisc_dt = [" + getFisc_dt() + "]");
		System.out.println("mang_clsf_cd = [" + getMang_clsf_cd() + "]");
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
String fisc_dt = req.getParameter("fisc_dt");
if( fisc_dt == null){
	System.out.println(this.toString+" : fisc_dt is null" );
}else{
	System.out.println(this.toString+" : fisc_dt is "+fisc_dt );
}
String mang_clsf_cd = req.getParameter("mang_clsf_cd");
if( mang_clsf_cd == null){
	System.out.println(this.toString+" : mang_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : mang_clsf_cd is "+mang_clsf_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
String mang_clsf_cd = Util.checkString(req.getParameter("mang_clsf_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_dt")));
String mang_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_clsf_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setFisc_dt(fisc_dt);
dm.setMang_clsf_cd(mang_clsf_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Apr 28 13:57:03 KST 2009 */