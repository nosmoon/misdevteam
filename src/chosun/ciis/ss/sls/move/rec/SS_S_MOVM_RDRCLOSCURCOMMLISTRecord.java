/***************************************************************************************************
* 파일명 : SS_S_MOVM_RDRCLOSCURCOMMLISTRecord.java
* 기능 : 이사독자-마감-상세 이사독자 매체목록을 위한 Record
* 작성일자 : 2004-01-07
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.move.rec;

import java.sql.*;
import chosun.ciis.ss.sls.move.dm.*;
import chosun.ciis.ss.sls.move.ds.*;

/**
 * 이사독자-마감-상세 이사독자 매체목록을 위한 Record
 */

public class SS_S_MOVM_RDRCLOSCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medicd;
	public String medicdnm;
	public int alonamt;
	public String qtyaplydt;
	public int basivalqty;

	public SS_S_MOVM_RDRCLOSCURCOMMLISTRecord(){}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedicdnm(String medicdnm){
		this.medicdnm = medicdnm;
	}

	public void setAlonamt(int alonamt){
		this.alonamt = alonamt;
	}

	public void setQtyaplydt(String qtyaplydt){
		this.qtyaplydt = qtyaplydt;
	}

	public void setBasivalqty(int basivalqty){
		this.basivalqty = basivalqty;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedicdnm(){
		return this.medicdnm;
	}

	public int getAlonamt(){
		return this.alonamt;
	}

	public String getQtyaplydt(){
		return this.qtyaplydt;
	}

	public int getBasivalqty(){
		return this.basivalqty;
	}
}

/* 작성시간 : Thu Jan 08 20:25:03 KST 2004 */