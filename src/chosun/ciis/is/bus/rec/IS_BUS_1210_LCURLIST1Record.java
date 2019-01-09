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


public class IS_BUS_1210_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String wkcd;
	public String frdt;
	public String todt;
	public String sale_rfl_ratio;
	public String sale_rfl_ratio_cum;
	public String clamt_rfl_ratio;
	public String clamt_rfl_ratio_cum;
	public String chg_dt_tm;

	public IS_BUS_1210_LCURLIST1Record(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setWkcd(String wkcd){
		this.wkcd = wkcd;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setSale_rfl_ratio(String sale_rfl_ratio){
		this.sale_rfl_ratio = sale_rfl_ratio;
	}

	public void setSale_rfl_ratio_cum(String sale_rfl_ratio_cum){
		this.sale_rfl_ratio_cum = sale_rfl_ratio_cum;
	}

	public void setClamt_rfl_ratio(String clamt_rfl_ratio){
		this.clamt_rfl_ratio = clamt_rfl_ratio;
	}

	public void setClamt_rfl_ratio_cum(String clamt_rfl_ratio_cum){
		this.clamt_rfl_ratio_cum = clamt_rfl_ratio_cum;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getWkcd(){
		return this.wkcd;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getSale_rfl_ratio(){
		return this.sale_rfl_ratio;
	}

	public String getSale_rfl_ratio_cum(){
		return this.sale_rfl_ratio_cum;
	}

	public String getClamt_rfl_ratio(){
		return this.clamt_rfl_ratio;
	}

	public String getClamt_rfl_ratio_cum(){
		return this.clamt_rfl_ratio_cum;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}
}

/* 작성시간 : Wed Jun 20 10:14:40 KST 2012 */