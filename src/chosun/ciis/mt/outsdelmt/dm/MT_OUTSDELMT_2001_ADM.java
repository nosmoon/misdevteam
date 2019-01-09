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


package chosun.ciis.mt.outsdelmt.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.outsdelmt.ds.*;
import chosun.ciis.mt.outsdelmt.rec.*;

/**
 * 
 */


public class MT_OUTSDELMT_2001_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String aply_yymm;
	public String incmg_pers_ipaddr;
	public String incmg_pers;

	public MT_OUTSDELMT_2001_ADM(){}
	public MT_OUTSDELMT_2001_ADM(String cmpy_cd, String aply_yymm, String incmg_pers_ipaddr, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.aply_yymm = aply_yymm;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAply_yymm(String aply_yymm){
		this.aply_yymm = aply_yymm;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAply_yymm(){
		return this.aply_yymm;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_MT_OUTSDELMT_2001_A( ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_OUTSDELMT_2001_ADM dm = (MT_OUTSDELMT_2001_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.aply_yymm);
		cstmt.setString(5, dm.incmg_pers_ipaddr);
		cstmt.setString(6, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.outsdelmt.ds.MT_OUTSDELMT_2001_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("aply_yymm = " + getAply_yymm());
        System.out.println("incmg_pers_ipaddr = " + getIncmg_pers_ipaddr());
        System.out.println("incmg_pers = " + getIncmg_pers());
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
String aply_yymm = req.getParameter("aply_yymm");
if( aply_yymm == null){
	System.out.println(this.toString+" : aply_yymm is null" );
}else{
	System.out.println(this.toString+" : aply_yymm is "+aply_yymm );
}
String incmg_pers_ipaddr = req.getParameter("incmg_pers_ipaddr");
if( incmg_pers_ipaddr == null){
	System.out.println(this.toString+" : incmg_pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipaddr is "+incmg_pers_ipaddr );
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
String aply_yymm = Util.checkString(req.getParameter("aply_yymm"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aply_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_yymm")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setAply_yymm(aply_yymm);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 30 20:25:27 KST 2009 */