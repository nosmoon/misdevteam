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


public class FC_ACCT_2263_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seqfr;
	public String slip_seqto;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String clgbcd;

	public FC_ACCT_2263_IDM(){}
	public FC_ACCT_2263_IDM(String cmpy_cd, String slip_occr_dt, String slip_clsf_cd, String slip_seqfr, String slip_seqto, String incmg_pers, String incmg_pers_ipadd, String clgbcd){
		this.cmpy_cd = cmpy_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_seqfr = slip_seqfr;
		this.slip_seqto = slip_seqto;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.clgbcd = clgbcd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seqfr(String slip_seqfr){
		this.slip_seqfr = slip_seqfr;
	}

	public void setSlip_seqto(String slip_seqto){
		this.slip_seqto = slip_seqto;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setClgbcd(String clgbcd){
		this.clgbcd = clgbcd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seqfr(){
		return this.slip_seqfr;
	}

	public String getSlip_seqto(){
		return this.slip_seqto;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getClgbcd(){
		return this.clgbcd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2263_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2263_IDM dm = (FC_ACCT_2263_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.slip_occr_dt);
		cstmt.setString(5, dm.slip_clsf_cd);
		cstmt.setString(6, dm.slip_seqfr);
		cstmt.setString(7, dm.slip_seqto);
		cstmt.setString(8, dm.incmg_pers);
		cstmt.setString(9, dm.incmg_pers_ipadd);
		cstmt.setString(10, dm.clgbcd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2263_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_seqfr = [" + getSlip_seqfr() + "]");
		System.out.println("slip_seqto = [" + getSlip_seqto() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("clgbcd = [" + getClgbcd() + "]");
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
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String slip_seqfr = req.getParameter("slip_seqfr");
if( slip_seqfr == null){
	System.out.println(this.toString+" : slip_seqfr is null" );
}else{
	System.out.println(this.toString+" : slip_seqfr is "+slip_seqfr );
}
String slip_seqto = req.getParameter("slip_seqto");
if( slip_seqto == null){
	System.out.println(this.toString+" : slip_seqto is null" );
}else{
	System.out.println(this.toString+" : slip_seqto is "+slip_seqto );
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
String clgbcd = req.getParameter("clgbcd");
if( clgbcd == null){
	System.out.println(this.toString+" : clgbcd is null" );
}else{
	System.out.println(this.toString+" : clgbcd is "+clgbcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_seqfr = Util.checkString(req.getParameter("slip_seqfr"));
String slip_seqto = Util.checkString(req.getParameter("slip_seqto"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String clgbcd = Util.checkString(req.getParameter("clgbcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_seqfr = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seqfr")));
String slip_seqto = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seqto")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String clgbcd = Util.Uni2Ksc(Util.checkString(req.getParameter("clgbcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_seqfr(slip_seqfr);
dm.setSlip_seqto(slip_seqto);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setClgbcd(clgbcd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu May 21 15:19:36 KST 2009 */