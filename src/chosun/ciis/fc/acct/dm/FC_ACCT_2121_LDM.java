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


public class FC_ACCT_2121_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String slip_seq;
	public String uid;
	public String emp_no;

	public FC_ACCT_2121_LDM(){}
	public FC_ACCT_2121_LDM(String cmpy_cd, String slip_clsf_cd, String slip_occr_dt, String slip_seq, String uid, String emp_no){
		this.cmpy_cd = cmpy_cd;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_seq = slip_seq;
		this.uid = uid;
		this.emp_no = emp_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getUid(){
		return this.uid;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2121_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2121_LDM dm = (FC_ACCT_2121_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.slip_clsf_cd);
		cstmt.setString(5, dm.slip_occr_dt);
		cstmt.setString(6, dm.slip_seq);
		cstmt.setString(7, dm.uid);
		cstmt.setString(8, dm.emp_no);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2121_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_seq = [" + getSlip_seq() + "]");
		System.out.println("uid = [" + getUid() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
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
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
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
String uid = req.getParameter("uid");
if( uid == null){
	System.out.println(this.toString+" : uid is null" );
}else{
	System.out.println(this.toString+" : uid is "+uid );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String uid = Util.checkString(req.getParameter("uid"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_seq(slip_seq);
dm.setUid(uid);
dm.setEmp_no(emp_no);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Dec 19 14:30:10 KST 2014 */