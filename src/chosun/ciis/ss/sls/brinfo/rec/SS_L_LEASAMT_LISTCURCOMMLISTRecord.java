/***************************************************************************************************
* ���ϸ� : SS_L_LEASAMT_LISTCURCOMMLISTRecord.java
* ��� : ����Info-����������-����� ���� Record
* �ۼ����� : 2004-04-24
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.ds.*;

/**
 * ����Info-����������-����� ���� Record
 */

public class SS_L_LEASAMT_LISTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String areacd;
	public String bocd;
	public String seq;
	public String bonm;
	public String bo_presinm;
	public int hdqtsplyamt;
	public int wholgurtamt;
	public int bondprsvamt;
	public String bondprsvkind;
	public String nowchrg;
	public String booffi_roomownr;
	public String bondprsvobjvolownr;
	public String leascntrdt;
	public String leasexprdt;
	public String deciddocuno;

	public SS_L_LEASAMT_LISTCURCOMMLISTRecord(){}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBo_presinm(String bo_presinm){
		this.bo_presinm = bo_presinm;
	}

	public void setHdqtsplyamt(int hdqtsplyamt){
		this.hdqtsplyamt = hdqtsplyamt;
	}

	public void setWholgurtamt(int wholgurtamt){
		this.wholgurtamt = wholgurtamt;
	}

	public void setBondprsvamt(int bondprsvamt){
		this.bondprsvamt = bondprsvamt;
	}

	public void setBondprsvkind(String bondprsvkind){
		this.bondprsvkind = bondprsvkind;
	}

	public void setNowchrg(String nowchrg){
		this.nowchrg = nowchrg;
	}

	public void setBooffi_roomownr(String booffi_roomownr){
		this.booffi_roomownr = booffi_roomownr;
	}

	public void setBondprsvobjvolownr(String bondprsvobjvolownr){
		this.bondprsvobjvolownr = bondprsvobjvolownr;
	}

	public void setLeascntrdt(String leascntrdt){
		this.leascntrdt = leascntrdt;
	}

	public void setLeasexprdt(String leasexprdt){
		this.leasexprdt = leasexprdt;
	}

	public void setDeciddocuno(String deciddocuno){
		this.deciddocuno = deciddocuno;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBo_presinm(){
		return this.bo_presinm;
	}

	public int getHdqtsplyamt(){
		return this.hdqtsplyamt;
	}

	public int getWholgurtamt(){
		return this.wholgurtamt;
	}

	public int getBondprsvamt(){
		return this.bondprsvamt;
	}

	public String getBondprsvkind(){
		return this.bondprsvkind;
	}

	public String getNowchrg(){
		return this.nowchrg;
	}

	public String getBooffi_roomownr(){
		return this.booffi_roomownr;
	}

	public String getBondprsvobjvolownr(){
		return this.bondprsvobjvolownr;
	}

	public String getLeascntrdt(){
		return this.leascntrdt;
	}

	public String getLeasexprdt(){
		return this.leasexprdt;
	}

	public String getDeciddocuno(){
		return this.deciddocuno;
	}
}

/* �ۼ��ð� : Fri May 21 17:39:46 KST 2004 */