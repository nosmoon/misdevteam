/***************************************************************************************************
* 파일명 : .java
* 기능 : 입주아파트관리 조회
* 작성일자 : 2009-05-18
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 입주아파트관리 조회
 */

public class SS_L_EXTN_APTAPTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aptcd;
	public String aptnm;
	public String teamcd;
	public String dept_nm;
	public String partcd;
	public String part_nm;
	public String areacd;
	public String area_nm;
	public String bocd;
	public String bonm;
	public String chrgemp_no;
	public String addr1;
	public String addr2;
	public String addr3;
	public int tothoscnt;
	public String pyong;
	public String pyongothin;
	public int hoscnt;
	public String saledd;
	public String mvinplandd;
	public String constcmpynm;
	public String apttype;
	public String stat;
	public String statnm;
	public String remk;

	public SS_L_EXTN_APTAPTLISTRecord(){}

	public void setAptcd(String aptcd){
		this.aptcd = aptcd;
	}

	public void setAptnm(String aptnm){
		this.aptnm = aptnm;
	}

	public void setTeamcd(String teamcd){
		this.teamcd = teamcd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPartcd(String partcd){
		this.partcd = partcd;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setChrgemp_no(String chrgemp_no){
		this.chrgemp_no = chrgemp_no;
	}

	public void setAddr1(String addr1){
		this.addr1 = addr1;
	}

	public void setAddr2(String addr2){
		this.addr2 = addr2;
	}

	public void setAddr3(String addr3){
		this.addr3 = addr3;
	}

	public void setTothoscnt(int tothoscnt){
		this.tothoscnt = tothoscnt;
	}

	public void setPyong(String pyong){
		this.pyong = pyong;
	}

	public void setPyongothin(String pyongothin){
		this.pyongothin = pyongothin;
	}

	public void setHoscnt(int hoscnt){
		this.hoscnt = hoscnt;
	}

	public void setSaledd(String saledd){
		this.saledd = saledd;
	}

	public void setMvinplandd(String mvinplandd){
		this.mvinplandd = mvinplandd;
	}

	public void setConstcmpynm(String constcmpynm){
		this.constcmpynm = constcmpynm;
	}

	public void setApttype(String apttype){
		this.apttype = apttype;
	}

	public void setStat(String stat){
		this.stat = stat;
	}

	public void setStatnm(String statnm){
		this.statnm = statnm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getAptcd(){
		return this.aptcd;
	}

	public String getAptnm(){
		return this.aptnm;
	}

	public String getTeamcd(){
		return this.teamcd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPartcd(){
		return this.partcd;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getChrgemp_no(){
		return this.chrgemp_no;
	}

	public String getAddr1(){
		return this.addr1;
	}

	public String getAddr2(){
		return this.addr2;
	}

	public String getAddr3(){
		return this.addr3;
	}

	public int getTothoscnt(){
		return this.tothoscnt;
	}

	public String getPyong(){
		return this.pyong;
	}

	public String getPyongothin(){
		return this.pyongothin;
	}

	public int getHoscnt(){
		return this.hoscnt;
	}

	public String getSaledd(){
		return this.saledd;
	}

	public String getMvinplandd(){
		return this.mvinplandd;
	}

	public String getConstcmpynm(){
		return this.constcmpynm;
	}

	public String getApttype(){
		return this.apttype;
	}

	public String getStat(){
		return this.stat;
	}

	public String getStatnm(){
		return this.statnm;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Tue May 19 15:17:45 KST 2009 */