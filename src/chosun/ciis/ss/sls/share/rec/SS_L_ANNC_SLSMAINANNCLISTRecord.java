/***************************************************************************************************
* 파일명 : SS_L_ANNC_SLSMAINANNCLISTRecord.java
* 기능 : 정보공유-실시간 판매국공지-목록을 위한 Record
* 작성일자 : 2004-07-20
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.share.rec;

import java.sql.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.ds.*;

/**
 * 정보공유-실시간 판매국공지-목록을 위한 Record
 */


public class SS_L_ANNC_SLSMAINANNCLISTRecord extends java.lang.Object implements java.io.Serializable{

	public int seq;
	public String makepersid;
	public String makepersnm;
	public String annctitl;
	public String annccont;
	public String anncbgntm_date;
	public String anncbgntm_time;
	public String anncendtm_date;
	public String anncendtm_time;

	public SS_L_ANNC_SLSMAINANNCLISTRecord(){}

	public void setSeq(int seq){
		this.seq = seq;
	}

	public void setMakepersid(String makepersid){
		this.makepersid = makepersid;
	}

	public void setMakepersnm(String makepersnm){
		this.makepersnm = makepersnm;
	}

	public void setAnnctitl(String annctitl){
		this.annctitl = annctitl;
	}

	public void setAnnccont(String annccont){
		this.annccont = annccont;
	}

	public void setAnncbgntm_date(String anncbgntm_date){
		this.anncbgntm_date = anncbgntm_date;
	}

	public void setAnncbgntm_time(String anncbgntm_time){
		this.anncbgntm_time = anncbgntm_time;
	}

	public void setAnncendtm_date(String anncendtm_date){
		this.anncendtm_date = anncendtm_date;
	}

	public void setAnncendtm_time(String anncendtm_time){
		this.anncendtm_time = anncendtm_time;
	}

	public int getSeq(){
		return this.seq;
	}

	public String getMakepersid(){
		return this.makepersid;
	}

	public String getMakepersnm(){
		return this.makepersnm;
	}

	public String getAnnctitl(){
		return this.annctitl;
	}

	public String getAnnccont(){
		return this.annccont;
	}

	public String getAnncbgntm_date(){
		return this.anncbgntm_date;
	}

	public String getAnncbgntm_time(){
		return this.anncbgntm_time;
	}

	public String getAnncendtm_date(){
		return this.anncendtm_date;
	}

	public String getAnncendtm_time(){
		return this.anncendtm_time;
	}
}

/* 작성시간 : Tue Jul 20 19:34:37 KST 2004 */