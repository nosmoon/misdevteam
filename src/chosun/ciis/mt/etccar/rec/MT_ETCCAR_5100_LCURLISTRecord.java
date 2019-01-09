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


package chosun.ciis.mt.etccar.rec;

import java.sql.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.ds.*;

/**
 * 
 */


public class MT_ETCCAR_5100_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String driv_dt;
	public String car_no;
	public String cmpy_mang_nm;
	public String oil_kind;
	public String rungag;
	public String carsno;
	public String buyoil_qunt01;
	public String buyoil_qunt02;
	public String buyoil_qunt03;
	public String buyoil_qunt04;
	public String buyoil_qunt05;
	public String buyoil_qunt06;
	public String buyoil_qunt07;
	public String buyoil_qunt08;
	public String buyoil_qunt09;
	public String buyoil_qunt10;
	public String buyoil_qunt11;
	public String buyoil_qunt12;
	public String buyoil_qunt13;
	public String buyoil_qunt14;
	public String buyoil_qunt15;
	public String buyoil_qunt16;
	public String buyoil_qunt17;
	public String buyoil_qunt18;
	public String buyoil_qunt19;
	public String buyoil_qunt20;
	public String buyoil_qunt21;
	public String buyoil_qunt22;
	public String buyoil_qunt23;
	public String buyoil_qunt24;
	public String buyoil_qunt25;
	public String buyoil_qunt26;
	public String buyoil_qunt27;
	public String buyoil_qunt28;
	public String buyoil_qunt29;
	public String buyoil_qunt30;
	public String buyoil_qunt31;

	public MT_ETCCAR_5100_LCURLISTRecord(){}

	public void setDriv_dt(String driv_dt){
		this.driv_dt = driv_dt;
	}

	public void setCar_no(String car_no){
		this.car_no = car_no;
	}

	public void setCmpy_mang_nm(String cmpy_mang_nm){
		this.cmpy_mang_nm = cmpy_mang_nm;
	}

	public void setOil_kind(String oil_kind){
		this.oil_kind = oil_kind;
	}

	public void setRungag(String rungag){
		this.rungag = rungag;
	}

	public void setCarsno(String carsno){
		this.carsno = carsno;
	}

	public void setBuyoil_qunt01(String buyoil_qunt01){
		this.buyoil_qunt01 = buyoil_qunt01;
	}

	public void setBuyoil_qunt02(String buyoil_qunt02){
		this.buyoil_qunt02 = buyoil_qunt02;
	}

	public void setBuyoil_qunt03(String buyoil_qunt03){
		this.buyoil_qunt03 = buyoil_qunt03;
	}

	public void setBuyoil_qunt04(String buyoil_qunt04){
		this.buyoil_qunt04 = buyoil_qunt04;
	}

	public void setBuyoil_qunt05(String buyoil_qunt05){
		this.buyoil_qunt05 = buyoil_qunt05;
	}

	public void setBuyoil_qunt06(String buyoil_qunt06){
		this.buyoil_qunt06 = buyoil_qunt06;
	}

	public void setBuyoil_qunt07(String buyoil_qunt07){
		this.buyoil_qunt07 = buyoil_qunt07;
	}

	public void setBuyoil_qunt08(String buyoil_qunt08){
		this.buyoil_qunt08 = buyoil_qunt08;
	}

	public void setBuyoil_qunt09(String buyoil_qunt09){
		this.buyoil_qunt09 = buyoil_qunt09;
	}

	public void setBuyoil_qunt10(String buyoil_qunt10){
		this.buyoil_qunt10 = buyoil_qunt10;
	}

	public void setBuyoil_qunt11(String buyoil_qunt11){
		this.buyoil_qunt11 = buyoil_qunt11;
	}

	public void setBuyoil_qunt12(String buyoil_qunt12){
		this.buyoil_qunt12 = buyoil_qunt12;
	}

	public void setBuyoil_qunt13(String buyoil_qunt13){
		this.buyoil_qunt13 = buyoil_qunt13;
	}

	public void setBuyoil_qunt14(String buyoil_qunt14){
		this.buyoil_qunt14 = buyoil_qunt14;
	}

	public void setBuyoil_qunt15(String buyoil_qunt15){
		this.buyoil_qunt15 = buyoil_qunt15;
	}

	public void setBuyoil_qunt16(String buyoil_qunt16){
		this.buyoil_qunt16 = buyoil_qunt16;
	}

	public void setBuyoil_qunt17(String buyoil_qunt17){
		this.buyoil_qunt17 = buyoil_qunt17;
	}

	public void setBuyoil_qunt18(String buyoil_qunt18){
		this.buyoil_qunt18 = buyoil_qunt18;
	}

	public void setBuyoil_qunt19(String buyoil_qunt19){
		this.buyoil_qunt19 = buyoil_qunt19;
	}

	public void setBuyoil_qunt20(String buyoil_qunt20){
		this.buyoil_qunt20 = buyoil_qunt20;
	}

	public void setBuyoil_qunt21(String buyoil_qunt21){
		this.buyoil_qunt21 = buyoil_qunt21;
	}

	public void setBuyoil_qunt22(String buyoil_qunt22){
		this.buyoil_qunt22 = buyoil_qunt22;
	}

	public void setBuyoil_qunt23(String buyoil_qunt23){
		this.buyoil_qunt23 = buyoil_qunt23;
	}

	public void setBuyoil_qunt24(String buyoil_qunt24){
		this.buyoil_qunt24 = buyoil_qunt24;
	}

	public void setBuyoil_qunt25(String buyoil_qunt25){
		this.buyoil_qunt25 = buyoil_qunt25;
	}

	public void setBuyoil_qunt26(String buyoil_qunt26){
		this.buyoil_qunt26 = buyoil_qunt26;
	}

	public void setBuyoil_qunt27(String buyoil_qunt27){
		this.buyoil_qunt27 = buyoil_qunt27;
	}

	public void setBuyoil_qunt28(String buyoil_qunt28){
		this.buyoil_qunt28 = buyoil_qunt28;
	}

	public void setBuyoil_qunt29(String buyoil_qunt29){
		this.buyoil_qunt29 = buyoil_qunt29;
	}

	public void setBuyoil_qunt30(String buyoil_qunt30){
		this.buyoil_qunt30 = buyoil_qunt30;
	}

	public void setBuyoil_qunt31(String buyoil_qunt31){
		this.buyoil_qunt31 = buyoil_qunt31;
	}

	public String getDriv_dt(){
		return this.driv_dt;
	}

	public String getCar_no(){
		return this.car_no;
	}

	public String getCmpy_mang_nm(){
		return this.cmpy_mang_nm;
	}

	public String getOil_kind(){
		return this.oil_kind;
	}

	public String getRungag(){
		return this.rungag;
	}

	public String getCarsno(){
		return this.carsno;
	}

	public String getBuyoil_qunt01(){
		return this.buyoil_qunt01;
	}

	public String getBuyoil_qunt02(){
		return this.buyoil_qunt02;
	}

	public String getBuyoil_qunt03(){
		return this.buyoil_qunt03;
	}

	public String getBuyoil_qunt04(){
		return this.buyoil_qunt04;
	}

	public String getBuyoil_qunt05(){
		return this.buyoil_qunt05;
	}

	public String getBuyoil_qunt06(){
		return this.buyoil_qunt06;
	}

	public String getBuyoil_qunt07(){
		return this.buyoil_qunt07;
	}

	public String getBuyoil_qunt08(){
		return this.buyoil_qunt08;
	}

	public String getBuyoil_qunt09(){
		return this.buyoil_qunt09;
	}

	public String getBuyoil_qunt10(){
		return this.buyoil_qunt10;
	}

	public String getBuyoil_qunt11(){
		return this.buyoil_qunt11;
	}

	public String getBuyoil_qunt12(){
		return this.buyoil_qunt12;
	}

	public String getBuyoil_qunt13(){
		return this.buyoil_qunt13;
	}

	public String getBuyoil_qunt14(){
		return this.buyoil_qunt14;
	}

	public String getBuyoil_qunt15(){
		return this.buyoil_qunt15;
	}

	public String getBuyoil_qunt16(){
		return this.buyoil_qunt16;
	}

	public String getBuyoil_qunt17(){
		return this.buyoil_qunt17;
	}

	public String getBuyoil_qunt18(){
		return this.buyoil_qunt18;
	}

	public String getBuyoil_qunt19(){
		return this.buyoil_qunt19;
	}

	public String getBuyoil_qunt20(){
		return this.buyoil_qunt20;
	}

	public String getBuyoil_qunt21(){
		return this.buyoil_qunt21;
	}

	public String getBuyoil_qunt22(){
		return this.buyoil_qunt22;
	}

	public String getBuyoil_qunt23(){
		return this.buyoil_qunt23;
	}

	public String getBuyoil_qunt24(){
		return this.buyoil_qunt24;
	}

	public String getBuyoil_qunt25(){
		return this.buyoil_qunt25;
	}

	public String getBuyoil_qunt26(){
		return this.buyoil_qunt26;
	}

	public String getBuyoil_qunt27(){
		return this.buyoil_qunt27;
	}

	public String getBuyoil_qunt28(){
		return this.buyoil_qunt28;
	}

	public String getBuyoil_qunt29(){
		return this.buyoil_qunt29;
	}

	public String getBuyoil_qunt30(){
		return this.buyoil_qunt30;
	}

	public String getBuyoil_qunt31(){
		return this.buyoil_qunt31;
	}
}

/* 작성시간 : Wed Apr 22 15:36:48 KST 2009 */