/***************************************************************************************************
* 파일명 : SE_BOI_1092_SPHOTLISTRecord.java
* 기능 : 판매시스템
* 작성일자 : 2017-04-27
* 작성자 : 장선희
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


public class SE_BOI_1092_SPHOTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bo_head_phot;

	public SE_BOI_1092_SPHOTLISTRecord(){}

	public void setBo_head_phot(String bo_head_phot){
		this.bo_head_phot = bo_head_phot;
	}

	public String getBo_head_phot(){
		return this.bo_head_phot;
	}
}

/* 작성시간 : Thu Apr 27 18:04:53 KST 2017 */