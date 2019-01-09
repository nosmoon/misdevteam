/***************************************************************************************************
* 파일명 : .java
* 기능 : * 지국경영-지국부수현황 조회(리스트)
* 작성일자 : 2010-01-25
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 *  지국경영-지국부수현황 조회(리스트)
 */

public class SS_L_BOSENDPCONDCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String bonm;
	public int iygwygbs;
	public int iygwmgbs;
	public int iytot;
	public int thmmvalqty;
	public int thmmvalqtydiff;
	public int valrate;
	public int aftcnt1;
	public int aftcnt2;
	public int aftcnt3;
	public int aftcnt4;
	public int excsaftcnt5;
	public int aftcnt_tot;
	public int aftcnt_totdiff;
	public int realtot;
	public int realtotdiff;
	public int realtotdiffrate;
	public int pub_infonwsp;
	public int dntnwsp;
	public int resvnwsp;

	public SS_L_BOSENDPCONDCURCOMMLISTRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setIygwygbs(int iygwygbs){
		this.iygwygbs = iygwygbs;
	}

	public void setIygwmgbs(int iygwmgbs){
		this.iygwmgbs = iygwmgbs;
	}

	public void setIytot(int iytot){
		this.iytot = iytot;
	}

	public void setThmmvalqty(int thmmvalqty){
		this.thmmvalqty = thmmvalqty;
	}

	public void setThmmvalqtydiff(int thmmvalqtydiff){
		this.thmmvalqtydiff = thmmvalqtydiff;
	}

	public void setValrate(int valrate){
		this.valrate = valrate;
	}

	public void setAftcnt1(int aftcnt1){
		this.aftcnt1 = aftcnt1;
	}

	public void setAftcnt2(int aftcnt2){
		this.aftcnt2 = aftcnt2;
	}

	public void setAftcnt3(int aftcnt3){
		this.aftcnt3 = aftcnt3;
	}

	public void setAftcnt4(int aftcnt4){
		this.aftcnt4 = aftcnt4;
	}

	public void setExcsaftcnt5(int excsaftcnt5){
		this.excsaftcnt5 = excsaftcnt5;
	}

	public void setAftcnt_tot(int aftcnt_tot){
		this.aftcnt_tot = aftcnt_tot;
	}

	public void setAftcnt_totdiff(int aftcnt_totdiff){
		this.aftcnt_totdiff = aftcnt_totdiff;
	}

	public void setRealtot(int realtot){
		this.realtot = realtot;
	}

	public void setRealtotdiff(int realtotdiff){
		this.realtotdiff = realtotdiff;
	}

	public void setRealtotdiffrate(int realtotdiffrate){
		this.realtotdiffrate = realtotdiffrate;
	}

	public void setPub_infonwsp(int pub_infonwsp){
		this.pub_infonwsp = pub_infonwsp;
	}

	public void setDntnwsp(int dntnwsp){
		this.dntnwsp = dntnwsp;
	}

	public void setResvnwsp(int resvnwsp){
		this.resvnwsp = resvnwsp;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public int getIygwygbs(){
		return this.iygwygbs;
	}

	public int getIygwmgbs(){
		return this.iygwmgbs;
	}

	public int getIytot(){
		return this.iytot;
	}

	public int getThmmvalqty(){
		return this.thmmvalqty;
	}

	public int getThmmvalqtydiff(){
		return this.thmmvalqtydiff;
	}

	public int getValrate(){
		return this.valrate;
	}

	public int getAftcnt1(){
		return this.aftcnt1;
	}

	public int getAftcnt2(){
		return this.aftcnt2;
	}

	public int getAftcnt3(){
		return this.aftcnt3;
	}

	public int getAftcnt4(){
		return this.aftcnt4;
	}

	public int getExcsaftcnt5(){
		return this.excsaftcnt5;
	}

	public int getAftcnt_tot(){
		return this.aftcnt_tot;
	}

	public int getAftcnt_totdiff(){
		return this.aftcnt_totdiff;
	}

	public int getRealtot(){
		return this.realtot;
	}

	public int getRealtotdiff(){
		return this.realtotdiff;
	}

	public int getRealtotdiffrate(){
		return this.realtotdiffrate;
	}

	public int getPub_infonwsp(){
		return this.pub_infonwsp;
	}

	public int getDntnwsp(){
		return this.dntnwsp;
	}

	public int getResvnwsp(){
		return this.resvnwsp;
	}
}

/* 작성시간 : Mon Jan 25 14:14:58 KST 2010 */