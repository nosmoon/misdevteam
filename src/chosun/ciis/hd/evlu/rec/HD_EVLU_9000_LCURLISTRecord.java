/***************************************************************************************************
* 파일명		: 
* 기능		:
* 작성일자	: 
* 작성자		: 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	: 
* 수정자		:   
* 수정일자	: 
* 백업		: 
***************************************************************************************************/


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 *
 */

public class HD_EVLU_9000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evlu_cd;
	public String evlu_cdnm;

	public HD_EVLU_9000_LCURLISTRecord(){}

	public void setEvlu_cd(String evlu_cd){
		this.evlu_cd = evlu_cd;
	}

	public void setEvlu_cdnm(String evlu_cdnm){
		this.evlu_cdnm = evlu_cdnm;
	}

	public String getEvlu_cd(){
		return this.evlu_cd;
	}

	public String getEvlu_cdnm(){
		return this.evlu_cdnm;
	}
}

/* 작성시간 : Fri May 01 16:16:15 KST 2009 */