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


package chosun.ciis.mc.budg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.ds.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_6048_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String bugd_yymm;

	public MC_BUDG_6048_DDM(){}
	public MC_BUDG_6048_DDM(String cmpy_cd, String bugd_yymm){
		this.cmpy_cd = cmpy_cd;
		this.bugd_yymm = bugd_yymm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBugd_yymm(String bugd_yymm){
		this.bugd_yymm = bugd_yymm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBugd_yymm(){
		return this.bugd_yymm;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_6048_D(? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_6048_DDM dm = (MC_BUDG_6048_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.bugd_yymm);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_6048_DDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("bugd_yymm = [" + getBugd_yymm() + "]");
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
String bugd_yymm = req.getParameter("bugd_yymm");
if( bugd_yymm == null){
	System.out.println(this.toString+" : bugd_yymm is null" );
}else{
	System.out.println(this.toString+" : bugd_yymm is "+bugd_yymm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String bugd_yymm = Util.checkString(req.getParameter("bugd_yymm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String bugd_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("bugd_yymm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setBugd_yymm(bugd_yymm);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri May 15 17:30:54 KST 2009 */