/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 2017-01-05
* 작성자 : 민 기 홍
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


public class SE_BOI_3010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String regdt;
	public String deptnm;
	public String partnm;
	public String areanm;
	public String bonm;
	public String bocd;
	public String boemp_id;
	public String flnm;
	public String seq;
	public String chkyn;

	public SE_BOI_3010_LCURLISTRecord(){}

	public String getChkyn() {
		return chkyn;
	}

	public void setChkyn(String chkyn) {
		this.chkyn = chkyn;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

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

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBoemp_id(String boemp_id){
		this.boemp_id = boemp_id;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getRegdt(){
		return this.regdt;
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

	public String getBocd(){
		return this.bocd;
	}

	public String getBoemp_id(){
		return this.boemp_id;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getSeq(){
		return this.seq;
	}
}

/* 작성시간 : Fri Jun 30 16:19:20 KST 2017 */