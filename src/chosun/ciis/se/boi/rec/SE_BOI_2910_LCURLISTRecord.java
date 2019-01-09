/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.boi.rec;

import java.sql.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 * 
 */


public class SE_BOI_2910_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptnm;
	public String partnm;
	public String areanm;
	public String bonm;
	public String bo_cd;
	public String bo_head_nm;
	public String gurt_pers_flnm;
	public String gurt_dt;
	public String jont_d;
	public String net_sale_amt;
	public String bo_seq;
	public String rn;

	public SE_BOI_2910_LCURLISTRecord(){}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setPartnm(String partnm){
		this.partnm = partnm;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setGurt_pers_flnm(String gurt_pers_flnm){
		this.gurt_pers_flnm = gurt_pers_flnm;
	}

	public void setGurt_dt(String gurt_dt){
		this.gurt_dt = gurt_dt;
	}

	public void setJont_d(String jont_d){
		this.jont_d = jont_d;
	}

	public void setNet_sale_amt(String net_sale_amt){
		this.net_sale_amt = net_sale_amt;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setRn(String rn){
		this.rn = rn;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getPartnm(){
		return this.partnm;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getGurt_pers_flnm(){
		return this.gurt_pers_flnm;
	}

	public String getGurt_dt(){
		return this.gurt_dt;
	}

	public String getJont_d(){
		return this.jont_d;
	}

	public String getNet_sale_amt(){
		return this.net_sale_amt;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getRn(){
		return this.rn;
	}
}

/* 작성시간 : Wed Nov 02 14:37:04 KST 2016 */