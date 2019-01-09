/***************************************************************************************************
* 파일명 : 
* 기능 :  발송-일괄발송 확인처리 
* 작성일자 : 2004-02-26
* 작성자 : 장수환
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
 * 발송-일괄발송 확인처리
 *
 */

public class PS_L_SEND_MTHD_DTLSCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cicdnm;
	public int paty;
	public int gnr;
	public int total;

	public PS_L_SEND_MTHD_DTLSCURCOMMLISTRecord(){}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public void setPaty(int paty){
		this.paty = paty;
	}

	public void setGnr(int gnr){
		this.gnr = gnr;
	}

	public void setTotal(int total){
		this.total = total;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}

	public int getPaty(){
		return this.paty;
	}

	public int getGnr(){
		return this.gnr;
	}

	public int getTotal(){
		return this.total;
	}
}

/* 작성시간 : Fri Feb 27 14:40:15 KST 2004 */