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


public class HD_AFFR_8021_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sply_fee;

	public HD_AFFR_8021_LCURLISTRecord(){}

	public void setSply_fee(String sply_fee){
		this.sply_fee = sply_fee;
	}

	public String getSply_fee(){
		return this.sply_fee;
	}
}

/* 작성시간 : Wed Oct 17 16:08:16 KST 2012 */