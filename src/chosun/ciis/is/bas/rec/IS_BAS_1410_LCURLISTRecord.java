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


package chosun.ciis.is.bas.rec;

import java.sql.*;
import chosun.ciis.is.bas.dm.*;
import chosun.ciis.is.bas.ds.*;

/**
 * 
 */


public class IS_BAS_1410_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_cd_seq;
	public String dlco_abrv_nm;
	public String ern;
	public String tel_no;
	public String fax_no;
	public String corp_clsf_nm;
	public String presi_nm;
	public String bizcond;
	public String item;
	public String addr;
	public String chg_dt_tm;

	public IS_BAS_1410_LCURLISTRecord(){}

	public void setDlco_cd_seq(String dlco_cd_seq){
		this.dlco_cd_seq = dlco_cd_seq;
	}

	public void setDlco_abrv_nm(String dlco_abrv_nm){
		this.dlco_abrv_nm = dlco_abrv_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setFax_no(String fax_no){
		this.fax_no = fax_no;
	}

	public void setCorp_clsf_nm(String corp_clsf_nm){
		this.corp_clsf_nm = corp_clsf_nm;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setBizcond(String bizcond){
		this.bizcond = bizcond;
	}

	public void setItem(String item){
		this.item = item;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public String getDlco_cd_seq(){
		return this.dlco_cd_seq;
	}

	public String getDlco_abrv_nm(){
		return this.dlco_abrv_nm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getFax_no(){
		return this.fax_no;
	}

	public String getCorp_clsf_nm(){
		return this.corp_clsf_nm;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getBizcond(){
		return this.bizcond;
	}

	public String getItem(){
		return this.item;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}
}

/* 작성시간 : Thu Apr 26 16:34:03 KST 2012 */