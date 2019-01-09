/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ���½�
***************************************************************************************************/
/***************************************************************************************************
* �������� : 
* ������ : 
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.vaca.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.vaca.ds.*;
import chosun.ciis.hd.vaca.rec.*;

/**
 * 
 */


public class HD_VACA_3450_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String plan_dt;
	public String u_id;

	public HD_VACA_3450_ADM(){}
	public HD_VACA_3450_ADM(String cmpy_cd, String plan_dt, String u_id){
		this.cmpy_cd = cmpy_cd;
		this.plan_dt = plan_dt;
		this.u_id = u_id;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPlan_dt(String plan_dt){
		this.plan_dt = plan_dt;
	}

	public void setU_id(String u_id){
		this.u_id = u_id;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPlan_dt(){
		return this.plan_dt;
	}

	public String getU_id(){
		return this.u_id;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_VACA_3450_A(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_VACA_3450_ADM dm = (HD_VACA_3450_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.plan_dt);
		cstmt.setString(5, dm.u_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.vaca.ds.HD_VACA_3450_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("plan_dt = [" + getPlan_dt() + "]");
		System.out.println("u_id = [" + getU_id() + "]");
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
String plan_dt = req.getParameter("plan_dt");
if( plan_dt == null){
	System.out.println(this.toString+" : plan_dt is null" );
}else{
	System.out.println(this.toString+" : plan_dt is "+plan_dt );
}
String u_id = req.getParameter("u_id");
if( u_id == null){
	System.out.println(this.toString+" : u_id is null" );
}else{
	System.out.println(this.toString+" : u_id is "+u_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String plan_dt = Util.checkString(req.getParameter("plan_dt"));
String u_id = Util.checkString(req.getParameter("u_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String plan_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("plan_dt")));
String u_id = Util.Uni2Ksc(Util.checkString(req.getParameter("u_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setPlan_dt(plan_dt);
dm.setU_id(u_id);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Aug 31 10:53:37 KST 2015 */