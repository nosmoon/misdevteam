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


package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;
import java.io.*;

/**
 * 
 */


public class HD_INFO_7150_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public byte[] phot;

	public HD_INFO_7150_SCURLISTRecord(){}

	public void setPhot(byte[] phot){
		this.phot = phot;
	}

	public byte[] getPhot(){
		return this.phot;
	}
}

/* 작성시간 : Tue Apr 02 11:29:01 KST 2013 */