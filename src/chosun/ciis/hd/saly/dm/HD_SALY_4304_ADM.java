/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.saly.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.ds.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_4304_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String acpn_yy;
	public String acpn_seq;
	public String seiz_dduc_tms;
	public String proc_clsf;
	public String dduc_dt;
	public String seiz_dduc_amt;
	public String emp_no;
	public String flnm;
	public String dept_cd;
	public String u_ipadd;
	public String u_id;

	public HD_SALY_4304_ADM(){}
	public HD_SALY_4304_ADM(String mode, String cmpy_cd, String acpn_yy, String acpn_seq, String seiz_dduc_tms, String proc_clsf, String dduc_dt, String seiz_dduc_amt, String emp_no, String flnm, String dept_cd, String u_ipadd, String u_id){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.acpn_yy = acpn_yy;
		this.acpn_seq = acpn_seq;
		this.seiz_dduc_tms = seiz_dduc_tms;
		this.proc_clsf = proc_clsf;
		this.dduc_dt = dduc_dt;
		this.seiz_dduc_amt = seiz_dduc_amt;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.dept_cd = dept_cd;
		this.u_ipadd = u_ipadd;
		this.u_id = u_id;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAcpn_yy(String acpn_yy){
		this.acpn_yy = acpn_yy;
	}

	public void setAcpn_seq(String acpn_seq){
		this.acpn_seq = acpn_seq;
	}

	public void setSeiz_dduc_tms(String seiz_dduc_tms){
		this.seiz_dduc_tms = seiz_dduc_tms;
	}

	public void setProc_clsf(String proc_clsf){
		this.proc_clsf = proc_clsf;
	}

	public void setDduc_dt(String dduc_dt){
		this.dduc_dt = dduc_dt;
	}

	public void setSeiz_dduc_amt(String seiz_dduc_amt){
		this.seiz_dduc_amt = seiz_dduc_amt;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setU_ipadd(String u_ipadd){
		this.u_ipadd = u_ipadd;
	}

	public void setU_id(String u_id){
		this.u_id = u_id;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAcpn_yy(){
		return this.acpn_yy;
	}

	public String getAcpn_seq(){
		return this.acpn_seq;
	}

	public String getSeiz_dduc_tms(){
		return this.seiz_dduc_tms;
	}

	public String getProc_clsf(){
		return this.proc_clsf;
	}

	public String getDduc_dt(){
		return this.dduc_dt;
	}

	public String getSeiz_dduc_amt(){
		return this.seiz_dduc_amt;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getU_ipadd(){
		return this.u_ipadd;
	}

	public String getU_id(){
		return this.u_id;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_4304_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_4304_ADM dm = (HD_SALY_4304_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.acpn_yy);
		cstmt.setString(6, dm.acpn_seq);
		cstmt.setString(7, dm.seiz_dduc_tms);
		cstmt.setString(8, dm.proc_clsf);
		cstmt.setString(9, dm.dduc_dt);
		cstmt.setString(10, dm.seiz_dduc_amt);
		cstmt.setString(11, dm.emp_no);
		cstmt.setString(12, dm.flnm);
		cstmt.setString(13, dm.dept_cd);
		cstmt.setString(14, dm.u_ipadd);
		cstmt.setString(15, dm.u_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.saly.ds.HD_SALY_4304_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("acpn_yy = [" + getAcpn_yy() + "]");
		System.out.println("acpn_seq = [" + getAcpn_seq() + "]");
		System.out.println("seiz_dduc_tms = [" + getSeiz_dduc_tms() + "]");
		System.out.println("proc_clsf = [" + getProc_clsf() + "]");
		System.out.println("dduc_dt = [" + getDduc_dt() + "]");
		System.out.println("seiz_dduc_amt = [" + getSeiz_dduc_amt() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("u_ipadd = [" + getU_ipadd() + "]");
		System.out.println("u_id = [" + getU_id() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String acpn_yy = req.getParameter("acpn_yy");
if( acpn_yy == null){
	System.out.println(this.toString+" : acpn_yy is null" );
}else{
	System.out.println(this.toString+" : acpn_yy is "+acpn_yy );
}
String acpn_seq = req.getParameter("acpn_seq");
if( acpn_seq == null){
	System.out.println(this.toString+" : acpn_seq is null" );
}else{
	System.out.println(this.toString+" : acpn_seq is "+acpn_seq );
}
String seiz_dduc_tms = req.getParameter("seiz_dduc_tms");
if( seiz_dduc_tms == null){
	System.out.println(this.toString+" : seiz_dduc_tms is null" );
}else{
	System.out.println(this.toString+" : seiz_dduc_tms is "+seiz_dduc_tms );
}
String proc_clsf = req.getParameter("proc_clsf");
if( proc_clsf == null){
	System.out.println(this.toString+" : proc_clsf is null" );
}else{
	System.out.println(this.toString+" : proc_clsf is "+proc_clsf );
}
String dduc_dt = req.getParameter("dduc_dt");
if( dduc_dt == null){
	System.out.println(this.toString+" : dduc_dt is null" );
}else{
	System.out.println(this.toString+" : dduc_dt is "+dduc_dt );
}
String seiz_dduc_amt = req.getParameter("seiz_dduc_amt");
if( seiz_dduc_amt == null){
	System.out.println(this.toString+" : seiz_dduc_amt is null" );
}else{
	System.out.println(this.toString+" : seiz_dduc_amt is "+seiz_dduc_amt );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String u_ipadd = req.getParameter("u_ipadd");
if( u_ipadd == null){
	System.out.println(this.toString+" : u_ipadd is null" );
}else{
	System.out.println(this.toString+" : u_ipadd is "+u_ipadd );
}
String u_id = req.getParameter("u_id");
if( u_id == null){
	System.out.println(this.toString+" : u_id is null" );
}else{
	System.out.println(this.toString+" : u_id is "+u_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String acpn_yy = Util.checkString(req.getParameter("acpn_yy"));
String acpn_seq = Util.checkString(req.getParameter("acpn_seq"));
String seiz_dduc_tms = Util.checkString(req.getParameter("seiz_dduc_tms"));
String proc_clsf = Util.checkString(req.getParameter("proc_clsf"));
String dduc_dt = Util.checkString(req.getParameter("dduc_dt"));
String seiz_dduc_amt = Util.checkString(req.getParameter("seiz_dduc_amt"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String u_ipadd = Util.checkString(req.getParameter("u_ipadd"));
String u_id = Util.checkString(req.getParameter("u_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String acpn_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("acpn_yy")));
String acpn_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("acpn_seq")));
String seiz_dduc_tms = Util.Uni2Ksc(Util.checkString(req.getParameter("seiz_dduc_tms")));
String proc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_clsf")));
String dduc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("dduc_dt")));
String seiz_dduc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("seiz_dduc_amt")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String u_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("u_ipadd")));
String u_id = Util.Uni2Ksc(Util.checkString(req.getParameter("u_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setAcpn_yy(acpn_yy);
dm.setAcpn_seq(acpn_seq);
dm.setSeiz_dduc_tms(seiz_dduc_tms);
dm.setProc_clsf(proc_clsf);
dm.setDduc_dt(dduc_dt);
dm.setSeiz_dduc_amt(seiz_dduc_amt);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setDept_cd(dept_cd);
dm.setU_ipadd(u_ipadd);
dm.setU_id(u_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 16 21:19:49 KST 2009 */