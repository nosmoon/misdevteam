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


public class HD_VACA_1611_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String cd_type;
	public String cd;
	public String cdnm;
	public String remk;
	public String mang_cd_3;
	public String mang_cd_4;

	public HD_VACA_1611_LCURLIST3Record(){}

	public void setCd_type(String cd_type){
		this.cd_type = cd_type;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setMang_cd_3(String mang_cd_3){
		this.mang_cd_3 = mang_cd_3;
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

	public String getRemk(){
		return this.remk;
	}

	public String getMang_cd_3(){
		return this.mang_cd_3;
	}

	public String getMang_cd_4(){
		return this.mang_cd_4;
	}
}

/* 작성시간 : Wed Oct 24 10:55:13 KST 2018 */