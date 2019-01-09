/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.trg.rec;

import java.sql.*;
import chosun.ciis.se.trg.dm.*;
import chosun.ciis.se.trg.ds.*;

/**
 * 
 */


public class SE_TRG_1410_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evlu_grp;
	public String area_nm;
	public String bo_cd;
	public String bo_seq;
	public String bo_nm;
	public String thmmsendqty;
	public String chrg_flnm;

	public SE_TRG_1410_LCURLISTRecord(){}

	public void setEvlu_grp(String evlu_grp){
		this.evlu_grp = evlu_grp;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setThmmsendqty(String thmmsendqty){
		this.thmmsendqty = thmmsendqty;
	}

	public void setChrg_flnm(String chrg_flnm){
		this.chrg_flnm = chrg_flnm;
	}

	public String getEvlu_grp(){
		return this.evlu_grp;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getThmmsendqty(){
		return this.thmmsendqty;
	}

	public String getChrg_flnm(){
		return this.chrg_flnm;
	}
}

/* 작성시간 : Thu Apr 02 10:17:32 KST 2009 */