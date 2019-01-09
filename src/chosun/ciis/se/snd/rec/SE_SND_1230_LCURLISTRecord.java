/***************************************************************************************************
* 파일명 : SE_SND_1230_LCURLISTRecord.java
* 기능 : 판매 - 발송관리 - 노선구분등록
* 작성일자 : 2009.05.14
* 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.snd.rec;

import java.sql.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.ds.*;

/**
 * 
 */


public class SE_SND_1230_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd	;
	public String cdnm	;

	public SE_SND_1230_LCURLISTRecord(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}
}

/* 작성시간 : Thu May 14 09:57:00 KST 2009 */