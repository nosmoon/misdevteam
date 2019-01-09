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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_2540_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String out_cbjunamt;
	public String out_dbjunamt;
	public String out_cbhapamt;
	public String out_dbhapamt;
	public String out_cbjanamt;
	public String out_dbjanamt;
	public String out_accdjagb;

	public FC_ACCT_2540_LCURLIST2Record(){}

	public void setOut_cbjunamt(String out_cbjunamt){
		this.out_cbjunamt = out_cbjunamt;
	}

	public void setOut_dbjunamt(String out_dbjunamt){
		this.out_dbjunamt = out_dbjunamt;
	}

	public void setOut_cbhapamt(String out_cbhapamt){
		this.out_cbhapamt = out_cbhapamt;
	}

	public void setOut_dbhapamt(String out_dbhapamt){
		this.out_dbhapamt = out_dbhapamt;
	}

	public void setOut_cbjanamt(String out_cbjanamt){
		this.out_cbjanamt = out_cbjanamt;
	}

	public void setOut_dbjanamt(String out_dbjanamt){
		this.out_dbjanamt = out_dbjanamt;
	}

	public void setOut_accdjagb(String out_accdjagb){
		this.out_accdjagb = out_accdjagb;
	}

	public String getOut_cbjunamt(){
		return this.out_cbjunamt;
	}

	public String getOut_dbjunamt(){
		return this.out_dbjunamt;
	}

	public String getOut_cbhapamt(){
		return this.out_cbhapamt;
	}

	public String getOut_dbhapamt(){
		return this.out_dbhapamt;
	}

	public String getOut_cbjanamt(){
		return this.out_cbjanamt;
	}

	public String getOut_dbjanamt(){
		return this.out_dbjanamt;
	}

	public String getOut_accdjagb(){
		return this.out_accdjagb;
	}
}

/* 작성시간 : Fri May 29 18:02:12 KST 2009 */