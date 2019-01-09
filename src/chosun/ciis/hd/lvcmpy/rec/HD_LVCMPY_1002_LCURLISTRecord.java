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


public class HD_LVCMPY_1002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String ov_cmpy_dt;

	public HD_LVCMPY_1002_LCURLISTRecord(){}

	public void setOv_cmpy_dt(String ov_cmpy_dt){
		this.ov_cmpy_dt = ov_cmpy_dt;
	}

	public String getOv_cmpy_dt(){
		return this.ov_cmpy_dt;
	}
}

/* 작성시간 : Mon Apr 27 18:42:35 KST 2009 */