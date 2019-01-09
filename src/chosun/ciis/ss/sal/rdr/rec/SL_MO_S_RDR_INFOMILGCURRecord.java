/***************************************************************************************************
* 파일명 :
* 기능 :
* 작성일자 : 2015-10-21
* 작성자 : 장 선 희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.ds.*;

/**
 *
 */


public class SL_MO_S_RDR_INFOMILGCURRecord extends java.lang.Object implements java.io.Serializable{

	public int on_pont;
	public int off_pont;

	public SL_MO_S_RDR_INFOMILGCURRecord(){}

	public void setOn_pont(int on_pont){
		this.on_pont = on_pont;
	}

	public void setOff_pont(int off_pont){
		this.off_pont = off_pont;
	}

	public int getOn_pont(){
		return this.on_pont;
	}

	public int getOff_pont(){
		return this.off_pont;
	}
}

/* 작성시간 : Mon Dec 05 11:41:10 KST 2016 */