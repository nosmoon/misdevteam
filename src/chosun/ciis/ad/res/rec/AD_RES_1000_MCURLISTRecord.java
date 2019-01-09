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


package chosun.ciis.ad.res.rec;

import java.sql.*;
import chosun.ciis.ad.res.dm.*;
import chosun.ciis.ad.res.ds.*;

/**
 * 
 */


public class AD_RES_1000_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sun;
	public String sun_cnt;
	public String sun_pcnt_clos_yn;
	public String sun_clos_yn;
	public String mon;
	public String mon_cnt;
	public String mon_pcnt_clos_yn;
	public String mon_clos_yn;
	public String tue;
	public String tue_cnt;
	public String tue_pcnt_clos_yn;
	public String tue_clos_yn;
	public String wed;
	public String wed_cnt;
	public String wed_pcnt_clos_yn;
	public String wed_clos_yn;
	public String thr;
	public String thr_cnt;
	public String thr_pcnt_clos_yn;
	public String thr_clos_yn;
	public String fri;
	public String fri_cnt;
	public String fri_pcnt_clos_yn;
	public String fri_clos_yn;
	public String sat;
	public String sat_cnt;
	public String sat_pcnt_clos_yn;
	public String sat_clos_yn;

	public AD_RES_1000_MCURLISTRecord(){}

	public void setSun(String sun){
		this.sun = sun;
	}

	public void setSun_cnt(String sun_cnt){
		this.sun_cnt = sun_cnt;
	}

	public void setSun_pcnt_clos_yn(String sun_pcnt_clos_yn){
		this.sun_pcnt_clos_yn = sun_pcnt_clos_yn;
	}

	public void setSun_clos_yn(String sun_clos_yn){
		this.sun_clos_yn = sun_clos_yn;
	}

	public void setMon(String mon){
		this.mon = mon;
	}

	public void setMon_cnt(String mon_cnt){
		this.mon_cnt = mon_cnt;
	}

	public void setMon_pcnt_clos_yn(String mon_pcnt_clos_yn){
		this.mon_pcnt_clos_yn = mon_pcnt_clos_yn;
	}

	public void setMon_clos_yn(String mon_clos_yn){
		this.mon_clos_yn = mon_clos_yn;
	}

	public void setTue(String tue){
		this.tue = tue;
	}

	public void setTue_cnt(String tue_cnt){
		this.tue_cnt = tue_cnt;
	}

	public void setTue_pcnt_clos_yn(String tue_pcnt_clos_yn){
		this.tue_pcnt_clos_yn = tue_pcnt_clos_yn;
	}

	public void setTue_clos_yn(String tue_clos_yn){
		this.tue_clos_yn = tue_clos_yn;
	}

	public void setWed(String wed){
		this.wed = wed;
	}

	public void setWed_cnt(String wed_cnt){
		this.wed_cnt = wed_cnt;
	}

	public void setWed_pcnt_clos_yn(String wed_pcnt_clos_yn){
		this.wed_pcnt_clos_yn = wed_pcnt_clos_yn;
	}

	public void setWed_clos_yn(String wed_clos_yn){
		this.wed_clos_yn = wed_clos_yn;
	}

	public void setThr(String thr){
		this.thr = thr;
	}

	public void setThr_cnt(String thr_cnt){
		this.thr_cnt = thr_cnt;
	}

	public void setThr_pcnt_clos_yn(String thr_pcnt_clos_yn){
		this.thr_pcnt_clos_yn = thr_pcnt_clos_yn;
	}

	public void setThr_clos_yn(String thr_clos_yn){
		this.thr_clos_yn = thr_clos_yn;
	}

	public void setFri(String fri){
		this.fri = fri;
	}

	public void setFri_cnt(String fri_cnt){
		this.fri_cnt = fri_cnt;
	}

	public void setFri_pcnt_clos_yn(String fri_pcnt_clos_yn){
		this.fri_pcnt_clos_yn = fri_pcnt_clos_yn;
	}

	public void setFri_clos_yn(String fri_clos_yn){
		this.fri_clos_yn = fri_clos_yn;
	}

	public void setSat(String sat){
		this.sat = sat;
	}

	public void setSat_cnt(String sat_cnt){
		this.sat_cnt = sat_cnt;
	}

	public void setSat_pcnt_clos_yn(String sat_pcnt_clos_yn){
		this.sat_pcnt_clos_yn = sat_pcnt_clos_yn;
	}

	public void setSat_clos_yn(String sat_clos_yn){
		this.sat_clos_yn = sat_clos_yn;
	}

	public String getSun(){
		return this.sun;
	}

	public String getSun_cnt(){
		return this.sun_cnt;
	}

	public String getSun_pcnt_clos_yn(){
		return this.sun_pcnt_clos_yn;
	}

	public String getSun_clos_yn(){
		return this.sun_clos_yn;
	}

	public String getMon(){
		return this.mon;
	}

	public String getMon_cnt(){
		return this.mon_cnt;
	}

	public String getMon_pcnt_clos_yn(){
		return this.mon_pcnt_clos_yn;
	}

	public String getMon_clos_yn(){
		return this.mon_clos_yn;
	}

	public String getTue(){
		return this.tue;
	}

	public String getTue_cnt(){
		return this.tue_cnt;
	}

	public String getTue_pcnt_clos_yn(){
		return this.tue_pcnt_clos_yn;
	}

	public String getTue_clos_yn(){
		return this.tue_clos_yn;
	}

	public String getWed(){
		return this.wed;
	}

	public String getWed_cnt(){
		return this.wed_cnt;
	}

	public String getWed_pcnt_clos_yn(){
		return this.wed_pcnt_clos_yn;
	}

	public String getWed_clos_yn(){
		return this.wed_clos_yn;
	}

	public String getThr(){
		return this.thr;
	}

	public String getThr_cnt(){
		return this.thr_cnt;
	}

	public String getThr_pcnt_clos_yn(){
		return this.thr_pcnt_clos_yn;
	}

	public String getThr_clos_yn(){
		return this.thr_clos_yn;
	}

	public String getFri(){
		return this.fri;
	}

	public String getFri_cnt(){
		return this.fri_cnt;
	}

	public String getFri_pcnt_clos_yn(){
		return this.fri_pcnt_clos_yn;
	}

	public String getFri_clos_yn(){
		return this.fri_clos_yn;
	}

	public String getSat(){
		return this.sat;
	}

	public String getSat_cnt(){
		return this.sat_cnt;
	}

	public String getSat_pcnt_clos_yn(){
		return this.sat_pcnt_clos_yn;
	}

	public String getSat_clos_yn(){
		return this.sat_clos_yn;
	}
}

/* 작성시간 : Fri Jul 28 16:19:49 KST 2017 */