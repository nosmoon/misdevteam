/***************************************************************************************************
* 파일명 : 
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


package chosun.ciis.pl.lst.rec;

import java.sql.*;
import chosun.ciis.pl.lst.dm.*;
import chosun.ciis.pl.lst.ds.*;

/**
 * 
 */


public class PL_LST_1000_MMEDI_CD_MAGZCURRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;

	public PL_LST_1000_MMEDI_CD_MAGZCURRecord(){}

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

/* 작성시간 : Wed Jul 15 17:43:43 KST 2009 */