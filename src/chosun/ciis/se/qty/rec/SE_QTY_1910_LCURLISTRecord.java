/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.qty.rec;

import java.sql.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.ds.*;

/**
 * 
 */


public class SE_QTY_1910_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String part_nm;
	public String area_nm;
	public String send_plac_nm;
	public String bo_cd;
	public String send_plac_seq;
	public String same_yn;
	public String icdc_qty;
	public String calc_qty;
	public String issu_qty;
	public String add_snd_bo_cd;
	public String add_snd_send_plac_seq;
	public String add_snd_send_plac_nm;

	public SE_QTY_1910_LCURLISTRecord(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setSend_plac_nm(String send_plac_nm){
		this.send_plac_nm = send_plac_nm;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setSend_plac_seq(String send_plac_seq){
		this.send_plac_seq = send_plac_seq;
	}

	public void setSame_yn(String same_yn){
		this.same_yn = same_yn;
	}

	public void setIcdc_qty(String icdc_qty){
		this.icdc_qty = icdc_qty;
	}

	public void setCalc_qty(String calc_qty){
		this.calc_qty = calc_qty;
	}

	public void setIssu_qty(String issu_qty){
		this.issu_qty = issu_qty;
	}

	public void setAdd_snd_bo_cd(String add_snd_bo_cd){
		this.add_snd_bo_cd = add_snd_bo_cd;
	}

	public void setAdd_snd_send_plac_seq(String add_snd_send_plac_seq){
		this.add_snd_send_plac_seq = add_snd_send_plac_seq;
	}

	public void setAdd_snd_send_plac_nm(String add_snd_send_plac_nm){
		this.add_snd_send_plac_nm = add_snd_send_plac_nm;
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

	public String getSend_plac_nm(){
		return this.send_plac_nm;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getSend_plac_seq(){
		return this.send_plac_seq;
	}

	public String getSame_yn(){
		return this.same_yn;
	}

	public String getIcdc_qty(){
		return this.icdc_qty;
	}

	public String getCalc_qty(){
		return this.calc_qty;
	}

	public String getIssu_qty(){
		return this.issu_qty;
	}

	public String getAdd_snd_bo_cd(){
		return this.add_snd_bo_cd;
	}

	public String getAdd_snd_send_plac_seq(){
		return this.add_snd_send_plac_seq;
	}

	public String getAdd_snd_send_plac_nm(){
		return this.add_snd_send_plac_nm;
	}
}

/* 작성시간 : Wed Jul 29 20:13:16 KST 2009 */