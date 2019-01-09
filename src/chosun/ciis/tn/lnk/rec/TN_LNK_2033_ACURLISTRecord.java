/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.lnk.rec;

import java.sql.*;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.ds.*;

/**
 * 
 */


public class TN_LNK_2033_ACURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String file_data;
	public byte[] proofdata;

	public TN_LNK_2033_ACURLISTRecord(){}

	public void setFile_data(String file_data){
		this.file_data = file_data;
	}

	public void setProofdata(byte[] proofdata){
		this.proofdata = proofdata;
	}

	public String getFile_data(){
		return this.file_data;
	}

	public byte[] getProofdata(){
		return this.proofdata;
	}
}

/* 작성시간 : Mon Jul 25 16:58:35 KST 2016 */