/***************************************************************************************************
* 파일명 : PS_L_BNSBK.java
* 기능 :   코드관리-보너스북 조회화면
* 작성일자 : 2007-05-21
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.code.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.code.dm.*;
import chosun.ciis.ps.pbs.code.ds.*;

/**
 * 코드관리-보너스북내역 조회화면
 *
 */

public class PS_L_BNSBKCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpynm;
	public String bns_bookcd;
	public String bns_booknm;
	public String medicd;
	public String medinm;
	public String bgnvdtydt;
	public String endvdtydt;
	public String remk;
	public String vipcont;

	public PS_L_BNSBKCURCOMMLISTRecord(){}

	public void setCmpynm(String cmpynm){
		this.cmpynm = cmpynm;
	}

	public void setBns_bookcd(String bns_bookcd){
		this.bns_bookcd = bns_bookcd;
	}

	public void setBns_booknm(String bns_booknm){
		this.bns_booknm = bns_booknm;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setBgnvdtydt(String bgnvdtydt){
		this.bgnvdtydt = bgnvdtydt;
	}

	public void setEndvdtydt(String endvdtydt){
		this.endvdtydt = endvdtydt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setVipcont(String vipcont){
		this.vipcont = vipcont;
	}

	public String getCmpynm(){
		return this.cmpynm;
	}

	public String getBns_bookcd(){
		return this.bns_bookcd;
	}

	public String getBns_booknm(){
		return this.bns_booknm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getBgnvdtydt(){
		return this.bgnvdtydt;
	}

	public String getEndvdtydt(){
		return this.endvdtydt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getVipcont(){
		return this.vipcont;
	}
}

/* 작성시간 : Mon May 21 17:36:18 KST 2007 */