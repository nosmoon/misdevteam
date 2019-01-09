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


package chosun.ciis.en.rcpm.rec;

import java.sql.*;
import chosun.ciis.en.rcpm.dm.*;
import chosun.ciis.en.rcpm.ds.*;

/**
 * 
 */


public class EN_RCPM_1002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rcpm_shet_no;

	public EN_RCPM_1002_LCURLISTRecord(){}

	public void setRcpm_shet_no(String rcpm_shet_no){
		this.rcpm_shet_no = rcpm_shet_no;
	}

	public String getRcpm_shet_no(){
		return this.rcpm_shet_no;
	}
}

/* 작성시간 : Wed Feb 11 11:15:06 KST 2009 */