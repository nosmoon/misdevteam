/***************************************************************************************************
* 파일명 : SL_L_NWSPSUBS_FOR_STOPFREECLSFCDCURRecord.java
* 기능 : 중지독자관리-중지대상조회
* 작성일자 : 2004-02-09
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
 * 중지독자관리-중지대상조회
 *
 */


public class SL_L_NWSPSUBS_FOR_STOPFREECLSFCDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;
	public String cicdynm;
	public String ciymgbcd;
	public String cicdgb;

	public SL_L_NWSPSUBS_FOR_STOPFREECLSFCDCURRecord(){}

	public void setCicodeval(String cicodeval){
		this.cicodeval = cicodeval;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public void setCicdynm(String cicdynm){
		this.cicdynm = cicdynm;
	}

	public void setCiymgbcd(String ciymgbcd){
		this.ciymgbcd = ciymgbcd;
	}

	public void setCicdgb(String cicdgb){
		this.cicdgb = cicdgb;
	}

	public String getCicodeval(){
		return this.cicodeval;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}

	public String getCicdynm(){
		return this.cicdynm;
	}

	public String getCiymgbcd(){
		return this.ciymgbcd;
	}

	public String getCicdgb(){
		return this.cicdgb;
	}
}

/* 작성시간 : Tue Feb 10 17:40:17 KST 2004 */