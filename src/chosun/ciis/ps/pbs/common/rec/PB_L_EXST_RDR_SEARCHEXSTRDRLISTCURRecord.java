/***************************************************************************************************
 * ���ϸ�   : PB_L_EXST_RDR_SEARCHEXSTRDRLISTCURRecord.java
 * ���     : ����-���� �������� �˻�
 * �ۼ����� : 2004-02-16
 * �ۼ���   : ����
 **************************************************************************************************/
 /**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 **************************************************************************************************/


package chosun.ciis.ps.pbs.common.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.common.dm.*;
import chosun.ciis.ps.pbs.common.ds.*;

/**
 * ����-���� �������� �˻�
 */

public class PB_L_EXST_RDR_SEARCHEXSTRDRLISTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String rdrnm;
	public String prn;
	public String email;
	public String dlvaddr;
	public String rdrtel_no;
	public String rdrptph_no;
	public int rnum;

	public PB_L_EXST_RDR_SEARCHEXSTRDRLISTCURRecord(){}

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

	public void setRnum(int rnum){
		this.rnum = rnum;
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

	public int getRnum(){
		return this.rnum;
	}
}

/* �ۼ��ð� : Mon Feb 16 16:28:41 KST 2004 */