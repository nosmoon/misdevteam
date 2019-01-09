/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국경영-구독유지-상세
* 작성일자 : 2009-04-25
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * 지국경영-구독유지-상세
 */

public class SS_L_CAMPSTATCAMP_STATRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String boinsdseq;
	public String bonm;
	public int cnfmstatcd_00;
	public int cnfmstatcd_10;
	public int cnfmocomcd_10;
	public int cnfmocomcd_20;
	public int cnfmocomcd_30;
	public int cnfmocomcd_40;
	public int cnfmocomcd_50;
	public int cnfmocomcd_60;
	public int resvcol1;
	public int resvcol2;
	public int resvcol3;

	public SS_L_CAMPSTATCAMP_STATRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBoinsdseq(String boinsdseq){
		this.boinsdseq = boinsdseq;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setCnfmstatcd_00(int cnfmstatcd_00){
		this.cnfmstatcd_00 = cnfmstatcd_00;
	}

	public void setCnfmstatcd_10(int cnfmstatcd_10){
		this.cnfmstatcd_10 = cnfmstatcd_10;
	}

	public void setCnfmocomcd_10(int cnfmocomcd_10){
		this.cnfmocomcd_10 = cnfmocomcd_10;
	}

	public void setCnfmocomcd_20(int cnfmocomcd_20){
		this.cnfmocomcd_20 = cnfmocomcd_20;
	}

	public void setCnfmocomcd_30(int cnfmocomcd_30){
		this.cnfmocomcd_30 = cnfmocomcd_30;
	}

	public void setCnfmocomcd_40(int cnfmocomcd_40){
		this.cnfmocomcd_40 = cnfmocomcd_40;
	}

	public void setCnfmocomcd_50(int cnfmocomcd_50){
		this.cnfmocomcd_50 = cnfmocomcd_50;
	}

	public void setCnfmocomcd_60(int cnfmocomcd_60){
		this.cnfmocomcd_60 = cnfmocomcd_60;
	}

	public void setResvcol1(int resvcol1){
		this.resvcol1 = resvcol1;
	}

	public void setResvcol2(int resvcol2){
		this.resvcol2 = resvcol2;
	}

	public void setResvcol3(int resvcol3){
		this.resvcol3 = resvcol3;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBoinsdseq(){
		return this.boinsdseq;
	}

	public String getBonm(){
		return this.bonm;
	}

	public int getCnfmstatcd_00(){
		return this.cnfmstatcd_00;
	}

	public int getCnfmstatcd_10(){
		return this.cnfmstatcd_10;
	}

	public int getCnfmocomcd_10(){
		return this.cnfmocomcd_10;
	}

	public int getCnfmocomcd_20(){
		return this.cnfmocomcd_20;
	}

	public int getCnfmocomcd_30(){
		return this.cnfmocomcd_30;
	}

	public int getCnfmocomcd_40(){
		return this.cnfmocomcd_40;
	}

	public int getCnfmocomcd_50(){
		return this.cnfmocomcd_50;
	}

	public int getCnfmocomcd_60(){
		return this.cnfmocomcd_60;
	}

	public int getResvcol1(){
		return this.resvcol1;
	}

	public int getResvcol2(){
		return this.resvcol2;
	}

	public int getResvcol3(){
		return this.resvcol3;
	}
}

/* 작성시간 : Sat Apr 25 14:09:02 KST 2009 */