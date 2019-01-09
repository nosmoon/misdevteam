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


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_1602_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String now_impt_stot;
	public String prv_impt_stot;
	public String impt_stot;
	public String non_tax_jrnst;
	public String prv_non_tax_prod;
	public String non_tax_jrnst_stot;
	public String non_tax_frnc;
	public String prv_non_tax_frnc;
	public String non_tax_frnc_stot;
	public String now_stot;
	public String prv_stot;
	public String stot;

	public HD_SALY_1602_LCURLISTRecord(){}

	public void setNow_impt_stot(String now_impt_stot){
		this.now_impt_stot = now_impt_stot;
	}

	public void setPrv_impt_stot(String prv_impt_stot){
		this.prv_impt_stot = prv_impt_stot;
	}

	public void setImpt_stot(String impt_stot){
		this.impt_stot = impt_stot;
	}

	public void setNon_tax_jrnst(String non_tax_jrnst){
		this.non_tax_jrnst = non_tax_jrnst;
	}

	public void setPrv_non_tax_prod(String prv_non_tax_prod){
		this.prv_non_tax_prod = prv_non_tax_prod;
	}

	public void setNon_tax_jrnst_stot(String non_tax_jrnst_stot){
		this.non_tax_jrnst_stot = non_tax_jrnst_stot;
	}

	public void setNon_tax_frnc(String non_tax_frnc){
		this.non_tax_frnc = non_tax_frnc;
	}

	public void setPrv_non_tax_frnc(String prv_non_tax_frnc){
		this.prv_non_tax_frnc = prv_non_tax_frnc;
	}

	public void setNon_tax_frnc_stot(String non_tax_frnc_stot){
		this.non_tax_frnc_stot = non_tax_frnc_stot;
	}

	public void setNow_stot(String now_stot){
		this.now_stot = now_stot;
	}

	public void setPrv_stot(String prv_stot){
		this.prv_stot = prv_stot;
	}

	public void setStot(String stot){
		this.stot = stot;
	}

	public String getNow_impt_stot(){
		return this.now_impt_stot;
	}

	public String getPrv_impt_stot(){
		return this.prv_impt_stot;
	}

	public String getImpt_stot(){
		return this.impt_stot;
	}

	public String getNon_tax_jrnst(){
		return this.non_tax_jrnst;
	}

	public String getPrv_non_tax_prod(){
		return this.prv_non_tax_prod;
	}

	public String getNon_tax_jrnst_stot(){
		return this.non_tax_jrnst_stot;
	}

	public String getNon_tax_frnc(){
		return this.non_tax_frnc;
	}

	public String getPrv_non_tax_frnc(){
		return this.prv_non_tax_frnc;
	}

	public String getNon_tax_frnc_stot(){
		return this.non_tax_frnc_stot;
	}

	public String getNow_stot(){
		return this.now_stot;
	}

	public String getPrv_stot(){
		return this.prv_stot;
	}

	public String getStot(){
		return this.stot;
	}
}

/* 작성시간 : Thu May 21 15:52:47 KST 2009 */