/***************************************************************************************************
* 파일명 : SE_BNS_1710_LCURLISTRecord.java
* 기능 : 판매-판촉물관리 - 판촉물배분현황조회
* 작성일자 : 2009-05-04
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.bns.rec;

import java.sql.*;
import chosun.ciis.se.bns.dm.*;
import chosun.ciis.se.bns.ds.*;

/**
 * 
 */


public class SE_BNS_1710_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd		;
	public String bns_item_cd	;
	public String bns_item_nm	;
	public String bo_cd			;
	public String bo_seq		;
	public String dept_cd		;
	public String dept_nm		;
	public String part_cd		;
	public String part_nm		;
	public String area_cd		;
	public String area_nm		;
	public String bo_nm			;
	public String in_tot_qunt	;
	public String divn_tot_qunt	;
	public String uprc			;
	public String divn_uprc		;
	public String divn_dt		;
	public String qunt			;
	public String un_divn_qunt	;

	public SE_BNS_1710_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBns_item_cd(String bns_item_cd){
		this.bns_item_cd = bns_item_cd;
	}

	public void setBns_item_nm(String bns_item_nm){
		this.bns_item_nm = bns_item_nm;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setIn_tot_qunt(String in_tot_qunt){
		this.in_tot_qunt = in_tot_qunt;
	}

	public void setDivn_tot_qunt(String divn_tot_qunt){
		this.divn_tot_qunt = divn_tot_qunt;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setDivn_uprc(String divn_uprc){
		this.divn_uprc = divn_uprc;
	}

	public void setDivn_dt(String divn_dt){
		this.divn_dt = divn_dt;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setUn_divn_qunt(String un_divn_qunt){
		this.un_divn_qunt = un_divn_qunt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBns_item_cd(){
		return this.bns_item_cd;
	}

	public String getBns_item_nm(){
		return this.bns_item_nm;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPart_cd(){
		return this.part_cd;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getIn_tot_qunt(){
		return this.in_tot_qunt;
	}

	public String getDivn_tot_qunt(){
		return this.divn_tot_qunt;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getDivn_uprc(){
		return this.divn_uprc;
	}

	public String getDivn_dt(){
		return this.divn_dt;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getUn_divn_qunt(){
		return this.un_divn_qunt;
	}
}

/* 작성시간 : Mon May 04 14:08:41 KST 2009 */