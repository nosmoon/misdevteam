/***************************************************************************************************
* 파일명 : CO_DECID_3000_DataSet.java
* 기능 : 공통-전자결재
* 작성일자 : 2009-03-12
* 작성자 : 양정녕
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.co.decid.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.decid.dm.*;
import chosun.ciis.co.decid.rec.*;

/**
 * 
 */


public class CO_DECID_3000_DataSet implements java.io.Serializable{
	public String errcode;
    public String errmsg;
    public String status;

	public CO_DECID_3000_DataSet(){}
	public CO_DECID_3000_DataSet(String errcode, String errmsg, String subseq){
        this.errcode = errcode;
        this.errmsg = errmsg;
        this.status = subseq;
    }

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}
	
	public void setStatus(String status){
        this.status = status;
    }

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}
	
	public String getStatus(){
        return status;
    }
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_DECID_2001_LDataSet ds = (CO_DECID_2001_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		CO_DECID_2001_LCURLISTRecord curlistRec = (CO_DECID_2001_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.add_file%>
<%= curlistRec.add_file_size%>
<%= curlistRec.add_file_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 17 13:34:41 KST 2009 */