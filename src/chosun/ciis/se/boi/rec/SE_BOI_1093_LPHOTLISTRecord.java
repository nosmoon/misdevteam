/***************************************************************************************************
* 파일명 : SE_BOI_1093_LDataSet.java
* 기능 : 센터정보관리-센터대표정보-센터대표사진 다운로드 하기위한 조회
* 작성일자 : 2017-05-16
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.boi.rec;

import java.io.InputStream;
import java.sql.*;

import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 *
 */


public class SE_BOI_1093_LPHOTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bo_cd;
	public String filenm;
	public byte[]  bohead_phot;
	public String bo_prn;
	public InputStream in;
	public Blob blob_phot;


	public SE_BOI_1093_LPHOTLISTRecord(){}

	public void setIn(InputStream in){
		this.in = in;
	}

	public InputStream getIn(){
		return this.in;
	}


	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setFilenm(String filenm){
		this.filenm = filenm;
	}

	public void setBo_prn(String bo_prn){
		this.bo_prn = bo_prn;
	}

	public void setBlob_phot(Blob blob_phot){
		this.blob_phot = blob_phot;
	}

	public void setBohead_phot(byte[] sjsajin){
		this.bohead_phot = sjsajin;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getFilenm(){
		return this.filenm;
	}

	public String getBo_prn(){
		return this.bo_prn;
	}

	public Blob getBlob_phot(){
		return this.blob_phot;
	}

	public byte[]  getBohead_phot(){
		return this.bohead_phot;
	}






}



/* 작성시간 : Tue May 16 09:40:04 KST 2017 */