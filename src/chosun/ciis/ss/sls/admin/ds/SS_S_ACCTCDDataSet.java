/***************************************************************************************************
* 파일명 : SS_S_ACCTCDDataSet.java
* 기능 : 관리자-계정코드-상세를 위한 DataSet
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * 관리자-계정코드-상세를 위한 DataSet
 */


public class SS_S_ACCTCDDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String acctcd;
	public String acctnm;
	public String imptexpnclsf;
	public String leaf_inyn;
	public String empadvyn;
	public String remk;

	public SS_S_ACCTCDDataSet(){}
	public SS_S_ACCTCDDataSet(String errcode, String errmsg, String acctcd, String acctnm, String imptexpnclsf, String leaf_inyn, String empadvyn, String remk){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.acctcd = acctcd;
		this.acctnm = acctnm;
		this.imptexpnclsf = imptexpnclsf;
		this.leaf_inyn = leaf_inyn;
		this.empadvyn = empadvyn;
		this.remk = remk;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setAcctcd(String acctcd){
		this.acctcd = acctcd;
	}

	public void setAcctnm(String acctnm){
		this.acctnm = acctnm;
	}

	public void setImptexpnclsf(String imptexpnclsf){
		this.imptexpnclsf = imptexpnclsf;
	}

	public void setLeaf_inyn(String leaf_inyn){
		this.leaf_inyn = leaf_inyn;
	}

	public void setEmpadvyn(String empadvyn){
		this.empadvyn = empadvyn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getAcctcd(){
		return this.acctcd;
	}

	public String getAcctnm(){
		return this.acctnm;
	}

	public String getImptexpnclsf(){
		return this.imptexpnclsf;
	}

	public String getLeaf_inyn(){
		return this.leaf_inyn;
	}

	public String getEmpadvyn(){
		return this.empadvyn;
	}

	public String getRemk(){
		return this.remk;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.acctcd = Util.checkString(cstmt.getString(4));
		this.acctnm = Util.checkString(cstmt.getString(5));
		this.imptexpnclsf = Util.checkString(cstmt.getString(6));
		this.leaf_inyn = Util.checkString(cstmt.getString(7));
		this.empadvyn = Util.checkString(cstmt.getString(8));
		this.remk = Util.checkString(cstmt.getString(9));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_S_ACCTCDDataSet ds = (SS_S_ACCTCDDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getAcctcd()%>
<%= ds.getAcctnm()%>
<%= ds.getImptexpnclsf()%>
<%= ds.getLeaf_inyn()%>
<%= ds.getEmpadvyn()%>
<%= ds.getRemk()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jul 03 17:43:58 KST 2004 */