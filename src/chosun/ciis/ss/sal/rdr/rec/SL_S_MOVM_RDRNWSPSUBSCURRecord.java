/***************************************************************************************************
* 파일명 : SL_S_MOVM_RDRNWSPSUBSCURRecord.java
* 기능 : 독자-이사독자관리-이사인계-상세
* 작성일자 : 2004-03-26
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
 * 독자-이사독자관리-이사인계-상세
 *
 */

public class SL_S_MOVM_RDRNWSPSUBSCURRecord extends java.lang.Object implements java.io.Serializable{

	public String medicd;
	public String medinm;
	public String freeyn;
	public String freeclsf;
	public String freeclsfnm;
	public int qty;
	public String valmm;

	public SL_S_MOVM_RDRNWSPSUBSCURRecord(){}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setFreeyn(String freeyn){
		this.freeyn = freeyn;
	}

	public void setFreeclsf(String freeclsf){
		this.freeclsf = freeclsf;
	}

	public void setFreeclsfnm(String freeclsfnm){
		this.freeclsfnm = freeclsfnm;
	}

	public void setQty(int qty){
		this.qty = qty;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getFreeyn(){
		return this.freeyn;
	}

	public String getFreeclsf(){
		return this.freeclsf;
	}

	public String getFreeclsfnm(){
		return this.freeclsfnm;
	}

	public int getQty(){
		return this.qty;
	}

	public String getValmm(){
		return this.valmm;
	}
}

/* 작성시간 : Fri Mar 26 15:13:47 KST 2004 */