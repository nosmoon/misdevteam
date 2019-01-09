/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.boi.rec;

import java.sql.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 * 
 */


public class SE_BOI_2820_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bonm;
	public String bo_head_nm;
	public String gurt_pers_flnm;
	public String zip;
	public String tel_no;
	public String ptph_no;
	public String addr;
	public String dtls_addr;

	public SE_BOI_2820_SCURLISTRecord(){}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setGurt_pers_flnm(String gurt_pers_flnm){
		this.gurt_pers_flnm = gurt_pers_flnm;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtls_addr(String dtls_addr){
		this.dtls_addr = dtls_addr;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getGurt_pers_flnm(){
		return this.gurt_pers_flnm;
	}

	public String getZip(){
		return this.zip;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtls_addr(){
		return this.dtls_addr;
	}
}

/* 작성시간 : Wed Nov 02 10:29:39 KST 2016 */