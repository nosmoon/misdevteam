/***************************************************************************************************
* ���ϸ� : .java
* ��� : 	   
* �ۼ����� : 
* �ۼ��� : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.tn.lnk.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.ds.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_6097_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String sdsiidx;
	public String jobclsf;
	public String incmg_pers_addr;
	public String incmg_pers;

	public TN_LNK_6097_ADM(){}
	public TN_LNK_6097_ADM(String cmpy_cd, String sdsiidx, String jobclsf, String incmg_pers_addr, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.sdsiidx = sdsiidx;
		this.jobclsf = jobclsf;
		this.incmg_pers_addr = incmg_pers_addr;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSdsiidx(String sdsiidx){
		this.sdsiidx = sdsiidx;
	}

	public void setJobclsf(String jobclsf){
		this.jobclsf = jobclsf;
	}

	public void setIncmg_pers_addr(String incmg_pers_addr){
		this.incmg_pers_addr = incmg_pers_addr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSdsiidx(){
		return this.sdsiidx;
	}

	public String getJobclsf(){
		return this.jobclsf;
	}

	public String getIncmg_pers_addr(){
		return this.incmg_pers_addr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_LNK_6097_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_LNK_6097_ADM dm = (TN_LNK_6097_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.sdsiidx);
		cstmt.setString(5, dm.jobclsf);
		cstmt.setString(6, dm.incmg_pers_addr);
		cstmt.setString(7, dm.incmg_pers);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.lnk.ds.TN_LNK_6097_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("sdsiidx = [" + getSdsiidx() + "]");
		System.out.println("jobclsf = [" + getJobclsf() + "]");
		System.out.println("incmg_pers_addr = [" + getIncmg_pers_addr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String sdsiidx = req.getParameter("sdsiidx");
if( sdsiidx == null){
	System.out.println(this.toString+" : sdsiidx is null" );
}else{
	System.out.println(this.toString+" : sdsiidx is "+sdsiidx );
}
String jobclsf = req.getParameter("jobclsf");
if( jobclsf == null){
	System.out.println(this.toString+" : jobclsf is null" );
}else{
	System.out.println(this.toString+" : jobclsf is "+jobclsf );
}
String incmg_pers_addr = req.getParameter("incmg_pers_addr");
if( incmg_pers_addr == null){
	System.out.println(this.toString+" : incmg_pers_addr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_addr is "+incmg_pers_addr );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String sdsiidx = Util.checkString(req.getParameter("sdsiidx"));
String jobclsf = Util.checkString(req.getParameter("jobclsf"));
String incmg_pers_addr = Util.checkString(req.getParameter("incmg_pers_addr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String sdsiidx = Util.Uni2Ksc(Util.checkString(req.getParameter("sdsiidx")));
String jobclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("jobclsf")));
String incmg_pers_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_addr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setSdsiidx(sdsiidx);
dm.setJobclsf(jobclsf);
dm.setIncmg_pers_addr(incmg_pers_addr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Dec 23 10:39:52 KST 2016 */