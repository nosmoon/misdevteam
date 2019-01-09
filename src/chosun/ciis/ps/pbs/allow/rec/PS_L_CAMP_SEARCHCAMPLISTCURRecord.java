/***************************************************************************************************
* 파일명 : SP_PS_L_CAMP_SEARCH.java
* 수당-캠페인관리 캠페인조회 
* 작성일자 : 2004-03-08
* 작성자 : 김건호 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 : 
* 수정일자 :   
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.allow.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.allow.dm.*;
import chosun.ciis.ps.pbs.allow.ds.*;

/**
 * 수당-캠페인관리 캠페인조회          
 *
 */

  

public class PS_L_CAMP_SEARCHCAMPLISTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpycd;
	public String cmpynm;
	public String bocd;
	public String bonm;
	public String campseq;
	public String campnm;
	public String bgncampdt;
	public String endcampdt;
	public String cont;
	public int rnum;

	public PS_L_CAMP_SEARCHCAMPLISTCURRecord(){}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setCmpynm(String cmpynm){
		this.cmpynm = cmpynm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setCampseq(String campseq){
		this.campseq = campseq;
	}

	public void setCampnm(String campnm){
		this.campnm = campnm;
	}

	public void setBgncampdt(String bgncampdt){
		this.bgncampdt = bgncampdt;
	}

	public void setEndcampdt(String endcampdt){
		this.endcampdt = endcampdt;
	}

	public void setCont(String cont){
		this.cont = cont;
	}

	public void setRnum(int rnum){
		this.rnum = rnum;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getCmpynm(){
		return this.cmpynm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getCampseq(){
		return this.campseq;
	}

	public String getCampnm(){
		return this.campnm;
	}

	public String getBgncampdt(){
		return this.bgncampdt;
	}

	public String getEndcampdt(){
		return this.endcampdt;
	}

	public String getCont(){
		return this.cont;
	}

	public int getRnum(){
		return this.rnum;
	}
}

/* 작성시간 : Mon Mar 15 10:13:40 KST 2004 */