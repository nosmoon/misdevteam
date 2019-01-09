/***************************************************************************************************
* 파일명 : SS_L_MIGLLMMTCLOSCURCOMMLISTRecord.java
* 기능 : 지국경영-마일리지현황-목록을 위한 Record
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * 지국경영-마일리지현황-목록을 위한 Record
 */

public class SS_L_MIGLLMMTCLOSCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String bonm;
	public String boksnm;
	public String areanm;
	public String basidt;
	public int paypont;
	public int noit;
	public int hdqtallmamt;
	public int boallmamt;
	public String frdt;
	public String todt;

	public SS_L_MIGLLMMTCLOSCURCOMMLISTRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBoksnm(String boksnm){
		this.boksnm = boksnm;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setPaypont(int paypont){
		this.paypont = paypont;
	}

	public void setNoit(int noit){
		this.noit = noit;
	}

	public void setHdqtallmamt(int hdqtallmamt){
		this.hdqtallmamt = hdqtallmamt;
	}

	public void setBoallmamt(int boallmamt){
		this.boallmamt = boallmamt;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBoksnm(){
		return this.boksnm;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public int getPaypont(){
		return this.paypont;
	}

	public int getNoit(){
		return this.noit;
	}

	public int getHdqtallmamt(){
		return this.hdqtallmamt;
	}

	public int getBoallmamt(){
		return this.boallmamt;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}
}

/* 작성시간 : Sat Jun 19 14:48:32 KST 2004 */