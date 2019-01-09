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


package chosun.ciis.hd.edu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.edu.dm.*;
import chosun.ciis.hd.edu.rec.*;

/**
 * 
 */


public class HD_EDU_1104_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_user_id;
	public String xx_job_id;
	public String xx_prot_id;
	public String xx_doc_id_head;

	public HD_EDU_1104_MDataSet(){}
	public HD_EDU_1104_MDataSet(String errcode, String errmsg, String xx_user_id, String xx_job_id, String xx_prot_id, String xx_doc_id_head){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_user_id = xx_user_id;
		this.xx_job_id = xx_job_id;
		this.xx_prot_id = xx_prot_id;
		this.xx_doc_id_head = xx_doc_id_head;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_user_id(String xx_user_id){
		this.xx_user_id = xx_user_id;
	}

	public void setXx_job_id(String xx_job_id){
		this.xx_job_id = xx_job_id;
	}

	public void setXx_prot_id(String xx_prot_id){
		this.xx_prot_id = xx_prot_id;
	}

	public void setXx_doc_id_head(String xx_doc_id_head){
		this.xx_doc_id_head = xx_doc_id_head;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_user_id(){
		return this.xx_user_id;
	}

	public String getXx_job_id(){
		return this.xx_job_id;
	}

	public String getXx_prot_id(){
		return this.xx_prot_id;
	}

	public String getXx_doc_id_head(){
		return this.xx_doc_id_head;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_user_id = Util.checkString(cstmt.getString(5));
		this.xx_job_id = Util.checkString(cstmt.getString(6));
		this.xx_prot_id = Util.checkString(cstmt.getString(7));
		this.xx_doc_id_head = Util.checkString(cstmt.getString(8));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EDU_1104_MDataSet ds = (HD_EDU_1104_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_user_id()%>
<%= ds.getXx_job_id()%>
<%= ds.getXx_prot_id()%>
<%= ds.getXx_doc_id_head()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 30 16:04:49 KST 2012 */