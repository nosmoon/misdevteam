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


package chosun.ciis.mt.etcpc.rec;

import java.sql.*;
import chosun.ciis.mt.etcpc.dm.*;
import chosun.ciis.mt.etcpc.ds.*;

/**
 * 
 */


public class MT_ETCPC_1100_LCOMMCDCUR1Record extends java.lang.Object implements java.io.Serializable{

	public String modl_mang_no;
	public String modl_nm;
	public String modl_kind_a;
	public String modl_kind_nm;
	public String modl_kind;

	public MT_ETCPC_1100_LCOMMCDCUR1Record(){}

	public void setModl_mang_no(String modl_mang_no){
		this.modl_mang_no = modl_mang_no;
	}

	public void setModl_nm(String modl_nm){
		this.modl_nm = modl_nm;
	}

	public void setModl_kind_a(String modl_kind_a){
		this.modl_kind_a = modl_kind_a;
	}

	public void setModl_kind_nm(String modl_kind_nm){
		this.modl_kind_nm = modl_kind_nm;
	}

	public void setModl_kind(String modl_kind){
		this.modl_kind = modl_kind;
	}

	public String getModl_mang_no(){
		return this.modl_mang_no;
	}

	public String getModl_nm(){
		return this.modl_nm;
	}

	public String getModl_kind_a(){
		return this.modl_kind_a;
	}

	public String getModl_kind_nm(){
		return this.modl_kind_nm;
	}

	public String getModl_kind(){
		return this.modl_kind;
	}
}

/* 작성시간 : Thu Mar 12 08:55:48 KST 2009 */