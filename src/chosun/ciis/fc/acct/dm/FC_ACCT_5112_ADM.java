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


public class FC_ACCT_5112_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fisc_dt;
	public String clos_clsf;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public FC_ACCT_5112_ADM(){}
	public FC_ACCT_5112_ADM(String cmpy_cd, String fisc_dt, String clos_clsf, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.fisc_dt = fisc_dt;
		this.clos_clsf = clos_clsf;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setClos_clsf(String clos_clsf){
		this.clos_clsf = clos_clsf;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getClos_clsf(){
		return this.clos_clsf;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_5112_A(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_5112_ADM dm = (FC_ACCT_5112_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fisc_dt);
		cstmt.setString(5, dm.clos_clsf);
		cstmt.setString(6, dm.incmg_pers);
		cstmt.setString(7, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_5112_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("fisc_dt = " + getFisc_dt());
        System.out.println("clos_clsf = " + getClos_clsf());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
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
String clos_clsf = req.getParameter("clos_clsf");
if( clos_clsf == null){
	System.out.println(this.toString+" : clos_clsf is null" );
}else{
	System.out.println(this.toString+" : clos_clsf is "+clos_clsf );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
String clos_clsf = Util.checkString(req.getParameter("clos_clsf"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_dt")));
String clos_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_clsf")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setFisc_dt(fisc_dt);
dm.setClos_clsf(clos_clsf);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Mar 12 20:08:52 KST 2009 */