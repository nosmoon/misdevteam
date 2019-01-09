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


package chosun.ciis.hd.crcl.rec;

import java.sql.*;
import chosun.ciis.hd.crcl.dm.*;
import chosun.ciis.hd.crcl.ds.*;

/**
 * 
 */


public class HD_CRCL_1302_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String paty_crc_dus;

	public HD_CRCL_1302_LCURLISTRecord(){}

	public void setPaty_crc_dus(String paty_crc_dus){
		this.paty_crc_dus = paty_crc_dus;
	}

	public String getPaty_crc_dus(){
		return this.paty_crc_dus;
	}
}

/* 작성시간 : Thu Feb 19 09:45:44 KST 2009 */