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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_4031_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String irssgbnm;
	public String a_irbuseocd;
	public String a_iryscd;
	public String a_iryscym;
	public String a_iramt;
	public String t1_irbuseocd;
	public String t1_iryscd;
	public String t1_iryscym;
	public String t1_iramt;

	public MC_BUDG_4031_LCURLISTRecord(){}

	public void setIrssgbnm(String irssgbnm){
		this.irssgbnm = irssgbnm;
	}

	public void setA_irbuseocd(String a_irbuseocd){
		this.a_irbuseocd = a_irbuseocd;
	}

	public void setA_iryscd(String a_iryscd){
		this.a_iryscd = a_iryscd;
	}

	public void setA_iryscym(String a_iryscym){
		this.a_iryscym = a_iryscym;
	}

	public void setA_iramt(String a_iramt){
		this.a_iramt = a_iramt;
	}

	public void setT1_irbuseocd(String t1_irbuseocd){
		this.t1_irbuseocd = t1_irbuseocd;
	}

	public void setT1_iryscd(String t1_iryscd){
		this.t1_iryscd = t1_iryscd;
	}

	public void setT1_iryscym(String t1_iryscym){
		this.t1_iryscym = t1_iryscym;
	}

	public void setT1_iramt(String t1_iramt){
		this.t1_iramt = t1_iramt;
	}

	public String getIrssgbnm(){
		return this.irssgbnm;
	}

	public String getA_irbuseocd(){
		return this.a_irbuseocd;
	}

	public String getA_iryscd(){
		return this.a_iryscd;
	}

	public String getA_iryscym(){
		return this.a_iryscym;
	}

	public String getA_iramt(){
		return this.a_iramt;
	}

	public String getT1_irbuseocd(){
		return this.t1_irbuseocd;
	}

	public String getT1_iryscd(){
		return this.t1_iryscd;
	}

	public String getT1_iryscym(){
		return this.t1_iryscym;
	}

	public String getT1_iramt(){
		return this.t1_iramt;
	}
}

/* 작성시간 : Thu Apr 16 12:07:34 KST 2009 */