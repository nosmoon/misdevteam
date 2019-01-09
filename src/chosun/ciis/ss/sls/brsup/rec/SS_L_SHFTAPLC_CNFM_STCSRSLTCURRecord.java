/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국업무지원-Billing자동이체-신청확인통계-목록조회
* 작성일자 : 2009-04-13
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지국업무지원-Billing자동이체-신청확인통계-목록조회
 */

public class SS_L_SHFTAPLC_CNFM_STCSRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String areacd;
	public String areanm;
	public String bocd;
	public String bonm;
	public String tel_no;
	public int jd_a_cnt;
	public int jd_b_cnt;
	public int jd_c_cnt;
	public int dd_a_cnt;
	public int dd_b_cnt;
	public int dd_c_cnt;
	public int pd_a_cnt;
	public int pd_b_cnt;
	public int pd_c_cnt;

	public SS_L_SHFTAPLC_CNFM_STCSRSLTCURRecord(){}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setJd_a_cnt(int jd_a_cnt){
		this.jd_a_cnt = jd_a_cnt;
	}

	public void setJd_b_cnt(int jd_b_cnt){
		this.jd_b_cnt = jd_b_cnt;
	}

	public void setJd_c_cnt(int jd_c_cnt){
		this.jd_c_cnt = jd_c_cnt;
	}

	public void setDd_a_cnt(int dd_a_cnt){
		this.dd_a_cnt = dd_a_cnt;
	}

	public void setDd_b_cnt(int dd_b_cnt){
		this.dd_b_cnt = dd_b_cnt;
	}

	public void setDd_c_cnt(int dd_c_cnt){
		this.dd_c_cnt = dd_c_cnt;
	}

	public void setPd_a_cnt(int pd_a_cnt){
		this.pd_a_cnt = pd_a_cnt;
	}

	public void setPd_b_cnt(int pd_b_cnt){
		this.pd_b_cnt = pd_b_cnt;
	}

	public void setPd_c_cnt(int pd_c_cnt){
		this.pd_c_cnt = pd_c_cnt;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public int getJd_a_cnt(){
		return this.jd_a_cnt;
	}

	public int getJd_b_cnt(){
		return this.jd_b_cnt;
	}

	public int getJd_c_cnt(){
		return this.jd_c_cnt;
	}

	public int getDd_a_cnt(){
		return this.dd_a_cnt;
	}

	public int getDd_b_cnt(){
		return this.dd_b_cnt;
	}

	public int getDd_c_cnt(){
		return this.dd_c_cnt;
	}

	public int getPd_a_cnt(){
		return this.pd_a_cnt;
	}

	public int getPd_b_cnt(){
		return this.pd_b_cnt;
	}

	public int getPd_c_cnt(){
		return this.pd_c_cnt;
	}
}

/* 작성시간 : Mon Apr 13 21:53:44 KST 2009 */