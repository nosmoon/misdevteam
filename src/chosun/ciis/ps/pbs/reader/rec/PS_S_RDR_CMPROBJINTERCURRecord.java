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


public class PS_S_RDR_CMPROBJINTERCURRecord extends java.lang.Object implements java.io.Serializable{

	public String conccd;
	public String concseq;

	public PS_S_RDR_CMPROBJINTERCURRecord(){}

	public void setConccd(String conccd){
		this.conccd = conccd;
	}

	public void setConcseq(String concseq){
		this.concseq = concseq;
	}

	public String getConccd(){
		return this.conccd;
	}

	public String getConcseq(){
		return this.concseq;
	}
}

/* 작성시간 : Fri Feb 27 15:39:41 KST 2004 */