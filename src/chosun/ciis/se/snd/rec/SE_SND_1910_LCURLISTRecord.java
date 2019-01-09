/***************************************************************************************************
* 파일명 : SE_SND_1910_LCURLISTRecord.java
* 기능 : 판매-발송관리-발송마스터
* 작성일자 : 2009-02-09
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.snd.rec;

import java.sql.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.ds.*;

/**
 * 
 */


public class SE_SND_1910_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd				;
	public String bo_cd					;
	public String send_plac_seq			;
	public String send_plac_nm			;
	public String area_cd				;
	public String send_plac_feat_clas	;
	public String ariv_nomn				;
	public String band					;
	public String stetsell_clsf			;
	public String stetsell_nm			;
	public String clas_clsf				;
	public String etc_area_clas			;
	public String use_yn				;
	public String qty					;
	public String area_nm				;
	public String sido_cd				;
	public String sido_nm				;
	public String part_cd				;
	public String part_nm				;
	public String team_cd				;
	public String team_nm				;
	public String bo_feat_clsf			;
	public String bo_feat_nm			;
	public String ddtotshet_qty			;
	public String bo_seq				;

	public SE_SND_1910_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setSend_plac_seq(String send_plac_seq){
		this.send_plac_seq = send_plac_seq;
	}

	public void setSend_plac_nm(String send_plac_nm){
		this.send_plac_nm = send_plac_nm;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setSend_plac_feat_clas(String send_plac_feat_clas){
		this.send_plac_feat_clas = send_plac_feat_clas;
	}

	public void setAriv_nomn(String ariv_nomn){
		this.ariv_nomn = ariv_nomn;
	}

	public void setBand(String band){
		this.band = band;
	}

	public void setStetsell_clsf(String stetsell_clsf){
		this.stetsell_clsf = stetsell_clsf;
	}

	public void setStetsell_nm(String stetsell_nm){
		this.stetsell_nm = stetsell_nm;
	}

	public void setClas_clsf(String clas_clsf){
		this.clas_clsf = clas_clsf;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setSido_cd(String sido_cd){
		this.sido_cd = sido_cd;
	}

	public void setSido_nm(String sido_nm){
		this.sido_nm = sido_nm;
	}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setTeam_cd(String team_cd){
		this.team_cd = team_cd;
	}

	public void setTeam_nm(String team_nm){
		this.team_nm = team_nm;
	}

	public void setBo_feat_clsf(String bo_feat_clsf){
		this.bo_feat_clsf = bo_feat_clsf;
	}

	public void setBo_feat_nm(String bo_feat_nm){
		this.bo_feat_nm = bo_feat_nm;
	}

	public void setDdtotshet_qty(String ddtotshet_qty){
		this.ddtotshet_qty = ddtotshet_qty;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getSend_plac_seq(){
		return this.send_plac_seq;
	}

	public String getSend_plac_nm(){
		return this.send_plac_nm;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getSend_plac_feat_clas(){
		return this.send_plac_feat_clas;
	}

	public String getAriv_nomn(){
		return this.ariv_nomn;
	}

	public String getBand(){
		return this.band;
	}

	public String getStetsell_clsf(){
		return this.stetsell_clsf;
	}

	public String getStetsell_nm(){
		return this.stetsell_nm;
	}

	public String getClas_clsf(){
		return this.clas_clsf;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getQty(){
		return this.qty;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getSido_cd(){
		return this.sido_cd;
	}

	public String getSido_nm(){
		return this.sido_nm;
	}

	public String getPart_cd(){
		return this.part_cd;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getTeam_cd(){
		return this.team_cd;
	}

	public String getTeam_nm(){
		return this.team_nm;
	}

	public String getBo_feat_clsf(){
		return this.bo_feat_clsf;
	}

	public String getBo_feat_nm(){
		return this.bo_feat_nm;
	}

	public String getDdtotshet_qty(){
		return this.ddtotshet_qty;
	}

	public String getBo_seq() {
		return bo_seq;
	}

	public void setBo_seq(String bo_seq) {
		this.bo_seq = bo_seq;
	}

	public String getEtc_area_clas() {
		return etc_area_clas;
	}

	public void setEtc_area_clas(String etc_area_clas) {
		this.etc_area_clas = etc_area_clas;
	}
}

/* 작성시간 : Mon Feb 09 10:18:19 KST 2009 */