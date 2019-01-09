/***************************************************************************************************
* 파일명 : SS_L_OTHRPT_INITOTHRPTLISTRecord.java
* 기능 : 정보공유-일지및보고서-타사동향보고-초기화면을 위한 Record
* 작성일자 : 2004-04-24
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
 * 정보공유-일지및보고서-타사동향보고-초기화면을 위한 Record
 */


public class SS_L_OTHRPT_INITOTHRPTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public int seq;
	public String makedt;
	public String makepersid;
	public String makepersnm;
	public int brwscnt;
	public int dwloadcnt;
	public String deptcd;
	public String deptnm;
	public String filenm;
	public String filesize;

	public SS_L_OTHRPT_INITOTHRPTLISTRecord(){}

	public void setSeq(int seq){
		this.seq = seq;
	}

	public void setMakedt(String makedt){
		this.makedt = makedt;
	}

	public void setMakepersid(String makepersid){
		this.makepersid = makepersid;
	}

	public void setMakepersnm(String makepersnm){
		this.makepersnm = makepersnm;
	}

	public void setBrwscnt(int brwscnt){
		this.brwscnt = brwscnt;
	}

	public void setDwloadcnt(int dwloadcnt){
		this.dwloadcnt = dwloadcnt;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setFilenm(String filenm){
		this.filenm = filenm;
	}

	public void setFilesize(String filesize){
		this.filesize = filesize;
	}

	public int getSeq(){
		return this.seq;
	}

	public String getMakedt(){
		return this.makedt;
	}

	public String getMakepersid(){
		return this.makepersid;
	}

	public String getMakepersnm(){
		return this.makepersnm;
	}

	public int getBrwscnt(){
		return this.brwscnt;
	}

	public int getDwloadcnt(){
		return this.dwloadcnt;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getFilenm(){
		return this.filenm;
	}

	public String getFilesize(){
		return this.filesize;
	}
}

/* 작성시간 : Fri Jun 11 20:16:17 KST 2004 */