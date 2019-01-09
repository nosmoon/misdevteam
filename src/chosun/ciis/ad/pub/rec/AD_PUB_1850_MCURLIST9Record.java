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


package chosun.ciis.ad.pub.rec;

import java.sql.*;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.ds.*;

/**
 * 
 */


public class AD_PUB_1850_MCURLIST9Record extends java.lang.Object implements java.io.Serializable{

	public String sect_cd;

	public AD_PUB_1850_MCURLIST9Record(){}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}
}

/* 작성시간 : Fri Feb 10 13:59:03 KST 2012 */