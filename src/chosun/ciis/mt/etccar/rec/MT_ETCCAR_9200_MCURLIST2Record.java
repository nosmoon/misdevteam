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


public class MT_ETCCAR_9200_MCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String drvr_nm;

	public MT_ETCCAR_9200_MCURLIST2Record(){}

	public void setDrvr_nm(String drvr_nm){
		this.drvr_nm = drvr_nm;
	}
	
	public String getDrvr_nm(){
		return this.drvr_nm;
	}

}

/* 작성시간 : Mon Sep 03 18:58:01 KST 2012 */