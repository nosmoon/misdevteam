/***************************************************************************************************
* 파일명 : SS_L_JUSOCURCOMMLISTRecord.java
* 기능 : 관리자-우편번호-상세목록(판매국 우편번호)을 위한 Record
* 작성일자 : 2004-03-09
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 * 관리자-우편번호-상세목록(판매국 우편번호)을 위한 Record
 */

public class SS_L_JUSOCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String zip1;
	public String zip2;
	public String zip3;
	public String zip4;
	public String addr1;
	public String addr2;
	public String addr3;
	public String largedlvplac;
	public String isld;
	public String bgnn;
	public String endn;
	public String bocd;
	public String bonm;

	public SS_L_JUSOCURCOMMLISTRecord(){}

	public void setZip1(String zip1){
		this.zip1 = zip1;
	}

	public void setZip2(String zip2){
		this.zip2 = zip2;
	}

	public void setZip3(String zip3){
		this.zip3 = zip3;
	}

	public void setZip4(String zip4){
		this.zip4 = zip4;
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

	public void setLargedlvplac(String largedlvplac){
		this.largedlvplac = largedlvplac;
	}

	public void setIsld(String isld){
		this.isld = isld;
	}

	public void setBgnn(String bgnn){
		this.bgnn = bgnn;
	}

	public void setEndn(String endn){
		this.endn = endn;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public String getZip1(){
		return this.zip1;
	}

	public String getZip2(){
		return this.zip2;
	}

	public String getZip3(){
		return this.zip3;
	}

	public String getZip4(){
		return this.zip4;
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

	public String getLargedlvplac(){
		return this.largedlvplac;
	}

	public String getIsld(){
		return this.isld;
	}

	public String getBgnn(){
		return this.bgnn;
	}

	public String getEndn(){
		return this.endn;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}
}

/* 작성시간 : Wed Mar 10 15:28:17 KST 2004 */