/***************************************************************************************************
 * 파일명   : PS_L_MIDI_UPRC.java
 * 기능     : 매체단가 관리 - 조회
 * 작성일자 : 2005-06-30
 * 작성자   : 전현표
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/


package chosun.ciis.ps.pbs.code.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.code.dm.*;
import chosun.ciis.ps.pbs.code.ds.*;

/**
 *  매체단가 관리 - 조회
 */

public class PS_L_MIDI_UPRCCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String bonm;
	public String medinm;
	public String medicd;
	public String acpntype;
	public String acpntypenm;
	public String acpnclsf;
	public String acpnclsfnm;
	public String natnareaclsf;
	public String cntryys;
	public String aplydt;
	public int sell_amt;
	public int busnalon;
	public int uprc;
	public String remk;
	public String expy_dt;
	public int extn_cnt;

	public PS_L_MIDI_UPRCCURCOMMLISTRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setAcpntype(String acpntype){
		this.acpntype = acpntype;
	}

	public void setAcpntypenm(String acpntypenm){
		this.acpntypenm = acpntypenm;
	}

	public void setAcpnclsf(String acpnclsf){
		this.acpnclsf = acpnclsf;
	}

	public void setAcpnclsfnm(String acpnclsfnm){
		this.acpnclsfnm = acpnclsfnm;
	}

	public void setNatnareaclsf(String natnareaclsf){
		this.natnareaclsf = natnareaclsf;
	}

	public void setCntryys(String cntryys){
		this.cntryys = cntryys;
	}

	public void setAplydt(String aplydt){
		this.aplydt = aplydt;
	}

	public void setSell_amt(int sell_amt){
		this.sell_amt = sell_amt;
	}

	public void setBusnalon(int busnalon){
		this.busnalon = busnalon;
	}

	public void setUprc(int uprc){
		this.uprc = uprc;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setExpy_dt(String expy_dt){
		this.expy_dt = expy_dt;
	}

	public void setExtn_cnt(int extn_cnt){
		this.extn_cnt = extn_cnt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getAcpntype(){
		return this.acpntype;
	}

	public String getAcpntypenm(){
		return this.acpntypenm;
	}

	public String getAcpnclsf(){
		return this.acpnclsf;
	}

	public String getAcpnclsfnm(){
		return this.acpnclsfnm;
	}

	public String getNatnareaclsf(){
		return this.natnareaclsf;
	}

	public String getCntryys(){
		return this.cntryys;
	}

	public String getAplydt(){
		return this.aplydt;
	}

	public int getSell_amt(){
		return this.sell_amt;
	}

	public int getBusnalon(){
		return this.busnalon;
	}

	public int getUprc(){
		return this.uprc;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getExpy_dt(){
		return this.expy_dt;
	}

	public int getExtn_cnt(){
		return this.extn_cnt;
	}
}

/* 작성시간 : Wed Aug 24 15:28:04 KST 2005 */