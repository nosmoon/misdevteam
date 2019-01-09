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


public class HD_INFO_2002_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String occr_dt;
	public String seq;
	public String psgp_cd;
	public String intern_desty;
	public String flnm;
	public String prn;
	public String tel_no;
	public String univ_nm;
	public String majr_nm;
	public String univ_enty_yy;
	public String engl_test_nm;
	public String engl_test_scor;
	public String hby;
	public String spc;
	public String acty_dept;
	public String acty_frdt;
	public String acty_todt;
	public String acty_complt_yn;
	public String carr_matt_1;
	public String carr_matt_1_frdt;
	public String carr_matt_1_todt;
	public String carr_matt_1_instt;
	public String carr_matt_2;
	public String carr_matt_2_frdt;
	public String carr_matt_2_todt;
	public String carr_matt_2_instt;
	public String carr_matt_3;
	public String carr_matt_3_frdt;
	public String carr_matt_3_todt;
	public String carr_matt_3_instt;
	public String blng_dpthd_evlu_idea;
	public String etc;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_INFO_2002_ADM(){}
	public HD_INFO_2002_ADM(String cmpy_cd, String mode, String occr_dt, String seq, String psgp_cd, String intern_desty, String flnm, String prn, String tel_no, String univ_nm, String majr_nm, String univ_enty_yy, String engl_test_nm, String engl_test_scor, String hby, String spc, String acty_dept, String acty_frdt, String acty_todt, String acty_complt_yn, String carr_matt_1, String carr_matt_1_frdt, String carr_matt_1_todt, String carr_matt_1_instt, String carr_matt_2, String carr_matt_2_frdt, String carr_matt_2_todt, String carr_matt_2_instt, String carr_matt_3, String carr_matt_3_frdt, String carr_matt_3_todt, String carr_matt_3_instt, String blng_dpthd_evlu_idea, String etc, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.psgp_cd = psgp_cd;
		this.intern_desty = intern_desty;
		this.flnm = flnm;
		this.prn = prn;
		this.tel_no = tel_no;
		this.univ_nm = univ_nm;
		this.majr_nm = majr_nm;
		this.univ_enty_yy = univ_enty_yy;
		this.engl_test_nm = engl_test_nm;
		this.engl_test_scor = engl_test_scor;
		this.hby = hby;
		this.spc = spc;
		this.acty_dept = acty_dept;
		this.acty_frdt = acty_frdt;
		this.acty_todt = acty_todt;
		this.acty_complt_yn = acty_complt_yn;
		this.carr_matt_1 = carr_matt_1;
		this.carr_matt_1_frdt = carr_matt_1_frdt;
		this.carr_matt_1_todt = carr_matt_1_todt;
		this.carr_matt_1_instt = carr_matt_1_instt;
		this.carr_matt_2 = carr_matt_2;
		this.carr_matt_2_frdt = carr_matt_2_frdt;
		this.carr_matt_2_todt = carr_matt_2_todt;
		this.carr_matt_2_instt = carr_matt_2_instt;
		this.carr_matt_3 = carr_matt_3;
		this.carr_matt_3_frdt = carr_matt_3_frdt;
		this.carr_matt_3_todt = carr_matt_3_todt;
		this.carr_matt_3_instt = carr_matt_3_instt;
		this.blng_dpthd_evlu_idea = blng_dpthd_evlu_idea;
		this.etc = etc;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setPsgp_cd(String psgp_cd){
		this.psgp_cd = psgp_cd;
	}

	public void setIntern_desty(String intern_desty){
		this.intern_desty = intern_desty;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setUniv_nm(String univ_nm){
		this.univ_nm = univ_nm;
	}

	public void setMajr_nm(String majr_nm){
		this.majr_nm = majr_nm;
	}

	public void setUniv_enty_yy(String univ_enty_yy){
		this.univ_enty_yy = univ_enty_yy;
	}

	public void setEngl_test_nm(String engl_test_nm){
		this.engl_test_nm = engl_test_nm;
	}

	public void setEngl_test_scor(String engl_test_scor){
		this.engl_test_scor = engl_test_scor;
	}

	public void setHby(String hby){
		this.hby = hby;
	}

	public void setSpc(String spc){
		this.spc = spc;
	}

	public void setActy_dept(String acty_dept){
		this.acty_dept = acty_dept;
	}

	public void setActy_frdt(String acty_frdt){
		this.acty_frdt = acty_frdt;
	}

	public void setActy_todt(String acty_todt){
		this.acty_todt = acty_todt;
	}

	public void setActy_complt_yn(String acty_complt_yn){
		this.acty_complt_yn = acty_complt_yn;
	}

	public void setCarr_matt_1(String carr_matt_1){
		this.carr_matt_1 = carr_matt_1;
	}

	public void setCarr_matt_1_frdt(String carr_matt_1_frdt){
		this.carr_matt_1_frdt = carr_matt_1_frdt;
	}

	public void setCarr_matt_1_todt(String carr_matt_1_todt){
		this.carr_matt_1_todt = carr_matt_1_todt;
	}

	public void setCarr_matt_1_instt(String carr_matt_1_instt){
		this.carr_matt_1_instt = carr_matt_1_instt;
	}

	public void setCarr_matt_2(String carr_matt_2){
		this.carr_matt_2 = carr_matt_2;
	}

	public void setCarr_matt_2_frdt(String carr_matt_2_frdt){
		this.carr_matt_2_frdt = carr_matt_2_frdt;
	}

	public void setCarr_matt_2_todt(String carr_matt_2_todt){
		this.carr_matt_2_todt = carr_matt_2_todt;
	}

	public void setCarr_matt_2_instt(String carr_matt_2_instt){
		this.carr_matt_2_instt = carr_matt_2_instt;
	}

	public void setCarr_matt_3(String carr_matt_3){
		this.carr_matt_3 = carr_matt_3;
	}

	public void setCarr_matt_3_frdt(String carr_matt_3_frdt){
		this.carr_matt_3_frdt = carr_matt_3_frdt;
	}

	public void setCarr_matt_3_todt(String carr_matt_3_todt){
		this.carr_matt_3_todt = carr_matt_3_todt;
	}

	public void setCarr_matt_3_instt(String carr_matt_3_instt){
		this.carr_matt_3_instt = carr_matt_3_instt;
	}

	public void setBlng_dpthd_evlu_idea(String blng_dpthd_evlu_idea){
		this.blng_dpthd_evlu_idea = blng_dpthd_evlu_idea;
	}

	public void setEtc(String etc){
		this.etc = etc;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getPsgp_cd(){
		return this.psgp_cd;
	}

	public String getIntern_desty(){
		return this.intern_desty;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getUniv_nm(){
		return this.univ_nm;
	}

	public String getMajr_nm(){
		return this.majr_nm;
	}

	public String getUniv_enty_yy(){
		return this.univ_enty_yy;
	}

	public String getEngl_test_nm(){
		return this.engl_test_nm;
	}

	public String getEngl_test_scor(){
		return this.engl_test_scor;
	}

	public String getHby(){
		return this.hby;
	}

	public String getSpc(){
		return this.spc;
	}

	public String getActy_dept(){
		return this.acty_dept;
	}

	public String getActy_frdt(){
		return this.acty_frdt;
	}

	public String getActy_todt(){
		return this.acty_todt;
	}

	public String getActy_complt_yn(){
		return this.acty_complt_yn;
	}

	public String getCarr_matt_1(){
		return this.carr_matt_1;
	}

	public String getCarr_matt_1_frdt(){
		return this.carr_matt_1_frdt;
	}

	public String getCarr_matt_1_todt(){
		return this.carr_matt_1_todt;
	}

	public String getCarr_matt_1_instt(){
		return this.carr_matt_1_instt;
	}

	public String getCarr_matt_2(){
		return this.carr_matt_2;
	}

	public String getCarr_matt_2_frdt(){
		return this.carr_matt_2_frdt;
	}

	public String getCarr_matt_2_todt(){
		return this.carr_matt_2_todt;
	}

	public String getCarr_matt_2_instt(){
		return this.carr_matt_2_instt;
	}

	public String getCarr_matt_3(){
		return this.carr_matt_3;
	}

	public String getCarr_matt_3_frdt(){
		return this.carr_matt_3_frdt;
	}

	public String getCarr_matt_3_todt(){
		return this.carr_matt_3_todt;
	}

	public String getCarr_matt_3_instt(){
		return this.carr_matt_3_instt;
	}

	public String getBlng_dpthd_evlu_idea(){
		return this.blng_dpthd_evlu_idea;
	}

	public String getEtc(){
		return this.etc;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_2002_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_2002_ADM dm = (HD_INFO_2002_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.psgp_cd);
		cstmt.setString(8, dm.intern_desty);
		cstmt.setString(9, dm.flnm);
		cstmt.setString(10, dm.prn);
		cstmt.setString(11, dm.tel_no);
		cstmt.setString(12, dm.univ_nm);
		cstmt.setString(13, dm.majr_nm);
		cstmt.setString(14, dm.univ_enty_yy);
		cstmt.setString(15, dm.engl_test_nm);
		cstmt.setString(16, dm.engl_test_scor);
		cstmt.setString(17, dm.hby);
		cstmt.setString(18, dm.spc);
		cstmt.setString(19, dm.acty_dept);
		cstmt.setString(20, dm.acty_frdt);
		cstmt.setString(21, dm.acty_todt);
		cstmt.setString(22, dm.acty_complt_yn);
		cstmt.setString(23, dm.carr_matt_1);
		cstmt.setString(24, dm.carr_matt_1_frdt);
		cstmt.setString(25, dm.carr_matt_1_todt);
		cstmt.setString(26, dm.carr_matt_1_instt);
		cstmt.setString(27, dm.carr_matt_2);
		cstmt.setString(28, dm.carr_matt_2_frdt);
		cstmt.setString(29, dm.carr_matt_2_todt);
		cstmt.setString(30, dm.carr_matt_2_instt);
		cstmt.setString(31, dm.carr_matt_3);
		cstmt.setString(32, dm.carr_matt_3_frdt);
		cstmt.setString(33, dm.carr_matt_3_todt);
		cstmt.setString(34, dm.carr_matt_3_instt);
		cstmt.setString(35, dm.blng_dpthd_evlu_idea);
		cstmt.setString(36, dm.etc);
		cstmt.setString(37, dm.incmg_pers_ipadd);
		cstmt.setString(38, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.info.ds.HD_INFO_2002_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("psgp_cd = [" + getPsgp_cd() + "]");
		System.out.println("intern_desty = [" + getIntern_desty() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("prn = [" + getPrn() + "]");
		System.out.println("tel_no = [" + getTel_no() + "]");
		System.out.println("univ_nm = [" + getUniv_nm() + "]");
		System.out.println("majr_nm = [" + getMajr_nm() + "]");
		System.out.println("univ_enty_yy = [" + getUniv_enty_yy() + "]");
		System.out.println("engl_test_nm = [" + getEngl_test_nm() + "]");
		System.out.println("engl_test_scor = [" + getEngl_test_scor() + "]");
		System.out.println("hby = [" + getHby() + "]");
		System.out.println("spc = [" + getSpc() + "]");
		System.out.println("acty_dept = [" + getActy_dept() + "]");
		System.out.println("acty_frdt = [" + getActy_frdt() + "]");
		System.out.println("acty_todt = [" + getActy_todt() + "]");
		System.out.println("acty_complt_yn = [" + getActy_complt_yn() + "]");
		System.out.println("carr_matt_1 = [" + getCarr_matt_1() + "]");
		System.out.println("carr_matt_1_frdt = [" + getCarr_matt_1_frdt() + "]");
		System.out.println("carr_matt_1_todt = [" + getCarr_matt_1_todt() + "]");
		System.out.println("carr_matt_1_instt = [" + getCarr_matt_1_instt() + "]");
		System.out.println("carr_matt_2 = [" + getCarr_matt_2() + "]");
		System.out.println("carr_matt_2_frdt = [" + getCarr_matt_2_frdt() + "]");
		System.out.println("carr_matt_2_todt = [" + getCarr_matt_2_todt() + "]");
		System.out.println("carr_matt_2_instt = [" + getCarr_matt_2_instt() + "]");
		System.out.println("carr_matt_3 = [" + getCarr_matt_3() + "]");
		System.out.println("carr_matt_3_frdt = [" + getCarr_matt_3_frdt() + "]");
		System.out.println("carr_matt_3_todt = [" + getCarr_matt_3_todt() + "]");
		System.out.println("carr_matt_3_instt = [" + getCarr_matt_3_instt() + "]");
		System.out.println("blng_dpthd_evlu_idea = [" + getBlng_dpthd_evlu_idea() + "]");
		System.out.println("etc = [" + getEtc() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String psgp_cd = req.getParameter("psgp_cd");
if( psgp_cd == null){
	System.out.println(this.toString+" : psgp_cd is null" );
}else{
	System.out.println(this.toString+" : psgp_cd is "+psgp_cd );
}
String intern_desty = req.getParameter("intern_desty");
if( intern_desty == null){
	System.out.println(this.toString+" : intern_desty is null" );
}else{
	System.out.println(this.toString+" : intern_desty is "+intern_desty );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
String tel_no = req.getParameter("tel_no");
if( tel_no == null){
	System.out.println(this.toString+" : tel_no is null" );
}else{
	System.out.println(this.toString+" : tel_no is "+tel_no );
}
String univ_nm = req.getParameter("univ_nm");
if( univ_nm == null){
	System.out.println(this.toString+" : univ_nm is null" );
}else{
	System.out.println(this.toString+" : univ_nm is "+univ_nm );
}
String majr_nm = req.getParameter("majr_nm");
if( majr_nm == null){
	System.out.println(this.toString+" : majr_nm is null" );
}else{
	System.out.println(this.toString+" : majr_nm is "+majr_nm );
}
String univ_enty_yy = req.getParameter("univ_enty_yy");
if( univ_enty_yy == null){
	System.out.println(this.toString+" : univ_enty_yy is null" );
}else{
	System.out.println(this.toString+" : univ_enty_yy is "+univ_enty_yy );
}
String engl_test_nm = req.getParameter("engl_test_nm");
if( engl_test_nm == null){
	System.out.println(this.toString+" : engl_test_nm is null" );
}else{
	System.out.println(this.toString+" : engl_test_nm is "+engl_test_nm );
}
String engl_test_scor = req.getParameter("engl_test_scor");
if( engl_test_scor == null){
	System.out.println(this.toString+" : engl_test_scor is null" );
}else{
	System.out.println(this.toString+" : engl_test_scor is "+engl_test_scor );
}
String hby = req.getParameter("hby");
if( hby == null){
	System.out.println(this.toString+" : hby is null" );
}else{
	System.out.println(this.toString+" : hby is "+hby );
}
String spc = req.getParameter("spc");
if( spc == null){
	System.out.println(this.toString+" : spc is null" );
}else{
	System.out.println(this.toString+" : spc is "+spc );
}
String acty_dept = req.getParameter("acty_dept");
if( acty_dept == null){
	System.out.println(this.toString+" : acty_dept is null" );
}else{
	System.out.println(this.toString+" : acty_dept is "+acty_dept );
}
String acty_frdt = req.getParameter("acty_frdt");
if( acty_frdt == null){
	System.out.println(this.toString+" : acty_frdt is null" );
}else{
	System.out.println(this.toString+" : acty_frdt is "+acty_frdt );
}
String acty_todt = req.getParameter("acty_todt");
if( acty_todt == null){
	System.out.println(this.toString+" : acty_todt is null" );
}else{
	System.out.println(this.toString+" : acty_todt is "+acty_todt );
}
String acty_complt_yn = req.getParameter("acty_complt_yn");
if( acty_complt_yn == null){
	System.out.println(this.toString+" : acty_complt_yn is null" );
}else{
	System.out.println(this.toString+" : acty_complt_yn is "+acty_complt_yn );
}
String carr_matt_1 = req.getParameter("carr_matt_1");
if( carr_matt_1 == null){
	System.out.println(this.toString+" : carr_matt_1 is null" );
}else{
	System.out.println(this.toString+" : carr_matt_1 is "+carr_matt_1 );
}
String carr_matt_1_frdt = req.getParameter("carr_matt_1_frdt");
if( carr_matt_1_frdt == null){
	System.out.println(this.toString+" : carr_matt_1_frdt is null" );
}else{
	System.out.println(this.toString+" : carr_matt_1_frdt is "+carr_matt_1_frdt );
}
String carr_matt_1_todt = req.getParameter("carr_matt_1_todt");
if( carr_matt_1_todt == null){
	System.out.println(this.toString+" : carr_matt_1_todt is null" );
}else{
	System.out.println(this.toString+" : carr_matt_1_todt is "+carr_matt_1_todt );
}
String carr_matt_1_instt = req.getParameter("carr_matt_1_instt");
if( carr_matt_1_instt == null){
	System.out.println(this.toString+" : carr_matt_1_instt is null" );
}else{
	System.out.println(this.toString+" : carr_matt_1_instt is "+carr_matt_1_instt );
}
String carr_matt_2 = req.getParameter("carr_matt_2");
if( carr_matt_2 == null){
	System.out.println(this.toString+" : carr_matt_2 is null" );
}else{
	System.out.println(this.toString+" : carr_matt_2 is "+carr_matt_2 );
}
String carr_matt_2_frdt = req.getParameter("carr_matt_2_frdt");
if( carr_matt_2_frdt == null){
	System.out.println(this.toString+" : carr_matt_2_frdt is null" );
}else{
	System.out.println(this.toString+" : carr_matt_2_frdt is "+carr_matt_2_frdt );
}
String carr_matt_2_todt = req.getParameter("carr_matt_2_todt");
if( carr_matt_2_todt == null){
	System.out.println(this.toString+" : carr_matt_2_todt is null" );
}else{
	System.out.println(this.toString+" : carr_matt_2_todt is "+carr_matt_2_todt );
}
String carr_matt_2_instt = req.getParameter("carr_matt_2_instt");
if( carr_matt_2_instt == null){
	System.out.println(this.toString+" : carr_matt_2_instt is null" );
}else{
	System.out.println(this.toString+" : carr_matt_2_instt is "+carr_matt_2_instt );
}
String carr_matt_3 = req.getParameter("carr_matt_3");
if( carr_matt_3 == null){
	System.out.println(this.toString+" : carr_matt_3 is null" );
}else{
	System.out.println(this.toString+" : carr_matt_3 is "+carr_matt_3 );
}
String carr_matt_3_frdt = req.getParameter("carr_matt_3_frdt");
if( carr_matt_3_frdt == null){
	System.out.println(this.toString+" : carr_matt_3_frdt is null" );
}else{
	System.out.println(this.toString+" : carr_matt_3_frdt is "+carr_matt_3_frdt );
}
String carr_matt_3_todt = req.getParameter("carr_matt_3_todt");
if( carr_matt_3_todt == null){
	System.out.println(this.toString+" : carr_matt_3_todt is null" );
}else{
	System.out.println(this.toString+" : carr_matt_3_todt is "+carr_matt_3_todt );
}
String carr_matt_3_instt = req.getParameter("carr_matt_3_instt");
if( carr_matt_3_instt == null){
	System.out.println(this.toString+" : carr_matt_3_instt is null" );
}else{
	System.out.println(this.toString+" : carr_matt_3_instt is "+carr_matt_3_instt );
}
String blng_dpthd_evlu_idea = req.getParameter("blng_dpthd_evlu_idea");
if( blng_dpthd_evlu_idea == null){
	System.out.println(this.toString+" : blng_dpthd_evlu_idea is null" );
}else{
	System.out.println(this.toString+" : blng_dpthd_evlu_idea is "+blng_dpthd_evlu_idea );
}
String etc = req.getParameter("etc");
if( etc == null){
	System.out.println(this.toString+" : etc is null" );
}else{
	System.out.println(this.toString+" : etc is "+etc );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String psgp_cd = Util.checkString(req.getParameter("psgp_cd"));
String intern_desty = Util.checkString(req.getParameter("intern_desty"));
String flnm = Util.checkString(req.getParameter("flnm"));
String prn = Util.checkString(req.getParameter("prn"));
String tel_no = Util.checkString(req.getParameter("tel_no"));
String univ_nm = Util.checkString(req.getParameter("univ_nm"));
String majr_nm = Util.checkString(req.getParameter("majr_nm"));
String univ_enty_yy = Util.checkString(req.getParameter("univ_enty_yy"));
String engl_test_nm = Util.checkString(req.getParameter("engl_test_nm"));
String engl_test_scor = Util.checkString(req.getParameter("engl_test_scor"));
String hby = Util.checkString(req.getParameter("hby"));
String spc = Util.checkString(req.getParameter("spc"));
String acty_dept = Util.checkString(req.getParameter("acty_dept"));
String acty_frdt = Util.checkString(req.getParameter("acty_frdt"));
String acty_todt = Util.checkString(req.getParameter("acty_todt"));
String acty_complt_yn = Util.checkString(req.getParameter("acty_complt_yn"));
String carr_matt_1 = Util.checkString(req.getParameter("carr_matt_1"));
String carr_matt_1_frdt = Util.checkString(req.getParameter("carr_matt_1_frdt"));
String carr_matt_1_todt = Util.checkString(req.getParameter("carr_matt_1_todt"));
String carr_matt_1_instt = Util.checkString(req.getParameter("carr_matt_1_instt"));
String carr_matt_2 = Util.checkString(req.getParameter("carr_matt_2"));
String carr_matt_2_frdt = Util.checkString(req.getParameter("carr_matt_2_frdt"));
String carr_matt_2_todt = Util.checkString(req.getParameter("carr_matt_2_todt"));
String carr_matt_2_instt = Util.checkString(req.getParameter("carr_matt_2_instt"));
String carr_matt_3 = Util.checkString(req.getParameter("carr_matt_3"));
String carr_matt_3_frdt = Util.checkString(req.getParameter("carr_matt_3_frdt"));
String carr_matt_3_todt = Util.checkString(req.getParameter("carr_matt_3_todt"));
String carr_matt_3_instt = Util.checkString(req.getParameter("carr_matt_3_instt"));
String blng_dpthd_evlu_idea = Util.checkString(req.getParameter("blng_dpthd_evlu_idea"));
String etc = Util.checkString(req.getParameter("etc"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String psgp_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("psgp_cd")));
String intern_desty = Util.Uni2Ksc(Util.checkString(req.getParameter("intern_desty")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no")));
String univ_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("univ_nm")));
String majr_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("majr_nm")));
String univ_enty_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("univ_enty_yy")));
String engl_test_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("engl_test_nm")));
String engl_test_scor = Util.Uni2Ksc(Util.checkString(req.getParameter("engl_test_scor")));
String hby = Util.Uni2Ksc(Util.checkString(req.getParameter("hby")));
String spc = Util.Uni2Ksc(Util.checkString(req.getParameter("spc")));
String acty_dept = Util.Uni2Ksc(Util.checkString(req.getParameter("acty_dept")));
String acty_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("acty_frdt")));
String acty_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("acty_todt")));
String acty_complt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("acty_complt_yn")));
String carr_matt_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("carr_matt_1")));
String carr_matt_1_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("carr_matt_1_frdt")));
String carr_matt_1_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("carr_matt_1_todt")));
String carr_matt_1_instt = Util.Uni2Ksc(Util.checkString(req.getParameter("carr_matt_1_instt")));
String carr_matt_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("carr_matt_2")));
String carr_matt_2_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("carr_matt_2_frdt")));
String carr_matt_2_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("carr_matt_2_todt")));
String carr_matt_2_instt = Util.Uni2Ksc(Util.checkString(req.getParameter("carr_matt_2_instt")));
String carr_matt_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("carr_matt_3")));
String carr_matt_3_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("carr_matt_3_frdt")));
String carr_matt_3_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("carr_matt_3_todt")));
String carr_matt_3_instt = Util.Uni2Ksc(Util.checkString(req.getParameter("carr_matt_3_instt")));
String blng_dpthd_evlu_idea = Util.Uni2Ksc(Util.checkString(req.getParameter("blng_dpthd_evlu_idea")));
String etc = Util.Uni2Ksc(Util.checkString(req.getParameter("etc")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setPsgp_cd(psgp_cd);
dm.setIntern_desty(intern_desty);
dm.setFlnm(flnm);
dm.setPrn(prn);
dm.setTel_no(tel_no);
dm.setUniv_nm(univ_nm);
dm.setMajr_nm(majr_nm);
dm.setUniv_enty_yy(univ_enty_yy);
dm.setEngl_test_nm(engl_test_nm);
dm.setEngl_test_scor(engl_test_scor);
dm.setHby(hby);
dm.setSpc(spc);
dm.setActy_dept(acty_dept);
dm.setActy_frdt(acty_frdt);
dm.setActy_todt(acty_todt);
dm.setActy_complt_yn(acty_complt_yn);
dm.setCarr_matt_1(carr_matt_1);
dm.setCarr_matt_1_frdt(carr_matt_1_frdt);
dm.setCarr_matt_1_todt(carr_matt_1_todt);
dm.setCarr_matt_1_instt(carr_matt_1_instt);
dm.setCarr_matt_2(carr_matt_2);
dm.setCarr_matt_2_frdt(carr_matt_2_frdt);
dm.setCarr_matt_2_todt(carr_matt_2_todt);
dm.setCarr_matt_2_instt(carr_matt_2_instt);
dm.setCarr_matt_3(carr_matt_3);
dm.setCarr_matt_3_frdt(carr_matt_3_frdt);
dm.setCarr_matt_3_todt(carr_matt_3_todt);
dm.setCarr_matt_3_instt(carr_matt_3_instt);
dm.setBlng_dpthd_evlu_idea(blng_dpthd_evlu_idea);
dm.setEtc(etc);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 28 13:46:39 KST 2009 */