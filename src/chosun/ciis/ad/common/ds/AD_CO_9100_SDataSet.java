/***************************************************************************************************
* 파일명 : .java
* 기능 : 거래처인물정보 공통
* 작성일자 : 2010.07.13
* 작성자 : KBS
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.common.ds;

import java.sql.CallableStatement;
import java.sql.SQLException;

import somo.framework.util.Util;

/**
 * 
 */


public class AD_CO_9100_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable
{
	public String errcode;
	public String errmsg;
	public String medi_clsf;
	public String srch_dlco_no;
	public String srch_dlco_nm;
	public String srch_cust_seq;
	public String srch_cust_name;
	public String chk_cnt;

	public AD_CO_9100_SDataSet(){}
	public AD_CO_9100_SDataSet(String errcode, String errmsg, String medi_clsf, String srch_dlco_no, String srch_dlco_nm, String srch_cust_seq, String srch_cust_name, String chk_cnt)
	{
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.medi_clsf = medi_clsf;
		this.srch_dlco_no = srch_dlco_no;
		this.srch_dlco_nm = srch_dlco_nm;
		this.srch_cust_seq = srch_cust_seq;
		this.srch_cust_name = srch_cust_name;
		this.chk_cnt = chk_cnt;
	}

	public void setErrcode(String errcode)
	{
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg)
	{
		this.errmsg = errmsg;
	}

	public void setMediClsf(String medi_clsf)
	{
		this.medi_clsf = medi_clsf;
	}

	public void setSrchDlcoNo(String srch_dlco_no)
	{
		this.srch_dlco_no = srch_dlco_no;
	}
	
	public void setSrchDlcoNm(String srch_dlco_nm)
	{
		this.srch_dlco_nm = srch_dlco_nm;
	}

	public void setSrchCustSeq(String srch_cust_seq)
	{
		this.srch_cust_seq = srch_cust_seq;
	}
	
	public void setSrchCustName(String srch_cust_name)
	{
		this.srch_cust_name = srch_cust_name;
	}

	public void setChkCnt(String chk_cnt)
	{
		this.chk_cnt = chk_cnt;
	}

	public String getErrcode()
	{
		return this.errcode;
	}

	public String getErrmsg()
	{
		return this.errmsg;
	}

	public String getMediClsf()
	{
		return this.medi_clsf;
	}

	public String getSrchDlcoNo()
	{
		return this.srch_dlco_no;
	}
	
	public String getSrchDlcoNm()
	{
		return this.srch_dlco_nm;
	}

	public String getSrchCustSeq()
	{
		return this.srch_cust_seq;
	}
	
	public String getSrchCustName()
	{
		return this.srch_cust_name;
	}

	public String getChkCnt()
	{
		return this.chk_cnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException
	{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode))
		{
			return;
		}

		this.srch_dlco_no 	= Util.checkString(cstmt.getString(6));
		this.srch_dlco_nm 	= Util.checkString(cstmt.getString(7));
		this.srch_cust_seq 	= Util.checkString(cstmt.getString(8));
		this.srch_cust_name	= Util.checkString(cstmt.getString(9));
		this.chk_cnt 		= Util.checkString(cstmt.getString(10));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_CO_9008_SDataSet ds = (AD_CO_9008_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDlco_clsf()%>
<%= ds.getSrch_nm()%>
<%= ds.getSrch_cd()%>
<%= ds.getChk_cnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 25 17:25:04 KST 2009 */