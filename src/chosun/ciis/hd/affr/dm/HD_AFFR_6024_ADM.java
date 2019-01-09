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


public class HD_AFFR_6024_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String certi_clsf;
	public String occr_dt;
	public String seq;
	public String aplc_dt;
	public String aplc_seq;
	public String issu_num_shet;
	public String usag;
	public String remk;
	public String cntc_plac;
	public String email;
	public String korn_flnm;
	public String prn;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String dirc_incmg_posi;
	public String chce_posi_clsf;
	public String in_cmpy_dt;
	public String issu_dt;
	public String issu_clsf;
	public String issu_no;
	public String uipadd;
	public String uid;
	public String carr_mode;
	public String carr_cmpy_cd;
	public String carr_emp_no;
	public String carr_certi_clsf;
	public String carr_occr_dt;
	public String carr_seq;
	public String carr_appmt_dt;
	public String carr_appmt_cont;
	public String carr_dept_cd;
	public String carr_dty_cd;
	public String carr_posi_cd;
	public String carr_prt_usag_dty_cd;
	public String carr_remk;

	public HD_AFFR_6024_ADM(){}
	public HD_AFFR_6024_ADM(String mode, String cmpy_cd, String emp_no, String certi_clsf, String occr_dt, String seq, String aplc_dt, String aplc_seq, String issu_num_shet, String usag, String remk, String cntc_plac, String email, String korn_flnm, String prn, String dept_cd, String dty_cd, String posi_cd, String dirc_incmg_posi, String chce_posi_clsf, String in_cmpy_dt, String issu_dt, String issu_clsf, String issu_no, String uipadd, String uid, String carr_mode, String carr_cmpy_cd, String carr_emp_no, String carr_certi_clsf, String carr_occr_dt, String carr_seq, String carr_appmt_dt, String carr_appmt_cont, String carr_dept_cd, String carr_dty_cd, String carr_posi_cd, String carr_prt_usag_dty_cd, String carr_remk){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.certi_clsf = certi_clsf;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.aplc_dt = aplc_dt;
		this.aplc_seq = aplc_seq;
		this.issu_num_shet = issu_num_shet;
		this.usag = usag;
		this.remk = remk;
		this.cntc_plac = cntc_plac;
		this.email = email;
		this.korn_flnm = korn_flnm;
		this.prn = prn;
		this.dept_cd = dept_cd;
		this.dty_cd = dty_cd;
		this.posi_cd = posi_cd;
		this.dirc_incmg_posi = dirc_incmg_posi;
		this.chce_posi_clsf = chce_posi_clsf;
		this.in_cmpy_dt = in_cmpy_dt;
		this.issu_dt = issu_dt;
		this.issu_clsf = issu_clsf;
		this.issu_no = issu_no;
		this.uipadd = uipadd;
		this.uid = uid;
		this.carr_mode = carr_mode;
		this.carr_cmpy_cd = carr_cmpy_cd;
		this.carr_emp_no = carr_emp_no;
		this.carr_certi_clsf = carr_certi_clsf;
		this.carr_occr_dt = carr_occr_dt;
		this.carr_seq = carr_seq;
		this.carr_appmt_dt = carr_appmt_dt;
		this.carr_appmt_cont = carr_appmt_cont;
		this.carr_dept_cd = carr_dept_cd;
		this.carr_dty_cd = carr_dty_cd;
		this.carr_posi_cd = carr_posi_cd;
		this.carr_prt_usag_dty_cd = carr_prt_usag_dty_cd;
		this.carr_remk = carr_remk;
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

	public void setCerti_clsf(String certi_clsf){
		this.certi_clsf = certi_clsf;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setAplc_dt(String aplc_dt){
		this.aplc_dt = aplc_dt;
	}

	public void setAplc_seq(String aplc_seq){
		this.aplc_seq = aplc_seq;
	}

	public void setIssu_num_shet(String issu_num_shet){
		this.issu_num_shet = issu_num_shet;
	}

	public void setUsag(String usag){
		this.usag = usag;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setCntc_plac(String cntc_plac){
		this.cntc_plac = cntc_plac;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setKorn_flnm(String korn_flnm){
		this.korn_flnm = korn_flnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
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

	public void setDirc_incmg_posi(String dirc_incmg_posi){
		this.dirc_incmg_posi = dirc_incmg_posi;
	}

	public void setChce_posi_clsf(String chce_posi_clsf){
		this.chce_posi_clsf = chce_posi_clsf;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setIssu_clsf(String issu_clsf){
		this.issu_clsf = issu_clsf;
	}

	public void setIssu_no(String issu_no){
		this.issu_no = issu_no;
	}

	public void setUipadd(String uipadd){
		this.uipadd = uipadd;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setCarr_mode(String carr_mode){
		this.carr_mode = carr_mode;
	}

	public void setCarr_cmpy_cd(String carr_cmpy_cd){
		this.carr_cmpy_cd = carr_cmpy_cd;
	}

	public void setCarr_emp_no(String carr_emp_no){
		this.carr_emp_no = carr_emp_no;
	}

	public void setCarr_certi_clsf(String carr_certi_clsf){
		this.carr_certi_clsf = carr_certi_clsf;
	}

	public void setCarr_occr_dt(String carr_occr_dt){
		this.carr_occr_dt = carr_occr_dt;
	}

	public void setCarr_seq(String carr_seq){
		this.carr_seq = carr_seq;
	}

	public void setCarr_appmt_dt(String carr_appmt_dt){
		this.carr_appmt_dt = carr_appmt_dt;
	}

	public void setCarr_appmt_cont(String carr_appmt_cont){
		this.carr_appmt_cont = carr_appmt_cont;
	}

	public void setCarr_dept_cd(String carr_dept_cd){
		this.carr_dept_cd = carr_dept_cd;
	}

	public void setCarr_dty_cd(String carr_dty_cd){
		this.carr_dty_cd = carr_dty_cd;
	}

	public void setCarr_posi_cd(String carr_posi_cd){
		this.carr_posi_cd = carr_posi_cd;
	}

	public void setCarr_prt_usag_dty_cd(String carr_prt_usag_dty_cd){
		this.carr_prt_usag_dty_cd = carr_prt_usag_dty_cd;
	}

	public void setCarr_remk(String carr_remk){
		this.carr_remk = carr_remk;
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

	public String getCerti_clsf(){
		return this.certi_clsf;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getAplc_dt(){
		return this.aplc_dt;
	}

	public String getAplc_seq(){
		return this.aplc_seq;
	}

	public String getIssu_num_shet(){
		return this.issu_num_shet;
	}

	public String getUsag(){
		return this.usag;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getCntc_plac(){
		return this.cntc_plac;
	}

	public String getEmail(){
		return this.email;
	}

	public String getKorn_flnm(){
		return this.korn_flnm;
	}

	public String getPrn(){
		return this.prn;
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

	public String getDirc_incmg_posi(){
		return this.dirc_incmg_posi;
	}

	public String getChce_posi_clsf(){
		return this.chce_posi_clsf;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getIssu_clsf(){
		return this.issu_clsf;
	}

	public String getIssu_no(){
		return this.issu_no;
	}

	public String getUipadd(){
		return this.uipadd;
	}

	public String getUid(){
		return this.uid;
	}

	public String getCarr_mode(){
		return this.carr_mode;
	}

	public String getCarr_cmpy_cd(){
		return this.carr_cmpy_cd;
	}

	public String getCarr_emp_no(){
		return this.carr_emp_no;
	}

	public String getCarr_certi_clsf(){
		return this.carr_certi_clsf;
	}

	public String getCarr_occr_dt(){
		return this.carr_occr_dt;
	}

	public String getCarr_seq(){
		return this.carr_seq;
	}

	public String getCarr_appmt_dt(){
		return this.carr_appmt_dt;
	}

	public String getCarr_appmt_cont(){
		return this.carr_appmt_cont;
	}

	public String getCarr_dept_cd(){
		return this.carr_dept_cd;
	}

	public String getCarr_dty_cd(){
		return this.carr_dty_cd;
	}

	public String getCarr_posi_cd(){
		return this.carr_posi_cd;
	}

	public String getCarr_prt_usag_dty_cd(){
		return this.carr_prt_usag_dty_cd;
	}

	public String getCarr_remk(){
		return this.carr_remk;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_6024_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_6024_ADM dm = (HD_AFFR_6024_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.certi_clsf);
		cstmt.setString(7, dm.occr_dt);
		cstmt.setString(8, dm.seq);
		cstmt.setString(9, dm.aplc_dt);
		cstmt.setString(10, dm.aplc_seq);
		cstmt.setString(11, dm.issu_num_shet);
		cstmt.setString(12, dm.usag);
		cstmt.setString(13, dm.remk);
		cstmt.setString(14, dm.cntc_plac);
		cstmt.setString(15, dm.email);
		cstmt.setString(16, dm.korn_flnm);
		cstmt.setString(17, dm.prn);
		cstmt.setString(18, dm.dept_cd);
		cstmt.setString(19, dm.dty_cd);
		cstmt.setString(20, dm.posi_cd);
		cstmt.setString(21, dm.dirc_incmg_posi);
		cstmt.setString(22, dm.chce_posi_clsf);
		cstmt.setString(23, dm.in_cmpy_dt);
		cstmt.setString(24, dm.issu_dt);
		cstmt.setString(25, dm.issu_clsf);
		cstmt.setString(26, dm.issu_no);
		cstmt.setString(27, dm.uipadd);
		cstmt.setString(28, dm.uid);
		cstmt.setString(29, dm.carr_mode);
		cstmt.setString(30, dm.carr_cmpy_cd);
		cstmt.setString(31, dm.carr_emp_no);
		cstmt.setString(32, dm.carr_certi_clsf);
		cstmt.setString(33, dm.carr_occr_dt);
		cstmt.setString(34, dm.carr_seq);
		cstmt.setString(35, dm.carr_appmt_dt);
		cstmt.setString(36, dm.carr_appmt_cont);
		cstmt.setString(37, dm.carr_dept_cd);
		cstmt.setString(38, dm.carr_dty_cd);
		cstmt.setString(39, dm.carr_posi_cd);
		cstmt.setString(40, dm.carr_prt_usag_dty_cd);
		cstmt.setString(41, dm.carr_remk);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_6024_ADataSet();
	}



    public void print(){
        System.out.println("mode = " + getMode());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("emp_no = " + getEmp_no());
        System.out.println("certi_clsf = " + getCerti_clsf());
        System.out.println("occr_dt = " + getOccr_dt());
        System.out.println("seq = " + getSeq());
        System.out.println("aplc_dt = " + getAplc_dt());
        System.out.println("aplc_seq = " + getAplc_seq());
        System.out.println("issu_num_shet = " + getIssu_num_shet());
        System.out.println("usag = " + getUsag());
        System.out.println("remk = " + getRemk());
        System.out.println("cntc_plac = " + getCntc_plac());
        System.out.println("email = " + getEmail());
        System.out.println("korn_flnm = " + getKorn_flnm());
        System.out.println("prn = " + getPrn());
        System.out.println("dept_cd = " + getDept_cd());
        System.out.println("dty_cd = " + getDty_cd());
        System.out.println("posi_cd = " + getPosi_cd());
        System.out.println("dirc_incmg_posi = " + getDirc_incmg_posi());
        System.out.println("chce_posi_clsf = " + getChce_posi_clsf());
        System.out.println("in_cmpy_dt = " + getIn_cmpy_dt());
        System.out.println("issu_dt = " + getIssu_dt());
        System.out.println("issu_clsf = " + getIssu_clsf());
        System.out.println("issu_no = " + getIssu_no());
        System.out.println("uipadd = " + getUipadd());
        System.out.println("uid = " + getUid());
        System.out.println("carr_mode = " + getCarr_mode());
        System.out.println("carr_cmpy_cd = " + getCarr_cmpy_cd());
        System.out.println("carr_emp_no = " + getCarr_emp_no());
        System.out.println("carr_certi_clsf = " + getCarr_certi_clsf());
        System.out.println("carr_occr_dt = " + getCarr_occr_dt());
        System.out.println("carr_seq = " + getCarr_seq());
        System.out.println("carr_appmt_dt = " + getCarr_appmt_dt());
        System.out.println("carr_appmt_cont = " + getCarr_appmt_cont());
        System.out.println("carr_dept_cd = " + getCarr_dept_cd());
        System.out.println("carr_dty_cd = " + getCarr_dty_cd());
        System.out.println("carr_posi_cd = " + getCarr_posi_cd());
        System.out.println("carr_prt_usag_dty_cd = " + getCarr_prt_usag_dty_cd());
        System.out.println("carr_remk = " + getCarr_remk());
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
String certi_clsf = req.getParameter("certi_clsf");
if( certi_clsf == null){
	System.out.println(this.toString+" : certi_clsf is null" );
}else{
	System.out.println(this.toString+" : certi_clsf is "+certi_clsf );
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
String aplc_dt = req.getParameter("aplc_dt");
if( aplc_dt == null){
	System.out.println(this.toString+" : aplc_dt is null" );
}else{
	System.out.println(this.toString+" : aplc_dt is "+aplc_dt );
}
String aplc_seq = req.getParameter("aplc_seq");
if( aplc_seq == null){
	System.out.println(this.toString+" : aplc_seq is null" );
}else{
	System.out.println(this.toString+" : aplc_seq is "+aplc_seq );
}
String issu_num_shet = req.getParameter("issu_num_shet");
if( issu_num_shet == null){
	System.out.println(this.toString+" : issu_num_shet is null" );
}else{
	System.out.println(this.toString+" : issu_num_shet is "+issu_num_shet );
}
String usag = req.getParameter("usag");
if( usag == null){
	System.out.println(this.toString+" : usag is null" );
}else{
	System.out.println(this.toString+" : usag is "+usag );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String cntc_plac = req.getParameter("cntc_plac");
if( cntc_plac == null){
	System.out.println(this.toString+" : cntc_plac is null" );
}else{
	System.out.println(this.toString+" : cntc_plac is "+cntc_plac );
}
String email = req.getParameter("email");
if( email == null){
	System.out.println(this.toString+" : email is null" );
}else{
	System.out.println(this.toString+" : email is "+email );
}
String korn_flnm = req.getParameter("korn_flnm");
if( korn_flnm == null){
	System.out.println(this.toString+" : korn_flnm is null" );
}else{
	System.out.println(this.toString+" : korn_flnm is "+korn_flnm );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
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
String dirc_incmg_posi = req.getParameter("dirc_incmg_posi");
if( dirc_incmg_posi == null){
	System.out.println(this.toString+" : dirc_incmg_posi is null" );
}else{
	System.out.println(this.toString+" : dirc_incmg_posi is "+dirc_incmg_posi );
}
String chce_posi_clsf = req.getParameter("chce_posi_clsf");
if( chce_posi_clsf == null){
	System.out.println(this.toString+" : chce_posi_clsf is null" );
}else{
	System.out.println(this.toString+" : chce_posi_clsf is "+chce_posi_clsf );
}
String in_cmpy_dt = req.getParameter("in_cmpy_dt");
if( in_cmpy_dt == null){
	System.out.println(this.toString+" : in_cmpy_dt is null" );
}else{
	System.out.println(this.toString+" : in_cmpy_dt is "+in_cmpy_dt );
}
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String issu_clsf = req.getParameter("issu_clsf");
if( issu_clsf == null){
	System.out.println(this.toString+" : issu_clsf is null" );
}else{
	System.out.println(this.toString+" : issu_clsf is "+issu_clsf );
}
String issu_no = req.getParameter("issu_no");
if( issu_no == null){
	System.out.println(this.toString+" : issu_no is null" );
}else{
	System.out.println(this.toString+" : issu_no is "+issu_no );
}
String uipadd = req.getParameter("uipadd");
if( uipadd == null){
	System.out.println(this.toString+" : uipadd is null" );
}else{
	System.out.println(this.toString+" : uipadd is "+uipadd );
}
String uid = req.getParameter("uid");
if( uid == null){
	System.out.println(this.toString+" : uid is null" );
}else{
	System.out.println(this.toString+" : uid is "+uid );
}
String carr_mode = req.getParameter("carr_mode");
if( carr_mode == null){
	System.out.println(this.toString+" : carr_mode is null" );
}else{
	System.out.println(this.toString+" : carr_mode is "+carr_mode );
}
String carr_cmpy_cd = req.getParameter("carr_cmpy_cd");
if( carr_cmpy_cd == null){
	System.out.println(this.toString+" : carr_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : carr_cmpy_cd is "+carr_cmpy_cd );
}
String carr_emp_no = req.getParameter("carr_emp_no");
if( carr_emp_no == null){
	System.out.println(this.toString+" : carr_emp_no is null" );
}else{
	System.out.println(this.toString+" : carr_emp_no is "+carr_emp_no );
}
String carr_certi_clsf = req.getParameter("carr_certi_clsf");
if( carr_certi_clsf == null){
	System.out.println(this.toString+" : carr_certi_clsf is null" );
}else{
	System.out.println(this.toString+" : carr_certi_clsf is "+carr_certi_clsf );
}
String carr_occr_dt = req.getParameter("carr_occr_dt");
if( carr_occr_dt == null){
	System.out.println(this.toString+" : carr_occr_dt is null" );
}else{
	System.out.println(this.toString+" : carr_occr_dt is "+carr_occr_dt );
}
String carr_seq = req.getParameter("carr_seq");
if( carr_seq == null){
	System.out.println(this.toString+" : carr_seq is null" );
}else{
	System.out.println(this.toString+" : carr_seq is "+carr_seq );
}
String carr_appmt_dt = req.getParameter("carr_appmt_dt");
if( carr_appmt_dt == null){
	System.out.println(this.toString+" : carr_appmt_dt is null" );
}else{
	System.out.println(this.toString+" : carr_appmt_dt is "+carr_appmt_dt );
}
String carr_appmt_cont = req.getParameter("carr_appmt_cont");
if( carr_appmt_cont == null){
	System.out.println(this.toString+" : carr_appmt_cont is null" );
}else{
	System.out.println(this.toString+" : carr_appmt_cont is "+carr_appmt_cont );
}
String carr_dept_cd = req.getParameter("carr_dept_cd");
if( carr_dept_cd == null){
	System.out.println(this.toString+" : carr_dept_cd is null" );
}else{
	System.out.println(this.toString+" : carr_dept_cd is "+carr_dept_cd );
}
String carr_dty_cd = req.getParameter("carr_dty_cd");
if( carr_dty_cd == null){
	System.out.println(this.toString+" : carr_dty_cd is null" );
}else{
	System.out.println(this.toString+" : carr_dty_cd is "+carr_dty_cd );
}
String carr_posi_cd = req.getParameter("carr_posi_cd");
if( carr_posi_cd == null){
	System.out.println(this.toString+" : carr_posi_cd is null" );
}else{
	System.out.println(this.toString+" : carr_posi_cd is "+carr_posi_cd );
}
String carr_prt_usag_dty_cd = req.getParameter("carr_prt_usag_dty_cd");
if( carr_prt_usag_dty_cd == null){
	System.out.println(this.toString+" : carr_prt_usag_dty_cd is null" );
}else{
	System.out.println(this.toString+" : carr_prt_usag_dty_cd is "+carr_prt_usag_dty_cd );
}
String carr_remk = req.getParameter("carr_remk");
if( carr_remk == null){
	System.out.println(this.toString+" : carr_remk is null" );
}else{
	System.out.println(this.toString+" : carr_remk is "+carr_remk );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String certi_clsf = Util.checkString(req.getParameter("certi_clsf"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String aplc_dt = Util.checkString(req.getParameter("aplc_dt"));
String aplc_seq = Util.checkString(req.getParameter("aplc_seq"));
String issu_num_shet = Util.checkString(req.getParameter("issu_num_shet"));
String usag = Util.checkString(req.getParameter("usag"));
String remk = Util.checkString(req.getParameter("remk"));
String cntc_plac = Util.checkString(req.getParameter("cntc_plac"));
String email = Util.checkString(req.getParameter("email"));
String korn_flnm = Util.checkString(req.getParameter("korn_flnm"));
String prn = Util.checkString(req.getParameter("prn"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dty_cd = Util.checkString(req.getParameter("dty_cd"));
String posi_cd = Util.checkString(req.getParameter("posi_cd"));
String dirc_incmg_posi = Util.checkString(req.getParameter("dirc_incmg_posi"));
String chce_posi_clsf = Util.checkString(req.getParameter("chce_posi_clsf"));
String in_cmpy_dt = Util.checkString(req.getParameter("in_cmpy_dt"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String issu_clsf = Util.checkString(req.getParameter("issu_clsf"));
String issu_no = Util.checkString(req.getParameter("issu_no"));
String uipadd = Util.checkString(req.getParameter("uipadd"));
String uid = Util.checkString(req.getParameter("uid"));
String carr_mode = Util.checkString(req.getParameter("carr_mode"));
String carr_cmpy_cd = Util.checkString(req.getParameter("carr_cmpy_cd"));
String carr_emp_no = Util.checkString(req.getParameter("carr_emp_no"));
String carr_certi_clsf = Util.checkString(req.getParameter("carr_certi_clsf"));
String carr_occr_dt = Util.checkString(req.getParameter("carr_occr_dt"));
String carr_seq = Util.checkString(req.getParameter("carr_seq"));
String carr_appmt_dt = Util.checkString(req.getParameter("carr_appmt_dt"));
String carr_appmt_cont = Util.checkString(req.getParameter("carr_appmt_cont"));
String carr_dept_cd = Util.checkString(req.getParameter("carr_dept_cd"));
String carr_dty_cd = Util.checkString(req.getParameter("carr_dty_cd"));
String carr_posi_cd = Util.checkString(req.getParameter("carr_posi_cd"));
String carr_prt_usag_dty_cd = Util.checkString(req.getParameter("carr_prt_usag_dty_cd"));
String carr_remk = Util.checkString(req.getParameter("carr_remk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String certi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("certi_clsf")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String aplc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_dt")));
String aplc_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_seq")));
String issu_num_shet = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_num_shet")));
String usag = Util.Uni2Ksc(Util.checkString(req.getParameter("usag")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String cntc_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("cntc_plac")));
String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
String korn_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("korn_flnm")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_cd")));
String posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_cd")));
String dirc_incmg_posi = Util.Uni2Ksc(Util.checkString(req.getParameter("dirc_incmg_posi")));
String chce_posi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("chce_posi_clsf")));
String in_cmpy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("in_cmpy_dt")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String issu_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_clsf")));
String issu_no = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_no")));
String uipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("uipadd")));
String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String carr_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("carr_mode")));
String carr_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("carr_cmpy_cd")));
String carr_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("carr_emp_no")));
String carr_certi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("carr_certi_clsf")));
String carr_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("carr_occr_dt")));
String carr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("carr_seq")));
String carr_appmt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("carr_appmt_dt")));
String carr_appmt_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("carr_appmt_cont")));
String carr_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("carr_dept_cd")));
String carr_dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("carr_dty_cd")));
String carr_posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("carr_posi_cd")));
String carr_prt_usag_dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("carr_prt_usag_dty_cd")));
String carr_remk = Util.Uni2Ksc(Util.checkString(req.getParameter("carr_remk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setCerti_clsf(certi_clsf);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setAplc_dt(aplc_dt);
dm.setAplc_seq(aplc_seq);
dm.setIssu_num_shet(issu_num_shet);
dm.setUsag(usag);
dm.setRemk(remk);
dm.setCntc_plac(cntc_plac);
dm.setEmail(email);
dm.setKorn_flnm(korn_flnm);
dm.setPrn(prn);
dm.setDept_cd(dept_cd);
dm.setDty_cd(dty_cd);
dm.setPosi_cd(posi_cd);
dm.setDirc_incmg_posi(dirc_incmg_posi);
dm.setChce_posi_clsf(chce_posi_clsf);
dm.setIn_cmpy_dt(in_cmpy_dt);
dm.setIssu_dt(issu_dt);
dm.setIssu_clsf(issu_clsf);
dm.setIssu_no(issu_no);
dm.setUipadd(uipadd);
dm.setUid(uid);
dm.setCarr_mode(carr_mode);
dm.setCarr_cmpy_cd(carr_cmpy_cd);
dm.setCarr_emp_no(carr_emp_no);
dm.setCarr_certi_clsf(carr_certi_clsf);
dm.setCarr_occr_dt(carr_occr_dt);
dm.setCarr_seq(carr_seq);
dm.setCarr_appmt_dt(carr_appmt_dt);
dm.setCarr_appmt_cont(carr_appmt_cont);
dm.setCarr_dept_cd(carr_dept_cd);
dm.setCarr_dty_cd(carr_dty_cd);
dm.setCarr_posi_cd(carr_posi_cd);
dm.setCarr_prt_usag_dty_cd(carr_prt_usag_dty_cd);
dm.setCarr_remk(carr_remk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 16 19:31:56 KST 2009 */