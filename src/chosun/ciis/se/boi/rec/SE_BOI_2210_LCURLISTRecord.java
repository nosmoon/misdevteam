/***************************************************************************************************
* 파일명 : .java
* 기능 : 판촉물관리 - 판촉물등록
* 작성일자 : 2009-03-16
* 작성자 : 이민효
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.boi.rec;

import java.sql.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 * 
 */


public class SE_BOI_2210_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dong_cd;
	public String yy;
	public String sido;
	public String gugun;
	public String dong;
	public String apt_cnt;
	public String mvin_apt_cnt;
	public String tot_apt_cnt;
	public String hous_cnt;
	public String shop_cnt;
	public String offi_room_cnt;
	public String tot_cnt;
	public String popl_cnt;

	public SE_BOI_2210_LCURLISTRecord(){}

	public void setDong_cd(String dong_cd){
		this.dong_cd = dong_cd;
	}

	public void setYy(String yy){
		this.yy = yy;
	}

	public void setSido(String sido){
		this.sido = sido;
	}

	public void setGugun(String gugun){
		this.gugun = gugun;
	}

	public void setDong(String dong){
		this.dong = dong;
	}

	public void setApt_cnt(String apt_cnt){
		this.apt_cnt = apt_cnt;
	}

	public void setMvin_apt_cnt(String mvin_apt_cnt){
		this.mvin_apt_cnt = mvin_apt_cnt;
	}

	public void setTot_apt_cnt(String tot_apt_cnt){
		this.tot_apt_cnt = tot_apt_cnt;
	}

	public void setHous_cnt(String hous_cnt){
		this.hous_cnt = hous_cnt;
	}

	public void setShop_cnt(String shop_cnt){
		this.shop_cnt = shop_cnt;
	}

	public void setOffi_room_cnt(String offi_room_cnt){
		this.offi_room_cnt = offi_room_cnt;
	}

	public void setTot_cnt(String tot_cnt){
		this.tot_cnt = tot_cnt;
	}

	public void setPopl_cnt(String popl_cnt){
		this.popl_cnt = popl_cnt;
	}

	public String getDong_cd(){
		return this.dong_cd;
	}

	public String getYy(){
		return this.yy;
	}

	public String getSido(){
		return this.sido;
	}

	public String getGugun(){
		return this.gugun;
	}

	public String getDong(){
		return this.dong;
	}

	public String getApt_cnt(){
		return this.apt_cnt;
	}

	public String getMvin_apt_cnt(){
		return this.mvin_apt_cnt;
	}

	public String getTot_apt_cnt(){
		return this.tot_apt_cnt;
	}

	public String getHous_cnt(){
		return this.hous_cnt;
	}

	public String getShop_cnt(){
		return this.shop_cnt;
	}

	public String getOffi_room_cnt(){
		return this.offi_room_cnt;
	}

	public String getTot_cnt(){
		return this.tot_cnt;
	}

	public String getPopl_cnt(){
		return this.popl_cnt;
	}
}

/* 작성시간 : Tue May 26 11:28:33 KST 2009 */