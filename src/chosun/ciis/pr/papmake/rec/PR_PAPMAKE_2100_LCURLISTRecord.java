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


package chosun.ciis.pr.papmake.rec;

import java.sql.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.ds.*;

/**
 * 
 */


public class PR_PAPMAKE_2100_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String clos_yymm;
	public String ecnt;
	public String clr_clsf;
	public String re_off_plat;
	public String re_re_off_plat;
	public String film_num_shet;
	public String psplat_cnt;

	public PR_PAPMAKE_2100_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setClos_yymm(String clos_yymm){
		this.clos_yymm = clos_yymm;
	}

	public void setEcnt(String ecnt){
		this.ecnt = ecnt;
	}

	public void setClr_clsf(String clr_clsf){
		this.clr_clsf = clr_clsf;
	}

	public void setRe_off_plat(String re_off_plat){
		this.re_off_plat = re_off_plat;
	}

	public void setRe_re_off_plat(String re_re_off_plat){
		this.re_re_off_plat = re_re_off_plat;
	}

	public void setFilm_num_shet(String film_num_shet){
		this.film_num_shet = film_num_shet;
	}

	public void setPsplat_cnt(String psplat_cnt){
		this.psplat_cnt = psplat_cnt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getClos_yymm(){
		return this.clos_yymm;
	}

	public String getEcnt(){
		return this.ecnt;
	}

	public String getClr_clsf(){
		return this.clr_clsf;
	}

	public String getRe_off_plat(){
		return this.re_off_plat;
	}

	public String getRe_re_off_plat(){
		return this.re_re_off_plat;
	}

	public String getFilm_num_shet(){
		return this.film_num_shet;
	}

	public String getPsplat_cnt(){
		return this.psplat_cnt;
	}
}

/* 작성시간 : Sat Oct 31 13:19:13 KST 2009 */