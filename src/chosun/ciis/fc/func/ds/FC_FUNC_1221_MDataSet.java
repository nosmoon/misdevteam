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


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_1221_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_acct_cd_3_010;
	public String xx_acct_cd_5_010;
	public String xx_note_clsf_cd_010;
	public String xx_note_clsf_cd_020;
	public String xx_note_clsf_cd_030;
	public String xx_slip_clsf_cd_010;

	public FC_FUNC_1221_MDataSet(){}
	public FC_FUNC_1221_MDataSet(String errcode, String errmsg, String xx_acct_cd_3_010, String xx_acct_cd_5_010, String xx_note_clsf_cd_010, String xx_note_clsf_cd_020, String xx_note_clsf_cd_030, String xx_slip_clsf_cd_010){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_acct_cd_3_010 = xx_acct_cd_3_010;
		this.xx_acct_cd_5_010 = xx_acct_cd_5_010;
		this.xx_note_clsf_cd_010 = xx_note_clsf_cd_010;
		this.xx_note_clsf_cd_020 = xx_note_clsf_cd_020;
		this.xx_note_clsf_cd_030 = xx_note_clsf_cd_030;
		this.xx_slip_clsf_cd_010 = xx_slip_clsf_cd_010;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_acct_cd_3_010(String xx_acct_cd_3_010){
		this.xx_acct_cd_3_010 = xx_acct_cd_3_010;
	}

	public void setXx_acct_cd_5_010(String xx_acct_cd_5_010){
		this.xx_acct_cd_5_010 = xx_acct_cd_5_010;
	}

	public void setXx_note_clsf_cd_010(String xx_note_clsf_cd_010){
		this.xx_note_clsf_cd_010 = xx_note_clsf_cd_010;
	}

	public void setXx_note_clsf_cd_020(String xx_note_clsf_cd_020){
		this.xx_note_clsf_cd_020 = xx_note_clsf_cd_020;
	}

	public void setXx_note_clsf_cd_030(String xx_note_clsf_cd_030){
		this.xx_note_clsf_cd_030 = xx_note_clsf_cd_030;
	}

	public void setXx_slip_clsf_cd_010(String xx_slip_clsf_cd_010){
		this.xx_slip_clsf_cd_010 = xx_slip_clsf_cd_010;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_acct_cd_3_010(){
		return this.xx_acct_cd_3_010;
	}

	public String getXx_acct_cd_5_010(){
		return this.xx_acct_cd_5_010;
	}

	public String getXx_note_clsf_cd_010(){
		return this.xx_note_clsf_cd_010;
	}

	public String getXx_note_clsf_cd_020(){
		return this.xx_note_clsf_cd_020;
	}

	public String getXx_note_clsf_cd_030(){
		return this.xx_note_clsf_cd_030;
	}

	public String getXx_slip_clsf_cd_010(){
		return this.xx_slip_clsf_cd_010;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_acct_cd_3_010 = Util.checkString(cstmt.getString(5));
		this.xx_acct_cd_5_010 = Util.checkString(cstmt.getString(6));
		this.xx_note_clsf_cd_010 = Util.checkString(cstmt.getString(7));
		this.xx_note_clsf_cd_020 = Util.checkString(cstmt.getString(8));
		this.xx_note_clsf_cd_030 = Util.checkString(cstmt.getString(9));
		this.xx_slip_clsf_cd_010 = Util.checkString(cstmt.getString(10));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_1221_MDataSet ds = (FC_FUNC_1221_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_acct_cd_3_010()%>
<%= ds.getXx_acct_cd_5_010()%>
<%= ds.getXx_note_clsf_cd_010()%>
<%= ds.getXx_note_clsf_cd_020()%>
<%= ds.getXx_note_clsf_cd_030()%>
<%= ds.getXx_slip_clsf_cd_010()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 04 16:14:00 KST 2012 */