/***************************************************************************************************
* 파일명 : SE_SND_1120_LSENDLISTRecord.java
* 기능 : 판매 - 발송관리 - 노선등록
 * 작성일자 : 2009.02.03
 * 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.snd.rec;

import java.sql.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.ds.*;

/**
 * 
 */


public class SE_SND_1120_LSENDLISTRecord extends java.lang.Object implements java.io.Serializable{
	
	public String cmpy_cd;
	public String bo_cd;
	public String send_plac_seq;
	public String bo_cd_key;
	public String send_plac_seq_key;
	public String send_plac_nm;
	public String route_clsf;
	public String route_cd;
	public String send_rank;
	public String cnsg_seqo;
	public String area_cd;
	public String area_cd_key;
	public String area_nm;
	public String qty;
	public String send_mthd;
	
	public String getSend_mthd() {
		return send_mthd;
	}

	public void setSend_mthd(String send_mthd) {
		this.send_mthd = send_mthd;
	}

	public SE_SND_1120_LSENDLISTRecord(){}

	public String getArea_cd() {
		return area_cd;
	}

	public void setArea_cd(String area_cd) {
		this.area_cd = area_cd;
	}

	public String getArea_nm() {
		return area_nm;
	}

	public void setArea_nm(String area_nm) {
		this.area_nm = area_nm;
	}

	public String getBo_cd() {
		return bo_cd;
	}

	public void setBo_cd(String bo_cd) {
		this.bo_cd = bo_cd;
	}

	public String getCmpy_cd() {
		return cmpy_cd;
	}

	public void setCmpy_cd(String cmpy_cd) {
		this.cmpy_cd = cmpy_cd;
	}

	public String getCnsg_seqo() {
		return cnsg_seqo;
	}

	public void setCnsg_seqo(String cnsg_seqo) {
		this.cnsg_seqo = cnsg_seqo;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public String getRoute_cd() {
		return route_cd;
	}

	public void setRoute_cd(String route_cd) {
		this.route_cd = route_cd;
	}

	public String getRoute_clsf() {
		return route_clsf;
	}

	public void setRoute_clsf(String route_clsf) {
		this.route_clsf = route_clsf;
	}

	public String getSend_plac_nm() {
		return send_plac_nm;
	}

	public void setSend_plac_nm(String send_plac_nm) {
		this.send_plac_nm = send_plac_nm;
	}

	public String getSend_plac_seq() {
		return send_plac_seq;
	}

	public void setSend_plac_seq(String send_plac_seq) {
		this.send_plac_seq = send_plac_seq;
	}

	public String getSend_rank() {
		return send_rank;
	}

	public void setSend_rank(String send_rank) {
		this.send_rank = send_rank;
	}

	public String getBo_cd_key() {
		return bo_cd_key;
	}

	public void setBo_cd_key(String bo_cd_key) {
		this.bo_cd_key = bo_cd_key;
	}

	public String getSend_plac_seq_key() {
		return send_plac_seq_key;
	}

	public void setSend_plac_seq_key(String send_plac_seq_key) {
		this.send_plac_seq_key = send_plac_seq_key;
	}

	public String getArea_cd_key() {
		return area_cd_key;
	}

	public void setArea_cd_key(String area_cd_key) {
		this.area_cd_key = area_cd_key;
	}
	
}

/* 작성시간 : Tue Jan 20 19:27:48 KST 2009 */