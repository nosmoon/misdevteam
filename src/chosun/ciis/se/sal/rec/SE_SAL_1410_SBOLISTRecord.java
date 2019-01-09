/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.sal.rec;

import java.sql.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.ds.*;

/**
 * 
 */


public class SE_SAL_1410_SBOLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bo_cd;
	public String bo_seq;
	public String bo_head_nm;
	public String dept_nm;
	public String part_nm;
	public String area_nm;
	public String flnm;
	public String cntr_stat_nm;
	public String bo_cntr_dt;
	public String jd_sell_net_nm;
	public String jd_sell_net_clsf;

	public SE_SAL_1410_SBOLISTRecord(){}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setCntr_stat_nm(String cntr_stat_nm){
		this.cntr_stat_nm = cntr_stat_nm;
	}

	public void setBo_cntr_dt(String bo_cntr_dt){
		this.bo_cntr_dt = bo_cntr_dt;
	}

	public void setJd_sell_net_nm(String jd_sell_net_nm){
		this.jd_sell_net_nm = jd_sell_net_nm;
	}

	public void setJd_sell_net_clsf(String jd_sell_net_clsf){
		this.jd_sell_net_clsf = jd_sell_net_clsf;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getCntr_stat_nm(){
		return this.cntr_stat_nm;
	}

	public String getBo_cntr_dt(){
		return this.bo_cntr_dt;
	}

	public String getJd_sell_net_nm(){
		return this.jd_sell_net_nm;
	}

	public String getJd_sell_net_clsf(){
		return this.jd_sell_net_clsf;
	}
}

/* 작성시간 : Wed Sep 02 14:58:23 KST 2009 */