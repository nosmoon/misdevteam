/***************************************************************************************************
* ���ϸ� : SS_L_PROMSTAF_CYEXTN.java
* ��� :   Ȯ����Ȳ-���̹�Ȯ��-���-�����ȸ
* �ۼ����� : 2004-10-13
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* ��������	: 
* ������	: 
* ��������	:
* ���		: 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * Ȯ����Ȳ-���̹�Ȯ��-���-�����ȸ
 *
 */


public class SS_L_PROMSTAF_CYEXTNCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String stafclsfcd;
	public String stafno;
	public String stafnm;
	public String cnvsstafno;
	public String cnvsstafnm;
	public String in_cmpydt;
	public String ptph_no1;
	public String ptph_no2;
	public String ptph_no3;
	public String email;

	public SS_L_PROMSTAF_CYEXTNCURCOMMLISTRecord(){}

	public void setStafclsfcd(String stafclsfcd){
		this.stafclsfcd = stafclsfcd;
	}

	public void setStafno(String stafno){
		this.stafno = stafno;
	}

	public void setStafnm(String stafnm){
		this.stafnm = stafnm;
	}

	public void setCnvsstafno(String cnvsstafno){
		this.cnvsstafno = cnvsstafno;
	}

	public void setCnvsstafnm(String cnvsstafnm){
		this.cnvsstafnm = cnvsstafnm;
	}

	public void setIn_cmpydt(String in_cmpydt){
		this.in_cmpydt = in_cmpydt;
	}

	public void setPtph_no1(String ptph_no1){
		this.ptph_no1 = ptph_no1;
	}

	public void setPtph_no2(String ptph_no2){
		this.ptph_no2 = ptph_no2;
	}

	public void setPtph_no3(String ptph_no3){
		this.ptph_no3 = ptph_no3;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getStafclsfcd(){
		return this.stafclsfcd;
	}

	public String getStafno(){
		return this.stafno;
	}

	public String getStafnm(){
		return this.stafnm;
	}

	public String getCnvsstafno(){
		return this.cnvsstafno;
	}

	public String getCnvsstafnm(){
		return this.cnvsstafnm;
	}

	public String getIn_cmpydt(){
		return this.in_cmpydt;
	}

	public String getPtph_no1(){
		return this.ptph_no1;
	}

	public String getPtph_no2(){
		return this.ptph_no2;
	}

	public String getPtph_no3(){
		return this.ptph_no3;
	}

	public String getEmail(){
		return this.email;
	}
}

/* �ۼ��ð� : Tue Oct 12 21:24:45 KST 2004 */