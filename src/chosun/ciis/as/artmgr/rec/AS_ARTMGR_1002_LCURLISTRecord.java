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


package chosun.ciis.as.artmgr.rec;

import java.sql.*;
import chosun.ciis.as.artmgr.dm.*;
import chosun.ciis.as.artmgr.ds.*;

/**
 * 
 */


public class AS_ARTMGR_1002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String art_prod_no;
	public String aset_no;
	public String aset_nm;
	public String art_cate_nm;
	public String author;
	public String art_prod_nm;
	public String art_prod_size;
	public String fram_size;
	public String fram_yn;
	public String make_yymm;
	public String get_dt;
	public String get_resn;
	public String ap_amt;
	public String dlco_nm;
	public String dlco_tel;
	public String keep_plac;
	public String keep_dt;
	public String art_prod_evlu;
	public String last_chk_dt;
	public String dnt_clsf;
	public String dnt_clsf_nm;
	public String art_prod_remk;
	public String remk;
	public String incmg_dt_tm;
	public String incmg_pers_nm;

	public AS_ARTMGR_1002_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setArt_prod_no(String art_prod_no){
		this.art_prod_no = art_prod_no;
	}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setAset_nm(String aset_nm){
		this.aset_nm = aset_nm;
	}

	public void setArt_cate_nm(String art_cate_nm){
		this.art_cate_nm = art_cate_nm;
	}

	public void setAuthor(String author){
		this.author = author;
	}

	public void setArt_prod_nm(String art_prod_nm){
		this.art_prod_nm = art_prod_nm;
	}

	public void setArt_prod_size(String art_prod_size){
		this.art_prod_size = art_prod_size;
	}

	public void setFram_size(String fram_size){
		this.fram_size = fram_size;
	}

	public void setFram_yn(String fram_yn){
		this.fram_yn = fram_yn;
	}

	public void setMake_yymm(String make_yymm){
		this.make_yymm = make_yymm;
	}

	public void setGet_dt(String get_dt){
		this.get_dt = get_dt;
	}

	public void setGet_resn(String get_resn){
		this.get_resn = get_resn;
	}

	public void setAp_amt(String ap_amt){
		this.ap_amt = ap_amt;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDlco_tel(String dlco_tel){
		this.dlco_tel = dlco_tel;
	}

	public void setKeep_plac(String keep_plac){
		this.keep_plac = keep_plac;
	}

	public void setKeep_dt(String keep_dt){
		this.keep_dt = keep_dt;
	}

	public void setArt_prod_evlu(String art_prod_evlu){
		this.art_prod_evlu = art_prod_evlu;
	}

	public void setLast_chk_dt(String last_chk_dt){
		this.last_chk_dt = last_chk_dt;
	}

	public void setDnt_clsf(String dnt_clsf){
		this.dnt_clsf = dnt_clsf;
	}

	public void setDnt_clsf_nm(String dnt_clsf_nm){
		this.dnt_clsf_nm = dnt_clsf_nm;
	}

	public void setArt_prod_remk(String art_prod_remk){
		this.art_prod_remk = art_prod_remk;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setIncmg_pers_nm(String incmg_pers_nm){
		this.incmg_pers_nm = incmg_pers_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getArt_prod_no(){
		return this.art_prod_no;
	}

	public String getAset_no(){
		return this.aset_no;
	}

	public String getAset_nm(){
		return this.aset_nm;
	}

	public String getArt_cate_nm(){
		return this.art_cate_nm;
	}

	public String getAuthor(){
		return this.author;
	}

	public String getArt_prod_nm(){
		return this.art_prod_nm;
	}

	public String getArt_prod_size(){
		return this.art_prod_size;
	}

	public String getFram_size(){
		return this.fram_size;
	}

	public String getFram_yn(){
		return this.fram_yn;
	}

	public String getMake_yymm(){
		return this.make_yymm;
	}

	public String getGet_dt(){
		return this.get_dt;
	}

	public String getGet_resn(){
		return this.get_resn;
	}

	public String getAp_amt(){
		return this.ap_amt;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDlco_tel(){
		return this.dlco_tel;
	}

	public String getKeep_plac(){
		return this.keep_plac;
	}

	public String getKeep_dt(){
		return this.keep_dt;
	}

	public String getArt_prod_evlu(){
		return this.art_prod_evlu;
	}

	public String getLast_chk_dt(){
		return this.last_chk_dt;
	}

	public String getDnt_clsf(){
		return this.dnt_clsf;
	}

	public String getDnt_clsf_nm(){
		return this.dnt_clsf_nm;
	}

	public String getArt_prod_remk(){
		return this.art_prod_remk;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getIncmg_pers_nm(){
		return this.incmg_pers_nm;
	}
}

/* 작성시간 : Wed Jul 08 10:56:42 KST 2009 */