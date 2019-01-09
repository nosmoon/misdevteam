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


package chosun.ciis.hd.info.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.ds.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_5232_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String qulf_pems_seq;
	public String qulf_pems_cd;
	public String qulf_no;
	public String qulf_pems_nm;
	public String qulf_pems_issu_plac_cd;
	public String qulf_pems_issu_plac_nm;
	public String acqr_dt;
	public String mtry_dt;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String proc_stat;
	public String proc_stat_req;
	public String gubun;

	public HD_INFO_5232_ADM(){}
	public HD_INFO_5232_ADM(String mode, String cmpy_cd, String emp_no, String occr_dt, String seq, String qulf_pems_seq, String qulf_pems_cd, String qulf_no, String qulf_pems_nm, String qulf_pems_issu_plac_cd, String qulf_pems_issu_plac_nm, String acqr_dt, String mtry_dt, String incmg_pers_ipadd, String incmg_pers, String proc_stat, String proc_stat_req, String gubun){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.qulf_pems_seq = qulf_pems_seq;
		this.qulf_pems_cd = qulf_pems_cd;
		this.qulf_no = qulf_no;
		this.qulf_pems_nm = qulf_pems_nm;
		this.qulf_pems_issu_plac_cd = qulf_pems_issu_plac_cd;
		this.qulf_pems_issu_plac_nm = qulf_pems_issu_plac_nm;
		this.acqr_dt = acqr_dt;
		this.mtry_dt = mtry_dt;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.proc_stat = proc_stat;
		this.proc_stat_req = proc_stat_req;
		this.gubun = gubun;
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

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setQulf_pems_seq(String qulf_pems_seq){
		this.qulf_pems_seq = qulf_pems_seq;
	}

	public void setQulf_pems_cd(String qulf_pems_cd){
		this.qulf_pems_cd = qulf_pems_cd;
	}

	public void setQulf_no(String qulf_no){
		this.qulf_no = qulf_no;
	}

	public void setQulf_pems_nm(String qulf_pems_nm){
		this.qulf_pems_nm = qulf_pems_nm;
	}

	public void setQulf_pems_issu_plac_cd(String qulf_pems_issu_plac_cd){
		this.qulf_pems_issu_plac_cd = qulf_pems_issu_plac_cd;
	}

	public void setQulf_pems_issu_plac_nm(String qulf_pems_issu_plac_nm){
		this.qulf_pems_issu_plac_nm = qulf_pems_issu_plac_nm;
	}

	public void setAcqr_dt(String acqr_dt){
		this.acqr_dt = acqr_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setProc_stat_req(String proc_stat_req){
		this.proc_stat_req = proc_stat_req;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
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

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getQulf_pems_seq(){
		return this.qulf_pems_seq;
	}

	public String getQulf_pems_cd(){
		return this.qulf_pems_cd;
	}

	public String getQulf_no(){
		return this.qulf_no;
	}

	public String getQulf_pems_nm(){
		return this.qulf_pems_nm;
	}

	public String getQulf_pems_issu_plac_cd(){
		return this.qulf_pems_issu_plac_cd;
	}

	public String getQulf_pems_issu_plac_nm(){
		return this.qulf_pems_issu_plac_nm;
	}

	public String getAcqr_dt(){
		return this.acqr_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getProc_stat_req(){
		return this.proc_stat_req;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_5232_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_5232_ADM dm = (HD_INFO_5232_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.occr_dt);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.qulf_pems_seq);
		cstmt.setString(9, dm.qulf_pems_cd);
		cstmt.setString(10, dm.qulf_no);
		cstmt.setString(11, dm.qulf_pems_nm);
		cstmt.setString(12, dm.qulf_pems_issu_plac_cd);
		cstmt.setString(13, dm.qulf_pems_issu_plac_nm);
		cstmt.setString(14, dm.acqr_dt);
		cstmt.setString(15, dm.mtry_dt);
		cstmt.setString(16, dm.incmg_pers_ipadd);
		cstmt.setString(17, dm.incmg_pers);
		cstmt.setString(18, dm.proc_stat);
		cstmt.setString(19, dm.proc_stat_req);
		cstmt.setString(20, dm.gubun);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.info.ds.HD_INFO_5232_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("qulf_pems_seq = [" + getQulf_pems_seq() + "]");
		System.out.println("qulf_pems_cd = [" + getQulf_pems_cd() + "]");
		System.out.println("qulf_no = [" + getQulf_no() + "]");
		System.out.println("qulf_pems_nm = [" + getQulf_pems_nm() + "]");
		System.out.println("qulf_pems_issu_plac_cd = [" + getQulf_pems_issu_plac_cd() + "]");
		System.out.println("qulf_pems_issu_plac_nm = [" + getQulf_pems_issu_plac_nm() + "]");
		System.out.println("acqr_dt = [" + getAcqr_dt() + "]");
		System.out.println("mtry_dt = [" + getMtry_dt() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
		System.out.println("proc_stat_req = [" + getProc_stat_req() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
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
String qulf_pems_seq = req.getParameter("qulf_pems_seq");
if( qulf_pems_seq == null){
	System.out.println(this.toString+" : qulf_pems_seq is null" );
}else{
	System.out.println(this.toString+" : qulf_pems_seq is "+qulf_pems_seq );
}
String qulf_pems_cd = req.getParameter("qulf_pems_cd");
if( qulf_pems_cd == null){
	System.out.println(this.toString+" : qulf_pems_cd is null" );
}else{
	System.out.println(this.toString+" : qulf_pems_cd is "+qulf_pems_cd );
}
String qulf_no = req.getParameter("qulf_no");
if( qulf_no == null){
	System.out.println(this.toString+" : qulf_no is null" );
}else{
	System.out.println(this.toString+" : qulf_no is "+qulf_no );
}
String qulf_pems_nm = req.getParameter("qulf_pems_nm");
if( qulf_pems_nm == null){
	System.out.println(this.toString+" : qulf_pems_nm is null" );
}else{
	System.out.println(this.toString+" : qulf_pems_nm is "+qulf_pems_nm );
}
String qulf_pems_issu_plac_cd = req.getParameter("qulf_pems_issu_plac_cd");
if( qulf_pems_issu_plac_cd == null){
	System.out.println(this.toString+" : qulf_pems_issu_plac_cd is null" );
}else{
	System.out.println(this.toString+" : qulf_pems_issu_plac_cd is "+qulf_pems_issu_plac_cd );
}
String qulf_pems_issu_plac_nm = req.getParameter("qulf_pems_issu_plac_nm");
if( qulf_pems_issu_plac_nm == null){
	System.out.println(this.toString+" : qulf_pems_issu_plac_nm is null" );
}else{
	System.out.println(this.toString+" : qulf_pems_issu_plac_nm is "+qulf_pems_issu_plac_nm );
}
String acqr_dt = req.getParameter("acqr_dt");
if( acqr_dt == null){
	System.out.println(this.toString+" : acqr_dt is null" );
}else{
	System.out.println(this.toString+" : acqr_dt is "+acqr_dt );
}
String mtry_dt = req.getParameter("mtry_dt");
if( mtry_dt == null){
	System.out.println(this.toString+" : mtry_dt is null" );
}else{
	System.out.println(this.toString+" : mtry_dt is "+mtry_dt );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String proc_stat = req.getParameter("proc_stat");
if( proc_stat == null){
	System.out.println(this.toString+" : proc_stat is null" );
}else{
	System.out.println(this.toString+" : proc_stat is "+proc_stat );
}
String proc_stat_req = req.getParameter("proc_stat_req");
if( proc_stat_req == null){
	System.out.println(this.toString+" : proc_stat_req is null" );
}else{
	System.out.println(this.toString+" : proc_stat_req is "+proc_stat_req );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String qulf_pems_seq = Util.checkString(req.getParameter("qulf_pems_seq"));
String qulf_pems_cd = Util.checkString(req.getParameter("qulf_pems_cd"));
String qulf_no = Util.checkString(req.getParameter("qulf_no"));
String qulf_pems_nm = Util.checkString(req.getParameter("qulf_pems_nm"));
String qulf_pems_issu_plac_cd = Util.checkString(req.getParameter("qulf_pems_issu_plac_cd"));
String qulf_pems_issu_plac_nm = Util.checkString(req.getParameter("qulf_pems_issu_plac_nm"));
String acqr_dt = Util.checkString(req.getParameter("acqr_dt"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String proc_stat = Util.checkString(req.getParameter("proc_stat"));
String proc_stat_req = Util.checkString(req.getParameter("proc_stat_req"));
String gubun = Util.checkString(req.getParameter("gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String qulf_pems_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("qulf_pems_seq")));
String qulf_pems_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("qulf_pems_cd")));
String qulf_no = Util.Uni2Ksc(Util.checkString(req.getParameter("qulf_no")));
String qulf_pems_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("qulf_pems_nm")));
String qulf_pems_issu_plac_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("qulf_pems_issu_plac_cd")));
String qulf_pems_issu_plac_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("qulf_pems_issu_plac_nm")));
String acqr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("acqr_dt")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat")));
String proc_stat_req = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat_req")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setQulf_pems_seq(qulf_pems_seq);
dm.setQulf_pems_cd(qulf_pems_cd);
dm.setQulf_no(qulf_no);
dm.setQulf_pems_nm(qulf_pems_nm);
dm.setQulf_pems_issu_plac_cd(qulf_pems_issu_plac_cd);
dm.setQulf_pems_issu_plac_nm(qulf_pems_issu_plac_nm);
dm.setAcqr_dt(acqr_dt);
dm.setMtry_dt(mtry_dt);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setProc_stat(proc_stat);
dm.setProc_stat_req(proc_stat_req);
dm.setGubun(gubun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 14 21:08:21 KST 2009 */