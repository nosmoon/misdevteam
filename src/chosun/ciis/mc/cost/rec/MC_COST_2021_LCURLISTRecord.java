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


public class MC_COST_2021_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cost_dstb_cd;
	public String cost_dstb_nm;
	public String cur_mon_qty;
	public String bef_mon_qty;
	public String sub_qty;

	public MC_COST_2021_LCURLISTRecord(){}

	public void setCost_dstb_cd(String cost_dstb_cd){
		this.cost_dstb_cd = cost_dstb_cd;
	}

	public void setCost_dstb_nm(String cost_dstb_nm){
		this.cost_dstb_nm = cost_dstb_nm;
	}

	public void setCur_mon_qty(String cur_mon_qty){
		this.cur_mon_qty = cur_mon_qty;
	}

	public void setBef_mon_qty(String bef_mon_qty){
		this.bef_mon_qty = bef_mon_qty;
	}

	public void setSub_qty(String sub_qty){
		this.sub_qty = sub_qty;
	}

	public String getCost_dstb_cd(){
		return this.cost_dstb_cd;
	}

	public String getCost_dstb_nm(){
		return this.cost_dstb_nm;
	}

	public String getCur_mon_qty(){
		return this.cur_mon_qty;
	}

	public String getBef_mon_qty(){
		return this.bef_mon_qty;
	}

	public String getSub_qty(){
		return this.sub_qty;
	}
}

/* 작성시간 : Fri May 08 13:01:51 KST 2009 */