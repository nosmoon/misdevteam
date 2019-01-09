/***************************************************************************************************
* 파일명 : PS_L_SEND_BNSBK_DTL.java
* 기능 :   발송-보너스북발송확인처리  상세조회화면
* 작성일자 : 2004-02-28
* 작성자 : 김건호 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :   
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.ds.*;

/**
 * 발송-보너스북발송 확인처리  상세조회화면
 *
 */ 

public class PS_L_SEND_BNSBK_DTLCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bns_booknm;
	public int dirsend;
	public int postsend;
	public int zipsend;
	public int offsend;
	public int unsend;
	public int homesend;
	public int sumsend;

	public PS_L_SEND_BNSBK_DTLCURCOMMLISTRecord(){}

	public void setBns_booknm(String bns_booknm){
		this.bns_booknm = bns_booknm;
	}

	public void setDirsend(int dirsend){
		this.dirsend = dirsend;
	}

	public void setPostsend(int postsend){
		this.postsend = postsend;
	}

	public void setZipsend(int zipsend){
		this.zipsend = zipsend;
	}

	public void setOffsend(int offsend){
		this.offsend = offsend;
	}

	public void setUnsend(int unsend){
		this.unsend = unsend;
	}

	public void setHomesend(int homesend){
		this.homesend = homesend;
	}

	public void setSumsend(int sumsend){
		this.sumsend = sumsend;
	}

	public String getBns_booknm(){
		return this.bns_booknm;
	}

	public int getDirsend(){
		return this.dirsend;
	}

	public int getPostsend(){
		return this.postsend;
	}

	public int getZipsend(){
		return this.zipsend;
	}

	public int getOffsend(){
		return this.offsend;
	}

	public int getUnsend(){
		return this.unsend;
	}

	public int getHomesend(){
		return this.homesend;
	}

	public int getSumsend(){
		return this.sumsend;
	}
}

/* 작성시간 : Wed Sep 28 10:55:25 KST 2005 */