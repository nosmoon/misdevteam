/***************************************************************************************************
* 파일명 : SS_L_MIG_CLSF_BASICURCOMMLISTRecord.java
* 기능 : 공통-지급기준코드(기급구분별)(마일리지)을 위한 Record
* 작성일자 : 2004-03-20
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.common.rec;

import java.sql.*;
import chosun.ciis.ss.sls.common.dm.*;
import chosun.ciis.ss.sls.common.ds.*;

/**
 * 공통-지급기준코드(기급구분별)(마일리지)을 위한 Record
 */

public class SS_L_MIG_CLSF_BASICURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public SS_L_MIG_CLSF_BASICURCOMMLISTRecord(){}

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

/* 작성시간 : Sat Mar 20 16:47:30 KST 2004 */