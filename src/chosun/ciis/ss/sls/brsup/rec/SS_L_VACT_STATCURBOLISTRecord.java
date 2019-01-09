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


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 
 */


public class SS_L_VACT_STATCURBOLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptnm;
	public String partnm;
	public String areanm;
	public String bonm;
	public String bocd;
	public int totcnt;
	public int totamt;
	public int normlcnt;
	public int normlamt;
	public int errcnt;
	public int erramt;

	public SS_L_VACT_STATCURBOLISTRecord(){}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setPartnm(String partnm){
		this.partnm = partnm;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setTotcnt(int totcnt){
		this.totcnt = totcnt;
	}

	public void setTotamt(int totamt){
		this.totamt = totamt;
	}

	public void setNormlcnt(int normlcnt){
		this.normlcnt = normlcnt;
	}

	public void setNormlamt(int normlamt){
		this.normlamt = normlamt;
	}

	public void setErrcnt(int errcnt){
		this.errcnt = errcnt;
	}

	public void setErramt(int erramt){
		this.erramt = erramt;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getPartnm(){
		return this.partnm;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public int getTotcnt(){
		return this.totcnt;
	}

	public int getTotamt(){
		return this.totamt;
	}

	public int getNormlcnt(){
		return this.normlcnt;
	}

	public int getNormlamt(){
		return this.normlamt;
	}

	public int getErrcnt(){
		return this.errcnt;
	}

	public int getErramt(){
		return this.erramt;
	}
}

/* 작성시간 : Wed Sep 30 16:59:03 KST 2015 */