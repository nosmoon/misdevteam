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


package chosun.ciis.hd.prz.rec;

import java.io.InputStream;
import java.sql.*;

import chosun.ciis.hd.prz.dm.*;
import chosun.ciis.hd.prz.ds.*;

/**
 * 
 */


public class HD_PRZ_1104_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public byte[] atic_add_file;
	public InputStream in;
	public Blob blob_atic_add_file;
	public String atic_add_file_nm;
	public String atic_add_file_size;

	public HD_PRZ_1104_LCURLISTRecord(){}

	public void setIn(InputStream in){
		this.in = in;
	}

	public InputStream getIn(){
		return this.in;
	}
	
	public void setBlob_atic_add_file(Blob blob_atic_add_file){
		this.blob_atic_add_file = blob_atic_add_file;
	}

	public Blob getBlob_atic_add_file(){
		return this.blob_atic_add_file;
	}

	public void setAtic_add_file_nm(String atic_add_file_nm){
		this.atic_add_file_nm = atic_add_file_nm;
	}

	public void setAtic_add_file_size(String atic_add_file_size){
		this.atic_add_file_size = atic_add_file_size;
	}
	
	public void setPhot(byte[] sjsajin){
		this.atic_add_file = sjsajin;
	}

	public byte[] getPhot(){
		return this.atic_add_file;
	}

	public String getAtic_add_file_nm(){
		return this.atic_add_file_nm;
	}

	public String getAtic_add_file_size(){
		return this.atic_add_file_size;
	}
}

/* 작성시간 : Wed Aug 19 20:05:33 KST 2009 */