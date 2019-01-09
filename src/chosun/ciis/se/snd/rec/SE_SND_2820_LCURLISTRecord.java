/***************************************************************************************************
* 파일명 : SE_SND_2820_LCURLISTRecord.java
* 기능 : 발송관리 - 마감관리 - 발송정보 DOWNLOAD
* 작성일자 : 2009-03-26
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


public class SE_SND_2820_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd			;
	public String issu_dt			;
	public String clos_tms			;
	public String route_clsf		;
	public String route_clsf_nm		;
	public String prt_dt			;
	public String medi_cd			;
	public String medi_nm			;
	public String sect_cd			;
	public String sect_nm			;
	public String pcnt				;
	public String clr_pcnt			;
	public String add_prt_seq		;
	public String qty				;
	public String send_yn			;
	public String send_medi_cd		;
	public String clos_dt_tm		;
	public String send_clos_grp_clsf;
	public String clos_dt			;
	public String clos_tm			;
	public String yn				;
	
	public String getYn() {
		return yn;
	}

	public void setYn(String yn) {
		this.yn = yn;
	}

	public String getClos_dt() {
		return clos_dt;
	}

	public void setClos_dt(String clos_dt) {
		this.clos_dt = clos_dt;
	}

	public String getClos_tm() {
		return clos_tm;
	}

	public void setClos_tm(String clos_tm) {
		this.clos_tm = clos_tm;
	}

	public String getSend_clos_grp_clsf() {
		return send_clos_grp_clsf;
	}

	public void setSend_clos_grp_clsf(String send_clos_grp_clsf) {
		this.send_clos_grp_clsf = send_clos_grp_clsf;
	}

	public String getClos_dt_tm() {
		return clos_dt_tm;
	}

	public void setClos_dt_tm(String clos_dt_tm) {
		this.clos_dt_tm = clos_dt_tm;
	}

	public SE_SND_2820_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setClos_tms(String clos_tms){
		this.clos_tms = clos_tms;
	}

	public void setRoute_clsf(String route_clsf){
		this.route_clsf = route_clsf;
	}

	public void setPrt_dt(String prt_dt){
		this.prt_dt = prt_dt;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setPcnt(String pcnt){
		this.pcnt = pcnt;
	}

	public void setClr_pcnt(String clr_pcnt){
		this.clr_pcnt = clr_pcnt;
	}

	public void setAdd_prt_seq(String add_prt_seq){
		this.add_prt_seq = add_prt_seq;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setSend_yn(String send_yn){
		this.send_yn = send_yn;
	}

	public void setSend_medi_cd(String send_medi_cd){
		this.send_medi_cd = send_medi_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getClos_tms(){
		return this.clos_tms;
	}

	public String getRoute_clsf(){
		return this.route_clsf;
	}

	public String getPrt_dt(){
		return this.prt_dt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getPcnt(){
		return this.pcnt;
	}

	public String getClr_pcnt(){
		return this.clr_pcnt;
	}

	public String getAdd_prt_seq(){
		return this.add_prt_seq;
	}

	public String getQty(){
		return this.qty;
	}

	public String getSend_yn(){
		return this.send_yn;
	}

	public String getSend_medi_cd(){
		return this.send_medi_cd;
	}

	public String getRoute_clsf_nm() {
		return route_clsf_nm;
	}

	public void setRoute_clsf_nm(String route_clsf_nm) {
		this.route_clsf_nm = route_clsf_nm;
	}
}

/* 작성시간 : Thu Mar 26 15:04:40 KST 2009 */