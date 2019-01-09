/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 
 */


public class SL_L_EXTNCLOS_JM_REPORTCURSUMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String deptnm;
	public String partcd;
	public String partnm;
	public String bocd;
	public String bonm;
	public int qtya1;
	public int qtya2;
	public int qtya3;
	public int qtyasum;
	public int qtyb1;
	public int qtyb2;
	public int qtyb3;
	public int qtybsum;
	public int qtyc1;
	public int qtyc2;
	public int qtyc3;
	public int qtycsum;

	public SL_L_EXTNCLOS_JM_REPORTCURSUMLISTRecord(){}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setPartcd(String partcd){
		this.partcd = partcd;
	}

	public void setPartnm(String partnm){
		this.partnm = partnm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setQtya1(int qtya1){
		this.qtya1 = qtya1;
	}

	public void setQtya2(int qtya2){
		this.qtya2 = qtya2;
	}

	public void setQtya3(int qtya3){
		this.qtya3 = qtya3;
	}

	public void setQtyasum(int qtyasum){
		this.qtyasum = qtyasum;
	}

	public void setQtyb1(int qtyb1){
		this.qtyb1 = qtyb1;
	}

	public void setQtyb2(int qtyb2){
		this.qtyb2 = qtyb2;
	}

	public void setQtyb3(int qtyb3){
		this.qtyb3 = qtyb3;
	}

	public void setQtybsum(int qtybsum){
		this.qtybsum = qtybsum;
	}

	public void setQtyc1(int qtyc1){
		this.qtyc1 = qtyc1;
	}

	public void setQtyc2(int qtyc2){
		this.qtyc2 = qtyc2;
	}

	public void setQtyc3(int qtyc3){
		this.qtyc3 = qtyc3;
	}

	public void setQtycsum(int qtycsum){
		this.qtycsum = qtycsum;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getPartcd(){
		return this.partcd;
	}

	public String getPartnm(){
		return this.partnm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public int getQtya1(){
		return this.qtya1;
	}

	public int getQtya2(){
		return this.qtya2;
	}

	public int getQtya3(){
		return this.qtya3;
	}

	public int getQtyasum(){
		return this.qtyasum;
	}

	public int getQtyb1(){
		return this.qtyb1;
	}

	public int getQtyb2(){
		return this.qtyb2;
	}

	public int getQtyb3(){
		return this.qtyb3;
	}

	public int getQtybsum(){
		return this.qtybsum;
	}

	public int getQtyc1(){
		return this.qtyc1;
	}

	public int getQtyc2(){
		return this.qtyc2;
	}

	public int getQtyc3(){
		return this.qtyc3;
	}

	public int getQtycsum(){
		return this.qtycsum;
	}
}

/* 작성시간 : Sun Mar 01 15:20:27 KST 2015 */