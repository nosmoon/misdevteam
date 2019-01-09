/***************************************************************************************************
* 파일명 : SS_L_FCT_FRFT_LISTCURCOMMLISTRecord.java
* 기능 : 지국경영-공정위위약금-목록을 위한 Record
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * 지국경영-공정위위약금-목록을 위한 Record
 */

public class SS_L_FCT_FRFT_LISTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String impndt;
	public String deptcd;
	public String areacd;
	public String bocd;
	public String bonm;
	public String viltresn;
	public String viltresnnm;
	public String rdrnm;
	public String delbocomnm;
	public int frftimpnamt;
	public int hdqtrcpmamt;
	public String hdqtrcpmdt;
	public int hdqtun_pymtamt;
	public int borcpmamt;
	public String borcpmdt;
	public int boun_pymtamt;
	public int resamt;

	public SS_L_FCT_FRFT_LISTCURCOMMLISTRecord(){}

	public void setImpndt(String impndt){
		this.impndt = impndt;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setViltresn(String viltresn){
		this.viltresn = viltresn;
	}

	public void setViltresnnm(String viltresnnm){
		this.viltresnnm = viltresnnm;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setDelbocomnm(String delbocomnm){
		this.delbocomnm = delbocomnm;
	}

	public void setFrftimpnamt(int frftimpnamt){
		this.frftimpnamt = frftimpnamt;
	}

	public void setHdqtrcpmamt(int hdqtrcpmamt){
		this.hdqtrcpmamt = hdqtrcpmamt;
	}

	public void setHdqtrcpmdt(String hdqtrcpmdt){
		this.hdqtrcpmdt = hdqtrcpmdt;
	}

	public void setHdqtun_pymtamt(int hdqtun_pymtamt){
		this.hdqtun_pymtamt = hdqtun_pymtamt;
	}

	public void setBorcpmamt(int borcpmamt){
		this.borcpmamt = borcpmamt;
	}

	public void setBorcpmdt(String borcpmdt){
		this.borcpmdt = borcpmdt;
	}

	public void setBoun_pymtamt(int boun_pymtamt){
		this.boun_pymtamt = boun_pymtamt;
	}

	public void setResamt(int resamt){
		this.resamt = resamt;
	}

	public String getImpndt(){
		return this.impndt;
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

	public String getBonm(){
		return this.bonm;
	}

	public String getViltresn(){
		return this.viltresn;
	}

	public String getViltresnnm(){
		return this.viltresnnm;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getDelbocomnm(){
		return this.delbocomnm;
	}

	public int getFrftimpnamt(){
		return this.frftimpnamt;
	}

	public int getHdqtrcpmamt(){
		return this.hdqtrcpmamt;
	}

	public String getHdqtrcpmdt(){
		return this.hdqtrcpmdt;
	}

	public int getHdqtun_pymtamt(){
		return this.hdqtun_pymtamt;
	}

	public int getBorcpmamt(){
		return this.borcpmamt;
	}

	public String getBorcpmdt(){
		return this.borcpmdt;
	}

	public int getBoun_pymtamt(){
		return this.boun_pymtamt;
	}

	public int getResamt(){
		return this.resamt;
	}
}

/* 작성시간 : Sat May 22 17:02:29 KST 2004 */