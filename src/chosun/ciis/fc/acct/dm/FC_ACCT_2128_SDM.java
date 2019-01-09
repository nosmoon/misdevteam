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


public class FC_ACCT_2128_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String rcpm_slip_occr_dt;
	public String rcpm_slip_clsf_cd;
	public String rcpm_slip_seq;
	public String slip_occr_dt;
	public String slip_seq;

	public FC_ACCT_2128_SDM(){}
	public FC_ACCT_2128_SDM(String cmpy_cd, String rcpm_slip_occr_dt, String rcpm_slip_clsf_cd, String rcpm_slip_seq, String slip_occr_dt, String slip_seq){
		this.cmpy_cd = cmpy_cd;
		this.rcpm_slip_occr_dt = rcpm_slip_occr_dt;
		this.rcpm_slip_clsf_cd = rcpm_slip_clsf_cd;
		this.rcpm_slip_seq = rcpm_slip_seq;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_seq = slip_seq;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRcpm_slip_occr_dt(String rcpm_slip_occr_dt){
		this.rcpm_slip_occr_dt = rcpm_slip_occr_dt;
	}

	public void setRcpm_slip_clsf_cd(String rcpm_slip_clsf_cd){
		this.rcpm_slip_clsf_cd = rcpm_slip_clsf_cd;
	}

	public void setRcpm_slip_seq(String rcpm_slip_seq){
		this.rcpm_slip_seq = rcpm_slip_seq;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRcpm_slip_occr_dt(){
		return this.rcpm_slip_occr_dt;
	}

	public String getRcpm_slip_clsf_cd(){
		return this.rcpm_slip_clsf_cd;
	}

	public String getRcpm_slip_seq(){
		return this.rcpm_slip_seq;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2128_S(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2128_SDM dm = (FC_ACCT_2128_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.rcpm_slip_occr_dt);
		cstmt.setString(5, dm.rcpm_slip_clsf_cd);
		cstmt.setString(6, dm.rcpm_slip_seq);
		cstmt.setString(7, dm.slip_occr_dt);
		cstmt.setString(8, dm.slip_seq);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2128_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("rcpm_slip_occr_dt = [" + getRcpm_slip_occr_dt() + "]");
		System.out.println("rcpm_slip_clsf_cd = [" + getRcpm_slip_clsf_cd() + "]");
		System.out.println("rcpm_slip_seq = [" + getRcpm_slip_seq() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_seq = [" + getSlip_seq() + "]");
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
String rcpm_slip_occr_dt = req.getParameter("rcpm_slip_occr_dt");
if( rcpm_slip_occr_dt == null){
	System.out.println(this.toString+" : rcpm_slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : rcpm_slip_occr_dt is "+rcpm_slip_occr_dt );
}
String rcpm_slip_clsf_cd = req.getParameter("rcpm_slip_clsf_cd");
if( rcpm_slip_clsf_cd == null){
	System.out.println(this.toString+" : rcpm_slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : rcpm_slip_clsf_cd is "+rcpm_slip_clsf_cd );
}
String rcpm_slip_seq = req.getParameter("rcpm_slip_seq");
if( rcpm_slip_seq == null){
	System.out.println(this.toString+" : rcpm_slip_seq is null" );
}else{
	System.out.println(this.toString+" : rcpm_slip_seq is "+rcpm_slip_seq );
}
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String slip_seq = req.getParameter("slip_seq");
if( slip_seq == null){
	System.out.println(this.toString+" : slip_seq is null" );
}else{
	System.out.println(this.toString+" : slip_seq is "+slip_seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String rcpm_slip_occr_dt = Util.checkString(req.getParameter("rcpm_slip_occr_dt"));
String rcpm_slip_clsf_cd = Util.checkString(req.getParameter("rcpm_slip_clsf_cd"));
String rcpm_slip_seq = Util.checkString(req.getParameter("rcpm_slip_seq"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rcpm_slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_slip_occr_dt")));
String rcpm_slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_slip_clsf_cd")));
String rcpm_slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_slip_seq")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setRcpm_slip_occr_dt(rcpm_slip_occr_dt);
dm.setRcpm_slip_clsf_cd(rcpm_slip_clsf_cd);
dm.setRcpm_slip_seq(rcpm_slip_seq);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_seq(slip_seq);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Aug 14 16:40:59 KST 2009 */