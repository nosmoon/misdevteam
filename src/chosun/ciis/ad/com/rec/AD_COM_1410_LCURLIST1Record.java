/***************************************************************************************************
* 파일명   : SP_AD_COM_1410_L.java
* 기능     : 업무연락-광고원고수배장 / 중점확인광고리스트 조회
* 작성일자 : 2009-01-15
* 작성자   : 김재일
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
***************************************************************************************************/


package chosun.ciis.ad.com.rec;


/**
 * 업무연락-광고원고수배장 / 중점확인광고리스트 조회
 */


public class AD_COM_1410_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String srch_dt;
	public int seq;
	public String chrg_pers;
	public String advt_cont;
	public String advt_size;
	public String chro_clsf;
	public String srch_plac;
	public String cntc_plac;
	public String tm;
	public String agn;
	public String sect_clsf;

	public AD_COM_1410_LCURLIST1Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSrch_dt(String srch_dt){
		this.srch_dt = srch_dt;
	}

	public void setSeq(int seq){
		this.seq = seq;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
	}

	public void setAdvt_size(String advt_size){
		this.advt_size = advt_size;
	}

	public void setChro_clsf(String chro_clsf){
		this.chro_clsf = chro_clsf;
	}

	public void setSrch_plac(String srch_plac){
		this.srch_plac = srch_plac;
	}

	public void setCntc_plac(String cntc_plac){
		this.cntc_plac = cntc_plac;
	}

	public void setTm(String tm){
		this.tm = tm;
	}

	public void setAgn(String agn){
		this.agn = agn;
	}

	public void setSect_clsf(String sect_clsf){
		this.sect_clsf = sect_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSrch_dt(){
		return this.srch_dt;
	}

	public int getSeq(){
		return this.seq;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getAdvt_cont(){
		return this.advt_cont;
	}

	public String getAdvt_size(){
		return this.advt_size;
	}

	public String getChro_clsf(){
		return this.chro_clsf;
	}

	public String getSrch_plac(){
		return this.srch_plac;
	}

	public String getCntc_plac(){
		return this.cntc_plac;
	}

	public String getTm(){
		return this.tm;
	}

	public String getAgn(){
		return this.agn;
	}

	public String getSect_clsf(){
		return this.sect_clsf;
	}
}

/* 작성시간 : Wed Feb 04 17:44:43 KST 2009 */