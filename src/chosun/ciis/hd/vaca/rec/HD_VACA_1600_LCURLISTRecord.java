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


package chosun.ciis.hd.vaca.rec;

import java.sql.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.ds.*;

/**
 * 
 */


public class HD_VACA_1600_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd_type;
	public String cd;
	public String cdnm;
	public String cd_abrv_nm;
	public String remk;
	public String mang_cd_4;

	public HD_VACA_1600_LCURLISTRecord(){}

	public void setCd_type(String cd_type){
		this.cd_type = cd_type;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setCd_abrv_nm(String cd_abrv_nm){
		this.cd_abrv_nm = cd_abrv_nm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setMang_cd_4(String mang_cd_4){
		this.mang_cd_4 = mang_cd_4;
	}

	public String getCd_type(){
		return this.cd_type;
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

	public String getRemk(){
		return this.remk;
	}

	public String getMang_cd_4(){
		return this.mang_cd_4;
	}
}

/* 작성시간 : Mon Apr 27 16:09:43 KST 2009 */