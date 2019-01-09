/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mt.etccar.rec;

import java.sql.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.ds.*;

/**
 * 
 */


public class MT_ETCCAR_1000_LCURLIST4Record extends java.lang.Object implements java.io.Serializable{

	public String use_usag;

	public MT_ETCCAR_1000_LCURLIST4Record(){}

	public void setUse_usag(String use_usag){
		this.use_usag = use_usag;
	}

	public String getUse_usag(){
		return this.use_usag;
	}
}

/* 작성시간 : Wed Sep 09 13:36:33 KST 2009 */