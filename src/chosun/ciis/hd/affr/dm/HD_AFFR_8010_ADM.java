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


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_8010_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String emp_no;
	public String flnm;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String seq;
	public String occr_dt;
	public String incmg_pers_ipadd;
	public String ss_emp_no;
	public String faml_seq;
	public String hospz_med_exam_pers_flnm;
	public String faml_rshp_cd;
	public String real_ward_fee;
	public String sply_ward_fee;
	public String real_hospz_med_exam_fee;
	public String sply_hospz_med_exam_fee;
	public String hospz_med_exam_frdt;
	public String hospz_med_exam_todt;
	public String hospz_med_exam_dds;
	public String disea_cont;
	public String hospz_med_exam_hosp_nm;
	public String emp_clsf;

	public HD_AFFR_8010_ADM(){}
	public HD_AFFR_8010_ADM(String cmpy_cd, String mode, String emp_no, String flnm, String dept_cd, String dty_cd, String posi_cd, String seq, String occr_dt, String incmg_pers_ipadd, String ss_emp_no, String faml_seq, String hospz_med_exam_pers_flnm, String faml_rshp_cd, String real_ward_fee, String sply_ward_fee, String real_hospz_med_exam_fee, String sply_hospz_med_exam_fee, String hospz_med_exam_frdt, String hospz_med_exam_todt, String hospz_med_exam_dds, String disea_cont, String hospz_med_exam_hosp_nm, String emp_clsf){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.dept_cd = dept_cd;
		this.dty_cd = dty_cd;
		this.posi_cd = posi_cd;
		this.seq = seq;
		this.occr_dt = occr_dt;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.ss_emp_no = ss_emp_no;
		this.faml_seq = faml_seq;
		this.hospz_med_exam_pers_flnm = hospz_med_exam_pers_flnm;
		this.faml_rshp_cd = faml_rshp_cd;
		this.real_ward_fee = real_ward_fee;
		this.sply_ward_fee = sply_ward_fee;
		this.real_hospz_med_exam_fee = real_hospz_med_exam_fee;
		this.sply_hospz_med_exam_fee = sply_hospz_med_exam_fee;
		this.hospz_med_exam_frdt = hospz_med_exam_frdt;
		this.hospz_med_exam_todt = hospz_med_exam_todt;
		this.hospz_med_exam_dds = hospz_med_exam_dds;
		this.disea_cont = disea_cont;
		this.hospz_med_exam_hosp_nm = hospz_med_exam_hosp_nm;
		this.emp_clsf = emp_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
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

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setSs_emp_no(String ss_emp_no){
		this.ss_emp_no = ss_emp_no;
	}

	public void setFaml_seq(String faml_seq){
		this.faml_seq = faml_seq;
	}

	public void setHospz_med_exam_pers_flnm(String hospz_med_exam_pers_flnm){
		this.hospz_med_exam_pers_flnm = hospz_med_exam_pers_flnm;
	}

	public void setFaml_rshp_cd(String faml_rshp_cd){
		this.faml_rshp_cd = faml_rshp_cd;
	}

	public void setReal_ward_fee(String real_ward_fee){
		this.real_ward_fee = real_ward_fee;
	}

	public void setSply_ward_fee(String sply_ward_fee){
		this.sply_ward_fee = sply_ward_fee;
	}

	public void setReal_hospz_med_exam_fee(String real_hospz_med_exam_fee){
		this.real_hospz_med_exam_fee = real_hospz_med_exam_fee;
	}

	public void setSply_hospz_med_exam_fee(String sply_hospz_med_exam_fee){
		this.sply_hospz_med_exam_fee = sply_hospz_med_exam_fee;
	}

	public void setHospz_med_exam_frdt(String hospz_med_exam_frdt){
		this.hospz_med_exam_frdt = hospz_med_exam_frdt;
	}

	public void setHospz_med_exam_todt(String hospz_med_exam_todt){
		this.hospz_med_exam_todt = hospz_med_exam_todt;
	}

	public void setHospz_med_exam_dds(String hospz_med_exam_dds){
		this.hospz_med_exam_dds = hospz_med_exam_dds;
	}

	public void setDisea_cont(String disea_cont){
		this.disea_cont = disea_cont;
	}

	public void setHospz_med_exam_hosp_nm(String hospz_med_exam_hosp_nm){
		this.hospz_med_exam_hosp_nm = hospz_med_exam_hosp_nm;
	}

	public void setEmp_clsf(String emp_clsf){
		this.emp_clsf = emp_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
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

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSs_emp_no(){
		return this.ss_emp_no;
	}

	public String getFaml_seq(){
		return this.faml_seq;
	}

	public String getHospz_med_exam_pers_flnm(){
		return this.hospz_med_exam_pers_flnm;
	}

	public String getFaml_rshp_cd(){
		return this.faml_rshp_cd;
	}

	public String getReal_ward_fee(){
		return this.real_ward_fee;
	}

	public String getSply_ward_fee(){
		return this.sply_ward_fee;
	}

	public String getReal_hospz_med_exam_fee(){
		return this.real_hospz_med_exam_fee;
	}

	public String getSply_hospz_med_exam_fee(){
		return this.sply_hospz_med_exam_fee;
	}

	public String getHospz_med_exam_frdt(){
		return this.hospz_med_exam_frdt;
	}

	public String getHospz_med_exam_todt(){
		return this.hospz_med_exam_todt;
	}

	public String getHospz_med_exam_dds(){
		return this.hospz_med_exam_dds;
	}

	public String getDisea_cont(){
		return this.disea_cont;
	}

	public String getHospz_med_exam_hosp_nm(){
		return this.hospz_med_exam_hosp_nm;
	}

	public String getEmp_clsf(){
		return this.emp_clsf;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_8010_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_8010_ADM dm = (HD_AFFR_8010_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.flnm);
		cstmt.setString(7, dm.dept_cd);
		cstmt.setString(8, dm.dty_cd);
		cstmt.setString(9, dm.posi_cd);
		cstmt.setString(10, dm.seq);
		cstmt.setString(11, dm.occr_dt);
		cstmt.setString(12, dm.incmg_pers_ipadd);
		cstmt.setString(13, dm.ss_emp_no);
		cstmt.setString(14, dm.faml_seq);
		cstmt.setString(15, dm.hospz_med_exam_pers_flnm);
		cstmt.setString(16, dm.faml_rshp_cd);
		cstmt.setString(17, dm.real_ward_fee);
		cstmt.setString(18, dm.sply_ward_fee);
		cstmt.setString(19, dm.real_hospz_med_exam_fee);
		cstmt.setString(20, dm.sply_hospz_med_exam_fee);
		cstmt.setString(21, dm.hospz_med_exam_frdt);
		cstmt.setString(22, dm.hospz_med_exam_todt);
		cstmt.setString(23, dm.hospz_med_exam_dds);
		cstmt.setString(24, dm.disea_cont);
		cstmt.setString(25, dm.hospz_med_exam_hosp_nm);
		cstmt.setString(26, dm.emp_clsf);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_8010_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("dty_cd = [" + getDty_cd() + "]");
		System.out.println("posi_cd = [" + getPosi_cd() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("ss_emp_no = [" + getSs_emp_no() + "]");
		System.out.println("faml_seq = [" + getFaml_seq() + "]");
		System.out.println("hospz_med_exam_pers_flnm = [" + getHospz_med_exam_pers_flnm() + "]");
		System.out.println("faml_rshp_cd = [" + getFaml_rshp_cd() + "]");
		System.out.println("real_ward_fee = [" + getReal_ward_fee() + "]");
		System.out.println("sply_ward_fee = [" + getSply_ward_fee() + "]");
		System.out.println("real_hospz_med_exam_fee = [" + getReal_hospz_med_exam_fee() + "]");
		System.out.println("sply_hospz_med_exam_fee = [" + getSply_hospz_med_exam_fee() + "]");
		System.out.println("hospz_med_exam_frdt = [" + getHospz_med_exam_frdt() + "]");
		System.out.println("hospz_med_exam_todt = [" + getHospz_med_exam_todt() + "]");
		System.out.println("hospz_med_exam_dds = [" + getHospz_med_exam_dds() + "]");
		System.out.println("disea_cont = [" + getDisea_cont() + "]");
		System.out.println("hospz_med_exam_hosp_nm = [" + getHospz_med_exam_hosp_nm() + "]");
		System.out.println("emp_clsf = [" + getEmp_clsf() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
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
String dty_cd = req.getParameter("dty_cd");
if( dty_cd == null){
	System.out.println(this.toString+" : dty_cd is null" );
}else{
	System.out.println(this.toString+" : dty_cd is "+dty_cd );
}
String posi_cd = req.getParameter("posi_cd");
if( posi_cd == null){
	System.out.println(this.toString+" : posi_cd is null" );
}else{
	System.out.println(this.toString+" : posi_cd is "+posi_cd );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
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
String faml_seq = req.getParameter("faml_seq");
if( faml_seq == null){
	System.out.println(this.toString+" : faml_seq is null" );
}else{
	System.out.println(this.toString+" : faml_seq is "+faml_seq );
}
String hospz_med_exam_pers_flnm = req.getParameter("hospz_med_exam_pers_flnm");
if( hospz_med_exam_pers_flnm == null){
	System.out.println(this.toString+" : hospz_med_exam_pers_flnm is null" );
}else{
	System.out.println(this.toString+" : hospz_med_exam_pers_flnm is "+hospz_med_exam_pers_flnm );
}
String faml_rshp_cd = req.getParameter("faml_rshp_cd");
if( faml_rshp_cd == null){
	System.out.println(this.toString+" : faml_rshp_cd is null" );
}else{
	System.out.println(this.toString+" : faml_rshp_cd is "+faml_rshp_cd );
}
String real_ward_fee = req.getParameter("real_ward_fee");
if( real_ward_fee == null){
	System.out.println(this.toString+" : real_ward_fee is null" );
}else{
	System.out.println(this.toString+" : real_ward_fee is "+real_ward_fee );
}
String sply_ward_fee = req.getParameter("sply_ward_fee");
if( sply_ward_fee == null){
	System.out.println(this.toString+" : sply_ward_fee is null" );
}else{
	System.out.println(this.toString+" : sply_ward_fee is "+sply_ward_fee );
}
String real_hospz_med_exam_fee = req.getParameter("real_hospz_med_exam_fee");
if( real_hospz_med_exam_fee == null){
	System.out.println(this.toString+" : real_hospz_med_exam_fee is null" );
}else{
	System.out.println(this.toString+" : real_hospz_med_exam_fee is "+real_hospz_med_exam_fee );
}
String sply_hospz_med_exam_fee = req.getParameter("sply_hospz_med_exam_fee");
if( sply_hospz_med_exam_fee == null){
	System.out.println(this.toString+" : sply_hospz_med_exam_fee is null" );
}else{
	System.out.println(this.toString+" : sply_hospz_med_exam_fee is "+sply_hospz_med_exam_fee );
}
String hospz_med_exam_frdt = req.getParameter("hospz_med_exam_frdt");
if( hospz_med_exam_frdt == null){
	System.out.println(this.toString+" : hospz_med_exam_frdt is null" );
}else{
	System.out.println(this.toString+" : hospz_med_exam_frdt is "+hospz_med_exam_frdt );
}
String hospz_med_exam_todt = req.getParameter("hospz_med_exam_todt");
if( hospz_med_exam_todt == null){
	System.out.println(this.toString+" : hospz_med_exam_todt is null" );
}else{
	System.out.println(this.toString+" : hospz_med_exam_todt is "+hospz_med_exam_todt );
}
String hospz_med_exam_dds = req.getParameter("hospz_med_exam_dds");
if( hospz_med_exam_dds == null){
	System.out.println(this.toString+" : hospz_med_exam_dds is null" );
}else{
	System.out.println(this.toString+" : hospz_med_exam_dds is "+hospz_med_exam_dds );
}
String disea_cont = req.getParameter("disea_cont");
if( disea_cont == null){
	System.out.println(this.toString+" : disea_cont is null" );
}else{
	System.out.println(this.toString+" : disea_cont is "+disea_cont );
}
String hospz_med_exam_hosp_nm = req.getParameter("hospz_med_exam_hosp_nm");
if( hospz_med_exam_hosp_nm == null){
	System.out.println(this.toString+" : hospz_med_exam_hosp_nm is null" );
}else{
	System.out.println(this.toString+" : hospz_med_exam_hosp_nm is "+hospz_med_exam_hosp_nm );
}
String emp_clsf = req.getParameter("emp_clsf");
if( emp_clsf == null){
	System.out.println(this.toString+" : emp_clsf is null" );
}else{
	System.out.println(this.toString+" : emp_clsf is "+emp_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dty_cd = Util.checkString(req.getParameter("dty_cd"));
String posi_cd = Util.checkString(req.getParameter("posi_cd"));
String seq = Util.checkString(req.getParameter("seq"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String ss_emp_no = Util.checkString(req.getParameter("ss_emp_no"));
String faml_seq = Util.checkString(req.getParameter("faml_seq"));
String hospz_med_exam_pers_flnm = Util.checkString(req.getParameter("hospz_med_exam_pers_flnm"));
String faml_rshp_cd = Util.checkString(req.getParameter("faml_rshp_cd"));
String real_ward_fee = Util.checkString(req.getParameter("real_ward_fee"));
String sply_ward_fee = Util.checkString(req.getParameter("sply_ward_fee"));
String real_hospz_med_exam_fee = Util.checkString(req.getParameter("real_hospz_med_exam_fee"));
String sply_hospz_med_exam_fee = Util.checkString(req.getParameter("sply_hospz_med_exam_fee"));
String hospz_med_exam_frdt = Util.checkString(req.getParameter("hospz_med_exam_frdt"));
String hospz_med_exam_todt = Util.checkString(req.getParameter("hospz_med_exam_todt"));
String hospz_med_exam_dds = Util.checkString(req.getParameter("hospz_med_exam_dds"));
String disea_cont = Util.checkString(req.getParameter("disea_cont"));
String hospz_med_exam_hosp_nm = Util.checkString(req.getParameter("hospz_med_exam_hosp_nm"));
String emp_clsf = Util.checkString(req.getParameter("emp_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_cd")));
String posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_cd")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String ss_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ss_emp_no")));
String faml_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_seq")));
String hospz_med_exam_pers_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("hospz_med_exam_pers_flnm")));
String faml_rshp_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_rshp_cd")));
String real_ward_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("real_ward_fee")));
String sply_ward_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("sply_ward_fee")));
String real_hospz_med_exam_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("real_hospz_med_exam_fee")));
String sply_hospz_med_exam_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("sply_hospz_med_exam_fee")));
String hospz_med_exam_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("hospz_med_exam_frdt")));
String hospz_med_exam_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("hospz_med_exam_todt")));
String hospz_med_exam_dds = Util.Uni2Ksc(Util.checkString(req.getParameter("hospz_med_exam_dds")));
String disea_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("disea_cont")));
String hospz_med_exam_hosp_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("hospz_med_exam_hosp_nm")));
String emp_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setDept_cd(dept_cd);
dm.setDty_cd(dty_cd);
dm.setPosi_cd(posi_cd);
dm.setSeq(seq);
dm.setOccr_dt(occr_dt);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setSs_emp_no(ss_emp_no);
dm.setFaml_seq(faml_seq);
dm.setHospz_med_exam_pers_flnm(hospz_med_exam_pers_flnm);
dm.setFaml_rshp_cd(faml_rshp_cd);
dm.setReal_ward_fee(real_ward_fee);
dm.setSply_ward_fee(sply_ward_fee);
dm.setReal_hospz_med_exam_fee(real_hospz_med_exam_fee);
dm.setSply_hospz_med_exam_fee(sply_hospz_med_exam_fee);
dm.setHospz_med_exam_frdt(hospz_med_exam_frdt);
dm.setHospz_med_exam_todt(hospz_med_exam_todt);
dm.setHospz_med_exam_dds(hospz_med_exam_dds);
dm.setDisea_cont(disea_cont);
dm.setHospz_med_exam_hosp_nm(hospz_med_exam_hosp_nm);
dm.setEmp_clsf(emp_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 18 10:48:14 KST 2012 */