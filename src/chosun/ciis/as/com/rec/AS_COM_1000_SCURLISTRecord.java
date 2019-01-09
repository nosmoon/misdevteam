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


package chosun.ciis.as.com.rec;

import java.sql.*;
import chosun.ciis.as.com.dm.*;
import chosun.ciis.as.com.ds.*;

/**
 * 
 */


public class AS_COM_1000_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public byte[] phot_img;

	public AS_COM_1000_SCURLISTRecord(){}

	public void setPhot_img(byte[] phot_img){
		this.phot_img = phot_img;
	}

	public byte[] getPhot_img(){
		return this.phot_img;
	}
}

/* 작성시간 : Thu Mar 05 19:15:02 KST 2009 */