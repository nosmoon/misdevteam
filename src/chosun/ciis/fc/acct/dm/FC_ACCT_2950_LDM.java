/***************************************************************************************************
* ���ϸ� : FC_ACCT_2950_L.java
* ��� :   �����������ǥ��� ��ȸ
* �ۼ����� :
* �ۼ��� : ����ǥ
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
 * �����������ǥ��� ��ȸ
 */

public class FC_ACCT_2950_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_slip_occr_dt;
	public String occr_slip_clsf_cd;
	public String occr_slip_seq;
	public String pay_dt_fr;
	public String pay_dt_to;

	public FC_ACCT_2950_LDM(){}
	public FC_ACCT_2950_LDM(String cmpy_cd, String occr_slip_occr_dt, String occr_slip_clsf_cd, String occr_slip_seq, String pay_dt_fr, String pay_dt_to){
		this.cmpy_cd = cmpy_cd;
		this.occr_slip_occr_dt = occr_slip_occr_dt;
		this.occr_slip_clsf_cd = occr_slip_clsf_cd;
		this.occr_slip_seq = occr_slip_seq;
		this.pay_dt_fr = pay_dt_fr;
		this.pay_dt_to = pay_dt_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_slip_occr_dt(String occr_slip_occr_dt){
		this.occr_slip_occr_dt = occr_slip_occr_dt;
	}

	public void setOccr_slip_clsf_cd(String occr_slip_clsf_cd){
		this.occr_slip_clsf_cd = occr_slip_clsf_cd;
	}

	public void setOccr_slip_seq(String occr_slip_seq){
		this.occr_slip_seq = occr_slip_seq;
	}

	public void setPay_dt_fr(String pay_dt_fr){
		this.pay_dt_fr = pay_dt_fr;
	}

	public void setPay_dt_to(String pay_dt_to){
		this.pay_dt_to = pay_dt_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_slip_occr_dt(){
		return this.occr_slip_occr_dt;
	}

	public String getOccr_slip_clsf_cd(){
		return this.occr_slip_clsf_cd;
	}

	public String getOccr_slip_seq(){
		return this.occr_slip_seq;
	}

	public String getPay_dt_fr(){
		return this.pay_dt_fr;
	}

	public String getPay_dt_to(){
		return this.pay_dt_to;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2950_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2950_LDM dm = (FC_ACCT_2950_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_slip_occr_dt);
		cstmt.setString(5, dm.occr_slip_clsf_cd);
		cstmt.setString(6, dm.occr_slip_seq);
		cstmt.setString(7, dm.pay_dt_fr);
		cstmt.setString(8, dm.pay_dt_to);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2950_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("occr_slip_occr_dt = " + getOccr_slip_occr_dt());
        System.out.println("occr_slip_clsf_cd = " + getOccr_slip_clsf_cd());
        System.out.println("occr_slip_seq = " + getOccr_slip_seq());
        System.out.println("pay_dt_fr = " + getPay_dt_fr());
        System.out.println("pay_dt_to = " + getPay_dt_to());
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
String occr_slip_occr_dt = req.getParameter("occr_slip_occr_dt");
if( occr_slip_occr_dt == null){
	System.out.println(this.toString+" : occr_slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_slip_occr_dt is "+occr_slip_occr_dt );
}
String occr_slip_clsf_cd = req.getParameter("occr_slip_clsf_cd");
if( occr_slip_clsf_cd == null){
	System.out.println(this.toString+" : occr_slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : occr_slip_clsf_cd is "+occr_slip_clsf_cd );
}
String occr_slip_seq = req.getParameter("occr_slip_seq");
if( occr_slip_seq == null){
	System.out.println(this.toString+" : occr_slip_seq is null" );
}else{
	System.out.println(this.toString+" : occr_slip_seq is "+occr_slip_seq );
}
String pay_dt_fr = req.getParameter("pay_dt_fr");
if( pay_dt_fr == null){
	System.out.println(this.toString+" : pay_dt_fr is null" );
}else{
	System.out.println(this.toString+" : pay_dt_fr is "+pay_dt_fr );
}
String pay_dt_to = req.getParameter("pay_dt_to");
if( pay_dt_to == null){
	System.out.println(this.toString+" : pay_dt_to is null" );
}else{
	System.out.println(this.toString+" : pay_dt_to is "+pay_dt_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_slip_occr_dt = Util.checkString(req.getParameter("occr_slip_occr_dt"));
String occr_slip_clsf_cd = Util.checkString(req.getParameter("occr_slip_clsf_cd"));
String occr_slip_seq = Util.checkString(req.getParameter("occr_slip_seq"));
String pay_dt_fr = Util.checkString(req.getParameter("pay_dt_fr"));
String pay_dt_to = Util.checkString(req.getParameter("pay_dt_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_slip_occr_dt")));
String occr_slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_slip_clsf_cd")));
String occr_slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_slip_seq")));
String pay_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_dt_fr")));
String pay_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_dt_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_slip_occr_dt(occr_slip_occr_dt);
dm.setOccr_slip_clsf_cd(occr_slip_clsf_cd);
dm.setOccr_slip_seq(occr_slip_seq);
dm.setPay_dt_fr(pay_dt_fr);
dm.setPay_dt_to(pay_dt_to);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu May 28 16:03:07 KST 2009 */