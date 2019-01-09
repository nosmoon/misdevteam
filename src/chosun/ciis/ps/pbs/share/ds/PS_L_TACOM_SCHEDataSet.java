/***************************************************************************************************
* ���ϸ� : PS_L_TACOM_SCHEDataSet.java
* ��� : ���Ǳ� ���� ����Ʈ
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
 * ���Ǳ� ���� ����Ʈ
 *
 */


public class PS_L_TACOM_SCHEDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public PS_L_TACOM_SCHEDataSet(){}
	public PS_L_TACOM_SCHEDataSet(String errcode, String errmsg, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTotalcnt(long totalcnt){
		this.totalcnt = totalcnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			PS_L_TACOM_SCHECURCOMMLISTRecord rec = new PS_L_TACOM_SCHECURCOMMLISTRecord();
			rec.seq = rset0.getInt("seq");
			rec.frdt = rset0.getTimestamp("frdt");
			rec.todt = rset0.getTimestamp("todt");
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.endyn = Util.checkString(rset0.getString("endyn"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(9);
	}

}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PS_L_TACOM_SCHEDataSet ds = (PS_L_TACOM_SCHEDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		PS_L_TACOM_SCHECURCOMMLISTRecord curcommlistRec = (PS_L_TACOM_SCHECURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getTotalcnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curcommlistRec.seq%>
<%= curcommlistRec.frdt%>
<%= curcommlistRec.todt%>
<%= curcommlistRec.remk%>
<%= curcommlistRec.endyn%>
<%= curcommlistRec.deptcd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Feb 23 19:09:06 KST 2004 */