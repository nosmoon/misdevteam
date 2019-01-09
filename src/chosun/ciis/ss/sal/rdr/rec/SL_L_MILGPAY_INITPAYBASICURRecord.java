/***************************************************************************************************
* 파일명 : SL_L_MILGPAY_INITPAYBASICURRecord.java
* 기능 : 독자정보관리(마일리지지급내역팝업-초기화면)
* 작성일자 : 2004-06-03
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.ds.*;

/**
 * 독자정보관리(마일리지지급내역팝업-초기화면)
 *
 */

public class SL_L_MILGPAY_INITPAYBASICURRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpycd;
	public String cmpynm;
	public String medicd;
	public String medinm;
	public String payclsfcd;
	public String payclsfnm;
	public String paybasicd;
	public String paybasinm;
	public String pontcalcclsfcd;
	public int pont;
	public int pontrate;
	public int hdqtallmratio;
	public int boallmratio;
	public int adjmexchrate;

	public SL_L_MILGPAY_INITPAYBASICURRecord(){}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setCmpynm(String cmpynm){
		this.cmpynm = cmpynm;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setPayclsfcd(String payclsfcd){
		this.payclsfcd = payclsfcd;
	}

	public void setPayclsfnm(String payclsfnm){
		this.payclsfnm = payclsfnm;
	}

	public void setPaybasicd(String paybasicd){
		this.paybasicd = paybasicd;
	}

	public void setPaybasinm(String paybasinm){
		this.paybasinm = paybasinm;
	}

	public void setPontcalcclsfcd(String pontcalcclsfcd){
		this.pontcalcclsfcd = pontcalcclsfcd;
	}

	public void setPont(int pont){
		this.pont = pont;
	}

	public void setPontrate(int pontrate){
		this.pontrate = pontrate;
	}

	public void setHdqtallmratio(int hdqtallmratio){
		this.hdqtallmratio = hdqtallmratio;
	}

	public void setBoallmratio(int boallmratio){
		this.boallmratio = boallmratio;
	}

	public void setAdjmexchrate(int adjmexchrate){
		this.adjmexchrate = adjmexchrate;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getCmpynm(){
		return this.cmpynm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getPayclsfcd(){
		return this.payclsfcd;
	}

	public String getPayclsfnm(){
		return this.payclsfnm;
	}

	public String getPaybasicd(){
		return this.paybasicd;
	}

	public String getPaybasinm(){
		return this.paybasinm;
	}

	public String getPontcalcclsfcd(){
		return this.pontcalcclsfcd;
	}

	public int getPont(){
		return this.pont;
	}

	public int getPontrate(){
		return this.pontrate;
	}

	public int getHdqtallmratio(){
		return this.hdqtallmratio;
	}

	public int getBoallmratio(){
		return this.boallmratio;
	}

	public int getAdjmexchrate(){
		return this.adjmexchrate;
	}
}

/* 작성시간 : Sun Jun 06 20:37:00 KST 2004 */