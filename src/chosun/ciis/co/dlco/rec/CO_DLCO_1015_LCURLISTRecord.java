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


package chosun.ciis.co.dlco.rec;

import java.sql.*;
import chosun.ciis.co.dlco.dm.*;
import chosun.ciis.co.dlco.ds.*;

/**
 * 
 */


public class CO_DLCO_1015_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String phot_img;

	public CO_DLCO_1015_LCURLISTRecord(){}

	public void setPhot_img(String phot_img){
		this.phot_img = phot_img;
	}

	public String getPhot_img(){
		return this.phot_img;
	}
}

/* 작성시간 : Fri Mar 08 14:47:13 KST 2013 */