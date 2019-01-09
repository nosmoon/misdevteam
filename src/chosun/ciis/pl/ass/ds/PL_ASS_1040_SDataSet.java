/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.pl.ass.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.ass.dm.*;
import chosun.ciis.pl.ass.rec.*;

/**
 * 
 */


public class PL_ASS_1040_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String ser_no_basi;
	public String issu_clsf;
	public String ref_ser_no_1;
	public String ref_ser_no_2;
	public String basi_bgn_ser_no;
	public String basi_end_ser_no;
	public String prd;

	public PL_ASS_1040_SDataSet(){}
	public PL_ASS_1040_SDataSet(String errcode, String errmsg, String ser_no_basi, String issu_clsf, String ref_ser_no_1, String ref_ser_no_2, String basi_bgn_ser_no, String basi_end_ser_no, String prd){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.ser_no_basi = ser_no_basi;
		this.issu_clsf = issu_clsf;
		this.ref_ser_no_1 = ref_ser_no_1;
		this.ref_ser_no_2 = ref_ser_no_2;
		this.basi_bgn_ser_no = basi_bgn_ser_no;
		this.basi_end_ser_no = basi_end_ser_no;
		this.prd = prd;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSer_no_basi(String ser_no_basi){
		this.ser_no_basi = ser_no_basi;
	}

	public void setIssu_clsf(String issu_clsf){
		this.issu_clsf = issu_clsf;
	}

	public void setRef_ser_no_1(String ref_ser_no_1){
		this.ref_ser_no_1 = ref_ser_no_1;
	}

	public void setRef_ser_no_2(String ref_ser_no_2){
		this.ref_ser_no_2 = ref_ser_no_2;
	}

	public void setBasi_bgn_ser_no(String basi_bgn_ser_no){
		this.basi_bgn_ser_no = basi_bgn_ser_no;
	}

	public void setBasi_end_ser_no(String basi_end_ser_no){
		this.basi_end_ser_no = basi_end_ser_no;
	}

	public void setPrd(String prd){
		this.prd = prd;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSer_no_basi(){
		return this.ser_no_basi;
	}

	public String getIssu_clsf(){
		return this.issu_clsf;
	}

	public String getRef_ser_no_1(){
		return this.ref_ser_no_1;
	}

	public String getRef_ser_no_2(){
		return this.ref_ser_no_2;
	}

	public String getBasi_bgn_ser_no(){
		return this.basi_bgn_ser_no;
	}

	public String getBasi_end_ser_no(){
		return this.basi_end_ser_no;
	}

	public String getPrd(){
		return this.prd;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.ser_no_basi = Util.checkString(cstmt.getString(7));
		this.issu_clsf = Util.checkString(cstmt.getString(8));
		this.ref_ser_no_1 = Util.checkString(cstmt.getString(9));
		this.ref_ser_no_2 = Util.checkString(cstmt.getString(10));
		this.basi_bgn_ser_no = Util.checkString(cstmt.getString(11));
		this.basi_end_ser_no = Util.checkString(cstmt.getString(12));
		this.prd = Util.checkString(cstmt.getString(13));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_ASS_1040_SDataSet ds = (PL_ASS_1040_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSer_no_basi()%>
<%= ds.getIssu_clsf()%>
<%= ds.getRef_ser_no_1()%>
<%= ds.getRef_ser_no_2()%>
<%= ds.getBasi_bgn_ser_no()%>
<%= ds.getBasi_end_ser_no()%>
<%= ds.getPrd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 16 20:13:04 KST 2009 */