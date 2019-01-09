/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.insr.rec;

import java.sql.*;
import chosun.ciis.hd.insr.dm.*;
import chosun.ciis.hd.insr.ds.*;

/**
 * 
 */


public class HD_INSR_2001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aply_basi_dt;
	public String seq;
	public String insr_clsf;
	public String insr_rate;
	public String remk;

	public HD_INSR_2001_LCURLISTRecord(){}

	public void setAply_basi_dt(String aply_basi_dt){
		this.aply_basi_dt = aply_basi_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setInsr_clsf(String insr_clsf){
		this.insr_clsf = insr_clsf;
	}

	public void setInsr_rate(String insr_rate){
		this.insr_rate = insr_rate;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getAply_basi_dt(){
		return this.aply_basi_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getInsr_clsf(){
		return this.insr_clsf;
	}

	public String getInsr_rate(){
		return this.insr_rate;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Fri May 22 15:03:08 KST 2009 */