/***************************************************************************************************
* 파일명   : CO_S_TASOM_RDRID.java
* 기능     : 독자-모닝플러스 회원 리스트
* 작성일자 : 2005-09-15
* 작성자   : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.reader.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.ds.*;

/**
 *  독자-모닝플러스 회원 리스트
 *
 **/

public class CO_S_TASOM_RDRIDTASOM_RDRIDLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String memb_nm_korn;
	public String onlmembid;
	public String tel;
	public String address;

	public CO_S_TASOM_RDRIDTASOM_RDRIDLISTRecord(){}

	public void setMemb_nm_korn(String memb_nm_korn){
		this.memb_nm_korn = memb_nm_korn;
	}

	public void setOnlmembid(String onlmembid){
		this.onlmembid = onlmembid;
	}

	public void setTel(String tel){
		this.tel = tel;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getMemb_nm_korn(){
		return this.memb_nm_korn;
	}

	public String getOnlmembid(){
		return this.onlmembid;
	}

	public String getTel(){
		return this.tel;
	}

	public String getAddress(){
		return this.address;
	}
}

/* 작성시간 : Thu Sep 15 11:25:29 KST 2005 */