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


public class PS_S_RDR_CMPROBJHOBBYCURRecord extends java.lang.Object implements java.io.Serializable{

	public String hbycd;
	public String hbyseq;

	public PS_S_RDR_CMPROBJHOBBYCURRecord(){}

	public void setHbycd(String hbycd){
		this.hbycd = hbycd;
	}

	public void setHbyseq(String hbyseq){
		this.hbyseq = hbyseq;
	}

	public String getHbycd(){
		return this.hbycd;
	}

	public String getHbyseq(){
		return this.hbyseq;
	}
}

/* 작성시간 : Fri Feb 27 15:39:41 KST 2004 */