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


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 * 
 */


public class HD_EVLU_2850_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evlu_dp_nm;
	public String evlu_dp_scor;

	public HD_EVLU_2850_LCURLISTRecord(){}

	public void setEvlu_dp_nm(String evlu_dp_nm){
		this.evlu_dp_nm = evlu_dp_nm;
	}

	public void setEvlu_dp_scor(String evlu_dp_scor){
		this.evlu_dp_scor = evlu_dp_scor;
	}

	public String getEvlu_dp_nm(){
		return this.evlu_dp_nm;
	}

	public String getEvlu_dp_scor(){
		return this.evlu_dp_scor;
	}
}

/* 작성시간 : Wed Jul 20 15:05:32 KST 2016 */