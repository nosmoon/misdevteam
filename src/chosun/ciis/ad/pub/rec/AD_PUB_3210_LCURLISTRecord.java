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


package chosun.ciis.ad.pub.rec;

import java.sql.*;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.ds.*;

/**
 * 
 */


public class AD_PUB_3210_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pubc_dt;
	public String yoil;
	public String sect_cd;
	public String sect_seq;
	public String sect_nm_cd;
	public String chro_clsf;
	public String advt_fee;
	public String pubc_cnt;
	public String pubc_uprc;

	public AD_PUB_3210_LCURLISTRecord(){}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setYoil(String yoil){
		this.yoil = yoil;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_seq(String sect_seq){
		this.sect_seq = sect_seq;
	}

	public void setSect_nm_cd(String sect_nm_cd){
		this.sect_nm_cd = sect_nm_cd;
	}

	public void setChro_clsf(String chro_clsf){
		this.chro_clsf = chro_clsf;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public void setPubc_cnt(String pubc_cnt){
		this.pubc_cnt = pubc_cnt;
	}

	public void setPubc_uprc(String pubc_uprc){
		this.pubc_uprc = pubc_uprc;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getYoil(){
		return this.yoil;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_seq(){
		return this.sect_seq;
	}

	public String getSect_nm_cd(){
		return this.sect_nm_cd;
	}

	public String getChro_clsf(){
		return this.chro_clsf;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}

	public String getPubc_cnt(){
		return this.pubc_cnt;
	}

	public String getPubc_uprc(){
		return this.pubc_uprc;
	}
}

/* 작성시간 : Mon Apr 08 10:05:40 KST 2013 */