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


package chosun.ciis.mt.papinout.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.ds.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_2105_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String base_dt;
	public String pers_ip_addr;
	public String pers_id;

	public MT_PAPINOUT_2105_ADM(){}
	public MT_PAPINOUT_2105_ADM(String cmpy_cd, String base_dt, String pers_ip_addr, String pers_id){
		this.cmpy_cd = cmpy_cd;
		this.base_dt = base_dt;
		this.pers_ip_addr = pers_ip_addr;
		this.pers_id = pers_id;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBase_dt(String base_dt){
		this.base_dt = base_dt;
	}

	public void setPers_ip_addr(String pers_ip_addr){
		this.pers_ip_addr = pers_ip_addr;
	}

	public void setPers_id(String pers_id){
		this.pers_id = pers_id;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBase_dt(){
		return this.base_dt;
	}

	public String getPers_ip_addr(){
		return this.pers_ip_addr;
	}

	public String getPers_id(){
		return this.pers_id;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPINOUT_2105_A(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_2105_ADM dm = (MT_PAPINOUT_2105_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.base_dt);
		cstmt.setString(5, dm.pers_ip_addr);
		cstmt.setString(6, dm.pers_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_2105_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("base_dt = [" + getBase_dt() + "]");
		System.out.println("pers_ip_addr = [" + getPers_ip_addr() + "]");
		System.out.println("pers_id = [" + getPers_id() + "]");
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
String base_dt = req.getParameter("base_dt");
if( base_dt == null){
	System.out.println(this.toString+" : base_dt is null" );
}else{
	System.out.println(this.toString+" : base_dt is "+base_dt );
}
String pers_ip_addr = req.getParameter("pers_ip_addr");
if( pers_ip_addr == null){
	System.out.println(this.toString+" : pers_ip_addr is null" );
}else{
	System.out.println(this.toString+" : pers_ip_addr is "+pers_ip_addr );
}
String pers_id = req.getParameter("pers_id");
if( pers_id == null){
	System.out.println(this.toString+" : pers_id is null" );
}else{
	System.out.println(this.toString+" : pers_id is "+pers_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String base_dt = Util.checkString(req.getParameter("base_dt"));
String pers_ip_addr = Util.checkString(req.getParameter("pers_ip_addr"));
String pers_id = Util.checkString(req.getParameter("pers_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String base_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("base_dt")));
String pers_ip_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("pers_ip_addr")));
String pers_id = Util.Uni2Ksc(Util.checkString(req.getParameter("pers_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setBase_dt(base_dt);
dm.setPers_ip_addr(pers_ip_addr);
dm.setPers_id(pers_id);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Sep 23 23:40:22 KST 2009 */