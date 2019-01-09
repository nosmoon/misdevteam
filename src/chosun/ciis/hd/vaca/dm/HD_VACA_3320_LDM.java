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


public class HD_VACA_3320_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dept_cd;
	public String plan_dt;
	public String emp_no;
	public String posi_gb;

	public HD_VACA_3320_LDM(){}
	public HD_VACA_3320_LDM(String cmpy_cd, String dept_cd, String plan_dt, String emp_no, String posi_gb){
		this.cmpy_cd = cmpy_cd;
		this.dept_cd = dept_cd;
		this.plan_dt = plan_dt;
		this.emp_no = emp_no;
		this.posi_gb = posi_gb;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setPlan_dt(String plan_dt){
		this.plan_dt = plan_dt;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setPosi_gb(String posi_gb){
		this.posi_gb = posi_gb;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getPlan_dt(){
		return this.plan_dt;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getPosi_gb(){
		return this.posi_gb;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_VACA_3320_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_VACA_3320_LDM dm = (HD_VACA_3320_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dept_cd);
		cstmt.setString(5, dm.plan_dt);
		cstmt.setString(6, dm.emp_no);
		cstmt.setString(7, dm.posi_gb);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.vaca.ds.HD_VACA_3320_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("plan_dt = [" + getPlan_dt() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("posi_gb = [" + getPosi_gb() + "]");
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
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String plan_dt = req.getParameter("plan_dt");
if( plan_dt == null){
	System.out.println(this.toString+" : plan_dt is null" );
}else{
	System.out.println(this.toString+" : plan_dt is "+plan_dt );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String posi_gb = req.getParameter("posi_gb");
if( posi_gb == null){
	System.out.println(this.toString+" : posi_gb is null" );
}else{
	System.out.println(this.toString+" : posi_gb is "+posi_gb );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String plan_dt = Util.checkString(req.getParameter("plan_dt"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String posi_gb = Util.checkString(req.getParameter("posi_gb"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String plan_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("plan_dt")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String posi_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_gb")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setDept_cd(dept_cd);
dm.setPlan_dt(plan_dt);
dm.setEmp_no(emp_no);
dm.setPosi_gb(posi_gb);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Aug 20 15:21:30 KST 2015 */