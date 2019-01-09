/***************************************************************************************************
* ���ϸ� : SS_L_ANNCSLSDataSet.java
* ��� : �Ǹű�����-�ǽð������� ���� DataSet
* �ۼ����� : 2004-04-24
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.share.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * �Ǹű�����-�ǽð������� ���� DataSet
 */


public class SS_L_ANNCSLSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList mainannclist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_ANNCSLSDataSet(){}
	public SS_L_ANNCSLSDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SS_L_ANNCSLSMAINANNCLISTRecord rec = new SS_L_ANNCSLSMAINANNCLISTRecord();
			rec.seq = rset0.getInt("seq");
			rec.makepersid = Util.checkString(rset0.getString("makepersid"));
			rec.makepersnm = Util.checkString(rset0.getString("makepersnm"));
			rec.annctitl = Util.checkString(rset0.getString("annctitl"));
			rec.annccont = Util.checkString(rset0.getString("annccont"));
			this.mainannclist.add(rec);
		}
	}


}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_L_ANNCSLSDataSet ds = (SS_L_ANNCSLSDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.mainannclist.size(); i++){
		SS_L_ANNCSLSMAINANNCLISTRecord mainannclistRec = (SS_L_ANNCSLSMAINANNCLISTRecord)ds.mainannclist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMainannclist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= mainannclistRec.seq%>
<%= mainannclistRec.makepersid%>
<%= mainannclistRec.makepersnm%>
<%= mainannclistRec.annctitl%>
<%= mainannclistRec.annccont%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Jul 10 15:08:33 KST 2004 */