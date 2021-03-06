/***************************************************************************************************
* 파일명 : SS_MO_L_MODIHISTDVSMODICURRecord.java
* 기능 :  CIIS-판매-기준정보관리-모바일로그인관리-기기변경,휴대번호변경이력을 위한 Record
* 작성일자 : 2017-07-10
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 *  CIIS-판매-기준정보관리-모바일로그인관리-기기변경,휴대번호변경이력을 위한 Record
 */


public class SS_MO_L_MODIHISTDVSMODICURRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String bonm;
	public String boemp_no;
	public String chgno;
	public String flnm;
	public String chgincmgdt;
	public String chgincmgpers;
	public String chgincmgnm;
	public String bf_dvsid;
	public String af_dvsid;
	public String chgincmgremk;
	public String rnum;

	public SS_MO_L_MODIHISTDVSMODICURRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBoemp_no(String boemp_no){
		this.boemp_no = boemp_no;
	}

	public void setChgno(String chgno){
		this.chgno = chgno;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setChgincmgdt(String chgincmgdt){
		this.chgincmgdt = chgincmgdt;
	}

	public void setChgincmgpers(String chgincmgpers){
		this.chgincmgpers = chgincmgpers;
	}

	public void setChgincmgnm(String chgincmgnm){
		this.chgincmgnm = chgincmgnm;
	}

	public void setBf_dvsid(String bf_dvsid){
		this.bf_dvsid = bf_dvsid;
	}

	public void setAf_dvsid(String af_dvsid){
		this.af_dvsid = af_dvsid;
	}

	public void setChgincmgremk(String chgincmgremk){
		this.chgincmgremk = chgincmgremk;
	}

	public void setRnum(String rnum){
		this.rnum = rnum;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBoemp_no(){
		return this.boemp_no;
	}

	public String getChgno(){
		return this.chgno;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getChgincmgdt(){
		return this.chgincmgdt;
	}

	public String getChgincmgpers(){
		return this.chgincmgpers;
	}

	public String getChgincmgnm(){
		return this.chgincmgnm;
	}

	public String getBf_dvsid(){
		return this.bf_dvsid;
	}

	public String getAf_dvsid(){
		return this.af_dvsid;
	}

	public String getChgincmgremk(){
		return this.chgincmgremk;
	}

	public String getRnum(){
		return this.rnum;
	}
}

/* 작성시간 : Thu Jul 13 14:32:51 KST 2017 */