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


package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 
 */


public class SS_SLS_BRMGR_3020_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String issu_dt;
	public String accflag;
	public String medi_cd;
	public String incmgpers;

	public SS_SLS_BRMGR_3020_IDM(){}
	public SS_SLS_BRMGR_3020_IDM(String issu_dt, String accflag, String medi_cd, String incmgpers){
		this.issu_dt = issu_dt;
		this.accflag = accflag;
		this.medi_cd = medi_cd;
		this.incmgpers = incmgpers;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_BRMGR_3020_I(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_BRMGR_3020_IDM dm = (SS_SLS_BRMGR_3020_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.issu_dt);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.medi_cd);
		cstmt.setString(6, dm.incmgpers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_SLS_BRMGR_3020_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("issu_dt = [" + getIssu_dt() + "]");
		System.out.println("accflag = [" + getAccflag() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String accflag = Util.checkString(req.getParameter("accflag"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setIssu_dt(issu_dt);
dm.setAccflag(accflag);
dm.setMedi_cd(medi_cd);
dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Feb 24 15:03:22 KST 2017 */