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


public class HD_SALY_6220_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String cmpy_blng_cd;
	public String fit_yy;
	public String fit_no;
	public String nm_korn;
	public String tel_no;
	public String fitness_dus;
	public String locker_yn;
	public String locker_pay;
	public String fitness_sum;
	public String remk;
	public String magam_yn;
	public String mang_no;
	public String occr_dt;
	public String seq;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_SALY_6220_ADM(){}
	public HD_SALY_6220_ADM(String mode, String cmpy_cd, String cmpy_blng_cd, String fit_yy, String fit_no, String nm_korn, String tel_no, String fitness_dus, String locker_yn, String locker_pay, String fitness_sum, String remk, String magam_yn, String mang_no, String occr_dt, String seq, String incmg_pers_ipadd, String incmg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.cmpy_blng_cd = cmpy_blng_cd;
		this.fit_yy = fit_yy;
		this.fit_no = fit_no;
		this.nm_korn = nm_korn;
		this.tel_no = tel_no;
		this.fitness_dus = fitness_dus;
		this.locker_yn = locker_yn;
		this.locker_pay = locker_pay;
		this.fitness_sum = fitness_sum;
		this.remk = remk;
		this.magam_yn = magam_yn;
		this.mang_no = mang_no;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCmpy_blng_cd(String cmpy_blng_cd){
		this.cmpy_blng_cd = cmpy_blng_cd;
	}

	public void setFit_yy(String fit_yy){
		this.fit_yy = fit_yy;
	}

	public void setFit_no(String fit_no){
		this.fit_no = fit_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setFitness_dus(String fitness_dus){
		this.fitness_dus = fitness_dus;
	}

	public void setLocker_yn(String locker_yn){
		this.locker_yn = locker_yn;
	}

	public void setLocker_pay(String locker_pay){
		this.locker_pay = locker_pay;
	}

	public void setFitness_sum(String fitness_sum){
		this.fitness_sum = fitness_sum;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setMagam_yn(String magam_yn){
		this.magam_yn = magam_yn;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCmpy_blng_cd(){
		return this.cmpy_blng_cd;
	}

	public String getFit_yy(){
		return this.fit_yy;
	}

	public String getFit_no(){
		return this.fit_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getFitness_dus(){
		return this.fitness_dus;
	}

	public String getLocker_yn(){
		return this.locker_yn;
	}

	public String getLocker_pay(){
		return this.locker_pay;
	}

	public String getFitness_sum(){
		return this.fitness_sum;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getMagam_yn(){
		return this.magam_yn;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_6220_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_6220_ADM dm = (HD_SALY_6220_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.cmpy_blng_cd);
		cstmt.setString(6, dm.fit_yy);
		cstmt.setString(7, dm.fit_no);
		cstmt.setString(8, dm.nm_korn);
		cstmt.setString(9, dm.tel_no);
		cstmt.setString(10, dm.fitness_dus);
		cstmt.setString(11, dm.locker_yn);
		cstmt.setString(12, dm.locker_pay);
		cstmt.setString(13, dm.fitness_sum);
		cstmt.setString(14, dm.remk);
		cstmt.setString(15, dm.magam_yn);
		cstmt.setString(16, dm.mang_no);
		cstmt.setString(17, dm.occr_dt);
		cstmt.setString(18, dm.seq);
		cstmt.setString(19, dm.incmg_pers_ipadd);
		cstmt.setString(20, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.saly.ds.HD_SALY_6220_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("cmpy_blng_cd = [" + getCmpy_blng_cd() + "]");
		System.out.println("fit_yy = [" + getFit_yy() + "]");
		System.out.println("fit_no = [" + getFit_no() + "]");
		System.out.println("nm_korn = [" + getNm_korn() + "]");
		System.out.println("tel_no = [" + getTel_no() + "]");
		System.out.println("fitness_dus = [" + getFitness_dus() + "]");
		System.out.println("locker_yn = [" + getLocker_yn() + "]");
		System.out.println("locker_pay = [" + getLocker_pay() + "]");
		System.out.println("fitness_sum = [" + getFitness_sum() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("magam_yn = [" + getMagam_yn() + "]");
		System.out.println("mang_no = [" + getMang_no() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String cmpy_blng_cd = req.getParameter("cmpy_blng_cd");
if( cmpy_blng_cd == null){
	System.out.println(this.toString+" : cmpy_blng_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_blng_cd is "+cmpy_blng_cd );
}
String fit_yy = req.getParameter("fit_yy");
if( fit_yy == null){
	System.out.println(this.toString+" : fit_yy is null" );
}else{
	System.out.println(this.toString+" : fit_yy is "+fit_yy );
}
String fit_no = req.getParameter("fit_no");
if( fit_no == null){
	System.out.println(this.toString+" : fit_no is null" );
}else{
	System.out.println(this.toString+" : fit_no is "+fit_no );
}
String nm_korn = req.getParameter("nm_korn");
if( nm_korn == null){
	System.out.println(this.toString+" : nm_korn is null" );
}else{
	System.out.println(this.toString+" : nm_korn is "+nm_korn );
}
String tel_no = req.getParameter("tel_no");
if( tel_no == null){
	System.out.println(this.toString+" : tel_no is null" );
}else{
	System.out.println(this.toString+" : tel_no is "+tel_no );
}
String fitness_dus = req.getParameter("fitness_dus");
if( fitness_dus == null){
	System.out.println(this.toString+" : fitness_dus is null" );
}else{
	System.out.println(this.toString+" : fitness_dus is "+fitness_dus );
}
String locker_yn = req.getParameter("locker_yn");
if( locker_yn == null){
	System.out.println(this.toString+" : locker_yn is null" );
}else{
	System.out.println(this.toString+" : locker_yn is "+locker_yn );
}
String locker_pay = req.getParameter("locker_pay");
if( locker_pay == null){
	System.out.println(this.toString+" : locker_pay is null" );
}else{
	System.out.println(this.toString+" : locker_pay is "+locker_pay );
}
String fitness_sum = req.getParameter("fitness_sum");
if( fitness_sum == null){
	System.out.println(this.toString+" : fitness_sum is null" );
}else{
	System.out.println(this.toString+" : fitness_sum is "+fitness_sum );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String magam_yn = req.getParameter("magam_yn");
if( magam_yn == null){
	System.out.println(this.toString+" : magam_yn is null" );
}else{
	System.out.println(this.toString+" : magam_yn is "+magam_yn );
}
String mang_no = req.getParameter("mang_no");
if( mang_no == null){
	System.out.println(this.toString+" : mang_no is null" );
}else{
	System.out.println(this.toString+" : mang_no is "+mang_no );
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

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String cmpy_blng_cd = Util.checkString(req.getParameter("cmpy_blng_cd"));
String fit_yy = Util.checkString(req.getParameter("fit_yy"));
String fit_no = Util.checkString(req.getParameter("fit_no"));
String nm_korn = Util.checkString(req.getParameter("nm_korn"));
String tel_no = Util.checkString(req.getParameter("tel_no"));
String fitness_dus = Util.checkString(req.getParameter("fitness_dus"));
String locker_yn = Util.checkString(req.getParameter("locker_yn"));
String locker_pay = Util.checkString(req.getParameter("locker_pay"));
String fitness_sum = Util.checkString(req.getParameter("fitness_sum"));
String remk = Util.checkString(req.getParameter("remk"));
String magam_yn = Util.checkString(req.getParameter("magam_yn"));
String mang_no = Util.checkString(req.getParameter("mang_no"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String cmpy_blng_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_blng_cd")));
String fit_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("fit_yy")));
String fit_no = Util.Uni2Ksc(Util.checkString(req.getParameter("fit_no")));
String nm_korn = Util.Uni2Ksc(Util.checkString(req.getParameter("nm_korn")));
String tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no")));
String fitness_dus = Util.Uni2Ksc(Util.checkString(req.getParameter("fitness_dus")));
String locker_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("locker_yn")));
String locker_pay = Util.Uni2Ksc(Util.checkString(req.getParameter("locker_pay")));
String fitness_sum = Util.Uni2Ksc(Util.checkString(req.getParameter("fitness_sum")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String magam_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("magam_yn")));
String mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_no")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setCmpy_blng_cd(cmpy_blng_cd);
dm.setFit_yy(fit_yy);
dm.setFit_no(fit_no);
dm.setNm_korn(nm_korn);
dm.setTel_no(tel_no);
dm.setFitness_dus(fitness_dus);
dm.setLocker_yn(locker_yn);
dm.setLocker_pay(locker_pay);
dm.setFitness_sum(fitness_sum);
dm.setRemk(remk);
dm.setMagam_yn(magam_yn);
dm.setMang_no(mang_no);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Sep 17 14:21:49 KST 2015 */