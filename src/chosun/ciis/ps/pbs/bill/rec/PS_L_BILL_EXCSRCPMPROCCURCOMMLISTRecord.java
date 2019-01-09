/***************************************************************************************************
 * 파일명   : PS_L_BILL_EXCSRCPMPROCCURCOMMLISTRecord.java
 * 기능     : 수금-초과입금처리 검색
 * 작성일자 : 2004-04-06
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     : 
 **************************************************************************************************/


package chosun.ciis.ps.pbs.bill.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.ds.*;

/**
 * 수금-초과입금처리 검색
 */

public class PS_L_BILL_EXCSRCPMPROCCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String medicd;
	public String termsubsno;
	public String rdrnm;
	public String medinm;
	public String procclsf;
	public String procclsfnm;
	public String seq;
	public String procyn;
	public int procamt;
	public int realsellamt;
	public int excsrcpmamt;
	public String procdt;
	public String subsfrser_no;
	public String substoser_no;
	public String exstsubssctn;
	public String chgsubssctn;

	public PS_L_BILL_EXCSRCPMPROCCURCOMMLISTRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setTermsubsno(String termsubsno){
		this.termsubsno = termsubsno;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setProcclsf(String procclsf){
		this.procclsf = procclsf;
	}

	public void setProcclsfnm(String procclsfnm){
		this.procclsfnm = procclsfnm;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setProcyn(String procyn){
		this.procyn = procyn;
	}

	public void setProcamt(int procamt){
		this.procamt = procamt;
	}

	public void setRealsellamt(int realsellamt){
		this.realsellamt = realsellamt;
	}

	public void setExcsrcpmamt(int excsrcpmamt){
		this.excsrcpmamt = excsrcpmamt;
	}

	public void setProcdt(String procdt){
		this.procdt = procdt;
	}

	public void setSubsfrser_no(String subsfrser_no){
		this.subsfrser_no = subsfrser_no;
	}

	public void setSubstoser_no(String substoser_no){
		this.substoser_no = substoser_no;
	}

	public void setExstsubssctn(String exstsubssctn){
		this.exstsubssctn = exstsubssctn;
	}

	public void setChgsubssctn(String chgsubssctn){
		this.chgsubssctn = chgsubssctn;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getTermsubsno(){
		return this.termsubsno;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getProcclsf(){
		return this.procclsf;
	}

	public String getProcclsfnm(){
		return this.procclsfnm;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getProcyn(){
		return this.procyn;
	}

	public int getProcamt(){
		return this.procamt;
	}

	public int getRealsellamt(){
		return this.realsellamt;
	}

	public int getExcsrcpmamt(){
		return this.excsrcpmamt;
	}

	public String getProcdt(){
		return this.procdt;
	}

	public String getSubsfrser_no(){
		return this.subsfrser_no;
	}

	public String getSubstoser_no(){
		return this.substoser_no;
	}

	public String getExstsubssctn(){
		return this.exstsubssctn;
	}

	public String getChgsubssctn(){
		return this.chgsubssctn;
	}
}

/* 작성시간 : Wed Apr 07 16:42:18 KST 2004 */