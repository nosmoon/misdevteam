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


package chosun.ciis.se.boi.rec;

import java.sql.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 * 
 */


public class SE_BOI_1030_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public byte[] bo_head_phot;

	public SE_BOI_1030_SCURLISTRecord(){}

	public void setBo_head_phot(byte[] bo_head_phot){
		this.bo_head_phot = bo_head_phot;
	}

	public byte[] getBo_head_phot(){
		return this.bo_head_phot;
	}
}

/* 작성시간 : Tue Jan 20 18:12:34 KST 2009 */