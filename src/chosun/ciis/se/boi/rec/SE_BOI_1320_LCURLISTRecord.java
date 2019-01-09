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


package chosun.ciis.se.boi.rec;

import java.sql.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 * 
 */


public class SE_BOI_1320_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String area_nm;
	public String bo_nm;
	public String bo_head_nm;
	public String ern;
	public String bizcond;
	public String item;
	public String dlco_nm;
	public String zip;
	public String addr;
	public String presi_nm;
	public String presi_prn;
	public String presi_zip;
	public String presi_addr;

	public SE_BOI_1320_LCURLISTRecord(){}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setBizcond(String bizcond){
		this.bizcond = bizcond;
	}

	public void setItem(String item){
		this.item = item;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setPresi_prn(String presi_prn){
		this.presi_prn = presi_prn;
	}

	public void setPresi_zip(String presi_zip){
		this.presi_zip = presi_zip;
	}

	public void setPresi_addr(String presi_addr){
		this.presi_addr = presi_addr;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getBizcond(){
		return this.bizcond;
	}

	public String getItem(){
		return this.item;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getZip(){
		return this.zip;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getPresi_prn(){
		return this.presi_prn;
	}

	public String getPresi_zip(){
		return this.presi_zip;
	}

	public String getPresi_addr(){
		return this.presi_addr;
	}
}

/* 작성시간 : Tue Feb 03 10:01:21 KST 2009 */