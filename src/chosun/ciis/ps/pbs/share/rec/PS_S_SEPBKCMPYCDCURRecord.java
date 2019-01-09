/***************************************************************************************************
* 파일명 : PS_S_SEPBKCMPYCDCURRecord.java
* 기능 : 출판 콤보 - 회사명
* 작성일자 : 2004-02-23
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.share.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.share.dm.*;
import chosun.ciis.ps.pbs.share.ds.*;

/**
 * 출판국 일정
 *
 */


public class PS_S_SEPBKCMPYCDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public PS_S_SEPBKCMPYCDCURRecord(){}

	public void setCicodeval(String cicodeval){
		this.cicodeval = cicodeval;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public String getCicodeval(){
		return this.cicodeval;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}
}

/* 작성시간 : Wed Feb 25 16:32:25 KST 2004 */