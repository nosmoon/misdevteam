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


public class FC_ACCT_6173_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String make_dt_fr;
	public String make_dt_to;
	public String clsf;

	public FC_ACCT_6173_ADM(){}
	public FC_ACCT_6173_ADM(String cmpy_cd, String incmg_pers, String make_dt_fr, String make_dt_to, String clsf){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.make_dt_fr = make_dt_fr;
		this.make_dt_to = make_dt_to;
		this.clsf = clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setMake_dt_fr(String make_dt_fr){
		this.make_dt_fr = make_dt_fr;
	}

	public void setMake_dt_to(String make_dt_to){
		this.make_dt_to = make_dt_to;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getMake_dt_fr(){
		return this.make_dt_fr;
	}

	public String getMake_dt_to(){
		return this.make_dt_to;
	}

	public String getClsf(){
		return this.clsf;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_6173_A(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_6173_ADM dm = (FC_ACCT_6173_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.make_dt_fr);
		cstmt.setString(6, dm.make_dt_to);
		cstmt.setString(7, dm.clsf);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_6173_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("make_dt_fr = [" + getMake_dt_fr() + "]");
		System.out.println("make_dt_to = [" + getMake_dt_to() + "]");
		System.out.println("clsf = [" + getClsf() + "]");
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
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String make_dt_fr = req.getParameter("make_dt_fr");
if( make_dt_fr == null){
	System.out.println(this.toString+" : make_dt_fr is null" );
}else{
	System.out.println(this.toString+" : make_dt_fr is "+make_dt_fr );
}
String make_dt_to = req.getParameter("make_dt_to");
if( make_dt_to == null){
	System.out.println(this.toString+" : make_dt_to is null" );
}else{
	System.out.println(this.toString+" : make_dt_to is "+make_dt_to );
}
String clsf = req.getParameter("clsf");
if( clsf == null){
	System.out.println(this.toString+" : clsf is null" );
}else{
	System.out.println(this.toString+" : clsf is "+clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String make_dt_fr = Util.checkString(req.getParameter("make_dt_fr"));
String make_dt_to = Util.checkString(req.getParameter("make_dt_to"));
String clsf = Util.checkString(req.getParameter("clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String make_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt_fr")));
String make_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt_to")));
String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setMake_dt_fr(make_dt_fr);
dm.setMake_dt_to(make_dt_to);
dm.setClsf(clsf);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Aug 18 17:43:11 KST 2015 */