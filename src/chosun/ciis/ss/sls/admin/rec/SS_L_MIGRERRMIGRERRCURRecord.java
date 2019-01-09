/***************************************************************************************************
* 파일명	: SS_L_MIGRERRMIGRERRCURRecord.java
* 기능		: 관리자 - 마이그레이션 - 검증 - 오류독자리스트
* 작성일자	: 2004-06-13
* 작성자	: 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	:
* 수정자	:
* 수정일자	:
* 백업		: 
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 * 관리자 - 마이그레이션 - 검증 - 오류독자리스트
 *
 */


public class SS_L_MIGRERRMIGRERRCURRecord extends java.lang.Object implements java.io.Serializable{

	public String dd_no;
	public String dd_bno;
	public String dd_code;
	public String rdr_no;
	public String sinmoon;
	public String oyuga;
	public String ogudok;
	public String osgbang;
	public String cfreeyn;
	public String cyuga;
	public String csgbang;
	public String ercode;
	public String ername;

	public SS_L_MIGRERRMIGRERRCURRecord(){}

	public void setDd_no(String dd_no){
		this.dd_no = dd_no;
	}

	public void setDd_bno(String dd_bno){
		this.dd_bno = dd_bno;
	}

	public void setDd_code(String dd_code){
		this.dd_code = dd_code;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setSinmoon(String sinmoon){
		this.sinmoon = sinmoon;
	}

	public void setOyuga(String oyuga){
		this.oyuga = oyuga;
	}

	public void setOgudok(String ogudok){
		this.ogudok = ogudok;
	}

	public void setOsgbang(String osgbang){
		this.osgbang = osgbang;
	}

	public void setCfreeyn(String cfreeyn){
		this.cfreeyn = cfreeyn;
	}

	public void setCyuga(String cyuga){
		this.cyuga = cyuga;
	}

	public void setCsgbang(String csgbang){
		this.csgbang = csgbang;
	}

	public void setErcode(String ercode){
		this.ercode = ercode;
	}

	public void setErname(String ername){
		this.ername = ername;
	}

	public String getDd_no(){
		return this.dd_no;
	}

	public String getDd_bno(){
		return this.dd_bno;
	}

	public String getDd_code(){
		return this.dd_code;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getSinmoon(){
		return this.sinmoon;
	}

	public String getOyuga(){
		return this.oyuga;
	}

	public String getOgudok(){
		return this.ogudok;
	}

	public String getOsgbang(){
		return this.osgbang;
	}

	public String getCfreeyn(){
		return this.cfreeyn;
	}

	public String getCyuga(){
		return this.cyuga;
	}

	public String getCsgbang(){
		return this.csgbang;
	}

	public String getErcode(){
		return this.ercode;
	}

	public String getErname(){
		return this.ername;
	}
}

/* 작성시간 : Sun Jun 13 23:42:55 KST 2004 */