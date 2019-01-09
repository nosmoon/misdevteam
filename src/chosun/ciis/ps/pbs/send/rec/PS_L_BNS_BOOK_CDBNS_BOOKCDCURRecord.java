/***************************************************************************************************
* 파일명 : SP_PS_L_BNS_BOOK_CD.java
* 발송-반송관리 선택된 독자번호의 보너스북 조회
* 작성일자 : 2004-03-19
* 작성자 : 김건호 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 : 
* 수정일자 :   
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.ds.*;

/**
 * 발송-반송관리 선택된 독자번호의 보너스북 조회
 *
 */

  

public class PS_L_BNS_BOOK_CDBNS_BOOKCDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String bns_bookcd;
	public String bns_booknm;
	public String cmpycd;
	public String bgnvdtydt;
	public String endvdtydt;

	public PS_L_BNS_BOOK_CDBNS_BOOKCDCURRecord(){}

	public void setBns_bookcd(String bns_bookcd){
		this.bns_bookcd = bns_bookcd;
	}

	public void setBns_booknm(String bns_booknm){
		this.bns_booknm = bns_booknm;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setBgnvdtydt(String bgnvdtydt){
		this.bgnvdtydt = bgnvdtydt;
	}

	public void setEndvdtydt(String endvdtydt){
		this.endvdtydt = endvdtydt;
	}

	public String getBns_bookcd(){
		return this.bns_bookcd;
	}

	public String getBns_booknm(){
		return this.bns_booknm;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getBgnvdtydt(){
		return this.bgnvdtydt;
	}

	public String getEndvdtydt(){
		return this.endvdtydt;
	}
}

/* 작성시간 : Fri Mar 19 17:09:29 KST 2004 */