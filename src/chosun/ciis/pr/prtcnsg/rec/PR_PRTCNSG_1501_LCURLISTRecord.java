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


package chosun.ciis.pr.prtcnsg.rec;

import java.sql.*;
import chosun.ciis.pr.prtcnsg.dm.*;
import chosun.ciis.pr.prtcnsg.ds.*;

/**
 * 
 */


public class PR_PRTCNSG_1501_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String seq_nm;
	public String prt_fee_35;
	public String prt_fee_65;
	public String prt_fee_70;
	public String prt_fee_75;
	public String prt_fee_73;
	public String prt_fee_76;
	public String prt_fee_77;
	public String prt_fee_99;

	public PR_PRTCNSG_1501_LCURLISTRecord(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSeq_nm(String seq_nm){
		this.seq_nm = seq_nm;
	}

	public void setPrt_fee_35(String prt_fee_35){
		this.prt_fee_35 = prt_fee_35;
	}

	public void setPrt_fee_65(String prt_fee_65){
		this.prt_fee_65 = prt_fee_65;
	}

	public void setPrt_fee_70(String prt_fee_70){
		this.prt_fee_70 = prt_fee_70;
	}

	public void setPrt_fee_75(String prt_fee_75){
		this.prt_fee_75 = prt_fee_75;
	}

	public void setPrt_fee_73(String prt_fee_73){
		this.prt_fee_73 = prt_fee_73;
	}

	public void setPrt_fee_76(String prt_fee_76){
		this.prt_fee_76 = prt_fee_76;
	}
	
	public void setPrt_fee_77(String prt_fee_77){
		this.prt_fee_77 = prt_fee_77;
	}

	public void setPrt_fee_99(String prt_fee_99){
		this.prt_fee_99 = prt_fee_99;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSeq_nm(){
		return this.seq_nm;
	}

	public String getPrt_fee_35(){
		return this.prt_fee_35;
	}

	public String getPrt_fee_65(){
		return this.prt_fee_65;
	}

	public String getPrt_fee_70(){
		return this.prt_fee_70;
	}

	public String getPrt_fee_75(){
		return this.prt_fee_75;
	}

	public String getPrt_fee_73(){
		return this.prt_fee_73;
	}

	public String getPrt_fee_76(){
		return this.prt_fee_76;
	}

	public String getPrt_fee_77(){
		return this.prt_fee_77;
	}

	public String getPrt_fee_99(){
		return this.prt_fee_99;
	}
}

/* 작성시간 : Tue Apr 01 09:39:53 KST 2014 */