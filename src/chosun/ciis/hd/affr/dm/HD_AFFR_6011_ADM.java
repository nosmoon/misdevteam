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


public class HD_AFFR_6011_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

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
	public String busi_trip_purp;
	public String busi_trip_area;
	public String busi_trip_frdt;
	public String busi_trip_todt;
	public String engl_flnm;
	public String engl_bidt;
	public String engl_dept_posi;
	public String engl_in_cmpy_dt;
	public String engl_now_dt;
	public String engl_busi_trip_purp;
	public String engl_busi_trip_area;
	public String engl_busi_trip_frdt;
	public String engl_busi_trip_todt;
	public String issu_dt;
	public String issu_clsf;
	public String issu_no;
	public String uipadd;
	public String uid;
	public String now_dt;

	public HD_AFFR_6011_ADM(){}
	public HD_AFFR_6011_ADM(String mode, String cmpy_cd, String emp_no, String certi_clsf, String occr_dt, String seq, String aplc_dt, String aplc_seq, String issu_num_shet, String usag, String remk, String cntc_plac, String email, String korn_flnm, String prn, String dept_cd, String dty_cd, String posi_cd, String dirc_incmg_posi, String chce_posi_clsf, String in_cmpy_dt, String busi_trip_purp, String busi_trip_area, String busi_trip_frdt, String busi_trip_todt, String engl_flnm, String engl_bidt, String engl_dept_posi, String engl_in_cmpy_dt, String engl_now_dt, String engl_busi_trip_purp, String engl_busi_trip_area, String engl_busi_trip_frdt, String engl_busi_trip_todt, String issu_dt, String issu_clsf, String issu_no, String uipadd, String uid, String now_dt){
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
		this.busi_trip_purp = busi_trip_purp;
		this.busi_trip_area = busi_trip_area;
		this.busi_trip_frdt = busi_trip_frdt;
		this.busi_trip_todt = busi_trip_todt;
		this.engl_flnm = engl_flnm;
		this.engl_bidt = engl_bidt;
		this.engl_dept_posi = engl_dept_posi;
		this.engl_in_cmpy_dt = engl_in_cmpy_dt;
		this.engl_now_dt = engl_now_dt;
		this.engl_busi_trip_purp = engl_busi_trip_purp;
		this.engl_busi_trip_area = engl_busi_trip_area;
		this.engl_busi_trip_frdt = engl_busi_trip_frdt;
		this.engl_busi_trip_todt = engl_busi_trip_todt;
		this.issu_dt = issu_dt;
		this.issu_clsf = issu_clsf;
		this.issu_no = issu_no;
		this.uipadd = uipadd;
		this.uid = uid;
		this.now_dt = now_dt;
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

	public void setBusi_trip_purp(String busi_trip_purp){
		this.busi_trip_purp = busi_trip_purp;
	}

	public void setBusi_trip_area(String busi_trip_area){
		this.busi_trip_area = busi_trip_area;
	}

	public void setBusi_trip_frdt(String busi_trip_frdt){
		this.busi_trip_frdt = busi_trip_frdt;
	}

	public void setBusi_trip_todt(String busi_trip_todt){
		this.busi_trip_todt = busi_trip_todt;
	}

	public void setEngl_flnm(String engl_flnm){
		this.engl_flnm = engl_flnm;
	}

	public void setEngl_bidt(String engl_bidt){
		this.engl_bidt = engl_bidt;
	}

	public void setEngl_dept_posi(String engl_dept_posi){
		this.engl_dept_posi = engl_dept_posi;
	}

	public void setEngl_in_cmpy_dt(String engl_in_cmpy_dt){
		this.engl_in_cmpy_dt = engl_in_cmpy_dt;
	}

	public void setEngl_now_dt(String engl_now_dt){
		this.engl_now_dt = engl_now_dt;
	}

	public void setEngl_busi_trip_purp(String engl_busi_trip_purp){
		this.engl_busi_trip_purp = engl_busi_trip_purp;
	}

	public void setEngl_busi_trip_area(String engl_busi_trip_area){
		this.engl_busi_trip_area = engl_busi_trip_area;
	}

	public void setEngl_busi_trip_frdt(String engl_busi_trip_frdt){
		this.engl_busi_trip_frdt = engl_busi_trip_frdt;
	}

	public void setEngl_busi_trip_todt(String engl_busi_trip_todt){
		this.engl_busi_trip_todt = engl_busi_trip_todt;
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

	public void setNow_dt(String now_dt){
		this.now_dt = now_dt;
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

	public String getBusi_trip_purp(){
		return this.busi_trip_purp;
	}

	public String getBusi_trip_area(){
		return this.busi_trip_area;
	}

	public String getBusi_trip_frdt(){
		return this.busi_trip_frdt;
	}

	public String getBusi_trip_todt(){
		return this.busi_trip_todt;
	}

	public String getEngl_flnm(){
		return this.engl_flnm;
	}

	public String getEngl_bidt(){
		return this.engl_bidt;
	}

	public String getEngl_dept_posi(){
		return this.engl_dept_posi;
	}

	public String getEngl_in_cmpy_dt(){
		return this.engl_in_cmpy_dt;
	}

	public String getEngl_now_dt(){
		return this.engl_now_dt;
	}

	public String getEngl_busi_trip_purp(){
		return this.engl_busi_trip_purp;
	}

	public String getEngl_busi_trip_area(){
		return this.engl_busi_trip_area;
	}

	public String getEngl_busi_trip_frdt(){
		return this.engl_busi_trip_frdt;
	}

	public String getEngl_busi_trip_todt(){
		return this.engl_busi_trip_todt;
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

	public String getNow_dt(){
		return this.now_dt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_6011_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_6011_ADM dm = (HD_AFFR_6011_ADM)bdm;
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
		cstmt.setString(24, dm.busi_trip_purp);
		cstmt.setString(25, dm.busi_trip_area);
		cstmt.setString(26, dm.busi_trip_frdt);
		cstmt.setString(27, dm.busi_trip_todt);
		cstmt.setString(28, dm.engl_flnm);
		cstmt.setString(29, dm.engl_bidt);
		cstmt.setString(30, dm.engl_dept_posi);
		cstmt.setString(31, dm.engl_in_cmpy_dt);
		cstmt.setString(32, dm.engl_now_dt);
		cstmt.setString(33, dm.engl_busi_trip_purp);
		cstmt.setString(34, dm.engl_busi_trip_area);
		cstmt.setString(35, dm.engl_busi_trip_frdt);
		cstmt.setString(36, dm.engl_busi_trip_todt);
		cstmt.setString(37, dm.issu_dt);
		cstmt.setString(38, dm.issu_clsf);
		cstmt.setString(39, dm.issu_no);
		cstmt.setString(40, dm.uipadd);
		cstmt.setString(41, dm.uid);
		cstmt.setString(42, dm.now_dt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_6011_ADataSet();
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
        System.out.println("busi_trip_purp = " + getBusi_trip_purp());
        System.out.println("busi_trip_area = " + getBusi_trip_area());
        System.out.println("busi_trip_frdt = " + getBusi_trip_frdt());
        System.out.println("busi_trip_todt = " + getBusi_trip_todt());
        System.out.println("engl_flnm = " + getEngl_flnm());
        System.out.println("engl_bidt = " + getEngl_bidt());
        System.out.println("engl_dept_posi = " + getEngl_dept_posi());
        System.out.println("engl_in_cmpy_dt = " + getEngl_in_cmpy_dt());
        System.out.println("engl_now_dt = " + getEngl_now_dt());
        System.out.println("engl_busi_trip_purp = " + getEngl_busi_trip_purp());
        System.out.println("engl_busi_trip_area = " + getEngl_busi_trip_area());
        System.out.println("engl_busi_trip_frdt = " + getEngl_busi_trip_frdt());
        System.out.println("engl_busi_trip_todt = " + getEngl_busi_trip_todt());
        System.out.println("issu_dt = " + getIssu_dt());
        System.out.println("issu_clsf = " + getIssu_clsf());
        System.out.println("issu_no = " + getIssu_no());
        System.out.println("uipadd = " + getUipadd());
        System.out.println("uid = " + getUid());
        System.out.println("now_dt = " + getNow_dt());
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
String busi_trip_purp = req.getParameter("busi_trip_purp");
if( busi_trip_purp == null){
	System.out.println(this.toString+" : busi_trip_purp is null" );
}else{
	System.out.println(this.toString+" : busi_trip_purp is "+busi_trip_purp );
}
String busi_trip_area = req.getParameter("busi_trip_area");
if( busi_trip_area == null){
	System.out.println(this.toString+" : busi_trip_area is null" );
}else{
	System.out.println(this.toString+" : busi_trip_area is "+busi_trip_area );
}
String busi_trip_frdt = req.getParameter("busi_trip_frdt");
if( busi_trip_frdt == null){
	System.out.println(this.toString+" : busi_trip_frdt is null" );
}else{
	System.out.println(this.toString+" : busi_trip_frdt is "+busi_trip_frdt );
}
String busi_trip_todt = req.getParameter("busi_trip_todt");
if( busi_trip_todt == null){
	System.out.println(this.toString+" : busi_trip_todt is null" );
}else{
	System.out.println(this.toString+" : busi_trip_todt is "+busi_trip_todt );
}
String engl_flnm = req.getParameter("engl_flnm");
if( engl_flnm == null){
	System.out.println(this.toString+" : engl_flnm is null" );
}else{
	System.out.println(this.toString+" : engl_flnm is "+engl_flnm );
}
String engl_bidt = req.getParameter("engl_bidt");
if( engl_bidt == null){
	System.out.println(this.toString+" : engl_bidt is null" );
}else{
	System.out.println(this.toString+" : engl_bidt is "+engl_bidt );
}
String engl_dept_posi = req.getParameter("engl_dept_posi");
if( engl_dept_posi == null){
	System.out.println(this.toString+" : engl_dept_posi is null" );
}else{
	System.out.println(this.toString+" : engl_dept_posi is "+engl_dept_posi );
}
String engl_in_cmpy_dt = req.getParameter("engl_in_cmpy_dt");
if( engl_in_cmpy_dt == null){
	System.out.println(this.toString+" : engl_in_cmpy_dt is null" );
}else{
	System.out.println(this.toString+" : engl_in_cmpy_dt is "+engl_in_cmpy_dt );
}
String engl_now_dt = req.getParameter("engl_now_dt");
if( engl_now_dt == null){
	System.out.println(this.toString+" : engl_now_dt is null" );
}else{
	System.out.println(this.toString+" : engl_now_dt is "+engl_now_dt );
}
String engl_busi_trip_purp = req.getParameter("engl_busi_trip_purp");
if( engl_busi_trip_purp == null){
	System.out.println(this.toString+" : engl_busi_trip_purp is null" );
}else{
	System.out.println(this.toString+" : engl_busi_trip_purp is "+engl_busi_trip_purp );
}
String engl_busi_trip_area = req.getParameter("engl_busi_trip_area");
if( engl_busi_trip_area == null){
	System.out.println(this.toString+" : engl_busi_trip_area is null" );
}else{
	System.out.println(this.toString+" : engl_busi_trip_area is "+engl_busi_trip_area );
}
String engl_busi_trip_frdt = req.getParameter("engl_busi_trip_frdt");
if( engl_busi_trip_frdt == null){
	System.out.println(this.toString+" : engl_busi_trip_frdt is null" );
}else{
	System.out.println(this.toString+" : engl_busi_trip_frdt is "+engl_busi_trip_frdt );
}
String engl_busi_trip_todt = req.getParameter("engl_busi_trip_todt");
if( engl_busi_trip_todt == null){
	System.out.println(this.toString+" : engl_busi_trip_todt is null" );
}else{
	System.out.println(this.toString+" : engl_busi_trip_todt is "+engl_busi_trip_todt );
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
String now_dt = req.getParameter("now_dt");
if( now_dt == null){
	System.out.println(this.toString+" : now_dt is null" );
}else{
	System.out.println(this.toString+" : now_dt is "+now_dt );
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
String busi_trip_purp = Util.checkString(req.getParameter("busi_trip_purp"));
String busi_trip_area = Util.checkString(req.getParameter("busi_trip_area"));
String busi_trip_frdt = Util.checkString(req.getParameter("busi_trip_frdt"));
String busi_trip_todt = Util.checkString(req.getParameter("busi_trip_todt"));
String engl_flnm = Util.checkString(req.getParameter("engl_flnm"));
String engl_bidt = Util.checkString(req.getParameter("engl_bidt"));
String engl_dept_posi = Util.checkString(req.getParameter("engl_dept_posi"));
String engl_in_cmpy_dt = Util.checkString(req.getParameter("engl_in_cmpy_dt"));
String engl_now_dt = Util.checkString(req.getParameter("engl_now_dt"));
String engl_busi_trip_purp = Util.checkString(req.getParameter("engl_busi_trip_purp"));
String engl_busi_trip_area = Util.checkString(req.getParameter("engl_busi_trip_area"));
String engl_busi_trip_frdt = Util.checkString(req.getParameter("engl_busi_trip_frdt"));
String engl_busi_trip_todt = Util.checkString(req.getParameter("engl_busi_trip_todt"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String issu_clsf = Util.checkString(req.getParameter("issu_clsf"));
String issu_no = Util.checkString(req.getParameter("issu_no"));
String uipadd = Util.checkString(req.getParameter("uipadd"));
String uid = Util.checkString(req.getParameter("uid"));
String now_dt = Util.checkString(req.getParameter("now_dt"));
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
String busi_trip_purp = Util.Uni2Ksc(Util.checkString(req.getParameter("busi_trip_purp")));
String busi_trip_area = Util.Uni2Ksc(Util.checkString(req.getParameter("busi_trip_area")));
String busi_trip_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("busi_trip_frdt")));
String busi_trip_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("busi_trip_todt")));
String engl_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("engl_flnm")));
String engl_bidt = Util.Uni2Ksc(Util.checkString(req.getParameter("engl_bidt")));
String engl_dept_posi = Util.Uni2Ksc(Util.checkString(req.getParameter("engl_dept_posi")));
String engl_in_cmpy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("engl_in_cmpy_dt")));
String engl_now_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("engl_now_dt")));
String engl_busi_trip_purp = Util.Uni2Ksc(Util.checkString(req.getParameter("engl_busi_trip_purp")));
String engl_busi_trip_area = Util.Uni2Ksc(Util.checkString(req.getParameter("engl_busi_trip_area")));
String engl_busi_trip_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("engl_busi_trip_frdt")));
String engl_busi_trip_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("engl_busi_trip_todt")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String issu_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_clsf")));
String issu_no = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_no")));
String uipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("uipadd")));
String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String now_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("now_dt")));
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
dm.setBusi_trip_purp(busi_trip_purp);
dm.setBusi_trip_area(busi_trip_area);
dm.setBusi_trip_frdt(busi_trip_frdt);
dm.setBusi_trip_todt(busi_trip_todt);
dm.setEngl_flnm(engl_flnm);
dm.setEngl_bidt(engl_bidt);
dm.setEngl_dept_posi(engl_dept_posi);
dm.setEngl_in_cmpy_dt(engl_in_cmpy_dt);
dm.setEngl_now_dt(engl_now_dt);
dm.setEngl_busi_trip_purp(engl_busi_trip_purp);
dm.setEngl_busi_trip_area(engl_busi_trip_area);
dm.setEngl_busi_trip_frdt(engl_busi_trip_frdt);
dm.setEngl_busi_trip_todt(engl_busi_trip_todt);
dm.setIssu_dt(issu_dt);
dm.setIssu_clsf(issu_clsf);
dm.setIssu_no(issu_no);
dm.setUipadd(uipadd);
dm.setUid(uid);
dm.setNow_dt(now_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 18 17:57:06 KST 2009 */