/***************************************************************************************************
* 파일명 : .java
* 기능 : 지국경영-부수증감-본지신청(영업)-조회(리스트)
* 작성일자 : 2009-07-23
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * 지국경영-부수증감 신청(담당) 조회(리스트)
 */

public class SS_L_QTYAPLC_MAIN_NWSPCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String areacd;
	public String bocd;
	public String bonm;
	public String aplcdt;
	public String issudt;
	public int iygwygbs;
	public int iygwmgbs;
	public int iygwygbs_rate;
	public int iytot;
	public int chrgupdicdcqty;
	public int aft_iygwygbs;
	public int aft_iygwmgbs;
	public int aft_iygwmgbs_rate;
	public int thmmvalqty;
	public int aftcnt_tot;
	public int realtot;
	public int pub_infonwsp;
	public String chrgcnfmyn;
	public String closyn;
	public String remk;

	public SS_L_QTYAPLC_MAIN_NWSPCURCOMMLISTRecord(){}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setIssudt(String issudt){
		this.issudt = issudt;
	}

	public void setIygwygbs(int iygwygbs){
		this.iygwygbs = iygwygbs;
	}

	public void setIygwmgbs(int iygwmgbs){
		this.iygwmgbs = iygwmgbs;
	}

	public void setIygwygbs_rate(int iygwygbs_rate){
		this.iygwygbs_rate = iygwygbs_rate;
	}

	public void setIytot(int iytot){
		this.iytot = iytot;
	}

	public void setChrgupdicdcqty(int chrgupdicdcqty){
		this.chrgupdicdcqty = chrgupdicdcqty;
	}

	public void setAft_iygwygbs(int aft_iygwygbs){
		this.aft_iygwygbs = aft_iygwygbs;
	}

	public void setAft_iygwmgbs(int aft_iygwmgbs){
		this.aft_iygwmgbs = aft_iygwmgbs;
	}

	public void setAft_iygwmgbs_rate(int aft_iygwmgbs_rate){
		this.aft_iygwmgbs_rate = aft_iygwmgbs_rate;
	}

	public void setThmmvalqty(int thmmvalqty){
		this.thmmvalqty = thmmvalqty;
	}

	public void setAftcnt_tot(int aftcnt_tot){
		this.aftcnt_tot = aftcnt_tot;
	}

	public void setRealtot(int realtot){
		this.realtot = realtot;
	}

	public void setPub_infonwsp(int pub_infonwsp){
		this.pub_infonwsp = pub_infonwsp;
	}

	public void setChrgcnfmyn(String chrgcnfmyn){
		this.chrgcnfmyn = chrgcnfmyn;
	}

	public void setClosyn(String closyn){
		this.closyn = closyn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getIssudt(){
		return this.issudt;
	}

	public int getIygwygbs(){
		return this.iygwygbs;
	}

	public int getIygwmgbs(){
		return this.iygwmgbs;
	}

	public int getIygwygbs_rate(){
		return this.iygwygbs_rate;
	}

	public int getIytot(){
		return this.iytot;
	}

	public int getChrgupdicdcqty(){
		return this.chrgupdicdcqty;
	}

	public int getAft_iygwygbs(){
		return this.aft_iygwygbs;
	}

	public int getAft_iygwmgbs(){
		return this.aft_iygwmgbs;
	}

	public int getAft_iygwmgbs_rate(){
		return this.aft_iygwmgbs_rate;
	}

	public int getThmmvalqty(){
		return this.thmmvalqty;
	}

	public int getAftcnt_tot(){
		return this.aftcnt_tot;
	}

	public int getRealtot(){
		return this.realtot;
	}

	public int getPub_infonwsp(){
		return this.pub_infonwsp;
	}

	public String getChrgcnfmyn(){
		return this.chrgcnfmyn;
	}

	public String getClosyn(){
		return this.closyn;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Thu Jul 23 14:31:11 KST 2009 */