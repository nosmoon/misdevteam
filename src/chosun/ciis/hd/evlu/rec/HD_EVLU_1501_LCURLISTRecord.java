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

public class HD_EVLU_1501_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evlu_part_nm;
	public String evlu_part_cd;

	public HD_EVLU_1501_LCURLISTRecord(){}

	public void setEvlu_part_nm(String evlu_part_nm){
		this.evlu_part_nm = evlu_part_nm;
	}

	public void setEvlu_part_cd(String evlu_part_cd){
		this.evlu_part_cd = evlu_part_cd;
	}

	public String getEvlu_part_nm(){
		return this.evlu_part_nm;
	}

	public String getEvlu_part_cd(){
		return this.evlu_part_cd;
	}
}

/* 작성시간 : Sat May 16 17:38:47 KST 2009 */