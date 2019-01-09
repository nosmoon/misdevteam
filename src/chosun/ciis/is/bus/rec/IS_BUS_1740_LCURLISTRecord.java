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


package chosun.ciis.is.bus.rec;

import java.sql.*;
import chosun.ciis.is.bus.dm.*;
import chosun.ciis.is.bus.ds.*;

/**
 * 
 */


public class IS_BUS_1740_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String preng_dt;
	public String seq;
	public String sale_clsf;
	public String spcsale_clsf;
	public String medi_cd;
	public String area_nm;
	public String advcs_nm;
	public String remk_matt;
	public String area_cd;
	public String make_pers;
	public String make_pers_nm;

	public IS_BUS_1740_LCURLISTRecord(){}

	public void setPreng_dt(String preng_dt){
		this.preng_dt = preng_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSale_clsf(String sale_clsf){
		this.sale_clsf = sale_clsf;
	}

	public void setSpcsale_clsf(String spcsale_clsf){
		this.spcsale_clsf = spcsale_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setAdvcs_nm(String advcs_nm){
		this.advcs_nm = advcs_nm;
	}

	public void setRemk_matt(String remk_matt){
		this.remk_matt = remk_matt;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setMake_pers(String make_pers){
		this.make_pers = make_pers;
	}

	public void setMake_pers_nm(String make_pers_nm){
		this.make_pers_nm = make_pers_nm;
	}

	public String getPreng_dt(){
		return this.preng_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSale_clsf(){
		return this.sale_clsf;
	}

	public String getSpcsale_clsf(){
		return this.spcsale_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getAdvcs_nm(){
		return this.advcs_nm;
	}

	public String getRemk_matt(){
		return this.remk_matt;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getMake_pers(){
		return this.make_pers;
	}

	public String getMake_pers_nm(){
		return this.make_pers_nm;
	}
}

/* 작성시간 : Wed Jun 20 16:43:41 KST 2012 */