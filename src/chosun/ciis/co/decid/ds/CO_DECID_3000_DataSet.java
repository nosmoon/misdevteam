/***************************************************************************************************
* ���ϸ� : CO_DECID_3000_DataSet.java
* ��� : ����-���ڰ���
* �ۼ����� : 2009-03-12
* �ۼ��� : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
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
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	CO_DECID_2001_LDataSet ds = (CO_DECID_2001_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		CO_DECID_2001_LCURLISTRecord curlistRec = (CO_DECID_2001_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.add_file%>
<%= curlistRec.add_file_size%>
<%= curlistRec.add_file_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Mar 17 13:34:41 KST 2009 */