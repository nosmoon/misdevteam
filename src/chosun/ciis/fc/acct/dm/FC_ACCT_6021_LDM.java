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


public class FC_ACCT_6021_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String proc_yymm;
	public String budg_cd;
	public String medi_cd;

	public FC_ACCT_6021_LDM(){}
	public FC_ACCT_6021_LDM(String cmpy_cd, String proc_yymm, String budg_cd, String medi_cd){
		this.cmpy_cd = cmpy_cd;
		this.proc_yymm = proc_yymm;
		this.budg_cd = budg_cd;
		this.medi_cd = medi_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setProc_yymm(String proc_yymm){
		this.proc_yymm = proc_yymm;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getProc_yymm(){
		return this.proc_yymm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_6021_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_6021_LDM dm = (FC_ACCT_6021_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.proc_yymm);
		cstmt.setString(5, dm.budg_cd);
		cstmt.setString(6, dm.medi_cd);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_6021_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("proc_yymm = " + getProc_yymm());
        System.out.println("budg_cd = " + getBudg_cd());
        System.out.println("medi_cd = " + getMedi_cd());
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
String proc_yymm = req.getParameter("proc_yymm");
if( proc_yymm == null){
	System.out.println(this.toString+" : proc_yymm is null" );
}else{
	System.out.println(this.toString+" : proc_yymm is "+proc_yymm );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String proc_yymm = Util.checkString(req.getParameter("proc_yymm"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String proc_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_yymm")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setProc_yymm(proc_yymm);
dm.setBudg_cd(budg_cd);
dm.setMedi_cd(medi_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Mar 06 09:44:30 KST 2009 */