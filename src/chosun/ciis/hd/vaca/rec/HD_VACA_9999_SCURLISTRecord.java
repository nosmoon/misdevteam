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


package chosun.ciis.hd.vaca.rec;

import java.sql.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.ds.*;

/**
 * 
 */


public class HD_VACA_9999_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String real_vaca_cnt;

	public HD_VACA_9999_SCURLISTRecord(){}

	public void setReal_vaca_cnt(String real_vaca_cnt){
		this.real_vaca_cnt = real_vaca_cnt;
	}

	public String getReal_vaca_cnt(){
		return this.real_vaca_cnt;
	}
}

/* 작성시간 : Fri Sep 25 14:10:47 KST 2009 */