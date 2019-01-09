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


package chosun.ciis.is.bus.rec;

import java.sql.*;
import chosun.ciis.is.bus.dm.*;
import chosun.ciis.is.bus.ds.*;

/**
 * 
 */


public class IS_BUS_2110_LCURLIST_1Record extends java.lang.Object implements java.io.Serializable{

	public String dlco_cd;
	public String grp_row_number;
	public String purc_dlco_nm;
	public String feed_dt;
	public String advcs_nm;
	public String asnt_dstc_cd_nm;
	public String std;
	public String cnt_01;
	public String cnt_02;
	public String cnt_2;
	public String cnt_3;
	public String cnt_4;
	public String etc_nm;

	public IS_BUS_2110_LCURLIST_1Record(){}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setGrp_row_number(String grp_row_number){
		this.grp_row_number = grp_row_number;
	}

	public void setPurc_dlco_nm(String purc_dlco_nm){
		this.purc_dlco_nm = purc_dlco_nm;
	}

	public void setFeed_dt(String feed_dt){
		this.feed_dt = feed_dt;
	}

	public void setAdvcs_nm(String advcs_nm){
		this.advcs_nm = advcs_nm;
	}

	public void setAsnt_dstc_cd_nm(String asnt_dstc_cd_nm){
		this.asnt_dstc_cd_nm = asnt_dstc_cd_nm;
	}

	public void setStd(String std){
		this.std = std;
	}

	public void setCnt_01(String cnt_01){
		this.cnt_01 = cnt_01;
	}

	public void setCnt_02(String cnt_02){
		this.cnt_02 = cnt_02;
	}

	public void setCnt_2(String cnt_2){
		this.cnt_2 = cnt_2;
	}

	public void setCnt_3(String cnt_3){
		this.cnt_3 = cnt_3;
	}

	public void setCnt_4(String cnt_4){
		this.cnt_4 = cnt_4;
	}

	public void setEtc_nm(String etc_nm){
		this.etc_nm = etc_nm;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getGrp_row_number(){
		return this.grp_row_number;
	}

	public String getPurc_dlco_nm(){
		return this.purc_dlco_nm;
	}

	public String getFeed_dt(){
		return this.feed_dt;
	}

	public String getAdvcs_nm(){
		return this.advcs_nm;
	}

	public String getAsnt_dstc_cd_nm(){
		return this.asnt_dstc_cd_nm;
	}

	public String getStd(){
		return this.std;
	}

	public String getCnt_01(){
		return this.cnt_01;
	}

	public String getCnt_02(){
		return this.cnt_02;
	}

	public String getCnt_2(){
		return this.cnt_2;
	}

	public String getCnt_3(){
		return this.cnt_3;
	}

	public String getCnt_4(){
		return this.cnt_4;
	}

	public String getEtc_nm(){
		return this.etc_nm;
	}
}

/* 작성시간 : Thu Jun 21 13:39:12 KST 2012 */