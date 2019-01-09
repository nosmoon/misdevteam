/***************************************************************************************************
 * 파일명 : CO_L_NEWGUGUNCURCOMMLISTRecord.java_모바일용
 * 기능 : 공통-구군검색
 * 작성일자 : 2017-02-17
 * 작성자 : 장선희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/


package chosun.ciis.ss.sal.common.rec;

import java.sql.*;
import chosun.ciis.ss.sal.common.dm.*;
import chosun.ciis.ss.sal.common.ds.*;

/**
 *
 */


public class CO_L_NEWGUGUNCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cicdynm;

	public CO_L_NEWGUGUNCURCOMMLISTRecord(){}

	public void setCicdynm(String cicdynm){
		this.cicdynm = cicdynm;
	}

	public String getCicdynm(){
		return this.cicdynm;
	}
}