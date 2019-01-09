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


public class HD_SALY_4203_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String adv_clsf;
	public String adv_dt;
	public String dduc_seq;
	public String proc_clsf;
	public String dduc_dt;
	public String saly_yy;
	public String saly_no;
	public String dduc_amt;
	public String fix_yn;
	public String u_ipadd;
	public String u_id;

	public HD_SALY_4203_ADM(){}
	public HD_SALY_4203_ADM(String mode, String cmpy_cd, String emp_no, String adv_clsf, String adv_dt, String dduc_seq, String proc_clsf, String dduc_dt, String saly_yy, String saly_no, String dduc_amt, String fix_yn, String u_ipadd, String u_id){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.adv_clsf = adv_clsf;
		this.adv_dt = adv_dt;
		this.dduc_seq = dduc_seq;
		this.proc_clsf = proc_clsf;
		this.dduc_dt = dduc_dt;
		this.saly_yy = saly_yy;
		this.saly_no = saly_no;
		this.dduc_amt = dduc_amt;
		this.fix_yn = fix_yn;
		this.u_ipadd = u_ipadd;
		this.u_id = u_id;
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

	public void setAdv_clsf(String adv_clsf){
		this.adv_clsf = adv_clsf;
	}

	public void setAdv_dt(String adv_dt){
		this.adv_dt = adv_dt;
	}

	public void setDduc_seq(String dduc_seq){
		this.dduc_seq = dduc_seq;
	}

	public void setProc_clsf(String proc_clsf){
		this.proc_clsf = proc_clsf;
	}

	public void setDduc_dt(String dduc_dt){
		this.dduc_dt = dduc_dt;
	}

	public void setSaly_yy(String saly_yy){
		this.saly_yy = saly_yy;
	}

	public void setSaly_no(String saly_no){
		this.saly_no = saly_no;
	}

	public void setDduc_amt(String dduc_amt){
		this.dduc_amt = dduc_amt;
	}

	public void setFix_yn(String fix_yn){
		this.fix_yn = fix_yn;
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

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getAdv_clsf(){
		return this.adv_clsf;
	}

	public String getAdv_dt(){
		return this.adv_dt;
	}

	public String getDduc_seq(){
		return this.dduc_seq;
	}

	public String getProc_clsf(){
		return this.proc_clsf;
	}

	public String getDduc_dt(){
		return this.dduc_dt;
	}

	public String getSaly_yy(){
		return this.saly_yy;
	}

	public String getSaly_no(){
		return this.saly_no;
	}

	public String getDduc_amt(){
		return this.dduc_amt;
	}

	public String getFix_yn(){
		return this.fix_yn;
	}

	public String getU_ipadd(){
		return this.u_ipadd;
	}

	public String getU_id(){
		return this.u_id;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_4203_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_4203_ADM dm = (HD_SALY_4203_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.adv_clsf);
		cstmt.setString(7, dm.adv_dt);
		cstmt.setString(8, dm.dduc_seq);
		cstmt.setString(9, dm.proc_clsf);
		cstmt.setString(10, dm.dduc_dt);
		cstmt.setString(11, dm.saly_yy);
		cstmt.setString(12, dm.saly_no);
		cstmt.setString(13, dm.dduc_amt);
		cstmt.setString(14, dm.fix_yn);
		cstmt.setString(15, dm.u_ipadd);
		cstmt.setString(16, dm.u_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.saly.ds.HD_SALY_4203_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("adv_clsf = [" + getAdv_clsf() + "]");
		System.out.println("adv_dt = [" + getAdv_dt() + "]");
		System.out.println("dduc_seq = [" + getDduc_seq() + "]");
		System.out.println("proc_clsf = [" + getProc_clsf() + "]");
		System.out.println("dduc_dt = [" + getDduc_dt() + "]");
		System.out.println("saly_yy = [" + getSaly_yy() + "]");
		System.out.println("saly_no = [" + getSaly_no() + "]");
		System.out.println("dduc_amt = [" + getDduc_amt() + "]");
		System.out.println("fix_yn = [" + getFix_yn() + "]");
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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String adv_clsf = req.getParameter("adv_clsf");
if( adv_clsf == null){
	System.out.println(this.toString+" : adv_clsf is null" );
}else{
	System.out.println(this.toString+" : adv_clsf is "+adv_clsf );
}
String adv_dt = req.getParameter("adv_dt");
if( adv_dt == null){
	System.out.println(this.toString+" : adv_dt is null" );
}else{
	System.out.println(this.toString+" : adv_dt is "+adv_dt );
}
String dduc_seq = req.getParameter("dduc_seq");
if( dduc_seq == null){
	System.out.println(this.toString+" : dduc_seq is null" );
}else{
	System.out.println(this.toString+" : dduc_seq is "+dduc_seq );
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
String saly_yy = req.getParameter("saly_yy");
if( saly_yy == null){
	System.out.println(this.toString+" : saly_yy is null" );
}else{
	System.out.println(this.toString+" : saly_yy is "+saly_yy );
}
String saly_no = req.getParameter("saly_no");
if( saly_no == null){
	System.out.println(this.toString+" : saly_no is null" );
}else{
	System.out.println(this.toString+" : saly_no is "+saly_no );
}
String dduc_amt = req.getParameter("dduc_amt");
if( dduc_amt == null){
	System.out.println(this.toString+" : dduc_amt is null" );
}else{
	System.out.println(this.toString+" : dduc_amt is "+dduc_amt );
}
String fix_yn = req.getParameter("fix_yn");
if( fix_yn == null){
	System.out.println(this.toString+" : fix_yn is null" );
}else{
	System.out.println(this.toString+" : fix_yn is "+fix_yn );
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
String emp_no = Util.checkString(req.getParameter("emp_no"));
String adv_clsf = Util.checkString(req.getParameter("adv_clsf"));
String adv_dt = Util.checkString(req.getParameter("adv_dt"));
String dduc_seq = Util.checkString(req.getParameter("dduc_seq"));
String proc_clsf = Util.checkString(req.getParameter("proc_clsf"));
String dduc_dt = Util.checkString(req.getParameter("dduc_dt"));
String saly_yy = Util.checkString(req.getParameter("saly_yy"));
String saly_no = Util.checkString(req.getParameter("saly_no"));
String dduc_amt = Util.checkString(req.getParameter("dduc_amt"));
String fix_yn = Util.checkString(req.getParameter("fix_yn"));
String u_ipadd = Util.checkString(req.getParameter("u_ipadd"));
String u_id = Util.checkString(req.getParameter("u_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String adv_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("adv_clsf")));
String adv_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("adv_dt")));
String dduc_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("dduc_seq")));
String proc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_clsf")));
String dduc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("dduc_dt")));
String saly_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_yy")));
String saly_no = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_no")));
String dduc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("dduc_amt")));
String fix_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("fix_yn")));
String u_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("u_ipadd")));
String u_id = Util.Uni2Ksc(Util.checkString(req.getParameter("u_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setAdv_clsf(adv_clsf);
dm.setAdv_dt(adv_dt);
dm.setDduc_seq(dduc_seq);
dm.setProc_clsf(proc_clsf);
dm.setDduc_dt(dduc_dt);
dm.setSaly_yy(saly_yy);
dm.setSaly_no(saly_no);
dm.setDduc_amt(dduc_amt);
dm.setFix_yn(fix_yn);
dm.setU_ipadd(u_ipadd);
dm.setU_id(u_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 22 09:23:56 KST 2009 */