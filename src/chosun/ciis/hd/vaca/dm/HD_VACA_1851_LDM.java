

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


public class HD_VACA_1851_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fr_dt;
	public String to_dt;
	public String dept_cd;
	public String emp_no;
	public String proc_stat;
	public String emp_clsf;
	public String vaca_clsf;

	public HD_VACA_1851_LDM(){}
	public HD_VACA_1851_LDM(String cmpy_cd, String fr_dt, String to_dt, String dept_cd, String emp_no, String proc_stat, String emp_clsf, String vaca_clsf){
		this.cmpy_cd = cmpy_cd;
		this.fr_dt = fr_dt;
		this.to_dt = to_dt;
		this.dept_cd = dept_cd;
		this.emp_no = emp_no;
		this.proc_stat = proc_stat;
		this.emp_clsf = emp_clsf;
		this.vaca_clsf = vaca_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFr_dt(String fr_dt){
		this.fr_dt = fr_dt;
	}

	public void setTo_dt(String to_dt){
		this.to_dt = to_dt;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setEmp_clsf(String emp_clsf){
		this.emp_clsf = emp_clsf;
	}

	public void setVaca_clsf(String vaca_clsf){
		this.vaca_clsf = vaca_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFr_dt(){
		return this.fr_dt;
	}

	public String getTo_dt(){
		return this.to_dt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getEmp_clsf(){
		return this.emp_clsf;
	}

	public String getVaca_clsf(){
		return this.vaca_clsf;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_VACA_1851_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_VACA_1851_LDM dm = (HD_VACA_1851_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fr_dt);
		cstmt.setString(5, dm.to_dt);
		cstmt.setString(6, dm.dept_cd);
		cstmt.setString(7, dm.emp_no);
		cstmt.setString(8, dm.proc_stat);
		cstmt.setString(9, dm.emp_clsf);
		cstmt.setString(10, dm.vaca_clsf);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_VACA_1851_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fr_dt = [" + getFr_dt() + "]");
		System.out.println("to_dt = [" + getTo_dt() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
		System.out.println("emp_clsf = [" + getEmp_clsf() + "]");
		System.out.println("vaca_clsf = [" + getVaca_clsf() + "]");
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
String fr_dt = req.getParameter("fr_dt");
if( fr_dt == null){
	System.out.println(this.toString+" : fr_dt is null" );
}else{
	System.out.println(this.toString+" : fr_dt is "+fr_dt );
}
String to_dt = req.getParameter("to_dt");
if( to_dt == null){
	System.out.println(this.toString+" : to_dt is null" );
}else{
	System.out.println(this.toString+" : to_dt is "+to_dt );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String proc_stat = req.getParameter("proc_stat");
if( proc_stat == null){
	System.out.println(this.toString+" : proc_stat is null" );
}else{
	System.out.println(this.toString+" : proc_stat is "+proc_stat );
}
String emp_clsf = req.getParameter("emp_clsf");
if( emp_clsf == null){
	System.out.println(this.toString+" : emp_clsf is null" );
}else{
	System.out.println(this.toString+" : emp_clsf is "+emp_clsf );
}
String vaca_clsf = req.getParameter("vaca_clsf");
if( vaca_clsf == null){
	System.out.println(this.toString+" : vaca_clsf is null" );
}else{
	System.out.println(this.toString+" : vaca_clsf is "+vaca_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fr_dt = Util.checkString(req.getParameter("fr_dt"));
String to_dt = Util.checkString(req.getParameter("to_dt"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String proc_stat = Util.checkString(req.getParameter("proc_stat"));
String emp_clsf = Util.checkString(req.getParameter("emp_clsf"));
String vaca_clsf = Util.checkString(req.getParameter("vaca_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_dt")));
String to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_dt")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat")));
String emp_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf")));
String vaca_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setFr_dt(fr_dt);
dm.setTo_dt(to_dt);
dm.setDept_cd(dept_cd);
dm.setEmp_no(emp_no);
dm.setProc_stat(proc_stat);
dm.setEmp_clsf(emp_clsf);
dm.setVaca_clsf(vaca_clsf);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Nov 10 14:38:09 KST 2010 */