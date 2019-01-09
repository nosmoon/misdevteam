/***************************************************************************************************
* 파일명 : SE_COMM_2010_LCURLISTRecord.java
* 기능 :  발송처 팝업
* 작성일자 : 2009.01.23
* 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.comm.rec;

import java.sql.*;
import chosun.ciis.se.comm.dm.*;
import chosun.ciis.se.comm.ds.*;

/**
 * 
 */


public class SE_COMM_2010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String bo_cd;
	public String send_plac_seq;
	public String send_plac_nm;
	public String area_cd;
	public String area_nm;
	public String ariv_nomn;
	public String adms_dstc_cd;
	public String adms_dstc_nm;
	public String bo_cd_send_plac_seq;
	public String bo_seq;

	public String getBo_seq() {
		return bo_seq;
	}

	public void setBo_seq(String bo_seq) {
		this.bo_seq = bo_seq;
	}

	public String getBo_cd_send_plac_seq() {
		return bo_cd_send_plac_seq;
	}

	public void setBo_cd_send_plac_seq(String bo_cd_send_plac_seq) {
		this.bo_cd_send_plac_seq = bo_cd_send_plac_seq;
	}

	public SE_COMM_2010_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setSend_plac_seq(String send_plac_seq){
		this.send_plac_seq = send_plac_seq;
	}

	public void setSend_plac_nm(String send_plac_nm){
		this.send_plac_nm = send_plac_nm;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setAriv_nomn(String ariv_nomn){
		this.ariv_nomn = ariv_nomn;
	}

	public void setAdms_dstc_cd(String adms_dstc_cd){
		this.adms_dstc_cd = adms_dstc_cd;
	}

	public void setAdms_dstc_nm(String adms_dstc_nm){
		this.adms_dstc_nm = adms_dstc_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getSend_plac_seq(){
		return this.send_plac_seq;
	}

	public String getSend_plac_nm(){
		return this.send_plac_nm;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getAriv_nomn(){
		return this.ariv_nomn;
	}

	public String getAdms_dstc_cd(){
		return this.adms_dstc_cd;
	}

	public String getAdms_dstc_nm(){
		return this.adms_dstc_nm;
	}
}

/* 작성시간 : Fri Jan 23 11:20:56 KST 2009 */