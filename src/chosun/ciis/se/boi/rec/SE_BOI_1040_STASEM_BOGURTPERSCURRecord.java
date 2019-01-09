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


public class SE_BOI_1040_STASEM_BOGURTPERSCURRecord extends java.lang.Object implements java.io.Serializable{

	public String gurt_pers_flnm;
	public String prn;
	public String zip_1;
	public String zip_2;
	public String addr;
	public String dtls_addr;
	public String tel_no_1;
	public String tel_no_2;
	public String tel_no_3;
	public String ptph_no_1;
	public String ptph_no_2;
	public String ptph_no_3;
	public String gurt_dt;
	public String reg_resn;

	public SE_BOI_1040_STASEM_BOGURTPERSCURRecord(){}

	public void setGurt_pers_flnm(String gurt_pers_flnm){
		this.gurt_pers_flnm = gurt_pers_flnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setZip_1(String zip_1){
		this.zip_1 = zip_1;
	}

	public void setZip_2(String zip_2){
		this.zip_2 = zip_2;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtls_addr(String dtls_addr){
		this.dtls_addr = dtls_addr;
	}

	public void setTel_no_1(String tel_no_1){
		this.tel_no_1 = tel_no_1;
	}

	public void setTel_no_2(String tel_no_2){
		this.tel_no_2 = tel_no_2;
	}

	public void setTel_no_3(String tel_no_3){
		this.tel_no_3 = tel_no_3;
	}

	public void setPtph_no_1(String ptph_no_1){
		this.ptph_no_1 = ptph_no_1;
	}

	public void setPtph_no_2(String ptph_no_2){
		this.ptph_no_2 = ptph_no_2;
	}

	public void setPtph_no_3(String ptph_no_3){
		this.ptph_no_3 = ptph_no_3;
	}

	public void setGurt_dt(String gurt_dt){
		this.gurt_dt = gurt_dt;
	}

	public void setReg_resn(String reg_resn){
		this.reg_resn = reg_resn;
	}

	public String getGurt_pers_flnm(){
		return this.gurt_pers_flnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getZip_1(){
		return this.zip_1;
	}

	public String getZip_2(){
		return this.zip_2;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtls_addr(){
		return this.dtls_addr;
	}

	public String getTel_no_1(){
		return this.tel_no_1;
	}

	public String getTel_no_2(){
		return this.tel_no_2;
	}

	public String getTel_no_3(){
		return this.tel_no_3;
	}

	public String getPtph_no_1(){
		return this.ptph_no_1;
	}

	public String getPtph_no_2(){
		return this.ptph_no_2;
	}

	public String getPtph_no_3(){
		return this.ptph_no_3;
	}

	public String getGurt_dt(){
		return this.gurt_dt;
	}

	public String getReg_resn(){
		return this.reg_resn;
	}
}

/* 작성시간 : Wed Oct 19 17:42:09 KST 2016 */