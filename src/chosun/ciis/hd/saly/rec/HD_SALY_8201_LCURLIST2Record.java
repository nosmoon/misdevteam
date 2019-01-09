/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_8201_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String sum_welf_pens_amt;
	public String sum_prsn_pens_amt;
	public String subtotal_amt;
	public String sum_prsn_sppt_amt;
	public String sum_sepr_pens_amt;

	public HD_SALY_8201_LCURLIST2Record(){}

	public void setSum_welf_pens_amt(String sum_welf_pens_amt){
		this.sum_welf_pens_amt = sum_welf_pens_amt;
	}

	public void setSum_prsn_pens_amt(String sum_prsn_pens_amt){
		this.sum_prsn_pens_amt = sum_prsn_pens_amt;
	}

	public void setSubtotal_amt(String subtotal_amt){
		this.subtotal_amt = subtotal_amt;
	}

	public void setSum_prsn_sppt_amt(String sum_prsn_sppt_amt){
		this.sum_prsn_sppt_amt = sum_prsn_sppt_amt;
	}

	public void setSum_sepr_pens_amt(String sum_sepr_pens_amt){
		this.sum_sepr_pens_amt = sum_sepr_pens_amt;
	}

	public String getSum_welf_pens_amt(){
		return this.sum_welf_pens_amt;
	}

	public String getSum_prsn_pens_amt(){
		return this.sum_prsn_pens_amt;
	}

	public String getSubtotal_amt(){
		return this.subtotal_amt;
	}

	public String getSum_prsn_sppt_amt(){
		return this.sum_prsn_sppt_amt;
	}

	public String getSum_sepr_pens_amt(){
		return this.sum_sepr_pens_amt;
	}
}

/* 작성시간 : Thu Sep 07 11:32:29 KST 2017 */