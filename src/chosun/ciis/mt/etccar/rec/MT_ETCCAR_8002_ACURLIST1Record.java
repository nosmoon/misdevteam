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


public class MT_ETCCAR_8002_ACURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String drvr_cd;

	public MT_ETCCAR_8002_ACURLIST1Record(){}

	public void setDrvr_cd(String drvr_cd){
		this.drvr_cd = drvr_cd;
	}

	public String getDriver_cd(){
		return this.drvr_cd;
	}
}

/* 작성시간 : Wed Aug 22 16:18:11 KST 2012 */