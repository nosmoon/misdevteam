/***************************************************************************************************
* 파일명 : SE_BNS_1610_LCURLISTRecord.java
* 기능 : 판매-판촉물관리 - 판촉물정정처리
* 작성일자 : 2009-04-29
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


public class SE_BNS_1610_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd			;
	public String dept_nm			;
	public String part_cd			;
	public String part_nm			;
	public String area_cd			;
	public String area_nm			;
	public String bo_cd				;
	public String bo_seq			;
	public String bo_nm				;
	public String bo_head_nm		;
	public String ewh_seq			;
	public String uprc				;
	public String divn_uprc			;
	public String qunt				;
	public String compen_divn_amt	;
	public String nocompen_divn_amt	;
	public String divn_dt			;
	public String bns_item_cd		;

	public String getBns_item_cd() {
		return bns_item_cd;
	}

	public void setBns_item_cd(String bns_item_cd) {
		this.bns_item_cd = bns_item_cd;
	}

	public SE_BNS_1610_LCURLISTRecord(){}

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

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setEwh_seq(String ewh_seq){
		this.ewh_seq = ewh_seq;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setDivn_uprc(String divn_uprc){
		this.divn_uprc = divn_uprc;
	}

	public void setCompen_divn_amt(String compen_divn_amt){
		this.compen_divn_amt = compen_divn_amt;
	}

	public void setNocompen_divn_amt(String nocompen_divn_amt){
		this.nocompen_divn_amt = nocompen_divn_amt;
	}

	public void setDivn_dt(String divn_dt){
		this.divn_dt = divn_dt;
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

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getEwh_seq(){
		return this.ewh_seq;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getDivn_uprc(){
		return this.divn_uprc;
	}

	public String getCompen_divn_amt(){
		return this.compen_divn_amt;
	}

	public String getNocompen_divn_amt(){
		return this.nocompen_divn_amt;
	}

	public String getDivn_dt(){
		return this.divn_dt;
	}

	public String getQunt() {
		return qunt;
	}

	public void setQunt(String qunt) {
		this.qunt = qunt;
	}
}

/* 작성시간 : Wed Apr 29 18:09:32 KST 2009 */