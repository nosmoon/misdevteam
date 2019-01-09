/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 
 */


public class SS_SLS_EXTN_4200_ACURSVCMMRecord extends java.lang.Object implements java.io.Serializable{

	public String svcmm;

	public SS_SLS_EXTN_4200_ACURSVCMMRecord(){}

	public void setSvcmm(String svcmm){
		this.svcmm = svcmm;
	}

	public String getSvcmm(){
		return this.svcmm;
	}
}

/* 작성시간 : Wed Jan 06 18:25:03 KST 2016 */