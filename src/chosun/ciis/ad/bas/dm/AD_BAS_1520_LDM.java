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


package chosun.ciis.ad.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.bas.ds.*;
import chosun.ciis.ad.bas.rec.*;

/**
 * 
 */


public class AD_BAS_1520_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String search_dt_fr;
	public String search_dt_to;
	public String incmg_pers;

	public AD_BAS_1520_LDM(){}
	public AD_BAS_1520_LDM(String cmpy_cd, String search_dt_fr, String search_dt_to, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.search_dt_fr = search_dt_fr;
		this.search_dt_to = search_dt_to;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSearch_dt_fr(String search_dt_fr){
		this.search_dt_fr = search_dt_fr;
	}

	public void setSearch_dt_to(String search_dt_to){
		this.search_dt_to = search_dt_to;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSearch_dt_fr(){
		return this.search_dt_fr;
	}

	public String getSearch_dt_to(){
		return this.search_dt_to;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BAS_1520_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_1520_LDM dm = (AD_BAS_1520_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.search_dt_fr);
		cstmt.setString(5, dm.search_dt_to);
		cstmt.setString(6, dm.incmg_pers);
		cstmt.registerOutParameter(7, Types.INTEGER);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_1520_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("search_dt_fr = [" + getSearch_dt_fr() + "]");
		System.out.println("search_dt_to = [" + getSearch_dt_to() + "]");
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
String search_dt_fr = req.getParameter("search_dt_fr");
if( search_dt_fr == null){
	System.out.println(this.toString+" : search_dt_fr is null" );
}else{
	System.out.println(this.toString+" : search_dt_fr is "+search_dt_fr );
}
String search_dt_to = req.getParameter("search_dt_to");
if( search_dt_to == null){
	System.out.println(this.toString+" : search_dt_to is null" );
}else{
	System.out.println(this.toString+" : search_dt_to is "+search_dt_to );
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
String search_dt_fr = Util.checkString(req.getParameter("search_dt_fr"));
String search_dt_to = Util.checkString(req.getParameter("search_dt_to"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String search_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("search_dt_fr")));
String search_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("search_dt_to")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setSearch_dt_fr(search_dt_fr);
dm.setSearch_dt_to(search_dt_to);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Oct 31 16:09:58 KST 2016 */