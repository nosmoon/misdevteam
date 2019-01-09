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


package chosun.ciis.se.boi.rec;

import java.sql.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 * 
 */


public class SE_BOI_1040_SBOJURSDONGCURRecord extends java.lang.Object implements java.io.Serializable{

	public String dongnm;
	public int apt_cnt;
	public int hous_cnt;
	public int shop_cnt;
	public int offi_room_cnt;
	public int dongtot;

	public SE_BOI_1040_SBOJURSDONGCURRecord(){}

	public void setDongnm(String dongnm){
		this.dongnm = dongnm;
	}

	public void setApt_cnt(int apt_cnt){
		this.apt_cnt = apt_cnt;
	}

	public void setHous_cnt(int hous_cnt){
		this.hous_cnt = hous_cnt;
	}

	public void setShop_cnt(int shop_cnt){
		this.shop_cnt = shop_cnt;
	}

	public void setOffi_room_cnt(int offi_room_cnt){
		this.offi_room_cnt = offi_room_cnt;
	}

	public void setDongtot(int dongtot){
		this.dongtot = dongtot;
	}

	public String getDongnm(){
		return this.dongnm;
	}

	public int getApt_cnt(){
		return this.apt_cnt;
	}

	public int getHous_cnt(){
		return this.hous_cnt;
	}

	public int getShop_cnt(){
		return this.shop_cnt;
	}

	public int getOffi_room_cnt(){
		return this.offi_room_cnt;
	}

	public int getDongtot(){
		return this.dongtot;
	}
}

/* 작성시간 : Wed Oct 19 17:42:09 KST 2016 */