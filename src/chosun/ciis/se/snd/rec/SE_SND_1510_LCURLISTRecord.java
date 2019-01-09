/***************************************************************************************************
* 파일명 : SE_SND_1510_LCURLISTRecord.java
* 기능 : 판매 - 발송관리 - 공장별부수
* 작성일자 : 2009.02.03
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


public class SE_SND_1510_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String grid;
	
	public SE_SND_1510_LCURLISTRecord(){}

	public String getGrid() {
		return grid;
	}
	public void setGrid(String grid) {
		this.grid = grid;
	}
}

/* 작성시간 : Thu Jan 29 20:43:48 KST 2009 */