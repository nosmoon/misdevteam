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


package chosun.ciis.hd.trip.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.trip.ds.*;
import chosun.ciis.hd.trip.rec.*;

/**
 * 
 */


public class HD_TRIP_1100_344_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fr_dt;
	public String to_dt;
	public String actu_slip_no;
	public String proc_stat;
	public String emp_no;

	public HD_TRIP_1100_344_LDM(){}
	public HD_TRIP_1100_344_LDM(String cmpy_cd, String fr_dt, String to_dt, String actu_slip_no, String proc_stat, String emp_no){
		this.cmpy_cd = cmpy_cd;
		this.fr_dt = fr_dt;
		this.to_dt = to_dt;
		this.actu_slip_no = actu_slip_no;
		this.proc_stat = proc_stat;
		this.emp_no = emp_no;
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

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
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

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_TRIP_1100_344_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_TRIP_1100_344_LDM dm = (HD_TRIP_1100_344_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fr_dt);
		cstmt.setString(5, dm.to_dt);
		cstmt.setString(6, dm.actu_slip_no);
		cstmt.setString(7, dm.proc_stat);
		cstmt.setString(8, dm.emp_no);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.trip.ds.HD_TRIP_1100_344_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fr_dt = [" + getFr_dt() + "]");
		System.out.println("to_dt = [" + getTo_dt() + "]");
		System.out.println("actu_slip_no = [" + getActu_slip_no() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
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
String actu_slip_no = req.getParameter("actu_slip_no");
if( actu_slip_no == null){
	System.out.println(this.toString+" : actu_slip_no is null" );
}else{
	System.out.println(this.toString+" : actu_slip_no is "+actu_slip_no );
}
String proc_stat = req.getParameter("proc_stat");
if( proc_stat == null){
	System.out.println(this.toString+" : proc_stat is null" );
}else{
	System.out.println(this.toString+" : proc_stat is "+proc_stat );
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
String fr_dt = Util.checkString(req.getParameter("fr_dt"));
String to_dt = Util.checkString(req.getParameter("to_dt"));
String actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
String proc_stat = Util.checkString(req.getParameter("proc_stat"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_dt")));
String to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_dt")));
String actu_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("actu_slip_no")));
String proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setFr_dt(fr_dt);
dm.setTo_dt(to_dt);
dm.setActu_slip_no(actu_slip_no);
dm.setProc_stat(proc_stat);
dm.setEmp_no(emp_no);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Aug 09 16:28:35 KST 2012 */