/***************************************************************************************************
* 파일명 : SP_PS_S_RDR_CMPROBJ.java
* 기능 :   독자-중재처리 비교대상내역 상세조회화면
* 작성일자 : 2004-02-23
* 작성자 : 김건호 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :   
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.reader.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.ds.*;

/**
 * 독자-중재처리 비교대상내역 상세조회화면
 *
 */


public class PS_S_RDR_CMPROBJBONLISTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String aplcseq;
	public String bns_bookseq;
	public String bns_bookcd;

	public PS_S_RDR_CMPROBJBONLISTCURRecord(){}

	public void setAplcseq(String aplcseq){
		this.aplcseq = aplcseq;
	}

	public void setBns_bookseq(String bns_bookseq){
		this.bns_bookseq = bns_bookseq;
	}

	public void setBns_bookcd(String bns_bookcd){
		this.bns_bookcd = bns_bookcd;
	}

	public String getAplcseq(){
		return this.aplcseq;
	}

	public String getBns_bookseq(){
		return this.bns_bookseq;
	}

	public String getBns_bookcd(){
		return this.bns_bookcd;
	}
}

/* 작성시간 : Fri Feb 27 15:39:41 KST 2004 */