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


public class HD_VACA_1703_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String chk;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String dept_cd;
	public String vaca_clsf;
	public String vaca_dtls_clsf;
	public String vaca_frdt;
	public String vaca_todt;
	public String vaca_dds;
	public String alvc_use_dt;
	public String remk;
	public String emp_no_tm;
	public String u_ipadd;
	public String u_id;

	public HD_VACA_1703_ADM(){}
	public HD_VACA_1703_ADM(String mode, String cmpy_cd, String chk, String emp_no, String occr_dt, String seq, String dept_cd, String vaca_clsf, String vaca_dtls_clsf, String vaca_frdt, String vaca_todt, String vaca_dds, String alvc_use_dt, String remk, String emp_no_tm, String u_ipadd, String u_id){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.chk = chk;
		this.emp_no = emp_no;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.dept_cd = dept_cd;
		this.vaca_clsf = vaca_clsf;
		this.vaca_dtls_clsf = vaca_dtls_clsf;
		this.vaca_frdt = vaca_frdt;
		this.vaca_todt = vaca_todt;
		this.vaca_dds = vaca_dds;
		this.alvc_use_dt = alvc_use_dt;
		this.remk = remk;
		this.emp_no_tm = emp_no_tm;
		this.u_ipadd = u_ipadd;
		this.u_id = u_id;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setChk(String chk){
		this.chk = chk;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setVaca_clsf(String vaca_clsf){
		this.vaca_clsf = vaca_clsf;
	}

	public void setVaca_dtls_clsf(String vaca_dtls_clsf){
		this.vaca_dtls_clsf = vaca_dtls_clsf;
	}

	public void setVaca_frdt(String vaca_frdt){
		this.vaca_frdt = vaca_frdt;
	}

	public void setVaca_todt(String vaca_todt){
		this.vaca_todt = vaca_todt;
	}

	public void setVaca_dds(String vaca_dds){
		this.vaca_dds = vaca_dds;
	}

	public void setAlvc_use_dt(String alvc_use_dt){
		this.alvc_use_dt = alvc_use_dt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setEmp_no_tm(String emp_no_tm){
		this.emp_no_tm = emp_no_tm;
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

	public String getChk(){
		return this.chk;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getVaca_clsf(){
		return this.vaca_clsf;
	}

	public String getVaca_dtls_clsf(){
		return this.vaca_dtls_clsf;
	}

	public String getVaca_frdt(){
		return this.vaca_frdt;
	}

	public String getVaca_todt(){
		return this.vaca_todt;
	}

	public String getVaca_dds(){
		return this.vaca_dds;
	}

	public String getAlvc_use_dt(){
		return this.alvc_use_dt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getEmp_no_tm(){
		return this.emp_no_tm;
	}

	public String getU_ipadd(){
		return this.u_ipadd;
	}

	public String getU_id(){
		return this.u_id;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_VACA_1703_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_VACA_1703_ADM dm = (HD_VACA_1703_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.chk);
		cstmt.setString(6, dm.emp_no);
		cstmt.setString(7, dm.occr_dt);
		cstmt.setString(8, dm.seq);
		cstmt.setString(9, dm.dept_cd);
		cstmt.setString(10, dm.vaca_clsf);
		cstmt.setString(11, dm.vaca_dtls_clsf);
		cstmt.setString(12, dm.vaca_frdt);
		cstmt.setString(13, dm.vaca_todt);
		cstmt.setString(14, dm.vaca_dds);
		cstmt.setString(15, dm.alvc_use_dt);
		cstmt.setString(16, dm.remk);
		cstmt.setString(17, dm.emp_no_tm);
		cstmt.setString(18, dm.u_ipadd);
		cstmt.setString(19, dm.u_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.vaca.ds.HD_VACA_1703_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("chk = [" + getChk() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("vaca_clsf = [" + getVaca_clsf() + "]");
		System.out.println("vaca_dtls_clsf = [" + getVaca_dtls_clsf() + "]");
		System.out.println("vaca_frdt = [" + getVaca_frdt() + "]");
		System.out.println("vaca_todt = [" + getVaca_todt() + "]");
		System.out.println("vaca_dds = [" + getVaca_dds() + "]");
		System.out.println("alvc_use_dt = [" + getAlvc_use_dt() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("emp_no_tm = [" + getEmp_no_tm() + "]");
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
String chk = req.getParameter("chk");
if( chk == null){
	System.out.println(this.toString+" : chk is null" );
}else{
	System.out.println(this.toString+" : chk is "+chk );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String vaca_clsf = req.getParameter("vaca_clsf");
if( vaca_clsf == null){
	System.out.println(this.toString+" : vaca_clsf is null" );
}else{
	System.out.println(this.toString+" : vaca_clsf is "+vaca_clsf );
}
String vaca_dtls_clsf = req.getParameter("vaca_dtls_clsf");
if( vaca_dtls_clsf == null){
	System.out.println(this.toString+" : vaca_dtls_clsf is null" );
}else{
	System.out.println(this.toString+" : vaca_dtls_clsf is "+vaca_dtls_clsf );
}
String vaca_frdt = req.getParameter("vaca_frdt");
if( vaca_frdt == null){
	System.out.println(this.toString+" : vaca_frdt is null" );
}else{
	System.out.println(this.toString+" : vaca_frdt is "+vaca_frdt );
}
String vaca_todt = req.getParameter("vaca_todt");
if( vaca_todt == null){
	System.out.println(this.toString+" : vaca_todt is null" );
}else{
	System.out.println(this.toString+" : vaca_todt is "+vaca_todt );
}
String vaca_dds = req.getParameter("vaca_dds");
if( vaca_dds == null){
	System.out.println(this.toString+" : vaca_dds is null" );
}else{
	System.out.println(this.toString+" : vaca_dds is "+vaca_dds );
}
String alvc_use_dt = req.getParameter("alvc_use_dt");
if( alvc_use_dt == null){
	System.out.println(this.toString+" : alvc_use_dt is null" );
}else{
	System.out.println(this.toString+" : alvc_use_dt is "+alvc_use_dt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String emp_no_tm = req.getParameter("emp_no_tm");
if( emp_no_tm == null){
	System.out.println(this.toString+" : emp_no_tm is null" );
}else{
	System.out.println(this.toString+" : emp_no_tm is "+emp_no_tm );
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
String chk = Util.checkString(req.getParameter("chk"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String vaca_clsf = Util.checkString(req.getParameter("vaca_clsf"));
String vaca_dtls_clsf = Util.checkString(req.getParameter("vaca_dtls_clsf"));
String vaca_frdt = Util.checkString(req.getParameter("vaca_frdt"));
String vaca_todt = Util.checkString(req.getParameter("vaca_todt"));
String vaca_dds = Util.checkString(req.getParameter("vaca_dds"));
String alvc_use_dt = Util.checkString(req.getParameter("alvc_use_dt"));
String remk = Util.checkString(req.getParameter("remk"));
String emp_no_tm = Util.checkString(req.getParameter("emp_no_tm"));
String u_ipadd = Util.checkString(req.getParameter("u_ipadd"));
String u_id = Util.checkString(req.getParameter("u_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String chk = Util.Uni2Ksc(Util.checkString(req.getParameter("chk")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String vaca_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_clsf")));
String vaca_dtls_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_dtls_clsf")));
String vaca_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_frdt")));
String vaca_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_todt")));
String vaca_dds = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_dds")));
String alvc_use_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("alvc_use_dt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String emp_no_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no_tm")));
String u_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("u_ipadd")));
String u_id = Util.Uni2Ksc(Util.checkString(req.getParameter("u_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setChk(chk);
dm.setEmp_no(emp_no);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setDept_cd(dept_cd);
dm.setVaca_clsf(vaca_clsf);
dm.setVaca_dtls_clsf(vaca_dtls_clsf);
dm.setVaca_frdt(vaca_frdt);
dm.setVaca_todt(vaca_todt);
dm.setVaca_dds(vaca_dds);
dm.setAlvc_use_dt(alvc_use_dt);
dm.setRemk(remk);
dm.setEmp_no_tm(emp_no_tm);
dm.setU_ipadd(u_ipadd);
dm.setU_id(u_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 31 11:13:32 KST 2009 */