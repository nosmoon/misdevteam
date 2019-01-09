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


public class FC_ACCT_4006_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_acct_cd;
	public String from_fisc_dt;
	public String to_fisc_dt;
	public String adjm_occr_dt;
	public String adjm_slip_clsf;
	public String adjm_seq;

	public FC_ACCT_4006_LDM(){}
	public FC_ACCT_4006_LDM(String cmpy_cd, String occr_acct_cd, String from_fisc_dt, String to_fisc_dt, String adjm_occr_dt, String adjm_slip_clsf, String adjm_seq){
		this.cmpy_cd = cmpy_cd;
		this.occr_acct_cd = occr_acct_cd;
		this.from_fisc_dt = from_fisc_dt;
		this.to_fisc_dt = to_fisc_dt;
		this.adjm_occr_dt = adjm_occr_dt;
		this.adjm_slip_clsf = adjm_slip_clsf;
		this.adjm_seq = adjm_seq;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_acct_cd(String occr_acct_cd){
		this.occr_acct_cd = occr_acct_cd;
	}

	public void setFrom_fisc_dt(String from_fisc_dt){
		this.from_fisc_dt = from_fisc_dt;
	}

	public void setTo_fisc_dt(String to_fisc_dt){
		this.to_fisc_dt = to_fisc_dt;
	}

	public void setAdjm_occr_dt(String adjm_occr_dt){
		this.adjm_occr_dt = adjm_occr_dt;
	}

	public void setAdjm_slip_clsf(String adjm_slip_clsf){
		this.adjm_slip_clsf = adjm_slip_clsf;
	}

	public void setAdjm_seq(String adjm_seq){
		this.adjm_seq = adjm_seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_acct_cd(){
		return this.occr_acct_cd;
	}

	public String getFrom_fisc_dt(){
		return this.from_fisc_dt;
	}

	public String getTo_fisc_dt(){
		return this.to_fisc_dt;
	}

	public String getAdjm_occr_dt(){
		return this.adjm_occr_dt;
	}

	public String getAdjm_slip_clsf(){
		return this.adjm_slip_clsf;
	}

	public String getAdjm_seq(){
		return this.adjm_seq;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_4006_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_4006_LDM dm = (FC_ACCT_4006_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_acct_cd);
		cstmt.setString(5, dm.from_fisc_dt);
		cstmt.setString(6, dm.to_fisc_dt);
		cstmt.setString(7, dm.adjm_occr_dt);
		cstmt.setString(8, dm.adjm_slip_clsf);
		cstmt.setString(9, dm.adjm_seq);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_4006_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_acct_cd = [" + getOccr_acct_cd() + "]");
		System.out.println("from_fisc_dt = [" + getFrom_fisc_dt() + "]");
		System.out.println("to_fisc_dt = [" + getTo_fisc_dt() + "]");
		System.out.println("adjm_occr_dt = [" + getAdjm_occr_dt() + "]");
		System.out.println("adjm_slip_clsf = [" + getAdjm_slip_clsf() + "]");
		System.out.println("adjm_seq = [" + getAdjm_seq() + "]");
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
String occr_acct_cd = req.getParameter("occr_acct_cd");
if( occr_acct_cd == null){
	System.out.println(this.toString+" : occr_acct_cd is null" );
}else{
	System.out.println(this.toString+" : occr_acct_cd is "+occr_acct_cd );
}
String from_fisc_dt = req.getParameter("from_fisc_dt");
if( from_fisc_dt == null){
	System.out.println(this.toString+" : from_fisc_dt is null" );
}else{
	System.out.println(this.toString+" : from_fisc_dt is "+from_fisc_dt );
}
String to_fisc_dt = req.getParameter("to_fisc_dt");
if( to_fisc_dt == null){
	System.out.println(this.toString+" : to_fisc_dt is null" );
}else{
	System.out.println(this.toString+" : to_fisc_dt is "+to_fisc_dt );
}
String adjm_occr_dt = req.getParameter("adjm_occr_dt");
if( adjm_occr_dt == null){
	System.out.println(this.toString+" : adjm_occr_dt is null" );
}else{
	System.out.println(this.toString+" : adjm_occr_dt is "+adjm_occr_dt );
}
String adjm_slip_clsf = req.getParameter("adjm_slip_clsf");
if( adjm_slip_clsf == null){
	System.out.println(this.toString+" : adjm_slip_clsf is null" );
}else{
	System.out.println(this.toString+" : adjm_slip_clsf is "+adjm_slip_clsf );
}
String adjm_seq = req.getParameter("adjm_seq");
if( adjm_seq == null){
	System.out.println(this.toString+" : adjm_seq is null" );
}else{
	System.out.println(this.toString+" : adjm_seq is "+adjm_seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_acct_cd = Util.checkString(req.getParameter("occr_acct_cd"));
String from_fisc_dt = Util.checkString(req.getParameter("from_fisc_dt"));
String to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
String adjm_occr_dt = Util.checkString(req.getParameter("adjm_occr_dt"));
String adjm_slip_clsf = Util.checkString(req.getParameter("adjm_slip_clsf"));
String adjm_seq = Util.checkString(req.getParameter("adjm_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_acct_cd")));
String from_fisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("from_fisc_dt")));
String to_fisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_fisc_dt")));
String adjm_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_occr_dt")));
String adjm_slip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_slip_clsf")));
String adjm_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_acct_cd(occr_acct_cd);
dm.setFrom_fisc_dt(from_fisc_dt);
dm.setTo_fisc_dt(to_fisc_dt);
dm.setAdjm_occr_dt(adjm_occr_dt);
dm.setAdjm_slip_clsf(adjm_slip_clsf);
dm.setAdjm_seq(adjm_seq);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jul 17 09:54:43 KST 2009 */