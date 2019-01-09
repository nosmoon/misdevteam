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


package chosun.ciis.tn.dns.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.dns.dm.*;
import chosun.ciis.tn.dns.rec.*;

/**
 * 
 */


public class TN_DNS_1075_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String proofname;
	public byte[] proofdata;
   	public transient Blob blob;

	public TN_DNS_1075_ADataSet(){}
	public TN_DNS_1075_ADataSet(String errcode, String errmsg, String proofname, byte[] proofdata){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.proofname = proofname;
		this.proofdata = proofdata;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setProofname(String proofname){
		this.proofname = proofname;
	}

	public void setProofdata(byte[] proofdata){
		this.proofdata = proofdata;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getProofname(){
		return this.proofname;
	}

	public byte[] getProofdata(){
		return this.proofdata;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.proofname = Util.checkString(cstmt.getString(5));
//		this.add_file = Util.checkString(cstmt.getString(6));
       	this.blob = cstmt.getBlob(6);        	
       	this.proofdata = blob.getBytes(1, (int)blob.length());
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_LNK_1153_ADataSet ds = (TN_LNK_1153_ADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getExcl_pmnt_idx()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 27 11:24:38 KST 2016 */