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


package chosun.ciis.pl.bas.rec;

import java.sql.*;
import chosun.ciis.pl.bas.dm.*;
import chosun.ciis.pl.bas.ds.*;

/**
 * 
 */


public class PL_BAS_1810_LPTCRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;
	public String cd_abrv_nm;
	public String mang_cd_1;
	public String hndlmedi_clsf;
	public String mang_cd_2;
	public String rate_basi;
	public String mang_cd_3;
	public String use_yn;

	public PL_BAS_1810_LPTCRLISTRecord(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setCd_abrv_nm(String cd_abrv_nm){
		this.cd_abrv_nm = cd_abrv_nm;
	}

	public void setMang_cd_1(String mang_cd_1){
		this.mang_cd_1 = mang_cd_1;
	}

	public void setHndlmedi_clsf(String hndlmedi_clsf){
		this.hndlmedi_clsf = hndlmedi_clsf;
	}

	public void setMang_cd_2(String mang_cd_2){
		this.mang_cd_2 = mang_cd_2;
	}

	public void setRate_basi(String rate_basi){
		this.rate_basi = rate_basi;
	}

	public void setMang_cd_3(String mang_cd_3){
		this.mang_cd_3 = mang_cd_3;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getCd_abrv_nm(){
		return this.cd_abrv_nm;
	}

	public String getMang_cd_1(){
		return this.mang_cd_1;
	}

	public String getHndlmedi_clsf(){
		return this.hndlmedi_clsf;
	}

	public String getMang_cd_2(){
		return this.mang_cd_2;
	}

	public String getRate_basi(){
		return this.rate_basi;
	}

	public String getMang_cd_3(){
		return this.mang_cd_3;
	}

	public String getUse_yn(){
		return this.use_yn;
	}
}

/* 작성시간 : Mon Jun 22 15:25:03 KST 2009 */