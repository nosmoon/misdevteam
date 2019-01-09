/***************************************************************************************************
* 파일명 : SS_L_JIYEOGCDCURCOMMLISTRecord.java
* 기능 : 공통-지역코드,코드명 목록을 위한 Record
* 작성일자 : 2003-11-15
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.common.rec;

import chosun.ciis.ss.sls.common.dm.*;
import chosun.ciis.ss.sls.common.ds.*;

/**
 * 공통-지역코드,코드명 목록을 위한 Record
 */

public class SS_L_JIYEOGCDCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String areacd;
	public String areanm;

	public SS_L_JIYEOGCDCURCOMMLISTRecord(){}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getAreanm(){
		return this.areanm;
	}
}

/* 작성시간 : Wed Nov 19 14:18:54 KST 2003 */