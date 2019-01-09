/***************************************************************************************************
 * 파일명   : SS_L_WEEKSND_CLOSPTCRCLOSPTCRCURRecord.java
 * 기능     : 주간조선관리-배달비정산마감 마감내역
 * 작성일자 : 2007-04-16
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     : 
 **************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 주간조선관리-배달비정산마감 마감내역
 */

public class SS_L_WEEKSND_CLOSPTCRCLOSPTCRCURRecord extends java.lang.Object implements java.io.Serializable{

	public String clsfcd;
	public String closseq;
	public String closyymm;
	public String frsubscd;
	public String tosubscd;
	public String closdt;
	public String closyn;
	public String medicd;
	public String medinm;
	public int lumpcnt;
	public int addcnt;
	public int totcnt;
	public int lumpamt;
	public int addamt;
	public int totamt;
	public String etc1;
	public String etc2;
	public String etc3;
	public int rnum;

	public SS_L_WEEKSND_CLOSPTCRCLOSPTCRCURRecord(){}

	public void setClsfcd(String clsfcd){
		this.clsfcd = clsfcd;
	}

	public void setClosseq(String closseq){
		this.closseq = closseq;
	}

	public void setClosyymm(String closyymm){
		this.closyymm = closyymm;
	}

	public void setFrsubscd(String frsubscd){
		this.frsubscd = frsubscd;
	}

	public void setTosubscd(String tosubscd){
		this.tosubscd = tosubscd;
	}

	public void setClosdt(String closdt){
		this.closdt = closdt;
	}

	public void setClosyn(String closyn){
		this.closyn = closyn;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setLumpcnt(int lumpcnt){
		this.lumpcnt = lumpcnt;
	}

	public void setAddcnt(int addcnt){
		this.addcnt = addcnt;
	}

	public void setTotcnt(int totcnt){
		this.totcnt = totcnt;
	}

	public void setLumpamt(int lumpamt){
		this.lumpamt = lumpamt;
	}

	public void setAddamt(int addamt){
		this.addamt = addamt;
	}

	public void setTotamt(int totamt){
		this.totamt = totamt;
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

	public void setRnum(int rnum){
		this.rnum = rnum;
	}

	public String getClsfcd(){
		return this.clsfcd;
	}

	public String getClosseq(){
		return this.closseq;
	}

	public String getClosyymm(){
		return this.closyymm;
	}

	public String getFrsubscd(){
		return this.frsubscd;
	}

	public String getTosubscd(){
		return this.tosubscd;
	}

	public String getClosdt(){
		return this.closdt;
	}

	public String getClosyn(){
		return this.closyn;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public int getLumpcnt(){
		return this.lumpcnt;
	}

	public int getAddcnt(){
		return this.addcnt;
	}

	public int getTotcnt(){
		return this.totcnt;
	}

	public int getLumpamt(){
		return this.lumpamt;
	}

	public int getAddamt(){
		return this.addamt;
	}

	public int getTotamt(){
		return this.totamt;
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

	public int getRnum(){
		return this.rnum;
	}
}

/* 작성시간 : Mon Apr 16 11:46:28 KST 2007 */