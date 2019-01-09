/***************************************************************************************************
* 파일명 : CO_L_CDV_CICDGBCURCOMMLISTRecord.java
* 기능 : 관리자-공통코드-코드구분 목록을 위한 Record
* 작성일자 : 2004-03-09
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 * 관리자-공통코드-코드구분 목록을 위한 Record
 */

public class CO_L_CDV_CICDGBCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cicdgb;
	public String cicdnm;

	public CO_L_CDV_CICDGBCURCOMMLISTRecord(){}

	public void setCicdgb(String cicdgb){
		this.cicdgb = cicdgb;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public String getCicdgb(){
		return this.cicdgb;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}
}

/* 작성시간 : Tue Mar 09 13:57:19 KST 2004 */