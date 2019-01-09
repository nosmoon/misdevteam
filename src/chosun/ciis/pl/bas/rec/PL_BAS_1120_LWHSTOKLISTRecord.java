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


package chosun.ciis.pl.bas.rec;

import java.sql.*;
import chosun.ciis.pl.bas.dm.*;
import chosun.ciis.pl.bas.ds.*;

/**
 * 
 */


public class PL_BAS_1120_LWHSTOKLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String wh_nm;
	public String wh_stok_qty;

	public PL_BAS_1120_LWHSTOKLISTRecord(){}

	public void setWh_nm(String wh_nm){
		this.wh_nm = wh_nm;
	}

	public void setWh_stok_qty(String wh_stok_qty){
		this.wh_stok_qty = wh_stok_qty;
	}

	public String getWh_nm(){
		return this.wh_nm;
	}

	public String getWh_stok_qty(){
		return this.wh_stok_qty;
	}
}

/* 작성시간 : Mon Mar 16 21:48:55 KST 2009 */