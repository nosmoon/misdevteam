/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 
 */


public class SS_SLS_BRSUP_1799_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList allstr2 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String headerstr;
	public String tailstr;
	public String tail_filler;

	public SS_SLS_BRSUP_1799_LDataSet(){}
	public SS_SLS_BRSUP_1799_LDataSet(String errcode, String errmsg, String headerstr, String tailstr, String tail_filler){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.headerstr = headerstr;
		this.tailstr = tailstr;
		this.tail_filler = tail_filler;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setHeaderstr(String headerstr){
		this.headerstr = headerstr;
	}

	public void setTailstr(String tailstr){
		this.tailstr = tailstr;
	}

	public void setTail_filler(String tail_filler){
		this.tail_filler = tail_filler;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getHeaderstr(){
		return this.headerstr;
	}

	public String getTailstr(){
		return this.tailstr;
	}

	public String getTail_filler(){
		return this.tail_filler;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.headerstr = cstmt.getString(3);
		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			SS_SLS_BRSUP_1799_LALLSTR2Record rec = new SS_SLS_BRSUP_1799_LALLSTR2Record();
			rec.datastr = rset0.getString("datastr");
			rec.filler = rset0.getString("filler");
			rec.recfilenm = rset0.getString("recfilenm");
			this.allstr2.add(rec);
		}
		this.tailstr = cstmt.getString(5);
		this.tail_filler = cstmt.getString(6);
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_SLS_BRSUP_1799_LDataSet ds = (SS_SLS_BRSUP_1799_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.allstr2.size(); i++){
		SS_SLS_BRSUP_1799_LALLSTR2Record allstr2Rec = (SS_SLS_BRSUP_1799_LALLSTR2Record)ds.allstr2.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getHeaderstr()%>
<%= ds.getAllstr2()%>
<%= ds.getTailstr()%>
<%= ds.getTail_filler()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= allstr2Rec.datastr%>
<%= allstr2Rec.filler%>
<%= allstr2Rec.recfilenm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Sep 28 18:36:48 KST 2016 */