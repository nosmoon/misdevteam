/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국경영-입주아파트현황-입주아파트 엑셀저장
* 작성일자 : 2009-04-03
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * /지국경영-입주아파트현황-입주아파트 엑셀저장
 */

public class SL_L_MOVEIN_APT_PRINTCURAPTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptnm;
	public String areanm;
	public String bonm;
	public String bocd;
	public String dongno;
	public String florcnt;
	public String flor_houscnt;
	public String hoscnt;
	public String pyong;
	public String stairyn;
	public String under_exne;
	public String addrnm;
	public String mvindt;
	public String mvinexpdt;
	public String mvinaptyn;

	public SL_L_MOVEIN_APT_PRINTCURAPTLISTRecord(){}

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

	public void setDongno(String dongno){
		this.dongno = dongno;
	}

	public void setFlorcnt(String florcnt){
		this.florcnt = florcnt;
	}

	public void setFlor_houscnt(String flor_houscnt){
		this.flor_houscnt = flor_houscnt;
	}

	public void setHoscnt(String hoscnt){
		this.hoscnt = hoscnt;
	}

	public void setPyong(String pyong){
		this.pyong = pyong;
	}

	public void setStairyn(String stairyn){
		this.stairyn = stairyn;
	}

	public void setUnder_exne(String under_exne){
		this.under_exne = under_exne;
	}

	public void setAddrnm(String addrnm){
		this.addrnm = addrnm;
	}

	public void setMvindt(String mvindt){
		this.mvindt = mvindt;
	}

	public void setMvinexpdt(String mvinexpdt){
		this.mvinexpdt = mvinexpdt;
	}

	public void setMvinaptyn(String mvinaptyn){
		this.mvinaptyn = mvinaptyn;
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

	public String getDongno(){
		return this.dongno;
	}

	public String getFlorcnt(){
		return this.florcnt;
	}

	public String getFlor_houscnt(){
		return this.flor_houscnt;
	}

	public String getHoscnt(){
		return this.hoscnt;
	}

	public String getPyong(){
		return this.pyong;
	}

	public String getStairyn(){
		return this.stairyn;
	}

	public String getUnder_exne(){
		return this.under_exne;
	}

	public String getAddrnm(){
		return this.addrnm;
	}

	public String getMvindt(){
		return this.mvindt;
	}

	public String getMvinexpdt(){
		return this.mvinexpdt;
	}

	public String getMvinaptyn(){
		return this.mvinaptyn;
	}
}

/* 작성시간 : Fri Apr 03 15:01:53 KST 2009 */