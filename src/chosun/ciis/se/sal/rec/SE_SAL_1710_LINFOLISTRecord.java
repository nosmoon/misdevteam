/***************************************************************************************************
* ���ϸ� : SE_SAL_1710_LINFOLISTRecord.java
* ��� : �Ǹ� - ������� - ������� - ��꼭 ����
* �ۼ����� : 2009-04-17
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.sal.rec;

import java.sql.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.ds.*;

/**
 * 
 */


public class SE_SAL_1710_LINFOLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd			;
	public String cdnm			;
	public String min_clam_seq_1;
	public String max_clam_seq_1;
	public String cnt_1			;
	public String min_clam_seq_2;
	public String max_clam_seq_2;
	public String cnt_2			;

	public SE_SAL_1710_LINFOLISTRecord(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setMin_clam_seq_1(String min_clam_seq_1){
		this.min_clam_seq_1 = min_clam_seq_1;
	}

	public void setMax_clam_seq_1(String max_clam_seq_1){
		this.max_clam_seq_1 = max_clam_seq_1;
	}

	public void setCnt_1(String cnt_1){
		this.cnt_1 = cnt_1;
	}

	public void setMin_clam_seq_2(String min_clam_seq_2){
		this.min_clam_seq_2 = min_clam_seq_2;
	}

	public void setMax_clam_seq_2(String max_clam_seq_2){
		this.max_clam_seq_2 = max_clam_seq_2;
	}

	public void setCnt_2(String cnt_2){
		this.cnt_2 = cnt_2;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getMin_clam_seq_1(){
		return this.min_clam_seq_1;
	}

	public String getMax_clam_seq_1(){
		return this.max_clam_seq_1;
	}

	public String getCnt_1(){
		return this.cnt_1;
	}

	public String getMin_clam_seq_2(){
		return this.min_clam_seq_2;
	}

	public String getMax_clam_seq_2(){
		return this.max_clam_seq_2;
	}

	public String getCnt_2(){
		return this.cnt_2;
	}
}

/* �ۼ��ð� : Fri Apr 17 13:29:34 KST 2009 */