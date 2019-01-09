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


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_1040_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String now_note_stat_cd;
	public String mtry_dt;
	public String pch_cymd1fr;
	public String pch_cymd1to;

	public FC_FUNC_1040_LDM(){}
	public FC_FUNC_1040_LDM(String cmpy_cd, String now_note_stat_cd, String mtry_dt, String pch_cymd1fr, String pch_cymd1to){
		this.cmpy_cd = cmpy_cd;
		this.now_note_stat_cd = now_note_stat_cd;
		this.mtry_dt = mtry_dt;
		this.pch_cymd1fr = pch_cymd1fr;
		this.pch_cymd1to = pch_cymd1to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setNow_note_stat_cd(String now_note_stat_cd){
		this.now_note_stat_cd = now_note_stat_cd;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setPch_cymd1fr(String pch_cymd1fr){
		this.pch_cymd1fr = pch_cymd1fr;
	}

	public void setPch_cymd1to(String pch_cymd1to){
		this.pch_cymd1to = pch_cymd1to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getNow_note_stat_cd(){
		return this.now_note_stat_cd;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getPch_cymd1fr(){
		return this.pch_cymd1fr;
	}

	public String getPch_cymd1to(){
		return this.pch_cymd1to;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_1040_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_1040_LDM dm = (FC_FUNC_1040_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.now_note_stat_cd);
		cstmt.setString(5, dm.mtry_dt);
		cstmt.setString(6, dm.pch_cymd1fr);
		cstmt.setString(7, dm.pch_cymd1to);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_1040_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("now_note_stat_cd = [" + getNow_note_stat_cd() + "]");
		System.out.println("mtry_dt = [" + getMtry_dt() + "]");
		System.out.println("pch_cymd1fr = [" + getPch_cymd1fr() + "]");
		System.out.println("pch_cymd1to = [" + getPch_cymd1to() + "]");
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
String now_note_stat_cd = req.getParameter("now_note_stat_cd");
if( now_note_stat_cd == null){
	System.out.println(this.toString+" : now_note_stat_cd is null" );
}else{
	System.out.println(this.toString+" : now_note_stat_cd is "+now_note_stat_cd );
}
String mtry_dt = req.getParameter("mtry_dt");
if( mtry_dt == null){
	System.out.println(this.toString+" : mtry_dt is null" );
}else{
	System.out.println(this.toString+" : mtry_dt is "+mtry_dt );
}
String pch_cymd1fr = req.getParameter("pch_cymd1fr");
if( pch_cymd1fr == null){
	System.out.println(this.toString+" : pch_cymd1fr is null" );
}else{
	System.out.println(this.toString+" : pch_cymd1fr is "+pch_cymd1fr );
}
String pch_cymd1to = req.getParameter("pch_cymd1to");
if( pch_cymd1to == null){
	System.out.println(this.toString+" : pch_cymd1to is null" );
}else{
	System.out.println(this.toString+" : pch_cymd1to is "+pch_cymd1to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String now_note_stat_cd = Util.checkString(req.getParameter("now_note_stat_cd"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String pch_cymd1fr = Util.checkString(req.getParameter("pch_cymd1fr"));
String pch_cymd1to = Util.checkString(req.getParameter("pch_cymd1to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String now_note_stat_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("now_note_stat_cd")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String pch_cymd1fr = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_cymd1fr")));
String pch_cymd1to = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_cymd1to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setNow_note_stat_cd(now_note_stat_cd);
dm.setMtry_dt(mtry_dt);
dm.setPch_cymd1fr(pch_cymd1fr);
dm.setPch_cymd1to(pch_cymd1to);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 02 13:28:08 KST 2009 */