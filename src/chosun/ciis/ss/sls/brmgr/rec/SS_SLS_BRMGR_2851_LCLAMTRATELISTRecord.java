/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * 
 */


public class SS_SLS_BRMGR_2851_LCLAMTRATELISTRecord extends java.lang.Object implements java.io.Serializable{

	public String mm;
	public String gr_clm_2;
	public String gr_clm_2_rt;
	public String at_clm_2;
	public String at_clm_2_rt;
	public String ti_clm_2;
	public String ti_clm_2_rt;
	public String bm_clm_2;
	public String bm_clm_2_rt;
	public String gr_clm_1;
	public String gr_clm_1_rt;
	public String at_clm_1;
	public String at_clm_1_rt;
	public String ti_clm_1;
	public String ti_clm_1_rt;
	public String bm_clm_1;
	public String bm_clm_1_rt;
	public String gr_clm;
	public String gr_clm_rt;
	public String at_clm;
	public String at_clm_rt;
	public String ti_clm;
	public String ti_clm_rt;
	public String bm_clm;
	public String bm_clm_rt;

	public SS_SLS_BRMGR_2851_LCLAMTRATELISTRecord(){}

	public void setMm(String mm){
		this.mm = mm;
	}

	public void setGr_clm_2(String gr_clm_2){
		this.gr_clm_2 = gr_clm_2;
	}

	public void setGr_clm_2_rt(String gr_clm_2_rt){
		this.gr_clm_2_rt = gr_clm_2_rt;
	}

	public void setAt_clm_2(String at_clm_2){
		this.at_clm_2 = at_clm_2;
	}

	public void setAt_clm_2_rt(String at_clm_2_rt){
		this.at_clm_2_rt = at_clm_2_rt;
	}

	public void setTi_clm_2(String ti_clm_2){
		this.ti_clm_2 = ti_clm_2;
	}

	public void setTi_clm_2_rt(String ti_clm_2_rt){
		this.ti_clm_2_rt = ti_clm_2_rt;
	}

	public void setBm_clm_2(String bm_clm_2){
		this.bm_clm_2 = bm_clm_2;
	}

	public void setBm_clm_2_rt(String bm_clm_2_rt){
		this.bm_clm_2_rt = bm_clm_2_rt;
	}

	public void setGr_clm_1(String gr_clm_1){
		this.gr_clm_1 = gr_clm_1;
	}

	public void setGr_clm_1_rt(String gr_clm_1_rt){
		this.gr_clm_1_rt = gr_clm_1_rt;
	}

	public void setAt_clm_1(String at_clm_1){
		this.at_clm_1 = at_clm_1;
	}

	public void setAt_clm_1_rt(String at_clm_1_rt){
		this.at_clm_1_rt = at_clm_1_rt;
	}

	public void setTi_clm_1(String ti_clm_1){
		this.ti_clm_1 = ti_clm_1;
	}

	public void setTi_clm_1_rt(String ti_clm_1_rt){
		this.ti_clm_1_rt = ti_clm_1_rt;
	}

	public void setBm_clm_1(String bm_clm_1){
		this.bm_clm_1 = bm_clm_1;
	}

	public void setBm_clm_1_rt(String bm_clm_1_rt){
		this.bm_clm_1_rt = bm_clm_1_rt;
	}

	public void setGr_clm(String gr_clm){
		this.gr_clm = gr_clm;
	}

	public void setGr_clm_rt(String gr_clm_rt){
		this.gr_clm_rt = gr_clm_rt;
	}

	public void setAt_clm(String at_clm){
		this.at_clm = at_clm;
	}

	public void setAt_clm_rt(String at_clm_rt){
		this.at_clm_rt = at_clm_rt;
	}

	public void setTi_clm(String ti_clm){
		this.ti_clm = ti_clm;
	}

	public void setTi_clm_rt(String ti_clm_rt){
		this.ti_clm_rt = ti_clm_rt;
	}

	public void setBm_clm(String bm_clm){
		this.bm_clm = bm_clm;
	}

	public void setBm_clm_rt(String bm_clm_rt){
		this.bm_clm_rt = bm_clm_rt;
	}

	public String getMm(){
		return this.mm;
	}

	public String getGr_clm_2(){
		return this.gr_clm_2;
	}

	public String getGr_clm_2_rt(){
		return this.gr_clm_2_rt;
	}

	public String getAt_clm_2(){
		return this.at_clm_2;
	}

	public String getAt_clm_2_rt(){
		return this.at_clm_2_rt;
	}

	public String getTi_clm_2(){
		return this.ti_clm_2;
	}

	public String getTi_clm_2_rt(){
		return this.ti_clm_2_rt;
	}

	public String getBm_clm_2(){
		return this.bm_clm_2;
	}

	public String getBm_clm_2_rt(){
		return this.bm_clm_2_rt;
	}

	public String getGr_clm_1(){
		return this.gr_clm_1;
	}

	public String getGr_clm_1_rt(){
		return this.gr_clm_1_rt;
	}

	public String getAt_clm_1(){
		return this.at_clm_1;
	}

	public String getAt_clm_1_rt(){
		return this.at_clm_1_rt;
	}

	public String getTi_clm_1(){
		return this.ti_clm_1;
	}

	public String getTi_clm_1_rt(){
		return this.ti_clm_1_rt;
	}

	public String getBm_clm_1(){
		return this.bm_clm_1;
	}

	public String getBm_clm_1_rt(){
		return this.bm_clm_1_rt;
	}

	public String getGr_clm(){
		return this.gr_clm;
	}

	public String getGr_clm_rt(){
		return this.gr_clm_rt;
	}

	public String getAt_clm(){
		return this.at_clm;
	}

	public String getAt_clm_rt(){
		return this.at_clm_rt;
	}

	public String getTi_clm(){
		return this.ti_clm;
	}

	public String getTi_clm_rt(){
		return this.ti_clm_rt;
	}

	public String getBm_clm(){
		return this.bm_clm;
	}

	public String getBm_clm_rt(){
		return this.bm_clm_rt;
	}
}

/* 작성시간 : Tue Feb 27 17:01:31 KST 2018 */