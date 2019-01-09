/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_9600_MXX_EXPN_CLSFRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cd_nm;
	public String mang_cd_2;
	public String mang_cd_3;

	public HD_AFFR_9600_MXX_EXPN_CLSFRecord(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCd_nm(String cd_nm){
		this.cd_nm = cd_nm;
	}

	public void setMang_cd_2(String mang_cd_2){
		this.mang_cd_2 = mang_cd_2;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCd_nm(){
		return this.cd_nm;
	}

	public String getMang_cd_2(){
		return this.mang_cd_2;
	}
	
	public String getMang_cd_3(){
		return this.mang_cd_3;
	}
}

/* 작성시간 : Wed Sep 13 14:38:11 KST 2017 */