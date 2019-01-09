/***************************************************************************************************
* 파일명 : SP_PS_L_ALON_PRSLT.java
* 수당-수당관리 출근수당 조회화면
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
 * 수당-수당관리 출근수당 조회화면
 *
 */ 

  

public class PS_L_ALON_PRSLTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bonm;
	public String flnm;
	public String boemp_no;
	public String boemp_nm;
	public String aloncd;
	public String yymm;
	public int realprsntdds;
	public int ddprsntalon;
	public int amt;

	public PS_L_ALON_PRSLTCURCOMMLISTRecord(){}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setBoemp_no(String boemp_no){
		this.boemp_no = boemp_no;
	}

	public void setBoemp_nm(String boemp_nm){
		this.boemp_nm = boemp_nm;
	}

	public void setAloncd(String aloncd){
		this.aloncd = aloncd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setRealprsntdds(int realprsntdds){
		this.realprsntdds = realprsntdds;
	}

	public void setDdprsntalon(int ddprsntalon){
		this.ddprsntalon = ddprsntalon;
	}

	public void setAmt(int amt){
		this.amt = amt;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getBoemp_no(){
		return this.boemp_no;
	}

	public String getBoemp_nm(){
		return this.boemp_nm;
	}

	public String getAloncd(){
		return this.aloncd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public int getRealprsntdds(){
		return this.realprsntdds;
	}

	public int getDdprsntalon(){
		return this.ddprsntalon;
	}

	public int getAmt(){
		return this.amt;
	}
}

/* 작성시간 : Wed Mar 10 13:49:19 KST 2004 */