/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국경영-부수증감-본지신청(지원)-인쇄
* 작성일자 : 2009-04-20
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * 지국경영-부수증감-본지신청(지원)-인쇄
 */

public class SS_L_QTYAPLC_MAINNWSP_PRINTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptnm;
	public String areanm;
	public String bonm;
	public String aplcdt;
	public String issudt;
	public int boaplcicdcqty;
	public int chrgupdicdcqty;
	public int iygwygbs;
	public int iygwhbbs;
	public int bsbusu;
	public int thmmvalqty;
	public int aftcnt_tot;
	public int realtot;
	public int pub_infonwsp;

	public SS_L_QTYAPLC_MAINNWSP_PRINTCURCOMMLISTRecord(){}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
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

	public void setBoaplcicdcqty(int boaplcicdcqty){
		this.boaplcicdcqty = boaplcicdcqty;
	}

	public void setChrgupdicdcqty(int chrgupdicdcqty){
		this.chrgupdicdcqty = chrgupdicdcqty;
	}

	public void setIygwygbs(int iygwygbs){
		this.iygwygbs = iygwygbs;
	}

	public void setIygwhbbs(int iygwhbbs){
		this.iygwhbbs = iygwhbbs;
	}

	public void setBsbusu(int bsbusu){
		this.bsbusu = bsbusu;
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

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getAreanm(){
		return this.areanm;
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

	public int getBoaplcicdcqty(){
		return this.boaplcicdcqty;
	}

	public int getChrgupdicdcqty(){
		return this.chrgupdicdcqty;
	}

	public int getIygwygbs(){
		return this.iygwygbs;
	}

	public int getIygwhbbs(){
		return this.iygwhbbs;
	}

	public int getBsbusu(){
		return this.bsbusu;
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
}

/* 작성시간 : Mon Apr 20 21:30:12 KST 2009 */