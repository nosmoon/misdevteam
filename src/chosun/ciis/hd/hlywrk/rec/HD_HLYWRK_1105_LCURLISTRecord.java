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


package chosun.ciis.hd.hlywrk.rec;

import java.sql.*;
import chosun.ciis.hd.hlywrk.dm.*;
import chosun.ciis.hd.hlywrk.ds.*;

/**
 * 
 */


public class HD_HLYWRK_1105_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String paidhody_cnt;

	public HD_HLYWRK_1105_LCURLISTRecord(){}

	public void setPaidhody_cnt(String paidhody_cnt){
		this.paidhody_cnt = paidhody_cnt;
	}

	public String getPaidhody_cnt(){
		return this.paidhody_cnt;
	}
}

/* 작성시간 : Thu Oct 01 14:07:27 KST 2009 */