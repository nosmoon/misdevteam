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


package chosun.ciis.hd.dalon.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.dalon.ds.*;
import chosun.ciis.hd.dalon.rec.*;

/**
 * 
 */


public class HD_DALON_2001_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String duty_dt_fm;
	public String duty_dt_to;
	public String pay_dt;
	public String emp_clsf;

	public HD_DALON_2001_LDM(){}
	public HD_DALON_2001_LDM(String cmpy_cd, String duty_dt_fm, String duty_dt_to, String pay_dt, String emp_clsf){
		this.cmpy_cd = cmpy_cd;
		this.duty_dt_fm = duty_dt_fm;
		this.duty_dt_to = duty_dt_to;
		this.pay_dt = pay_dt;
		this.emp_clsf = emp_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDuty_dt_fm(String duty_dt_fm){
		this.duty_dt_fm = duty_dt_fm;
	}

	public void setDuty_dt_to(String duty_dt_to){
		this.duty_dt_to = duty_dt_to;
	}

	public void setPay_dt(String pay_dt){
		this.pay_dt = pay_dt;
	}

	public void setEmp_clsf(String emp_clsf){
		this.emp_clsf = emp_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDuty_dt_fm(){
		return this.duty_dt_fm;
	}

	public String getDuty_dt_to(){
		return this.duty_dt_to;
	}

	public String getPay_dt(){
		return this.pay_dt;
	}

	public String getEmp_clsf(){
		return this.emp_clsf;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_DALON_2001_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_DALON_2001_LDM dm = (HD_DALON_2001_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.duty_dt_fm);
		cstmt.setString(5, dm.duty_dt_to);
		cstmt.setString(6, dm.pay_dt);
		cstmt.setString(7, dm.emp_clsf);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.dalon.ds.HD_DALON_2001_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("duty_dt_fm = [" + getDuty_dt_fm() + "]");
		System.out.println("duty_dt_to = [" + getDuty_dt_to() + "]");
		System.out.println("pay_dt = [" + getPay_dt() + "]");
		System.out.println("emp_clsf = [" + getEmp_clsf() + "]");
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
String duty_dt_fm = req.getParameter("duty_dt_fm");
if( duty_dt_fm == null){
	System.out.println(this.toString+" : duty_dt_fm is null" );
}else{
	System.out.println(this.toString+" : duty_dt_fm is "+duty_dt_fm );
}
String duty_dt_to = req.getParameter("duty_dt_to");
if( duty_dt_to == null){
	System.out.println(this.toString+" : duty_dt_to is null" );
}else{
	System.out.println(this.toString+" : duty_dt_to is "+duty_dt_to );
}
String pay_dt = req.getParameter("pay_dt");
if( pay_dt == null){
	System.out.println(this.toString+" : pay_dt is null" );
}else{
	System.out.println(this.toString+" : pay_dt is "+pay_dt );
}
String emp_clsf = req.getParameter("emp_clsf");
if( emp_clsf == null){
	System.out.println(this.toString+" : emp_clsf is null" );
}else{
	System.out.println(this.toString+" : emp_clsf is "+emp_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String duty_dt_fm = Util.checkString(req.getParameter("duty_dt_fm"));
String duty_dt_to = Util.checkString(req.getParameter("duty_dt_to"));
String pay_dt = Util.checkString(req.getParameter("pay_dt"));
String emp_clsf = Util.checkString(req.getParameter("emp_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String duty_dt_fm = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_dt_fm")));
String duty_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_dt_to")));
String pay_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_dt")));
String emp_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setDuty_dt_fm(duty_dt_fm);
dm.setDuty_dt_to(duty_dt_to);
dm.setPay_dt(pay_dt);
dm.setEmp_clsf(emp_clsf);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Oct 09 17:21:49 KST 2009 */