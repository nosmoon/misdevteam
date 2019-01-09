/***************************************************************************************************
* 파일명 : SL_L_RDR_MOVMDSTCRDR_MOVMDSTCRecord.java
* 기능 : 관할지국조정관리-인수(대상목록)
* 작성일자 : 2004-02-07
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.ds.*;

/**
 * 관할지국조정관리-인수(대상목록)
 *
 */


public class SL_L_RDR_MOVMDSTCRDR_MOVMDSTCRecord extends java.lang.Object implements java.io.Serializable{

	public String regdt;
	public String regno;
	public String seq;
	public String dstccd;
	public String dstcnm;
	public int rdrcnt;
	public String bgndlvno;
	public String enddlvno;

	public SL_L_RDR_MOVMDSTCRDR_MOVMDSTCRecord(){}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDstccd(String dstccd){
		this.dstccd = dstccd;
	}

	public void setDstcnm(String dstcnm){
		this.dstcnm = dstcnm;
	}

	public void setRdrcnt(int rdrcnt){
		this.rdrcnt = rdrcnt;
	}

	public void setBgndlvno(String bgndlvno){
		this.bgndlvno = bgndlvno;
	}

	public void setEnddlvno(String enddlvno){
		this.enddlvno = enddlvno;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDstccd(){
		return this.dstccd;
	}

	public String getDstcnm(){
		return this.dstcnm;
	}

	public int getRdrcnt(){
		return this.rdrcnt;
	}

	public String getBgndlvno(){
		return this.bgndlvno;
	}

	public String getEnddlvno(){
		return this.enddlvno;
	}
}

/* 작성시간 : Mon Feb 09 16:14:11 KST 2004 */