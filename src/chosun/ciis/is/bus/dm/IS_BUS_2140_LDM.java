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


package chosun.ciis.is.bus.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bus.ds.*;
import chosun.ciis.is.bus.rec.*;

/**
 * 
 */


public class IS_BUS_2140_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String feed_frdt;
	public String feed_todt;
	public String incmg_pers;

	public IS_BUS_2140_LDM(){}
	public IS_BUS_2140_LDM(String cmpy_cd, String feed_frdt, String feed_todt, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.feed_frdt = feed_frdt;
		this.feed_todt = feed_todt;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFeed_frdt(String feed_frdt){
		this.feed_frdt = feed_frdt;
	}

	public void setFeed_todt(String feed_todt){
		this.feed_todt = feed_todt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFeed_frdt(){
		return this.feed_frdt;
	}

	public String getFeed_todt(){
		return this.feed_todt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_BUS_2140_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_BUS_2140_LDM dm = (IS_BUS_2140_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.feed_frdt);
		cstmt.setString(5, dm.feed_todt);
		cstmt.setString(6, dm.incmg_pers);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.bus.ds.IS_BUS_2140_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("feed_frdt = [" + getFeed_frdt() + "]");
		System.out.println("feed_todt = [" + getFeed_todt() + "]");
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
String feed_frdt = req.getParameter("feed_frdt");
if( feed_frdt == null){
	System.out.println(this.toString+" : feed_frdt is null" );
}else{
	System.out.println(this.toString+" : feed_frdt is "+feed_frdt );
}
String feed_todt = req.getParameter("feed_todt");
if( feed_todt == null){
	System.out.println(this.toString+" : feed_todt is null" );
}else{
	System.out.println(this.toString+" : feed_todt is "+feed_todt );
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
String feed_frdt = Util.checkString(req.getParameter("feed_frdt"));
String feed_todt = Util.checkString(req.getParameter("feed_todt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String feed_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("feed_frdt")));
String feed_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("feed_todt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setFeed_frdt(feed_frdt);
dm.setFeed_todt(feed_todt);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jun 21 16:41:07 KST 2012 */