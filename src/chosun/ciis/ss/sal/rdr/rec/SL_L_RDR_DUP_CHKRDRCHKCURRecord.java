/***************************************************************************************************
* ���ϸ� : SL_L_RDR_DUP_CHKRDRCHKCURRecord.java
* ��� : ������������(���������˾�-�����ȸ)
* �ۼ����� : 2004-04-01
* �ۼ��� : �迵��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.ds.*;

/**
 * ������������(���������˾�-�����ȸ)
 *
 */

public class SL_L_RDR_DUP_CHKRDRCHKCURRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String rdrnm;
	public String prn;
	public String email;
	public String dlvaddr;
	public String rdrtel_no;
	public String rdrptph_no;

	public SL_L_RDR_DUP_CHKRDRCHKCURRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setRdrtel_no(String rdrtel_no){
		this.rdrtel_no = rdrtel_no;
	}

	public void setRdrptph_no(String rdrptph_no){
		this.rdrptph_no = rdrptph_no;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getEmail(){
		return this.email;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getRdrtel_no(){
		return this.rdrtel_no;
	}

	public String getRdrptph_no(){
		return this.rdrptph_no;
	}
}

/* �ۼ��ð� : Wed Apr 07 15:04:54 KST 2004 */