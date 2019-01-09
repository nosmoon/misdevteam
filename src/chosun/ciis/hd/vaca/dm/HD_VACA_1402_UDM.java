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


public class HD_VACA_1402_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String proc_stat;
	public String aply_yy;
	public String qq_clsf;
	public String incmg_pers_ipadd;
	public String ss_emp_no;
	public String emp_no_tm;
	public String ep_seq;

	public HD_VACA_1402_UDM(){}
	public HD_VACA_1402_UDM(String mode, String cmpy_cd, String emp_no, String proc_stat, String aply_yy, String qq_clsf, String incmg_pers_ipadd, String ss_emp_no, String emp_no_tm, String ep_seq){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.proc_stat = proc_stat;
		this.aply_yy = aply_yy;
		this.qq_clsf = qq_clsf;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.ss_emp_no = ss_emp_no;
		this.emp_no_tm = emp_no_tm;
		this.ep_seq = ep_seq;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setAply_yy(String aply_yy){
		this.aply_yy = aply_yy;
	}

	public void setQq_clsf(String qq_clsf){
		this.qq_clsf = qq_clsf;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setSs_emp_no(String ss_emp_no){
		this.ss_emp_no = ss_emp_no;
	}

	public void setEmp_no_tm(String emp_no_tm){
		this.emp_no_tm = emp_no_tm;
	}

	public void setEp_seq(String ep_seq){
		this.ep_seq = ep_seq;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getAply_yy(){
		return this.aply_yy;
	}

	public String getQq_clsf(){
		return this.qq_clsf;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSs_emp_no(){
		return this.ss_emp_no;
	}

	public String getEmp_no_tm(){
		return this.emp_no_tm;
	}

	public String getEp_seq(){
		return this.ep_seq;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_VACA_1402_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_VACA_1402_UDM dm = (HD_VACA_1402_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.proc_stat);
		cstmt.setString(7, dm.aply_yy);
		cstmt.setString(8, dm.qq_clsf);
		cstmt.setString(9, dm.incmg_pers_ipadd);
		cstmt.setString(10, dm.ss_emp_no);
		cstmt.setString(11, dm.emp_no_tm);
		cstmt.setString(12, dm.ep_seq);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.vaca.ds.HD_VACA_1402_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
		System.out.println("aply_yy = [" + getAply_yy() + "]");
		System.out.println("qq_clsf = [" + getQq_clsf() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("ss_emp_no = [" + getSs_emp_no() + "]");
		System.out.println("emp_no_tm = [" + getEmp_no_tm() + "]");
		System.out.println("ep_seq = [" + getEp_seq() + "]");
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
String aply_yy = req.getParameter("aply_yy");
if( aply_yy == null){
	System.out.println(this.toString+" : aply_yy is null" );
}else{
	System.out.println(this.toString+" : aply_yy is "+aply_yy );
}
String qq_clsf = req.getParameter("qq_clsf");
if( qq_clsf == null){
	System.out.println(this.toString+" : qq_clsf is null" );
}else{
	System.out.println(this.toString+" : qq_clsf is "+qq_clsf );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String ss_emp_no = req.getParameter("ss_emp_no");
if( ss_emp_no == null){
	System.out.println(this.toString+" : ss_emp_no is null" );
}else{
	System.out.println(this.toString+" : ss_emp_no is "+ss_emp_no );
}
String emp_no_tm = req.getParameter("emp_no_tm");
if( emp_no_tm == null){
	System.out.println(this.toString+" : emp_no_tm is null" );
}else{
	System.out.println(this.toString+" : emp_no_tm is "+emp_no_tm );
}
String ep_seq = req.getParameter("ep_seq");
if( ep_seq == null){
	System.out.println(this.toString+" : ep_seq is null" );
}else{
	System.out.println(this.toString+" : ep_seq is "+ep_seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String proc_stat = Util.checkString(req.getParameter("proc_stat"));
String aply_yy = Util.checkString(req.getParameter("aply_yy"));
String qq_clsf = Util.checkString(req.getParameter("qq_clsf"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String ss_emp_no = Util.checkString(req.getParameter("ss_emp_no"));
String emp_no_tm = Util.checkString(req.getParameter("emp_no_tm"));
String ep_seq = Util.checkString(req.getParameter("ep_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat")));
String aply_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_yy")));
String qq_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("qq_clsf")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String ss_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ss_emp_no")));
String emp_no_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no_tm")));
String ep_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("ep_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setProc_stat(proc_stat);
dm.setAply_yy(aply_yy);
dm.setQq_clsf(qq_clsf);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setSs_emp_no(ss_emp_no);
dm.setEmp_no_tm(emp_no_tm);
dm.setEp_seq(ep_seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Nov 19 14:49:39 KST 2009 */