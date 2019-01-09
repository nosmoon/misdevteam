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


public class HD_AFFR_2704_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String hospz_med_exam_fee;

	public HD_AFFR_2704_LCURLISTRecord(){}

	public void setHospz_med_exam_fee(String hospz_med_exam_fee){
		this.hospz_med_exam_fee = hospz_med_exam_fee;
	}

	public String getHospz_med_exam_fee(){
		return this.hospz_med_exam_fee;
	}
}

/* 작성시간 : Fri Apr 03 13:56:20 KST 2009 */