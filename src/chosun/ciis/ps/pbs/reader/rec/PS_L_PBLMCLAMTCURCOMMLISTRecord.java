/***************************************************************************************************
* 파일명   : SP_PS_L_PBLMCLAMT.java
* 기능     : 독자-수금입력목록 조회화면
* 작성일자 : 2008-07-16
* 작성자   : 김재일
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
***************************************************************************************************/


package chosun.ciis.ps.pbs.reader.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.ds.*;

/**
 * 독자-수금입력목록 조회화면
 *
 */

public class PS_L_PBLMCLAMTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String medicd;
	public String termsubsno;
	public String bonm;
	public String procdt;
	public String acqnm;
	public String medinm;
	public String recpmthd;
	public int rcpmamt;
	public String rnum;

	public PS_L_PBLMCLAMTCURCOMMLISTRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setTermsubsno(String termsubsno){
		this.termsubsno = termsubsno;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setProcdt(String procdt){
		this.procdt = procdt;
	}

	public void setAcqnm(String acqnm){
		this.acqnm = acqnm;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setRecpmthd(String recpmthd){
		this.recpmthd = recpmthd;
	}

	public void setRcpmamt(int rcpmamt){
		this.rcpmamt = rcpmamt;
	}

	public void setRnum(String rnum){
		this.rnum = rnum;
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

	public String getBonm(){
		return this.bonm;
	}

	public String getProcdt(){
		return this.procdt;
	}

	public String getAcqnm(){
		return this.acqnm;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getRecpmthd(){
		return this.recpmthd;
	}

	public int getRcpmamt(){
		return this.rcpmamt;
	}

	public String getRnum(){
		return this.rnum;
	}
}

/* 작성시간 : Wed Jul 16 15:57:30 KST 2008 */