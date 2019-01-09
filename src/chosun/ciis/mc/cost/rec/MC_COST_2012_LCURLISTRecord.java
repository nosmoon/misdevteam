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


package chosun.ciis.mc.cost.rec;

import java.sql.*;
import chosun.ciis.mc.cost.dm.*;
import chosun.ciis.mc.cost.ds.*;

/**
 * 
 */


public class MC_COST_2012_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cost_dstb_cd;
	public String wbbcdnm;
	public String total_qty;

	public MC_COST_2012_LCURLISTRecord(){}

	public void setCost_dstb_cd(String cost_dstb_cd){
		this.cost_dstb_cd = cost_dstb_cd;
	}

	public void setWbbcdnm(String wbbcdnm){
		this.wbbcdnm = wbbcdnm;
	}

	public void setTotal_qty(String total_qty){
		this.total_qty = total_qty;
	}

	public String getCost_dstb_cd(){
		return this.cost_dstb_cd;
	}

	public String getWbbcdnm(){
		return this.wbbcdnm;
	}

	public String getTotal_qty(){
		return this.total_qty;
	}
}

/* 작성시간 : Wed May 06 17:51:57 KST 2009 */