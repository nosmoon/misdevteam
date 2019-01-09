/***************************************************************************************************
* ���ϸ� : SP_CO_L_RDRCRTS_GRAD_APLC.java
* ��� :  ����-����������û ��ȸ
* �ۼ����� : 2004-05-17
* �ۼ��� : ����ǥ
***************************************************************************************************/
/***************************************************************************************************
* �������� : 
* ������ :   
* �������� : 
* ��� : 
***************************************************************************************************/


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * ����-����������û ��ȸ
 */

public class FC_FUNC_1160_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList mmdhonnotebal = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_1160_LDataSet(){}
	public FC_FUNC_1160_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_FUNC_1160_LMMDHONNOTEBALRecord rec = new FC_FUNC_1160_LMMDHONNOTEBALRecord();
			rec.basiyymm = Util.checkString(rset0.getString("basiyymm"));
			rec.occrcnt = Util.checkString(rset0.getString("occrcnt"));
			rec.occramt = Util.checkString(rset0.getString("occramt"));
			rec.extnccnt = Util.checkString(rset0.getString("extnccnt"));
			rec.extncamt = Util.checkString(rset0.getString("extncamt"));
			rec.bddbcnt = Util.checkString(rset0.getString("bddbcnt"));
			rec.bddbamt = Util.checkString(rset0.getString("bddbamt"));
			rec.balcnt = Util.checkString(rset0.getString("balcnt"));
			rec.balamt = Util.checkString(rset0.getString("balamt"));
			this.mmdhonnotebal.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_1160_LDataSet ds = (FC_FUNC_1160_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.mmdhonnotebal.size(); i++){
		FC_FUNC_1160_LMMDHONNOTEBALRecord mmdhonnotebalRec = (FC_FUNC_1160_LMMDHONNOTEBALRecord)ds.mmdhonnotebal.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMmdhonnotebal()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= mmdhonnotebalRec.basiyymm%>
<%= mmdhonnotebalRec.occrcnt%>
<%= mmdhonnotebalRec.occramt%>
<%= mmdhonnotebalRec.extnccnt%>
<%= mmdhonnotebalRec.extncamt%>
<%= mmdhonnotebalRec.bddbcnt%>
<%= mmdhonnotebalRec.bddbamt%>
<%= mmdhonnotebalRec.balcnt%>
<%= mmdhonnotebalRec.balamt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Feb 05 11:36:23 KST 2009 */