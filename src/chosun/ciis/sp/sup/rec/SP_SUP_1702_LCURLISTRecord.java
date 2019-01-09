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


package chosun.ciis.sp.sup.rec;

import java.io.InputStream;
import java.sql.*;

import chosun.ciis.sp.sup.dm.*;
import chosun.ciis.sp.sup.ds.*;

/**
 * 
 */


public class SP_SUP_1702_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_no;
	public byte[] phot;
	public InputStream in;
	public Blob blob_phot;

	public SP_SUP_1702_LCURLISTRecord(){}

	public void setIn(InputStream in){
		this.in = in;
	}

	public InputStream getIn(){
		return this.in;
	}
	
	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	
	public void setBlob_phot(Blob blob_phot){
		this.blob_phot = blob_phot;
	}

	public Blob getBlob_phot(){
		return this.blob_phot;
	}
	
	public void setPhot(byte[] sjsajin){
		this.phot = sjsajin;
	}

	public byte[] getPhot(){
		return this.phot;
	}
	
}

/* 작성시간 : Wed Aug 22 11:43:15 KST 2012 */