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


package chosun.ciis.hd.card.rec;

import java.sql.*;
import chosun.ciis.hd.card.dm.*;
import chosun.ciis.hd.card.ds.*;

/**
 * 
 */


public class HD_CARD_1101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public byte[] phot  = null; //byte[]
	public String nm_korn;
	public String posi_nm;
	public String tel_no;
	public String ptph_no;
	public String email_id;
	public String encodeimage;

	public HD_CARD_1101_LCURLISTRecord(){}

	
	public void setEncodeimage(String aImage){
		this.encodeimage = aImage;
	}
	
	public void setPhot(byte[] phot){
		this.phot = phot;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public void setEmail_id(String email_id){
		this.email_id = email_id;
	}

	public String getEncodeimage(){
		return this.encodeimage;
	}
	
	
	public byte[] getPhot(){
		return this.phot;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}

	public String getEmail_id(){
		return this.email_id;
	}
}

/* 작성시간 : Mon Jun 08 16:29:00 KST 2009 */