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


package chosun.ciis.mc.cost.rec;

import java.sql.*;
import chosun.ciis.mc.cost.dm.*;
import chosun.ciis.mc.cost.ds.*;

/**
 * 
 */


public class MC_COST_1001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sub_cd;
	public String cd;
	public String cdnm;
	public String mang_cd_1;
	public String bscdnm;
	public String mang_cd_2;
	public String mang_cd_3;

	public MC_COST_1001_LCURLISTRecord(){}

	public void setSub_cd(String sub_cd){
		this.sub_cd = sub_cd;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setMang_cd_1(String mang_cd_1){
		this.mang_cd_1 = mang_cd_1;
	}

	public void setBscdnm(String bscdnm){
		this.bscdnm = bscdnm;
	}

	public void setMang_cd_2(String mang_cd_2){
		this.mang_cd_2 = mang_cd_2;
	}

	public void setMang_cd_3(String mang_cd_3){
		this.mang_cd_3 = mang_cd_3;
	}

	public String getSub_cd(){
		return this.sub_cd;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getMang_cd_1(){
		return this.mang_cd_1;
	}

	public String getBscdnm(){
		return this.bscdnm;
	}

	public String getMang_cd_2(){
		return this.mang_cd_2;
	}

	public String getMang_cd_3(){
		return this.mang_cd_3;
	}
}

/* 작성시간 : Fri Apr 17 15:25:26 KST 2009 */