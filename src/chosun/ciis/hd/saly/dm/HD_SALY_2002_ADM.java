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


public class HD_SALY_2002_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String aply_basi_dt;
	public String new_apst_dt;
	public String mode;
	public String seq;
	public String dspch_enpr_main_clsf;
	public String presi_flnm;
	public String eps_no;
	public String zip1;
	public String zip2;
	public String addr;
	public String dtls_addr;
	public String servcost_calc_rate;
	public String mang_liab_pers_flnm;
	public String mang_liab_pers_prn;

	public HD_SALY_2002_ADM(){}
	public HD_SALY_2002_ADM(String cmpy_cd, String incmg_pers_ip, String incmg_pers, String aply_basi_dt, String new_apst_dt, String mode, String seq, String dspch_enpr_main_clsf, String presi_flnm, String eps_no, String zip1, String zip2, String addr, String dtls_addr, String servcost_calc_rate, String mang_liab_pers_flnm, String mang_liab_pers_prn){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.aply_basi_dt = aply_basi_dt;
		this.new_apst_dt = new_apst_dt;
		this.mode = mode;
		this.seq = seq;
		this.dspch_enpr_main_clsf = dspch_enpr_main_clsf;
		this.presi_flnm = presi_flnm;
		this.eps_no = eps_no;
		this.zip1 = zip1;
		this.zip2 = zip2;
		this.addr = addr;
		this.dtls_addr = dtls_addr;
		this.servcost_calc_rate = servcost_calc_rate;
		this.mang_liab_pers_flnm = mang_liab_pers_flnm;
		this.mang_liab_pers_prn = mang_liab_pers_prn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setAply_basi_dt(String aply_basi_dt){
		this.aply_basi_dt = aply_basi_dt;
	}

	public void setNew_apst_dt(String new_apst_dt){
		this.new_apst_dt = new_apst_dt;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDspch_enpr_main_clsf(String dspch_enpr_main_clsf){
		this.dspch_enpr_main_clsf = dspch_enpr_main_clsf;
	}

	public void setPresi_flnm(String presi_flnm){
		this.presi_flnm = presi_flnm;
	}

	public void setEps_no(String eps_no){
		this.eps_no = eps_no;
	}

	public void setZip1(String zip1){
		this.zip1 = zip1;
	}

	public void setZip2(String zip2){
		this.zip2 = zip2;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtls_addr(String dtls_addr){
		this.dtls_addr = dtls_addr;
	}

	public void setServcost_calc_rate(String servcost_calc_rate){
		this.servcost_calc_rate = servcost_calc_rate;
	}

	public void setMang_liab_pers_flnm(String mang_liab_pers_flnm){
		this.mang_liab_pers_flnm = mang_liab_pers_flnm;
	}

	public void setMang_liab_pers_prn(String mang_liab_pers_prn){
		this.mang_liab_pers_prn = mang_liab_pers_prn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getAply_basi_dt(){
		return this.aply_basi_dt;
	}

	public String getNew_apst_dt(){
		return this.new_apst_dt;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDspch_enpr_main_clsf(){
		return this.dspch_enpr_main_clsf;
	}

	public String getPresi_flnm(){
		return this.presi_flnm;
	}

	public String getEps_no(){
		return this.eps_no;
	}

	public String getZip1(){
		return this.zip1;
	}

	public String getZip2(){
		return this.zip2;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtls_addr(){
		return this.dtls_addr;
	}

	public String getServcost_calc_rate(){
		return this.servcost_calc_rate;
	}

	public String getMang_liab_pers_flnm(){
		return this.mang_liab_pers_flnm;
	}

	public String getMang_liab_pers_prn(){
		return this.mang_liab_pers_prn;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_2002_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_2002_ADM dm = (HD_SALY_2002_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers_ip);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.aply_basi_dt);
		cstmt.setString(7, dm.new_apst_dt);
		cstmt.setString(8, dm.mode);
		cstmt.setString(9, dm.seq);
		cstmt.setString(10, dm.dspch_enpr_main_clsf);
		cstmt.setString(11, dm.presi_flnm);
		cstmt.setString(12, dm.eps_no);
		cstmt.setString(13, dm.zip1);
		cstmt.setString(14, dm.zip2);
		cstmt.setString(15, dm.addr);
		cstmt.setString(16, dm.dtls_addr);
		cstmt.setString(17, dm.servcost_calc_rate);
		cstmt.setString(18, dm.mang_liab_pers_flnm);
		cstmt.setString(19, dm.mang_liab_pers_prn);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.saly.ds.HD_SALY_2002_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("aply_basi_dt = [" + getAply_basi_dt() + "]");
		System.out.println("new_apst_dt = [" + getNew_apst_dt() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("dspch_enpr_main_clsf = [" + getDspch_enpr_main_clsf() + "]");
		System.out.println("presi_flnm = [" + getPresi_flnm() + "]");
		System.out.println("eps_no = [" + getEps_no() + "]");
		System.out.println("zip1 = [" + getZip1() + "]");
		System.out.println("zip2 = [" + getZip2() + "]");
		System.out.println("addr = [" + getAddr() + "]");
		System.out.println("dtls_addr = [" + getDtls_addr() + "]");
		System.out.println("servcost_calc_rate = [" + getServcost_calc_rate() + "]");
		System.out.println("mang_liab_pers_flnm = [" + getMang_liab_pers_flnm() + "]");
		System.out.println("mang_liab_pers_prn = [" + getMang_liab_pers_prn() + "]");
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
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String aply_basi_dt = req.getParameter("aply_basi_dt");
if( aply_basi_dt == null){
	System.out.println(this.toString+" : aply_basi_dt is null" );
}else{
	System.out.println(this.toString+" : aply_basi_dt is "+aply_basi_dt );
}
String new_apst_dt = req.getParameter("new_apst_dt");
if( new_apst_dt == null){
	System.out.println(this.toString+" : new_apst_dt is null" );
}else{
	System.out.println(this.toString+" : new_apst_dt is "+new_apst_dt );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String dspch_enpr_main_clsf = req.getParameter("dspch_enpr_main_clsf");
if( dspch_enpr_main_clsf == null){
	System.out.println(this.toString+" : dspch_enpr_main_clsf is null" );
}else{
	System.out.println(this.toString+" : dspch_enpr_main_clsf is "+dspch_enpr_main_clsf );
}
String presi_flnm = req.getParameter("presi_flnm");
if( presi_flnm == null){
	System.out.println(this.toString+" : presi_flnm is null" );
}else{
	System.out.println(this.toString+" : presi_flnm is "+presi_flnm );
}
String eps_no = req.getParameter("eps_no");
if( eps_no == null){
	System.out.println(this.toString+" : eps_no is null" );
}else{
	System.out.println(this.toString+" : eps_no is "+eps_no );
}
String zip1 = req.getParameter("zip1");
if( zip1 == null){
	System.out.println(this.toString+" : zip1 is null" );
}else{
	System.out.println(this.toString+" : zip1 is "+zip1 );
}
String zip2 = req.getParameter("zip2");
if( zip2 == null){
	System.out.println(this.toString+" : zip2 is null" );
}else{
	System.out.println(this.toString+" : zip2 is "+zip2 );
}
String addr = req.getParameter("addr");
if( addr == null){
	System.out.println(this.toString+" : addr is null" );
}else{
	System.out.println(this.toString+" : addr is "+addr );
}
String dtls_addr = req.getParameter("dtls_addr");
if( dtls_addr == null){
	System.out.println(this.toString+" : dtls_addr is null" );
}else{
	System.out.println(this.toString+" : dtls_addr is "+dtls_addr );
}
String servcost_calc_rate = req.getParameter("servcost_calc_rate");
if( servcost_calc_rate == null){
	System.out.println(this.toString+" : servcost_calc_rate is null" );
}else{
	System.out.println(this.toString+" : servcost_calc_rate is "+servcost_calc_rate );
}
String mang_liab_pers_flnm = req.getParameter("mang_liab_pers_flnm");
if( mang_liab_pers_flnm == null){
	System.out.println(this.toString+" : mang_liab_pers_flnm is null" );
}else{
	System.out.println(this.toString+" : mang_liab_pers_flnm is "+mang_liab_pers_flnm );
}
String mang_liab_pers_prn = req.getParameter("mang_liab_pers_prn");
if( mang_liab_pers_prn == null){
	System.out.println(this.toString+" : mang_liab_pers_prn is null" );
}else{
	System.out.println(this.toString+" : mang_liab_pers_prn is "+mang_liab_pers_prn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String aply_basi_dt = Util.checkString(req.getParameter("aply_basi_dt"));
String new_apst_dt = Util.checkString(req.getParameter("new_apst_dt"));
String mode = Util.checkString(req.getParameter("mode"));
String seq = Util.checkString(req.getParameter("seq"));
String dspch_enpr_main_clsf = Util.checkString(req.getParameter("dspch_enpr_main_clsf"));
String presi_flnm = Util.checkString(req.getParameter("presi_flnm"));
String eps_no = Util.checkString(req.getParameter("eps_no"));
String zip1 = Util.checkString(req.getParameter("zip1"));
String zip2 = Util.checkString(req.getParameter("zip2"));
String addr = Util.checkString(req.getParameter("addr"));
String dtls_addr = Util.checkString(req.getParameter("dtls_addr"));
String servcost_calc_rate = Util.checkString(req.getParameter("servcost_calc_rate"));
String mang_liab_pers_flnm = Util.checkString(req.getParameter("mang_liab_pers_flnm"));
String mang_liab_pers_prn = Util.checkString(req.getParameter("mang_liab_pers_prn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String aply_basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_basi_dt")));
String new_apst_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("new_apst_dt")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String dspch_enpr_main_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dspch_enpr_main_clsf")));
String presi_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("presi_flnm")));
String eps_no = Util.Uni2Ksc(Util.checkString(req.getParameter("eps_no")));
String zip1 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip1")));
String zip2 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip2")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String dtls_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_addr")));
String servcost_calc_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("servcost_calc_rate")));
String mang_liab_pers_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_liab_pers_flnm")));
String mang_liab_pers_prn = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_liab_pers_prn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setAply_basi_dt(aply_basi_dt);
dm.setNew_apst_dt(new_apst_dt);
dm.setMode(mode);
dm.setSeq(seq);
dm.setDspch_enpr_main_clsf(dspch_enpr_main_clsf);
dm.setPresi_flnm(presi_flnm);
dm.setEps_no(eps_no);
dm.setZip1(zip1);
dm.setZip2(zip2);
dm.setAddr(addr);
dm.setDtls_addr(dtls_addr);
dm.setServcost_calc_rate(servcost_calc_rate);
dm.setMang_liab_pers_flnm(mang_liab_pers_flnm);
dm.setMang_liab_pers_prn(mang_liab_pers_prn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Sep 04 11:06:21 KST 2009 */