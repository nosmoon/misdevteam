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


public class MT_ETCCAR_5300_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String driv_dt;
	public String car_no;
	public String cmpy_mang_nm;
	public String oil_kind;
	public String rungag;
	public String buyoil_qunt;
	public String uprc;
	public String money;
	public String fuel;

	public MT_ETCCAR_5300_LCURLISTRecord(){}

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

	public void setBuyoil_qunt(String buyoil_qunt){
		this.buyoil_qunt = buyoil_qunt;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setMoney(String money){
		this.money = money;
	}

	public void setFuel(String fuel){
		this.fuel = fuel;
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

	public String getBuyoil_qunt(){
		return this.buyoil_qunt;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getMoney(){
		return this.money;
	}

	public String getFuel(){
		return this.fuel;
	}
}

/* 작성시간 : Thu Apr 23 18:29:33 KST 2009 */