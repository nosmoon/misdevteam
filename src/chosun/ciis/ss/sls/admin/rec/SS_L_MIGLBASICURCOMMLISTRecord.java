/***************************************************************************************************
* 파일명 : SS_L_MIGLBASICURCOMMLISTRecord.java
* 기능 : 관리자-마일리지-지급기준-목록을 위한 Record
* 작성일자 : 2004-03-20
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 * 관리자-마일리지-지급기준-목록을 위한 Record
 */

public class SS_L_MIGLBASICURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy;
	public String medinm;
	public String payclsf;
	public String paybasi;
	public String pont;
	public String pontrate;
	public String hdqtallmratio;
	public String boallmratio;
	public String adjmexchrate;
	public String cmpycd;
	public String medicd;
	public String payclsfcd;
	public String paybasicd;

	public SS_L_MIGLBASICURCOMMLISTRecord(){}

	public void setCmpy(String cmpy){
		this.cmpy = cmpy;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setPayclsf(String payclsf){
		this.payclsf = payclsf;
	}

	public void setPaybasi(String paybasi){
		this.paybasi = paybasi;
	}

	public void setPont(String pont){
		this.pont = pont;
	}

	public void setPontrate(String pontrate){
		this.pontrate = pontrate;
	}

	public void setHdqtallmratio(String hdqtallmratio){
		this.hdqtallmratio = hdqtallmratio;
	}

	public void setBoallmratio(String boallmratio){
		this.boallmratio = boallmratio;
	}

	public void setAdjmexchrate(String adjmexchrate){
		this.adjmexchrate = adjmexchrate;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setPayclsfcd(String payclsfcd){
		this.payclsfcd = payclsfcd;
	}

	public void setPaybasicd(String paybasicd){
		this.paybasicd = paybasicd;
	}

	public String getCmpy(){
		return this.cmpy;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getPayclsf(){
		return this.payclsf;
	}

	public String getPaybasi(){
		return this.paybasi;
	}

	public String getPont(){
		return this.pont;
	}

	public String getPontrate(){
		return this.pontrate;
	}

	public String getHdqtallmratio(){
		return this.hdqtallmratio;
	}

	public String getBoallmratio(){
		return this.boallmratio;
	}

	public String getAdjmexchrate(){
		return this.adjmexchrate;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getPayclsfcd(){
		return this.payclsfcd;
	}

	public String getPaybasicd(){
		return this.paybasicd;
	}
}

/* 작성시간 : Sat Mar 20 21:44:48 KST 2004 */