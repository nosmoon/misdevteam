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


package chosun.ciis.mt.prnpap.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.prnpap.dm.*;
import chosun.ciis.mt.prnpap.rec.*;

/**
 * 
 */


public class MT_PRNPAP_3406_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String a_simbong_cnt;
	public String b_simbong_cnt;
	public String c_simbong_cnt;
	public String a_paji_wgt;
	public String b_paji_wgt;
	public String c_paji_wgt;
	public String pj5_wgt;

	public MT_PRNPAP_3406_LDataSet(){}
	public MT_PRNPAP_3406_LDataSet(String errcode, String errmsg, String a_simbong_cnt, String b_simbong_cnt, String c_simbong_cnt, String a_paji_wgt, String b_paji_wgt, String c_paji_wgt, String pj5_wgt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.a_simbong_cnt = a_simbong_cnt;
		this.b_simbong_cnt = b_simbong_cnt;
		this.c_simbong_cnt = c_simbong_cnt;
		this.a_paji_wgt = a_paji_wgt;
		this.b_paji_wgt = b_paji_wgt;
		this.c_paji_wgt = c_paji_wgt;
		this.pj5_wgt = pj5_wgt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setA_simbong_cnt(String a_simbong_cnt){
		this.a_simbong_cnt = a_simbong_cnt;
	}

	public void setB_simbong_cnt(String b_simbong_cnt){
		this.b_simbong_cnt = b_simbong_cnt;
	}

	public void setC_simbong_cnt(String c_simbong_cnt){
		this.c_simbong_cnt = c_simbong_cnt;
	}

	public void setA_paji_wgt(String a_paji_wgt){
		this.a_paji_wgt = a_paji_wgt;
	}

	public void setB_paji_wgt(String b_paji_wgt){
		this.b_paji_wgt = b_paji_wgt;
	}

	public void setC_paji_wgt(String c_paji_wgt){
		this.c_paji_wgt = c_paji_wgt;
	}

	public void setPj5_wgt(String pj5_wgt){
		this.pj5_wgt = pj5_wgt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getA_simbong_cnt(){
		return this.a_simbong_cnt;
	}

	public String getB_simbong_cnt(){
		return this.b_simbong_cnt;
	}

	public String getC_simbong_cnt(){
		return this.c_simbong_cnt;
	}

	public String getA_paji_wgt(){
		return this.a_paji_wgt;
	}

	public String getB_paji_wgt(){
		return this.b_paji_wgt;
	}

	public String getC_paji_wgt(){
		return this.c_paji_wgt;
	}

	public String getPj5_wgt(){
		return this.pj5_wgt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.a_simbong_cnt = Util.checkString(cstmt.getString(10));
		this.b_simbong_cnt = Util.checkString(cstmt.getString(11));
		this.c_simbong_cnt = Util.checkString(cstmt.getString(12));
		this.a_paji_wgt = Util.checkString(cstmt.getString(13));
		this.b_paji_wgt = Util.checkString(cstmt.getString(14));
		this.c_paji_wgt = Util.checkString(cstmt.getString(15));
		this.pj5_wgt = Util.checkString(cstmt.getString(16));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PRNPAP_3406_LDataSet ds = (MT_PRNPAP_3406_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getA_simbong_cnt()%>
<%= ds.getB_simbong_cnt()%>
<%= ds.getC_simbong_cnt()%>
<%= ds.getA_paji_wgt()%>
<%= ds.getB_paji_wgt()%>
<%= ds.getC_paji_wgt()%>
<%= ds.getPj5_wgt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 29 19:39:00 KST 2009 */