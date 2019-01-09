/***************************************************************************************************
* 파일명 : PS_L_TACOM_SCHECURCOMMLISTRecord.java
* 기능 : 출판국 일정
* 작성일자 : 2004-02-23
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.share.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.share.dm.*;
import chosun.ciis.ps.pbs.share.ds.*;

/**
 * 출판국 일정
 *
 */


public class PS_L_TACOM_SCHECURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public int seq;
	public Timestamp frdt;
	public Timestamp todt;
	public String remk;
	public String endyn;
	public String deptcd;

	public PS_L_TACOM_SCHECURCOMMLISTRecord(){}

	public void setSeq(int seq){
		this.seq = seq;
	}

	public void setFrdt(Timestamp frdt){
		this.frdt = frdt;
	}

	public void setTodt(Timestamp todt){
		this.todt = todt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setEndyn(String endyn){
		this.endyn = endyn;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public int getSeq(){
		return this.seq;
	}

	public Timestamp getFrdt(){
		return this.frdt;
	}

	public Timestamp getTodt(){
		return this.todt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getEndyn(){
		return this.endyn;
	}

	public String getDeptcd(){
		return this.deptcd;
	}
}

/* 작성시간 : Mon Feb 23 19:09:06 KST 2004 */