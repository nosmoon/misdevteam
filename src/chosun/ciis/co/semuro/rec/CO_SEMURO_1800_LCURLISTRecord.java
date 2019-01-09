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


package chosun.ciis.co.semuro.rec;

import java.sql.*;
import chosun.ciis.co.semuro.dm.*;
import chosun.ciis.co.semuro.ds.*;

/**
 *
 */


public class CO_SEMURO_1800_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String semuro_id;

	public CO_SEMURO_1800_LCURLISTRecord(){}

	public void setSemuro_id(String semuro_id){
		this.semuro_id = semuro_id;
	}

	public String getSemuro_id(){
		return this.semuro_id;
	}
}

/* 작성시간 : Mon Mar 16 18:21:11 KST 2009 */