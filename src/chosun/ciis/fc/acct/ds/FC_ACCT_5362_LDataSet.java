/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_5362_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_5362_LDataSet(){}
	public FC_ACCT_5362_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			FC_ACCT_5362_LCURLISTRecord rec = new FC_ACCT_5362_LCURLISTRecord();
			rec.acct_cd = Util.checkString(rset0.getString("acct_cd"));
			rec.acacctynm = Util.checkString(rset0.getString("acacctynm"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.ycyscdnm = Util.checkString(rset0.getString("ycyscdnm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.dr_amt = Util.checkString(rset0.getString("dr_amt"));
			rec.use_dept_cd = Util.checkString(rset0.getString("use_dept_cd"));
			rec.usebuseonm = Util.checkString(rset0.getString("usebuseonm"));
			rec.rmks1 = Util.checkString(rset0.getString("rmks1"));
			rec.rmks2 = Util.checkString(rset0.getString("rmks2"));
			rec.clam_dept_cd = Util.checkString(rset0.getString("clam_dept_cd"));
			rec.cgbuseonm = Util.checkString(rset0.getString("cgbuseonm"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_5362_LDataSet ds = (FC_ACCT_5362_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_5362_LCURLISTRecord curlistRec = (FC_ACCT_5362_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.acct_cd%>
<%= curlistRec.acacctynm%>
<%= curlistRec.budg_cd%>
<%= curlistRec.ycyscdnm%>
<%= curlistRec.medi_cd%>
<%= curlistRec.dr_amt%>
<%= curlistRec.use_dept_cd%>
<%= curlistRec.usebuseonm%>
<%= curlistRec.rmks1%>
<%= curlistRec.rmks2%>
<%= curlistRec.clam_dept_cd%>
<%= curlistRec.cgbuseonm%>
<%= curlistRec.qunt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Mar 19 09:32:23 KST 2009 */