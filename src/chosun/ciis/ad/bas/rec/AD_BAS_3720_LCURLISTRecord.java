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


package chosun.ciis.ad.bas.rec;

import java.sql.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.ds.*;

/**
 * 
 */


public class AD_BAS_3720_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sun;
	public String sun_cnt;
	public String mon;
	public String mon_cnt;
	public String tue;
	public String tue_cnt;
	public String wed;
	public String wed_cnt;
	public String thr;
	public String thr_cnt;
	public String fri;
	public String fri_cnt;
	public String sat;
	public String sat_cnt;

	public AD_BAS_3720_LCURLISTRecord(){}

	public void setSun(String sun){
		this.sun = sun;
	}

	public void setSun_cnt(String sun_cnt){
		this.sun_cnt = sun_cnt;
	}

	public void setMon(String mon){
		this.mon = mon;
	}

	public void setMon_cnt(String mon_cnt){
		this.mon_cnt = mon_cnt;
	}

	public void setTue(String tue){
		this.tue = tue;
	}

	public void setTue_cnt(String tue_cnt){
		this.tue_cnt = tue_cnt;
	}

	public void setWed(String wed){
		this.wed = wed;
	}

	public void setWed_cnt(String wed_cnt){
		this.wed_cnt = wed_cnt;
	}

	public void setThr(String thr){
		this.thr = thr;
	}

	public void setThr_cnt(String thr_cnt){
		this.thr_cnt = thr_cnt;
	}

	public void setFri(String fri){
		this.fri = fri;
	}

	public void setFri_cnt(String fri_cnt){
		this.fri_cnt = fri_cnt;
	}

	public void setSat(String sat){
		this.sat = sat;
	}

	public void setSat_cnt(String sat_cnt){
		this.sat_cnt = sat_cnt;
	}

	public String getSun(){
		return this.sun;
	}

	public String getSun_cnt(){
		return this.sun_cnt;
	}

	public String getMon(){
		return this.mon;
	}

	public String getMon_cnt(){
		return this.mon_cnt;
	}

	public String getTue(){
		return this.tue;
	}

	public String getTue_cnt(){
		return this.tue_cnt;
	}

	public String getWed(){
		return this.wed;
	}

	public String getWed_cnt(){
		return this.wed_cnt;
	}

	public String getThr(){
		return this.thr;
	}

	public String getThr_cnt(){
		return this.thr_cnt;
	}

	public String getFri(){
		return this.fri;
	}

	public String getFri_cnt(){
		return this.fri_cnt;
	}

	public String getSat(){
		return this.sat;
	}

	public String getSat_cnt(){
		return this.sat_cnt;
	}
}

/* 작성시간 : Tue Aug 07 18:33:55 KST 2012 */