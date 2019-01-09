/***************************************************************************************************
* ���ϸ� : PS_I_INFOEXG_ANSWERDataSet.java
* ��� : ���Ǳ� �������� �Խ���
* �ۼ����� : 2004-02-23
* �ۼ��� : ����ǥ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ps.pbs.share.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.share.dm.*;
import chosun.ciis.ps.pbs.share.rec.*;

/**
 * ���Ǳ� �������� �Խ���
 *
 */


public class PS_I_INFOEXG_ANSWERDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public long seq;

	public PS_I_INFOEXG_ANSWERDataSet(){}
	public PS_I_INFOEXG_ANSWERDataSet(String errcode, String errmsg, long seq){
		this.errcode = errcode;
		this.errmsg = errmsg;
        this.seq = seq;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

    public void setSeq(long seq){
        this.seq = seq;
    }

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

    public long getSeq(){
        return this.seq;
    }

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
        if(!"".equals(this.errcode)){			return;		}
		this.seq = cstmt.getLong(24);
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PS_I_INFOEXG_ANSWERDataSet ds = (PS_I_INFOEXG_ANSWERDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Feb 24 20:12:55 KST 2004 */