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


package chosun.ciis.mt.papord.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papord.ds.*;
import chosun.ciis.mt.papord.rec.*;

/**
 * 
 */


public class MT_PAPORD_5004_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String mode;
	public String ordr_dt;
	public String fac_clsf;
	public String matr_cd;
	public String papcmpy_cd;
	public String roll_wgt;
	public String expt_roll_cnt;
	public String expt_wgt;
	public String ordr_roll_cnt;
	public String ordr_wgt;
	public String car_occr_dt;
	public String car_seq;
	public String car_prd_cnt;
	public String mix_ordr_dt;
	public String mix_papcmpy_cd;
	public String mix_matr_cd;
	public String mix_roll;
	public String mix_wgt;
	public String mix_car_occr_dt;
	public String mix_car_seq;

	public MT_PAPORD_5004_ADM(){}
	public MT_PAPORD_5004_ADM(String cmpy_cd, String incmg_pers_ipaddr, String incmg_pers, String mode, String ordr_dt, String fac_clsf, String matr_cd, String papcmpy_cd, String roll_wgt, String expt_roll_cnt, String expt_wgt, String ordr_roll_cnt, String ordr_wgt, String car_occr_dt, String car_seq, String car_prd_cnt, String mix_ordr_dt, String mix_papcmpy_cd, String mix_matr_cd, String mix_roll, String mix_wgt, String mix_car_occr_dt, String mix_car_seq){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.mode = mode;
		this.ordr_dt = ordr_dt;
		this.fac_clsf = fac_clsf;
		this.matr_cd = matr_cd;
		this.papcmpy_cd = papcmpy_cd;
		this.roll_wgt = roll_wgt;
		this.expt_roll_cnt = expt_roll_cnt;
		this.expt_wgt = expt_wgt;
		this.ordr_roll_cnt = ordr_roll_cnt;
		this.ordr_wgt = ordr_wgt;
		this.car_occr_dt = car_occr_dt;
		this.car_seq = car_seq;
		this.car_prd_cnt = car_prd_cnt;
		this.mix_ordr_dt = mix_ordr_dt;
		this.mix_papcmpy_cd = mix_papcmpy_cd;
		this.mix_matr_cd = mix_matr_cd;
		this.mix_roll = mix_roll;
		this.mix_wgt = mix_wgt;
		this.mix_car_occr_dt = mix_car_occr_dt;
		this.mix_car_seq = mix_car_seq;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setOrdr_dt(String ordr_dt){
		this.ordr_dt = ordr_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setPapcmpy_cd(String papcmpy_cd){
		this.papcmpy_cd = papcmpy_cd;
	}

	public void setRoll_wgt(String roll_wgt){
		this.roll_wgt = roll_wgt;
	}

	public void setExpt_roll_cnt(String expt_roll_cnt){
		this.expt_roll_cnt = expt_roll_cnt;
	}

	public void setExpt_wgt(String expt_wgt){
		this.expt_wgt = expt_wgt;
	}

	public void setOrdr_roll_cnt(String ordr_roll_cnt){
		this.ordr_roll_cnt = ordr_roll_cnt;
	}

	public void setOrdr_wgt(String ordr_wgt){
		this.ordr_wgt = ordr_wgt;
	}

	public void setCar_occr_dt(String car_occr_dt){
		this.car_occr_dt = car_occr_dt;
	}

	public void setCar_seq(String car_seq){
		this.car_seq = car_seq;
	}

	public void setCar_prd_cnt(String car_prd_cnt){
		this.car_prd_cnt = car_prd_cnt;
	}

	public void setMix_ordr_dt(String mix_ordr_dt){
		this.mix_ordr_dt = mix_ordr_dt;
	}

	public void setMix_papcmpy_cd(String mix_papcmpy_cd){
		this.mix_papcmpy_cd = mix_papcmpy_cd;
	}

	public void setMix_matr_cd(String mix_matr_cd){
		this.mix_matr_cd = mix_matr_cd;
	}

	public void setMix_roll(String mix_roll){
		this.mix_roll = mix_roll;
	}

	public void setMix_wgt(String mix_wgt){
		this.mix_wgt = mix_wgt;
	}

	public void setMix_car_occr_dt(String mix_car_occr_dt){
		this.mix_car_occr_dt = mix_car_occr_dt;
	}

	public void setMix_car_seq(String mix_car_seq){
		this.mix_car_seq = mix_car_seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getOrdr_dt(){
		return this.ordr_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getPapcmpy_cd(){
		return this.papcmpy_cd;
	}

	public String getRoll_wgt(){
		return this.roll_wgt;
	}

	public String getExpt_roll_cnt(){
		return this.expt_roll_cnt;
	}

	public String getExpt_wgt(){
		return this.expt_wgt;
	}

	public String getOrdr_roll_cnt(){
		return this.ordr_roll_cnt;
	}

	public String getOrdr_wgt(){
		return this.ordr_wgt;
	}

	public String getCar_occr_dt(){
		return this.car_occr_dt;
	}

	public String getCar_seq(){
		return this.car_seq;
	}

	public String getCar_prd_cnt(){
		return this.car_prd_cnt;
	}

	public String getMix_ordr_dt(){
		return this.mix_ordr_dt;
	}

	public String getMix_papcmpy_cd(){
		return this.mix_papcmpy_cd;
	}

	public String getMix_matr_cd(){
		return this.mix_matr_cd;
	}

	public String getMix_roll(){
		return this.mix_roll;
	}

	public String getMix_wgt(){
		return this.mix_wgt;
	}

	public String getMix_car_occr_dt(){
		return this.mix_car_occr_dt;
	}

	public String getMix_car_seq(){
		return this.mix_car_seq;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPORD_5004_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPORD_5004_ADM dm = (MT_PAPORD_5004_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers_ipaddr);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.mode);
		cstmt.setString(7, dm.ordr_dt);
		cstmt.setString(8, dm.fac_clsf);
		cstmt.setString(9, dm.matr_cd);
		cstmt.setString(10, dm.papcmpy_cd);
		cstmt.setString(11, dm.roll_wgt);
		cstmt.setString(12, dm.expt_roll_cnt);
		cstmt.setString(13, dm.expt_wgt);
		cstmt.setString(14, dm.ordr_roll_cnt);
		cstmt.setString(15, dm.ordr_wgt);
		cstmt.setString(16, dm.car_occr_dt);
		cstmt.setString(17, dm.car_seq);
		cstmt.setString(18, dm.car_prd_cnt);
		cstmt.setString(19, dm.mix_ordr_dt);
		cstmt.setString(20, dm.mix_papcmpy_cd);
		cstmt.setString(21, dm.mix_matr_cd);
		cstmt.setString(22, dm.mix_roll);
		cstmt.setString(23, dm.mix_wgt);
		cstmt.setString(24, dm.mix_car_occr_dt);
		cstmt.setString(25, dm.mix_car_seq);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papord.ds.MT_PAPORD_5004_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("ordr_dt = [" + getOrdr_dt() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
		System.out.println("papcmpy_cd = [" + getPapcmpy_cd() + "]");
		System.out.println("roll_wgt = [" + getRoll_wgt() + "]");
		System.out.println("expt_roll_cnt = [" + getExpt_roll_cnt() + "]");
		System.out.println("expt_wgt = [" + getExpt_wgt() + "]");
		System.out.println("ordr_roll_cnt = [" + getOrdr_roll_cnt() + "]");
		System.out.println("ordr_wgt = [" + getOrdr_wgt() + "]");
		System.out.println("car_occr_dt = [" + getCar_occr_dt() + "]");
		System.out.println("car_seq = [" + getCar_seq() + "]");
		System.out.println("car_prd_cnt = [" + getCar_prd_cnt() + "]");
		System.out.println("mix_ordr_dt = [" + getMix_ordr_dt() + "]");
		System.out.println("mix_papcmpy_cd = [" + getMix_papcmpy_cd() + "]");
		System.out.println("mix_matr_cd = [" + getMix_matr_cd() + "]");
		System.out.println("mix_roll = [" + getMix_roll() + "]");
		System.out.println("mix_wgt = [" + getMix_wgt() + "]");
		System.out.println("mix_car_occr_dt = [" + getMix_car_occr_dt() + "]");
		System.out.println("mix_car_seq = [" + getMix_car_seq() + "]");
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
String incmg_pers_ipaddr = req.getParameter("incmg_pers_ipaddr");
if( incmg_pers_ipaddr == null){
	System.out.println(this.toString+" : incmg_pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipaddr is "+incmg_pers_ipaddr );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String ordr_dt = req.getParameter("ordr_dt");
if( ordr_dt == null){
	System.out.println(this.toString+" : ordr_dt is null" );
}else{
	System.out.println(this.toString+" : ordr_dt is "+ordr_dt );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
String papcmpy_cd = req.getParameter("papcmpy_cd");
if( papcmpy_cd == null){
	System.out.println(this.toString+" : papcmpy_cd is null" );
}else{
	System.out.println(this.toString+" : papcmpy_cd is "+papcmpy_cd );
}
String roll_wgt = req.getParameter("roll_wgt");
if( roll_wgt == null){
	System.out.println(this.toString+" : roll_wgt is null" );
}else{
	System.out.println(this.toString+" : roll_wgt is "+roll_wgt );
}
String expt_roll_cnt = req.getParameter("expt_roll_cnt");
if( expt_roll_cnt == null){
	System.out.println(this.toString+" : expt_roll_cnt is null" );
}else{
	System.out.println(this.toString+" : expt_roll_cnt is "+expt_roll_cnt );
}
String expt_wgt = req.getParameter("expt_wgt");
if( expt_wgt == null){
	System.out.println(this.toString+" : expt_wgt is null" );
}else{
	System.out.println(this.toString+" : expt_wgt is "+expt_wgt );
}
String ordr_roll_cnt = req.getParameter("ordr_roll_cnt");
if( ordr_roll_cnt == null){
	System.out.println(this.toString+" : ordr_roll_cnt is null" );
}else{
	System.out.println(this.toString+" : ordr_roll_cnt is "+ordr_roll_cnt );
}
String ordr_wgt = req.getParameter("ordr_wgt");
if( ordr_wgt == null){
	System.out.println(this.toString+" : ordr_wgt is null" );
}else{
	System.out.println(this.toString+" : ordr_wgt is "+ordr_wgt );
}
String car_occr_dt = req.getParameter("car_occr_dt");
if( car_occr_dt == null){
	System.out.println(this.toString+" : car_occr_dt is null" );
}else{
	System.out.println(this.toString+" : car_occr_dt is "+car_occr_dt );
}
String car_seq = req.getParameter("car_seq");
if( car_seq == null){
	System.out.println(this.toString+" : car_seq is null" );
}else{
	System.out.println(this.toString+" : car_seq is "+car_seq );
}
String car_prd_cnt = req.getParameter("car_prd_cnt");
if( car_prd_cnt == null){
	System.out.println(this.toString+" : car_prd_cnt is null" );
}else{
	System.out.println(this.toString+" : car_prd_cnt is "+car_prd_cnt );
}
String mix_ordr_dt = req.getParameter("mix_ordr_dt");
if( mix_ordr_dt == null){
	System.out.println(this.toString+" : mix_ordr_dt is null" );
}else{
	System.out.println(this.toString+" : mix_ordr_dt is "+mix_ordr_dt );
}
String mix_papcmpy_cd = req.getParameter("mix_papcmpy_cd");
if( mix_papcmpy_cd == null){
	System.out.println(this.toString+" : mix_papcmpy_cd is null" );
}else{
	System.out.println(this.toString+" : mix_papcmpy_cd is "+mix_papcmpy_cd );
}
String mix_matr_cd = req.getParameter("mix_matr_cd");
if( mix_matr_cd == null){
	System.out.println(this.toString+" : mix_matr_cd is null" );
}else{
	System.out.println(this.toString+" : mix_matr_cd is "+mix_matr_cd );
}
String mix_roll = req.getParameter("mix_roll");
if( mix_roll == null){
	System.out.println(this.toString+" : mix_roll is null" );
}else{
	System.out.println(this.toString+" : mix_roll is "+mix_roll );
}
String mix_wgt = req.getParameter("mix_wgt");
if( mix_wgt == null){
	System.out.println(this.toString+" : mix_wgt is null" );
}else{
	System.out.println(this.toString+" : mix_wgt is "+mix_wgt );
}
String mix_car_occr_dt = req.getParameter("mix_car_occr_dt");
if( mix_car_occr_dt == null){
	System.out.println(this.toString+" : mix_car_occr_dt is null" );
}else{
	System.out.println(this.toString+" : mix_car_occr_dt is "+mix_car_occr_dt );
}
String mix_car_seq = req.getParameter("mix_car_seq");
if( mix_car_seq == null){
	System.out.println(this.toString+" : mix_car_seq is null" );
}else{
	System.out.println(this.toString+" : mix_car_seq is "+mix_car_seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String mode = Util.checkString(req.getParameter("mode"));
String ordr_dt = Util.checkString(req.getParameter("ordr_dt"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String papcmpy_cd = Util.checkString(req.getParameter("papcmpy_cd"));
String roll_wgt = Util.checkString(req.getParameter("roll_wgt"));
String expt_roll_cnt = Util.checkString(req.getParameter("expt_roll_cnt"));
String expt_wgt = Util.checkString(req.getParameter("expt_wgt"));
String ordr_roll_cnt = Util.checkString(req.getParameter("ordr_roll_cnt"));
String ordr_wgt = Util.checkString(req.getParameter("ordr_wgt"));
String car_occr_dt = Util.checkString(req.getParameter("car_occr_dt"));
String car_seq = Util.checkString(req.getParameter("car_seq"));
String car_prd_cnt = Util.checkString(req.getParameter("car_prd_cnt"));
String mix_ordr_dt = Util.checkString(req.getParameter("mix_ordr_dt"));
String mix_papcmpy_cd = Util.checkString(req.getParameter("mix_papcmpy_cd"));
String mix_matr_cd = Util.checkString(req.getParameter("mix_matr_cd"));
String mix_roll = Util.checkString(req.getParameter("mix_roll"));
String mix_wgt = Util.checkString(req.getParameter("mix_wgt"));
String mix_car_occr_dt = Util.checkString(req.getParameter("mix_car_occr_dt"));
String mix_car_seq = Util.checkString(req.getParameter("mix_car_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String ordr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("ordr_dt")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String papcmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("papcmpy_cd")));
String roll_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("roll_wgt")));
String expt_roll_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("expt_roll_cnt")));
String expt_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("expt_wgt")));
String ordr_roll_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("ordr_roll_cnt")));
String ordr_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("ordr_wgt")));
String car_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("car_occr_dt")));
String car_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("car_seq")));
String car_prd_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("car_prd_cnt")));
String mix_ordr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mix_ordr_dt")));
String mix_papcmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("mix_papcmpy_cd")));
String mix_matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("mix_matr_cd")));
String mix_roll = Util.Uni2Ksc(Util.checkString(req.getParameter("mix_roll")));
String mix_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("mix_wgt")));
String mix_car_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mix_car_occr_dt")));
String mix_car_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("mix_car_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setMode(mode);
dm.setOrdr_dt(ordr_dt);
dm.setFac_clsf(fac_clsf);
dm.setMatr_cd(matr_cd);
dm.setPapcmpy_cd(papcmpy_cd);
dm.setRoll_wgt(roll_wgt);
dm.setExpt_roll_cnt(expt_roll_cnt);
dm.setExpt_wgt(expt_wgt);
dm.setOrdr_roll_cnt(ordr_roll_cnt);
dm.setOrdr_wgt(ordr_wgt);
dm.setCar_occr_dt(car_occr_dt);
dm.setCar_seq(car_seq);
dm.setCar_prd_cnt(car_prd_cnt);
dm.setMix_ordr_dt(mix_ordr_dt);
dm.setMix_papcmpy_cd(mix_papcmpy_cd);
dm.setMix_matr_cd(mix_matr_cd);
dm.setMix_roll(mix_roll);
dm.setMix_wgt(mix_wgt);
dm.setMix_car_occr_dt(mix_car_occr_dt);
dm.setMix_car_seq(mix_car_seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Jul 12 19:40:18 KST 2009 */