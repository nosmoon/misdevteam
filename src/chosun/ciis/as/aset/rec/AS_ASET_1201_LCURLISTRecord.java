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


package chosun.ciis.as.aset.rec;

import java.sql.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.ds.*;

/**
 * 
 */


public class AS_ASET_1201_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String label;
	public String value;

	public AS_ASET_1201_LCURLISTRecord(){}

	public void setLabel(String label){
		this.label = label;
	}

	public void setValue(String value){
		this.value = value;
	}

	public String getLabel(){
		return this.label;
	}

	public String getValue(){
		return this.value;
	}
}

/* 작성시간 : Mon Mar 09 19:06:50 KST 2009 */