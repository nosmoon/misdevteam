/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 
 */


public class SS_SLS_EXTN_5020_LCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptnm;
	public String extnnm;
	public String medi_qty;
	public String mob_qty;
	public String empseq;

	public SS_SLS_EXTN_5020_LCURCOMMLISTRecord(){}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setExtnnm(String extnnm){
		this.extnnm = extnnm;
	}

	public void setMedi_qty(String medi_qty){
		this.medi_qty = medi_qty;
	}

	public void setMob_qty(String mob_qty){
		this.mob_qty = mob_qty;
	}

	public void setEmpseq(String empseq){
		this.empseq = empseq;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getExtnnm(){
		return this.extnnm;
	}

	public String getMedi_qty(){
		return this.medi_qty;
	}

	public String getMob_qty(){
		return this.mob_qty;
	}

	public String getEmpseq(){
		return this.empseq;
	}
}

/* 작성시간 : Mon Jun 20 15:34:03 KST 2016 */