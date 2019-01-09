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


package chosun.ciis.mt.submatrin.rec;

import java.sql.*;
import chosun.ciis.mt.submatrin.dm.*;
import chosun.ciis.mt.submatrin.ds.*;

/**
 * 
 */


public class MT_SUBMATRIN_1118_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yy;
	public String seq;
	public String smleasegb;
	public String case_nm;
	public String impt_resn;
	public String offer_pric;
	public String offer_pric_curc_clsf;
	public String ship_pers;
	public String use_dept_nm;
	public String ship_widr;

	public MT_SUBMATRIN_1118_LCURLISTRecord(){}

	public void setYy(String yy){
		this.yy = yy;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSmleasegb(String smleasegb){
		this.smleasegb = smleasegb;
	}

	public void setCase_nm(String case_nm){
		this.case_nm = case_nm;
	}

	public void setImpt_resn(String impt_resn){
		this.impt_resn = impt_resn;
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

	public void setUse_dept_nm(String use_dept_nm){
		this.use_dept_nm = use_dept_nm;
	}

	public void setShip_widr(String ship_widr){
		this.ship_widr = ship_widr;
	}

	public String getYy(){
		return this.yy;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSmleasegb(){
		return this.smleasegb;
	}

	public String getCase_nm(){
		return this.case_nm;
	}

	public String getImpt_resn(){
		return this.impt_resn;
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

	public String getUse_dept_nm(){
		return this.use_dept_nm;
	}

	public String getShip_widr(){
		return this.ship_widr;
	}
}

/* 작성시간 : Mon Jun 01 13:51:15 KST 2009 */