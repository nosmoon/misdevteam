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


package chosun.ciis.mt.etcimpt.rec;

import java.sql.*;
import chosun.ciis.mt.etcimpt.dm.*;
import chosun.ciis.mt.etcimpt.ds.*;

/**
 * 
 */


public class MT_ETCIMPT_1300_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yy;
	public String case_nm;
	public String offer_pric;
	public String offer_pric_curc_clsf;
	public String ship_pers;
	public String leas_clsf;
	public String ship_widr;

	public MT_ETCIMPT_1300_LCURLISTRecord(){}

	public void setYy(String yy){
		this.yy = yy;
	}

	public void setCase_nm(String case_nm){
		this.case_nm = case_nm;
	}

	public void setOffer_pric(String offer_pric){
		this.offer_pric = offer_pric;
	}

	public void setOffer_pric_curc_clsf(String offer_pric_curc_clsf){
		this.offer_pric_curc_clsf = offer_pric_curc_clsf;
	}

	public void setShip_pers(String ship_pers){
		this.ship_pers = ship_pers;
	}

	public void setLeas_clsf(String leas_clsf){
		this.leas_clsf = leas_clsf;
	}

	public void setShip_widr(String ship_widr){
		this.ship_widr = ship_widr;
	}

	public String getYy(){
		return this.yy;
	}

	public String getCase_nm(){
		return this.case_nm;
	}

	public String getOffer_pric(){
		return this.offer_pric;
	}

	public String getOffer_pric_curc_clsf(){
		return this.offer_pric_curc_clsf;
	}

	public String getShip_pers(){
		return this.ship_pers;
	}

	public String getLeas_clsf(){
		return this.leas_clsf;
	}

	public String getShip_widr(){
		return this.ship_widr;
	}
}

/* 작성시간 : Tue May 19 19:29:45 KST 2009 */