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

import java.io.*;
/**
 * 
 */


public class HD_INFO_1002_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public byte[] sjsajin;

	public HD_INFO_1002_SCURLISTRecord(){}

	public void setSjsajin(byte[] sjsajin){
		this.sjsajin = sjsajin;
	}

	public byte[] getSjsajin(){
		return this.sjsajin;
	}
}

/* 작성시간 : Thu Feb 12 13:32:24 KST 2009 */