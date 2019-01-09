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


package chosun.ciis.hd.job.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.job.ds.*;
import chosun.ciis.hd.job.rec.*;

/**
 * 
 */


public class HD_JOB_1103_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String frdt;
	public String todt;
	public String part_cd;
	public String cmpy_posk_cd;
	public String chrg_job;
	public String dtls_job;
	public String aprv_stat;
	public String occr_dt;
	public String seq;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String dtls_cd1_1;
	public String dtls_cd1_2;
	public String dtls_cd2_1;
	public String dtls_cd2_2;

	public HD_JOB_1103_ADM(){}
	public HD_JOB_1103_ADM(String mode, String cmpy_cd, String emp_no, String frdt, String todt, String part_cd, String cmpy_posk_cd, String chrg_job, String dtls_job, String aprv_stat, String occr_dt, String seq, String incmg_pers, String incmg_pers_ipadd, String dtls_cd1_1, String dtls_cd1_2, String dtls_cd2_1, String dtls_cd2_2){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.frdt = frdt;
		this.todt = todt;
		this.part_cd = part_cd;
		this.cmpy_posk_cd = cmpy_posk_cd;
		this.chrg_job = chrg_job;
		this.dtls_job = dtls_job;
		this.aprv_stat = aprv_stat;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.dtls_cd1_1 = dtls_cd1_1;
		this.dtls_cd1_2 = dtls_cd1_2;
		this.dtls_cd2_1 = dtls_cd2_1;
		this.dtls_cd2_2 = dtls_cd2_2;
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

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setCmpy_posk_cd(String cmpy_posk_cd){
		this.cmpy_posk_cd = cmpy_posk_cd;
	}

	public void setChrg_job(String chrg_job){
		this.chrg_job = chrg_job;
	}

	public void setDtls_job(String dtls_job){
		this.dtls_job = dtls_job;
	}

	public void setAprv_stat(String aprv_stat){
		this.aprv_stat = aprv_stat;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setDtls_cd1_1(String dtls_cd1_1){
		this.dtls_cd1_1 = dtls_cd1_1;
	}

	public void setDtls_cd1_2(String dtls_cd1_2){
		this.dtls_cd1_2 = dtls_cd1_2;
	}

	public void setDtls_cd2_1(String dtls_cd2_1){
		this.dtls_cd2_1 = dtls_cd2_1;
	}

	public void setDtls_cd2_2(String dtls_cd2_2){
		this.dtls_cd2_2 = dtls_cd2_2;
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

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getPart_cd(){
		return this.part_cd;
	}

	public String getCmpy_posk_cd(){
		return this.cmpy_posk_cd;
	}

	public String getChrg_job(){
		return this.chrg_job;
	}

	public String getDtls_job(){
		return this.dtls_job;
	}

	public String getAprv_stat(){
		return this.aprv_stat;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getDtls_cd1_1(){
		return this.dtls_cd1_1;
	}

	public String getDtls_cd1_2(){
		return this.dtls_cd1_2;
	}

	public String getDtls_cd2_1(){
		return this.dtls_cd2_1;
	}

	public String getDtls_cd2_2(){
		return this.dtls_cd2_2;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_JOB_1103_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_JOB_1103_ADM dm = (HD_JOB_1103_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.frdt);
		cstmt.setString(7, dm.todt);
		cstmt.setString(8, dm.part_cd);
		cstmt.setString(9, dm.cmpy_posk_cd);
		cstmt.setString(10, dm.chrg_job);
		cstmt.setString(11, dm.dtls_job);
		cstmt.setString(12, dm.aprv_stat);
		cstmt.setString(13, dm.occr_dt);
		cstmt.setString(14, dm.seq);
		cstmt.setString(15, dm.incmg_pers);
		cstmt.setString(16, dm.incmg_pers_ipadd);
		cstmt.setString(17, dm.dtls_cd1_1);
		cstmt.setString(18, dm.dtls_cd1_2);
		cstmt.setString(19, dm.dtls_cd2_1);
		cstmt.setString(20, dm.dtls_cd2_2);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.job.ds.HD_JOB_1103_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("part_cd = [" + getPart_cd() + "]");
		System.out.println("cmpy_posk_cd = [" + getCmpy_posk_cd() + "]");
		System.out.println("chrg_job = [" + getChrg_job() + "]");
		System.out.println("dtls_job = [" + getDtls_job() + "]");
		System.out.println("aprv_stat = [" + getAprv_stat() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("dtls_cd1_1 = [" + getDtls_cd1_1() + "]");
		System.out.println("dtls_cd1_2 = [" + getDtls_cd1_2() + "]");
		System.out.println("dtls_cd2_1 = [" + getDtls_cd2_1() + "]");
		System.out.println("dtls_cd2_2 = [" + getDtls_cd2_2() + "]");
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
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String part_cd = req.getParameter("part_cd");
if( part_cd == null){
	System.out.println(this.toString+" : part_cd is null" );
}else{
	System.out.println(this.toString+" : part_cd is "+part_cd );
}
String cmpy_posk_cd = req.getParameter("cmpy_posk_cd");
if( cmpy_posk_cd == null){
	System.out.println(this.toString+" : cmpy_posk_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_posk_cd is "+cmpy_posk_cd );
}
String chrg_job = req.getParameter("chrg_job");
if( chrg_job == null){
	System.out.println(this.toString+" : chrg_job is null" );
}else{
	System.out.println(this.toString+" : chrg_job is "+chrg_job );
}
String dtls_job = req.getParameter("dtls_job");
if( dtls_job == null){
	System.out.println(this.toString+" : dtls_job is null" );
}else{
	System.out.println(this.toString+" : dtls_job is "+dtls_job );
}
String aprv_stat = req.getParameter("aprv_stat");
if( aprv_stat == null){
	System.out.println(this.toString+" : aprv_stat is null" );
}else{
	System.out.println(this.toString+" : aprv_stat is "+aprv_stat );
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
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String dtls_cd1_1 = req.getParameter("dtls_cd1_1");
if( dtls_cd1_1 == null){
	System.out.println(this.toString+" : dtls_cd1_1 is null" );
}else{
	System.out.println(this.toString+" : dtls_cd1_1 is "+dtls_cd1_1 );
}
String dtls_cd1_2 = req.getParameter("dtls_cd1_2");
if( dtls_cd1_2 == null){
	System.out.println(this.toString+" : dtls_cd1_2 is null" );
}else{
	System.out.println(this.toString+" : dtls_cd1_2 is "+dtls_cd1_2 );
}
String dtls_cd2_1 = req.getParameter("dtls_cd2_1");
if( dtls_cd2_1 == null){
	System.out.println(this.toString+" : dtls_cd2_1 is null" );
}else{
	System.out.println(this.toString+" : dtls_cd2_1 is "+dtls_cd2_1 );
}
String dtls_cd2_2 = req.getParameter("dtls_cd2_2");
if( dtls_cd2_2 == null){
	System.out.println(this.toString+" : dtls_cd2_2 is null" );
}else{
	System.out.println(this.toString+" : dtls_cd2_2 is "+dtls_cd2_2 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String part_cd = Util.checkString(req.getParameter("part_cd"));
String cmpy_posk_cd = Util.checkString(req.getParameter("cmpy_posk_cd"));
String chrg_job = Util.checkString(req.getParameter("chrg_job"));
String dtls_job = Util.checkString(req.getParameter("dtls_job"));
String aprv_stat = Util.checkString(req.getParameter("aprv_stat"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String dtls_cd1_1 = Util.checkString(req.getParameter("dtls_cd1_1"));
String dtls_cd1_2 = Util.checkString(req.getParameter("dtls_cd1_2"));
String dtls_cd2_1 = Util.checkString(req.getParameter("dtls_cd2_1"));
String dtls_cd2_2 = Util.checkString(req.getParameter("dtls_cd2_2"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String part_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("part_cd")));
String cmpy_posk_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_posk_cd")));
String chrg_job = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_job")));
String dtls_job = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_job")));
String aprv_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("aprv_stat")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String dtls_cd1_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_cd1_1")));
String dtls_cd1_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_cd1_2")));
String dtls_cd2_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_cd2_1")));
String dtls_cd2_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_cd2_2")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setPart_cd(part_cd);
dm.setCmpy_posk_cd(cmpy_posk_cd);
dm.setChrg_job(chrg_job);
dm.setDtls_job(dtls_job);
dm.setAprv_stat(aprv_stat);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setDtls_cd1_1(dtls_cd1_1);
dm.setDtls_cd1_2(dtls_cd1_2);
dm.setDtls_cd2_1(dtls_cd2_1);
dm.setDtls_cd2_2(dtls_cd2_2);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 04 11:07:07 KST 2018 */