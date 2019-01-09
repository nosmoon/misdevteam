/***************************************************************************************************
 * 파일명   : SP_SS_L_CYBALON_CLOSPTCR.java
 * 기능     : 사이버센터
 * 작성일자 : 2006/03/08
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.ca.rec;

import java.sql.*;
import chosun.ciis.ss.sls.ca.dm.*;
import chosun.ciis.ss.sls.ca.ds.*;

/**
**  사이버센터
**/

public class SS_L_CYBALON_CLOSPTCRCLOSPTCRCURRecord extends java.lang.Object implements java.io.Serializable{

	public String closseq;
	public String closyymm;
	public String closdt;
	public String closyn;
	public int adjmnoit;
	public int adjmamt;
	public int clamamt;
	public int prvmmacmlun_recp;
	public int clamt;
	public int acmlun_recp;
	public String etc1;
	public String etc2;
	public String etc3;
	public String etc4;
	public String etc5;
	public int rnum;

	public SS_L_CYBALON_CLOSPTCRCLOSPTCRCURRecord(){}

	public void setClosseq(String closseq){
		this.closseq = closseq;
	}

	public void setClosyymm(String closyymm){
		this.closyymm = closyymm;
	}

	public void setClosdt(String closdt){
		this.closdt = closdt;
	}

	public void setClosyn(String closyn){
		this.closyn = closyn;
	}

	public void setAdjmnoit(int adjmnoit){
		this.adjmnoit = adjmnoit;
	}

	public void setAdjmamt(int adjmamt){
		this.adjmamt = adjmamt;
	}

	public void setClamamt(int clamamt){
		this.clamamt = clamamt;
	}

	public void setPrvmmacmlun_recp(int prvmmacmlun_recp){
		this.prvmmacmlun_recp = prvmmacmlun_recp;
	}

	public void setClamt(int clamt){
		this.clamt = clamt;
	}

	public void setAcmlun_recp(int acmlun_recp){
		this.acmlun_recp = acmlun_recp;
	}

	public void setEtc1(String etc1){
		this.etc1 = etc1;
	}

	public void setEtc2(String etc2){
		this.etc2 = etc2;
	}

	public void setEtc3(String etc3){
		this.etc3 = etc3;
	}

	public void setEtc4(String etc4){
		this.etc4 = etc4;
	}

	public void setEtc5(String etc5){
		this.etc5 = etc5;
	}

	public void setRnum(int rnum){
		this.rnum = rnum;
	}

	public String getClosseq(){
		return this.closseq;
	}

	public String getClosyymm(){
		return this.closyymm;
	}

	public String getClosdt(){
		return this.closdt;
	}

	public String getClosyn(){
		return this.closyn;
	}

	public int getAdjmnoit(){
		return this.adjmnoit;
	}

	public int getAdjmamt(){
		return this.adjmamt;
	}

	public int getClamamt(){
		return this.clamamt;
	}

	public int getPrvmmacmlun_recp(){
		return this.prvmmacmlun_recp;
	}

	public int getClamt(){
		return this.clamt;
	}

	public int getAcmlun_recp(){
		return this.acmlun_recp;
	}

	public String getEtc1(){
		return this.etc1;
	}

	public String getEtc2(){
		return this.etc2;
	}

	public String getEtc3(){
		return this.etc3;
	}

	public String getEtc4(){
		return this.etc4;
	}

	public String getEtc5(){
		return this.etc5;
	}

	public int getRnum(){
		return this.rnum;
	}
}

/* 작성시간 : Wed Mar 22 11:33:09 KST 2006 */