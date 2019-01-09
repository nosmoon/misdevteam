/***************************************************************************************************
* 파일명 : SS_L_MOVM_RDRCOSTDCURCOMMLISTRecord.java
* 기능 : 이사독자-비용-상세목록을 위한 Record
* 작성일자 : 2004-01-09
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.move.rec;

import java.sql.*;
import chosun.ciis.ss.sls.move.dm.*;
import chosun.ciis.ss.sls.move.ds.*;

/**
 * 이사독자-비용-상세목록을 위한 Record
 */

public class SS_L_MOVM_RDRCOSTDCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medicdnm;
	public int trsfqty;
	public int acptqty;
	public int uncalctrsfqty;
	public int uncalcacptqty;
	public int calctrsfqty;
	public int calcacptqty;
	public int basiamt;
	public int trsfalonamt;
	public int acptalonamt;
	public int trsfppymtamt;
	public int acptppymtamt;
	public int trsfppymtcoms;
	public int acptppymtcoms;
	public int trsfmilgallmamt;
	public int acptmilgallmamt;
	public int trsfcalcamt;
	public int acptcalcamt;

	public SS_L_MOVM_RDRCOSTDCURCOMMLISTRecord(){}

	public void setMedicdnm(String medicdnm){
		this.medicdnm = medicdnm;
	}

	public void setTrsfqty(int trsfqty){
		this.trsfqty = trsfqty;
	}

	public void setAcptqty(int acptqty){
		this.acptqty = acptqty;
	}

	public void setUncalctrsfqty(int uncalctrsfqty){
		this.uncalctrsfqty = uncalctrsfqty;
	}

	public void setUncalcacptqty(int uncalcacptqty){
		this.uncalcacptqty = uncalcacptqty;
	}

	public void setCalctrsfqty(int calctrsfqty){
		this.calctrsfqty = calctrsfqty;
	}

	public void setCalcacptqty(int calcacptqty){
		this.calcacptqty = calcacptqty;
	}

	public void setBasiamt(int basiamt){
		this.basiamt = basiamt;
	}

	public void setTrsfalonamt(int trsfalonamt){
		this.trsfalonamt = trsfalonamt;
	}

	public void setAcptalonamt(int acptalonamt){
		this.acptalonamt = acptalonamt;
	}

	public void setTrsfppymtamt(int trsfppymtamt){
		this.trsfppymtamt = trsfppymtamt;
	}

	public void setAcptppymtamt(int acptppymtamt){
		this.acptppymtamt = acptppymtamt;
	}

	public void setTrsfppymtcoms(int trsfppymtcoms){
		this.trsfppymtcoms = trsfppymtcoms;
	}

	public void setAcptppymtcoms(int acptppymtcoms){
		this.acptppymtcoms = acptppymtcoms;
	}

	public void setTrsfmilgallmamt(int trsfmilgallmamt){
		this.trsfmilgallmamt = trsfmilgallmamt;
	}

	public void setAcptmilgallmamt(int acptmilgallmamt){
		this.acptmilgallmamt = acptmilgallmamt;
	}

	public void setTrsfcalcamt(int trsfcalcamt){
		this.trsfcalcamt = trsfcalcamt;
	}

	public void setAcptcalcamt(int acptcalcamt){
		this.acptcalcamt = acptcalcamt;
	}

	public String getMedicdnm(){
		return this.medicdnm;
	}

	public int getTrsfqty(){
		return this.trsfqty;
	}

	public int getAcptqty(){
		return this.acptqty;
	}

	public int getUncalctrsfqty(){
		return this.uncalctrsfqty;
	}

	public int getUncalcacptqty(){
		return this.uncalcacptqty;
	}

	public int getCalctrsfqty(){
		return this.calctrsfqty;
	}

	public int getCalcacptqty(){
		return this.calcacptqty;
	}

	public int getBasiamt(){
		return this.basiamt;
	}

	public int getTrsfalonamt(){
		return this.trsfalonamt;
	}

	public int getAcptalonamt(){
		return this.acptalonamt;
	}

	public int getTrsfppymtamt(){
		return this.trsfppymtamt;
	}

	public int getAcptppymtamt(){
		return this.acptppymtamt;
	}

	public int getTrsfppymtcoms(){
		return this.trsfppymtcoms;
	}

	public int getAcptppymtcoms(){
		return this.acptppymtcoms;
	}

	public int getTrsfmilgallmamt(){
		return this.trsfmilgallmamt;
	}

	public int getAcptmilgallmamt(){
		return this.acptmilgallmamt;
	}

	public int getTrsfcalcamt(){
		return this.trsfcalcamt;
	}

	public int getAcptcalcamt(){
		return this.acptcalcamt;
	}
}

/* 작성시간 : Fri Jan 09 21:23:42 KST 2004 */