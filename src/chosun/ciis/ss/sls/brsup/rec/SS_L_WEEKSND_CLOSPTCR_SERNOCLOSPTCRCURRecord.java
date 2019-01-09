/***************************************************************************************************
 * 파일명   : SP_SS_L_WEEKSND_CLOSPTCR_SERNO
 * 기능     : 지국지원-빌링-주간조선관리-정산마감-호수별마감내역
 * 작성일자 : 2007/08/29
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
**  SP_SS_L_WEEKSND_CLOSPTCR_SERNO
**/

public class SS_L_WEEKSND_CLOSPTCR_SERNOCLOSPTCRCURRecord extends java.lang.Object implements java.io.Serializable{

	public String clsfcd;
	public String closseq;
	public String closyymm;
	public String closdt;
	public String mediser_no;
	public int lumpcnt;
	public int retncnt;
	public int closcnt;
	public int lumpamt;
	public int retnamt;
	public int closamt;

	public SS_L_WEEKSND_CLOSPTCR_SERNOCLOSPTCRCURRecord(){}

	public void setClsfcd(String clsfcd){
		this.clsfcd = clsfcd;
	}

	public void setClosseq(String closseq){
		this.closseq = closseq;
	}

	public void setClosyymm(String closyymm){
		this.closyymm = closyymm;
	}

	public void setClosdt(String closdt){
		this.closdt = closdt;
	}

	public void setMediser_no(String mediser_no){
		this.mediser_no = mediser_no;
	}

	public void setLumpcnt(int lumpcnt){
		this.lumpcnt = lumpcnt;
	}

	public void setRetncnt(int retncnt){
		this.retncnt = retncnt;
	}

	public void setCloscnt(int closcnt){
		this.closcnt = closcnt;
	}

	public void setLumpamt(int lumpamt){
		this.lumpamt = lumpamt;
	}

	public void setRetnamt(int retnamt){
		this.retnamt = retnamt;
	}

	public void setClosamt(int closamt){
		this.closamt = closamt;
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

	public String getClosdt(){
		return this.closdt;
	}

	public String getMediser_no(){
		return this.mediser_no;
	}

	public int getLumpcnt(){
		return this.lumpcnt;
	}

	public int getRetncnt(){
		return this.retncnt;
	}

	public int getCloscnt(){
		return this.closcnt;
	}

	public int getLumpamt(){
		return this.lumpamt;
	}

	public int getRetnamt(){
		return this.retnamt;
	}

	public int getClosamt(){
		return this.closamt;
	}
}

/* 작성시간 : Wed Aug 29 14:53:54 KST 2007 */