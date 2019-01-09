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


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_2405_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String hlth_chk_fee;

	public HD_AFFR_2405_LCURLISTRecord(){}

	public void setHlth_chk_fee(String hlth_chk_fee){
		this.hlth_chk_fee = hlth_chk_fee;
	}

	public String getHlth_chk_fee(){
		return this.hlth_chk_fee;
	}
}

/* 작성시간 : Fri Apr 03 15:26:24 KST 2009 */