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


package chosun.ciis.hd.lvcmpy.rec;

import java.sql.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.ds.*;

/**
 * 
 */


public class HD_LVCMPY_1003_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String ov_avg_tm_dt;

	public HD_LVCMPY_1003_LCURLISTRecord(){}

	public void setOv_avg_tm_dt(String ov_avg_tm_dt){
		this.ov_avg_tm_dt = ov_avg_tm_dt;
	}

	public String getOv_avg_tm_dt(){
		return this.ov_avg_tm_dt;
	}
}

/* 작성시간 : Mon Apr 27 20:28:28 KST 2009 */