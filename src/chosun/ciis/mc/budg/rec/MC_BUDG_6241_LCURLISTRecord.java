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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_6241_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pubc_dt;
	public String week;
	public String tot_pubc1;
	public String adv_pubc1;
	public String adv_squar1;
	public String uprc1;
	public String adv_fee1;
	public String loss_pubc1;
	public String loss_squar1;
	public String loss_uprc1;
	public String loss_adv_fee1;
	public String tot_pubc2;
	public String adv_pubc2;
	public String adv_squar2;
	public String uprc2;
	public String adv_fee2;
	public String loss_pubc2;
	public String loss_squar2;
	public String loss_uprc2;
	public String loss_adv_fee2;
	public String tot_pubc3;
	public String adv_pubc3;
	public String adv_squar3;
	public String uprc3;
	public String adv_fee3;
	public String loss_pubc3;
	public String loss_squar3;
	public String loss_uprc3;
	public String loss_adv_fee;
	public String tot_pubc4;
	public String adv_pubc4;
	public String adv_squar4;
	public String uprc4;
	public String adv_fee4;
	public String loss_pubc4;
	public String loss_squar4;
	public String loss_uprc4;
	public String loss_adv_fee4;

	public MC_BUDG_6241_LCURLISTRecord(){}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setWeek(String week){
		this.week = week;
	}

	public void setTot_pubc1(String tot_pubc1){
		this.tot_pubc1 = tot_pubc1;
	}

	public void setAdv_pubc1(String adv_pubc1){
		this.adv_pubc1 = adv_pubc1;
	}

	public void setAdv_squar1(String adv_squar1){
		this.adv_squar1 = adv_squar1;
	}

	public void setUprc1(String uprc1){
		this.uprc1 = uprc1;
	}

	public void setAdv_fee1(String adv_fee1){
		this.adv_fee1 = adv_fee1;
	}

	public void setLoss_pubc1(String loss_pubc1){
		this.loss_pubc1 = loss_pubc1;
	}

	public void setLoss_squar1(String loss_squar1){
		this.loss_squar1 = loss_squar1;
	}

	public void setLoss_uprc1(String loss_uprc1){
		this.loss_uprc1 = loss_uprc1;
	}

	public void setLoss_adv_fee1(String loss_adv_fee1){
		this.loss_adv_fee1 = loss_adv_fee1;
	}

	public void setTot_pubc2(String tot_pubc2){
		this.tot_pubc2 = tot_pubc2;
	}

	public void setAdv_pubc2(String adv_pubc2){
		this.adv_pubc2 = adv_pubc2;
	}

	public void setAdv_squar2(String adv_squar2){
		this.adv_squar2 = adv_squar2;
	}

	public void setUprc2(String uprc2){
		this.uprc2 = uprc2;
	}

	public void setAdv_fee2(String adv_fee2){
		this.adv_fee2 = adv_fee2;
	}

	public void setLoss_pubc2(String loss_pubc2){
		this.loss_pubc2 = loss_pubc2;
	}

	public void setLoss_squar2(String loss_squar2){
		this.loss_squar2 = loss_squar2;
	}

	public void setLoss_uprc2(String loss_uprc2){
		this.loss_uprc2 = loss_uprc2;
	}

	public void setLoss_adv_fee2(String loss_adv_fee2){
		this.loss_adv_fee2 = loss_adv_fee2;
	}

	public void setTot_pubc3(String tot_pubc3){
		this.tot_pubc3 = tot_pubc3;
	}

	public void setAdv_pubc3(String adv_pubc3){
		this.adv_pubc3 = adv_pubc3;
	}

	public void setAdv_squar3(String adv_squar3){
		this.adv_squar3 = adv_squar3;
	}

	public void setUprc3(String uprc3){
		this.uprc3 = uprc3;
	}

	public void setAdv_fee3(String adv_fee3){
		this.adv_fee3 = adv_fee3;
	}

	public void setLoss_pubc3(String loss_pubc3){
		this.loss_pubc3 = loss_pubc3;
	}

	public void setLoss_squar3(String loss_squar3){
		this.loss_squar3 = loss_squar3;
	}

	public void setLoss_uprc3(String loss_uprc3){
		this.loss_uprc3 = loss_uprc3;
	}

	public void setLoss_adv_fee(String loss_adv_fee){
		this.loss_adv_fee = loss_adv_fee;
	}

	public void setTot_pubc4(String tot_pubc4){
		this.tot_pubc4 = tot_pubc4;
	}

	public void setAdv_pubc4(String adv_pubc4){
		this.adv_pubc4 = adv_pubc4;
	}

	public void setAdv_squar4(String adv_squar4){
		this.adv_squar4 = adv_squar4;
	}

	public void setUprc4(String uprc4){
		this.uprc4 = uprc4;
	}

	public void setAdv_fee4(String adv_fee4){
		this.adv_fee4 = adv_fee4;
	}

	public void setLoss_pubc4(String loss_pubc4){
		this.loss_pubc4 = loss_pubc4;
	}

	public void setLoss_squar4(String loss_squar4){
		this.loss_squar4 = loss_squar4;
	}

	public void setLoss_uprc4(String loss_uprc4){
		this.loss_uprc4 = loss_uprc4;
	}

	public void setLoss_adv_fee4(String loss_adv_fee4){
		this.loss_adv_fee4 = loss_adv_fee4;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getWeek(){
		return this.week;
	}

	public String getTot_pubc1(){
		return this.tot_pubc1;
	}

	public String getAdv_pubc1(){
		return this.adv_pubc1;
	}

	public String getAdv_squar1(){
		return this.adv_squar1;
	}

	public String getUprc1(){
		return this.uprc1;
	}

	public String getAdv_fee1(){
		return this.adv_fee1;
	}

	public String getLoss_pubc1(){
		return this.loss_pubc1;
	}

	public String getLoss_squar1(){
		return this.loss_squar1;
	}

	public String getLoss_uprc1(){
		return this.loss_uprc1;
	}

	public String getLoss_adv_fee1(){
		return this.loss_adv_fee1;
	}

	public String getTot_pubc2(){
		return this.tot_pubc2;
	}

	public String getAdv_pubc2(){
		return this.adv_pubc2;
	}

	public String getAdv_squar2(){
		return this.adv_squar2;
	}

	public String getUprc2(){
		return this.uprc2;
	}

	public String getAdv_fee2(){
		return this.adv_fee2;
	}

	public String getLoss_pubc2(){
		return this.loss_pubc2;
	}

	public String getLoss_squar2(){
		return this.loss_squar2;
	}

	public String getLoss_uprc2(){
		return this.loss_uprc2;
	}

	public String getLoss_adv_fee2(){
		return this.loss_adv_fee2;
	}

	public String getTot_pubc3(){
		return this.tot_pubc3;
	}

	public String getAdv_pubc3(){
		return this.adv_pubc3;
	}

	public String getAdv_squar3(){
		return this.adv_squar3;
	}

	public String getUprc3(){
		return this.uprc3;
	}

	public String getAdv_fee3(){
		return this.adv_fee3;
	}

	public String getLoss_pubc3(){
		return this.loss_pubc3;
	}

	public String getLoss_squar3(){
		return this.loss_squar3;
	}

	public String getLoss_uprc3(){
		return this.loss_uprc3;
	}

	public String getLoss_adv_fee(){
		return this.loss_adv_fee;
	}

	public String getTot_pubc4(){
		return this.tot_pubc4;
	}

	public String getAdv_pubc4(){
		return this.adv_pubc4;
	}

	public String getAdv_squar4(){
		return this.adv_squar4;
	}

	public String getUprc4(){
		return this.uprc4;
	}

	public String getAdv_fee4(){
		return this.adv_fee4;
	}

	public String getLoss_pubc4(){
		return this.loss_pubc4;
	}

	public String getLoss_squar4(){
		return this.loss_squar4;
	}

	public String getLoss_uprc4(){
		return this.loss_uprc4;
	}

	public String getLoss_adv_fee4(){
		return this.loss_adv_fee4;
	}
}

/* 작성시간 : Wed May 20 10:08:03 KST 2009 */