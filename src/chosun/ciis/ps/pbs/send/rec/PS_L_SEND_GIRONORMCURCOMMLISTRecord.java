/***************************************************************************************************
* 파일명 : 
* 기능 :  발송-지로정상 발송처리
* 작성일자 : 2004-03-11
* 작성자 : 장수환
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.ds.*;

/**
 * 발송-지로정상발송 발송처리
 *
 */

public class PS_L_SEND_GIRONORMCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String medicd;
	public String termsubsno;
	public String agrmntseq;
	public String rdrnm;
	public String medinm;
	public String bonm;
	public String agrmnt_dt;
	public int agrmntamt;

	public PS_L_SEND_GIRONORMCURCOMMLISTRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setTermsubsno(String termsubsno){
		this.termsubsno = termsubsno;
	}

	public void setAgrmntseq(String agrmntseq){
		this.agrmntseq = agrmntseq;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setAgrmnt_dt(String agrmnt_dt){
		this.agrmnt_dt = agrmnt_dt;
	}

	public void setAgrmntamt(int agrmntamt){
		this.agrmntamt = agrmntamt;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getTermsubsno(){
		return this.termsubsno;
	}

	public String getAgrmntseq(){
		return this.agrmntseq;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getAgrmnt_dt(){
		return this.agrmnt_dt;
	}

	public int getAgrmntamt(){
		return this.agrmntamt;
	}
}

/* 작성시간 : Thu Mar 11 20:32:41 KST 2004 */