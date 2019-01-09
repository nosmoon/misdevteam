/***************************************************************************************************
* 파일명 : SS_L_MONTH_SCHEDAY24SCHECURRecord.java
* 기능 : 정보공유-메인페이지-일별일정을 위한 Record
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.share.rec;

import java.sql.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.ds.*;

/**
 * 정보공유-메인페이지-일별일정을 위한 Record
 */


public class SS_L_MONTH_SCHEDAY24SCHECURRecord extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String frdt;
	public String todt;
	public String remk;
	public String schemangunitcd;
	public String schemangunitcd_nm;

	public SS_L_MONTH_SCHEDAY24SCHECURRecord(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setSchemangunitcd(String schemangunitcd){
		this.schemangunitcd = schemangunitcd;
	}

	public void setSchemangunitcd_nm(String schemangunitcd_nm){
		this.schemangunitcd_nm = schemangunitcd_nm;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSchemangunitcd(){
		return this.schemangunitcd;
	}

	public String getSchemangunitcd_nm(){
		return this.schemangunitcd_nm;
	}
}

/* 작성시간 : Mon Jun 07 14:07:48 KST 2004 */