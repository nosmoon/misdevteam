/***************************************************************************************************
* 파일명 : .java
* 기능 : *관리자-지국월마감-목록
* 작성일자 : 2009-04-27
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 * 관리자-지국월마감-목록
 */

public class SS_L_BOCLOSCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptnm;
	public String areanm;
	public String bonm;
	public String bocd;
	public String yymm;
	public String closfrdt;
	public String clostodt;
	public String clos_dt;
	public String closyn;

	public SS_L_BOCLOSCURCOMMLISTRecord(){}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setClosfrdt(String closfrdt){
		this.closfrdt = closfrdt;
	}

	public void setClostodt(String clostodt){
		this.clostodt = clostodt;
	}

	public void setClos_dt(String clos_dt){
		this.clos_dt = clos_dt;
	}

	public void setClosyn(String closyn){
		this.closyn = closyn;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getClosfrdt(){
		return this.closfrdt;
	}

	public String getClostodt(){
		return this.clostodt;
	}

	public String getClos_dt(){
		return this.clos_dt;
	}

	public String getClosyn(){
		return this.closyn;
	}
}

/* 작성시간 : Mon Apr 27 19:49:27 KST 2009 */